import java.util.LinkedList;
public class EmployeeLinkedList
{
    LinkedList<Employee> employees;

    public EmployeeLinkedList()
    {
        employees = new LinkedList<>();
    }

    void addEmployee (Employee emp)
    {
        employees.add (emp);
    }

    void deleteEmployee (int employeeID)
    {
       for(Employee emp : employees)
       {
           if (emp.employeeID == employeeID)
           {
               employees.remove(emp);
               break;
           }
       }
    }

    void displayEmployees ()
    {
        System.out.println ("Employee List: ");
        for (Employee emp : employees)
        {
            System.out.println(emp);
        }
    }
}
