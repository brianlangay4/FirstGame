import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        /*program starts here
        first  created name fetching input
        where a user can input the name
        and this name will be carried for some outputs later
         */
        System.out.println("Welcome input your name");
        Scanner input1 = new Scanner(System.in);
        String name = input1.nextLine();
        {
            //first name output
            System.out.println("welcome " + name);
        }
        //game start here
        System.out.println("Guessing number game");
        //giving  user option to either lay or not
        System.out.println("if you wish to play press1");
        //ii take the user option by scanner and work with it
        Scanner input2 = new Scanner(System.in);
        String c = input2.nextLine();
        /*first if statement used to direct user into a game or outside the game
        so first i used if statement then try catch block to handle typo
        then i continued by using other different statements to perform game options and redirection
         */
        if (c.equals("1")) {
            System.out.println("Game starts ");
            /* Loading
            here wth the use of try cath block exception and i created a loading pause
            user will hav eto wai for about 3000 milliseconds
            this is done by thread try catch control
             */
            try {
                System.out.println("loading.......");
                System.out.println("do not press anything please wait");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted Game error");
            }
            //welcoming a user to Start the game
            System.out.println("......................................");
            System.out.println("Guess 1 digit number press 1 if your ready");
        }
        //here we handle wrong input from a previous given option
        else {
            System.out.println("wrong input ");
            System.out.println("Exiting Game");
            System.out.println("--------------------------------------------");
        }
        {
            /*here i start to work with the game engine
            from now the input 3 scanner object will be working for first game
            inside here i created a little Algorithm by using aRandom number method
             */
            Scanner input3 = new Scanner(System.in);
            int d = input3.nextInt();
            if (d == (1)) {
                //i created three trial game input you can only guess three times
                System.out.println("........................");
                System.out.println("you have 3 trials to start guessing");
                System.out.println("**********************");
                System.out.println("guess the first number");

                Scanner input4 = new Scanner(System.in);
                int e = input4.nextInt();
                Random number1 = new Random();
                int min = 1;
                int max = 4;
                int i = number1.nextInt(max + min) + min;
                if (e == (i)) {
                    System.out.println("your guess was "+e);
                    System.out.println("the Random number was: "+i);
                    System.out.println("You won by the first guess");
                    System.out.println("correct Marvelous "+name);
                    System.out.println("champion");
                    System.out.println("-------------------------------------------");
                } else {
                    System.out.println("try again");
                    System.out.println("your guess was "+e);
                    System.out.println("2 trials left");
                    System.out.println("another guess ");
                    Scanner input5 = new Scanner(System.in);
                    int f = input5.nextInt();
                    if (f == (i)) {
                        System.out.println("your guess was "+e+","+f);
                        System.out.println("the Random number was: "+i);
                        System.out.println("correct Good Job"+name);
                        System.out.println("-------------------------------------------");
                    } else {
                        System.out.println("incorrect try again");
                        System.out.println("your guess was "+e+","+f);
                        System.out.println("1 trials left");
                        System.out.println("another guess ");
                        Scanner input6 = new Scanner(System.in);
                        int g = input6.nextInt();
                        if (g == (i)) {
                            System.out.println("your guess was "+e+","+f+","+g);
                            System.out.println("the Random number was: "+i);
                            System.out.println("correct  close win "+name);
                            System.out.println("-------------------------------------------");

                        } else {
                            System.out.println("incorrect your guess was "+e+","+f+","+g);
                            System.out.println("the Random number was: "+i);
                            System.out.println("you loose "+name);
                            System.out.println("better luck next Time");
                            System.out.println("-------------------------------------------");
                        }
                    }
                }
            }
        }
    }
}


