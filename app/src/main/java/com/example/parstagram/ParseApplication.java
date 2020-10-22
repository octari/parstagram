package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("t6R2oNDgzWwLBlfJAkXOpM75wGO9HrN4kQ9gH98z")
                .clientKey("QdphkKI7o32jZrno9HbIRH7AVT7aghN3vT1iD7Tk")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
