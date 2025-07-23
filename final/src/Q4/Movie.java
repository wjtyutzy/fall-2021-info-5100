package Q4;

import java.util.*;

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

    public String setTitle(String title) {
        this.title = title;
        return title;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public int getYears(){
        //convert date to
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("PST")) ;
        cal.setTime(this.releasedDate);
        return cal.get(Calendar.YEAR);
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
