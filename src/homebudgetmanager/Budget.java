/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
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
    private int month;

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
        setMonth(Calendar.getInstance().get(Calendar.MONTH));
        Budget.setBudget(this);
        Budget.budgetChangesRutine();
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
        MainWindow.getProgram().getCheckBoxAlertBeforeX().setSelected(Budget.getBudget().isDeviationWarning());
        MainWindow.getProgram().getSpinnerAlertBefore().setValue(Budget.getBudget().getDeviationWarningSum());
        MainWindow.getProgram().setLabelUsedBudget(TransactionParser.getThisMonthExpensesAmount());
        MainWindow.setProgressBarBudget(Budget.getExpenseBudgetRatio());
        MainWindow.getProgram().getProgressBarBudget().revalidate();
        MainWindow.getProgram().getProgressBarBudget().repaint();
        if (!MainWindow.getProgram().getCheckBoxEnableEdit().isSelected()) {
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

    public static double getExpenseBudgetRatio() {
        return TransactionParser.getThisMonthExpensesAmount() * 100 / Budget.getBudget().getBudgetSum();
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
                Budget budget = (Budget) objectInputStream.readObject();
                return budget.getMonth() == Calendar.getInstance().get(Calendar.MONTH) ? budget : new Budget();
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
