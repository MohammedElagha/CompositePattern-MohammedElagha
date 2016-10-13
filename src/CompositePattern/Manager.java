package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private int ID;
    private String name;
    private double salary;
    private Manager manager;
    private List<Employee> subordinates;

    public Manager(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.manager = null;
        this.subordinates = new ArrayList();
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
    
    public void addSubordinate(Employee employee){
        employee.setManager(this);
        subordinates.add(employee);
    }
    
    public void removeSubordinate(int id){
        for (int i = 0; i < subordinates.size(); i++)
            if(subordinates.get(i).getID() == id){
                subordinates.remove(i);
                break;
            }
    }
    
    public Employee getSubordinate(int id){
        Employee employee = null;
        
        for (int i = 0; i < subordinates.size(); i++)
            if(subordinates.get(i).getID() == id){
                employee = subordinates.get(i);
                break;
            }
        
        return employee;
    }
    
    public Employee getSubordinate(String name){
        Employee employee = null;
        
        for (int i = 0; i < subordinates.size(); i++)
            if(subordinates.get(i).getName().equals(name)){
                employee = subordinates.get(i);
                break;
            }
        
        return employee;
    }
    
    public void printSubordinates(){
        System.out.println("Subordinates of manager #" + ID + " " + name + ":");
        if(subordinates.size() > 0)
            for (int i = 0; i < subordinates.size(); i++)
                System.out.println(i+1 + "- " + subordinates.get(i).toString());
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
                + "Manager: " + managerName + "\n"
                + "Number of subordinates: " + subordinates.size() + "\n";
    }
    
}
