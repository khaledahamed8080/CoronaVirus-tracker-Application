package com.example.coronatracker.Models;

public class LocationStats {
   private String state;
   private String country;
   private int latestTotalCases;
   private int difffromPrevDay;
   
public int getDifffromPrevDay() {
    return difffromPrevDay;
}
public void setDifffromPrevDay(int difffromPrevDay) {
    this.difffromPrevDay = difffromPrevDay;
}
public String getState() {
    return state;
}
public void setState(String state) {
    this.state = state;
}
public String getCountry() {
    return country;
}
public void setCountry(String country) {
    this.country = country;
}
public int getLatestTotalCases() {
    return latestTotalCases;
}
public void setLatestTotalCases(int latestTotalCases) {
    this.latestTotalCases = latestTotalCases;
}

@Override
public String toString() {
    return "LocationStats [country=" + country + ", difffromPrevDay=" + difffromPrevDay + ", latestTotalCases="
            + latestTotalCases + ", state=" + state + "]";
}
   
}
