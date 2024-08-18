public class Student {
    private int id; // ідентифікаційний номер
    private static int nextId = 1; // Статичне поле для збереження наступного ID
    private String name;
    private String surname;
    private String group;
    private Subject[] subjects; // Масив предметів, які вивчав студент за семестр

    public Student() {
        this.id = nextId++;
        this.subjects = new Subject[5]; // Ініціалізація масиву для 5 предметів
    }

    public Student(String name, String surname, String group, Subject.Subjects[] subjectNames) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.group = group;
        // масив предметів (Subject [] subjects), які вивчав студент за семестр
        // (кількість предметів 5)
        this.subjects = new Subject[5];
        for (int i = 0; i < 5; i++) {
            this.subjects[i] = new Subject(subjectNames[i].name());
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        if(subjects.length == 5) {
            this.subjects = subjects;
        } else {
            throw new IllegalArgumentException("Кількість предметів повинна бути 5.");
        }
    }

    // Метод для розрахунку середнього балу
    public float getAverageMark() {
        float sum = 0;
        for (Subject subject : subjects) {
            sum += subject.getMark();
        }
        if(subjects.length == 0) {
            return 0;
        }
        return sum / subjects.length;
    }
}
