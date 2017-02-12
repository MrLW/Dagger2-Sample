package com.lw.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    // 表明要注入的对象
//    @Named("context")
//    @Inject
//    Person person;
//
////    @Named("name")
//    @Inject
//    Person person2;

    @Inject
    Teacher teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appCom = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        // 子类依赖对象 ，并注入
        DaggerActivityComponent.builder()
                .appComponent(appCom)
                .activityModule(new ActivityModule())
                .build()
                .inject(this);


        // 构造桥梁对象
//        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule(this)).build();
//        component.inject(this);
    }
}
