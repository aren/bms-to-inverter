package com.airepublic.bmstoinverter.core;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import jakarta.inject.Qualifier;

/**
 * The {@link Qualifier} to identify an inverter {@link PortProcessor}.
 */
@Qualifier
@Retention(RUNTIME)
@Documented
public @interface Inverter {

}
