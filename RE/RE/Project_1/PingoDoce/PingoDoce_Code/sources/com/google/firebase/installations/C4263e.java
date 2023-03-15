package com.google.firebase.installations;

import com.google.android.gms.tasks.C3421e;
import p200ka.AbstractC6621d;

/* renamed from: com.google.firebase.installations.e */
/* loaded from: classes.dex */
class C4263e implements InterfaceC4266g {

    /* renamed from: a */
    final C3421e<String> f11599a;

    public C4263e(C3421e<String> c3421e) {
        this.f11599a = c3421e;
    }

    @Override // com.google.firebase.installations.InterfaceC4266g
    /* renamed from: a */
    public boolean mo28139a(AbstractC6621d abstractC6621d) {
        if (abstractC6621d.m20460l() || abstractC6621d.m20461k() || abstractC6621d.m20463i()) {
            this.f11599a.m30798e(abstractC6621d.mo20468d());
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC4266g
    /* renamed from: b */
    public boolean mo28138b(Exception exc) {
        return false;
    }
}
