package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.core.util.C1069b;
import androidx.lifecycle.AbstractC1468o0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.loader.app.AbstractC1497a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p301q.C9559h;
import p413w2.C11551b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.loader.app.b */
/* loaded from: classes.dex */
public class C1499b extends AbstractC1497a {

    /* renamed from: c */
    static boolean f4379c = false;

    /* renamed from: a */
    private final InterfaceC1491v f4380a;

    /* renamed from: b */
    private final C1502c f4381b;

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$a */
    /* loaded from: classes.dex */
    public static class C1500a<D> extends C1436e0<D> implements C11551b.InterfaceC11553b<D> {

        /* renamed from: l */
        private final int f4382l;

        /* renamed from: m */
        private final Bundle f4383m;

        /* renamed from: n */
        private final C11551b<D> f4384n;

        /* renamed from: o */
        private InterfaceC1491v f4385o;

        /* renamed from: p */
        private C1501b<D> f4386p;

        /* renamed from: q */
        private C11551b<D> f4387q;

        C1500a(int i, Bundle bundle, C11551b<D> c11551b, C11551b<D> c11551b2) {
            this.f4382l = i;
            this.f4383m = bundle;
            this.f4384n = c11551b;
            this.f4387q = c11551b2;
            c11551b.m4724q(i, this);
        }

        @Override // p413w2.C11551b.InterfaceC11553b
        /* renamed from: a */
        public void mo4717a(C11551b<D> c11551b, D d) {
            if (C1499b.f4379c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo166p(d);
                return;
            }
            if (C1499b.f4379c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo169m(d);
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: k */
        protected void mo36938k() {
            if (C1499b.f4379c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4384n.m4721t();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: l */
        protected void mo36937l() {
            if (C1499b.f4379c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4384n.m4720u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: n */
        public void mo168n(InterfaceC1440f0<? super D> interfaceC1440f0) {
            super.mo168n(interfaceC1440f0);
            this.f4385o = null;
            this.f4386p = null;
        }

        @Override // androidx.lifecycle.C1436e0, androidx.lifecycle.LiveData
        /* renamed from: p */
        public void mo166p(D d) {
            super.mo166p(d);
            C11551b<D> c11551b = this.f4387q;
            if (c11551b != null) {
                c11551b.m4723r();
                this.f4387q = null;
            }
        }

        /* renamed from: q */
        C11551b<D> m36936q(boolean z) {
            if (C1499b.f4379c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4384n.m4739b();
            this.f4384n.m4740a();
            C1501b<D> c1501b = this.f4386p;
            if (c1501b != null) {
                mo168n(c1501b);
                if (z) {
                    c1501b.m36929d();
                }
            }
            this.f4384n.m4719v(this);
            if ((c1501b != null && !c1501b.m36930b()) || z) {
                this.f4384n.m4723r();
                return this.f4387q;
            }
            return this.f4384n;
        }

        /* renamed from: r */
        public void m36935r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4382l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4383m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4384n);
            C11551b<D> c11551b = this.f4384n;
            c11551b.mo4734g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4386p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4386p);
                C1501b<D> c1501b = this.f4386p;
                c1501b.m36931a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m36934s().m4737d(mo172f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m37078h());
        }

        /* renamed from: s */
        C11551b<D> m36934s() {
            return this.f4384n;
        }

        /* renamed from: t */
        void m36933t() {
            InterfaceC1491v interfaceC1491v = this.f4385o;
            C1501b<D> c1501b = this.f4386p;
            if (interfaceC1491v == null || c1501b == null) {
                return;
            }
            super.mo168n(c1501b);
            mo171i(interfaceC1491v, c1501b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4382l);
            sb2.append(" : ");
            C1069b.m38635a(this.f4384n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        /* renamed from: u */
        C11551b<D> m36932u(InterfaceC1491v interfaceC1491v, AbstractC1497a.InterfaceC1498a<D> interfaceC1498a) {
            C1501b<D> c1501b = new C1501b<>(this.f4384n, interfaceC1498a);
            mo171i(interfaceC1491v, c1501b);
            C1501b<D> c1501b2 = this.f4386p;
            if (c1501b2 != null) {
                mo168n(c1501b2);
            }
            this.f4385o = interfaceC1491v;
            this.f4386p = c1501b;
            return this.f4384n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b */
    /* loaded from: classes.dex */
    public static class C1501b<D> implements InterfaceC1440f0<D> {

        /* renamed from: a */
        private final C11551b<D> f4388a;

        /* renamed from: b */
        private final AbstractC1497a.InterfaceC1498a<D> f4389b;

        /* renamed from: c */
        private boolean f4390c = false;

        C1501b(C11551b<D> c11551b, AbstractC1497a.InterfaceC1498a<D> interfaceC1498a) {
            this.f4388a = c11551b;
            this.f4389b = interfaceC1498a;
        }

        /* renamed from: a */
        public void m36931a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4390c);
        }

        /* renamed from: b */
        boolean m36930b() {
            return this.f4390c;
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: c */
        public void mo37325a(D d) {
            if (C1499b.f4379c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4388a + ": " + this.f4388a.m4737d(d));
            }
            this.f4389b.mo33562a(this.f4388a, d);
            this.f4390c = true;
        }

        /* renamed from: d */
        void m36929d() {
            if (this.f4390c) {
                if (C1499b.f4379c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4388a);
                }
                this.f4389b.mo33561b(this.f4388a);
            }
        }

        public String toString() {
            return this.f4389b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$c */
    /* loaded from: classes.dex */
    public static class C1502c extends AbstractC1468o0 {

        /* renamed from: e */
        private static final C1479r0.InterfaceC1481b f4391e = new C1503a();

        /* renamed from: c */
        private C9559h<C1500a> f4392c = new C9559h<>();

        /* renamed from: d */
        private boolean f4393d = false;

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: androidx.loader.app.b$c$a */
        /* loaded from: classes.dex */
        static class C1503a implements C1479r0.InterfaceC1481b {
            C1503a() {
            }

            @Override // androidx.lifecycle.C1479r0.InterfaceC1481b
            /* renamed from: a */
            public <T extends AbstractC1468o0> T mo36919a(Class<T> cls) {
                return new C1502c();
            }
        }

        C1502c() {
        }

        /* renamed from: i */
        static C1502c m36925i(C1486s0 c1486s0) {
            return (C1502c) new C1479r0(c1486s0, f4391e).m36981a(C1502c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC1468o0
        /* renamed from: e */
        public void mo36928e() {
            super.mo36928e();
            int m10598m = this.f4392c.m10598m();
            for (int i = 0; i < m10598m; i++) {
                this.f4392c.m10597n(i).m36936q(true);
            }
            this.f4392c.m10608b();
        }

        /* renamed from: g */
        public void m36927g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4392c.m10598m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f4392c.m10598m(); i++) {
                    C1500a m10597n = this.f4392c.m10597n(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4392c.m10600k(i));
                    printWriter.print(": ");
                    printWriter.println(m10597n.toString());
                    m10597n.m36935r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: h */
        void m36926h() {
            this.f4393d = false;
        }

        /* renamed from: j */
        <D> C1500a<D> m36924j(int i) {
            return this.f4392c.m10604f(i);
        }

        /* renamed from: k */
        boolean m36923k() {
            return this.f4393d;
        }

        /* renamed from: l */
        void m36922l() {
            int m10598m = this.f4392c.m10598m();
            for (int i = 0; i < m10598m; i++) {
                this.f4392c.m10597n(i).m36933t();
            }
        }

        /* renamed from: m */
        void m36921m(int i, C1500a c1500a) {
            this.f4392c.m10599l(i, c1500a);
        }

        /* renamed from: n */
        void m36920n() {
            this.f4393d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1499b(InterfaceC1491v interfaceC1491v, C1486s0 c1486s0) {
        this.f4380a = interfaceC1491v;
        this.f4381b = C1502c.m36925i(c1486s0);
    }

    /* renamed from: e */
    private <D> C11551b<D> m36939e(int i, Bundle bundle, AbstractC1497a.InterfaceC1498a<D> interfaceC1498a, C11551b<D> c11551b) {
        try {
            this.f4381b.m36920n();
            C11551b<D> mo33560c = interfaceC1498a.mo33560c(i, bundle);
            if (mo33560c != null) {
                if (mo33560c.getClass().isMemberClass() && !Modifier.isStatic(mo33560c.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo33560c);
                }
                C1500a c1500a = new C1500a(i, bundle, mo33560c, c11551b);
                if (f4379c) {
                    Log.v("LoaderManager", "  Created new loader " + c1500a);
                }
                this.f4381b.m36921m(i, c1500a);
                this.f4381b.m36926h();
                return c1500a.m36932u(this.f4380a, interfaceC1498a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f4381b.m36926h();
            throw th2;
        }
    }

    @Override // androidx.loader.app.AbstractC1497a
    @Deprecated
    /* renamed from: a */
    public void mo36942a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4381b.m36927g(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC1497a
    /* renamed from: c */
    public <D> C11551b<D> mo36941c(int i, Bundle bundle, AbstractC1497a.InterfaceC1498a<D> interfaceC1498a) {
        if (!this.f4381b.m36923k()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C1500a<D> m36924j = this.f4381b.m36924j(i);
                if (f4379c) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (m36924j == null) {
                    return m36939e(i, bundle, interfaceC1498a, null);
                }
                if (f4379c) {
                    Log.v("LoaderManager", "  Re-using existing loader " + m36924j);
                }
                return m36924j.m36932u(this.f4380a, interfaceC1498a);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.AbstractC1497a
    /* renamed from: d */
    public void mo36940d() {
        this.f4381b.m36922l();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C1069b.m38635a(this.f4380a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
