package com.codestomp.di;

import dagger.Component;

@Component(modules = {CarModules.class})
public interface CarComponent {
    Car buildCar();

    void inject(MainActivity mainActivity);
}
