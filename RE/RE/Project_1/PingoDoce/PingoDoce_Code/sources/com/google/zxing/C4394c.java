package com.google.zxing;

import com.github.aachartmodel.aainfographics.BuildConfig;
import p239mb.C7154a;
import p239mb.C7155b;

/* renamed from: com.google.zxing.c */
/* loaded from: classes2.dex */
public final class C4394c {

    /* renamed from: a */
    private final AbstractC4393b f11892a;

    /* renamed from: b */
    private C7155b f11893b;

    public C4394c(AbstractC4393b abstractC4393b) {
        if (abstractC4393b != null) {
            this.f11892a = abstractC4393b;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C7155b m27696a() throws NotFoundException {
        if (this.f11893b == null) {
            this.f11893b = this.f11892a.mo19020b();
        }
        return this.f11893b;
    }

    /* renamed from: b */
    public C7154a m27695b(int i, C7154a c7154a) throws NotFoundException {
        return this.f11892a.mo19028c(i, c7154a);
    }

    /* renamed from: c */
    public int m27694c() {
        return this.f11892a.m27699d();
    }

    /* renamed from: d */
    public int m27693d() {
        return this.f11892a.m27697f();
    }

    /* renamed from: e */
    public boolean m27692e() {
        return this.f11892a.m27698e().mo27659f();
    }

    /* renamed from: f */
    public C4394c m27691f() {
        return new C4394c(this.f11892a.mo19021a(this.f11892a.m27698e().mo27658g()));
    }

    public String toString() {
        try {
            return m27696a().toString();
        } catch (NotFoundException unused) {
            return BuildConfig.VERSION_NAME;
        }
    }
}
