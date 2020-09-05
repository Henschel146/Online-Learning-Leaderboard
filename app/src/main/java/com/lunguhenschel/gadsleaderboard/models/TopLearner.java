package com.lunguhenschel.gadsleaderboard.models;


import com.google.gson.annotations.SerializedName;

public class TopLearner {


    @SerializedName("name")
    private String name;

    @SerializedName("hours")
    private Integer hours;

    @SerializedName("country")
    private String country;


    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public TopLearner(String name, Integer hours, String country) {
        this.name = name;
        this.hours = hours;
        this.country = country;
    }
}
