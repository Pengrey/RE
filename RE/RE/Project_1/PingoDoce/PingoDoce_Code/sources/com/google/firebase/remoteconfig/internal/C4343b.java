package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
/* loaded from: classes.dex */
public class C4343b {

    /* renamed from: d */
    private static final Map<String, C4343b> f11797d = new HashMap();

    /* renamed from: a */
    private final ExecutorService f11798a;

    /* renamed from: b */
    private final C4351g f11799b;

    /* renamed from: c */
    private AbstractC3419d<C4344c> f11800c = null;

    private C4343b(ExecutorService executorService, C4351g c4351g) {
        this.f11798a = executorService;
        this.f11799b = c4351g;
    }

    /* renamed from: b */
    public static synchronized C4343b m27828b(ExecutorService executorService, C4351g c4351g) {
        C4343b c4343b;
        synchronized (C4343b.class) {
            String m27814a = c4351g.m27814a();
            Map<String, C4343b> map = f11797d;
            if (!map.containsKey(m27814a)) {
                map.put(m27814a, new C4343b(executorService, c4351g));
            }
            c4343b = map.get(m27814a);
        }
        return c4343b;
    }

    /* renamed from: a */
    public synchronized AbstractC3419d<C4344c> m27829a() {
        AbstractC3419d<C4344c> abstractC3419d = this.f11800c;
        if (abstractC3419d == null || (abstractC3419d.mo30781o() && !this.f11800c.mo30780p())) {
            ExecutorService executorService = this.f11798a;
            final C4351g c4351g = this.f11799b;
            Objects.requireNonNull(c4351g);
            this.f11800c = C3425g.m30767c(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.internal.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C4351g.this.m27812c();
                }
            });
        }
        return this.f11800c;
    }
}
