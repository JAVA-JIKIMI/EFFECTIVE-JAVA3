package effectivejava.chapter8.item50;
import java.util.*;

// '불변'인 Period의 내부를 공격하는 두 가지 예 (303-305쪽)
public class Attacks {
    public static void main(String[] args) {
        // 코드 50-2 Period 인스턴스의 내부를 공격해보자. (303쪽)
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);  // p의 내부를 변경했다!
        System.out.println(p);

        // 코드 50-4 Period 인스턴스를 향한 두 번째 공격 (305쪽)
        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(78);  // p의 내부를 변경했다!
        System.out.println(p);
    }
}
