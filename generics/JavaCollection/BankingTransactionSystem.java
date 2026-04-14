package com.gla.Generics.JavaCollection;
import java.util.*;

class Transaction {
    int id;
    int accountId;
    double amount;

    Transaction(int id, int accountId, double amount) {
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
    }

    public String toString() {
        return "Txn " + id + " Acc:" + accountId + " Amt:" + amount;
    }
}

class Account {
    int id;

    Account(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account a = (Account) o;
        return id == a.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class BankingTransactionSystem {

    public static void main(String[] args) {

        List<Transaction> allTransactions = new ArrayList<>();

        Queue<Transaction> queue = new LinkedList<>();

        Set<Account> validAccounts = new HashSet<>();
        validAccounts.add(new Account(101));
        validAccounts.add(new Account(102));

        Stack<Transaction> stack = new Stack<>();

        Transaction t1 = new Transaction(1, 101, 500);
        Transaction t2 = new Transaction(2, 102, 1000);
        Transaction t3 = new Transaction(3, 103, 700);

        allTransactions.add(t1);
        allTransactions.add(t2);
        allTransactions.add(t3);

        queue.addAll(allTransactions);

        while (!queue.isEmpty()) {
            Transaction t = queue.poll();

            if (!validAccounts.contains(new Account(t.accountId))) {
                System.out.println("Invalid Account: " + t);
                continue;
            }

            System.out.println("Processing: " + t);

            if (t.id == 2) {
                System.out.println("Failed: " + t);
                stack.push(t);
            }
        }

        System.out.println("Rollback:");

        while (!stack.isEmpty()) {
            System.out.println("Undo: " + stack.pop());
        }
    }
}
