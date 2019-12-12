package closeopen;

public class JavaCourse implements ICourse {

    private Integer courseId;
    private String courseName;
    private Double coursePrice;

    public JavaCourse(Integer courseId, String courseName, Double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    @Override
    public Integer getCourseId() {
        return this.courseId;
    }

    @Override
    public String getCourseName() {
        return this.courseName;
    }

    @Override
    public Double getCoursePrice() {
        return this.coursePrice;
    }
}
