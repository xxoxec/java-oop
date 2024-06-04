package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10]; // 아이템을 10개까지 담을 수 있는 배열
    private int itemCount;

    public void addItem(Item item) {
        // 검증 로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        // 정상 로직
        items[itemCount] = item;
        itemCount++;
        // items[itemCount++] = item;
    }

    /*
    장바구니 삼품 출력
    상품명:콜라, 합계:4000
    상품명:과자, 합계:12000
    전체 가격 합계:16000
     */
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) { // itemCount 만큼만 돌아야됨
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합계:" + calculateTotalPrice());
    }

    // 전체 가격 합계
    // 이 메서드 내부에서만 사용되므로 private 접근 제어자 사용
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            // option/command/v 배열 변수 만들기 단축키
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
