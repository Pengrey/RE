package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C2597i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: w */
    protected final InterfaceC2505h f7200w;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(InterfaceC2505h interfaceC2505h) {
        this.f7200w = interfaceC2505h;
    }

    /* renamed from: c */
    public static InterfaceC2505h m33464c(Activity activity) {
        return m33463d(new C2502g(activity));
    }

    /* renamed from: d */
    protected static InterfaceC2505h m33463d(C2502g c2502g) {
        if (c2502g.m33398d()) {
            return C2488b2.m33455i2(c2502g.m33400b());
        }
        if (c2502g.m33399c()) {
            return FragmentC2565z1.m33246c(c2502g.m33401a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC2505h getChimeraLifecycleFragmentImpl(C2502g c2502g) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void m33466a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity m33465b() {
        Activity mo33243r = this.f7200w.mo33243r();
        C2597i.m33076j(mo33243r);
        return mo33243r;
    }

    /* renamed from: e */
    public void mo33277e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo33276f(Bundle bundle) {
    }

    /* renamed from: g */
    public void m33462g() {
    }

    /* renamed from: h */
    public void mo33260h() {
    }

    /* renamed from: i */
    public void mo33275i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo33259j() {
    }

    /* renamed from: k */
    public void mo33258k() {
    }
}
