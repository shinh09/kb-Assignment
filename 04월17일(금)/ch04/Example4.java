package ch04;
import java.util.*;
public class Example4 {
    public static void main(String[] args) {

        while(true){
            int a = (int)(Math.random()*6)+1;
            int b = (int)(Math.random()*6)+1;
            System.out.println("1:"+a+", 2:"+b);
            if(a+b==5){
                break;
            }
        }
    }
}
