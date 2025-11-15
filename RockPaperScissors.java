import java.util.Scanner;
public class RockPaperScissors 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter \n1 for Rock, \n2 for Paper, \n3 for Scissors\n");
        int player = sc.nextInt();

        int computer = 1 + (int)(Math.random() * 3);

        String[] moves = {"Rock", "Paper", "Scissors"};

        System.out.println("You chose: " + moves[player - 1]);
        System.out.println("Computer chose: " + moves[computer - 1]);

        if (player == computer) 
        {
            System.out.println("It's a draw!");
        } 
        else if ((player == 1 && computer == 3) ||
                   (player == 2 && computer == 1) ||
                   (player == 3 && computer == 2)) 
                   {
            System.out.println("You win!");
        } 
        else 
        {
            System.out.println("Computer wins!");
        }
    }
}
