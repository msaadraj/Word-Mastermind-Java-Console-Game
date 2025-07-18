package src.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import src.model.User;
import java.util.Scanner;
import java.util.List;

public class GameLogic {
    private ArrayList<Character> secretWord = new ArrayList<>();
    private ArrayList<Character> userWord;
    private ArrayList<String> words;
    private ArrayList<Character> dash = new ArrayList<>();
    private static String catRan;
    private String hint;
    private Scanner sc = new Scanner(System.in); 
    private Random r;
    private int points; // Points for the game

    public void getCategory(){          // Method to get a random hint category
    r = new Random();
    ArrayList<String> ranCat = new ArrayList<>(Arrays.asList("Technology", "Animals", "Countries", "Fruits", "Sports"));
    catRan = ranCat.get(r.nextInt(ranCat.size()));

    }

    public void wordList(int length){
        HashSet subCat = new HashSet<>();       // Stores Sub-Categories
        List<String> subCatList;
        r = new Random();
        words = new ArrayList<>();     // Stores the all words of each category
        hint = "";           // Stores Rndom Hint Sub-Vategory
        
        switch (length) {        // Switch Case for Length
            case 4:                                                   // Length 4
            switch (catRan) {
            case "Technology":
            subCat = new HashSet<>(Arrays.asList("Search Engine", "Programming Language", "Social Media", "Electcronics"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Search Engine":
                words.addAll(Arrays.asList("bing"));
                break;
                case "Programming Language":
                words.addAll(Arrays.asList("java", "lisp", "ruby", "perl", "bash", "vhdl"));
                break;
                case "Social Media":
                words.addAll(Arrays.asList("xing", "yubo", "vero", "tiki"));
                break;
                default:
                words.addAll(Arrays.asList("sony", "acer", "roku", "dell", "jvcs"));
                break;
            }
            break;
            case "Animals":
            subCat = new HashSet<>(Arrays.asList("Wild Animal", "Aquatic Creature", "Insect", "Bird"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Wild Animal":
                words.addAll(Arrays.asList("lion", "wolf", "bear", "boar", "deer", "lynx"));
                break;
                case "Aquatic Creature":
                words.addAll(Arrays.asList("crab", "tuna", "bass", "goby"));
                break;
                case "Insect":
                words.addAll(Arrays.asList("flea","gnat", "wasp", "bugs", "ants", "moth"));
                break;
                default:
                words.addAll(Arrays.asList("crow", "kiwi", "tern", "lark", "dove"));
                break;
            }
            break;
            case "Countries":
            subCat = new HashSet<>(Arrays.asList("Bordering Pakistan", "Island Nation", "European Nation", "Asian Country"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Bordering Pakistan":
                words.addAll(Arrays.asList("iran"));
                break;
                case "Island Nation":
                words.addAll(Arrays.asList("fiji", "niue", "cuba", "mali"));
                break;
                case "European Nation":
                words.addAll(Arrays.asList("italy"));
                break;
                default:
                words.addAll(Arrays.asList("oman", "iraq", "iran", "laos"));
                break;
            }
            break;
            case "Fruits":
            subCat = new HashSet<>(Arrays.asList("Citrus Fruit", "Tropical Fruit", "Red Fruit", "Dry Fruit"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Citrus Fruit":
                words.addAll(Arrays.asList("ugli", "lime"));
                break;
                case "Tropical Fruit":
                words.addAll(Arrays.asList("date", "figs"));
                break;
                case "Red Fruit":
                words.addAll(Arrays.asList("plum"));
                break;
                default:
                words.addAll(Arrays.asList("alms"));
                break;
            }
            break;
            default:
            subCat = new HashSet<>(Arrays.asList("Water Sport", "Martial Art", "Ball Game", "Olympic Sport"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Water Sport":
                words.addAll(Arrays.asList("surf","dive", "raft", "swim", "sail"));
                break;
                case "Martial Art":
                words.addAll(Arrays.asList("kali", "judo", "wing"));
                break;
                case "Ball Game":
                words.addAll(Arrays.asList("polo", "golf", "hand", "bowl"));
                break;
                default:
                words.addAll(Arrays.asList("judo"));
                break;
            }
            break;
        }
            break;                                      // Length 4 break

            case 5:                                     // Length 5
            switch (catRan) {
            case "Technology":
            subCat = new HashSet<>(Arrays.asList("Search Engine", "Programming Language", "Social Media", "Electcronics"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Search Engine":
                words.addAll(Arrays.asList("qwant"));
                break;
                case "Programming Language":
                words.addAll(Arrays.asList("scala"));
                break;
                case "Social Media":
                words.addAll(Arrays.asList("tumblr"));
                break;
                default:
                words.addAll(Arrays.asList("diode", "cable", "relay"));
                break;
            }
            break;
            case "Animals":
            subCat = new HashSet<>(Arrays.asList("Wild Animal", "Aquatic Creature", "Insect", "Bird"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Wild Animal":
                words.addAll(Arrays.asList("tiger", "zebra", "hyena", "bison", "lemur", "tapir", "otter", "sloth", "koala", "dingo", "quoll", "panda", "moose", "mole", "skunk"));
                break;
                case "Aquatic Creature":
                words.addAll(Arrays.asList("shark","whale","trout", "eagle","squid","eelus","skate","coral", "mollu","guppy", "clown"));
                break;
                case "Insect":
                words.addAll(Arrays.asList("midge", "louse", "antsy", "drone", "fleas", "bugsy", "cicad", "beetl", "termi", "waspz"));
                break;
                default:
                words.addAll(Arrays.asList("eagle", "heron", "robin", "raven", "egret", "finch", "stork", "crane", "larky", "owlet"));
                break;
            }
            break;
            case "Countries":
            subCat = new HashSet<>(Arrays.asList("Bordering Pakistan", "Island Nation", "European Nation", "Asian Country"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Bordering Pakistan":
                words.addAll(Arrays.asList("india", " china"));
                break;
                case "Island Nation":
                words.addAll(Arrays.asList("malta", "palau", "japan", "tonga", "haiti", "nauru", "samoa"));
                break;
                case "European Nation":
                words.addAll(Arrays.asList("spain","malta","italy"));
                break;
                default:
                words.addAll(Arrays.asList("india", "nepal", "japan", "china", "syria", "yemen"));
                break;
            }
            break;
            case "Fruits":
            subCat = new HashSet<>(Arrays.asList("Citrus Fruit", "Tropical Fruit", "Red Fruit", "Dry Fruit"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Citrus Fruit":
                words.addAll(Arrays.asList("lemon"));
                break;
                case "Tropical Fruit":
                words.addAll(Arrays.asList("mango", "guava", "papaw", "ackee"));
                break;
                case "Red Fruit":
                words.addAll(Arrays.asList("apple", "plums", "grape", "guava", "prune"));
                break;
                default:
                words.addAll(Arrays.asList("dates", "prune"));
                break;
            }
            break;
            default:
            subCat = new HashSet<>(Arrays.asList("Water Sport", "Martial Art", "Ball Game", "Olympic Sport"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Water Sport":
                words.addAll(Arrays.asList("scuba", "canoe", "kayak", "yacht", "skiff", "rafts"));
                break;
                case "Martial Art":
                words.addAll(Arrays.asList("kendo", "kempo", "sambo", "boxer"));
                break;
                case "Ball Game":
                words.addAll(Arrays.asList("rugby", "hoops", "bowls"));
                break;
                default:
                words.addAll(Arrays.asList("rugby", "canoe", "kayak", "hoops"));
                break;
            }
            break;
        }
            break;                           // Length 5 break
            
            default:                    // Length 6
            switch (catRan) {
            case "Technology":
            subCat = new HashSet<>(Arrays.asList("Search Engine", "Programming Language", "Social Media", "Electcronics"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Search Engine":
                words.addAll(Arrays.asList("google", "yandex", "excite"));
                break;
                case "Programming Language":
                words.addAll(Arrays.asList("python", "kotlin", "groovy", "elixir", "pascal"));
                break;
                case "Social Media":
                words.addAll(Arrays.asList("reddit", "tumblr", "parler", "rumble"));
                break;
                default:
                words.addAll(Arrays.asList("sensor", "diodes", "remote", "switch", "relays"));
                break;
            }
            break;
            case "Animals":
            subCat = new HashSet<>(Arrays.asList("Wild Animal", "Aquatic Creature", "Insect", "Bird"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Wild Animal":
                words.addAll(Arrays.asList("jaguar", "cougar", "bobcat", "ocelot"));
                break;
                case "Aquatic Creature":
                words.addAll(Arrays.asList("salmon", "shrimp", "turtle"));
                break;
                case "Insect":
                words.addAll(Arrays.asList("beetle", "cicada", "hornet", "locust"));
                break;
                default:
                words.addAll(Arrays.asList("herons", "parrot", "egrets", "pigeon", "quails"));
                break;
            }
            break;
            case "Countries":
            subCat = new HashSet<>(Arrays.asList("Island Nation", "European Nation", "Asian Country"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Island Nation":
                words.addAll(Arrays.asList("malawi", "cyprus", "taiwan", "fijian"));
                break;
                case "European Nation":
                words.addAll(Arrays.asList("france", "sweden", "latvia", "serbia", "poland", "greece"));
                break;
                default:
                words.addAll(Arrays.asList("jordan", "bhutan", "taiwan", "israel", "turkey"));
                break;
            }
            break;
            case "Fruits":
            subCat = new HashSet<>(Arrays.asList("Citrus Fruit", "Tropical Fruit", "Red Fruit", "Dry Fruit"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Citrus Fruit":
                words.addAll(Arrays.asList("orange", "pomelo", "citron", "kaffir"));
                break;
                case "Tropical Fruit":
                words.addAll(Arrays.asList("papaya", "banana", "durian", "lychee", "cocona", "longan"));
                break;
                case "Red Fruit":
                words.addAll(Arrays.asList("cherry", "tomato", "raisin", "redbud"));
                break;
                default:
                words.addAll(Arrays.asList("almond", "cashew", "raisin", "prunes", "walnut", "nutmeg"));
                break;
            }
            break;
            default:
            subCat = new HashSet<>(Arrays.asList("Water Sport", "Martial Art", "Ball Game", "Olympic Sport"));
            subCatList = new ArrayList<>(subCat);
            hint =  subCatList.get(r.nextInt(subCatList.size()));
            switch (hint) {
                case "Water Sport":
                words.addAll(Arrays.asList("diving", "rowing", "sailing", "wading", "rafted", "jetski"));
                break;
                case "Martial Art":
                words.addAll(Arrays.asList("karate", "boxing", "aikido", "kungfu", "taichi", "savate"));
                break;
                case "Ball Game":
                words.addAll(Arrays.asList("soccer", "tennis", "hockey", "squash", "boccia"));
                break;
                default:
                words.addAll(Arrays.asList("boxing", "rowing", "racing", "vaults", "sailed"));
                break;
            }
            break;
        }
            break;
        }
    }

    private static boolean isValidInput(String input, int length) { 
    if (input.isEmpty()) {
                System.out.println("Field cannot be empty. Please enter a valid guess.\n");
                return false;
    }
            if (!input.matches("[a-zA-Z]+")) {
                System.out.println("Invalid input! Please enter only letters.\n");
                return false;
            }
            if(input.length() != length) {
                System.out.println("Invalid input! Please enter a word with exactly "+length+" letters.\n");
                return false;
    }
    return true;
}

    public int modEasy(int length){                                            // Method Length 4
    points = 100; // Points for the game
    userWord = new ArrayList<>();      // Stores User Input in Character ArrayList
    dash = new ArrayList<>();
    for (int i = 0; i < length; i++) {      // Adding Dashes to the dash ArrayList
        dash.add('_');
    }
    System.out.println("\n-------------------------------------------------------------");
    System.out.println("Instructions for Easy Mode:\n" +
    "- You have 10 attempts to find the correct word.\n" +
    "- The category of the word will be given at the start.\n" +
    "- After each guess:\n" +
    "    - Correct letters in the correct position will be shown.\n" +
    "    - Letters that are in the word but in the wrong position will also be indicated.\n" +
    "- After 3 wrong attempts, a hint will be provided to assist you.\n" +
    "- Scoring System:\n" +
    "    - You start with a base score of 100 points.\n" +
    "    - Each wrong attempt deducts 5 points.\n" +
    "    - Using a hint deducts 10 additional points.");
    System.out.println("-------------------------------------------------------------\n");
        secretWord.clear(); // Clear previous secret word
        String randomSecretWord = words.get(r.nextInt(words.size())).toLowerCase().trim();       // Random Secret Word from the list
        for (char c : randomSecretWord.toCharArray()) {
            secretWord.add(c);
        }
        
        int attempts = 10;
        int wrong = 0; // Counter for wrong attempts
        String userInput = "";
        System.out.println("Secret Word has been generated. You have " + attempts + " attempts to guess it.\n");
        do { 
            System.out.println("Your current score is: " + points);
            System.out.print("Attempt " + (11 - attempts) + "/10 | Category : " + catRan + " | Enter your " + length + "-letter word   ");
            String st = dash.toString().replace(",", "").replace("[", "").replace("]", "");
            for (char c : st.toCharArray()) {
                System.out.print(c + " ");
            }
            System.out.print("   >    ");
            userInput = sc.nextLine().trim();
            wrong++;
            
            boolean validInput = isValidInput(userInput, length);
            if (!validInput) {
                continue; // Skip to the next iteration if input is invalid
            }

            if(userInput.equals(randomSecretWord)) {
                wrong--; // Decrease wrong attempts if guessed correctly
                System.out.println("\nCongratulations! You've guessed the word: " + randomSecretWord + " in " + (11 - attempts) + " attempts | Wrong Attempts: " + wrong);
                break;
            }
            else if (!userInput.equals(randomSecretWord)){
            System.out.println("\nIncorrect guess! Try again.");
            points -= 5; // Deduct points for wrong attempt
            }
            System.out.println("-------------------------------------------------------------");

            for(char c : userInput.toCharArray()) {         // Stroing user Input in Character ArrayList
                userWord.add(c);
            }
            
            for (int i = 0; i < userWord.size(); i++) {
                if (secretWord.contains(userWord.get(i))) {
                    if (secretWord.get(i).equals(userWord.get(i))) {
                        dash.set(i, userWord.get(i)); // Correct letter in the correct position
                        System.out.println("Letter '" + userWord.get(i) + "' is in the correct position.");
                    } else {
                        System.out.println("Letter '" + userWord.get(i) + "' is in the word but in the wrong position.");
                    }
                } else {
                    System.out.println("Letter '" + userWord.get(i) + "' is not in the word.");
                }
            }
            userWord.clear();           // Clear userWord for the next attempt
            attempts--;
            System.out.println("-------------------------------------------------------------");
            System.out.println("5 points deducted for wrong attempt.\n");
            if (wrong == 3) { // Provide hint after 3 wrong attempts 
                System.out.print("Do you want a hint of 10 points? (yes/no) >    ");
                String hintResponse = sc.nextLine().trim().toLowerCase();
                if(hintResponse.matches("yes|y")) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Hint: The word is related to " + hint + ".");
                System.out.println("-------------------------------------------------------------");  
                System.out.println("10 points deducted for hint.\n");
                points -= 10; // Deduct points for using a hint
                }
                else {
                    System.out.println("No hint provided.");
                }
            }
        }while (attempts != 0 && !userInput.equals(secretWord)); 
       
        if (attempts == 0) {
    System.out.println("-------------------------------------------------------------");
            System.out.println("Sorry, you've run out of attempts. The secret word was: " + randomSecretWord);
    System.out.println("-------------------------------------------------------------");   
}
 return points;
    }

    public int modMedium(int length){
    points = 150; // Points for the game
    userWord = new ArrayList<>();      // Stores User Input in Character ArrayList
    dash = new ArrayList<>();
    for (int i = 0; i < length; i++) {      // Adding Dashes to the dash ArrayList
        dash.add('_');
    }
    System.out.println("-------------------------------------------------------------");
    System.out.println("Instructions for Medium Mode:\n" +
    "- You have 7 attempts to find the correct word.\n" +
    "- The category of the word will be given at the start.\n" +
    "- Feedback will guide you:\n" +
    "    - Correct-position letters are marked clearly.\n" +
    "    - Misplaced but correct letters are highlighted.\n" +
    "- After 3 wrong attempts, a hint will be provided to assist you.\n" +
    "- Scoring System:\n" +
    "    - You start with a base score of 150 points.\n" +
    "    - Each wrong attempt deducts 10 points.\n" +
    "    - Using a hint deducts 20 additional points.");
    System.out.println("-------------------------------------------------------------\n");

        secretWord.clear(); // Clear previous secret word
        String randomSecretWord = words.get(r.nextInt(words.size())).toLowerCase().trim();       // Random Secret Word from the list
        for (char c : randomSecretWord.toCharArray()) {
            secretWord.add(c);
        }
        
        int attempts = 7;
        int wrong = 0; // Counter for wrong attempts
        String userInput = "";
        System.out.println("Secret Word has been generated. You have " + attempts + " attempts to guess it.\n");
        do { 
            System.out.println("Your current score is: " + points);
            System.out.print("Attempt " + (8- attempts) + "/7 | Category : " + catRan + " | Enter your " + length + "-letter word   ");
            String st = dash.toString().replace(",", "").replace("[", "").replace("]", "");
            for (char c : st.toCharArray()) {
                System.out.print(c + " ");
            }
            System.out.print("   >    ");
            userInput = sc.nextLine().trim();
            wrong++;
            
            boolean validInput = isValidInput(userInput, length);
            if (!validInput) {
                continue; // Skip to the next iteration if input is invalid
            }

            if(userInput.equals(randomSecretWord)) {
                wrong--; // Decrease wrong attempts if guessed correctly
                System.out.println("\nCongratulations! You've guessed the word: " + randomSecretWord + " in " + (8 - attempts) + " attempts | Wrong Attempts: " + wrong);
                break;
            }
            else if (!userInput.equals(randomSecretWord)){
            System.out.println("\nIncorrect guess! Try again.");
            points -= 10; // Deduct points for wrong attempt
            }
            System.out.println("-------------------------------------------------------------");

            for(char c : userInput.toCharArray()) {         // Stroing user Input in Character ArrayList
                userWord.add(c);
            }
            
            for (int i = 0; i < userWord.size(); i++) {
                if (secretWord.contains(userWord.get(i))) {
                    if (secretWord.get(i).equals(userWord.get(i))) {
                        dash.set(i, userWord.get(i)); // Correct letter in the correct position
                        System.out.println("Letter '" + userWord.get(i) + "' is in the correct position.");
                    } else {
                        System.out.println("Letter '" + userWord.get(i) + "' is in the word but in the wrong position.");
                    }
                }
            }
            userWord.clear();           // Clear userWord for the next attempt
            attempts--;
            System.out.println("-------------------------------------------------------------");
            System.out.println("10 points deducted for wrong attempt.\n");
            if (wrong == 3) { // Provide hint after 3 wrong attempts 
                System.out.print("Do you want a hint of 10 points? (yes/no) >    ");
                String hintResponse = sc.nextLine().trim().toLowerCase();
                if(hintResponse.matches("yes|y")) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Hint: The word is related to " + hint + ".");
                System.out.println("-------------------------------------------------------------");  
                System.out.println("20 points deducted for hint.\n");
                points -= 20; // Deduct points for using a hint
                }
                else {
                    System.out.println("No hint provided.");
                }
            }
        }while (attempts != 0 && !userInput.equals(secretWord)); 
       
        if (attempts == 0) {
    System.out.println("-------------------------------------------------------------");
            System.out.println("Sorry, you've run out of attempts. The secret word was: " + randomSecretWord);
    System.out.println("-------------------------------------------------------------");
    }
    return points;        
    }                       // Method Mode Medium

    public int modHard(int length){
    points = 200; // Points for the game
    userWord = new ArrayList<>();      // Stores User Input in Character ArrayList
    dash = new ArrayList<>();
    for (int i = 0; i < length; i++) {      // Adding Dashes to the dash ArrayList
        dash.add('_');
    }
    System.out.println("-------------------------------------------------------------");
    System.out.println("Instructions for Hard Mode:\n" +
    "- You have 5 attempts to find the correct word.\n" +
    "- The category of the word will be given at the start.\n" +
    "- Feedback is minimal:\n" +
    "    - Only correct letters in the correct position will be shown.\n" +
    "- After 3 wrong attempts, a hint will be provided to assist you.\n" +
    "- Scoring System:\n" +
    "    - You start with a base score of 200 points.\n" +
    "    - Each wrong attempt deducts 15 points.\n" +
    "    - Using a hint deducts 30 additional points.");
    System.out.println("-------------------------------------------------------------\n");

        secretWord.clear(); // Clear previous secret word
        String randomSecretWord = words.get(r.nextInt(words.size())).toLowerCase().trim();       // Random Secret Word from the list
        for (char c : randomSecretWord.toCharArray()) {
            secretWord.add(c);
        }
        
        int attempts = 5;
        int wrong = 0; // Counter for wrong attempts
        String userInput = "";
        System.out.println("Secret Word has been generated. You have " + attempts + " attempts to guess it.\n");
        do { 
            System.out.println("Your current score is: " + points);
            System.out.print("Attempt " + (6 - attempts) + "/5 | Category : " + catRan + " | Enter your " + length + "-letter word   ");
            String st = dash.toString().replace(",", "").replace("[", "").replace("]", "");
            for (char c : st.toCharArray()) {
                System.out.print(c + " ");
            }
            System.out.print("   >    ");
            userInput = sc.nextLine().trim();
            wrong++;
            boolean validInput = isValidInput(userInput, length);
            if (!validInput) {
                continue; // Skip to the next iteration if input is invalid
            }
            if(userInput.equals(randomSecretWord)) {
                wrong--; // Decrease wrong attempts if guessed correctly
                System.out.println("\nCongratulations! You've guessed the word: " + randomSecretWord + " in " + (6 - attempts) + " attempts | Wrong Attempts: " + wrong);
                break;
            }
            else if (!userInput.equals(randomSecretWord)){
            System.out.println("\nIncorrect guess! Try again.");
            points -= 15; // Deduct points for wrong attempt
            }
            System.out.println("-------------------------------------------------------------");

            for(char c : userInput.toCharArray()) {         // Stroing user Input in Character ArrayList
                userWord.add(c);
            }
            
            for (int i = 0; i < userWord.size(); i++) {
                if (secretWord.contains(userWord.get(i))) {
                    if (secretWord.get(i).equals(userWord.get(i))) {
                        dash.set(i, userWord.get(i)); // Correct letter in the correct position
                        System.out.println("Letter '" + userWord.get(i) + "' is in the correct position.");
                    }
                } 
            }
            userWord.clear();           // Clear userWord for the next attempt
            attempts--;
            System.out.println("-------------------------------------------------------------");
            System.out.println("15 points deducted for wrong attempt.\n");
            if (wrong == 3) { // Provide hint after 3 wrong attempts 
                System.out.print("Do you want a hint of 10 points? (yes/no) >    ");
                String hintResponse = sc.nextLine().trim().toLowerCase();
                if(hintResponse.matches("yes|y")) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Hint: The word is related to " + hint + ".");
                System.out.println("-------------------------------------------------------------");  
                System.out.println("30 points deducted for hint.\n");
                points -= 30; // Deduct points for using a hint
                }
                else {
                    System.out.println("No hint provided.");
                }
            }
        }while (attempts != 0 && !userInput.equals(secretWord)); 
       
        if (attempts == 0) {
    System.out.println("-------------------------------------------------------------");
            System.out.println("Sorry, you've run out of attempts. The secret word was: " + randomSecretWord);
    System.out.println("-------------------------------------------------------------");
        }
    return points;
    }                       // Method Mode Medium

                }
