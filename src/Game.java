package src;
import src.model.User;
import src.service.GameLogic;
import src.service.GameService;
import src.service.HighscoreService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private static Scanner sc = new Scanner(System.in);

    public static void welome(){
    System.out.println("\n==========================================\n        WELCOME TO WORD MASTERMIND        \n==========================================\n");
    System.out.println("1)  Start New Game\n2)  View High Scores\n3)  Instructions/How to Play\n4)  Settings\n5)  Credits\n6)  Exit\n");    
    }

    public static void main(String[] args){
        GameService gameService = new GameService();
        GameLogic g = new GameLogic();
        String userMainMenu = " ";
        int getLength = 0;
        String getDifficulty = " ";
        welome();
        while (true) {
            try {
            System.out.print("Enter Here >    ");
            userMainMenu = sc.nextLine().trim();
            if (userMainMenu.isEmpty()){  
            System.out.println("Field can not be Empty !!\n");
            continue;
            }
            else if (!userMainMenu.matches("[1-7]")){ 
            System.out.println("Enter only the number b/w (0 - 7).\n");
            continue;
            }
            else {
            switch (userMainMenu){
                case "1":                 // Start Game
                int highScore = 0;
                System.out.println("\nStarting..........");
                String getName = User.nameValidation();             // Calling Name Validation Method
                getDifficulty = User.chooseDifficulty();         // Calling Difficulty Validation Method
                getLength = User.choosLength();                  // Calling Length Validation Method
                g.getCategory();
                g.wordList(getLength);
                switch (getDifficulty) {
                    case "easy": 
                    highScore = g.modEasy(getLength);
                    break;
                    case "medium":
                    highScore = g.modMedium(getLength);
                    break;
                    default:
                    highScore = g.modHard(getLength);
                    break;
                }
                User user = new User(getName, getDifficulty, getLength, highScore);
                HighscoreService.saveHighScore(getName, getDifficulty, getLength, highScore);
                System.out.println("-------------------------------------------------------------");
                user.playerInfo();
                System.out.println("-------------------------------------------------------------\n");
                welome();
                continue;

                case "2":                 // View high Score
                HighscoreService.viewHighScores();
                welome();
                continue;

                case "3":                // Instrution
                gameService.Instructions();
                welome();
                continue;

                case "4":                 // Settings
                System.out.println("\nSettings are not available yet.\n");
                welome();
                continue;

                case "5":                 // Credits
                gameService.Credits();
                welome();
                continue;

                default :                 // Exit
                System.out.println("Thank you for playing! Goodbye!");
                System.exit(0);
                break;

            }
            }
            } catch (InputMismatchException e) {
            System.out.println("Symbols/Letters are not allowed.");
            sc.next();
            continue;
            }
        }
    }
}

