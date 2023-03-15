package p031b9;

import com.google.android.play.core.internal.C3937f;
import p070e.C4906j;

/* renamed from: b9.w */
/* loaded from: classes.dex */
public final class C1866w<T> implements InterfaceC1867x, InterfaceC1864u {

    /* renamed from: c */
    private static final Object f5586c = new Object();

    /* renamed from: a */
    private volatile InterfaceC1867x<T> f5587a;

    /* renamed from: b */
    private volatile Object f5588b = f5586c;

    private C1866w(InterfaceC1867x<T> interfaceC1867x) {
        this.f5587a = interfaceC1867x;
    }

    /* renamed from: a */
    public static <P extends InterfaceC1867x<T>, T> InterfaceC1867x<T> m35246a(P p) {
        C3937f.m28568c(p);
        return p instanceof C1866w ? p : new C1866w(p);
    }

    /* renamed from: b */
    public static <P extends InterfaceC1867x<T>, T> InterfaceC1864u<T> m35245b(P p) {
        if (p instanceof InterfaceC1864u) {
            return (InterfaceC1864u) p;
        }
        C3937f.m28568c(p);
        return new C1866w(p);
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final T mo1547c() {
        T t = (T) this.f5588b;
        Object obj = f5586c;
        if (t == obj) {
            synchronized (this) {
                t = this.f5588b;
                if (t == obj) {
                    t = this.f5587a.mo1547c();
                    Object obj2 = this.f5588b;
                    if (obj2 != obj && obj2 != t) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + C4906j.f13380A0 + valueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(valueOf);
                        sb2.append(" & ");
                        sb2.append(valueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f5588b = t;
                    this.f5587a = null;
                }
            }
        }
        return t;
    }
}
