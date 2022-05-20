package arrays_1;

/**
 *
 * @author peter
 */
public class studentList {
    
    public static void main(String[] args){
        
        Student[] studentList = new Student[3];
        
        Student s1 = new Student(1, "peter");
        Student s2 = new Student(2, "mina");
        Student s3 = new Student(3, "abc");
        
        studentList[0]=s1;
        studentList[1]=s2;
        studentList[2]=s3;
        
        for (int i = 0; i < studentList.length; i++){
        
            System.out.println(studentList[i].getStudentName());
        
        }
    
    
    
    
}
}
