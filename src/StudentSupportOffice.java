public class StudentSupportOffice {

    public static void main(String[] args) {

        // Creating the modules
         Module moduel_1 = new Module("CIS2206");
         Module moduel_2 = new Module("CIS2360");
         Module moduel_3 = new Module("CIS2205");

        // Creating the student IDs
         Student Student_1 = new Student("U0000001");
         Student Student_2 = new Student("U0000002");
         Student Student_3 = new Student("U0000003");
         Student Student_4 = new Student("U0000004");
         Student Student_5 = new Student("U0000005");

        // For CIS2206
        moduel_1.student_Enrolment(Student_1);
        moduel_1.student_Enrolment(Student_5);

        // For CIS2360
        moduel_2.student_Enrolment(Student_1);
        moduel_2.student_Enrolment(Student_3);
        moduel_2.student_Enrolment(Student_4);

        // For CIS2205
        moduel_3.student_Enrolment(Student_2);
        moduel_3.student_Enrolment(Student_4);
        moduel_3.student_Enrolment(Student_5);

        System.out.println(moduel_1);
        System.out.println(moduel_2);
        System.out.println(moduel_3);

        // For CIS2206
        moduel_1.student_Enrolment(Student_3);
        moduel_1.unenrollStudent(Student_5);
        moduel_1.student_Enrolment(Student_4);

        // For CIS2360
        moduel_2.student_Enrolment(Student_2);
        moduel_2.student_Enrolment(Student_5);

        // For CIS2205
        moduel_3.unenrollStudent(Student_2);
        moduel_3.unenrollStudent(Student_5);
        moduel_3.student_Enrolment(Student_1);
        moduel_3.student_Enrolment(Student_3);

        System.out.println(moduel_1);
        System.out.println(moduel_2);
        System.out.println(moduel_3);

    }
}