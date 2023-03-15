package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.FragmentC1454k0;

/* renamed from: androidx.lifecycle.j0 */
/* loaded from: classes.dex */
public class C1448j0 implements InterfaceC1491v {

    /* renamed from: E */
    private static final C1448j0 f4312E = new C1448j0();

    /* renamed from: A */
    private Handler f4313A;

    /* renamed from: w */
    private int f4314w = 0;

    /* renamed from: x */
    private int f4315x = 0;

    /* renamed from: y */
    private boolean f4316y = true;

    /* renamed from: z */
    private boolean f4317z = true;

    /* renamed from: B */
    private final C1493x f4318B = new C1493x(this);

    /* renamed from: C */
    private Runnable f4319C = new RunnableC1449a();

    /* renamed from: D */
    FragmentC1454k0.InterfaceC1455a f4320D = new C1450b();

    /* compiled from: ProcessLifecycleOwner.java */
    /* renamed from: androidx.lifecycle.j0$a */
    /* loaded from: classes.dex */
    class RunnableC1449a implements Runnable {
        RunnableC1449a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1448j0.this.m37023g();
            C1448j0.this.m37022j();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* renamed from: androidx.lifecycle.j0$b */
    /* loaded from: classes.dex */
    class C1450b implements FragmentC1454k0.InterfaceC1455a {
        C1450b() {
        }

        @Override // androidx.lifecycle.FragmentC1454k0.InterfaceC1455a
        /* renamed from: k */
        public void mo37011k() {
            C1448j0.this.m37027c();
        }

        @Override // androidx.lifecycle.FragmentC1454k0.InterfaceC1455a
        /* renamed from: l */
        public void mo37010l() {
        }

        @Override // androidx.lifecycle.FragmentC1454k0.InterfaceC1455a
        /* renamed from: m */
        public void mo37009m() {
            C1448j0.this.m37026d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProcessLifecycleOwner.java */
    /* renamed from: androidx.lifecycle.j0$c */
    /* loaded from: classes.dex */
    public class C1451c extends C1453k {

        /* compiled from: ProcessLifecycleOwner.java */
        /* renamed from: androidx.lifecycle.j0$c$a */
        /* loaded from: classes.dex */
        class C1452a extends C1453k {
            C1452a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C1448j0.this.m37027c();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C1448j0.this.m37026d();
            }
        }

        C1451c() {
        }

        @Override // androidx.lifecycle.C1453k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC1454k0.m37014f(activity).m37012h(C1448j0.this.f4320D);
            }
        }

        @Override // androidx.lifecycle.C1453k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C1448j0.this.m37028a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C1452a());
        }

        @Override // androidx.lifecycle.C1453k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C1448j0.this.m37025e();
        }
    }

    private C1448j0() {
    }

    /* renamed from: k */
    public static InterfaceC1491v m37021k() {
        return f4312E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static void m37020l(Context context) {
        f4312E.m37024f(context);
    }

    /* renamed from: a */
    void m37028a() {
        int i = this.f4315x - 1;
        this.f4315x = i;
        if (i == 0) {
            this.f4313A.postDelayed(this.f4319C, 700L);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1491v
    /* renamed from: b */
    public AbstractC1469p mo137b() {
        return this.f4318B;
    }

    /* renamed from: c */
    void m37027c() {
        int i = this.f4315x + 1;
        this.f4315x = i;
        if (i == 1) {
            if (this.f4316y) {
                this.f4318B.m36960h(AbstractC1469p.EnumC1471b.ON_RESUME);
                this.f4316y = false;
                return;
            }
            this.f4313A.removeCallbacks(this.f4319C);
        }
    }

    /* renamed from: d */
    void m37026d() {
        int i = this.f4314w + 1;
        this.f4314w = i;
        if (i == 1 && this.f4317z) {
            this.f4318B.m36960h(AbstractC1469p.EnumC1471b.ON_START);
            this.f4317z = false;
        }
    }

    /* renamed from: e */
    void m37025e() {
        this.f4314w--;
        m37022j();
    }

    /* renamed from: f */
    void m37024f(Context context) {
        this.f4313A = new Handler();
        this.f4318B.m36960h(AbstractC1469p.EnumC1471b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1451c());
    }

    /* renamed from: g */
    void m37023g() {
        if (this.f4315x == 0) {
            this.f4316y = true;
            this.f4318B.m36960h(AbstractC1469p.EnumC1471b.ON_PAUSE);
        }
    }

    /* renamed from: j */
    void m37022j() {
        if (this.f4314w == 0 && this.f4316y) {
            this.f4318B.m36960h(AbstractC1469p.EnumC1471b.ON_STOP);
            this.f4317z = true;
        }
    }
}
