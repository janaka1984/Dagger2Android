package com.gojek.dagger2android;

import dagger.Module;
import dagger.Provides;

@Module
public class RefrigeratorModule {
    public RefrigeratorModule(){}

    @Provides
    String provideEggs(){
        return "2 eggs";
    }
}
