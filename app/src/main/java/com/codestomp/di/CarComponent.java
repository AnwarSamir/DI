package com.codestomp.di;

import dagger.Component;

@Component
public interface CarComponent {
    Car buildCar();
}
