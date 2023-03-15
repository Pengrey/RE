package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC1354d;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p292p7.HandlerC8448e;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.b2 */
/* loaded from: classes.dex */
public final class C2488b2 extends Fragment implements InterfaceC2505h {

    /* renamed from: z0 */
    private static final WeakHashMap<ActivityC1354d, WeakReference<C2488b2>> f7209z0 = new WeakHashMap<>();

    /* renamed from: w0 */
    private final Map<String, LifecycleCallback> f7210w0 = Collections.synchronizedMap(new C9545a());

    /* renamed from: x0 */
    private int f7211x0 = 0;

    /* renamed from: y0 */
    private Bundle f7212y0;

    /* renamed from: i2 */
    public static C2488b2 m33455i2(ActivityC1354d activityC1354d) {
        C2488b2 c2488b2;
        WeakHashMap<ActivityC1354d, WeakReference<C2488b2>> weakHashMap = f7209z0;
        WeakReference<C2488b2> weakReference = weakHashMap.get(activityC1354d);
        if (weakReference == null || (c2488b2 = weakReference.get()) == null) {
            try {
                C2488b2 c2488b22 = (C2488b2) activityC1354d.m37323P().m37455j0("SupportLifecycleFragmentImpl");
                if (c2488b22 == null || c2488b22.m37560t0()) {
                    c2488b22 = new C2488b2();
                    activityC1354d.m37323P().m37447m().m37186d(c2488b22, "SupportLifecycleFragmentImpl").mo37183g();
                }
                weakHashMap.put(activityC1354d, new WeakReference<>(c2488b22));
                return c2488b22;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return c2488b2;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public final void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        this.f7211x0 = 1;
        this.f7212y0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f7210w0.entrySet()) {
            entry.getValue().mo33276f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: I0 */
    public final void mo33459I0() {
        super.mo33459I0();
        this.f7211x0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f7210w0.values()) {
            lifecycleCallback.m33462g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Y0 */
    public final void mo33458Y0() {
        super.mo33458Y0();
        this.f7211x0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f7210w0.values()) {
            lifecycleCallback.mo33260h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public final void mo29884Z0(Bundle bundle) {
        super.mo29884Z0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f7210w0.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo33275i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public final void mo29891a1() {
        super.mo29891a1();
        this.f7211x0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f7210w0.values()) {
            lifecycleCallback.mo33259j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b1 */
    public final void mo29890b1() {
        super.mo29890b1();
        this.f7211x0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f7210w0.values()) {
            lifecycleCallback.mo33258k();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2505h
    /* renamed from: m */
    public final void mo33245m(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f7210w0.containsKey(str)) {
            this.f7210w0.put(str, lifecycleCallback);
            if (this.f7211x0 > 0) {
                new HandlerC8448e(Looper.getMainLooper()).post(new RunnableC2484a2(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("LifecycleCallback with tag ");
        sb2.append(str);
        sb2.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2505h
    /* renamed from: q */
    public final <T extends LifecycleCallback> T mo33244q(String str, Class<T> cls) {
        return cls.cast(this.f7210w0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2505h
    /* renamed from: r */
    public final /* synthetic */ Activity mo33243r() {
        return m37547y();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u */
    public final void mo33454u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo33454u(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f7210w0.values()) {
            lifecycleCallback.m33466a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: y0 */
    public final void mo33453y0(int i, int i2, Intent intent) {
        super.mo33453y0(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f7210w0.values()) {
            lifecycleCallback.mo33277e(i, i2, intent);
        }
    }
}
