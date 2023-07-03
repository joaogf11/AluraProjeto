package br.com.java.screenmatch.models;

public class Series extends Title{

    private int seasons;

    private int epPerSeason;
    private boolean active;

    private int epMinutes;

    public int getEpPerSeason() {
        return epPerSeason;
    }
    public void setEpPerSeason(int epPerSeason) {
        this.epPerSeason = epPerSeason;
    }
    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpMinutes() {
        return epMinutes;
    }

    public void setEpMinutes(int epMinutes) {
        this.epMinutes = epMinutes;
    }
}