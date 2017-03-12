/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shlomo Pfeuffer
 */
public abstract class BudgetParser {

    private static Budget budget = BudgetParser.SerializationHandler.readBudgetFromDisk();

    public static Budget getBudget() {
        return budget;
    }

    public static void setBudget(Budget budget) {
        BudgetParser.budget = budget;
    }

    public static void budgetChangesRutine() {

        MainWindow.getProgram().setLabelOfBudget(BudgetParser.getBudget().getBudgetSum());
        MainWindow.getProgram().getSpinnerBudgetAmount().setValue(BudgetParser.getBudget().getBudgetSum());
        MainWindow.getProgram().getCheckBoxEnableEdit().setSelected(BudgetParser.getBudget().isBudgetEditable());
        MainWindow.getProgram().getCheckBoxAlertBeforeException().setSelected(BudgetParser.getBudget().isDeviationMessage());
        MainWindow.getProgram().getCheckBoxAlertBeforeX().setSelected(BudgetParser.getBudget().isDeviationWarning());
        MainWindow.getProgram().getSpinnerAlertBefore().setValue(BudgetParser.getBudget().getDeviationWarningSum());
        MainWindow.getProgram().setLabelUsedBudget(TransactionParser.getThisMonthExpensesAmount());
        MainWindow.getProgram().setProgressBarBudget(BudgetParser.getExpenseBudgetRatio());
        MainWindow.getProgram().getProgressBarBudget().revalidate();
        MainWindow.getProgram().getProgressBarBudget().repaint();
        if (!MainWindow.getProgram().getCheckBoxEnableEdit().isSelected()) {
            setAllBudgetComponentsDisabled();
        }
    }

    public static void setAllBudgetComponentsDisabled() {

        MainWindow.getProgram().getSpinnerBudgetAmount().setEnabled(false);
        MainWindow.getProgram().getSpinnerAlertBefore().setEnabled(false);
        MainWindow.getProgram().getCheckBoxAlertBeforeException().setEnabled(false);
        MainWindow.getProgram().getCheckBoxAlertBeforeX().setEnabled(false);
        MainWindow.getProgram().getCheckBoxEnableEdit().setEnabled(false);
        MainWindow.getProgram().getButtonDefineBudget().setEnabled(false);
    }

    public static double getExpenseBudgetRatio() {
        return TransactionParser.getThisMonthExpensesAmount() * 100 / BudgetParser.getBudget().getBudgetSum();
    }

    public static class SerializationHandler {

        public static void createFolderBudget() {
            File budget = new File("local/budget/");
            if (!budget.exists()) {
                budget.mkdirs();
            }
        }

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
