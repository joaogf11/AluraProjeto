package br.com.java.screenmatch.models;

//MOVIES
public class Movies extends Title{
    private String director;
    private int totalMinutes;

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public void setTotalMinutes(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }
}