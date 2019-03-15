package com.rick.demointerviews.TestClasses;

import org.springframework.cglib.proxy.CallbackFilter;


import java.lang.reflect.Method;

public class CglibFilter implements CallbackFilter {

    @Override
    public int accept(Method method) {
        if ("run".equals(method.getName())){
            return 0;
        }
        return 1;
    }
}
