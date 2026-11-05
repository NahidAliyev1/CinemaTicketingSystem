public  class Movie {
    private int _id;
    private static int _idConter;
    public String title;

public  Genre janr;
public int durationMinutes;

  public Movie(String title,Genre janr,int durationMinutes){
      _id=++_idConter;
      this.title=title;
      this.janr=janr;
      this.durationMinutes=durationMinutes;
  }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + _id +
                ", title='" + title + '\'' +
                ", genre=" + janr +
                ", durationMinutes=" + durationMinutes +
                '}';
    }

    public int get_id() {
        return _id;
    }
}


