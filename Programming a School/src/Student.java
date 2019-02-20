public class Student {

        private static int studentID;
        private String firstName;
        private String lastName;
        private int grade;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String sfname, String slname, int sgrade) {
            studentID = studentID + 1;
        firstName = sfname;
        lastName= slname;
        grade= sgrade;
        }

    }