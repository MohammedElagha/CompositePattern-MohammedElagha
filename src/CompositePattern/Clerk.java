package CompositePattern;

public class Clerk implements Employee{
    private int ID;
    private String name;
    private double salary;
    private Manager manager;

    public Clerk(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.manager = null;
    }

    @Override
    public void setID(int id) {
        this.ID = id;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
    
    @Override
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public Manager getManager() {
        return manager;
    }
    
    @Override
    public String toString() {
        String managerName;
        if(manager == null)
            managerName = "No manager";
        else
            managerName = manager.getName();
        
        return this.getClass().getSimpleName() + "\n"
                + "ID: " + ID + "\n"
                + "Name: " + name + "\n"
                + "Salary: " + salary + "\n"
                + "Manager: " + managerName + "\n";
    }
}
