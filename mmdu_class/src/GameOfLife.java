public class GameOfLife {
    private static final int ROWS = 8;
    private static final int COLS = 8;
    private int[][] grid = new int[ROWS][COLS];
    private int[][] newGrid = new int[ROWS][COLS];

    // Constructor to initialize the grid with random values
    public GameOfLife() {
        // Implement grid initialization here (similar to the C version)
    }

    // Method to display the grid
    public void displayGrid() {
        // Implement grid display here
    }

    // Method to calculate the next generation
    public void nextGeneration() {
        // Implement Conway's rules here to update newGrid based on grid
        // You'll need to iterate through each cell and count neighbors to determine the new state.
        // Update grid with newGrid after all calculations are done.
    }

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.displayGrid();

        // Run the game for a specific number of generations
        for (int generation = 1; generation <= 10; generation++) {
            System.out.println("Generation " + generation + ":");
            game.nextGeneration();
            game.displayGrid();
        }
    }
}


