public class GradStudent extends Student {
    private int gradID;

    public GradStudent() {
        super();
        this.gradID = 0;
    }

    public GradStudent(String name, int[] tests, String grade, int gradID) {
        super(name, tests, grade);
        this.gradID = gradID;
    }

    public int getGradID() {
        return this.gradID;
    }

    public void computeGrade() {
        super.computeGrade();
        if (getTestAverage() >= 90)
            setGrade("Pass with distinction");
    }
}
