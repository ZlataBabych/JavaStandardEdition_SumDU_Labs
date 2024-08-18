import java.util.Random;

public class Subject {
    private String nameSubject;
    private float mark;
    private boolean passed;

    public Subject(String nameSubject) {
        this.nameSubject = nameSubject;
        this.mark = generateMark();
        this.passed = this.mark > 2;
    }

    private float generateMark() {
        return 2 + new Random().nextInt(4); // Генеруємо оцінку від 2 до 5
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public float getMark() {
        return mark;
    }

    public boolean isPassed() {
        return passed;
    }

    public enum Subjects {
        MATH, PHYSICS, CHEMISTRY, BIOLOGY, COMPUTER_SCIENCE
    }
}
