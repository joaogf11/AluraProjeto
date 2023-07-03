package br.com.java.screenmatch.utils;

import br.com.java.screenmatch.Main;
import br.com.java.screenmatch.models.Movies;
import br.com.java.screenmatch.models.Series;
import br.com.java.screenmatch.models.Title;

//UTILS

public class Utils{
    public void printMovie(Movies movie) {
        System.out.println("Nome: " + movie.getName());
        System.out.println("Ano de lançamento: " + movie.getReleaseYear());
        System.out.println("Duração do filme: " + movie.getTotalMinutes() + " Minutos");
        System.out.println("Diretor: " + movie.getDirector());
        System.out.println(movie.getStar() + " Estrelas");

        if (movie.isPlanIncluded()) {
            System.out.println("Incluído no plano: Sim");
        } else {
            System.out.println("Incluído no plano: Não");
        }

        if (movie.getTotalRatings() == 0) {
            System.out.println("Avaliação não disponível");
        } else {
            System.out.println("Avaliação média: " + ratingAverage(movie));
        }
    }

    public void printSerie(Series serie){
        System.out.println("Nome da Série: " + serie.getName());
        System.out.println("Ano de lançamento: " + serie.getReleaseYear());
        System.out.println("Temporadas: " + serie.getSeasons());
        System.out.println("Episódios por temporada: " + serie.getEpPerSeason());
        System.out.println("Minutos por episódio: " + serie.getEpMinutes() + " Minutos");
        System.out.println(serie.getStar() + " Estrelas");
        if (serie.isActive()){
            System.out.println("Ativa");
        } else {
            System.out.println("Não disponivel");
        }



        if (serie.isPlanIncluded()) {
            System.out.println("Incluído no plano: Sim");
        } else {
            System.out.println("Incluído no plano: Não");
        }

        if (serie.getTotalRatings() == 0) {
            System.out.println("Avaliação não disponível");
        } else {
            System.out.println("Avaliação média: " + ratingAverage(serie));
        }

    }

    public void rate(Title title, double note) {
        double currentRatingSum = title.getRatingSum();
        int currentTotalRatings = title.getTotalRatings();

        title.setRatingSum(currentRatingSum + note);
        title.setTotalRatings(currentTotalRatings + 1);
    }

    private double ratingAverage(Title title) {
        return title.getRatingSum() / title.getTotalRatings();
    }
}