package com.lw.dagger.module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lw on 2017/2/12.
 */
@Module
public class AppModule {
    private String name;

    public AppModule(String name) {
        this.name = name;
    }

    @Provides
    String providerName() {
        return name;
    }
}
