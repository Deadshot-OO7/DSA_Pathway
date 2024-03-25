package Oops;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.course = new Course();
        Course c = s1.course;
        c.setTitle("CS");
        c.setLevel("UnderGrad");
        c.setStartDate("10/10/2024");



        s1.setName("Nick");
        s1.setDateOfBirth("03/08/1993");
        s1.setHasStudentHousing(true);

        System.out.println("Name :- " + s1.getName());
        System.out.println("DoB :- "+ s1.getDateOfBirth());
        System.out.println("Has Student housing :- "+(s1.getHasStudentHousing()?"Yes":"No"));

        System.out.println(c.getTitle() + " " + c.getLevel() + " " + c.getStartDate());
    }

}
