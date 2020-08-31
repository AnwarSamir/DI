package com.codestomp.di;

import javax.inject.Inject;

public class Engine {


    @Inject
    public Engine() {
    }


    public String getEngineNumber()
    {
        return "Engine number is : 20192";
    }
}
