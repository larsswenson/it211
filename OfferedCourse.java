class OfferedCourse extends Course {
    private String instructorName;
    private String location;
    private String classTime;

    public OfferedCourse(String courseNumber, String courseTitle, String instructorName, String location, String classTime) {
        super(courseNumber, courseTitle);
        this.instructorName = instructorName;
        this.location = location;
        this.classTime = classTime;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    @Override
    public void printCourseInfo() {
        super.printCourseInfo();
        System.out.println("Instructor name: " + instructorName);
        System.out.println("Location: " + location);
        System.out.println("Class time: " + classTime);
    }
}
