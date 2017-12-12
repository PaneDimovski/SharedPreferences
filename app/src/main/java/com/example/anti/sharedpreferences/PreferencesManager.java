package com.example.anti.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Anti on 12/12/2017.
 */

public class PreferencesManager {


  private static SharedPreferences getPreferences (Context c) {

      return c.getApplicationContext().getSharedPreferences( "MySharedPreffsFile", Activity.MODE_PRIVATE);

  }


  public  static String getFirstName(Context context)  {

      return getPreferences(context).getString("firstname","no name");

  }

  public static void setFirstName  (Context context, String firstName)  {

      getPreferences(context).edit().putString("firstname",firstName).apply();

  }
}
