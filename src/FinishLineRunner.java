import java.util.*;

public class FinishLineRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Finish Line! Type in ready if you are ready to start!");
        String answer = scan.nextLine();
        while(!answer.equals("ready".toLowerCase())){
            answer = scan.nextLine();
        }
        Player player1 = new Player();
        Player player2 = new Player();
        while(player1.getSpace()!=10||player2.getSpace()!=10){
            System.out.println("Enter \"roll\" to roll player 1!");
            answer = scan.nextLine();
            while(!answer.equals("roll".toLowerCase())){
                answer = scan.nextLine();
            }
            int roll1 = (int) (Math.random()*6)+1;
            int roll2 = (int) (Math.random()*6)+1;
            System.out.println("You rolled " + roll1 + " and " + roll2);
            if(FinishLine.willMove(roll1,roll2,player1.getSpace())){
                player1.moveForward();
            }
            if(player1.getSpace()==10){
                break;
            }
            System.out.println("Enter \"roll\" to roll player 2!");
            answer = scan.nextLine();
            while(!answer.equals("roll".toLowerCase())){
                answer = scan.nextLine();
            }
            roll1 = (int) (Math.random()*6)+1;
            roll2 = (int) (Math.random()*6)+1;
            System.out.println("You rolled " + roll1 + " and " + roll2);
            if(FinishLine.willMove(roll1,roll2,player2.getSpace())){
                player2.moveForward();
            }
        }
        if(player1.getSpace()==10){
            System.out.println("Player 1 wins! Congratulations!");
        }
        if(player2.getSpace()==10){
            System.out.println("Player 2 wins! Congratulations!");
        }
    }
}
