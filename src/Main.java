import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main( String[] args ) {
        Student s = new Student( "Brian", new int[] { 90, 94, 99 }, "none" );
        Student u = new UnderGrad( "Tim", new int[] { 70, 70, 69 }, "none" );
        Student g = new GradStudent( "Kevin", new int[] { 90, 95, 90 }, "none", 1234 );
        List<Student> studentList = new ArrayList<Student>();

        studentList.add( s ); studentList.add( u ); studentList.add( g );

        s.computeGrade(); u.computeGrade(); g.computeGrade();

        for ( Student stud : studentList ) {
            stud.computeGrade();
            System.out.println( stud );
        }

        System.out.println( s );
        System.out.println( u );
        System.out.println( g );
    }
}