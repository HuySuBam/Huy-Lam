public class Student {
    private static int studentID;
    private String studentName;
    private String[] studentCourses = new String[10];


    public Student(String stdName) {
        studentName = stdName;
        studentID = studentID + 1;
    }
    public void addCourse(String course){
        for (int i=0;i<studentCourses.length;i++) {
            if (studentCourses[i] == null) {
                studentCourses[i] = course;
                break;
            }
        }
    }

    public String getStudentName(){
        return studentName;
    }

    public void printStudent() {
        System.out.println("Student ID: "+ studentID);
        System.out.println("Student Name: "+ studentName);
    }


    public void printCourse() {
        for (int i=0; i < studentCourses.length; i++) {
            if (studentCourses[i] != null) {
                System.out.println(studentCourses[i]);

            }
        }
    }

}