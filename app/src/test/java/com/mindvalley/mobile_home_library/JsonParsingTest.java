package com.mindvalley.mobile_home_library;

import com.mindvalley.home_library.controller.apis.AcademiesAPI;
import com.mindvalley.home_library.model.AcademiesModel;
import com.mindvalley.home_library.model.AuthorModel;
import com.mindvalley.home_library.model.ResponseAcademiesModel;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class JsonParsingTest {


    @Test
    public void validateAuthors(){

        AuthorModel authorModel=new AuthorModel(1,"Vishen Lakhiani",null);
        Assert.assertNotNull(authorModel.getName());
        Assert.assertTrue(authorModel.getId()>0);
    }

    @Test
    public void validateSubscription(){

        AcademiesModel academy=new AcademiesModel(1, "test", "domain", "", "#987A42", 2, "", 3, 1, 6, "", "published_asc", true, true, null, "");

        Assert.assertNotNull(academy.getName());
        Assert.assertTrue(academy.getId()>0);
        Assert.assertNotNull(academy.getTheme_color());
        Assert.assertTrue(academy.getTheme_color().startsWith("#"));
        Assert.assertTrue(academy.getTheme_color().length()>4);
        Assert.assertTrue(academy.isSubscription());

    }

    @Test
    public void validatePremium(){

        AcademiesModel academy=new AcademiesModel(1, "test", "domain", "", "#987A42", 2, "", 3, 1, 6, "", "published_asc", false, true, null, "");

        Assert.assertNotNull(academy.getName());
        Assert.assertTrue(academy.getId()>0);
        Assert.assertNotNull(academy.getTheme_color());
        Assert.assertTrue(academy.getTheme_color().startsWith("#"));
        Assert.assertTrue(academy.getTheme_color().length()>4);
        Assert.assertFalse(academy.isSubscription());

    }

    @Test
    public void validateAcademies() throws Exception {

        List<AcademiesModel> academies = new ArrayList<>();
        academies.add(new AcademiesModel(1, "test", "domain", "", "", 2, "", 3, 1, 6, "", "published_asc", false, true, getAuthors(), ""));
        academies.add(new AcademiesModel(1, "", "domain", "", "", 0, "", 3, 0, 2, "", "published_asc", true, false, getAuthors(), ""));

        Assert.assertNotNull(academies.get(0).getName());
        Assert.assertFalse(academies.get(1).isPurchased());
        Assert.assertEquals(1,academies.get(0).getAuthors().get(5).getId());
    }

    public List<AuthorModel> getAuthors() {
        List<AuthorModel> authors = new LinkedList<>();
        authors.add(new AuthorModel(1, "", ""));
        authors.add(new AuthorModel(0, "name", ""));
        authors.add(new AuthorModel(1, "name", ""));
        authors.add(new AuthorModel(2, "name", ""));
        authors.add(new AuthorModel(1, "name", ""));
        authors.add(new AuthorModel(1, "no name", ""));
        return authors;
    }
}