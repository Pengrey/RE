package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.d3 */
/* loaded from: classes.dex */
public final class RunnableC3164d3 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ Object f8378A;

    /* renamed from: B */
    final /* synthetic */ C3197g3 f8379B;

    /* renamed from: w */
    final /* synthetic */ int f8380w;

    /* renamed from: x */
    final /* synthetic */ String f8381x;

    /* renamed from: y */
    final /* synthetic */ Object f8382y;

    /* renamed from: z */
    final /* synthetic */ Object f8383z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3164d3(C3197g3 c3197g3, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f8379B = c3197g3;
        this.f8380w = i;
        this.f8381x = str;
        this.f8382y = obj;
        this.f8383z = obj2;
        this.f8378A = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        C3340t3 m31132F = this.f8379B.f8410a.m31132F();
        if (m31132F.m31343n()) {
            C3197g3 c3197g3 = this.f8379B;
            c = c3197g3.f8447c;
            if (c == 0) {
                if (c3197g3.f8410a.m31094z().m31367H()) {
                    C3197g3 c3197g32 = this.f8379B;
                    c3197g32.f8410a.mo31114f();
                    c3197g32.f8447c = 'C';
                } else {
                    C3197g3 c3197g33 = this.f8379B;
                    c3197g33.f8410a.mo31114f();
                    c3197g33.f8447c = 'c';
                }
            }
            C3197g3 c3197g34 = this.f8379B;
            j = c3197g34.f8448d;
            if (j < 0) {
                c3197g34.f8410a.m31094z().m31357q();
                c3197g34.f8448d = 55005L;
            }
            char charAt = "01VDIWEA?".charAt(this.f8380w);
            C3197g3 c3197g35 = this.f8379B;
            c2 = c3197g35.f8447c;
            j2 = c3197g35.f8448d;
            String m31342A = C3197g3.m31342A(true, this.f8381x, this.f8382y, this.f8383z, this.f8378A);
            StringBuilder sb2 = new StringBuilder(m31342A.length() + 24);
            sb2.append("2");
            sb2.append(charAt);
            sb2.append(c2);
            sb2.append(j2);
            sb2.append(":");
            sb2.append(m31342A);
            String sb3 = sb2.toString();
            if (sb3.length() > 1024) {
                sb3 = this.f8381x.substring(0, 1024);
            }
            C3318r3 c3318r3 = m31132F.f8960d;
            if (c3318r3 != null) {
                c3318r3.m31029b(sb3, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f8379B.m31340C(), "Persisted config not initialized. Not logging error/warn");
    }
}
