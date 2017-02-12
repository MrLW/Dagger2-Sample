package com.lw.dagger.bean;

import android.content.Context;
import android.util.Log;

/**
 * Created by lw on 2017/2/11.
 */

public class Person {

    private Context context;

    public Person() {
        Log.i("dagger--", "无参构造函数");
    }

    public Person(Context context) {
        this.context = context;
        Log.i("dagger--context", "create");
    }

    public Person(String name) {
        Log.i("dagger--name", name);
    }
}
