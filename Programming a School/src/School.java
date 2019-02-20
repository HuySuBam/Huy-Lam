import java.util.ArrayList;

public class School {

    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    ArrayList<Student> students = new ArrayList<Student>();


    public void addTeacher(Teacher vTeacher) {
        teachers.add(vTeacher);
    }
    public void deleteTeacher(int vTeacher) {
        teachers.remove(vTeacher);
    }

    public void addStudent(Student vStudent) {
        students.add(vStudent);
    }
    public void deleteStudent(int vStudent) {
        students.remove(vStudent);
    }
    public void showAllTeacher() {
        for (Teacher i: teachers) {
            System.out.println(i.getFirstname()+" "+i.getLastname()+" "+i.getSubject());
        }

    }
    public void showAllStudent() {
        for (Student i: students) {
            System.out.println(i.getFirstName()+" "+i.getLastName()+" "+i.getGrade());
        }
    }
}