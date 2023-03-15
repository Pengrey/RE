package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import p031b9.C1866w;
import p031b9.InterfaceC1867x;

/* renamed from: com.google.android.play.core.assetpacks.s1 */
/* loaded from: classes.dex */
public final class C3898s1 implements InterfaceC1867x<C3894r1> {

    /* renamed from: a */
    private final InterfaceC1867x<String> f11134a;

    /* renamed from: b */
    private final InterfaceC1867x<C3900t> f11135b;

    /* renamed from: c */
    private final InterfaceC1867x<C3909v0> f11136c;

    /* renamed from: d */
    private final InterfaceC1867x<Context> f11137d;

    /* renamed from: e */
    private final InterfaceC1867x<C3837d2> f11138e;

    /* renamed from: f */
    private final InterfaceC1867x<Executor> f11139f;

    public C3898s1(InterfaceC1867x<String> interfaceC1867x, InterfaceC1867x<C3900t> interfaceC1867x2, InterfaceC1867x<C3909v0> interfaceC1867x3, InterfaceC1867x<Context> interfaceC1867x4, InterfaceC1867x<C3837d2> interfaceC1867x5, InterfaceC1867x<Executor> interfaceC1867x6) {
        this.f11134a = interfaceC1867x;
        this.f11135b = interfaceC1867x2;
        this.f11136c = interfaceC1867x3;
        this.f11137d = interfaceC1867x4;
        this.f11138e = interfaceC1867x5;
        this.f11139f = interfaceC1867x6;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3894r1 mo1547c() {
        String mo1547c = this.f11134a.mo1547c();
        C3900t mo1547c2 = this.f11135b.mo1547c();
        C3909v0 mo1547c3 = this.f11136c.mo1547c();
        Context mo1547c4 = ((C3927z2) this.f11137d).mo1547c();
        C3837d2 mo1547c5 = this.f11138e.mo1547c();
        return new C3894r1(mo1547c != null ? new File(mo1547c4.getExternalFilesDir(null), mo1547c) : mo1547c4.getExternalFilesDir(null), mo1547c2, mo1547c3, mo1547c4, mo1547c5, C1866w.m35245b(this.f11139f));
    }
}
