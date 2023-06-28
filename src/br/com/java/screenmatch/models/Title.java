package br.com.java.screenmatch.models;

//TITLE
public class Title {
    private String name;
    private int releaseYear;
    public boolean planIncluded;
    private double ratingSum;
    private int totalRatings;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public void setRatingSum(double ratingSum) {
        this.ratingSum = ratingSum;
    }

    public double getRatingSum() {
        return ratingSum;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }
}