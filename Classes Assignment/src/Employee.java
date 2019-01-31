

public class Employee {
    //Fields

    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }


    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public int getAnnualSalary() {
        return this.salary = salary * 12;
    }

    public int raiseSalary(int percent) {

        double temp = percent;
        temp = temp / 100;
        temp++;
        double tempSal = (salary * temp);
        salary = (int) tempSal;
        return (int) tempSal;

    }

    public String toString() {
        return "Employee [ ID = " + getID() + ", Name = " + getName() + ", Annual Salary = $" + getAnnualSalary() + " ]";
    }
}

