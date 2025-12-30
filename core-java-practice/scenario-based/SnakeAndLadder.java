public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;          // Player starts from position 0
        int diceCount = 0;         // To count number of dice rolls
        while (position != 100) {
            // Generate dice number between 1 and 6
            int dice = (int)(Math.random() * 6) + 1;
            diceCount++;
            // Generate option: 0 = No Play, 1 = Ladder, 2 = Snake
            int option = (int)(Math.random() * 3);
            // Store old position for safety check
            int previousPosition = position;
            if (option == 0) {
                position = position;
            }
            else if (option == 1) {

                // Ladder: move forward
                position = position + dice;
            }
            else {

                // Snake: move backward
                position = position - dice;
            }

            // If position goes below 0, reset to 0
            if (position < 0) {
                position = 0;
            }

            // If position goes above 100, stay at old position
            if (position > 100) {
                position = previousPosition;
            }
            System.out.println("Dice Rolled: " + dice + "  Current Position: " + position);
        }
        System.out.println("Game Won ");
        System.out.println("Total Dice Rolls: " + diceCount);
    }
}
