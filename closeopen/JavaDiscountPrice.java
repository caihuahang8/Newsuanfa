package closeopen;

public class JavaDiscountPrice extends JavaCourse {
    public JavaDiscountPrice(Integer courseId, String courseName, Double coursePrice) {
        super(courseId, courseName, coursePrice);
    }

    public Double getOrignPrice(){
        return super.getCoursePrice();
    }
    @Override
    public Double getCoursePrice() {
        return super.getCoursePrice()*0.8;
    }
}
