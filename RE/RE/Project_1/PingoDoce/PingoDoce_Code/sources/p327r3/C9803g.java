package p327r3;

import android.view.View;
import bd.InterfaceC1886d;
import p181jd.Intrinsics;
import p327r3.InterfaceC9809l;

/* renamed from: r3.g */
/* loaded from: classes.dex */
public final class C9803g<T extends View> implements InterfaceC9809l {

    /* renamed from: a */
    private final View f25742a;

    /* renamed from: b */
    private final boolean f25743b;

    public C9803g(View view, boolean z) {
        this.f25742a = view;
        this.f25743b = z;
    }

    /* renamed from: a */
    public Object mo9941a(InterfaceC1886d interfaceC1886d) {
        return InterfaceC9809l.C9810a.m9930h(this, interfaceC1886d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9803g) {
            C9803g c9803g = (C9803g) obj;
            if (Intrinsics.equals(mo9939j(), c9803g.mo9939j()) && mo9938k() == c9803g.mo9938k()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (mo9939j().hashCode() * 31) + Boolean.hashCode(mo9938k());
    }

    /* renamed from: j */
    public View mo9939j() {
        return this.f25742a;
    }

    /* renamed from: k */
    public boolean mo9938k() {
        return this.f25743b;
    }
}
