package hz.slava.testreport.mvn;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void firstTest(){
        Assert.assertTrue("true should be true :)", true);
    }

    @Test
    public void secondTest(){
        Assert.assertFalse("false should be false :)", false);
    }

    @Test
    public void thirdTest(){
        Assert.assertFalse("false should be false :)", false);
    }

}
