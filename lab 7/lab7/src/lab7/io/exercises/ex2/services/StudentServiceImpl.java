package lab7.io.exercises.ex2.services;


import lab7.io.exercises.ex2.dto.Student;

public class StudentServiceImpl implements StudentService {

    private Student[] students = new Student[1];
    private LoggingService service = new LoggingService();

    @Override
    public Student save(Student student) {
        students[0] = student;
        service.log("Student with code " + student.getCode() + " was successfully added");
        return student;
    }

    @Override
    public void delete(Student student) {
        if (students[0].equals(student)) {
            students[0] = null;
            service.log("Student with code " + student.getCode() + " was successfully deleted");
        }
    }
}
