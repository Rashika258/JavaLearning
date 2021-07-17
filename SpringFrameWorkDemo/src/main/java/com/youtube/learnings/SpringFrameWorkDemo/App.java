package com.youtube.learnings.SpringFrameWorkDemo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Car car=new Car();
//        car.ride();
//        	Bike obj=new Bike();
//        	obj.ride();
        Vehicle obj=getBean("vehicle");
        obj.ride();
    }
}
