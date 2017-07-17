package com.mindvalley.home_library.controller.apis;

import com.mindvalley.home_library.controller.API_Utils;
import com.mindvalley.home_library.model.ResponseCoursesModel;
import com.mindvalley.home_library.retrofit_services.HomeLibServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 14/07/2017.
 */

public abstract class CoursesAPI {

    public CoursesAPI(int pageNumber, int perPage, String lastUpdateAt, String authHeader) {
        HomeLibServices homeLibServices = API_Utils.getData().create(HomeLibServices.class);

        Call<ResponseCoursesModel> call = homeLibServices.getCourses(pageNumber, perPage, lastUpdateAt, authHeader);
        call.enqueue(new Callback<ResponseCoursesModel>() {
            @Override
            public void onResponse(Call<ResponseCoursesModel> call, Response<ResponseCoursesModel> response) {

                if (response.body() != null) {
                    onResult(response.body());
                } else
                    onError();
            }

            @Override
            public void onFailure(Call<ResponseCoursesModel> call, Throwable t) {

            }
        });
    }

    public abstract void onError();

    public abstract void onResult(ResponseCoursesModel coursesModel);
}
