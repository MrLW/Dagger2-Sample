package com.lw.dagger.module;

import android.content.Context;

import com.lw.dagger.bean.Teacher;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lw on 2017/2/12.
 */
@Module
public class ActivityModule {

    @Named("context")
    @Provides
    Teacher providerTeacherContext(Context context) {
        return new Teacher(context);
    }

    @Named("name")
    @Provides
    Teacher providerTeacherName(String name) {
        return new Teacher(name);
    }
}
