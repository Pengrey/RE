package p138hc;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: hc.p */
/* loaded from: classes2.dex */
public class C5903p {

    /* renamed from: a */
    private int f16347a;

    /* renamed from: b */
    private WindowManager f16348b;

    /* renamed from: c */
    private OrientationEventListener f16349c;

    /* renamed from: d */
    private InterfaceC5902o f16350d;

    /* compiled from: RotationListener.java */
    /* renamed from: hc.p$a */
    /* loaded from: classes2.dex */
    class C5904a extends OrientationEventListener {
        C5904a(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int rotation;
            WindowManager windowManager = C5903p.this.f16348b;
            InterfaceC5902o interfaceC5902o = C5903p.this.f16350d;
            if (C5903p.this.f16348b == null || interfaceC5902o == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == C5903p.this.f16347a) {
                return;
            }
            C5903p.this.f16347a = rotation;
            interfaceC5902o.mo22785a(rotation);
        }
    }

    /* renamed from: e */
    public void m22780e(Context context, InterfaceC5902o interfaceC5902o) {
        m22779f();
        Context applicationContext = context.getApplicationContext();
        this.f16350d = interfaceC5902o;
        this.f16348b = (WindowManager) applicationContext.getSystemService("window");
        C5904a c5904a = new C5904a(applicationContext, 3);
        this.f16349c = c5904a;
        c5904a.enable();
        this.f16347a = this.f16348b.getDefaultDisplay().getRotation();
    }

    /* renamed from: f */
    public void m22779f() {
        OrientationEventListener orientationEventListener = this.f16349c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f16349c = null;
        this.f16348b = null;
        this.f16350d = null;
    }
}
