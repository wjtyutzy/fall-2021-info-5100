package Q4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NetflixTest {
    public static void main(String[] args) {
        Netflix netflix = new Netflix("Netflix Movie");
        netflix.setGenres(generateGenres());
        Genre classic = netflix.getGenres("Classic");
        addClassicMovie(classic);
        Genre musicMovie = netflix.getGenres("Music Movie");
        addMusicMovie(musicMovie);
        Genre dramaMovie = netflix.getGenres("Drama Movie");
        addDramaMovie(dramaMovie);
        Genre actionMovie = netflix.getGenres("Action Movie");
        addActionMovie(actionMovie);
        System.out.println();

        //list all movies
        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .forEach(movie -> System.out.println(movie.title));

        Date date = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        //find movies released before 2000, and add string to the title
        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.releasedDate.before(date))
                .map(movie -> movie.title.concat("(Classic)"))
                .forEach(System.out::println);

        //get latest 3 movies
        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .sorted((movie1, movie2) -> movie1.getReleasedDate().compareTo(movie2.getReleasedDate()))
                .limit(3)
                .forEach(movie -> System.out.println(movie.title));

        /*netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .sorted((movie1, movie2) -> movie2.getReleasedDate() > movie1.getReleasedDate() ? movie1 :movie2)
                .limit(3)
                .forEach(movie -> System.out.println(movie.title));*/

        //find movies between 1990 and 2000
        Date date1 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        ArrayList<Movie> list = netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleasedDate().before(date))
                .filter(movie -> movie.getReleasedDate().after())
                .forEach(movie -> System.out.println(movie.title));


        //sort on title
        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .sorted((movie1, movie2) -> movie1.getTitle().compareTo(movie2.getTitle()))
                .forEach(movie -> System.out.println(movie.title));


    }

    //add release year
    public static void addReleasedYear(Netflix netflix){

        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .map(movie -> movie.getTitle().concat("releasedDate"))
                .forEach(movie -> System.out.println(movie));
    }

    public static ArrayList<Genre> generateGenres() {
        Genre classic = new Genre("Classic");
        Genre musicMovie = new Genre("Music Movie");
        Genre dramaMovie = new Genre("Drama Movie");
        Genre actionMovie = new Genre("Action Movie");
        ArrayList<Genre> list = new ArrayList<>();
        list.add(classic);
        list.add(musicMovie);
        list.add(dramaMovie);
        list.add(actionMovie);
        return list;
    }

    public static void addClassicMovie(Genre classic) {
        Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        classic.addMovie(new Movie("Classic 1", date, "director 1"));
        date = new GregorianCalendar(2002, Calendar.FEBRUARY, 11).getTime();
        classic.addMovie(new Movie("Classic 2", date, "director 2"));
        date = new GregorianCalendar(1980, Calendar.FEBRUARY, 11).getTime();
        classic.addMovie(new Movie("Classic 3", date, "director 3"));
        date = new GregorianCalendar(1992, Calendar.FEBRUARY, 11).getTime();
        classic.addMovie(new Movie("Classic 4", date, "director 4"));
    }

    public static void addMusicMovie(Genre musicMovie) {
        Date date = new GregorianCalendar(1999, Calendar.FEBRUARY, 11).getTime();
        musicMovie.addMovie(new Movie("Music 1", date, "director 5"));
        date = new GregorianCalendar(2001, Calendar.FEBRUARY, 11).getTime();
        musicMovie.addMovie(new Movie("Music 2", date, "director 6"));
        date = new GregorianCalendar(1989, Calendar.FEBRUARY, 11).getTime();
        musicMovie.addMovie(new Movie("Music 3", date, "director 7"));
        date = new GregorianCalendar(2006, Calendar.FEBRUARY, 11).getTime();
        musicMovie.addMovie(new Movie("Music 4", date, "director 8"));
    }

    public static void addDramaMovie(Genre dramaMovie) {
        Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        dramaMovie.addMovie(new Movie("dramaMovie 1", date, "director 9"));
        date = new GregorianCalendar(2002, Calendar.FEBRUARY, 11).getTime();
        dramaMovie.addMovie(new Movie("dramaMovie 2", date, "director 10"));
        date = new GregorianCalendar(1980, Calendar.FEBRUARY, 11).getTime();
        dramaMovie.addMovie(new Movie("dramaMovie 3", date, "director 11"));
        date = new GregorianCalendar(1992, Calendar.FEBRUARY, 11).getTime();
        dramaMovie.addMovie(new Movie("dramaMovie 4", date, "director 12"));
    }

    public static void addActionMovie(Genre actionMovie) {
        Date date = new GregorianCalendar(1986, Calendar.FEBRUARY, 11).getTime();
        actionMovie.addMovie(new Movie("actionMovie 1", date, "director 13"));
        date = new GregorianCalendar(2011, Calendar.FEBRUARY, 11).getTime();
        actionMovie.addMovie(new Movie("actionMovie 2", date, "director 14"));
        date = new GregorianCalendar(1979, Calendar.FEBRUARY, 11).getTime();
        actionMovie.addMovie(new Movie("actionMovie 3", date, "director 15"));
        date = new GregorianCalendar(2016, Calendar.FEBRUARY, 11).getTime();
        actionMovie.addMovie(new Movie("actionMovie 4", date, "director 16"));
    }
}
