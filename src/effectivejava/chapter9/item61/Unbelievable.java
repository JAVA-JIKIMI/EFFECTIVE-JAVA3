package effectivejava.chapter9.item61;

// 코드 61-3 기이하게 동작하는 프로그램 - 결과를 맞혀보자! (360쪽)
public class Unbelievable {
    static Integer i;

    public static void main(String[] args) {
        if (i == 42)
            System.out.println("믿을 수 없군!");
    }
}
