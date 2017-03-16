package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

public enum ProfileViewPermissionEntity {

    @SerializedName("anyone")
    ANYONE("anyone"),

    @SerializedName("friends")
    FRIENDS("friends"),

    @SerializedName("nobody")
    NOBODY("nobody");

    private final String value;

    ProfileViewPermissionEntity(String value) {
        this.value = value;
    }

    public static ProfileViewPermissionEntity fromValue(String value) {
        for (ProfileViewPermissionEntity s : values())
            if (s.value.equals(value))
                return s;

        return null;
    }

    public String getValue() {
        return value;
    }
}
