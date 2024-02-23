public class TwoDArray {
    public static void main(String[] args) {
        int Myarray[][] = {
                {12, 34, 43},
                {23, 43, 54},
                {65, 56, 43}
        };
        // System.out.println(Myarray[0][2]);
        for (int row[] : Myarray) {
            for (int numbers : row) {
                System.out.print(" " + numbers);
            }
            System.out.println();
        }
    }
}
