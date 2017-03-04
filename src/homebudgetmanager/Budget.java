/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Yair Ariel
 */
public class Budget implements Serializable {

    private double budgetSum;
    private boolean budgetEditable = true;
    private boolean deviationMessage = true;
    private boolean deviationWarning = true;
    private double deviationWarningSum;
    private int month;

    public Budget() {

    }

    public Budget(double budgetSum, boolean budgetEditable,
            boolean deviationMessage, boolean deviationWarning, double deviationWarningSum) {

        setBudgetSum(budgetSum);
        setBudgetEditable(budgetEditable);
        setDeviationMessage(deviationMessage);
        setDeviationWarning(deviationWarning);
        setDeviationWarningSum(deviationWarningSum);
        setMonth(Calendar.getInstance().get(Calendar.MONTH));
        BudgetParser.setBudget(this);
        BudgetParser.budgetChangesRutine();
    }

    public double getBudgetSum() {
        return budgetSum;
    }

    public void setBudgetSum(double budgetSum) {
        this.budgetSum = budgetSum;
    }

    public boolean isBudgetEditable() {
        return budgetEditable;
    }

    public void setBudgetEditable(boolean budgetEditable) {
        this.budgetEditable = budgetEditable;
    }

    public boolean isDeviationMessage() {
        return deviationMessage;
    }

    public void setDeviationMessage(boolean deviationMessage) {
        this.deviationMessage = deviationMessage;
    }

    public boolean isDeviationWarning() {
        return deviationWarning;
    }

    public void setDeviationWarning(boolean deviationWarning) {
        this.deviationWarning = deviationWarning;
    }

    public double getDeviationWarningSum() {
        return deviationWarningSum;
    }

    public void setDeviationWarningSum(double deviationWarningSum) {
        this.deviationWarningSum = deviationWarningSum;
    }

    public int getMonth() {
        return month;
    }

    private void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Budget{budgetSum=" + getBudgetSum() + ", budgetEditable=" + isBudgetEditable()
                + ", deviationMessage=" + isDeviationMessage() + ", deviationWarning=" + isDeviationWarning() + ", deviationWarningSum="
                + getDeviationWarningSum() + '}';
    }

}
