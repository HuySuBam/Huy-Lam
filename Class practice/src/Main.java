public class Main{

public static void main(String[] args) {

        /*The first student*/
        Student st = new Student("Huy Lam");
        st.printStudent();
        st.addCourse("Physics");
        Courses cs = new Courses("Physics",90);

        st.addCourse("Calculus");
        cs.addCourse("Calculus", 96);

        st.addCourse("Biology");
        cs.addCourse("Biology",67);

        st.addCourse("Guitar");
        cs.addCourse("Guitar",55);

        cs.printCourseGrade();

        System.out.println("Average Grade of " +st.getStudentName()+ "'s courses: " + cs.printAverageGrade());

        /*The second student*/
        Student st1 = new Student("David Cohen");
        st1.printStudent();
        st1.addCourse("Chemistry");
        Courses cs1 = new Courses("Chemistry", 78);

        st1.addCourse("Web Design");
        cs1.addCourse("Web Design",70);


        st1.addCourse("Woodworking");
        cs1.addCourse("Woodworking",80);


        cs1.printCourseGrade();
        System.out.println("Average Grade of " +st1.getStudentName()+ "'s courses: " + cs1.printAverageGrade());




        }
        }