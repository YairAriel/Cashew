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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yair Ariel
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

        MainWindow.getProgram().getLabelOfBudget().setText(String.format("%.2f", BudgetParser.getBudget().getBudgetSum()));
        MainWindow.getProgram().getSpinnerBudgetAmount().setValue(BudgetParser.getBudget().getBudgetSum());
        MainWindow.getProgram().getCheckBoxEnableEdit().setSelected(BudgetParser.getBudget().isBudgetEditable());
        MainWindow.getProgram().getCheckBoxAlertBeforeException().setSelected(BudgetParser.getBudget().isDeviationMessage());
        MainWindow.getProgram().getCheckBoxAlertBeforeX().setSelected(BudgetParser.getBudget().isDeviationWarning());
        MainWindow.getProgram().getSpinnerAlertBefore().setValue(BudgetParser.getBudget().getDeviationWarningSum());
        MainWindow.getProgram().setLabelUsedBudget(TransactionParser.getThisMonthExpensesAmount());
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
