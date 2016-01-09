package com.github.zxh0.pbg2.proto.field.rules;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={FIELD})
public @interface Repeated {

    public int tag();
    public boolean packed() default false;
    public boolean deprecated() default false;

}
