package MovieComparableComparatorV2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Movie implements Comparable<Movie>{
    private String title;
    private double rating;
    private int year;

    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie film) {
//        if (this.year > film.year) {
//            return 1;
//        }
//        else if (this.year < film.year) {
//            return -1;
//        }
//        else {
//            return 0;
//        }
        return (this.year > film.year? 1: this.year < film.year? -1: 0);
    }

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Old Boy", 8, 2003));
        list.add(new Movie("Solaris", 10, 1961));
        list.add(new Movie("Come and See", 9, 1985));
        list.add(new Movie("Talk to Me", 5, 2022));
        list.add(new Movie("The Lighthouse", 7, 2019));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("//sorted by ratings//");
        Rating rt = new Rating();

        Collections.sort(list,rt);
        for(Movie movie:list) {
            System.out.println(movie.rating + ": " + movie.title + ", " + movie.year);
        }
        System.out.println("////");
        list.forEach(movie -> System.out.print(movie.rating + ", " + movie.title + ", " + movie.year + "\n"));

        Name nm = new Name();
        Collections.sort(list,nm);
        System.out.println("//sorted by the title//");
        list.forEach(movie  -> System.out.println(movie.title));
    }
}

class Name implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareToIgnoreCase(m2.getTitle());
    }
}

class Rating implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2) {
        return m1.getRating() > m2.getRating()? 1: m1.getRating() < m2.getRating()? -1: 0;
    }
}