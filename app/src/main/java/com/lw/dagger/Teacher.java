package com.lw.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by lw on 2017/2/11.
 */

public class Teacher {

    @Inject
    public Teacher() {
        Log.i("dagger", "Teacher create!!!");
    }
}
