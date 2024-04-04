package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;
public class PetTest {
    @Test
public void testPetConstructor(){
        String expectedName="name";
        Pet pet=new Pet();
        Assert.assertNotNull(pet);
    }
@Test
    public void testPetConstructorName(){
        String expectedName="name";
        Pet pet=new Pet();
        Assert.assertEquals(expectedName,pet.getName());
    }

    @Test
    public void testPetSpeak(){
        String expectedName="name";
        Pet pet=new Pet();
        String expectedSpeak="moo";
        Assert.assertEquals(expectedSpeak,pet.Speak());
    }


}
