import java.lang.reflect.Method;

public class SortTestHelper {

    private SortTestHelper(){}

    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {

        assert rangeL <= rangeR;

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++)
            arr[i] = new Integer((int)(Math.random() * (rangeR - rangeL + 1) + rangeL));
        return arr;
    }

    // 打印arr数组的所有内容
    public static void printArray(Object arr[]) {

        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] );
            System.out.print( ' ' );
        }
        System.out.println();

        return;
    }

    public static void testSort2(String sortClassName, Comparable[] arr){

        // 通过Java的反射机制，通过排序的类名，运行排序函数
        // * 依然是，使用反射机制并不是这个课程的重点, 大家也完全可以使用自己的方式书写代码, 最终只要能够测试出自己书写的算法的效率即可
        // * 推荐大家阅读我在问答区向大家分享的一个学习心得: 【学习心得分享】请大家抓大放小，不要纠结于C++语言的语法细节
        // * 链接: http://coding.imooc.com/learn/questiondetail/4100.html
        try{
            // 通过sortClassName获得排序函数的Class对象
            Class sortClass = Class.forName(sortClassName);
            // 通过排序函数的Class对象获得排序方法
            Method sortMethod = sortClass.getMethod("sort",new Class[]{Comparable[].class});
            // 排序参数只有一个，是可比较数组arr
            Object[] params = new Object[]{arr};

            long startTime = System.currentTimeMillis();
            // 调用排序函数
            sortMethod.invoke(null,params);
            long endTime = System.currentTimeMillis();


            System.out.println( sortClass.getSimpleName()+ " : " + (endTime-startTime) + "ms" );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
