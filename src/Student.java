import java.util.Arrays;

public class Student {
    public final static int NUM_TESTS = 3;
    private String name;
    private int[] tests;
    private String grade;

    public Student() {
        name = "";
        tests = new int[ NUM_TESTS ];
        grade = "";
    }

    public Student( String name, int[] tests, String grade ) {
        this.name = name;
        this.tests = tests;
        this.grade = grade;
    }

    public String getName() { return this.name; }
    public String getGrade() { return this.grade; }
    public int[] getTests() { return this.tests; }

    public void setName( String name ) { this.name = name; }
    public void setGrade( String grade ) { this.grade = grade; }

    public void computeGrade() {
        if ( this.name.equals( "" ) )
            this.grade = "No Grade!";
        else if ( getTestAverage() >= 65 )
            this.grade = "Pass";
        else
            this.grade = "Fail";
    }

    public double getTestAverage() {
        int sum = 0;
        for ( int i : this.tests ) {
            sum += i;
        }
        return ( double ) sum / this.tests.length;
    }

    public String toString() { return "Name: " + this.name + "\nGrade: " + this.grade + "\nTests: " + Arrays.toString( this.tests ) + "\nAverage: " + getTestAverage() + "\n"; }
}
