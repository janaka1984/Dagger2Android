package com.gojek.dagger2android;

import dagger.Component;
import dagger.Module;

@Component(modules = RefrigeratorModule.class)
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
