package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import p139hd.C5908b;
import p181jd.C6450z;
import p314qd.InterfaceC9716a;
import p314qd.InterfaceC9718c;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6765a implements InterfaceC9716a, Serializable {

    /* renamed from: C */
    public static final Object f18128C = C6766a.f18135w;

    /* renamed from: A */
    private final String f18129A;

    /* renamed from: B */
    private final boolean f18130B;

    /* renamed from: w */
    private transient InterfaceC9716a f18131w;

    /* renamed from: x */
    protected final Object f18132x;

    /* renamed from: y */
    private final Class f18133y;

    /* renamed from: z */
    private final String f18134z;

    /* compiled from: CallableReference.java */
    /* renamed from: kotlin.jvm.internal.a$a */
    /* loaded from: classes2.dex */
    private static class C6766a implements Serializable {

        /* renamed from: w */
        private static final C6766a f18135w = new C6766a();

        private C6766a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f18135w;
        }
    }

    public AbstractC6765a() {
        this(f18128C);
    }

    /* renamed from: b */
    public InterfaceC9716a m20183b() {
        InterfaceC9716a interfaceC9716a = this.f18131w;
        if (interfaceC9716a == null) {
            InterfaceC9716a mo20182c = mo20182c();
            this.f18131w = mo20182c;
            return mo20182c;
        }
        return interfaceC9716a;
    }

    /* renamed from: c */
    protected abstract InterfaceC9716a mo20182c();

    /* renamed from: d */
    public Object m20181d() {
        return this.f18132x;
    }

    /* renamed from: e */
    public String m20180e() {
        return this.f18134z;
    }

    /* renamed from: f */
    public InterfaceC9718c m20179f() {
        Class cls = this.f18133y;
        if (cls == null) {
            return null;
        }
        return this.f18130B ? C6450z.m20905c(cls) : C6450z.m20906b(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public InterfaceC9716a m20178g() {
        InterfaceC9716a m20183b = m20183b();
        if (m20183b != this) {
            return m20183b;
        }
        throw new C5908b();
    }

    /* renamed from: h */
    public String m20177h() {
        return this.f18129A;
    }

    protected AbstractC6765a(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6765a(Object obj, Class cls, String str, String str2, boolean z) {
        this.f18132x = obj;
        this.f18133y = cls;
        this.f18134z = str;
        this.f18129A = str2;
        this.f18130B = z;
    }
}
