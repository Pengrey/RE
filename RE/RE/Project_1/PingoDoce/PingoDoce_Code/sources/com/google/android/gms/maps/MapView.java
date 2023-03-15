package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.C2597i;
import p133h7.AbstractC5866a;
import p418w7.InterfaceC11590d;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes.dex */
public class MapView extends FrameLayout {

    /* renamed from: w */
    private final C3119f f8232w;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8232w = new C3119f(this, context, GoogleMapOptions.m31604D(context, attributeSet));
        setClickable(true);
    }

    /* renamed from: a */
    public void m31574a(InterfaceC11590d interfaceC11590d) {
        C2597i.m33081e("getMapAsync() must be called on the main thread");
        C2597i.m33075k(interfaceC11590d, "callback must not be null.");
        this.f8232w.m31564o(interfaceC11590d);
    }

    /* renamed from: b */
    public void m31573b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f8232w.m22853c(bundle);
            if (this.f8232w.m22854b() == null) {
                AbstractC5866a.m22848h(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public void m31572c() {
        this.f8232w.m22852d();
    }

    /* renamed from: d */
    public void m31571d() {
        this.f8232w.m22851e();
    }

    /* renamed from: e */
    public void m31570e() {
        this.f8232w.m22850f();
    }

    /* renamed from: f */
    public void m31569f() {
        this.f8232w.m22849g();
    }
}
