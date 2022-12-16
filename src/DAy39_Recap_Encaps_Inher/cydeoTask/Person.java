package DAy39_Recap_Encaps_Inher.cydeoTask;

public class Person {
private String name;
private int age;
private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()||name.isBlank()){
            System.out.println("invalid spelling");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("Please enter valid age");
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!((gender=='M')||(gender=='F'))){
            System.out.println(" not valid gender letter");
            System.exit(1);

        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
 Create a class named Person:
            Variables:
                name, age, gender
            Encapsulate all the fields
            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */