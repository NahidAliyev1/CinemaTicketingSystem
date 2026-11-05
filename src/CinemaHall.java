public class CinemaHall {
    private int _hallId;
    private static int _hallIdCounter;
    public int rows;
    public int cols;
    public boolean [][] seat;

    public CinemaHall(int rows,int cols)
    {
        _hallId=++_hallIdCounter;
        this.rows=rows;
        this.cols=cols;
        this.seat = new boolean[rows][cols];



    }
    public void displaySeatingChart()
    {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // X - dolu, O - boş
                System.out.print(seat[r][c] ? "[X] " : "[O] ");
            }
            System.out.println();
        }
    }
    public boolean isSeatAvaible(int row,int col)
    {
        // İndeksin massiv çərçivəsində olmasını yoxlayırıq
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return !seat[row][col]; //
        }
        return false;


    }
    public void reserveSeat(int row,int  col)
    {
        if (!isSeatAvailable(row, col)) {
            System.out.println("Daxil etdiyiniz yer bos deyildir və ya mövcud deyil!");
        } else {
            seat[row][col] = true;
            System.out.println("Rezerv olundu");
        }

            }



    public int get_hallId() {
        return _hallId;
    }
}
