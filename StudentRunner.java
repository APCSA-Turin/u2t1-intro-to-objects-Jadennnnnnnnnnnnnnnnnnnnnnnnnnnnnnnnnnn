public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Dylan", 94.24, 96.78, 87.33, false);
        Student student2 = new Student("Jimmy", 75.23, 77.8, 88.59, true);

        student1.grades();
        student1.GPA();
        student1.athlete();

        student2.grades();
        student2.GPA();
        student2.athlete();
    }
}
