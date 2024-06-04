package access;

public class BankAccount {

    // 데이터 필드는 외부에 직접 노출 하지 않음, BankAccount가 제공하는 메서드를 통해서만 접근 가능
    private  int balance;

    // command/n 생성자 단축키
    public BankAccount() {
        balance = 0;
    }

    // public method: deposit 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public method: withdraw 출금
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public method: getBalance 잔액확인
    public int getBalance() {
        return balance;
    }

    // 정상적인 입금 금액인지 확인하는 로직
    // 입력 금액을 검증하는 기능은 내부에서만 필요, 따라서 private사용
    private boolean isAmountValid(int amount) {
        // 금액이 0 보다 커야함
        return amount > 0;
    }
}
