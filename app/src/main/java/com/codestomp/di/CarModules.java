package com.codestomp.di;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModules {


    @Provides
    Engine provideEngine()
    {
        return  new Engine();
    }



}
