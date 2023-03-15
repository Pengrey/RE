package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.c */
/* loaded from: classes.dex */
public final class C2707c {

    /* renamed from: a */
    private C2691b f7677a;

    /* renamed from: b */
    private C2691b f7678b;

    /* renamed from: c */
    private final List f7679c;

    public C2707c() {
        this.f7677a = new C2691b(BuildConfig.VERSION_NAME, 0L, null);
        this.f7678b = new C2691b(BuildConfig.VERSION_NAME, 0L, null);
        this.f7679c = new ArrayList();
    }

    /* renamed from: a */
    public final C2691b m32828a() {
        return this.f7677a;
    }

    /* renamed from: b */
    public final C2691b m32827b() {
        return this.f7678b;
    }

    /* renamed from: c */
    public final List m32826c() {
        return this.f7679c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C2707c c2707c = new C2707c(this.f7677a.clone());
        for (C2691b c2691b : this.f7679c) {
            c2707c.f7679c.add(c2691b.clone());
        }
        return c2707c;
    }

    /* renamed from: d */
    public final void m32825d(C2691b c2691b) {
        this.f7677a = c2691b;
        this.f7678b = c2691b.clone();
        this.f7679c.clear();
    }

    /* renamed from: e */
    public final void m32824e(String str, long j, Map map) {
        this.f7679c.add(new C2691b(str, j, map));
    }

    /* renamed from: f */
    public final void m32823f(C2691b c2691b) {
        this.f7678b = c2691b;
    }

    public C2707c(C2691b c2691b) {
        this.f7677a = c2691b;
        this.f7678b = c2691b.clone();
        this.f7679c = new ArrayList();
    }
}
