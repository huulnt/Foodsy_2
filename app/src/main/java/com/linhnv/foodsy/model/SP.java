package com.linhnv.foodsy.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.linhnv.foodsy.R;

/**
 * Created by Huu on 28/06/2017.
 */

public class SP {
    Context _context;
    private static final String PREFS_FILE = "login";
    private static final int PREFS_MODE = Context.MODE_PRIVATE;
    private static final String KEY_USER = "user";
    private static final String KEY_PHONE = "phonenumber";

    public SP(Context context) {
        this._context = context;
    }

    public void setStateLogin(boolean value) {
        SharedPreferences prefs = _context.getSharedPreferences(PREFS_FILE, PREFS_MODE);
        SharedPreferences.Editor editor = prefs.edit();
        // write state login
        editor.putBoolean(KEY_USER, value);
        editor.commit();
    }

    public boolean getStateLogin() {
        SharedPreferences user = _context.getSharedPreferences(PREFS_FILE, PREFS_MODE);
        return user.getBoolean(KEY_USER, false);
    }
    public void setPhoneNumber(String value){
        SharedPreferences prefs = _context.getSharedPreferences(PREFS_FILE, PREFS_MODE);
        SharedPreferences.Editor editor = prefs.edit();
        // write a phone number
        editor.putString(KEY_PHONE, value);
        editor.commit();
    }
    public String getPhoneNumber() {
        SharedPreferences user = _context.getSharedPreferences(PREFS_FILE, PREFS_MODE);
        return user.getString(KEY_PHONE, "");
    }
}
