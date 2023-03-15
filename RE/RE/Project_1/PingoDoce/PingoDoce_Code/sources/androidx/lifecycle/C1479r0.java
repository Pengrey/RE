package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.r0 */
/* loaded from: classes.dex */
public class C1479r0 {

    /* renamed from: a */
    private final InterfaceC1481b f4361a;

    /* renamed from: b */
    private final C1486s0 f4362b;

    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.r0$a */
    /* loaded from: classes.dex */
    public static class C1480a extends C1483d {

        /* renamed from: c */
        private static C1480a f4363c;

        /* renamed from: b */
        private Application f4364b;

        public C1480a(Application application) {
            this.f4364b = application;
        }

        /* renamed from: c */
        public static C1480a m36979c(Application application) {
            if (f4363c == null) {
                f4363c = new C1480a(application);
            }
            return f4363c;
        }

        @Override // androidx.lifecycle.C1479r0.C1483d, androidx.lifecycle.C1479r0.InterfaceC1481b
        /* renamed from: a */
        public <T extends AbstractC1468o0> T mo36919a(Class<T> cls) {
            if (C1425b.class.isAssignableFrom(cls)) {
                try {
                    return cls.getConstructor(Application.class).newInstance(this.f4364b);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.mo36919a(cls);
        }
    }

    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.r0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1481b {
        /* renamed from: a */
        <T extends AbstractC1468o0> T mo36919a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.r0$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1482c extends C1484e implements InterfaceC1481b {
        /* renamed from: a */
        public <T extends AbstractC1468o0> T mo36919a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends AbstractC1468o0> T mo36978c(String str, Class<T> cls);
    }

    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.r0$d */
    /* loaded from: classes.dex */
    public static class C1483d implements InterfaceC1481b {

        /* renamed from: a */
        private static C1483d f4365a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public static C1483d m36977b() {
            if (f4365a == null) {
                f4365a = new C1483d();
            }
            return f4365a;
        }

        @Override // androidx.lifecycle.C1479r0.InterfaceC1481b
        /* renamed from: a */
        public <T extends AbstractC1468o0> T mo36919a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.r0$e */
    /* loaded from: classes.dex */
    public static class C1484e {
        C1484e() {
        }

        /* renamed from: b */
        void mo36976b(AbstractC1468o0 abstractC1468o0) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1479r0(androidx.lifecycle.InterfaceC1488t0 r3) {
        /*
            r2 = this;
            androidx.lifecycle.s0 r0 = r3.mo36970z()
            boolean r1 = r3 instanceof androidx.lifecycle.InterfaceC1467o
            if (r1 == 0) goto Lf
            androidx.lifecycle.o r3 = (androidx.lifecycle.InterfaceC1467o) r3
            androidx.lifecycle.r0$b r3 = r3.mo36992p()
            goto L13
        Lf:
            androidx.lifecycle.r0$d r3 = androidx.lifecycle.C1479r0.C1483d.m36977b()
        L13:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1479r0.<init>(androidx.lifecycle.t0):void");
    }

    /* renamed from: a */
    public <T extends AbstractC1468o0> T m36981a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m36980b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends AbstractC1468o0> T m36980b(String str, Class<T> cls) {
        T t;
        T t2 = (T) this.f4362b.m36974b(str);
        if (cls.isInstance(t2)) {
            InterfaceC1481b interfaceC1481b = this.f4361a;
            if (interfaceC1481b instanceof C1484e) {
                ((C1484e) interfaceC1481b).mo36976b(t2);
            }
            return t2;
        }
        InterfaceC1481b interfaceC1481b2 = this.f4361a;
        if (interfaceC1481b2 instanceof AbstractC1482c) {
            t = (T) ((AbstractC1482c) interfaceC1481b2).mo36978c(str, cls);
        } else {
            t = (T) interfaceC1481b2.mo36919a(cls);
        }
        this.f4362b.m36972d(str, t);
        return t;
    }

    public C1479r0(InterfaceC1488t0 interfaceC1488t0, InterfaceC1481b interfaceC1481b) {
        this(interfaceC1488t0.mo36970z(), interfaceC1481b);
    }

    public C1479r0(C1486s0 c1486s0, InterfaceC1481b interfaceC1481b) {
        this.f4361a = interfaceC1481b;
        this.f4362b = c1486s0;
    }
}
