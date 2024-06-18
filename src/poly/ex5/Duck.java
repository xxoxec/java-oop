package poly.ex5;

public class Duck implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("꽉꽉");
    }

    @Override
    public void move() {
        System.out.println("꽉꽉 이동");
    }
}
