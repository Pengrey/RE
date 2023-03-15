package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes.dex */
public interface InterfaceC2505h {
    /* renamed from: m */
    void mo33245m(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: q */
    <T extends LifecycleCallback> T mo33244q(String str, Class<T> cls);

    /* renamed from: r */
    Activity mo33243r();

    void startActivityForResult(Intent intent, int i);
}
