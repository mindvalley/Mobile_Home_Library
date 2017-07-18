package com.mindvalley.home_library.controller.apis;

import com.mindvalley.home_library.controller.API_Utils;
import com.mindvalley.home_library.model.ResponseAcademiesModel;
import com.mindvalley.home_library.retrofit_services.HomeLibServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mindvalley on 12/07/2017.
 */

public abstract class AcademiesAPI extends BaseAPI{

    public AcademiesAPI(int pageNumber, int perPage, String lastUpdateAt, String authHeader) {
        HomeLibServices homeLibServices = API_Utils.getData().create(HomeLibServices.class);

        Call<ResponseAcademiesModel> call = homeLibServices.getAcademies(pageNumber, perPage, lastUpdateAt, authHeader);
        call.enqueue(new Callback<ResponseAcademiesModel>() {
            @Override
            public void onResponse(Call<ResponseAcademiesModel> call, Response<ResponseAcademiesModel> response) {

                if (response.body() != null) {
                    onResult(response.body());
                } else
                    onEmptyResponse(response.code());
            }

            @Override
            public void onFailure(Call<ResponseAcademiesModel> call, Throwable t) {
                onError(t);
            }
        });
    }

    public abstract void onResult(ResponseAcademiesModel academiesModel);

}
