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
public class Expense extends Transaction {

    private String expenseCategory;

    public Expense() {

    }

    public Expense(String transID, double transAmount, Calendar transDate, String transDescription,
            String expenseCategory, String transPaymentMethod, String transIconPath) {

        super(transID, transAmount, transDate, transDescription, transPaymentMethod, transIconPath);
        setExpenseCategory(expenseCategory);
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    @Override
    public String toString() {
        return super.toString() + ",expenseCategory=" + getExpenseCategory() + '}';
    }

}
