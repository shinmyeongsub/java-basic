package ref;

public class Method2 {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        initStudent(student1, "학생1", 15, 90);

//        Student student2 = new Student();
//        initStudent(student2, "학생2", 20, 95);

        Student student3 = createStudent("학생3", 11, 80);
        Student student4 = createStudent("학생4", 14, 84);

//        printStudent(student1);
//        printStudent(student2);
        printStudent(student3);
        printStudent(student4);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
    }
}
