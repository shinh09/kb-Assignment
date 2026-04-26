package student.todo.oop.p09;

import java.util.Scanner;

class ScoreManagerTodo {
    int[] scores;
    // TODO 1: setStudentCount(int count)
    public void setScores(int count) {
        this.scores = new int[count];
    }

    // TODO 2: inputScores(Scanner sc)
    public void inputScores(Scanner sc){

        for(int i=0;i<scores.length;i++){
            System.out.println((i+1)+"번째 학생 점수: ");
            scores[i] = sc.nextInt();
        }

    }
    // TODO 3: printScores()
    public void printScores(){
        int count = 1;
        for(int score: scores){
            System.out.println(count+"번 : "+score +"점");
            count ++;
        }
    }
    // TODO 4: analyze()
    public void analyze(){
        int sum = 0;
        for(int score: scores) sum += score;
        System.out.println("합: "+ sum);
    }

}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: ScoreManagerTodo와 Scanner를 이용한 메뉴형 프로그램 작성
        ScoreManagerTodo program= new ScoreManagerTodo();
        Scanner sc = new Scanner(System.in);
        System.out.println("학생수");
        int count = sc.nextInt();
        program.setScores(count);
        program.inputScores(sc);
        program.printScores();
        program.analyze();



    }
}
