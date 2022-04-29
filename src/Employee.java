public class Employee {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private int salary;
    private int department;
    private int id;
    public static int count = 0;

    public Employee(String firstName, String lastName, String middleName, int salary, int department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.department = department;
        count++;
        id += count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        return getLastName() + " " + getFirstName() + " " + getMiddleName();

    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "Id ='" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
