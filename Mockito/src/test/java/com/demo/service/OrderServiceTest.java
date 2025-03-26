//package com.demo.service;
//
//import com.demo.domain.Order;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class OrderServiceTest {
//    OrderService os=new OrderService();
//    EmailService es=new EmailService();
//    Order order=new Order(2,"Maggi",14);
//    @Test
//    public void getInstanceTest(){
//        OrderService os1=OrderService.getInstance();
//        OrderService os2=OrderService.getInstance();
//        assertSame(os1,os2);
//        assertNotNull(os1);
//        assertNotNull(os2);
//    }
//
//    @Test(expected=RuntimeException.class)
//    public void placeOrder(){
//        os.placeOrder(order);
//        assertEquals(16.8,order.getPriceWithTax(),0.0001f);
//        assertFalse(order.isCustomerNotified());
//        assertTrue(order.isCustomerNotified());
//    }
//
//    @Test
//    public void placeOrder2(){
//        assertTrue(os.placeOrder(order,"TOTHENEW"));
//        assertEquals(16.8,order.getPriceWithTax(),0.0001f);
//        assertTrue(order.isCustomerNotified());
//
//
//    }
//}