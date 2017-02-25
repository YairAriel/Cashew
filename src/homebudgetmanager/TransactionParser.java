/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Shlomo Pfeuffer
 */
public class TransactionParser {

    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

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
        "sportsIcon.png",
        "foodIcon.png",
        "waterIcon.png",
        "gym.png",
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

    public static final List<Transaction> TRANSACTIONS = new ArrayList();

    public static void sortTransactionsByDate() {
        TransactionParser.TRANSACTIONS.sort(new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getTransDate().compareTo(o2.getTransDate());
            }

        });
    }

    public static void fillTransactionsPanel() {
        MainWindow.program.getPanelTransactions().removeAll();
        MainWindow.program.getPanelTransactions().setLayout(new GridLayout(TransactionParser.TRANSACTIONS.size(), 1, 0, 12));
        for (int i = 0; i < TransactionParser.TRANSACTIONS.size(); i++) {
            MainWindow.program.getPanelTransactions().add(new TransactionPanel(TransactionParser.TRANSACTIONS.get(i)));
            MainWindow.program.getPanelTransactions().revalidate();
            MainWindow.program.getPanelTransactions().repaint();
        }
    }

    public static int indexOfTransactionById(String transId) {
        for (int i = 0; i < TransactionParser.TRANSACTIONS.size(); i++) {
            if (TransactionParser.TRANSACTIONS.get(i).getTransID().equals(transId)) {
                return i;
            }
        }
        return -1;
    }

}
