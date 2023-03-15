package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2850ke;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* loaded from: classes.dex */
final class C3154c4 implements InterfaceC2850ke {

    /* renamed from: a */
    final /* synthetic */ C3176e4 f8363a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3154c4(C3176e4 c3176e4) {
        this.f8363a = c3176e4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2850ke
    /* renamed from: a */
    public final void mo31450a(int i, String str, List list, boolean z, boolean z2) {
        C3175e3 m31333q;
        int i2 = i - 1;
        if (i2 == 0) {
            m31333q = this.f8363a.f8410a.mo31116d().m31333q();
        } else if (i2 != 1) {
            if (i2 == 3) {
                m31333q = this.f8363a.f8410a.mo31116d().m31328v();
            } else if (i2 != 4) {
                m31333q = this.f8363a.f8410a.mo31116d().m31329u();
            } else if (z) {
                m31333q = this.f8363a.f8410a.mo31116d().m31325y();
            } else if (!z2) {
                m31333q = this.f8363a.f8410a.mo31116d().m31326x();
            } else {
                m31333q = this.f8363a.f8410a.mo31116d().m31327w();
            }
        } else if (z) {
            m31333q = this.f8363a.f8410a.mo31116d().m31330t();
        } else if (!z2) {
            m31333q = this.f8363a.f8410a.mo31116d().m31331s();
        } else {
            m31333q = this.f8363a.f8410a.mo31116d().m31332r();
        }
        int size = list.size();
        if (size == 1) {
            m31333q.m31397b(str, list.get(0));
        } else if (size == 2) {
            m31333q.m31396c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            m31333q.m31398a(str);
        } else {
            m31333q.m31395d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
