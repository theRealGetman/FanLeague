package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class ScoreEntity {

  @SerializedName("home_team") private int homeTeam;

  @SerializedName("away_team") private int awayTeam;

  public ScoreEntity(int homeTeam, int awayTeam) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
  }

  public int getHomeTeam() {
    return homeTeam;
  }

  public int getAwayTeam() {
    return awayTeam;
  }

  @Override public String toString() {
    return "ScoreEntity{" + "homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + '}';
  }
}
