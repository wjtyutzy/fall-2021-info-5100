package Q4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Netflix {
    public String name;
    public ArrayList<Genre> genres;

    public Netflix(String name) {
        this.name = name;
        this.genres = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public Genre getGenres(String genreName) {
        ArrayList<Genre> filter = (ArrayList<Genre>) genres.stream()
                .filter(genre -> genre.name.equalsIgnoreCase(genreName))
                .collect(Collectors.toList());
        if(filter.size() == 0) {
            return null;
        }
        return filter.get(0);
    }
}
