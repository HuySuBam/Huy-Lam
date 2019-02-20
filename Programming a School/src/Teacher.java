public class Teacher {

    private String firstname;
    private String lastname;
    private String subject;

    public Teacher() {

    }
    public Teacher(String Firstname, String Lastname,String Subject) {
        firstname= Firstname;
        lastname = Lastname;
        subject = Subject;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}