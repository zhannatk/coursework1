package courseWork1;

public class Employee {
    private int id;
    private String surname;
    private String firstName;
    private String middleName;

    //здесь пробовала получить только имена таким способом. на сколько он применяем?
    //    private String fullName = surname + firstName + middleName;
    private int department;
    private double salary;
    private static int counter = 1;

    public Employee(String surname, String firstName, String middleName, int department, double salary) {
        this.id = counter++;
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;

//        this.fullName = surname + " " + firstName + " " + middleName;
    }



    public String getSurname() {
        return this.surname;

    }

    public String getFirstName() {
        return this.firstName;

    }

    public String getMiddleName() {
        return this.middleName;

    }

//    public String getFullName() {
//        return fullName;
//    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", surname: " + surname +
                ", firstName: " + firstName +
                ", middleName: " + middleName +
                ", department: " + department +
                ", salary: " + salary;
    }
}