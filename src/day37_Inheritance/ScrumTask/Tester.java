package day37_Inheritance.ScrumTask;

public class Tester extends Employee{//tester is an employee. tester is a person
    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }
}
/*
3. Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have
 */