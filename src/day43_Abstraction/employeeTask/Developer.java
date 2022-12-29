package day43_Abstraction.employeeTask;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName()+" is developing app");
    }

    public void sleep() {
        System.out.println(getName()+" is sleeping 10 hours");
    }
    public void unitTesting(){
        System.out.println(getName()+ " is unit testing");
    }
}
