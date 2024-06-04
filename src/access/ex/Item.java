package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 아이템 이름, 상품명 반환
    public String getName() {
        return name;
    }

    // 합계 출력
    public int getTotalPrice() {
        return price * quantity;
    }
}
