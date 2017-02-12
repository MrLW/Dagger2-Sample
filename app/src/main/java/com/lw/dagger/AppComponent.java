package com.lw.dagger;

import android.content.Context;

import dagger.Component;

/**
 * Created by lw on 2017/2/11.
 */

@Component(modules = AppModule.class)
public interface AppComponent {
    // 向下层提交context
    Context providerContext();
}
