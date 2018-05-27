package com.souban.bdd.framework.page;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.souban.bdd.framework.driver.Driver;


public class PageFactory {
	private static final Logger logger = LoggerFactory.getLogger(PageFactory.class);

    public static <T> T getPage(final Class<T> valueType, final Driver driver) {


        String defaultPagePath = valueType.getName();
        Class<?> clazz = null;
        
        try {
            clazz = Class.forName(defaultPagePath);
        } catch (ClassNotFoundException e1) {
          logger.info("class " + defaultPagePath + " to create page");
        }

        Constructor<?> constructor = null;
        try {
            constructor = clazz.getConstructor(Driver.class);
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Object instance = null;
        try {
            instance = constructor.newInstance(driver);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return valueType.cast(instance);

    }
}
