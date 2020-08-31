package com.EPAMPractice;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdPractice {

   ArrayList userList = new ArrayList();

    public void addData(){
        userList.add(25);
        userList.add(26);
        userList.add(27);
        userList.add(25);

       /* userList.forEach(user ->{
            System.out.println(user);
        });*/

        Stack<Integer> nameStack = new Stack<Integer>();
        nameStack.push(56);
        nameStack.push(45);


        /*nameStack.forEach(value->{
            if (value.intValue() == 45){
                nameStack.pop();
                System.out.println(nameStack);
            }
        });*/

        int arr[] ={1,1,2,2,3,3,4};
       // Arrays.stream(arr).distinct().forEach(System.out::println);
        Arrays.stream(arr).forEach(System.out::println);



    }



}
