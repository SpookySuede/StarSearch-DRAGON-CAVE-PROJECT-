import java.util.Scanner;

public class StarSearch {
    public static void main(String[] args){

        String statement =  "You are in a land full of dragons. In front of you,\n \n" +
                "you see two caves. In one cave, the dragon is friendly\n \n" +
                "and will share his treasure with you. The other dragon\n \n" +
                "is greedy and hungry and will eat you on site.\n \n";
                //this could have been concatenated however i didn't  quite see the need to do so
                //and this looks a lot cleaner/is easier to read.

        String response = "\n\nYou approach the cave...\n\n" +
                "It is dark and spooky...\n\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n\n" +
                "Gobbles you down in one bite!\n\n";

        System.out.print(statement);
        System.out.print("Which cave will you go into? (1 or 2)" + "\n\n");

        Scanner userInput = new Scanner(System.in);

        String input = userInput.nextLine();
        System.out.print(response);

    };

}
