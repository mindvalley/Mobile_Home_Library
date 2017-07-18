package com.mindvalley.home_library.controller.apis;

import com.mindvalley.home_library.model.ResponseAcademiesModel;

/**
 * Created by mindvalley on 18/07/2017.
 */

public abstract class BaseAPI {

    /**
     * this method is being called when response body is null
     * @param code the response status
     */
    public abstract void onEmptyResponse(int code);

    public abstract void onError(Throwable t);

}
