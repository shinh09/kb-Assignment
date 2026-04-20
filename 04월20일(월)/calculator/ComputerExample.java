package calculator;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        double result = computer1.areaCircle(5.0);
        System.out.printf("Computer1의 결과 : %.2f\n",result);

        Calculator computer2 = new Calculator();
        double result2 = computer2.areaCircle(10.0);
        System.out.printf("Computer2의 결과 : %.2f\n",result2);
    }
}
