/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.awt.Image;
import java.util.Calendar;
import javax.swing.ImageIcon;

/**
 *
 * @author Yair Ariel
 */
public class Transaction {

    private static int transactionsCount = 0;

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
    }

    public static int getTransactionsCount() {
        return Transaction.transactionsCount;
    }

    private static void incTransactionsCount() {
        Transaction.transactionsCount += 1;
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

}
