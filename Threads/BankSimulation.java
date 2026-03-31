package com.gla.Threads;
class BankAccount implements Runnable {
    private String name;
    private String accountType;

    public BankAccount(String name, String accountType) {
        this.name = name;
        this.accountType = accountType;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("[" + accountType + "] " + name + " is checking balance. (Priority: "
                    + Thread.currentThread().getPriority() + ") - Check #" + i);
            try {
                Thread.sleep(2000); // Simulate 2 seconds check time
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
    }
}
public class BankSimulation {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BankAccount("Alice", "Premium"));
        Thread t2 = new Thread(new BankAccount("Bob", "Regular"));
        Thread t3 = new Thread(new BankAccount("Charlie", "Basic"));

        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MIN_PRIORITY);  // 1

        t1.start(); t2.start(); t3.start();
    }
}
