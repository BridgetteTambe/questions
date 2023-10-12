package org.example.Q118;

public @interface Resource {

    String name();
    int priority() default 0;
}


