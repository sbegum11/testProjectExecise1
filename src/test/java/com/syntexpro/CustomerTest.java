package com.syntexpro;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @BeforeEach
    void setUp(){
        Customer c2=new Customer();
    }

   @DisplayName("test  for customer")

   @Test
   void customerTest() {
       new Customer().setName("john");
       assertEquals("John", new Customer().getName());

   }
    @DisplayName("test  for size")
    @Test
    void testSize(){
        
    }

}