package calculator;

public class Computer extends Calculator {
    public double areaCircle(double r) { //<---시그니처
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI *r *r;
    }
}
