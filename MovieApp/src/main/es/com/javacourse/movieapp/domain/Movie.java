package main.es.com.javacourse.movieapp.domain;

public class Movie {
    private String name;

    public Movie(){};

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("title:'").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
