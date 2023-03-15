package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2465d;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public final class C2485b<O extends C2461a.InterfaceC2465d> {

    /* renamed from: a */
    private final int f7204a;

    /* renamed from: b */
    private final C2461a<O> f7205b;

    /* renamed from: c */
    private final O f7206c;

    /* renamed from: d */
    private final String f7207d;

    private C2485b(C2461a<O> c2461a, O o, String str) {
        this.f7205b = c2461a;
        this.f7206c = o;
        this.f7207d = str;
        this.f7204a = C13701c.m574b(c2461a, o, str);
    }

    /* renamed from: a */
    public static <O extends C2461a.InterfaceC2465d> C2485b<O> m33461a(C2461a<O> c2461a, O o, String str) {
        return new C2485b<>(c2461a, o, str);
    }

    /* renamed from: b */
    public final String m33460b() {
        return this.f7205b.m33503c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2485b) {
            C2485b c2485b = (C2485b) obj;
            return C13701c.m575a(this.f7205b, c2485b.f7205b) && C13701c.m575a(this.f7206c, c2485b.f7206c) && C13701c.m575a(this.f7207d, c2485b.f7207d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7204a;
    }
}
