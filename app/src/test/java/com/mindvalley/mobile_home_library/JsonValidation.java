package com.mindvalley.mobile_home_library;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mindvalley.home_library.controller.apis.AcademiesAPI;
import com.mindvalley.home_library.model.AcademyModel;
import com.mindvalley.home_library.model.AuthorModel;
import com.mindvalley.home_library.model.ResponseAcademiesModel;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class JsonValidation {

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
    public void validateOneAuthor() {


        AuthorModel authorModel = null;
        try {
            authorModel = new Gson().fromJson(parseJsonFile("api_academies/jsonOneAuthor"), AuthorModel.class);
            Assert.assertNotNull(authorModel.getName());
            Assert.assertTrue(authorModel.getId() > 0);
            Assert.assertNotNull(authorModel.getName());
            Assert.assertTrue(authorModel.getName().length()> 0);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void validateSubscription() throws IOException {

        AcademyModel academy = new Gson().fromJson(parseJsonFile("api_academies/jsonSubscription"), AcademyModel.class);

        Assert.assertNotNull(academy.getName());
        Assert.assertTrue(academy.getName().length()>0);
        Assert.assertTrue(academy.getId() > 0);
        Assert.assertNotNull(academy.getTheme_color());
        Assert.assertTrue(academy.getTheme_color().startsWith("#"));
        Assert.assertTrue(academy.getTheme_color().length() >= 4);
        Assert.assertTrue(academy.isSubscription());

    }

    @Test
    public void validatePremium() throws IOException {

        AcademyModel academy = new Gson().fromJson(parseJsonFile("api_academies/jsonPremium"), AcademyModel.class);

        Assert.assertNotNull(academy.getName());
        Assert.assertTrue(academy.getId() > 0);
        Assert.assertNotNull(academy.getTheme_color());
        Assert.assertTrue(academy.getTheme_color().startsWith("#"));
        Assert.assertTrue(academy.getTheme_color().length() >= 4);
        Assert.assertFalse(academy.isSubscription());

    }

}