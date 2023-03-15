package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import p181jd.Intrinsics;

/* renamed from: kotlin.coroutines.jvm.internal.g */
/* loaded from: classes2.dex */
public final class DebugMetadata {
    /* renamed from: a */
    private static final void m20192a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final InterfaceC6759f m20191b(ContinuationImpl continuationImpl) {
        return (InterfaceC6759f) continuationImpl.getClass().getAnnotation(InterfaceC6759f.class);
    }

    /* renamed from: c */
    private static final int m20190c(ContinuationImpl continuationImpl) {
        try {
            Field declaredField = continuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(continuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m20189d(ContinuationImpl continuationImpl) {
        String str;
        Intrinsics.isThisObjectNull(continuationImpl, "<this>");
        InterfaceC6759f m20191b = m20191b(continuationImpl);
        if (m20191b == null) {
            return null;
        }
        m20192a(1, m20191b.m20193v());
        int m20190c = m20190c(continuationImpl);
        int i = m20190c < 0 ? -1 : m20191b.m20195l()[m20190c];
        String m20184b = C6760i.f18120a.m20184b(continuationImpl);
        if (m20184b == null) {
            str = m20191b.m20197c();
        } else {
            str = m20184b + '/' + m20191b.m20197c();
        }
        return new StackTraceElement(str, m20191b.m20194m(), m20191b.m20196f(), i);
    }
}
