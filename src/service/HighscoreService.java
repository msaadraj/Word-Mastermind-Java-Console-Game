package src.service;

import java.io.*;
import java.util.*;

public class HighscoreService {
    private static final String FILE_NAME = "data/highscores.txt"; // Create a 'data' folder at root

    public static void saveHighScore(String name, String difficulty, int length, int score) {
    File file = new File(FILE_NAME);
    File parentDir = file.getParentFile();

    if (!parentDir.exists()) {
        parentDir.mkdirs();  // Create 'data/' folder if not exists
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
        writer.write(name + "," + difficulty + "," + length + "," + score);
        writer.newLine();
    } catch (IOException e) {
        System.out.println("Error saving high score: " + e.getMessage());
    }
}


    public static void viewHighScores() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No high scores yet. Play a game first!");
            return;
        }

        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            if (lines.isEmpty()) {
                System.out.println("No high scores recorded yet.");
                return;
            }

            System.out.println("\n-------------------------------------------------------------");
            System.out.printf("%-15s %-12s %-10s %-10s\n", "Player Name", "Difficulty", "Length", "Score");
            System.out.println("-------------------------------------------------------------\n");
            for (String l : lines) {
                String[] parts = l.split(",");
                if (parts.length == 4) {
                    System.out.printf("%-15s %-12s %-10s %-10s\n", parts[0], parts[1], parts[2], parts[3]);
                }
            }
            System.out.println("\n-------------------------------------------------------------");

        } catch (IOException e) {
            System.out.println("Error reading high scores: " + e.getMessage());
        }
    }
}
