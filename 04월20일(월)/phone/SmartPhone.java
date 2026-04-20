package phone;

public class SmartPhone extends Phone {
    SmartPhone(){
        super();
    } //아래처럼 오버로딩이 있는경우 디폴트 생성자가 만들어 지지 않는다
    SmartPhone(String model, String color){
        super(model,color);

    }

}
