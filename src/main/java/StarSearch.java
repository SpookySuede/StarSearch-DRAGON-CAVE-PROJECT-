import java.util.Scanner;

public class StarSearch {
    public static void main(String[] args){
        String statement =  "You are in a land full of dragons. In front of you,\n \n" +
                "you see two caves. In one cave, the dragon is friendly\n \n" +
                "and will share his treasure with you. The other dragon\n \n" +
                "is greedy and hungry and will eat you on site.\n \n";
                //this could have been concatenated however i didn't  quite see the need to do so
                //and this looks a lot cleaner/is easier to read.

        Scanner userInput = new Scanner(System.in); //initiate scanner

        System.out.print(statement); //print initial statement
        boolean loopFinish = false;

        while(!loopFinish) {
           loopFinish = loop(userInput);
        }
    }
    public static String resp = "\n\nYou approach the cave...\n\n" +
            "It is dark and spooky...\n\n" +
            "A large dragon jumps out in front of you! He opens his jaws and...\n\n" +
            "Gobbles you down in one bite!\n\n";
   public static String respTwo = "\n\nYou approach the cave...\n\n" +
            "It is bright and shimmery...\n\n" +
            "A large dragon jumps out in front of you! He opens his jaws and...\n\n" +
            "Tells me that man had his crystal palace and became bored with it. He tells me the gold is mine but it won't make me happy. He leaves.\n\n";

    public static boolean loop(Scanner userInput) {
        System.out.print("Which cave will you go into? (1 or 2)" + "\n\n"); //present user choice
        try{
            int input = Integer.parseInt(userInput.nextLine());
            if(input == 1){
                System.out.print(resp);
                return true;
            } else if(input == 2){
                System.out.print(respTwo);
                return true;
            }
        } catch(Exception e) {
            System.out.println("Caught Exception: Input must be a number.");
        }
        return false;
    }
}
