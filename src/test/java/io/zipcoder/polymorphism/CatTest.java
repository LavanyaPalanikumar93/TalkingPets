package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;


public class CatTest {
@Test
public void CatConstructorTest(){
    Cat cat = new Cat();
    Assert.assertNotNull(cat);
}
@Test
    public void CatNameTest(){
    String Expected="name";
    Cat cat=new Cat(Expected);
    String Actual= cat.getName();
    Assert.assertEquals(Expected,Actual);
}
@Test
    public void testCatSpeak(){
    String Expected="Meow";
    Cat cat=new Cat();
    Assert.assertEquals(Expected,cat.Speak());
}

}
