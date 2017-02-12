package com.lw.dagger;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lw on 2017/2/11.
 * 下层module
 */
@Module
public class ActivityModule {

    @Named("Context") // 通过上下文创建Person
    @Provides
    Person providerPerson(Context context) {
        return new Person(context);
    }

    @Named("name")
    Person providerPersonName(){
        return new Person("李文");
    }
}
