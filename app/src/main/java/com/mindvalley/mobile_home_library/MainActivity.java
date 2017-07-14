package com.mindvalley.mobile_home_library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mindvalley.home_library.controller.apis.AcademiesAPI;
import com.mindvalley.home_library.controller.apis.CoursesAPI;
import com.mindvalley.home_library.model.ResponseAcademiesModel;
import com.mindvalley.home_library.model.ResponseCoursesModel;

public class MainActivity extends AppCompatActivity {

    private String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL21pbmR2YWxsZXkuYXV0aDAuY29tLyIsInN1YiI6ImF1dGgwfDYyMDAzOCIsImF1ZCI6IndEZTRUWlVjUlNQOXZ2VjJUdHA0Z0h1VGJPREhPa3Q3IiwiZXhwIjoxNTAxMjIyNzIwLCJpYXQiOjE1MDAwMTMxMjB9.uU5j1gRwH98zpy3DsUi3Skt_ZSQivfLeAjGyjonGuEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AcademiesAPI(1, 20, "", token) {

            @Override
            public void onResult(ResponseAcademiesModel academiesModel) {
                Log.d("data", "Academy is:" + academiesModel.getAcademies()[1].getName());
            }

            @Override
            public void onError() {

            }
        };

        new CoursesAPI(1, 20, "", token) {
            @Override
            public void onResult(ResponseCoursesModel coursesModel) {
                Log.d("data", "Course is:" + coursesModel.getCourses()[0].getTitle());
            }

            @Override
            public void onError() {

            }
        };

    }
}
