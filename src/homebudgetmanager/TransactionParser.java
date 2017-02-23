/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homebudgetmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Shlomo Pfeuffer
 */
public class TransactionParser {

//    public static final Map<String, String> ICON_MAP = new HashMap<String, String>(30) {
//        {
//
//            put("property_tax", "measuring-tape.png");
//            put("clothing", "shirt.png");
//            put("entertainment", "popcorn.png");
//            put("insurance", "shield.png");
//            put("health_care", "medical.png");
//            put("gardening", "nature.png");
//            put("reports", "invoice.png");
//            put("fuel", "gas-station.png");
//            put("shoes", "shoe.png");
//            put("classes", "sea.png");
//            put("holiday", "sun-umbrella.png");
//            put("pets", "dog.png");
//            put("education", "library.png");
//            put("savings", "money.png");
//            put("electricity", "light-bulb.png");
//            put("vacation", "transport.png");
//            put("fitness", "sportsIcon.png");
//            put("food", "foodIcon.png");
//            put("water", "waterIcon.png");
//            put("tax", "gym.png");
//            put("restaurants", "food.png");
//            put("mortgage", "construction.png");
//            put("gifts", "gift.png");
//            put("moking", "smoking.png");
//            put("vehicle", "car.png");
//            put("rent", "house.png");
//            put("transportation", "train.png");
//            put("maintenance", "wrench.png");
//            put("communication", "technology.png");
//            put("other", "draw.png");
//
//        }
//    };
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

    public static List<Transaction> transactions = new ArrayList();

}
