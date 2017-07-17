package com.mindvalley.home_library.model;

import java.util.List;

/**
 * Created by mindvalley on 13/07/2017.
 */

public class CourseMetaModel {

    long id;

    String title;

    String slug;

    String product_id;

    String main_color;

    float average_rating;

    int nps_score;

    long tribelearn_tribe_id;

    List<AuthorModel> authors;

    String published_at;

    String last_updated_at;

    String cover_image_url;

    String course_url;

    long academy_id;

    boolean is_completed;

    public CourseMetaModel() {
    }

    public CourseMetaModel(long id, String title, String slug, String product_id, String main_color, float average_rating, int nps_score, long tribelearn_tribe_id, List<AuthorModel> authors, String published_at, String last_updated_at, String cover_image_url, String course_url, long academy_id, boolean is_completed) {
        this.id = id;
        this.title = title;
        this.slug = slug;
        this.product_id = product_id;
        this.main_color = main_color;
        this.average_rating = average_rating;
        this.nps_score = nps_score;
        this.tribelearn_tribe_id = tribelearn_tribe_id;
        this.authors = authors;
        this.published_at = published_at;
        this.last_updated_at = last_updated_at;
        this.cover_image_url = cover_image_url;
        this.course_url = course_url;
        this.academy_id = academy_id;
        this.is_completed = is_completed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getMain_color() {
        return main_color;
    }

    public void setMain_color(String main_color) {
        this.main_color = main_color;
    }

    public float getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(float average_rating) {
        this.average_rating = average_rating;
    }

    public int getNps_score() {
        return nps_score;
    }

    public void setNps_score(int nps_score) {
        this.nps_score = nps_score;
    }

    public long getTribelearn_tribe_id() {
        return tribelearn_tribe_id;
    }

    public void setTribelearn_tribe_id(long tribelearn_tribe_id) {
        this.tribelearn_tribe_id = tribelearn_tribe_id;
    }

    public List<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorModel> authors) {
        this.authors = authors;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public String getLast_updated_at() {
        return last_updated_at;
    }

    public void setLast_updated_at(String last_updated_at) {
        this.last_updated_at = last_updated_at;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public String getCourse_url() {
        return course_url;
    }

    public void setCourse_url(String course_url) {
        this.course_url = course_url;
    }

    public long getAcademy_id() {
        return academy_id;
    }

    public void setAcademy_id(long academy_id) {
        this.academy_id = academy_id;
    }

    public boolean is_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

}
