import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeLinkedList empList = new EmployeeLinkedList();

        System.out.println("Welcome to the Employee Management System");
        int Choice;
        do
        {
            System.out.println("Please enter your choice");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Show List of Employees");
            System.out.println("4. Exit");
            Choice = sc.nextInt();

            switch(Choice)
            {
                case 1:
                    System.out.println("Enter Employee ID");
                    int EmployeeID = sc.nextInt();
                    System.out.println("Enter Employee Name");
                    String EmployeeName = sc.next();
                    System.out.println("Enter Employee Position");
                    String EmployeePosition = sc.next();
                    System.out.println("Enter Employee Salary");
                    double EmployeeSalary = sc.nextDouble();
                    Employee emp = new Employee(EmployeeID,EmployeeName,EmployeePosition,EmployeeSalary);
                    empList.addEmployee(emp);
                    break;

                    case 2:
                            System.out.println("Enter ID of Employee to remove" );
                            int RemoveID = sc.nextInt();
                            empList.deleteEmployee(RemoveID);
                            break;

                        case 3:
                            empList.displayEmployees();
                            break;

                            case 4:
                                System.out.println("Goodbye");
                                break;
            }

        } while (Choice != 4 );

    }
}
