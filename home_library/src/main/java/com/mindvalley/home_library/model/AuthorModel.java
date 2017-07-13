package com.mindvalley.home_library.model;

/**
 * Created by mindvalley on 13/07/2017.
 */

public class AuthorModel {

    long id;

    String name;

    String asset_cover_url;

    public AuthorModel(long id, String name, String asset_cover_url) {
        this.id = id;
        this.name = name;
        this.asset_cover_url = asset_cover_url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsset_cover_url() {
        return asset_cover_url;
    }

    public void setAsset_cover_url(String asset_cover_url) {
        this.asset_cover_url = asset_cover_url;
    }
}
