
package people;

/**
 *
 * @author thesh
 */
public class Student extends Person {
    
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }
    
    // GETTER
    public int credits() {
        return this.credits;
    }
    
    // METHOD. Increases studemts credits by 1
    public void study() {
        this.credits++;
    }

    // METHOD. Prints student info and credits
    public String toString() {
        return super.toString() + "\n  credits " + this.credits;
    }
    
}
