package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // 자식 변수가 부모 인스턴스 참조, 자식은 부모를 담을 수 없다, 컴파일 오류
        // Child Child1 = new Parent();

        // 자식의 기능은 호출 할 수 없다, 첨파일 오류
        // poly.childMethod();
    }
}
