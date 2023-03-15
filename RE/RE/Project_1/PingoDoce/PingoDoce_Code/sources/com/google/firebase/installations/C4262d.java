package com.google.firebase.installations;

import com.google.android.gms.tasks.C3421e;
import p200ka.AbstractC6621d;

/* renamed from: com.google.firebase.installations.d */
/* loaded from: classes.dex */
class C4262d implements InterfaceC4266g {

    /* renamed from: a */
    private final C4267h f11597a;

    /* renamed from: b */
    private final C3421e<AbstractC4264f> f11598b;

    public C4262d(C4267h c4267h, C3421e<AbstractC4264f> c3421e) {
        this.f11597a = c4267h;
        this.f11598b = c3421e;
    }

    @Override // com.google.firebase.installations.InterfaceC4266g
    /* renamed from: a */
    public boolean mo28139a(AbstractC6621d abstractC6621d) {
        if (!abstractC6621d.m20461k() || this.f11597a.m28132f(abstractC6621d)) {
            return false;
        }
        this.f11598b.m30800c(AbstractC4264f.m28147a().mo28142b(abstractC6621d.mo20470b()).mo28140d(abstractC6621d.mo20469c()).mo28141c(abstractC6621d.mo20464h()).mo28143a());
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC4266g
    /* renamed from: b */
    public boolean mo28138b(Exception exc) {
        this.f11598b.m30799d(exc);
        return true;
    }
}
