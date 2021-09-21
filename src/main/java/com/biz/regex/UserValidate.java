package com.biz.regex;

@FunctionalInterface
public interface UserValidate<T>{
     boolean validate(T param);
        }