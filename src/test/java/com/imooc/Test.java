package com.imooc;

public class Test {
    @org.junit.Test
    public void getNumber(){
        int index=0;
        int count = 0;
        int number=0;
        while(count<index){
            number++;
            if(getFlag(number)){
                count++;
            }
        }
        System.out.println(number);
    }
    public static boolean getFlag(int number){
        while (number%2==0){
            number=number/2;
        }
        while (number%3==0){
            number=number/3;
        }
        while (number%5==0){
            number=number/5;
        }
        return number==1?true:false;
    }

    @org.junit.Test
    public void getCount(){
        int number=2;
        if(number%2==0){

        }
        System.out.println(number);
    }
}
