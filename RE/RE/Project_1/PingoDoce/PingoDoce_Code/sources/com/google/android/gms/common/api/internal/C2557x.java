package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C3421e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.x */
/* loaded from: classes.dex */
public final class C2557x {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f7368a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C3421e<?>, Boolean> f7369b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m33261h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f7368a) {
            hashMap = new HashMap(this.f7368a);
        }
        synchronized (this.f7369b) {
            hashMap2 = new HashMap(this.f7369b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m33475d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C3421e) entry2.getKey()).m30799d(new ApiException(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m33266c(BasePendingResult<? extends InterfaceC13123e> basePendingResult, boolean z) {
        this.f7368a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo1572a(new C2551v(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void m33265d(C3421e<TResult> c3421e, boolean z) {
        this.f7369b.put(c3421e, Boolean.valueOf(z));
        c3421e.m30802a().mo30794b(new C2554w(this, c3421e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m33264e(int i, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        m33261h(true, new Status(20, sb2.toString()));
    }

    /* renamed from: f */
    public final void m33263f() {
        m33261h(false, C2499f.f7225r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m33262g() {
        return (this.f7368a.isEmpty() && this.f7369b.isEmpty()) ? false : true;
    }
}
