class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        this.id = 100;
        this.name = "yoha";
    }

    // Constructor with int parameter
    Student(int id) {
        this.id = id;
        this.name = "yoha";
    }

    // Constructor with String parameter
    Student(String name) {
        this.id = 100;
        this.name = name;
    }

    // Constructor with int and String parameters
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
}

public class MainStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.display();

        Student stu2 = new Student(2000);
        stu2.display();

        Student stu3 = new Student("muralee");
        stu3.display();

        Student stu4 = new Student(3500, "kokul");
        stu4.display();

        //Student stu5 = new Student("kavi", 3600);
        //stu5.display();
    }
}
