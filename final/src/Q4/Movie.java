package Q4;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Movie {
    public String title;
    public Date releasedDate;
    public ArrayList<String> actors;
    public String director;

    /*public Movie(String title, Date releasedDate,
                 ArrayList<String> actors, String director) {
        this.title = title;
        this.releasedDate = releasedDate;
        this.actors = actors;
        this.director = director;
    }*/

    public Movie(String title, Date releasedDate, String director) {
        this.title = title;
        this.releasedDate = releasedDate;
        this.actors = new ArrayList<>();
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}
