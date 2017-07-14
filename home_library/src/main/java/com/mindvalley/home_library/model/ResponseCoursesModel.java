package com.mindvalley.home_library.model;

/**
 * Created by mindvalley on 14/07/2017.
 */

public class ResponseCoursesModel {

    MetaModel meta;
    CourseMetaModel[] courses;
    long[] deleted_courses;
    boolean hasNext;

    public CourseMetaModel[] getCourses() {
        return courses;
    }

    public long[] getDeleted_courses() {
        return deleted_courses;
    }

    public boolean isHasNext() {
        return hasNext;
    }


    public MetaModel getMeta() {
        return meta;
    }

}
