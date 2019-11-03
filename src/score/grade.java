package score;

public class grade {
    public static String GRADE;

    public static String GetGradeScored(double number) {
        if (number >= 90) {
            GRADE = "A";
        } else if (number >= 80 && number < 90) {
            GRADE = "B";
        } else if (number >= 70 && number < 80) {
            GRADE = "C";
        } else if (number >= 60 && number < 70) {
            GRADE = "D";
        } else if (number < 60) {
            GRADE = "E";
        }


        return GRADE;
    }
}


