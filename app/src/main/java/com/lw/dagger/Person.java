package com.lw.dagger;

import android.content.Context;
import android.util.Log;

/**
 * Created by lw on 2017/2/11.
 */

public class Person {

    private Context context ;

    public Person(Context context) {
        this.context = context ;
        Log.i("dagger", "person create!!!");
        Log.i("dagger--context","create") ;
    }

    public Person(String name){
        Log.i("dagger--name",name);
    }
}
