package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class FriendshipEntity {
  @SerializedName("is_friends") private boolean isFriends;

  @SerializedName("has_sent_request_pending") private boolean hasRequestPending;

  @SerializedName("received_request_pending") private boolean receivedRequestPending;

  @SerializedName("is_friends_on_facebook") private boolean isFriendsOnFacebook;

  @SerializedName("mutual_friends_count") private int mutualFriendsCount;

  public boolean isFriends() {
    return isFriends;
  }

  public boolean isHasRequestPending() {
    return hasRequestPending;
  }

  public boolean isReceivedRequestPending() {
    return receivedRequestPending;
  }

  public boolean isFriendsOnFacebook() {
    return isFriendsOnFacebook;
  }

  public int getMutualFriendsCount() {
    return mutualFriendsCount;
  }

}
