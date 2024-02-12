package Package4;

import java.util.ArrayList;
import java.util.List;

interface OrganizationUnit{
    void display();
}
class Employee implements OrganizationUnit{
    private String name;
    public Employee(String name){
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("Employee: "+name);
    }
}
class Department implements OrganizationUnit{
    private String name;
    private List<OrganizationUnit> subUnits = new ArrayList<>();
    public Department(String name){
        this.name = name;
    }
    public void addSubUnit(OrganizationUnit unit){
        subUnits.add(unit);
    }
    @Override
    public void display() {
        System.out.println("Department: "+name);
        System.out.println("Subunits: ");
        for(OrganizationUnit unit: subUnits){
            unit.display();
        }
    }
}

public class OrganizationExample {
    public static void main(String[] args) {
        Department engineering = new Department("Engineering");
        engineering.addSubUnit(new Employee("Alice"));
        engineering.addSubUnit(new Employee("Bob"));

        Department marketing = new Department("Marketing");
        marketing.addSubUnit(new Employee("Charlie"));
        marketing.addSubUnit(new Employee("David"));

        Department company = new Department("Company");
        company.addSubUnit(engineering);
        company.addSubUnit(marketing);

        company.display();
    }
}
