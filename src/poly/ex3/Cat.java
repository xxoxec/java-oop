package poly.ex3;

public class Cat extends AbstractAnimal{

    // 추상 메서드는 반드시 오버라이딩 해야 함
    // 자식에서 오버라이딩 메서드를 만들지 않으면 컴파일 오류 발생
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}