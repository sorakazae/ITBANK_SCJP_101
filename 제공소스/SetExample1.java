package day8;
import java.util.*;
public class SetExample1 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.add("�ڹ�"));//t
        System.out.println(set.add("īǪġ��"));//t
        System.out.println(set.add("����������"));//t
        System.out.println(set.add("�ڹ�"));//f
        System.out.println("����� �������� �� = " + set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
