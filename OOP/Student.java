public class Student {
    // member variables
    String name;
    int age;
    double grade;

    // member methods
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String args[]) {
        
        Student student1 = new Student();

        student1.name = "John Doe";
        student1.age = 14;
        student1.grade = 95.60;

        student1.printInfo();

        Student student2 = new Student();

        student2.name = "Jane Doe";
        student2.age = 13;
        student2.grade = 90;

        student2.printInfo();

        Student student3 = new Student();

        student3.name = "Alan Paul";
        student3.age = 15;
        student3.grade = 85;

        student3.printInfo();

        Student student4 = new Student();

        student4.name = "Lebron James";
        student4.age = 20;
        student4.grade = 100;

        student4.printInfo();
        
    }
}