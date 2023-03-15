package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p078e7.C5013n;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes.dex */
public final class C2597i {
    /* renamed from: a */
    public static void m33085a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m33084b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m33083c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m33082d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb2.append("Must be called on ");
            sb2.append(name2);
            sb2.append(" thread, but got ");
            sb2.append(name);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: e */
    public static void m33081e(String str) {
        if (!C5013n.m25885a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static String m33080f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: g */
    public static String m33079g(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* renamed from: h */
    public static void m33078h() {
        m33077i("Must not be called on the main application thread");
    }

    /* renamed from: i */
    public static void m33077i(String str) {
        if (C5013n.m25885a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: j */
    public static <T> T m33076j(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: k */
    public static <T> T m33075k(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m33074l(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: m */
    public static void m33073m(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public static void m33072n(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
