package Package2;

import java.util.ArrayList;
import java.util.List;

interface Employee {
    void showDetails();
}

class Developer implements Employee {
    private String name;
    public Developer(String name){
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println("Developer: "+name);
    }
}

class Manager implements Employee {
    private String name;
    private List<Employee> employeeList = new ArrayList<>();
    public Manager(String name){
        this.name = name;
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    @Override
    public void showDetails() {
        System.out.println("Manager: "+name);
        System.out.println("Subordinates");
        for (Employee employee: employeeList){
            employee.showDetails();
        }
    }
}

public class CompanyOrganizationStructure {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Hasitha");
        Manager manager2 = new Manager("Navod");

        Developer developer1 = new Developer("Madushnaka");
        Developer developer2 = new Developer("Maithripala");
        Developer developer3 = new Developer("Kasun");

        manager1.addEmployee(manager2);
        manager1.addEmployee(developer1);

        manager2.addEmployee(developer2);
        manager2.addEmployee(developer3);
    }
}
