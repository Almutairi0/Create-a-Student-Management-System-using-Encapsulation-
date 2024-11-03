package src;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(18);
        s1.setGrade(100);
        s1.setId(10000001);
        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getGrade() + " " + s1.getId());
    }
}