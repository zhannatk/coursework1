
import courseWork1.Employee;

public class Main {
    public static

    Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Сидоров", "А.", "В.", 1, 50000);
        employees[1] = new Employee("Петров", "А.", "Г.", 2, 100000);
        employees[2] = new Employee("Сёмин", "Д.", "В.", 3, 150000);
        employees[3] = new Employee("Коморин", "Д.", "Г.", 4, 200000);
        employees[4] = new Employee("Новиков", "Л.", "Г.", 5, 250000);


        System.out.println("All Employees:");
        printEmployees();
        System.out.println();

        System.out.println("Total Salary:");
        System.out.println(findTotalSalary());
        System.out.println();

        System.out.println("Minimum Salary:");
        System.out.println(findMinimumSalaryEmployee());
        System.out.println();

        System.out.println("Maximum Salary:");
        System.out.println(findMaximumSalaryEmployee());
        System.out.println();

        System.out.println("Average Salary:");
        System.out.println(calculateAverageSalary());
        System.out.println();
//        printEmployeeNames();
        System.out.println("Names only: ");
        printNamesOnly();
        System.out.println();


    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double findTotalSalary() {
        double sum = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    public static Employee findMinimumSalaryEmployee() {
        Employee minEmp = employees[0];
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() < minEmp.getSalary()) {
                minEmp = emp;
            }
        }
        return minEmp;
    }

    public static Employee findMaximumSalaryEmployee() {
        Employee maxEmp = employees[0];
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() > maxEmp.getSalary()) {
                maxEmp = emp;
            }
        }
        return maxEmp;
    }

    public static double calculateAverageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                sum += emp.getSalary();
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return sum / count;
    }


    public static void printNamesOnly() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getSurname() + " " + emp.getFirstName() + " " + emp.getMiddleName());
            }
        }
    }
}