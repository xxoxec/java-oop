package poly.ex6;

public class Duck extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꽉꽉");
    }

    @Override
    public void fly() {
        System.out.println("오리 날기");
    }
}

