package p490zd;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import p181jd.Intrinsics;
import p489zc.Iterables;

/* renamed from: zd.b */
/* loaded from: classes2.dex */
public final class C13785b<T> extends C1436e0 {

    /* renamed from: l */
    private final C1436e0 f34891l = C13784a.m174a();

    /* renamed from: m */
    private final Map f34892m = new LinkedHashMap();

    /* renamed from: q */
    private final Collection m173q() {
        return this.f34892m.keySet();
    }

    /* renamed from: f */
    public Object mo172f() {
        C13788e c13788e = (C13788e) this.f34891l.mo172f();
        if (c13788e != null) {
            return c13788e.m163b();
        }
        return null;
    }

    /* renamed from: i */
    public void mo171i(InterfaceC1491v interfaceC1491v, InterfaceC1440f0 interfaceC1440f0) {
        Intrinsics.m20926i(interfaceC1491v, "owner");
        Intrinsics.m20926i(interfaceC1440f0, "observer");
        C13789f m165a = C13787d.m165a(interfaceC1491v, interfaceC1440f0);
        this.f34892m.put(interfaceC1440f0, m165a);
        this.f34891l.mo171i(interfaceC1491v, m165a);
    }

    /* renamed from: j */
    public void mo170j(InterfaceC1440f0 interfaceC1440f0) {
        Intrinsics.m20926i(interfaceC1440f0, "observer");
        C13789f m165a = C13787d.m165a(null, interfaceC1440f0);
        this.f34892m.put(interfaceC1440f0, m165a);
        this.f34891l.mo170j(m165a);
    }

    /* renamed from: m */
    public void mo169m(Object obj) {
        this.f34891l.mo169m(new C13788e(m173q(), obj));
    }

    /* renamed from: n */
    public void mo168n(InterfaceC1440f0 interfaceC1440f0) {
        Intrinsics.m20926i(interfaceC1440f0, "observer");
        C13789f c13789f = (C13789f) this.f34892m.remove(interfaceC1440f0);
        if (c13789f != null) {
            this.f34891l.mo168n(c13789f);
        }
    }

    /* renamed from: o */
    public void mo167o(InterfaceC1491v interfaceC1491v) {
        int m186r;
        Intrinsics.m20926i(interfaceC1491v, "owner");
        Collection values = this.f34892m.values();
        ArrayList<C13789f> arrayList = new ArrayList();
        for (T t : values) {
            if (Intrinsics.equals(((C13789f) t).m162a(), interfaceC1491v)) {
                arrayList.add(t);
            }
        }
        m186r = Iterables.m186r(arrayList, 10);
        ArrayList<InterfaceC1440f0> arrayList2 = new ArrayList(m186r);
        for (C13789f c13789f : arrayList) {
            arrayList2.add(c13789f.m161b());
        }
        for (InterfaceC1440f0 interfaceC1440f0 : arrayList2) {
            this.f34892m.remove(interfaceC1440f0);
        }
        this.f34891l.mo167o(interfaceC1491v);
    }

    /* renamed from: p */
    public void mo166p(Object obj) {
        this.f34891l.mo166p(new C13788e(m173q(), obj));
    }
}
