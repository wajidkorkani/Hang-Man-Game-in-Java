import java.util.Scanner;
public class hangMan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chance = 5;
        int number = 20;
        while(chance > 0){
            System.out.print(chance < 5 ? "Try again:" : "Guess the number:");
            int answer = input.nextInt();
            if(number == answer){
                System.out.println("Right answer");
                System.out.println("You won");
                chance = 0;
            }else if(answer != number && chance < 0){
                System.out.println("You lost!");
                chance = 0;
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