class Student {
    String name;

    Student(String name) {
        this.name = name; 
    }

    void display() {
        System.out.println(name);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Anushka");
    }
}
