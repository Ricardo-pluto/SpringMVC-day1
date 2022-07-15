package org.RicardoPluto;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class SpringTest extends BaseTest{
    @Autowired
    private Date date;
    @Test
    public void test() throws Exception{
        System.out.println(date);
    }
}
