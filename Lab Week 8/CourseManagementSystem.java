
class Course {
    protected String courseID;
    protected String courseTitle;
    protected int creditHours;

    public Course(String courseID, String courseTitle, int creditHours) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public void showCourseDetails() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Title: " + courseTitle);
        System.out.println("Credit Hours: " + creditHours);
    }
}


class OnlineCourse extends Course {
    private String platformName;
    private String instructor;
    private int durationWeeks;

    public OnlineCourse(String courseID, String courseTitle, int creditHours, String platformName, String instructor, int durationWeeks) {
        super(courseID, courseTitle, creditHours);
        this.platformName = platformName;
        this.instructor = instructor;
        this.durationWeeks = durationWeeks;
    }

    @Override
    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Platform: " + platformName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration (weeks): " + durationWeeks);
    }
}

class OnsiteCourse extends Course {
    private String location;
    private String classroomNumber;
    private String instructor;

    public OnsiteCourse(String courseID, String courseTitle, int creditHours, String location, String classroomNumber, String instructor) {
        super(courseID, courseTitle, creditHours);
        this.location = location;
        this.classroomNumber = classroomNumber;
        this.instructor = instructor;
    }

    @Override
    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Location: " + location);
        System.out.println("Classroom Number: " + classroomNumber);
        System.out.println("Instructor: " + instructor);
    }
}


class Feedback {
    public void submitFeedback(String comment) {
        System.out.println("Feedback submitted: " + comment);
    }

    public void submitFeedback(int rating) {
        System.out.println("Feedback rating submitted: " + rating + " stars");
    }

    public void submitFeedback(String comment, int rating) {
        System.out.println("Detailed Feedback: " + comment + " (Rating: " + rating + " stars)");
    }
}

// Main class
public class CourseManagementSystem {
    public static void main(String[] args) {
        // Upcasting to base class
        Course course1 = new OnlineCourse("OC101", "Java Programming", 3, "Udemy", "Alice Smith", 6);
        Course course2 = new OnsiteCourse("OS202", "Database Systems", 4, "Campus A", "Room 204", "Dr. John Doe");

        System.out.println("Online Course Details:");
        course1.showCourseDetails(); 
        System.out.println("\nOnsite Course Details:");
        course2.showCourseDetails(); 

        System.out.println("\n--- Feedback Demonstration ---");

        Feedback feedback = new Feedback();
        feedback.submitFeedback("Great course, very detailed!");
        feedback.submitFeedback(5);
        feedback.submitFeedback("Loved the instructor and content", 5);
    }
}
