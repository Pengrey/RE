package me;

import android.content.Intent;
import ne.AbstractC7703b;
import p468yc.C13182l;

/* renamed from: me.a */
/* loaded from: classes2.dex */
public final class C7184a extends AbstractC7703b<C13182l<? extends Integer, ? extends Intent>> {

    /* renamed from: b */
    private final int f19010b;

    /* renamed from: c */
    private final Intent f19011c;

    public C7184a(int i, Intent intent) {
        this.f19010b = i;
        this.f19011c = intent;
    }

    @Override // ne.AbstractC7703b
    /* renamed from: c */
    public C13182l<Integer, Intent> mo17670b() {
        return new C13182l<>(Integer.valueOf(this.f19010b), this.f19011c);
    }
}
