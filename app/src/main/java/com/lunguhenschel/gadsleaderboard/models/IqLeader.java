package com.lunguhenschel.gadsleaderboard.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IqLeader {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("score")
    @Expose
    private Integer score;

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public String getCountry() {
        return country;
    }

    @SerializedName("country")
    @Expose
    private String country;

    public IqLeader(String name, Integer score, String country) {
        this.name = name;
        this.score = score;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
