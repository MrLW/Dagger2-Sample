package com.lw.dagger.bean;

import android.content.Context;
import android.util.Log;

/**
 * Created by lw on 2017/2/11.
 */

public class Teacher {

    public Teacher(String name) {
        Log.i("dagger--teacher", "Teacher create!!!" + name);
    }

    public Teacher(Context context) {
        Log.i("dagger--teacher", "context create!!!");
    }
}
