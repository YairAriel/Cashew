/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.util.Calendar;

/**
 *
 * @author Yair Ariel
 */
public class Transaction {

    private int transID;
    private double transAmount;
    private Calendar transDate;
    private String transDescription;
    private String transPaymentMethod;
    
    public Transaction(){
        
    }
    
    public Transaction(int transID, double transAmount, Calendar transDate, String transDescription, String transPaymentMethod){
        setTransID(transID);
        setTransAmount(transAmount);
        setTransDate(transDate);
        setTransDescription(transDescription);
        setTransPaymentMethod(transPaymentMethod);
    }
    
    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
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
    
    @Override
    public String toString() {
        return "Transaction{" + "transID=" + getTransID() + ", transAmount=" + getTransAmount() +
                ", transDate=" + getTransDate() + ", transDescription=" + getTransDescription() +
                ", transPaymentMethod=" + getTransPaymentMethod();
    }
    
    
}
