public class Ticket {
    private int _ticketId;
    private static int _ticketidCounter;
    public Movie movie;
    public User user;
    public int row;
    public int col;
    public  double price;
    public Ticket(Movie movie,User user,int row,int col,double price)
    {
        this.movie = movie;
        this.user = user;
        this.row = row;
        this.col = col;
        this.price = price;
        _ticketId=++_ticketidCounter;

    }
    public void displayTicketInfo()
    {
        System.out.println("User:" + user.Name + "Row:" + row + "Colum" + col + "Movie:" + movie.title + "Price:" + price);
    }


    public int get_ticketId() {
        return _ticketId;
    }
}
