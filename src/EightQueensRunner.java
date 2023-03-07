public class EightQueensRunner {
    public static void main(String[] args) {
        System.out.println(EightQueens.fundSolutions(4));
        System.out.println(EightQueens.getAllSolutions().get(0).toString());
        EightQueens.displayGrid();
    }
}
