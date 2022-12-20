package day39_Recap_Encaps_Inher.cydeoTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }
    public void work(){
        System.out.println(getName()+" is testing");
    }

    public void createTicket(){
        System.out.println(getEmployeeID()+" ID "+getName()+" is creating ticket");
    }

}
/*
. Create a sub class of Employee named Tester
            Override the work method
            Extra methods:
                createTicket()
 */