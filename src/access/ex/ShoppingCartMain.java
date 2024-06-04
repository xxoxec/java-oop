package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("콜라", 2000, 2);
        Item item2 = new Item("과자", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        // option/enter 해당 메서드 만들어 주는 단축키
        cart.displayItems();
    }
}
