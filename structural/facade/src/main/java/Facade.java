public class Facade {
    private ClassRoom classRoom;
    private Student student;
    private Teacher teacher;

    public Facade(String studentName, String teacherName){
        this.classRoom = new ClassRoom();
        this.student = new Student(studentName, true);
        this.teacher = new Teacher(teacherName, true);
        this.classRoom.setOpen(true);
    }

    public void startLecture(){
        this.classRoom.getClassState();
        this.teacher.activateTeacher();
        this.student.activateStudent();
    }
}
