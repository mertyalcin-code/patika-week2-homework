package com.innova.qualifier;

import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QualifierCokluSecim {
	
}
