package com.gla.Generics.JavaCollection;
import java.util.*;

class Question {
    String text;

    Question(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}

class Student {
    String id;

    Student(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }
}

public class OnlineExaminationManagementSystem {

    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));
        questions.add(new Question("Q3"));

        Collections.shuffle(questions);

        Set<String> studentIds = new HashSet<>();
        studentIds.add("S1");
        studentIds.add("S2");
        studentIds.add("S1");

        Queue<Student> queue = new LinkedList<>();
        queue.add(new Student("S1"));
        queue.add(new Student("S2"));

        Stack<Question> stack = new Stack<>();

        while (!queue.isEmpty()) {
            Student s = queue.poll();
            System.out.println("Serving: " + s);

            for (Question q : questions) {
                System.out.println("Question: " + q);
                stack.push(q);
            }

            while (!stack.isEmpty()) {
                System.out.println("Back: " + stack.pop());
            }
        }
    }
}
