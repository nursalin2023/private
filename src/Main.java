import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setName(scanner.next());
        student.setSurName(scanner.next());
        student.setAge(scanner.next());
        student.setPhonnumber(scanner.next());
        student.sett();
        System.out.println("NAME: " + student.getName()+ "\n"+"SUR NAME: " + student.getSurName()+"\n"+"AGE: "+student.getAge()+"\n"+"PHON NUMBER: "+ student.getPhonnumber());

    }
}