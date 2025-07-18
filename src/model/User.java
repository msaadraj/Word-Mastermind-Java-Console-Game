package src.model;
import java.util.Scanner;
import java.util.InputMismatchException;

public class User {
    private static Scanner sc = new Scanner(System.in);

    private String name, difficulty;
    private int length;
    private int highscore;

    public  User (String name, String difficulty, int length, int highscore) {
        this.name = name;
        this.difficulty = difficulty;
        this.length = length;
        this.highscore = highscore;
    }

    public static int choosLength(){                // Length Validation
        int length;
        while (true) {
            try { 
            System.out.print("Choose word length (4 / 5 / 6) >  ");
            length = sc.nextInt();
            if(length < 4 || length > 6){
            System.out.println("Invalid choice! Please enter a number between 4 and 6.\n");
            }
            else 
            return length;
            }catch (InputMismatchException e) {
            System.out.println("Symbols/Letters are not allowed.\n");
            sc.next();
            continue;
            }
        }
    }                       // Lentgth Validation

    public static String chooseDifficulty(){           // Difficulty Validation
        String difficulty;
        while (true) {                      // Start While-Loop
        System.out.print("Choose difficulty (Easy / Medium / Hard) >  ");
        difficulty = sc.nextLine().toLowerCase().trim();
        if(difficulty.isEmpty()){
        System.out.println("Field can not be Empty !!\n");
        continue;
        }
        else if(difficulty.equals("medium") || difficulty.equals("hard") || difficulty.equals("easy")){
        return difficulty;
        }
        else
        System.out.println("Invalid input! Please choose only from: Easy, Medium, or Hard.\n");
        continue;
        }            // End While-Loop
    }                           // Difficulty Validation
    
    public static String nameValidation(){          // Name Validation
        
        System.out.println("\n==========================================");
        System.out.println("            LET THE GAME BEGIN!            ");
        System.out.println("==========================================\n");
        String name;
        while (true) {                      // Start While-Loop
        System.out.print("Enter Your Name >  ");
        name = sc.nextLine().trim();
        if(name.isEmpty()){
        System.out.println("Field can not be Empty !!\n");
        continue;
        }
        else if (name.matches("[a-zA-Z0-9 ]+( [a-zA-Z0-9]+)*") && name.length() >= 3 && name.length() <= 15){
        break;
        }
        else
        System.out.println("Invalid name! Use maximum 3 - 15 characters: letters, numbers, and single spaces between words only.\n");
        continue;
        }       // End While-Loop
        return name;
    }                       // Name Validation
    
    
        public void playerInfo(){
        System.out.println("Player: " + name + " | Difficulty: " + difficulty + " | Word Length: " + length + " | Your Score: " + highscore );
        }

    }

