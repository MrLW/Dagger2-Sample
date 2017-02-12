package com.lw.dagger.module;

import com.lw.dagger.MainActivity;

import dagger.Component;

/**
 * Created by lw on 2017/2/12.
 */
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    //注入
    void inject(MainActivity activity) ;
}
