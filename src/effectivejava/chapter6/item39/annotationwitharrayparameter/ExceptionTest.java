package effectivejava.chapter6.item39.annotationwitharrayparameter;
import java.lang.annotation.*;

// 코드 39-6 배열 매개변수를 받는 애너테이션 타입 (242쪽)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Exception>[] value();
}
