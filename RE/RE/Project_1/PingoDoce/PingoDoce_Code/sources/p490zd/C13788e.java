package p490zd;

import androidx.lifecycle.InterfaceC1440f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p181jd.Intrinsics;

/* renamed from: zd.e */
/* loaded from: classes2.dex */
public final class C13788e<T> {

    /* renamed from: a */
    private final ArrayList f34894a;

    /* renamed from: b */
    private final Object f34895b;

    public C13788e(Collection collection, Object obj) {
        Intrinsics.m20926i(collection, "observers");
        this.f34895b = obj;
        this.f34894a = new ArrayList(collection);
    }

    /* renamed from: a */
    public final Object m164a(InterfaceC1440f0 interfaceC1440f0) {
        T t;
        Intrinsics.m20926i(interfaceC1440f0, "observer");
        Iterator<T> it = this.f34894a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.equals((InterfaceC1440f0) t, interfaceC1440f0)) {
                break;
            }
        }
        InterfaceC1440f0 interfaceC1440f02 = (InterfaceC1440f0) t;
        if (interfaceC1440f02 != null) {
            this.f34894a.remove(interfaceC1440f02);
            return this.f34895b;
        }
        return null;
    }

    /* renamed from: b */
    public final Object m163b() {
        return this.f34895b;
    }
}
