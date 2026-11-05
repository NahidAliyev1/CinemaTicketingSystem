public class TicketController {
    public Ticket buyTicket(User user, Movie movie, CinemaHall hall, int row, int col, double price)
    {
        if (user.balance >= price)
        {
            if (!hall.seat[row][col])
            {
                user.balance=user.balance-price;
                hall.seat[row][col]=true;
                Ticket newTicket=new Ticket(movie,user,row,col,price);
                return  newTicket;
            }else
            {
                System.out.println("Yer doludur");
            }
        }else
        {
            System.out.println("Balansinizda kifayet qeder mebleg yoxdur");
        }

        return null;
    }
}
