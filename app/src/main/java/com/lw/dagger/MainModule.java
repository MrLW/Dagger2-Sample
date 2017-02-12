package com.lw.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lw on 2017/2/11.
 */

@Module
public class MainModule {

    private Context context;

    public MainModule(Context context) {
        this.context = context;
    }

    /**
     * // 表明该方法提供依赖对象
     */
    @Provides
    Context providersContext() {
        return context;
    }

    @Provides
//    @Singleton
    Person providersPerson(Context context) {
        return new Person(context);
    }

    @Provides
    Teacher providerTeacher() {
        return new Teacher();
    }
}
