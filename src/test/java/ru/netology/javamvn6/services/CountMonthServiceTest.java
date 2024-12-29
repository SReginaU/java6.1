 package ru.netology.javamvn6.services;

 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;

 import org.junit.jupiter.api.Assertions.*;

 class CountMonthServiceTest {

     @Test
     public void testCalculateCase1() {
   //      Arrange
         CountMonthService cervice = new CountMonthService();
         int income = 10_000;
         int expenses = 3_000;
         int threshold = 20_000;

   //      Act
         CountMonthService service;
         int actual = service.calculate(income, expenses, threshold);
         int expected = 3;

   //      Assert
         Assertions Assertions;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void testCalculateCase2() {
         //      Arrange
         CountMonthService cervice = new CountMonthService();
         int income = 100_000;
         int expenses = 60_000;
         int threshold = 150_000;

         //      Act
         CountMonthService service;
         int actual = service.calculate(income, expenses, threshold);
         int expected = 2;

         //      Assert
         Assertions Assertions;
         Assertions.assertEquals(expected, actual);
     }





