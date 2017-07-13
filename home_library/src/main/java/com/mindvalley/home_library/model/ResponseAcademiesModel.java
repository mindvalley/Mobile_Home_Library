package com.mindvalley.home_library.model;

/**
 * Created by mindvalley on 13/07/2017.
 */

public class ResponseAcademiesModel {

    MetaModel meta;
    AcademiesModel[] academies;
    AcademiesCountModel academies_count;
    long[] deleted_academies;

    public MetaModel getMeta() {
        return meta;
    }

    public AcademiesModel[] getAcademies() {
        return academies;
    }

    public AcademiesCountModel getAcademies_count() {
        return academies_count;
    }

    public long[] getDeleted_academies() {
        return deleted_academies;
    }
}
