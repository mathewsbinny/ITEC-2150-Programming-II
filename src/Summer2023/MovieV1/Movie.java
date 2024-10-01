package MovieV1;

public class Movie {
    private Title title;
    private Ranking ranking;
    public Movie(Title title, Ranking ranking) {
        this.title = title;
        this.ranking = ranking;
    }
    public Title getTitle() {
        return Title;
    }

    public void setTitle (Title title) {
        this.title = title;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking (Ranking ranking) {
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Movie movie) {
        if(this.ranking.getRank() > movie.ranking.getRank()) {
            return 1;
        }
        else if (this.ranking.getRank() < movie.ranking.getRank()) {
            return 2;
        }
        else {

        }
    }
}
