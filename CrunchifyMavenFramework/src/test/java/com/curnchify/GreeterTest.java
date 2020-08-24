package com.curnchify;

import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

	private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        Assert.assertEquals(greeter.sayHello(), new String("Hello"));
        ///assertThat(greeter.sayHello(), containsString("Hello"));
    }
    
}
