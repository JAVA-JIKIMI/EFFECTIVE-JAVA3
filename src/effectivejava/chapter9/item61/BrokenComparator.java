package effectivejava.chapter9.item61;
import java.util.*;

// 코드 61-1 잘못 구현된 비교자 - 문제를 찾아보자! (359쪽)
public class BrokenComparator {
    public static void main(String[] args) {

//        Comparator<Integer> naturalOrder =
//                (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

       // 코드 61-2 문제를 수정한 비교자 (359쪽)
        Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
            int i = iBoxed, j = jBoxed; // 오토박싱
            return i < j ? -1 : (i == j ? 0 : 1);
        };

        int result = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(result);
    }
}
