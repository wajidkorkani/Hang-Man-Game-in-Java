import java.util.Scanner;
import java.util.Random;
public class hangMan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int chance = 5;
        int number = random.nextInt(101);
        while(chance > 0){
            System.out.print(chance < 5 ? "Try again:" : "Guess the number:");
            int answer = input.nextInt();
            input.nextLine(); // to fix the classic java issue which skips the input for next line after nextInt.z
            if(number == answer){
                System.out.println("Right answer");
                System.out.println("You won");
                System.out.print("Would you like to play again? ");
                String playAgain = input.nextLine().toLowerCase();
                System.out.println(playAgain);
                if(playAgain.equals("yes")){
                    chance = 6;
                    number = random.nextInt(101);
                    break;
                }else{
                    System.out.println("Thanks for playing the game and good luck for next time.");
                }
            }else if(answer != number && chance <= 1){
                System.out.println("You lost!");
                System.out.print("Would you like to play again? ");
                String tryAgain = input.nextLine().toLowerCase();
                System.out.println(tryAgain);
                if(tryAgain.equals("yes")){
                    chance = 6;
                    number = random.nextInt(101);
                    break;
                }else{
                    System.out.println("Thanks for playing the game and good luck for next time.");
                }
            }else{
                
                if(answer < number && answer + 3 >= number ||answer > number && answer - 3 <= number){
                    System.out.println("Almost there");
                }else if(answer < number && answer + 5 >= number || answer > number && answer - 5 <= number){
                    System.out.println("You are close");
                }else{
                    System.out.println("Wrong answer");
                }
            }
            chance --;
        }
    }
}
