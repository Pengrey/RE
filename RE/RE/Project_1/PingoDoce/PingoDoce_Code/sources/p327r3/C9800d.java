package p327r3;

import android.content.Context;
import android.util.DisplayMetrics;
import bd.InterfaceC1886d;
import p181jd.Intrinsics;
import p327r3.AbstractC9797c;

/* renamed from: r3.d */
/* loaded from: classes.dex */
public final class C9800d implements InterfaceC9807j {

    /* renamed from: a */
    private final Context f25740a;

    public C9800d(Context context) {
        this.f25740a = context;
    }

    /* renamed from: a */
    public Object mo9941a(InterfaceC1886d interfaceC1886d) {
        DisplayMetrics displayMetrics = this.f25740a.getResources().getDisplayMetrics();
        AbstractC9797c.C9798a m9947a = C9795a.m9947a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C9805i(m9947a, m9947a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9800d) && Intrinsics.equals(this.f25740a, ((C9800d) obj).f25740a);
    }

    public int hashCode() {
        return this.f25740a.hashCode();
    }
}
