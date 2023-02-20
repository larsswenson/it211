public class Course {
    private String courseNumber;
    private String courseTitle;

    public Course(String courseNumber, String courseTitle) {
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void printCourseInfo() {
        System.out.println("Course number: " + courseNumber);
        System.out.println("Course title: " + courseTitle);
    }
}








