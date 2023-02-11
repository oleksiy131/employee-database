
import java.io.*;
import java.util.Scanner;

public class EmployeeDatabase {

    public static void main(String[] args) throws IOException {
        String name, address, department;
        int empID, age;
        double salary;

        File file = new File("EmployeeInfo.txt");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        name = input.nextLine();

        System.out.println("Enter employee address: ");
        address = input.nextLine();

        System.out.println("Enter employee department: ");
        department = input.nextLine();

        System.out.println("Enter employee ID: ");
        empID = input.nextInt();

        System.out.println("Enter employee age: ");
        age = input.nextInt();

        System.out.println("Enter employee salary: ");
        salary = input.nextDouble();

        FileWriter writer = new FileWriter(file);

        writer.write("Employee Name: " + name + System.getProperty("line.separator"));
        writer.write("Employee Address: " + address + System.getProperty("line.separator"));
        writer.write("Employee Department: " + department + System.getProperty("line.separator"));
        writer.write("Employee ID: " + empID + System.getProperty("line.separator"));
        writer.write("Employee Age: " + age + System.getProperty("line.separator"));
        writer.write("Employee Salary: " + salary + System.getProperty("line.separator"));

        writer.close();
        System.out.println("Employee Information stored in EmployeeInfo.txt");
    }

}