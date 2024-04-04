package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;


public class DogTest {
    @Test
    public void DogConstructorTest(){
        Dog dog = new Dog();
        Assert.assertNotNull(dog);
    }
    @Test
    public void DogNameTest(){
        String Expected="name";
        Dog dog = new Dog(Expected);
        String Actual= dog.getName();
        Assert.assertEquals(Expected,Actual);
    }
    @Test
    public void testDogSpeak(){
        String Expected="Woof";
        Dog dog = new Dog();
        Assert.assertEquals(Expected,dog.Speak());
    }

}

