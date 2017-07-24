package com.mindvalley.mobile_home_library;

import com.google.gson.Gson;
import com.mindvalley.home_library.model.AuthorModel;
import com.mindvalley.home_library.model.CourseMetaModel;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 24/07/2017.
 */

public class JsonCourseParsingTest {

    private String parseJsonFile(String filePath) throws IOException {

        InputStream is = getClass().getClassLoader().getResourceAsStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        String json = sb.toString();
        return json;
    }

    @Test
    public void validateAuthors() {


        AuthorModel authorModel = null;
        try {
            authorModel = new Gson().fromJson(parseJsonFile("api_courses/jsonCourseAuthor"), AuthorModel.class);
            Assert.assertNotNull(authorModel.getName());
            Assert.assertTrue(authorModel.getId() > 0);
            Assert.assertTrue(authorModel.getId() == 161);
            Assert.assertTrue(authorModel.getAsset_cover_url() == null);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void validateCourseMeta() {

        CourseMetaModel course = null;
        try {
            course = new Gson().fromJson(parseJsonFile("api_courses/jsonCourse"), CourseMetaModel.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertNotNull(course.getTitle());
        Assert.assertTrue(course.getId() > 0);
        Assert.assertNotNull(course.getMain_color());
        Assert.assertTrue(!course.getMain_color().startsWith("#"));
        Assert.assertTrue(course.getMain_color().length() > 4);
        Assert.assertTrue(!course.is_completed());

    }

}
