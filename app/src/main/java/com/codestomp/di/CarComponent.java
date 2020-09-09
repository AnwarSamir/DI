package com.codestomp.di;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {CarModules.class})
public interface CarComponent {
    Car buildCar();

    void inject(MainActivity mainActivity);

    // tell dagger this component builder not your own Builder
    @Component.Builder
    interface  Builder
    {

        @BindsInstance
        Builder modelNum(@Named("modelNum") int modelNum);

        @BindsInstance
        Builder engineNum(@Named("engineNum") int engineNum);
        CarComponent build();
    };
}
