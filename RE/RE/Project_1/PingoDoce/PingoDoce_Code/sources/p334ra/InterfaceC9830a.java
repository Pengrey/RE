package p334ra;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ra.a */
/* loaded from: classes.dex */
public @interface InterfaceC9830a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
