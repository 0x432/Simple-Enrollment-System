public class Student implements Comparable<Student>{
    String studentID;

    public Student(String student_ID){
        this.studentID = student_ID;
    }

    public String getStudent(){
        return studentID;
    }

    @Override
    public String toString(){
        return studentID;
    }

    @Override
    public int compareTo(Student student){
        return this.studentID.compareTo(student.getStudent());
    }
}