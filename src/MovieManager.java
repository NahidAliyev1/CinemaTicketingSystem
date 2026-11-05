import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;

public class MovieManager {
    ArrayList<Movie> mm=new ArrayList<>();

    public void addMovie(Movie movie){
        if (movie!=null){
            mm.add(movie);
            System.out.println("Ugurla elave olundu");

        }else{

            System.out.println("Elave olnumadi");
        }


    }
    public Movie getMovieById(int id) {
        for (var item : mm) {
            if (item.get_id() == id) {
                System.out.println(item.toString());
                return item;
            }
        }
        System.out.println("Bu id li bir kino tapilmadi");
        return null;
    }

    public void getAllMovies()
    {
        for (Movie item:mm){
            System.out.println(item.toString());

        }

    }
    public void removeMovie(int id)
    {
        for (var item : mm) {
            if (item.get_id() == id) {
                mm.remove(item);
                System.out.println("Ugurla silindi");
                return;

            }
        }
        System.out.println("Bu id li bir kino tapilmadi");
    }

    public Movie updateMovie(int id,Movie newMovie)
    {
        for (var item : mm)
        {
            if (item.get_id()==id)
            {
                item.title= newMovie.title;
                item.janr=newMovie.janr;
                item.durationMinutes= newMovie.durationMinutes;
                return item;
            }
        }
        System.out.println("Bu id de bir kino tapilmadi");
        return null;
    }
}
