import java.util.*;
import java.util.stream.*;
public class TrendingMovies {

    static class Movie {
        String name;
        double rating;
        int releaseYear;

        Movie(String name, double rating, int releaseYear) {
            this.name = name;
            this.rating = rating;
            this.releaseYear = releaseYear;
        }

        @Override
        public String toString() {
            return name + " | Rating: " + rating + " | Year: " + releaseYear;
        }
    }

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.0, 2024),
            new Movie("Movie C", 7.8, 2022),
            new Movie("Movie D", 9.2, 2024),
            new Movie("Movie E", 8.9, 2023),
            new Movie("Movie F", 9.1, 2024),
            new Movie("Movie G", 8.0, 2021)
        );

        // Stream API logic
        movies.stream().filter(m -> m.rating >= 8.0).sorted((m1, m2) -> {   // sort by release year, then rating
                if (m2.releaseYear != m1.releaseYear)
                    return m2.releaseYear - m1.releaseYear;
                return Double.compare(m2.rating, m1.rating);
            })
            .limit(5)                       // top 5 movies
            .forEach(System.out::println);
    }
}
