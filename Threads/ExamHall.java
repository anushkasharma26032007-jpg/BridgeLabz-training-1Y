package com.gla.Threads;
class ExamActivity extends Thread {
    private String task;
    private int delay;

    public ExamActivity(String task, int delay, int priority) {
        this.task = task;
        this.delay = delay;
        setPriority(priority);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(task + " started. Current State: " + this.getState());
            Thread.sleep(2000); // Simulate task duration
            System.out.println(task + " completed.");
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
public class ExamHall {
    public static void main(String[] args) throws InterruptedException {
        ExamActivity entry = new ExamActivity("Student Entry", 0, 5);
        ExamActivity papers = new ExamActivity("Paper Distribution", 5000, 10);
        ExamActivity attendance = new ExamActivity("Attendance", 10000, 8);

        System.out.println("Entry Thread State: " + entry.getState());
        entry.start();
        papers.start();
        attendance.start();

        Thread.sleep(1000);
        System.out.println("Papers Thread State: " + papers.getState());
    }
}
