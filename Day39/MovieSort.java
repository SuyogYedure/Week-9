import java.util.ArrayList;
import java.util.*;
class Movie implements Comparable<Movie>{
  private String title;
  private String director;
  private int year;

  public Movie (String title, String director, int year){
    this.title = title;
    this.director = director;
    this.year = year;
  }

  public int compareTo(Movie mov){
    if(year>mov.year){
      return -1;
    }
    else if(year<mov.year){
      return 1;
    }
    else{
      return 0;
    }
    
  }

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
}
class MovieSort{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    ArrayList<Movie> movies = new ArrayList<Movie>();
    for(int i=0;i<3;i++){
      movies.add(new Movie(s.next(), s.next(), s.nextInt()));
    }
    Collections.sort(movies);
    for(Movie mov : movies){
      System.out.println(mov.getTitle()+" "+mov.getDirector()+" "+mov.getYear());
    }
  }
}