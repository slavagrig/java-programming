package Day50_Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Slava";
        p1.age = 35;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherId = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();

        Student student = new Student();
        student.name = "Ali";
        student.age = 3;
        student.walk();
        student.talk();
        student.work("Java programmer");
        student.school = "Cyberschool";





    }
}
