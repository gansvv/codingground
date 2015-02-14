import java.util.*;

public class SortingEmployee {
    public static void main(String[] args) {
        System.out.println("Sorting objects");
        
    }
    
    List<Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee("Tom", 101));
    employees.add(new Employee("Dick", 102));
    employees.add(new Employee("Jane", 103));
    employees.add(new Employee("Harry", 104));
    employees.add(new Employee("Ravi", 105));
    System.out.println("unsorted list = " + employees.toString());
    
    Collections.sort(employees);
    for(Employee e: employees) 
        System.out.println(e.getEmployeeName() + ",");
        
    Collections.sort(employees, new Employee());
    for(Employee e: employees) {
        System.out.println(e.getEmployeeName() + ", ");
        System.out.println(e.getEmployeeId() + ", ");
    }
    
    System.out.println("done");
}

class Employee implements Comparator<Dog>, Comparable<Dog> {
    private String employeeName;
    private Integer employeeId;
    
    Employee() {
    }
    
    public String getEmployeeName() {
        return this.employeeName;        
    }

    Employee(String name, Integer id) {
        this.employeeName = name;
        this.employeeId = id;
    }
    
    public int compareTo(Employee e) {
        return (this.employeeName).compareTo(e.employeeName);
    }
    
    public int compare(Employee e1, Employee e2) {
        if (e1.employeeId > e2.employeeId) {
            return 1;
        } else {
            return 0;
        }
    }
}