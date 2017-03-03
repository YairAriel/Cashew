/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import static homebudgetmanager.TransactionParser.SerializationHandler.readTransactionFromDisk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    private static Budget budget = Budget.SerializationHandler.readBudgetFromDisk();

    public Budget() {

    }

    public Budget(double budgetSum, boolean budgetEditable,
            boolean deviationMessage, boolean deviationWarning, double deviationWarningSum) {

        setBudgetSum(budgetSum);
        setBudgetEditable(budgetEditable);
        setDeviationMessage(deviationMessage);
        setDeviationWarning(deviationWarning);
        setDeviationWarningSum(deviationWarningSum);
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

    public static Budget getBudget() {
        return budget;
    }

    public static void setBudget(Budget budget) {
        Budget.budget = budget;
    }

    @Override
    public String toString() {
        return "Budget{budgetSum=" + getBudgetSum() + ", budgetEditable=" + isBudgetEditable()
                + ", deviationMessage=" + isDeviationMessage() + ", deviationWarning=" + isDeviationWarning() + ", deviationWarningSum="
                + getDeviationWarningSum() + '}';
    }

    public static void budgetChangesRutine() {

        MainWindow.program.getLabelOfBudget().setText(String.format("%.2f", Budget.getBudget().getBudgetSum()));
        MainWindow.program.getSpinnerBudgetAmount().setValue(Budget.getBudget().getBudgetSum());
        MainWindow.program.getCheckBoxEnableEdit().setSelected(Budget.getBudget().isBudgetEditable());
        MainWindow.program.getCheckBoxAlertBeforeException().setSelected(Budget.getBudget().isDeviationMessage());
        MainWindow.program.getCheckBoxAlertBeforeX().setSelected(Budget.getBudget().isDeviationWarning());
        MainWindow.program.getSpinnerAlertBefore().setValue(Budget.getBudget().getDeviationWarningSum());
        MainWindow.program.setLabelUsedBudget(TransactionParser.getThisMonthExpensesAmount());
        if (!MainWindow.program.getCheckBoxEnableEdit().isSelected()) {
            setAllBudgetComponentsDisabled();
        }
    }

    public static void setAllBudgetComponentsDisabled() {

        MainWindow.program.getSpinnerBudgetAmount().setEnabled(false);
        MainWindow.program.getSpinnerAlertBefore().setEnabled(false);
        MainWindow.program.getCheckBoxAlertBeforeException().setEnabled(false);
        MainWindow.program.getCheckBoxAlertBeforeX().setEnabled(false);
        MainWindow.program.getCheckBoxEnableEdit().setEnabled(false);
        MainWindow.program.getButtonDefineBudget().setEnabled(false);
    }

    public static class SerializationHandler {

        public static void writeBudgetToDisk(Budget budget) throws IOException {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("local/budget/budget.bin"));
            objectOutputStream.writeObject(budget);
        }

        public static Budget readBudgetFromDisk() {

            FileInputStream fileInputStream = null;
            try {
                ObjectInputStream objectInputStream;
                fileInputStream = new FileInputStream("local/budget/budget.bin");
                objectInputStream = new ObjectInputStream(fileInputStream);
                return (Budget) objectInputStream.readObject();
            } catch (IOException ex) {
                return new Budget();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Budget.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (IOException ex) {
                    System.out.println("New Budget");
                }
            }
            return null;
        }

    }
}
