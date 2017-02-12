package com.lw.dagger.module;

import dagger.Component;

/**
 * Created by lw on 2017/2/12.
 */
@Component(modules = AppModule.class)
public interface AppComponent {
    String providerName();
}
