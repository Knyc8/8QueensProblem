import java.lang.reflect.Array;
import java.util.ArrayList;

public class EightQueens {
    private static ArrayList<ArrayList<Integer>> allSolutions = new ArrayList<>();
    public static int fundSolutions (int n)
    {
        int numSolutions = 0;
        ArrayList<Integer> solutions = new ArrayList<>();
        if (n % 6 != 2 & n % 6 != 3)
        {
            numSolutions++;
            for (int i = 0; i < n; i++)
            {
                solutions.add(i+1);
            }
            for (int i = solutions.size()-1; i >= solutions.size()/2; i--)
            {
                if (solutions.get(i) % 2 == 0)
                {
                    solutions.add(0, solutions.remove(i));
                }
            }
        }
        allSolutions.add(solutions);
        return numSolutions;
    }

    public static ArrayList<ArrayList<Integer>> getAllSolutions()
    {
        return allSolutions;
    }

    public static void displayGrid()
    {
        String[][] grid = new String[allSolutions.get(0).size()][allSolutions.get(0).size()];
        for (ArrayList<Integer> solution : allSolutions) {
            for (int row = 0; row < solution.size(); row++) {
                for (int col = 0; col < solution.size(); col++) {
                    if (row + 1 == solution.indexOf(col + 1)) {
                        grid[row][col] = "Q";
                    }
                    else
                    {
                        grid[row][col] = "-";
                    }
                }
            }
        }

        for (String[] row : grid)
        {
            for (String col : row)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
