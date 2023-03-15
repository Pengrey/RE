package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Metadata.kt */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface Metadata {
    /* renamed from: bv */
    int[] m20209bv() default {1, 0, 3};

    /* renamed from: d1 */
    String[] m20208d1() default {};

    /* renamed from: d2 */
    String[] m20207d2() default {};

    /* renamed from: k */
    int m20206k() default 1;

    /* renamed from: mv */
    int[] m20205mv() default {};

    /* renamed from: pn */
    String m20204pn() default "";

    /* renamed from: xi */
    int m20203xi() default 0;

    /* renamed from: xs */
    String m20202xs() default "";
}
