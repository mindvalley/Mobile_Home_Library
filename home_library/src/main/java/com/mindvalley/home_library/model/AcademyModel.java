package com.mindvalley.home_library.model;

import java.util.List;

/**
 * Created by mindvalley on 12/07/2017.
 */

public class AcademyModel {

    long id;

    String name;

    String domain;

    String awc_product_id;

    String theme_color;

    int nps_score;

    String updated_at;

    long featured_course_id;

    long tribelearn_tribe_id;

    String cover_photo_url;

    String course_ordering;

    boolean subscription;

    boolean purchased;

    List<AuthorModel> authors;

    List<String> course_cover_images;

    String purchased_at;

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
            return "Name not found";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAwc_product_id() {
        return awc_product_id;
    }

    public void setAwc_product_id(String awc_product_id) {
        this.awc_product_id = awc_product_id;
    }

    public String getTheme_color() {
        if (theme_color==null) {
            //using a dark blue default color
            theme_color="#002232";
        }
        else if (!theme_color.startsWith("#")) {
            theme_color="#"+theme_color;
        }
        while (theme_color.length()<4)
            theme_color+="f";

        return theme_color;
    }

    public void setTheme_color(String theme_color) {
        this.theme_color = theme_color;
    }

    public int getNps_score() {
        return nps_score;
    }

    public void setNps_score(int nps_score) {
        this.nps_score = nps_score;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public long getFeatured_course_id() {
        return featured_course_id;
    }

    public void setFeatured_course_id(long featured_course_id) {
        this.featured_course_id = featured_course_id;
    }

    public long getTribelearn_tribe_id() {
        return tribelearn_tribe_id;
    }

    public void setTribelearn_tribe_id(long tribelearn_tribe_id) {
        this.tribelearn_tribe_id = tribelearn_tribe_id;
    }

    public String getCover_photo_url() {
        return cover_photo_url;
    }

    public void setCover_photo_url(String cover_photo_url) {
        this.cover_photo_url = cover_photo_url;
    }

    public String getCourse_ordering() {
        return course_ordering;
    }

    public void setCourse_ordering(String course_ordering) {
        this.course_ordering = course_ordering;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public List<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorModel> authors) {
        this.authors = authors;
    }

    public List<String> getCourse_cover_images() {
        return course_cover_images;
    }

    public void setCourse_cover_images(List<String> course_cover_images) {
        this.course_cover_images = course_cover_images;
    }

    public String getPurchased_at() {
        return purchased_at;
    }

    public void setPurchased_at(String purchased_at) {
        this.purchased_at = purchased_at;
    }
}
