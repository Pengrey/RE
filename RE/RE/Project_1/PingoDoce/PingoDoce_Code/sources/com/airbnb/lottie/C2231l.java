package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.l */
/* loaded from: classes.dex */
public final class C2231l<V> {

    /* renamed from: a */
    private final V f6487a;

    /* renamed from: b */
    private final Throwable f6488b;

    public C2231l(V v) {
        this.f6487a = v;
        this.f6488b = null;
    }

    /* renamed from: a */
    public Throwable m34305a() {
        return this.f6488b;
    }

    /* renamed from: b */
    public V m34304b() {
        return this.f6487a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2231l) {
            C2231l c2231l = (C2231l) obj;
            if (m34304b() == null || !m34304b().equals(c2231l.m34304b())) {
                if (m34305a() == null || c2231l.m34305a() == null) {
                    return false;
                }
                return m34305a().toString().equals(m34305a().toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m34304b(), m34305a()});
    }

    public C2231l(Throwable th2) {
        this.f6488b = th2;
        this.f6487a = null;
    }
}
