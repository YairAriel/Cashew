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

    public Income(String transID, double transAmount, Calendar transDate, String transDescription, String transPaymentMethod, String incomeSource, String transIconPath) {

        super(transID, transAmount, transDate, transDescription, transPaymentMethod, transIconPath);
        setIncomeSource(incomeSource);
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    @Override
    public String toString() {
        return super.toString() + ", incomeSource=" + getIncomeSource() + '}';
    }

}
