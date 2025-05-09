import java.util.Scanner;

class EmployeeT {
    int empid;
    String name;
    float salary;
    String address;

    EmployeeT() {
    }

    EmployeeT(int empid, String name, float salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeT {
    String dept, sub;

   
    Teacher(int empid, String name, float salary, String address, String dept, String sub) {
        super(empid, name, salary, address); 
        this.dept = dept;
        this.sub = sub;
    }

    public void display() {
        System.out.println("\nTeacher ID: " + empid);
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Salary: " + salary);
        System.out.println("Teacher Address: " + address);
        System.out.println("Teacher Department: " + dept);
        System.out.println("Teacher Subject: " + sub);
    }
}

public class Techarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter number of teachers:");
        int n = sc.nextInt();
        sc.nextLine(); 

        Teacher[] teachers = new Teacher[n];


        System.out.println("Enter teacher details one by one:");

        for (int i = 0; i < n; i++) {
            
            System.out.println("Enter teacher id:");
            int tid = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter teacher name:");
            String name = sc.nextLine();

            float salary = 0;
            while (true) {
                try {
                    System.out.println("Enter teacher salary:");
                    salary = sc.nextFloat();
                    sc.nextLine(); 
                    break; 
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input for salary. Please enter a valid float value.");
                    sc.nextLine(); 
                }
            }

            System.out.println("Enter teacher address:");
            String add = sc.nextLine();

            System.out.println("Enter teacher department:");
            String dept = sc.nextLine();

            System.out.println("Enter teacher subject:");
            String sub = sc.nextLine();

            Teacher t = new Teacher(tid, name, salary, add, dept, sub);
            teachers[i] = t;
        }

        System.out.println("\nDisplaying Teacher Details:");
        for (Teacher t : teachers) {
            t.display();
            System.out.println("\n");
        }

        sc.close();
    }
}
