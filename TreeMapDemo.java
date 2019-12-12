import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import jdk.nashorn.internal.runtime.options.LoggingOption;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import sun.reflect.generics.tree.VoidDescriptor;

import java.io.Serializable;
import java.util.*;
import java.util.logging.Logger;


public class TreeMapDemo  {
    @Data
    class DTO implements Comparable<DTO>, Serializable{
        private Integer id;
        public DTO(Integer id) {
            this.id = id;
        }
        public int compareTo(DTO o) {
            return id - o.id;
        }
    }


   public    void testTwoId(){

        List<DTO> list = new ArrayList<DTO>();
        for (int i = 5 ; i > 0; i--){
            list.add(new DTO(i));
        }
        Collections.sort(list);
        Logger logger = Logger.getLogger("TreeMapDemo");

        logger.info(JSONArray.toJSONString(list));

    }

    public void testTwoComparable() {
        // 第一种排序，从小到大排序，实现 Comparable 的 compareTo 方法进行排序
        Logger logger = Logger.getLogger("testTwoComparable");
        List<DTO> list = new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            list.add(new DTO(i));
        }
        Collections.sort(list);
        logger.info(JSON.toJSONString(list));

        // 第二种排序，从大到小排序，利用外部排序器 Comparator 进行排序
        Comparator comparator = (Comparator<DTO>) (o1, o2) -> o2.getId() - o1.getId();
        List<DTO> list2 = new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            list2.add(new DTO(i));
        }
        Collections.sort(list,comparator);
        logger.info(JSON.toJSONString(list2));
    }

    public static void main(String[] args) {
        TreeMapDemo treeMapDemo =new TreeMapDemo();
        treeMapDemo.testTwoId();
    }

}
