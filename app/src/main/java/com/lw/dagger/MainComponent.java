package com.lw.dagger;

import dagger.Component;

/**
 * Created by lw on 2017/2/11.
 */
@Component(modules = MainModule.class) // 作为桥梁，沟通调用者和依赖对象库
//@Singleton
public interface MainComponent {
    /**
     * 定义注入的方法
     */
    void inject(MainActivity activity);
}
