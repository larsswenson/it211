public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("IT211", "Object Oriented Programming");
        course.printCourseInfo();

        OfferedCourse offeredCourse = new OfferedCourse("IT211", "Object Oriented Programming", "Byungcheon Ko", "Online", "5:00 PM - 7:20 PM");
        offeredCourse.printCourseInfo();
    }
}
