package student.todo.oop.p10;

class AccountTodo {
    String ano;
    String owner;
    public int balance;

    // TODO 1: 생성자 작성
    public AccountTodo(String ano, String owner, int balance){
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
}

public class MainTodo {
    static AccountTodo[] accountArray = new AccountTodo[100];
    // TODO 2: createAccount(String ano, String owner, int balance)
    void createAccount(String ano, String owner, int balance){
        for(int i=0; i<accountArray.length; i++){
            if(accountArray[i] == null){
                accountArray[i] = new AccountTodo(ano, owner, balance);
                break;
            }
        }
    }
    // TODO 3: findAccount(String ano)
    AccountTodo findAccount(String ano){
        for(AccountTodo a : accountArray){
            if(a != null && a.ano.equals(ano)) return a;
        }
        return null;
    }
    // TODO 4: deposit(String ano, int money)
    void deposit(String ano, int money){
        AccountTodo a = findAccount(ano);
        if(a == null) { System.out.println("계좌 없음"); return; }
        a.balance += money;
        System.out.println("입금 후 잔액: " + a.balance);
    }
    // TODO 5: withdraw(String ano, int money)
    void withdraw(String ano, int money){
        AccountTodo a = findAccount(ano);
        if(a == null) { System.out.println("계좌 없음"); return; }
        if(a.balance < money) { System.out.println("잔액 부족"); return; }
        a.balance -= money;
        System.out.println("출금 후 잔액: " + a.balance);
    }
    public static void main(String[] args) {
        // TODO 6: 계좌 생성, 예금, 출금 후 결과 출력
        MainTodo bank = new MainTodo();

        bank.createAccount("001", "홍길동", 10000);
        bank.createAccount("002", "고길동", 50000);

        bank.deposit("001", 5000);   // 15000
        bank.withdraw("001", 3000);  // 12000
        bank.withdraw("002", 60000); // 잔액 부족

        AccountTodo a = bank.findAccount("001");
        System.out.println(a.owner + " 최종잔액: " + a.balance);

    }
}
