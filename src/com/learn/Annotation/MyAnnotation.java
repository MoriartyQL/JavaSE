package com.learn.Annotation;

public @interface MyAnnotation {
    String value() default "hello";
}
