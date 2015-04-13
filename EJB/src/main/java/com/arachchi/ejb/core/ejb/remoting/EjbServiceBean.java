package com.arachchi.ejb.core.ejb.remoting;

import com.arachchi.ejb.core.service.ExampleTest;

import javax.inject.Inject;

/**
 * Created by nuran on 4/13/15.
 */
public class EjbServiceBean implements EjbServiceLocal,EjbServiceRemote {

    @Inject
    ExampleTest exampleTest;
    @Override
    public void test() { exampleTest.test();  }
}
