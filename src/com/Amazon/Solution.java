package com.Amazon;/*
 * Click `Run` to execute the snippet below!

 Inputs: a list of transactions
[
    {
        from: "bank1",
        to: "bank2",
        amount: ?
    }
]

Output: a list of net amounts each bank owes each other

 */

/**
 * Transaction{
 * <p>
 * String from_bank;
 * String to_bank;
 * double amount;
 * <p>
 * }
 * <p>
 * <p>
 * sample input;
 * <p>
 * {BOFA,AMEX, 200}
 * {Amex, BOFA, 100}
 * <p>
 * Output: {BOFA,AMEX, 100}
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

    public static void main(String[] args) {

        List<String> transaction1 = new ArrayList<>();
        transaction1.add("BOFA");
        transaction1.add("AMEX");
        transaction1.add("200");


        List<String> transaction2 = new ArrayList<>();
        transaction2.add("AMEX");
        transaction2.add("BOFA");
        transaction2.add("100");

        List<String> transaction3 = new ArrayList<>();
        transaction3.add("BOFA");
        transaction3.add("AMEX");
        transaction3.add("500");


        List<List<String>> transactions = new ArrayList<>();

        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        //object for he transaction class

        Transaction transaction = new Transaction();
        transaction.settlementBalance(transactions);


    }
}

class Transaction {

    public List<List<String>> settlementBalance(List<List<String>> transactions) {

        // BOFA: {CHASE,100}{Amex, 200}
        //Amex: {BOFA,100}
        // BOFA-AMEX:
        Map<String, Double> payers = new HashMap<>();
        List<String> relationships = new ArrayList<>();

        for (List<String> transaction : transactions) {

            if (payers.containsKey(transaction.get(0) + "-" + transaction.get(1))) {

                payers.put(transaction.get(0) + "-" + transaction.get(1), Double.valueOf(transaction.get(2)) + payers.get(transaction.get(0) + "-" + transaction.get(1)));
            } else {
                payers.put(transaction.get(0) + "-" + transaction.get(1), Double.valueOf(transaction.get(2)));
                relationships.add(transaction.get(0) + "-" + transaction.get(1));
            }

        }


        //calculate ledger data
        for (String relationship : relationships) {
            System.out.println(relationship.substring(relationship.indexOf("-") + 1, relationship.length()));
        }


        System.out.println(payers);


        return transactions;
    }

}
