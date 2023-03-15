package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p009a8.C0074g;
import p009a8.InterfaceC0073f;
import p360t2.AbstractC10376a;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC10376a implements InterfaceC0073f {

    /* renamed from: c */
    private C0074g f8284c;

    @Override // p009a8.InterfaceC0073f
    /* renamed from: a */
    public void mo31532a(Context context, Intent intent) {
        AbstractC10376a.m8092c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f8284c == null) {
            this.f8284c = new C0074g(this);
        }
        this.f8284c.m41979a(context, intent);
    }
}
