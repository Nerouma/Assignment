public class Employee
{

    public int employeeID;
    public String name;
    public String position;
    public double salary;

    public Employee ()
    {

    }

    public Employee (int employeeID, String name, String position, double salary)
    {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString()
    {
        return "EmployeeID: " + employeeID + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}
