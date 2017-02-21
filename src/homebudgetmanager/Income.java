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
public class Income extends Transaction {
    
    private String incomeSource;

    public Income() {
        
    }
    
    public Income(int transID, double transAmount, Calendar transDate, String transDescription,
            String expenseCategory, String transPaymentMethod, String incomeSource) {
        
        super(transID, transAmount, transDate, transDescription, transPaymentMethod);
        setIncomeSource(incomeSource);
    }
    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }
       
    @Override 
    public String toString(){
        return super.toString() + ", incomeSource=" + getIncomeSource() + '}';
    }
}
