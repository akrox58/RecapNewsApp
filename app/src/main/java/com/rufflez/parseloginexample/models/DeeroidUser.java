package com.rufflez.parseloginexample.models;

import android.location.Address;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by Bert on 6/27/2015.
 */
@ParseClassName("DeeroidUser")
public class DeeroidUser extends ParseObject {
    private String firstName;
    private String lastName;
    private String middleName;

    public String getFirstName() {
        return getString("firstName");
    }

    public void setFirstName(String firstName) {
        put("firstName", firstName);
    }

    public String getLastName() {
        return getString("lastName");
    }

    public void setLastName(String lastName) {
        put("lastName", lastName);
    }

    public String getMiddleName() {
        return getString("middleName");
    }

    public void setMiddleName(String middleName) {
        put("middleName", middleName);
    }
}
