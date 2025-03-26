////package com.demo.service;
////
////import org.junit.runner.RunWith;
////import org.mockito.runners.MockitoJUnitRunner;
////
////@RunWith(MockitoJUnitRunner.class)
////public class EmailServiceTest {
////
////}
//package com.demo.service;
//import com.demo.domain.Order;
//import com.demo.service.EmailService;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class EmailServiceTest{
//    Order order=new Order();
//    EmailService es=new EmailService();
//
//
//    @Test(expected=RuntimeException.class)
//    public void sendEmailTest(){
//        es.sendEmail(order);
//        assertFalse(order.isCustomerNotified());
//    }
//
//    @Test
//    public void sendEmailTest2(){
//
//        assertTrue(es.sendEmail(order,"prashant"));
//        assertTrue(order.isCustomerNotified());
//    }
//
//    @Test
//    public void getInstanceTest(){
//        EmailService es1=EmailService.getInstance();
//        EmailService es2=EmailService.getInstance();
//        assertSame(es1,es2);
//        assertNotNull(es1);
//        assertNotNull(es2);
//
//    }
//
//}