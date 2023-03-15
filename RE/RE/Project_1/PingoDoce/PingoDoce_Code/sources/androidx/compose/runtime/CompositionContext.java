package androidx.compose.runtime;

import bd.CoroutineContext;
import id.InterfaceC6112p;
import java.util.Set;
import p092f0.C5219m;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5243s;
import p126h0.InterfaceC5740f;
import p181jd.Intrinsics;

/* renamed from: androidx.compose.runtime.a */
/* loaded from: classes.dex */
public abstract class CompositionContext {
    /* renamed from: a */
    public abstract void m39999a(InterfaceC5243s interfaceC5243s, InterfaceC6112p interfaceC6112p);

    /* renamed from: b */
    public void m39998b() {
    }

    /* renamed from: c */
    public abstract boolean m39997c();

    /* renamed from: d */
    public InterfaceC5740f m39996d() {
        return C5219m.m25001a();
    }

    /* renamed from: e */
    public abstract int m39995e();

    /* renamed from: f */
    public abstract CoroutineContext m39994f();

    /* renamed from: g */
    public abstract void m39993g(InterfaceC5243s interfaceC5243s);

    /* renamed from: h */
    public void m39992h(Set set) {
        Intrinsics.isThisObjectNull(set, "table");
    }

    /* renamed from: i */
    public void m39991i(InterfaceC5179i interfaceC5179i) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
    }

    /* renamed from: j */
    public void m39990j() {
    }

    /* renamed from: k */
    public void m39989k(InterfaceC5179i interfaceC5179i) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
    }

    /* renamed from: l */
    public abstract void m39988l(InterfaceC5243s interfaceC5243s);
}
