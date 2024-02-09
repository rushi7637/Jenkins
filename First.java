import java.util.Date; // Import java.util.Date instead of java.sql.Date

public class First {
    public static void main(String[] args) {
        System.out.println("hello jenkins");
        System.out.println("this is first jenkins project");
        System.out.println(new Date()); // Use java.util.Date
        System.out.println("added one more file");
        Student student=new Student();
        student.sayHello();
    }
}