public class Student
{
    private String name;
    private int absenceCount;

    public Student(String name, int absenceCount)
    {
        this.name = name;
        this.absenceCount = absenceCount;
    }

    public String getName()
    {
        return name;
    }

    public int getAbsenceCount()
    {
        return absenceCount;
    }


}