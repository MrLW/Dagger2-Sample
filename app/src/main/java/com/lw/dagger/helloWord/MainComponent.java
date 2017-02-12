package com.lw.dagger.helloWord;

import com.lw.dagger.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lw on 2017/2/12.
 */
// 作为桥梁，沟通调用者和依赖对象库
@Component(modules = MainModule.class)
@Singleton
public interface MainComponent {

    void inject(MainActivity activity);
}
