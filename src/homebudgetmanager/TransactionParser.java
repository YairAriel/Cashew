/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shlomo Pfeuffer
 */
public abstract class TransactionParser {

    public static final String[] EXPENSE_ICON_ARR = {"",
        "measuring-tape.png",
        "shirt.png",
        "popcorn.png",
        "shield.png",
        "medical.png",
        "nature.png",
        "invoice.png",
        "gas-station.png",
        "shoe.png",
        "sea.png",
        "sun-umbrella.png",
        "dog.png",
        "library.png",
        "money.png",
        "light-bulb.png",
        "transport.png",
        "gym.png",
        "fruit.png",
        "drink.png",
        "money-1.png",
        "food.png",
        "construction.png",
        "gift.png",
        "smoking.png",
        "banking.png",
        "car.png",
        "house.png",
        "train.png",
        "wrench.png",
        "technology.png",
        "draw.png"
    };

    public static final String[] INCOME_ICON_ARR = {
        "",
        "security.png",
        "trophy.png",
        "coins.png",
        "gift1.png",
        "television.png",
        "wallet.png",
        "real-estate.png",
        "contract.png"
    };

    public static final List<Transaction> TRANSACTIONS = TransactionParser.SerializationHandler.readTransactionsFromDisk();

    //Methods
    public static void sortTransactionsByDate() {
        TransactionParser.TRANSACTIONS.sort(new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getTransDate().compareTo(o2.getTransDate());
            }

        });
    }

    public static int indexOfTransactionById(String transId) {
        for (int i = 0; i < TransactionParser.TRANSACTIONS.size(); i++) {
            if (TransactionParser.TRANSACTIONS.get(i).getTransID().equals(transId)) {
                return i;
            }
        }
        return -1;
    }

    public static void addTransactionRoutine(final Transaction transaction) {
        TransactionParser.TRANSACTIONS.add(0, transaction);
        try {
            TransactionParser.SerializationHandler.writeTransactionToDisk();
        } catch (IOException ex) {
            Logger.getLogger(TransactionParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        TransactionParser.transactionChangesRoutine();
        BudgetParser.budgetChangesRutine();
    }

    public static void removeTransactionRoutine(final String transId) {

        TransactionParser.TRANSACTIONS.remove(TransactionParser.indexOfTransactionById(transId));
        try {
            TransactionParser.SerializationHandler.writeTransactionToDisk();
        } catch (IOException ex) {
            Logger.getLogger(TransactionParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        TransactionParser.transactionChangesRoutine();
        BudgetParser.budgetChangesRutine();
    }

    public static void transactionChangesRoutine() {
        TransactionParser.sortTransactionsByDate();
        TransactionParser.sensitiveFillTransactionsPanel();
        TransactionParser.sesitiveFillTransactionsAmount();
    }

    public static void sensitiveFillTransactionsPanel() {
        if (MainWindow.getProgram() == null) {
            return;
        }
        switch (MainWindow.getProgram().getComboBoxTransactionsData().getSelectedIndex()) {
            case 1:
                TransactionParser.fillIncomesPanel();
                break;
            case 2:
                TransactionParser.fillExpensesPanel();
                break;
            default:
                TransactionParser.fillTransactionsPanel();
                break;
        }
    }

    public static void sesitiveFillTransactionsAmount() {
        switch (MainWindow.getProgram().getComboBoxDatesRange().getSelectedIndex()) {
            case 1:
                TransactionParser.fillThisMonthTransactionsAmount();
                break;
            case 2:
                TransactionParser.fillThisYearTransactionsAmount();
                break;
            default:
                TransactionParser.fillTodaysTransactionsAmount();
                break;
        }
    }

    public static void fillTodaysTransactionsAmount() {
        MainWindow.getProgram().setLabelIncomeAmount(TransactionParser.getTodaysIncomesAmount());
        MainWindow.getProgram().setLabelExpenseAmount(TransactionParser.getTodaysExpensesAmount());
        MainWindow.getProgram().setLabelTransactionSum(TransactionParser.getTodaysIncomesAmount() - TransactionParser.getTodaysExpensesAmount());
        MainWindow.getProgram().updateGeneralViewPanel();
    }

    public static void fillThisMonthTransactionsAmount() {
        MainWindow.getProgram().setLabelIncomeAmount(TransactionParser.getThisMonthIncomesAmount());
        MainWindow.getProgram().setLabelExpenseAmount(TransactionParser.getThisMonthExpensesAmount());
        MainWindow.getProgram().setLabelTransactionSum(TransactionParser.getThisMonthIncomesAmount() - TransactionParser.getThisMonthExpensesAmount());
        MainWindow.getProgram().updateGeneralViewPanel();
    }

    public static void fillThisYearTransactionsAmount() {
        MainWindow.getProgram().setLabelIncomeAmount(TransactionParser.getThisYearIncomesAmount());
        MainWindow.getProgram().setLabelExpenseAmount(TransactionParser.getThisYearExpensesAmount());
        MainWindow.getProgram().setLabelTransactionSum(TransactionParser.getThisYearIncomesAmount() - TransactionParser.getThisYearExpensesAmount());
        MainWindow.getProgram().updateGeneralViewPanel();
    }

    public static void fillTransactionsPanel() {
        MainWindow.getProgram().getPanelTransactions().removeAll();
        MainWindow.getProgram().getPanelTransactions().setLayout(new GridLayout(TransactionParser.TRANSACTIONS.size(), 1, 0, 12));
        for (Transaction i : TransactionParser.TRANSACTIONS) {
            if (TransactionParser.TransactionDate.isInUserSetRange(i)) {
                MainWindow.getProgram().getPanelTransactions().add(new TransactionPanel(i));
            }
        }
        MainWindow.getProgram().getPanelTransactions().revalidate();
        MainWindow.getProgram().getPanelTransactions().repaint();
    }

    public static void fillIncomesPanel() {
        final List<Income> incomes = TransactionParser.getIncomesList();
        MainWindow.getProgram().getPanelTransactions().removeAll();
        MainWindow.getProgram().getPanelTransactions().setLayout(new GridLayout(incomes.size(), 1, 0, 12));
        for (Income i : incomes) {
            if (TransactionParser.TransactionDate.isInUserSetRange(i)) {
                MainWindow.getProgram().getPanelTransactions().add(new TransactionPanel(i));
            }
        }
        MainWindow.getProgram().getPanelTransactions().revalidate();
        MainWindow.getProgram().getPanelTransactions().repaint();
    }

    public static void fillExpensesPanel() {
        final List<Expense> expenses = TransactionParser.getExpensesList();
        MainWindow.getProgram().getPanelTransactions().removeAll();
        MainWindow.getProgram().getPanelTransactions().setLayout(new GridLayout(expenses.size(), 1, 0, 12));
        for (Expense i : expenses) {
            if (TransactionParser.TransactionDate.isInUserSetRange(i)) {
                MainWindow.getProgram().getPanelTransactions().add(new TransactionPanel(i));
            }
        }
        MainWindow.getProgram().getPanelTransactions().revalidate();
        MainWindow.getProgram().getPanelTransactions().repaint();
    }

    public static List<Income> getIncomesList() {
        final List<Income> incomes = new ArrayList<>();
        for (Transaction i : TransactionParser.TRANSACTIONS) {
            if (i instanceof Income) {
                incomes.add(((Income) i));
            }
        }
        return incomes;
    }

    public static List<Expense> getExpensesList() {
        final List<Expense> expenses = new ArrayList<>();
        for (Transaction i : TransactionParser.TRANSACTIONS) {
            if (i instanceof Expense) {
                expenses.add(((Expense) i));
            }
        }
        return expenses;
    }

    public static double getTodaysIncomesAmount() {
        double amount = 0;
        final List<Income> incomes = TransactionParser.getIncomesList();
        for (int i = 0; i < incomes.size(); i++) {
            if (TransactionParser.TransactionDate.isToday(incomes.get(i))) {
                amount += incomes.get(i).getTransAmount();
            }
        }
        return amount;
    }

    public static double getTodaysExpensesAmount() {
        double amount = 0;
        final List<Expense> expenses = TransactionParser.getExpensesList();
        for (int i = 0; i < expenses.size(); i++) {
            if (TransactionParser.TransactionDate.isToday(expenses.get(i))) {
                amount += expenses.get(i).getTransAmount();
            }
        }
        return amount;
    }

    public static double getThisMonthIncomesAmount() {
        double amount = 0;
        final List<Income> incomes = TransactionParser.getIncomesList();
        for (int i = 0; i < incomes.size(); i++) {
            if (TransactionParser.TransactionDate.isThisMonth(incomes.get(i))) {
                amount += incomes.get(i).getTransAmount();
            }
        }
        return amount;
    }

    public static double getThisMonthExpensesAmount() {
        double amount = 0;
        final List<Expense> expenses = TransactionParser.getExpensesList();
        for (int i = 0; i < expenses.size(); i++) {
            if (TransactionParser.TransactionDate.isThisMonth(expenses.get(i))) {
                amount += expenses.get(i).getTransAmount();
            }
        }
        return amount;
    }

    public static double getThisYearIncomesAmount() {
        double amount = 0;
        final List<Income> incomes = TransactionParser.getIncomesList();
        for (int i = 0; i < incomes.size(); i++) {
            if (TransactionParser.TransactionDate.isThisYear(incomes.get(i))) {
                amount += incomes.get(i).getTransAmount();
            }
        }
        return amount;
    }

    public static double getThisYearExpensesAmount() {
        double amount = 0;
        final List<Expense> expenses = TransactionParser.getExpensesList();
        for (int i = 0; i < expenses.size(); i++) {
            if (TransactionParser.TransactionDate.isThisYear(expenses.get(i))) {
                amount += expenses.get(i).getTransAmount();
            }
        }
        return amount;
    }

    public static class TransactionDate {

        public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

        public static boolean isToday(final Transaction transaction) {
            return isThisMonth(transaction) && Calendar.getInstance().get(Calendar.DATE) == transaction.getTransDate().get(Calendar.DATE);
        }

        public static boolean isThisMonth(final Transaction transaction) {
            return isThisYear(transaction) && Calendar.getInstance().get(Calendar.MONTH) == transaction.getTransDate().get(Calendar.MONTH);
        }

        public static boolean isThisYear(final Transaction transaction) {
            return Calendar.getInstance().get(Calendar.YEAR) == transaction.getTransDate().get(Calendar.YEAR);
        }

        public static boolean isInUserSetRange(final Transaction transaction) {
            final Date fromDate = MainWindow.getProgram().getDatePickerFromDate().getDate();
            final Date toDate = MainWindow.getProgram().getDatePickerToDate().getDate();
            final Date transDate = transaction.getTransDate().getTime();

            if (fromDate != null) {
                if (toDate != null) {
                    return transDate.compareTo(fromDate) >= 0 && transDate.compareTo(toDate) <= 0;
                }
                return transDate.compareTo(fromDate) >= 0;
            }

            return toDate == null || transDate.compareTo(toDate) <= 0;
        }
    }

    private static class SerializationHandler {

        private static final String PATH = "local/transactions/transactions.bin";

        public static void writeTransactionToDisk() throws IOException {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(TransactionParser.SerializationHandler.PATH));
            objectOutputStream.writeObject(TransactionParser.TRANSACTIONS);

        }

        public static List<Transaction> readTransactionsFromDisk() {
            ObjectInputStream objectInputStream = null;
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(TransactionParser.SerializationHandler.PATH));
                return (ArrayList<Transaction>) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                if (ex instanceof IOException) {
                    System.out.println("File " + TransactionParser.SerializationHandler.PATH + " does not exist yet:");
                } else {
                    Logger.getLogger(TransactionParser.class.getName()).log(Level.SEVERE, null, ex);
                }
            } finally {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException ex) {
                        Logger.getLogger(TransactionParser.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            return new ArrayList<>();
        }

    }

}
