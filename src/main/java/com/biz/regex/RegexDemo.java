package com.biz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        RegexDemo regexDemo=new RegexDemo();
        regexDemo.firstName();
        regexDemo.lastName();
        regexDemo.email();
    }
    public void firstName(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name");
        String input=sc.next();
        String regex="^[a-zA-Z]*$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
    public void lastName(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last name");
        String input=sc.next();
        String regex="^[a-zA-Z]*$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
    public void email(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter email");
        String input=sc.next();
        String regex="^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}+.([a-z]{2,3})$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
