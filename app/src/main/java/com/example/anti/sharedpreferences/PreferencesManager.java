package com.example.anti.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

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

    public  static String getLastName(Context context)  {

        return getPreferences(context).getString("Lastname","no name");

    }

    public static void setLastName  (Context context, String lastName)  {

        getPreferences(context).edit().putString("Lastname",lastName).apply();

    }


    public  static String getAge(Context context)  {

        return getPreferences(context).getString("Age","no name");

    }

    public static void setAge  (Context context, String age)  {

        getPreferences(context).edit().putString("Age",age).apply();

    }
    public  static void setIsmale (boolean IsMale, Context c)  {

         getPreferences(c).edit().putBoolean("ISMALE", IsMale).apply();

    }

    public static boolean isMale  (Context c)  {

       return getPreferences(c).getBoolean("ISMALE" , false );

    }

    public static void addUser(User user, Context c)  {
        Gson gson = new Gson();
        String mapString= gson.toJson(user);
        getPreferences(c).edit().putString("user",mapString).apply();

    }

    public  static User getUser(Context c) {

      return  new Gson().fromJson(getPreferences(c).getString("user",""), User.class );
    }

    public static  void removeUser (Context c) {

      getPreferences(c).edit().remove("remove");

    }



}
