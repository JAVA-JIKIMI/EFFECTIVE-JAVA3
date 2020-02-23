package effectivejava.chapter8.item55;

import java.util.*;

// 반환 타입으로 Optional<T> 사용하기 (327-328쪽)
public class Max {
//    // 코드 55-1 컬렉션에서 최댓값을 구한다. - 컬렉션이 비었으면 예외를 던진다. (327쪽)
//    public static <E extends Comparable<E>> E max(Collection<E> c) {
//        if (c.isEmpty())
//            throw new IllegalArgumentException("빈 컬렉션");
//
//        E result = null;
//        for (E e : c)
//            if (result == null || e.compareTo(result) > 0)
//                result = Objects.requireNonNull(e);
//
//        return result;
//    }

//    // 코드 55-2 컬렉션에서 최댓값을 구해 Optional<E>로 반환한다. (327쪽)
//    public static <E extends Comparable<E>>
//    Optional<E> max(Collection<E> c) {
//        if (c.isEmpty())
//            return Optional.empty();
//
//        E result = null;
//        for (E e : c)
//            if (result == null || e.compareTo(result) > 0)
//                result = Objects.requireNonNull(e);
//
//        return Optional.of(result);
//    }

    // 코드 55-3 컬렉션에서 최댓값을 구해 Optional<E>로 반환한다. - 스트림 버전 (328쪽)
    public static <E extends Comparable<E>>
    Optional<E> max(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(args);

        System.out.println(max(words));

        // 코드 55-4 옵셔널 활용 1 - 기본값을 정해둘 수 있다. (328쪽)
        String lastWordInLexicon = max(words).orElse("단어 없음...");
        System.out.println(lastWordInLexicon);
    }
}
