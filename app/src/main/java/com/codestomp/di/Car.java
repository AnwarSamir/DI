package com.codestomp.di;

import javax.inject.Inject;

public class Car {


    @Inject
    public Engine engine ;
    @Inject
    public Body body;



    @Inject
    public Car() {

    }

    public  String getCarCreation()
    {
        return body.getBodyNumber() + engine.getEngineNumber();
    }

    @Inject
    public String testEngine()
    {
        return  "Engine Test Success >> \n";
    }

    @Inject
    public String testBody()
    {
        return "Body Test Success >> \n";
    }
}
