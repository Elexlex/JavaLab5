package Lab5;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(){}
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {return age;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public void setAge(int age) {this.age = age;}

    public void setName(String name) {this.name = name;}

    public void setSurname(String surname) {this.surname = surname;}

    public void printInfo(){
        System.out.println("\n\nHuman " + surname + " " + name + ", age " + age);
    }

}
class Student extends Person{
    private int group;
    private int studentID;

    public Student(){
        super();
    }

    public Student (String name, String surname, int age, int group, int studentID){
        super(name, surname, age);
        this.group = group;
        this.studentID = studentID;
    }
    public void setGroup(int group) {this.group = group;}

    public void setStudentID(int studentID) {this.studentID = studentID;}

    @Override
    public void printInfo() {
        System.out.println("\n\nGroup " + group + " student " + getSurname() + " " + getName() + ", age " + getAge() + ".\nStudent ID " + studentID);
    }
}
class Lecturer extends Person{
    private int salary;
    private String department;

    public Lecturer(){
        super();
    }

    public Lecturer(String name, String surname, int age, String department, int salary){
        super(name, surname, age);
        this.department = department;
        this.salary = salary;
    }
    public void setDepartment(String department) {this.department = department;}

    public void setSalary(int salary) {this.salary = salary;}

    @Override
    public void printInfo() {
        System.out.println("\n\nDepartment of " + department + " teacher " + getSurname() + " " + getName() + ", age " + getAge() + ".\nSalary:" + salary);
    }
}
