package com.mindvalley.home_library.model;

/**
 * Created by mindvalley on 13/07/2017.
 */

public class AuthorModel {

    long id;

    String name;

    String asset_cover_url;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        if (name != null && name.length() > 0)
            return name;
        else
            return "Name not available";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsset_cover_url() {
        if (asset_cover_url != null && asset_cover_url.length() > 0)
            return asset_cover_url;
        else
            return "URL not found";
    }

    public void setAsset_cover_url(String asset_cover_url) {
        this.asset_cover_url = asset_cover_url;
    }
}
