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
public class Expense extends Transaction{
    
    private String expenseCategory;
    
    public Expense(){
        
    }
    
    public Expense(int transID, double transAmount, Calendar transDate, String transDescription,
            String expenseCategory, String transPaymentMethod){
        
        super(transID, transAmount, transDate, transDescription, transPaymentMethod);
        setExpenseCategory(expenseCategory);
    }
    
    public String getExpenseCategory(){
        return expenseCategory;
    }
    
    public void setExpenseCategory(String expenseCategory){
        this.expenseCategory = expenseCategory;
    }
    
    @Override 
    public String toString(){
        return super.toString() + ",expenseCategory=" + getExpenseCategory() + '}';
    }
}
