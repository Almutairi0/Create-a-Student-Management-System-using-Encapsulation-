package src;

public class Student {
    private String name;
    private int age;
    private int id;
    private int grade;


        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;

        }
        public int getAge () {
            return age;
        }
        public void setAge ( int age){
            if (age >= 0){
                this.age = age;
            }
        else{
                System.out.println("Age is a negative number");
            }
        }
        public int getId () {
            return id;
        }
        public void setId ( int id){
            this.id = id;
        }
        public int getGrade () {
            return grade;
        }
        public void setGrade ( int grade){
            if (grade >= 0 && grade <= 100){
                this.grade = grade;
            }
            else
                System.out.println("Grade is a negative number");
        }



}