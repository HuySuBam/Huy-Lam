public class Courses {
    private String[] studentCourse = new String[10];
    private int[] studentGrade = new int[10];

    public Courses(String courseName, int Grade) {
        studentCourse[0] = courseName;
        studentGrade[0] = Grade;
    }


    public void addCourse(String courseName, int Grade) {
        for(int i=0;i<studentCourse.length;i++) {
            if (studentCourse[i] == null) {
                studentCourse[i] = courseName;
                break;
            }
        }
        for(int i=0;i<studentGrade.length;i++) {
            if (studentGrade[i] == 0) {
                studentGrade[i] = Grade;
                break;
            }
        }

    }


    public void printCourseGrade() {
        for (int i=0;i<studentCourse.length;i++) {
            if (studentCourse[i] != null) {
                System.out.println("Course Name: "+ studentCourse[i]);
                System.out.println("Grade: "      + studentGrade[i]);
            }
        }
    }

    public double printAverageGrade() {
        int sum = 0, c=0;
        for (int i=0; i<studentCourse.length; i++ ) {
            if (studentCourse[i] != null) {
                sum = sum + studentGrade[i];
                c = c+1;
            }
        }
        return sum/c;
    }

}