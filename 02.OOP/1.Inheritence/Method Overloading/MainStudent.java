public class MainStudent {
    public static void main(String args[]) {
        Student stu1 = new Student();
        stu1.setStudent();
        stu1.display();

        Student stu2 = new Student();
        stu2.setStudent(1500);
        stu2.display();

        Student stu3 = new Student();
        stu3.setStudent("muralee");
        stu3.display();

        Student stu4 = new Student();
        stu4.setStudent(3500, "kokul");
        stu4.display();

        Student stu5 = new Student();
        stu5.setStudent("kavi", 3600);
        stu5.display();
    }
}
