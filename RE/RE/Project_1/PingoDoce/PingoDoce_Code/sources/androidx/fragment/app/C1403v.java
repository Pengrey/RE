package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1463m0;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.C1493x;
import androidx.lifecycle.InterfaceC1467o;
import androidx.lifecycle.InterfaceC1488t0;
import androidx.savedstate.C1662b;
import androidx.savedstate.InterfaceC1663c;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public class C1403v implements InterfaceC1467o, InterfaceC1663c, InterfaceC1488t0 {

    /* renamed from: w */
    private final Fragment f4187w;

    /* renamed from: x */
    private final C1486s0 f4188x;

    /* renamed from: y */
    private C1479r0.InterfaceC1481b f4189y;

    /* renamed from: z */
    private C1493x f4190z = null;

    /* renamed from: A */
    private C1662b f4186A = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1403v(Fragment fragment, C1486s0 c1486s0) {
        this.f4187w = fragment;
        this.f4188x = c1486s0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m37129a(AbstractC1469p.EnumC1471b enumC1471b) {
        this.f4190z.m36960h(enumC1471b);
    }

    @Override // androidx.lifecycle.InterfaceC1491v
    /* renamed from: b */
    public AbstractC1469p mo137b() {
        m37128c();
        return this.f4190z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m37128c() {
        if (this.f4190z == null) {
            this.f4190z = new C1493x(this);
            this.f4186A = C1662b.m35788a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m37127d() {
        return this.f4190z != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37126e(Bundle bundle) {
        this.f4186A.m35786c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m37125f(Bundle bundle) {
        this.f4186A.m35785d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m37124g(AbstractC1469p.EnumC1472c enumC1472c) {
        this.f4190z.m36953o(enumC1472c);
    }

    @Override // androidx.savedstate.InterfaceC1663c
    /* renamed from: i */
    public SavedStateRegistry mo35784i() {
        m37128c();
        return this.f4186A.m35787b();
    }

    @Override // androidx.lifecycle.InterfaceC1467o
    /* renamed from: p */
    public C1479r0.InterfaceC1481b mo36992p() {
        C1479r0.InterfaceC1481b mo36992p = this.f4187w.mo36992p();
        if (!mo36992p.equals(this.f4187w.f3838q0)) {
            this.f4189y = mo36992p;
            return mo36992p;
        }
        if (this.f4189y == null) {
            Application application = null;
            Context applicationContext = this.f4187w.m37650H1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                } else if (applicationContext instanceof Application) {
                    application = applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f4189y = new C1463m0(application, this, this.f4187w.m37660E());
        }
        return this.f4189y;
    }

    @Override // androidx.lifecycle.InterfaceC1488t0
    /* renamed from: z */
    public C1486s0 mo36970z() {
        m37128c();
        return this.f4188x;
    }
}
