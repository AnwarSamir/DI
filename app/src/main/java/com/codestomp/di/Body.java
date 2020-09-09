package com.codestomp.di;

import javax.inject.Inject;

public class Body {


    @Inject
    public Body() {
    }


    public String getBodyNumber()
    {
        return  "Model Number  is : ";
    }
}
