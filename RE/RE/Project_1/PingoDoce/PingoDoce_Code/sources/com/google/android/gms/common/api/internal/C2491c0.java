package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2489c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes.dex */
final class C2491c0 implements ComponentCallbacks2C2489c.InterfaceC2490a {

    /* renamed from: a */
    final /* synthetic */ C2499f f7218a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2491c0(C2499f c2499f) {
        this.f7218a = c2499f;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2489c.InterfaceC2490a
    /* renamed from: a */
    public final void mo28426a(boolean z) {
        Handler handler;
        Handler handler2;
        C2499f c2499f = this.f7218a;
        handler = c2499f.f7244p;
        handler2 = c2499f.f7244p;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
