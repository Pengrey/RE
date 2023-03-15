package androidx.core.p020os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

@Deprecated
/* renamed from: androidx.core.os.i */
/* loaded from: classes.dex */
public final class C1020i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TraceCompat.java */
    /* renamed from: androidx.core.os.i$a */
    /* loaded from: classes.dex */
    public static class C1021a {
        /* renamed from: a */
        static void m38738a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m38737b() {
            Trace.endSection();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 18 || i >= 29) {
            return;
        }
        try {
            Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e);
        }
    }

    /* renamed from: a */
    public static void m38740a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C1021a.m38738a(str);
        }
    }

    /* renamed from: b */
    public static void m38739b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C1021a.m38737b();
        }
    }
}
