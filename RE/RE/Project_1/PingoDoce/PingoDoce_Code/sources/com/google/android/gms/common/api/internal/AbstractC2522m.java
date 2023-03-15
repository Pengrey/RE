package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2463b;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes.dex */
public abstract class AbstractC2522m<A extends C2461a.InterfaceC2463b, L> {

    /* renamed from: a */
    private final C2508i<L> f7298a;

    /* renamed from: b */
    private final Feature[] f7299b;

    /* renamed from: c */
    private final boolean f7300c;

    /* renamed from: d */
    private final int f7301d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2522m(C2508i<L> c2508i, Feature[] featureArr, boolean z, int i) {
        this.f7298a = c2508i;
        this.f7299b = featureArr;
        this.f7300c = z;
        this.f7301d = i;
    }

    /* renamed from: a */
    public void m33325a() {
        this.f7298a.m33356a();
    }

    /* renamed from: b */
    public C2508i.C2509a<L> m33324b() {
        return this.f7298a.m33355b();
    }

    /* renamed from: c */
    public Feature[] m33323c() {
        return this.f7299b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo33252d(A a, C3421e<Void> c3421e) throws RemoteException;

    /* renamed from: e */
    public final int m33322e() {
        return this.f7301d;
    }

    /* renamed from: f */
    public final boolean m33321f() {
        return this.f7300c;
    }
}
