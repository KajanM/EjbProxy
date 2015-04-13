package com.arachchi.ejb.core.remote.ejb;

import com.arachchi.ejb.core.service.ExampleTest;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by nuran on 4/13/15.
 */
@Stateless
public class EjbServiceBean implements EjbServiceLocal,EjbServiceRemote {

    @Inject
    ExampleTest exampleTest;
    @Override
    public void test() { exampleTest.test();  }
}
