public class Main {
    public static void main(String[] args) {
        Subject.Subjects[] subjects = Subject.Subjects.values();
        Student[] students = new Student[5];

        students[0] = new Student("Zlata", "Babych", "Group 11", subjects);
        students[1] = new Student("Bodya", "Dashko", "Group 11", subjects);
        students[2] = new Student("Alice", "Kanapalova", "Group 11", subjects);
        students[3] = new Student("Anna", "Sokolova", "Group 11", subjects);
        students[4] = new Student("Zina", "Chernenko", "Group 11", subjects);

        for (Student student : students) {
            P.rintln("Студент: " + student.getName() + " " + student.getSurname() + ", Група: " + student.getGroup());
            P.rintln("Оцінки:");
            for (Subject subject : student.getSubjects()) {
                P.rintln(subject.getNameSubject() + ": " + subject.getMark() + (subject.isPassed() ? " (Здано)" : " (Не здано)"));
            }
            float averageMark = student.getAverageMark();
            P.rintln("Середній бал: " + averageMark);
            if (averageMark == 5.0) {
                P.rintln("Підвищена стипендія");
            } else if (averageMark >= 4.0) {
                P.rintln("Звичайна стипендія");
            } else {
                P.rintln("Стипендія не нараховується");
            }
            P.rintln("");
        }

        P.rintln("Найуспішніша дисципліна: " + Utils.getTheBestSubject(students));
        P.rintln("Найуспішніший студент: " + Utils.getTheBestStudent(students).getName() + " " + Utils.getTheBestStudent(students).getSurname());
    }
}
