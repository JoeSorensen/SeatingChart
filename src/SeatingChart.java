import java.util.List;


public class SeatingChart {

    private Student[][] seats;


    public SeatingChart(List<Student> studentList, int rows, int cols) {
        seats = new Student[rows][cols];
        int listIndex = 0;
        for (int i = 0; i < seats[0].length; i++) {
            for (int j = 0; j < seats.length; j++) {
                if (listIndex >= studentList.size())
                    seats[j][i] = null;
                else
                    seats[j][i] = studentList.get(listIndex);
                listIndex++;
            }
        }
    }


    public int removeAbsentStudents(int allowedAbsences) {
        int removed = 0;
        for (int i = 0; i < seats[0].length; i++) {
            for (int j = 0; j < seats.length; j++) {
                if (seats[j][i] == null)
                    break;
                else if (seats[j][i].getAbsenceCount() > allowedAbsences) {
                    seats[j][i] = null;
                    removed++;
                }
            }
        }
        return removed;
    }


    public void printSeatingChart() {
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                if (seats[r][c] != null)
                    System.out.print(seats[r][c].getName() + seats[r][c].getAbsenceCount() + "\t\t");
                else
                    System.out.print("null" + "\t\t");
            }
            System.out.println();
        }
    }

    public String getSeatInfo(int r, int c) {
        if (seats[r][c] != null)
            return seats[r][c].getName() + seats[r][c].getAbsenceCount();
        else
            return null;
    }
}