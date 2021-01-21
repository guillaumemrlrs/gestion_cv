package fr.guillaumemrlrs.cvbril.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserLightTests {

    @Test
    public void testGetAge(){
        int expected =27;

        UserLight user = new UserLight();
        user.setBirthdate(LocalDate.of(1993,12,13));
        Assertions.assertEquals(expected,user.getAge());


    }

}
