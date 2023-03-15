package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2472b;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2465d;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* loaded from: classes.dex */
public final class C2523m0<O extends C2461a.InterfaceC2465d> extends C2482a0 {
    @NotOnlyInitialized

    /* renamed from: b */
    private final AbstractC2472b<O> f7302b;

    public C2523m0(AbstractC2472b<O> abstractC2472b) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f7302b = abstractC2472b;
    }

    @Override // com.google.android.gms.common.api.AbstractC2475c
    /* renamed from: a */
    public final <A extends C2461a.InterfaceC2463b, T extends AbstractC2493d<? extends InterfaceC13123e, A>> T mo33320a(T t) {
        return (T) this.f7302b.m33493i(t);
    }

    @Override // com.google.android.gms.common.api.AbstractC2475c
    /* renamed from: c */
    public final Looper mo33319c() {
        return this.f7302b.m33487o();
    }
}
