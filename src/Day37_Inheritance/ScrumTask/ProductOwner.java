package Day37_Inheritance.ScrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }
    public void getterRequeriment(){
        System.out.println(jobTitle+" "+name+ " is gettering requriment");
    }
}
