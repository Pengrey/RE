package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2463b;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes.dex */
public abstract class AbstractC2541s<A extends C2461a.InterfaceC2463b, ResultT> {

    /* renamed from: a */
    private final Feature[] f7335a;

    /* renamed from: b */
    private final boolean f7336b;

    /* renamed from: c */
    private final int f7337c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.internal.s$a */
    /* loaded from: classes.dex */
    public static class C2542a<A extends C2461a.InterfaceC2463b, ResultT> {

        /* renamed from: a */
        private InterfaceC2529o<A, C3421e<ResultT>> f7338a;

        /* renamed from: c */
        private Feature[] f7340c;

        /* renamed from: b */
        private boolean f7339b = true;

        /* renamed from: d */
        private int f7341d = 0;

        /* synthetic */ C2542a(C2507h1 c2507h1) {
        }

        /* renamed from: a */
        public AbstractC2541s<A, ResultT> m33288a() {
            C2597i.m33084b(this.f7338a != null, "execute parameter required");
            return new C2504g1(this, this.f7340c, this.f7339b, this.f7341d);
        }

        /* renamed from: b */
        public C2542a<A, ResultT> m33287b(InterfaceC2529o<A, C3421e<ResultT>> interfaceC2529o) {
            this.f7338a = interfaceC2529o;
            return this;
        }

        /* renamed from: c */
        public C2542a<A, ResultT> m33286c(boolean z) {
            this.f7339b = z;
            return this;
        }

        /* renamed from: d */
        public C2542a<A, ResultT> m33285d(Feature... featureArr) {
            this.f7340c = featureArr;
            return this;
        }

        /* renamed from: e */
        public C2542a<A, ResultT> m33284e(int i) {
            this.f7341d = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2541s(Feature[] featureArr, boolean z, int i) {
        this.f7335a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f7336b = z2;
        this.f7337c = i;
    }

    /* renamed from: a */
    public static <A extends C2461a.InterfaceC2463b, ResultT> C2542a<A, ResultT> m33293a() {
        return new C2542a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33292b(A a, C3421e<ResultT> c3421e) throws RemoteException;

    /* renamed from: c */
    public boolean m33291c() {
        return this.f7336b;
    }

    /* renamed from: d */
    public final int m33290d() {
        return this.f7337c;
    }

    /* renamed from: e */
    public final Feature[] m33289e() {
        return this.f7335a;
    }
}
