package com.mindvalley.home_library.retrofit_services;

import com.mindvalley.home_library.model.ResponseAcademiesModel;
import com.mindvalley.home_library.model.ResponseCoursesModel;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by mindvalley on 11/07/2017.
 */

public interface HomeLibServices {


    @GET("/v2/mobile/academies/")
    Call<ResponseAcademiesModel> getAcademies(@Query("page") int page_num,
                                              @Query("per_page") int per_page,
                                              @Query("last_updated_at") String last_update_at,
                                              @Header("Authorization") String auth_header);

    @GET("/v2/mobile/courses/")
    Call<ResponseCoursesModel> getCourses(@Query("page") int page_num,
                                          @Query("per_page") int per_page,
                                          @Query("last_updated_at") String last_update_at,
                                          @Header("Authorization") String auth_header);


}
