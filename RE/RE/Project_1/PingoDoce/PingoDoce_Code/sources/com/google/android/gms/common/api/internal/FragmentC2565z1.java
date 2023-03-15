package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p292p7.HandlerC8448e;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.z1 */
/* loaded from: classes.dex */
public final class FragmentC2565z1 extends Fragment implements InterfaceC2505h {

    /* renamed from: z */
    private static final WeakHashMap<Activity, WeakReference<FragmentC2565z1>> f7381z = new WeakHashMap<>();

    /* renamed from: w */
    private final Map<String, LifecycleCallback> f7382w = Collections.synchronizedMap(new C9545a());

    /* renamed from: x */
    private int f7383x = 0;

    /* renamed from: y */
    private Bundle f7384y;

    /* renamed from: c */
    public static FragmentC2565z1 m33246c(Activity activity) {
        FragmentC2565z1 fragmentC2565z1;
        WeakHashMap<Activity, WeakReference<FragmentC2565z1>> weakHashMap = f7381z;
        WeakReference<FragmentC2565z1> weakReference = weakHashMap.get(activity);
        if (weakReference == null || (fragmentC2565z1 = weakReference.get()) == null) {
            try {
                FragmentC2565z1 fragmentC2565z12 = (FragmentC2565z1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (fragmentC2565z12 == null || fragmentC2565z12.isRemoving()) {
                    fragmentC2565z12 = new FragmentC2565z1();
                    activity.getFragmentManager().beginTransaction().add(fragmentC2565z12, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference<>(fragmentC2565z12));
                return fragmentC2565z12;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return fragmentC2565z1;
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f7382w.values()) {
            lifecycleCallback.m33466a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2505h
    /* renamed from: m */
    public final void mo33245m(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f7382w.containsKey(str)) {
            this.f7382w.put(str, lifecycleCallback);
            if (this.f7383x > 0) {
                new HandlerC8448e(Looper.getMainLooper()).post(new RunnableC2562y1(this, lifecycleCallback, str));
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

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f7382w.values()) {
            lifecycleCallback.mo33277e(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7383x = 1;
        this.f7384y = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f7382w.entrySet()) {
            entry.getValue().mo33276f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f7383x = 5;
        for (LifecycleCallback lifecycleCallback : this.f7382w.values()) {
            lifecycleCallback.m33462g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f7383x = 3;
        for (LifecycleCallback lifecycleCallback : this.f7382w.values()) {
            lifecycleCallback.mo33260h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f7382w.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo33275i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f7383x = 2;
        for (LifecycleCallback lifecycleCallback : this.f7382w.values()) {
            lifecycleCallback.mo33259j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f7383x = 4;
        for (LifecycleCallback lifecycleCallback : this.f7382w.values()) {
            lifecycleCallback.mo33258k();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2505h
    /* renamed from: q */
    public final <T extends LifecycleCallback> T mo33244q(String str, Class<T> cls) {
        return cls.cast(this.f7382w.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2505h
    /* renamed from: r */
    public final Activity mo33243r() {
        return getActivity();
    }
}
