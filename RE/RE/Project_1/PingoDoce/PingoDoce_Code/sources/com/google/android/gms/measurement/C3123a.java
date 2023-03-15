package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.measurement.internal.C3233j6;
import com.google.android.gms.measurement.internal.C3242k4;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.a */
/* loaded from: classes.dex */
final class C3123a extends AbstractC3126d {

    /* renamed from: a */
    private final C3242k4 f8286a;

    /* renamed from: b */
    private final C3233j6 f8287b;

    public C3123a(C3242k4 c3242k4) {
        super(null);
        C2597i.m33076j(c3242k4);
        this.f8286a = c3242k4;
        this.f8287b = c3242k4.m31129I();
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: c */
    public final String mo28470c() {
        return this.f8287b.m31167X();
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: g */
    public final String mo28469g() {
        return this.f8287b.m31166Y();
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: l */
    public final String mo28468l() {
        return this.f8287b.m31165Z();
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: m */
    public final String mo28467m() {
        return this.f8287b.m31167X();
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: n */
    public final int mo28466n(String str) {
        this.f8287b.m31172S(str);
        return 25;
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: o */
    public final void mo28465o(String str) {
        this.f8286a.m31095y().m30831l(str, this.f8286a.mo31115e().mo25912c());
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: p */
    public final void mo28464p(String str, String str2, Bundle bundle) {
        this.f8286a.m31129I().m31157h0(str, str2, bundle);
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: q */
    public final List mo28463q(String str, String str2) {
        return this.f8287b.m31163b0(str, str2);
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: r */
    public final Map mo28462r(String str, String str2, boolean z) {
        return this.f8287b.m31162c0(str, str2, z);
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: s */
    public final void mo28461s(String str) {
        this.f8286a.m31095y().m30830m(str, this.f8286a.mo31115e().mo25912c());
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: t */
    public final void mo28460t(Bundle bundle) {
        this.f8287b.m31187D(bundle);
    }

    @Override // p009a8.InterfaceC0085r
    /* renamed from: u */
    public final void mo28459u(String str, String str2, Bundle bundle) {
        this.f8287b.m31153r(str, str2, bundle);
    }

    @Override // p009a8.InterfaceC0085r
    public final long zzb() {
        return this.f8286a.m31124N().m31276r0();
    }
}
