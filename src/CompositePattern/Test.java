package CompositePattern;

public class Test {
    public static void main(String[] args) {
        
        Manager m1 = new Manager(120115, "Ali", 3000.51);
        System.out.println(m1);
        
        Clerk c1 = new Clerk (10014, "Baraa", 1420);
        System.out.println(c1);
        
        Clerk c2 = new Clerk (10015, "Ahmed", 1201.11);
        System.out.println(c2);
        
        m1.addSubordinate(c1);
        m1.addSubordinate(c2);
        System.out.println(m1);
        m1.printSubordinates();
        
        m1.removeSubordinate(c2.getID());
        m1.printSubordinates();
        
        //////////////////////////////////////////////////
        
        Manager m2 = new Manager(120118, "Khaled", 3201.5155);
        System.out.println(m2);
        
        Manager generalManager = new Manager(17001, "Mohammed", 4100);
        
        generalManager.addSubordinate(m1);
        generalManager.addSubordinate(m2);
        
        System.out.println(generalManager);
        generalManager.printSubordinates();
    }
}
