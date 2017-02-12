package com.lw.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lw on 2017/2/11.
 */

@Module
public class AppModule {

    private Context context ;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    Context providerContext(){
        return context ;
    }
}
