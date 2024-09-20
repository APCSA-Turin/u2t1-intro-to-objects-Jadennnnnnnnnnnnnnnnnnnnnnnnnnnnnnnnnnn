
import java.text.DecimalFormat;

public class Student {
    private final double preCalcGrade;
    private final double APCSAGrade;
    private final double physicsGrade;
    private final boolean sportsTeam;
    public final String name;

    public Student(String studentName, double studentPreCalcGrade, double studentAPCSAGrade, double studentPhysicsGrade, boolean onSportsTeam) {
        name = studentName;
        preCalcGrade = studentPreCalcGrade;
        APCSAGrade = studentAPCSAGrade;
        physicsGrade = studentPhysicsGrade;
        sportsTeam = onSportsTeam;
    }

    public void GPA() {
        double GPA = (preCalcGrade + APCSAGrade * 1.1 + physicsGrade) / 3;
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println(name + "'s GPA is " + df.format(GPA));
    }

    public void athlete() {
        if (sportsTeam) {
            System.out.println(name + " is on a sports team");
        } else {
            System.out.println(name + " is not on a sports team");
        }
    }

    public void grades() {
        System.out.println(name + " has a " + preCalcGrade + " in Pre-Calc, a " + APCSAGrade + " in APCSA and a " + physicsGrade + " in Physics");
    }
}
