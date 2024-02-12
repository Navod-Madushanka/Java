package JustCode;

import java.util.ArrayList;
import java.util.List;

interface OrganizationUnit{
    void display();
}

class Employee extends User implements OrganizationUnit{
    private User user;

    public Employee(User user){
        super(user);
        this.user = user;
    }

    @Override
    public void display() {
        System.out.println(user.getUsername());
    }

}
class Manager implements OrganizationUnit{
    private List<OrganizationUnit> subUnit = new ArrayList<>();

    private User user;
    public Manager(User user){
        this.user = user;
    }
    public void addUnit(User user){
        subUnit.add(user);
    }

    @Override
    public void display() {
        for(OrganizationUnit unit:subUnit){
            unit.display();
        }
    }

}

public class CompositePattern {
}
