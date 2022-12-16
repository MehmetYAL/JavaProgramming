package Day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setInfo("Mehmet",'M',45,1903,'A');
        System.out.println(student1);

        Student student2=new Student();
        student2.setInfo("Hulya",'F',26,2123,'B');

        Student student3=new Student();
        student3.setInfo("Elm",'F',26,2510,'A');

        Student student4=new Student();
        student4.setInfo("Ali",'M',35,4559,'B');

        Student student5=new Student();
        student5.setInfo("Mert",'M',26,2111,'C');

        Student[] students={student1,student2,student3,student4,student5};

        for (Student each : students) {
            System.out.println(each);

        }

        System.out.println("==============================================================");

        ArrayList<Student> earlyBirds=new ArrayList<>();//grade:A
        ArrayList<Student> angryBirds=new ArrayList<>();

        for (Student student : students) {
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else {angryBirds.add(student);}



        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);


    }
}
