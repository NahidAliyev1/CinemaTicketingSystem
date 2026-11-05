//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


        User user = new User("Nahid", 100);
        CinemaHall cinemaHall = new CinemaHall(10, 10);

        Movie movie = new Movie("The mentalist", Genre.ACTION, 43);
        Movie movie2 = new Movie("Breaking Bad", Genre.HORROR, 43);

        MovieManager movieManager = new MovieManager();
        movieManager.addMovie(movie);
        movieManager.addMovie(movie2);

        System.out.println("--- Bütün Kinolar ---");
        movieManager.getAllMovies();

        TicketController ticketController = new TicketController();

        // Bilet alma prosesi
        Ticket ticket = ticketController.buyTicket(user, movie, cinemaHall, 5, 3, 20);

        if (ticket != null) {
            System.out.println("--- Bilet Məlumatı ---");
            ticket.displayTicketInfo();
        }

        System.out.println("\n--- Zalın Vəziyyəti ---");
        cinemaHall.displaySeatingChart();
    }



