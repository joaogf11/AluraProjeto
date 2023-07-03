package br.com.java.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    public boolean planIncluded;
    private double ratingSum;
    private int totalRatings;
    private String recommend;
    private int totalViews;
    private int Star;


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

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getStar() {
        return setStar(totalViews);
    }

    public int setStar(int totalViews) {
        if (totalViews >= 1000) {
            return 4;
        } else if (totalViews >= 500) {
            return 3;
        } else {
            return 2;
        }
    }
}