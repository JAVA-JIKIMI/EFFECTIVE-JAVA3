package effectivejava.chapter6.item39.repeatableannotation;

import java.lang.annotation.*;

// 코드 39-8 반복 가능한 애너테이션 타입 (243-244쪽)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionTestContainer.class)
public @interface ExceptionTest {
    Class<? extends Throwable> value();
}
