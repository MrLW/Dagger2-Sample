package com.lw.dagger.helloWord;

import com.lw.dagger.bean.Person;
import com.lw.dagger.bean.Teacher;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lw on 2017/2/12.
 */
@Module // 提供依赖对象的实例
public class MainModule {

    private String name;

    public MainModule(String name) {
        this.name = name;
    }

    @Provides
    String providerName() {
        return name;
    }

    @Provides
    @Singleton
    Person providerPerson() {
        return new Person();
    }

    @Provides
    Teacher providerTeacher(String name) {
        return new Teacher(name);
    }

}
