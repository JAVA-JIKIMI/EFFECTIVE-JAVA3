package effectivejava.chapter10.item74;

// 실패 상황을 온전히 포착하도록 수정해본 IndexOutOfBoundsException (405쪽)
public class IndexOutOfBoundsException extends RuntimeException {
    private final int lowerBound;
    private final int upperBound;
    private final int index;

    /**
     * IndexOutOfBoundsException을 생성한다.
     *
     * @param lowerBound 인덱스의 최솟값
     * @param upperBound 인덱스의 최댓값 + 1
     * @param index      인덱스의 실젯값
     */
    public IndexOutOfBoundsException(int lowerBound, int upperBound,
                                     int index) {
        // 실패를 포착하는 상세 메시지를 생성한다.
        super(String.format(
                "최솟값: %d, 최댓값: %d, 인덱스: %d",
                lowerBound, upperBound, index));

        // 프로그램에서 이용할 수 있도록 실패 정보를 저장해둔다.
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.index = index;
    }
}
