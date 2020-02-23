package effectivejava.chapter8.item56;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// 문서화 주석 예 (333-341쪽)
public class DocExamples<E> {
    // 메서드 주석 (333-334쪽)
    /**
     * Returns the element at the specified position in this list.
     *
     * <p>This method is <i>not</i> guaranteed to run in constant
     * time. In some implementations it may run in time proportional
     * to the element position.
     *
     * @param  index index of element to return; must be
     *         non-negative and less than the size of this list
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= this.size()})
     */
    E get(int index) {
        return null;
    }
    // 한글 버전 (334쪽)
    // /**
    //  * 이 리스트에서 지정한 위치의 원소를 반환한다.
    //  *
    //  * <p>이 메서드는 상수 시간에 수행됨을 보장하지 <i>않는다</i>. 구현에 따라
    //  * 원소의 위치에 비례해 시간이 걸릴 수도 있다.
    //  *
    //  * @param  index 반환할 원소의 인덱스; 0 이상이고 리스트 크기보다 작아야 한다.
    //  * @return 이 리스트에서 지정한 위치의 원소
    //  * @throws IndexOutOfBoundsException index가 범위를 벗어나면,
    //  * 즉, ({@code index < 0 || index >= this.size()})이면 발생한다.
    //  */
    // E get(int index) {
    //     return null;
    // }


    // 자기사용 패턴 등 내부 구현 방식을 명확히 드러내기 위해 @implSpec 사용 (335쪽)
    /**
     * Returns true if this collection is empty.
     *
     * @implSpec This implementation returns {@code this.size() == 0}.
     *
     * @return true if this collection is empty
     */
    public boolean isEmpty() {
        return false;
    }
    // 한글 버전 (335쪽)
    // /**
    //  * 이 컬렉션이 비었다면 true를 반환한다.
    //  *
    //  * @implSpec 이 구현은 {@code this.size() == 0}의 결과를 반환한다.
    //  *
    //  * @return 이 컬렉션이 비었다면 true, 그렇지 않으면 false
    //  */
    // public boolean isEmpty() {
    //     return false;
    // }

    
    // 문서화 주석에 HTML이나 자바독 메타문자를 포함시키기 위해 @literal 태그 사용 (336쪽)
    /**
     * A geometric series converges if {@literal |r| < 1}.
     */
    public void fragment() {
    }
    // 한글 버전 (336쪽)
    // /**
    //  * {@literal |r| < 1}이면 기하 수열이 수렴한다.
    //  */
    // public void fragment() {
    // }

    // 문서화 주석 첫 '문장'에 마침표가 있을 때 요약 설명 처리 (337쪽)
    /**
     * A suspect, such as Colonel Mustard or {@literal Mrs. Peacock}.
     */
    public enum Suspect {
        MISS_SCARLETT, PROFESSOR_PLUM, MRS_PEACOCK, MR_GREEN, COLONEL_MUSTARD, MRS_WHITE
    }
    // 한글 버전 (337쪽)
    // /**
    //  * 머스타드 대령이나 {@literal Mrs. 피콕} 같은 용의자.
    //  */
    // public enum Suspect {
    //     MISS_SCARLETT, PROFESSOR_PLUM, MRS_PEACOCK, MR_GREEN, COLONEL_MUSTARD, MRS_WHITE
    // }


    // 자바독 문서에 색인 추가하기 - 자바 9부터 지원 (338쪽)
    /**
     * This method complies with the {@index IEEE 754} standard.
     */
    public void fragment2() {
    }
    // 한글 버전 (338쪽)
    // /**
    //  * 이 메서드는 {@index IEEE 754} 표준을 준수한다.
    //  */
    // public void fragment2() {
    // }

    
    // 열거 상수 문서화 (339-340쪽)
    /**
     * An instrument section of a symphony orchestra.
     */
    public enum OrchestraSection {
        /** Woodwinds, such as flute, clarinet, and oboe. */
        WOODWIND,

        /** Brass instruments, such as french horn and trumpet. */
        BRASS,

        /** Percussion instruments, such as timpani and cymbals. */
        PERCUSSION,

        /** Stringed instruments, such as violin and cello. */
        STRING;
    }
    // 한글 버전 (340쪽)
    // /**
    //  * 심포니 오케스트라의 악기 세션.
    //  */
    // public enum OrchestraSection {
    //     /** 플루트, 클라리넷, 오보 같은 목관악기. */
    //     WOODWIND,
    // 
    //     /** 프렌치 호른, 트럼펫 같은 금관악기. */
    //     BRASS,
    // 
    //     /** 탐파니, 심벌즈 같은 타악기. */
    //     PERCUSSION,
    // 
    //     /** 바이올린, 첼로 같은 현악기. */
    //     STRING;
    // }

    
    // 애너테이션 타입 문서화 (340쪽)
    /**
     * Indicates that the annotated method is a test method that
     * must throw the designated exception to pass.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface ExceptionTest {
        /**
         * The exception that the annotated test method must throw
         * in order to pass. (The test is permitted to throw any
         * subtype of the type described by this class object.)
         */
        Class<? extends Throwable> value();
    }
    // 한글 버전 (341쪽)
    // /**
    //  * 이 애너테이션이 달린 메서드는 명시한 예외를 던져야만 성공하는
    //  * 테스트 메서드임을 나타낸다.
    //  */
    // @Retention(RetentionPolicy.RUNTIME)
    // @Target(ElementType.METHOD)
    // public @interface ExceptionTest {
    //     /**
    //      * 이 애너테이션을 단 테스트 메서드가 성공하려면 던져야 하는 예외.
    //      * (이 클래스의 하위 타입 예외는 모두 허용된다.)
    //      */
    //     Class<? extends Throwable> value();
    // }
}

