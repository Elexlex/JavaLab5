package Lab5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        final int range = 3;
        Person[] personArray = new Person[range];
        personArray[0] = new Person();
        personArray[1] = new Student();
        personArray[2] = new Lecturer();
        Scanner num = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Who are you?\n\t- 1. Just a normal person\n\t- 2. I am a student\n\t- 3. I am a lecturer");
            menu = num.nextInt();
        } while (menu>3 || menu<1);
                personInfo(personArray, menu);
                personArray[menu-1].printInfo();
    }
    private static void personInfo(Person[] personAr, int check){
        Scanner num = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        System.out.print("\n\nInput your name: ");
        personAr[check-1].setName(name.nextLine());
        System.out.print("\n\nInput your surname: ");
        personAr[check-1].setSurname(name.nextLine());
        System.out.print("\n\nInput your age: ");
        personAr[check-1].setAge(num.nextInt());
        if (check == 2){
            System.out.print("\n\nInput your group: ");
            ((Student)personAr[check-1]).setGroup(num.nextInt());
            System.out.print("\n\nInput your student ID: ");
            ((Student)personAr[check-1]).setStudentID(num.nextInt());
        }
        else if (check == 3){
            System.out.print("\n\nInput your department: ");
            ((Lecturer)personAr[check-1]).setDepartment(name.nextLine());
            System.out.print("\n\nInput your salary: ");
            ((Lecturer)personAr[check-1]).setSalary(name.nextInt());
        }

    }
}
