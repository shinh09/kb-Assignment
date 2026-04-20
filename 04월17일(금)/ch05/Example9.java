package ch05;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = null;
        int max =0;
        int sum =0;
        while(true){
            System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
            System.out.print("선택>");
            int num = sc.nextInt();
            if(num==1){
                System.out.print("학생수>");
                int student = sc.nextInt();
                scores = new int[student]; //스코어 리스트 초기화
            } else if(num==2){
                for(int i=0;i<scores.length;i++){
                    System.out.printf("scores[%d] : ",i);
                    int score= sc.nextInt();
                    scores[i] = score;
                }
            } else if(num==3){
                for(int i=0;i<scores.length;i++){
                    System.out.printf("scores[%d] :%d\n",i,scores[i]);
                    //분석 같이 처리
                    sum += scores[i];
                    if(scores[i]>max){
                        max = scores[i];
                    }
                }
            } else if(num==4){

                System.out.println("최고점수:"+ max);
                System.out.println("평균점수:"+(double)sum/scores.length );
            }

            else{
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
