package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2463b;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.n */
/* loaded from: classes.dex */
public class C2525n<A extends C2461a.InterfaceC2463b, L> {

    /* renamed from: a */
    public final AbstractC2522m<A, L> f7304a;

    /* renamed from: b */
    public final AbstractC2548u<A, L> f7305b;

    /* renamed from: c */
    public final Runnable f7306c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.internal.n$a */
    /* loaded from: classes.dex */
    public static class C2526a<A extends C2461a.InterfaceC2463b, L> {

        /* renamed from: a */
        private InterfaceC2529o<A, C3421e<Void>> f7307a;

        /* renamed from: b */
        private InterfaceC2529o<A, C3421e<Boolean>> f7308b;

        /* renamed from: d */
        private C2508i<L> f7310d;

        /* renamed from: e */
        private Feature[] f7311e;

        /* renamed from: g */
        private int f7313g;

        /* renamed from: c */
        private Runnable f7309c = RunnableC2558x0.f7370w;

        /* renamed from: f */
        private boolean f7312f = true;

        /* synthetic */ C2526a(C2483a1 c2483a1) {
        }

        /* renamed from: a */
        public C2525n<A, L> m33317a() {
            C2597i.m33084b(this.f7307a != null, "Must set register function");
            C2597i.m33084b(this.f7308b != null, "Must set unregister function");
            C2597i.m33084b(this.f7310d != null, "Must set holder");
            return new C2525n<>(new C2561y0(this, this.f7310d, this.f7311e, this.f7312f, this.f7313g), new C2564z0(this, (C2508i.C2509a) C2597i.m33075k(this.f7310d.m33355b(), "Key must not be null")), this.f7309c, null);
        }

        /* renamed from: b */
        public C2526a<A, L> m33316b(InterfaceC2529o<A, C3421e<Void>> interfaceC2529o) {
            this.f7307a = interfaceC2529o;
            return this;
        }

        /* renamed from: c */
        public C2526a<A, L> m33315c(int i) {
            this.f7313g = i;
            return this;
        }

        /* renamed from: d */
        public C2526a<A, L> m33314d(InterfaceC2529o<A, C3421e<Boolean>> interfaceC2529o) {
            this.f7308b = interfaceC2529o;
            return this;
        }

        /* renamed from: e */
        public C2526a<A, L> m33313e(C2508i<L> c2508i) {
            this.f7310d = c2508i;
            return this;
        }
    }

    /* synthetic */ C2525n(AbstractC2522m abstractC2522m, AbstractC2548u abstractC2548u, Runnable runnable, C2487b1 c2487b1) {
        this.f7304a = abstractC2522m;
        this.f7305b = abstractC2548u;
        this.f7306c = runnable;
    }

    /* renamed from: a */
    public static <A extends C2461a.InterfaceC2463b, L> C2526a<A, L> m33318a() {
        return new C2526a<>(null);
    }
}
