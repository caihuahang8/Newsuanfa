package closeopen;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountPrice(96,"java课程",100d);
        JavaDiscountPrice javaDiscountPrice = new JavaDiscountPrice(96,"java课程",100d);
        System.out.println("课程Id"+iCourse.getCourseId()+"课程名字"+iCourse.getCourseName()+
                "课程价格"+iCourse.getCoursePrice());
    }
}
