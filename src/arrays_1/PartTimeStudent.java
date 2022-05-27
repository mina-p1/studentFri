
package arrays_1;

/**
 *
 * @author peter
 */
public class PartTimeStudent extends Student {
    
    private int noOfCourses;

    public PartTimeStudent(int noOfCourses, int studentId, String studentName) {
        super(studentId, studentName);
        this.noOfCourses = noOfCourses;
    }

    public int getNoOfCourses() {
        return noOfCourses;
    }

    public void setNoOfCourses(int noOfCourses) {
        this.noOfCourses = noOfCourses;
    }
}
