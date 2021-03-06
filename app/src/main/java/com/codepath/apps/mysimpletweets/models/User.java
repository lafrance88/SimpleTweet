package com.codepath.apps.mysimpletweets.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by La-France on 8/2/2016.
 */
public class User {
    private String name;
    private Long uid;
    private String screenName;
    private String profileImageUrl;

    public String getName() {
        return name;
    }

    public Long getUid() {
        return uid;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public  static User fromJSON(JSONObject json){
        User u = new User();
        //extract and fill the value of the json

        try {
            u.name = json.getString("name");
            u.uid = json.getLong("id");
            u.screenName = json.getString("screen_name");
            u.profileImageUrl = json.getString("profile_image_url");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // return a user
        return u;
    }
}
