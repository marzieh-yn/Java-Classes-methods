package AdvanceJava.Streams;

public class Movie implements Comparable<Movie> {
  private int likes;
  private String title;

  private Genre genre;

  public Movie(String title, int likes, Genre genre) {
    this.title = title;
    this.likes = likes;
    this.genre = genre;
  }

  public int getLikes() {
    return likes;
  }
  public Genre getGenre() {
    return genre;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public int compareTo(Movie o) {
    return 0;
  }
}
