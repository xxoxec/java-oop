package poly.basic;

// 자바16 -> Pattern Matching for instanceof, instanceof 사용 동시에 변수 선언
public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { // 변수 선언
            System.out.println("Child 인스턴스 맞음");
            // Child child = (Child) parent;
            // 인스턴스가 맞는 경우 직접 다운캐스팅 하는 코드를 생략 가능
            child.childMethod();
        }
    }
}
