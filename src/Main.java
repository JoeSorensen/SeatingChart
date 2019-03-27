import java.util.ArrayList;
import java.util.List;


public class Main
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Karen", 3) );
        studentList.add(new Student("Liz", 1) );
        studentList.add(new Student("Paul", 4) );
        studentList.add(new Student("Lester", 1) );
        studentList.add(new Student("Henry", 5) );
        studentList.add(new Student("Renee", 9) );
        studentList.add(new Student("Glen", 2) );
        studentList.add(new Student("Fran", 6) );
        studentList.add(new Student("David", 1) );
        studentList.add(new Student("Danny", 3) );

        SeatingChart sc = new SeatingChart(studentList, 3, 4);

        System.out.println("Testing for part A");
        sc.printSeatingChart();
        System.out.println();

        System.out.println("Testing for part B");
        System.out.println("Students removed = " + sc.removeAbsentStudents(4) );;
        sc.printSeatingChart();
    }
}