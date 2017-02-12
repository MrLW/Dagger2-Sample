package com.lw.dagger;

import dagger.Component;

/**
 * Created by lw on 2017/2/11.
 */
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    // 注入
    void inject(MainActivity activity);
}
