package CompositePattern;

public interface Employee {
    void setID(int id);
    int getID();
    void setName(String name);
    String getName();
    void setSalary(double salary);
    double getSalary();
    void setManager(Manager manager);
    Manager getManager();
}
