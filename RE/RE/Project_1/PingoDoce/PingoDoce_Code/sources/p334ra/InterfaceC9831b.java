package p334ra;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ra.b */
/* loaded from: classes.dex */
public @interface InterfaceC9831b {
    boolean nullSafe() default true;

    Class<?> value();
}
