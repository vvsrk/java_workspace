package chapter6;

import java.lang.annotation.*;

/**
 * Indicates that the annotated method is a test method. Use only on
 * parameterless static methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
	//Class<? extends Exception> value();
	Class<? extends Exception>[] value();
}
