package access.ex;

public class MaxCounter {
    // 이 클래스는 최대값을 지정하고 최대값 까지만 증가하는 기능을 제공

    private int count = 0; // 내부에서 사용하는 숫자, 초기값 0
    private int max; // 최대값, 생성자를 통해 입력

    public MaxCounter(int max) {
        this.max = max;
    }

    // 숫자를 하나 증가
    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행 로직
        count++;
    }

    // 지금까지 증가한 값을 반환
    public int getCount() {
        return count;
    }
}
