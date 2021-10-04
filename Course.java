package Project.CGPA;

public class Course {

    private String name = "";
    private double credit = 0.0;
    private double grade;
    private String letterGrade = "";
    private static double totalCreditEarned = 0;


    public Course() {

    }

    public Course(String name, double credit, double grade) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {

        switch (grade) {

            case 0 -> this.grade = 4.0;
            case 1 -> this.grade = 3.7;
            case 2 -> this.grade = 3.3;
            case 3 -> this.grade = 3.0;
            case 4 -> this.grade = 2.7;
            case 5 -> this.grade = 2.3;
            case 6 -> this.grade = 2.0;
            case 7 -> this.grade = 1.7;
            case 8 -> this.grade = 1.3;
            case 9 -> this.grade = 1.0;
            case 10 -> this.grade = 0;
        }

    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(int grade) {

        switch (grade) {

            case 0 -> this.letterGrade = "A";
            case 1 -> this.letterGrade = "A-";
            case 2 -> this.letterGrade = "B+";
            case 3 -> this.letterGrade = "B";
            case 4 -> this.letterGrade = "B-";
            case 5 -> this.letterGrade = "C+";
            case 6 -> this.letterGrade = "C";
            case 7 -> this.letterGrade = "C-";
            case 8 -> this.letterGrade = "D+";
            case 9 -> this.letterGrade = "D";
            case 10 ->this.letterGrade = "F";
        }

    }

    public static double getTotalCreditEarned() {
        return totalCreditEarned;
    }

    public static void setTotalCreditEarned(double totalCreditEarned) {
        Course.totalCreditEarned = totalCreditEarned;
    }

    public String toString() {

        return  "\n         " + name +
                "                   " + credit +
                "                   " + grade +
                "                                  " + letterGrade +
                "\n----------------------------------------------------------------------------------------------"

                ;

    }
}
