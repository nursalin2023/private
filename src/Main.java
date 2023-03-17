import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setName(scanner.next());
        student.setSurName(scanner.next());
        student.setAge(scanner.next());
        student.setPhonnumber(scanner.next());
        System.out.println("NAME: " + student.sett()+ "\n"+"SUR NAME: " + student.getSurName()+"\n"+"AGE: "+student.getAge()+"\n"+"PHON NUMBER: "+ student.getPhonnumber());

    }
}