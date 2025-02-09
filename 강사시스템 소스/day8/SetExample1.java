package day8;
import java.util.*;
public class SetExample1 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.add("자바"));//t
        System.out.println(set.add("카푸치노"));//t
        System.out.println(set.add("에스프레소"));//t
        System.out.println(set.add("자바"));//f
        System.out.println("저장된 데이터의 수 = " + set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
