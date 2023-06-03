import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(32, "Иван", "Пупкин", 60);
        Employee e2 = new Employee(20, "Вася", "Пупкин", 40);
        Employee e3 = new Employee(10, "Вася", "Пупкин");

//        Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);

        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        for (Employee emp: employees) {
            System.out.println(emp);
        }
    }
}