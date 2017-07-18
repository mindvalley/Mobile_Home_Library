package com.mindvalley.mobile_home_library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mindvalley.home_library.controller.apis.AcademiesAPI;
import com.mindvalley.home_library.controller.apis.CoursesAPI;
import com.mindvalley.home_library.model.ResponseAcademiesModel;
import com.mindvalley.home_library.model.ResponseCoursesModel;

public class MainActivity extends AppCompatActivity {

    private String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL21pbmR2YWxsZXkuYXV0aDAuY29tLyIsInN1YiI6ImF1dGgwfDg5NDI1MyIsImF1ZCI6IndEZTRUWlVjUlNQOXZ2VjJUdHA0Z0h1VGJPREhPa3Q3IiwiZXhwIjoxNTAxMDYwOTQ5LCJpYXQiOjE0OTk4NTEzNDl9.nN85r2OT40lAW3hmIFb1jD19exzkHE6BBdz_oGezneQ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AcademiesAPI(1, 20, "", token) {

            @Override
            public void onResult(ResponseAcademiesModel academiesModel) {
                Log.d("data", "Academy is: " + academiesModel.getAcademies()[1].getName());
            }

            @Override
            public void onEmptyResponse(int code) {
                Log.d("data", "Got empty response and response status is: "+code);

            }

            @Override
            public void onError(Throwable t) {
                Log.d("data", "API call failed due to "+t.getMessage());

            }
        };

        new CoursesAPI(1, 20, "", token) {
            @Override
            public void onResult(ResponseCoursesModel coursesModel) {
                Log.d("data", "Course is:" + coursesModel.getCourses()[0].getTitle());
            }

            @Override
            public void onEmptyResponse(int code) {
                Log.d("data", "Got empty response and response status is: "+code);

            }

            @Override
            public void onError(Throwable t) {
                Log.d("data", "API call failed due to "+t.getMessage());

            }
        };

    }
}
