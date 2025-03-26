package budgetflow.storage;

import budgetflow.command.ListIncomeCommand;

import java.io.*;
import java.util.logging.Logger;

/**
 * Handles the saving and loading of the saving goal for the BudgetFlow application.
 */
public class SavingGoalManager {
    private static final Logger logger = Logger.getLogger(SavingGoalManager.class.getName());
    private static final String SAVING_GOAL_FILE_PATH = "./data/saving_goal.txt";

    public void saveSavingGoal(double savingGoal) {
        try {
            File directory = new File("./data");
            if (!directory.exists()) {
                directory.mkdirs();
            }

            FileWriter fileWriter = new FileWriter(SAVING_GOAL_FILE_PATH);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(String.valueOf(savingGoal));
            writer.newLine();
            writer.close();

            logger.info("Saving goal saved successfully: " + savingGoal);
        } catch (IOException e) {
            System.out.println("Error saving saving goal: " + e.getMessage());
            logger.severe("Error saving saving goal: " + e.getMessage());
        }
    }

    public void loadSavingGoal() {
        File file = new File(SAVING_GOAL_FILE_PATH);
        if (!file.exists()) {
            logger.info("Saving goal file does not exist");
            return;
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();
            if (line != null) {
                try {
                    double savingGoal = Double.parseDouble(line);
                    ListIncomeCommand.setSavingGoal(savingGoal);

                    logger.info("Saving goal loaded successfully: " + savingGoal);
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing saving goal: " + e.getMessage());
                    logger.warning("Error parsing saving goal: " + e.getMessage());
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading saving goal: " + e.getMessage());
            logger.severe("Error loading saving goal: " + e.getMessage());
        }
    }
}