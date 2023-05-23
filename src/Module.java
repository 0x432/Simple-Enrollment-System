import java.util.Arrays;
import java.util.Comparator;

public class Module {
    String moduleID;
    Student[] student_Enrolment = new Student[5];
    int classSize;

    public Module(String moduleID){
        this.moduleID = moduleID;
        classSize = 0;
    }

    public void student_Enrolment(Student student) {
        boolean enrolled = false;
        for (int i = 0; i < classSize; i++) {
            if (student_Enrolment[i].equals(student)) {
                enrolled = true;
                break;
            }
        }
        if (!enrolled) {
            student_Enrolment[classSize] = student;
            classSize++;
            Arrays.sort(student_Enrolment, 0, classSize, Comparator.nullsLast(Comparator.naturalOrder()));
            if (classSize == student_Enrolment.length) {
                student_Enrolment = Arrays.copyOf(student_Enrolment, classSize * 2);
            }
        }
    }

    public void unenrollStudent(Student student) {
        int index = Arrays.binarySearch(student_Enrolment, 0, classSize, student);
        if (index >= 0) {
            for (int i = index; i < classSize - 1; i++) {
                student_Enrolment[i] = student_Enrolment[i + 1];
            }
            student_Enrolment[classSize - 1] = null;
            classSize--;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(moduleID).append("\n");
        result.append(classSize).append("\n");
        for (int i = 0; i < classSize; i++) {
            result.append(student_Enrolment[i].toString()).append("\n");
        }
        return result.toString();
    }
}
