import java.lang.reflect.Array;
import java.util.Scanner;

class Blackjack {
    public static void main(String[] args) {
        int gameNumber = 0;
        int win = 0;
        int loss = 0;
        int tie = 0;
        int runGame = 1;
        int inputNumber = 1;
        P1Random rng = new P1Random();
        Scanner scanner = new Scanner(System.in);
        while (runGame == 1) {
            int totalPlayer = 0;
            gameNumber++;
            System.out.println("START GAME #" + gameNumber);
            while (inputNumber == 1) {
                int myNumber = rng.nextInt(13) + 1;
                if (myNumber < 11 && myNumber > 1) {
                    System.out.println("\n" + "Your card is a " + myNumber + "!");
                    totalPlayer += myNumber;
                    System.out.println("Your hand is: " + totalPlayer);
                } else if (myNumber == 1) {
                    System.out.println("\n" + "Your card is a ACE!");
                    totalPlayer += myNumber;
                    System.out.println("Your hand is: " + totalPlayer);
                } else if (myNumber == 11) {
                    System.out.println("Your card is a JACK!");
                    totalPlayer += 10;
                    System.out.println("Your hand is: " + totalPlayer);
                } else if (myNumber == 12) {
                    System.out.println("\n" + "Your card is a QUEEN!");
                    totalPlayer += 10;
                    System.out.println("Your hand is: " + totalPlayer);
                } else if (myNumber == 13) {
                    System.out.println("\n" + "Your card is a KING!");
                    totalPlayer += 10;
                    System.out.println("Your hand is: " + totalPlayer);
                }
                //This block first determines a number from the random number generator,
                //then it displays the number or name of face card,
                //and finally it adds it to the total hand of the player.

                if (totalPlayer < 21) {
                    System.out.println("\n" + "1. Get another card");
                    System.out.println("2. Hold hand");
                    System.out.println("3. Print statistics");
                    System.out.println("4. Exit");
                    System.out.print("\n" + "Choose an option: ");

                    inputNumber = scanner.nextInt();
                    //If the player does not have over 21 yet, they may play using the menu.
                    while (inputNumber < 1 || inputNumber > 4) {
                        System.out.println("\n" + "Invalid input!");
                        System.out.println("Please enter an integer value between 1 and 4.");

                        System.out.println("\n" + "1. Get another card");
                        System.out.println("2. Hold hand");
                        System.out.println("3. Print statistics");
                        System.out.println("4. Exit");
                        System.out.print("\n" + "Choose an option: ");

                        inputNumber = scanner.nextInt();
                    }
                    //Should the player enter something that is not an integer between 1 and 4,
                    //this error message will appear, and the menu will be displayed again.

                    if (inputNumber == 3) {
                        double percentWins = ((win * 100) / (gameNumber - 1));
                        System.out.println("\n" + "Number of Player wins: " + win);
                        System.out.println("Number of Dealer wins: " + loss);
                        System.out.println("Number of tie games: " + tie);
                        System.out.println("Total # of games played is: " + (gameNumber - 1));
                        System.out.println("Percentage of Player wins: " + percentWins + "%");

                        System.out.println("\n" + "1. Get another card");
                        System.out.println("2. Hold hand");
                        System.out.println("3. Print statistics");
                        System.out.println("4. Exit");
                        System.out.print("\n" + "Choose an option: ");

                        inputNumber = scanner.nextInt();
                    }
                    //If the player's input is 3, the current version of the code will display its game's statistics.
                } else if (totalPlayer == 21) {
                    System.out.println("\n" + "BLACKJACK! You win!" + "\n");
                    win++;
                    break;
                }
                //Should the player have a hand of 21, the code will display that the player wins,
                //add an integer to player wins and subsequently restart from the top.
                else if (totalPlayer > 21) {
                    System.out.println("\n" + "You exceeded 21! You lose." + "\n");
                    loss++;
                    break;
                }
            }
            if (inputNumber == 2) {
                int dealerNumber = rng.nextInt(11) + 16;
                if (dealerNumber == totalPlayer) {
                    System.out.println("\n" + "Dealer's hand: " + dealerNumber);
                    System.out.println("Your hand is: " + totalPlayer);
                    System.out.println("\n" + "It's a tie! No one wins!" + "\n");
                    tie++;
                    inputNumber = 1;
                    totalPlayer = 0;
                    dealerNumber = 0;
                    continue;
                } else if (dealerNumber > 21) {
                    System.out.println("\n" + "Dealer's hand: " + dealerNumber);
                    System.out.println("Your hand is: " + totalPlayer);
                    System.out.println("\n" + "You win!" + "\n");
                    win++;
                    inputNumber = 1;
                    totalPlayer = 0;
                    dealerNumber = 0;
                    continue;
                } else if (dealerNumber > totalPlayer) {
                    System.out.println("\n" + "Dealer's hand: " + dealerNumber);
                    System.out.println("Your hand is: " + totalPlayer);
                    System.out.println("\n" + "Dealer wins!" + "\n");
                    loss++;
                    inputNumber = 1;
                    totalPlayer = 0;
                    dealerNumber = 0;
                    continue;
                } else if (dealerNumber < totalPlayer) {
                System.out.println("\n" + "Dealer's hand: " + dealerNumber);
                System.out.println("Your hand is: " + totalPlayer);
                System.out.println("\n" + "You win!" + "\n");
                win++;
                inputNumber = 1;
                totalPlayer = 0;
                dealerNumber = 0;
                continue;
            }
            }
            if (inputNumber == 4) {
                runGame = 0;
            }
        }
    }
}