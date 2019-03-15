package com.rick.demointerviews.TestAOP;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AOPAnno {
}
