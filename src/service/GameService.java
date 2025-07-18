package src.service;

public class GameService {
    public void Instructions(){

System.out.println("\n==========================================\n           INSTRUCTIONS           \n==========================================\n");
 
System.out.println("1. There are three difficulty levels you can choose from:");
System.out.println("   - Easy   : 4-letter words");
System.out.println("   - Medium : 5-letter words");
System.out.println("   - Hard   : 6-letter words");
System.out.println();
System.out.println("2. You will be shown a word in dashes (e.g., ____).");
System.out.println("   - Each dash represents a hidden letter.");
System.out.println("   - Your job is to guess the entire word, one full word at a time.");
System.out.println();
System.out.println("3. After each wrong guess:");
System.out.println("   - Correct letters in the correct position will be revealed.");
System.out.println("   - If a letter exists but is in the wrong position, you’ll be notified.");
System.out.println();
System.out.println("4. Hints:");
System.out.println("   - After 3 incorrect attempts, a hint will be shown from a subcategory.");
System.out.println("   - Example: For 'Technology', you may see 'Search Engine' as a hint.");
System.out.println();
System.out.println("5. Scoring System:");
System.out.println("   - Easy Mode   : 5 points deducted for each wrong guess.");
System.out.println("   - Medium Mode : 10 points deducted for each wrong guess.");
System.out.println("   - Hard Mode   : 20 points deducted for each wrong guess.");
System.out.println("   - You start with 100 points.");
System.out.println();
System.out.println("6. The game ends when you correctly guess the word.");
System.out.println("   - Your final score will be displayed.");
System.out.println();
System.out.println("TIPS:");
System.out.println(" - Enter only lowercase letters.");
System.out.println(" - Do not enter numbers or special characters.");
System.out.println(" - Try to guess wisely. Hints reduce your score indirectly.");
System.out.println();
System.out.println("Good luck and have fun guessing the words!\n");
System.out.println("==================================================");
    }   

public void Credits(){
System.out.println("\n==================================================");
System.out.println("                   GAME CREDITS                   ");
System.out.println("==================================================\n");
System.out.println(" Game Title   : Word Mastermind (Console Edition)");
System.out.println(" Developed By : Muhammad Saad");
System.out.println(" Language     : Java");
System.out.println(" IDE Used     : VS Code");
System.out.println(" Date Created : 18 July 2025\n");
System.out.println(" Description  :");
System.out.println(" A console-based word guessing game with");
System.out.println(" multiple difficulty levels (Easy, Medium, Hard),");
System.out.println(" scoring, hints, and smart feedback on letter positions.");
System.out.println();
System.out.println(" - My passion for cybersecurity & logical thinking!");
System.out.println();
System.out.println("==================================================");
System.out.println("     Thank you for playing Word Mastermind!       ");
System.out.println("==================================================\n");

}
}
