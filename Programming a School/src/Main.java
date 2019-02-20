public class Main {

    public static void main(String[] args) {
        School sch = new School();


        System.out.println("-------------Add 10 students to the student list--------------------------------------------------------------");
        sch.addStudent(new Student("Huy","Lam",12));
        sch.addStudent(new Student("Timothy", "Tan",12));
        sch.addStudent(new Student("Eric", "Dam",12));
        sch.addStudent(new Student("Xavier", "Ancheta",12));
        sch.addStudent(new Student("Timothy", "Kim",12));
        sch.addStudent(new Student("Joanne", "Mach",11));
        sch.addStudent(new Student("Samantha","Tseng",11));
        sch.addStudent(new Student("Angeline","Lin",11));
        sch.addStudent(new Student("Michael", "Zheng",12));
        sch.addStudent(new Student("Alex", "Chang",12));

        System.out.println("-------------Add 3 teachers to the teacher list--------------------------------------------------------------");

        sch.addTeacher(new Teacher("Paul","Zaremba","Computer Science"));
        sch.addTeacher(new Teacher("Glen", "Hamlen","Physics"));
        sch.addTeacher(new Teacher("Jason","Tryssenaar","English"));

        System.out.println("-------------Remove 2 students from the student list--------------------------------------------------------------");

        sch.deleteStudent(4);
        sch.deleteStudent(7);

        System.out.println("------------Remove 1 teacher from the teacher list---------------------------------------------------------------");

        sch.deleteTeacher(0);

        System.out.println("------------Display the teacher list---------------------------------------------------------------");

        sch.showAllTeacher();

        System.out.println("------------Display the student list---------------------------------------------------------------");
        sch.showAllStudent();

    }

}