package com.google.android.gms.tasks;

import p079e8.AbstractC5014a;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.e */
/* loaded from: classes.dex */
public class C3421e<TResult> {

    /* renamed from: a */
    private final C3424f0<TResult> f9228a = new C3424f0<>();

    public C3421e() {
    }

    public C3421e(AbstractC5014a abstractC5014a) {
        abstractC5014a.mo25884a(new C3418c0(this));
    }

    /* renamed from: a */
    public AbstractC3419d<TResult> m30802a() {
        return this.f9228a;
    }

    /* renamed from: b */
    public void m30801b(Exception exc) {
        this.f9228a.m30777s(exc);
    }

    /* renamed from: c */
    public void m30800c(TResult tresult) {
        this.f9228a.m30776t(tresult);
    }

    /* renamed from: d */
    public boolean m30799d(Exception exc) {
        return this.f9228a.m30774v(exc);
    }

    /* renamed from: e */
    public boolean m30798e(TResult tresult) {
        return this.f9228a.m30773w(tresult);
    }
}
