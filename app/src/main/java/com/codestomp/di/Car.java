package com.codestomp.di;

import javax.inject.Inject;
import javax.inject.Named;

public class Car {


    @Inject
    public Engine engine ;
    @Inject
    public Body body;

    int  modelNum,engineNum;


    @Inject
    public Car(@Named("modelNum") int modelNum,@Named("engineNum") int engineNum) {
        this.modelNum=modelNum;
        this.engineNum=engineNum;

    }

    public  String getCarCreation()
    {
        return body.getBodyNumber()+ modelNum+ engine.getEngineNumber() + engineNum;
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
