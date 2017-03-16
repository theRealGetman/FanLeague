package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClub;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class FavoriteClubMapper implements Mapper<FavoriteClubEntity, FavoriteClub> {

  public FavoriteClubMapper() {
  }

  @Override public FavoriteClub transform(FavoriteClubEntity obj) {
    FavoriteClub favoriteClub = new FavoriteClub();
    favoriteClub.setId(obj.getId());

    return favoriteClub;
  }
}
