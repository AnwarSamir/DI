package com.codestomp.di;

import javax.inject.Inject;

public class Car {


    private  Engine engine ;
    private Body body;


    // constructor injection
    @Inject
    public Car(Engine engine,Body body) {
        this.body=body;
        this.engine=engine;
    }
}
