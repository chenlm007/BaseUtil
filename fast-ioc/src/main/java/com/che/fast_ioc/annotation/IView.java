package com.che.fast_ioc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Zane on 15/12/1.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface IView {
    //默认字段，使用时：@IView(R.id.tv)
    int value();

    //其它字段，使用时：@IView(id=R.id.tv)
//    int id() default 0;
}


