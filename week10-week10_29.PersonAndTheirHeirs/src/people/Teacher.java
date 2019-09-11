
package people;

/**
 *
 * @author thesh
 */
public class Teacher extends Person{
    
    private int salary;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    // METHOD. Prints teacher info and salary
    public String toString() {
        return super.toString() + " \n  salary " + this.salary + " euros/month"; 
    }
}
