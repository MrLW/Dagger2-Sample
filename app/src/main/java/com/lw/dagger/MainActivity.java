package com.lw.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lw.dagger.bean.Teacher;
import com.lw.dagger.module.ActivityModule;
import com.lw.dagger.module.AppComponent;
import com.lw.dagger.module.AppModule;
import com.lw.dagger.module.DaggerActivityComponent;
import com.lw.dagger.module.DaggerAppComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

//    @Inject
//    Person person;
//    @Inject
//    Person person2 ;
//
    @Named("context")
    @Inject
    Teacher teacher1 ;

    @Named("name")
    @Inject
    Teacher teacher2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        System.out.println("是否是单例：" + (person == person2 ));

        // 构造桥梁对象
//        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule("李文")).build() ;
//        //注入
//        component.inject(this);

        // 依赖对象　Component
        AppComponent appCom = DaggerAppComponent.builder().appModule(new AppModule("李文")).build();

        // 子类依赖对象 ，并注入
        DaggerActivityComponent.builder()
                .appComponent(appCom)
                .activityModule(new ActivityModule())
                .build()
                .inject(this);


    }
}
