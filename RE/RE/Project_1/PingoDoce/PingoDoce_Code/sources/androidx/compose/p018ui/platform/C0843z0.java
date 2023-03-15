package androidx.compose.p018ui.platform;

import java.util.Arrays;
import p181jd.C6429c0;
import p181jd.Intrinsics;

/* compiled from: JvmActuals.jvm.kt */
/* renamed from: androidx.compose.ui.platform.z0 */
/* loaded from: classes.dex */
public final class C0843z0 {
    /* renamed from: a */
    public static final Object m39451a(Object obj) {
        Intrinsics.isThisObjectNull(obj, "<this>");
        return obj.getClass();
    }

    /* renamed from: b */
    public static final String m39450b(Object obj, String str) {
        Intrinsics.isThisObjectNull(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        sb2.append(format);
        return sb2.toString();
    }
}
