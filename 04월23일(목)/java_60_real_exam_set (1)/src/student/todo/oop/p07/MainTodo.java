package student.todo.oop.p07;

class AccountTodo {
    // TODO 1: private balance 필드
    // TODO 2: MIN_BALANCE, MAX_BALANCE 상수 선언
    // TODO 3: getBalance()
    // TODO 4: setBalance(int balance)
    // 범위 밖이면 기존 값 유지
    private int balance;

    final int MIN_BALANCE =0;
    final int MAX_BALANCE = 1000000000;
    public void getBalance() {
        System.out.println("현재잔액: "+ balance);
    }

    public void setBalance(int balance) {
        if(balance <= MAX_BALANCE && balance >= MIN_BALANCE){
            this.balance = balance;
            System.out.println("잔액업데이트: "+ balance);
        }else{
            System.out.println("오류발생");
        }

    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: AccountTodo 객체 생성 후 set/get 테스트
        AccountTodo account = new AccountTodo();
        account.getBalance();
        account.setBalance(-1234);
        account.setBalance(20000);
        account.getBalance();
    }
}
