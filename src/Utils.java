public class Utils {
    public static String getTheBestSubject(Student[] students) {
        float maxAverage = 0;
        String bestSubject = "";

        for (Subject.Subjects subjectEnum : Subject.Subjects.values()) {
            float sum = 0;
            int count = 0;
            for (Student student : students) {
                for (Subject subject : student.getSubjects()) {
                    if (subject.getNameSubject().equals(subjectEnum.name())) {
                        sum += subject.getMark();
                        count++;
                    }
                }
            }
            float average = sum / count;
            if (average > maxAverage) {
                maxAverage = average;
                bestSubject = subjectEnum.name();
            }
        }

        return bestSubject;
    }

    public static Student getTheBestStudent(Student[] students) {
        Student bestStudent = null;
        float maxAverage = 0;

        for (Student student : students) {
            float average = student.getAverageMark();
            if (average > maxAverage) {
                maxAverage = average;
                bestStudent = student;
            }
        }

        return bestStudent;
    }
}
