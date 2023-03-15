package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.C2760f4;
import com.google.android.gms.internal.measurement.C2920p4;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0088u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.z8 */
/* loaded from: classes.dex */
public final class C3405z8 {

    /* renamed from: a */
    C2920p4 f9158a;

    /* renamed from: b */
    List f9159b;

    /* renamed from: c */
    List f9160c;

    /* renamed from: d */
    long f9161d;

    /* renamed from: e */
    final /* synthetic */ C3137a9 f9162e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3405z8(C3137a9 c3137a9, C0088u c0088u) {
        this.f9162e = c3137a9;
    }

    /* renamed from: b */
    private static final long m30823b(C2760f4 c2760f4) {
        return ((c2760f4.m32738D() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m30824a(long j, C2760f4 c2760f4) {
        C2597i.m33076j(c2760f4);
        if (this.f9160c == null) {
            this.f9160c = new ArrayList();
        }
        if (this.f9159b == null) {
            this.f9159b = new ArrayList();
        }
        if (this.f9160c.size() <= 0 || m30823b((C2760f4) this.f9160c.get(0)) == m30823b(c2760f4)) {
            long mo32109f = this.f9161d + c2760f4.mo32109f();
            this.f9162e.m31497T();
            if (mo32109f >= Math.max(0, ((Integer) C3339t2.f8927j.m31018a(null)).intValue())) {
                return false;
            }
            this.f9161d = mo32109f;
            this.f9160c.add(c2760f4);
            this.f9159b.add(Long.valueOf(j));
            int size = this.f9160c.size();
            this.f9162e.m31497T();
            return size < Math.max(1, ((Integer) C3339t2.f8929k.m31018a(null)).intValue());
        }
        return false;
    }
}
