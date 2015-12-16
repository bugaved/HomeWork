package com.sportshop.logic;

import java.lang.annotation.Retention;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface DaoAnnotation
{
    String daoName();
}
