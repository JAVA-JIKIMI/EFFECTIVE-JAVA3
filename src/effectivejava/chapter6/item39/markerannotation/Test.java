package effectivejava.chapter6.item39.markerannotation;
import java.lang.annotation.*;

// 코드 39-1 마커(marker) 애너테이션 타입 선언 (238쪽)
import java.lang.annotation.*;

/**
 * 테스트 메서드임을 선언하는 애너테이션이다.
 * 매개변수 없는 정적 메서드 전용이다.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
