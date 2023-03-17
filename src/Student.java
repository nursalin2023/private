import java.util.Objects;

public class Student {
    private String name;
    private String surName;
    private String age;
    private String phonnumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurName(){
        return surName;
    }
    public void  setSurName(String surName){
        this.surName=surName;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getPhonnumber(){
        return phonnumber;
    }
    public void setPhonnumber(String phonnumber){
        this.phonnumber=phonnumber;
    }
    public String sett (){
        if (Objects.equals(this.name, "Azamat")){
            System.out.println("Teacher name: ");
        }else
            System.out.println("Student name:");
        return name;
    }

}
