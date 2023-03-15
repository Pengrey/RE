package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import p031b9.C1844a;
import p031b9.InterfaceC1864u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.s0 */
/* loaded from: classes.dex */
public final class C3897s0 {

    /* renamed from: j */
    private static final C1844a f11124j = new C1844a("ExtractorLooper");

    /* renamed from: a */
    private final C3862j1 f11125a;

    /* renamed from: b */
    private final C3885p0 f11126b;

    /* renamed from: c */
    private final C3879n2 f11127c;

    /* renamed from: d */
    private final C3918x1 f11128d;

    /* renamed from: e */
    private final C3827b2 f11129e;

    /* renamed from: f */
    private final C3851g2 f11130f;

    /* renamed from: g */
    private final InterfaceC1864u<InterfaceC3833c3> f11131g;

    /* renamed from: h */
    private final C3874m1 f11132h;

    /* renamed from: i */
    private final AtomicBoolean f11133i = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3897s0(C3862j1 c3862j1, InterfaceC1864u<InterfaceC3833c3> interfaceC1864u, C3885p0 c3885p0, C3879n2 c3879n2, C3918x1 c3918x1, C3827b2 c3827b2, C3851g2 c3851g2, C3874m1 c3874m1) {
        this.f11125a = c3862j1;
        this.f11131g = interfaceC1864u;
        this.f11126b = c3885p0;
        this.f11127c = c3879n2;
        this.f11128d = c3918x1;
        this.f11129e = c3827b2;
        this.f11130f = c3851g2;
        this.f11132h = c3874m1;
    }

    /* renamed from: b */
    private final void m28642b(int i, Exception exc) {
        try {
            this.f11125a.m28717p(i);
            this.f11125a.m28730c(i);
        } catch (C3893r0 unused) {
            f11124j.m35278e("Error during error handling: %s", exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m28643a() {
        C1844a c1844a = f11124j;
        c1844a.m35280c("Run extractor loop", new Object[0]);
        if (!this.f11133i.compareAndSet(false, true)) {
            c1844a.m35276g("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            C3870l1 c3870l1 = null;
            try {
                c3870l1 = this.f11132h.m28692a();
            } catch (C3893r0 e) {
                f11124j.m35278e("Error while getting next extraction task: %s", e.getMessage());
                if (e.f11113w >= 0) {
                    this.f11131g.m35248c().mo28657C(e.f11113w);
                    m28642b(e.f11113w, e);
                }
            }
            if (c3870l1 == null) {
                this.f11133i.set(false);
                return;
            }
            try {
                if (c3870l1 instanceof C3881o0) {
                    this.f11126b.m28668a((C3881o0) c3870l1);
                } else if (c3870l1 instanceof C3875m2) {
                    this.f11127c.m28689a((C3875m2) c3870l1);
                } else if (c3870l1 instanceof C3914w1) {
                    this.f11128d.m28611a((C3914w1) c3870l1);
                } else if (c3870l1 instanceof C3926z1) {
                    this.f11129e.m28761a((C3926z1) c3870l1);
                } else if (c3870l1 instanceof C3847f2) {
                    this.f11130f.m28745a((C3847f2) c3870l1);
                } else {
                    f11124j.m35278e("Unknown task type: %s", c3870l1.getClass().getName());
                }
            } catch (Exception e2) {
                f11124j.m35278e("Error during extraction task: %s", e2.getMessage());
                this.f11131g.m35248c().mo28657C(c3870l1.f11019a);
                m28642b(c3870l1.f11019a, e2);
            }
        }
    }
}
