package DAy39_Recap_Encaps_Inher.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Tester tester=new Tester("Mehmet",45,'M',123,"tester",250000);
        Developer developer=new Developer("Ali",30,'M',456,"Developer",3000);
        Teacher teacher=new Teacher("Ayse",35,'F',789,"teacher",2800);
        Student student=new Student("Alper",22,'M',10," cydeo SDET ");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);
    }
}
/*
 7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */