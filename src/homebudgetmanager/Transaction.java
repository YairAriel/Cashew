/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Yair Ariel
 */
public abstract class Transaction implements Serializable {

    private static Integer transactionsCount = Transaction.SerializationHandler.readTransactionsFromDisk();

    private final int SIZE = 64;
    private String transID;
    private double transAmount;
    private Calendar transDate;
    private String transDescription;
    private String transPaymentMethod;
    private ImageIcon transIcon;

    public Transaction() {

    }

    public Transaction(String transID, double transAmount, Calendar transDate, String transDescription, String transPaymentMethod, String iconPath) {
        setTransID((Transaction.getTransactionsCount() + 1) + transID);
        setTransAmount(transAmount);
        setTransDate(transDate);
        setTransDescription(transDescription);
        setTransPaymentMethod(transPaymentMethod);
        setTransIcon(iconPath);
        Transaction.incTransactionsCount();

        //System.out.println(this.getTransID());
    }

    public static Integer getTransactionsCount() {
        return Transaction.transactionsCount;
    }

    private static void incTransactionsCount() {
        Transaction.transactionsCount += 1;
        try {
            Transaction.SerializationHandler.writeTransactionToDisk();
        } catch (IOException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    public double getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
    }

    public Calendar getTransDate() {
        return transDate;
    }

    public void setTransDate(Calendar transDate) {
        this.transDate = transDate;
    }

    public String getTransDescription() {
        return transDescription;
    }

    public void setTransDescription(String transDescription) {
        this.transDescription = transDescription;
    }

    public String getTransPaymentMethod() {
        return transPaymentMethod;
    }

    public void setTransPaymentMethod(String transPaymentMethod) {
        this.transPaymentMethod = transPaymentMethod;
    }

    public ImageIcon getTransIcon() {
        return transIcon;
    }

    public void setTransIcon(ImageIcon transIcon) throws Exception {

        if ((transIcon.getIconHeight() != SIZE) || (transIcon.getIconWidth() != SIZE)) {
            throw new Exception("Bad icon size input");//WIP
        }
        this.transIcon = transIcon;
    }

    public void setTransIcon(String iconPath) {
        this.transIcon = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath)).getImage().getScaledInstance(SIZE, SIZE, Image.SCALE_SMOOTH));
    }

    @Override
    public String toString() {
        return "Transaction{" + "transID=" + getTransID() + ", transAmount=" + getTransAmount()
                + ", transDate=" + getTransDate() + ", transDescription=" + getTransDescription()
                + ", transPaymentMethod=" + getTransPaymentMethod();
    }

    private static class SerializationHandler {

        private static final String PATH = "local/transactions/transactionsCount.bin";

        public static void writeTransactionToDisk() throws IOException {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(Transaction.SerializationHandler.PATH));
            objectOutputStream.writeObject(Transaction.getTransactionsCount());

        }

        public static Integer readTransactionsFromDisk() {
            ObjectInputStream objectInputStream = null;
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(Transaction.SerializationHandler.PATH));
                return (Integer) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                if (ex instanceof IOException) {
                    System.out.println("File " + Transaction.SerializationHandler.PATH + " does not exist yet:");
                } else {
                    Logger.getLogger(TransactionParser.class.getName()).log(Level.SEVERE, null, ex);
                }
            } finally {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException ex) {
                        Logger.getLogger(TransactionParser.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            return 0;
        }

    }

}
