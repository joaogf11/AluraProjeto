package br.com.java.screenmatch;

import br.com.java.screenmatch.models.Movies;
import br.com.java.screenmatch.models.Series;
import br.com.java.screenmatch.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Movies addMovie = new Movies();
        Utils util = new Utils();
        Series addSerie = new Series();
        addMovie.setName("Homem Aranha");
        addMovie.setReleaseYear(2002);
        addMovie.setTotalMinutes(121);
        addMovie.setPlanIncluded(true);
        addMovie.setDirector("Sam Raimi");
        addMovie.setTotalViews(1000);

        addSerie.setName("Suits");
        addSerie.setSeasons(5);
        addSerie.setReleaseYear(2011);
        addSerie.setEpPerSeason(20);
        addSerie.setEpMinutes(50);
        addSerie.setPlanIncluded(false);
        addSerie.setActive(true);
        addSerie.setTotalViews(500);


        util.rate(addMovie, 8);
        util.rate(addMovie, 10);
        util.rate(addMovie, 10);
        util.rate(addMovie, 0);

        util.rate(addSerie, 8);
        util.rate(addSerie, 10);
        util.rate(addSerie, 10);
        util.rate(addSerie, 4);


        System.out.println("*".repeat(20));
        util.printMovie(addMovie);
        System.out.println("*".repeat(20));
        util.printSerie(addSerie);

    }
}