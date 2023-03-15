package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.i8 */
/* loaded from: classes.dex */
final class C2812i8 {

    /* renamed from: d */
    private static final C2812i8 f7786d = new C2812i8(true);

    /* renamed from: a */
    final C2894na f7787a = new C2782ga(16);

    /* renamed from: b */
    private boolean f7788b;

    /* renamed from: c */
    private boolean f7789c;

    private C2812i8() {
    }

    /* renamed from: a */
    public static C2812i8 m32568a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m32565d(com.google.android.gms.internal.measurement.InterfaceC2796h8 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.measurement.hb r0 = r4.zzb()
            com.google.android.gms.internal.measurement.C3048x8.m31825e(r5)
            com.google.android.gms.internal.measurement.hb r1 = com.google.android.gms.internal.measurement.EnumC2799hb.zza
            com.google.android.gms.internal.measurement.ib r1 = com.google.android.gms.internal.measurement.EnumC2815ib.INT
            com.google.android.gms.internal.measurement.ib r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.InterfaceC2973s9
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.AbstractC2955r7
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.measurement.hb r4 = r4.zzb()
            com.google.android.gms.internal.measurement.ib r4 = r4.zza()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2812i8.m32565d(com.google.android.gms.internal.measurement.h8, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void m32567b() {
        if (this.f7788b) {
            return;
        }
        this.f7787a.mo32422b();
        this.f7788b = true;
    }

    /* renamed from: c */
    public final void m32566c(InterfaceC2796h8 interfaceC2796h8, Object obj) {
        if (interfaceC2796h8.m32600a()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m32565d(interfaceC2796h8, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m32565d(interfaceC2796h8, obj);
        }
        this.f7787a.put(interfaceC2796h8, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C2812i8 c2812i8 = new C2812i8();
        for (int i = 0; i < this.f7787a.m32421d(); i++) {
            Map.Entry m32416k = this.f7787a.m32416k(i);
            c2812i8.m32566c((InterfaceC2796h8) m32416k.getKey(), m32416k.getValue());
        }
        for (Map.Entry entry : this.f7787a.m32420e()) {
            c2812i8.m32566c((InterfaceC2796h8) entry.getKey(), entry.getValue());
        }
        c2812i8.f7789c = this.f7789c;
        return c2812i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2812i8) {
            return this.f7787a.equals(((C2812i8) obj).f7787a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7787a.hashCode();
    }

    private C2812i8(boolean z) {
        m32567b();
        m32567b();
    }
}
