package mypack;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@ interface Descriptor
{
String developer();
String purpose();
}
