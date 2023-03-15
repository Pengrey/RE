package p245n1;

import androidx.compose.p018ui.platform.C0843z0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6097a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p468yc.InterfaceC13174c;

/* renamed from: n1.k */
/* loaded from: classes.dex */
public final class SemanticsConfiguration implements InterfaceC7621v, Iterable, InterfaceC6650a {

    /* renamed from: w */
    private final Map f20114w = new LinkedHashMap();

    /* renamed from: x */
    private boolean f20115x;

    /* renamed from: y */
    private boolean f20116y;

    /* renamed from: b */
    public void mo17910b(C7619u c7619u, Object obj) {
        Intrinsics.isThisObjectNull(c7619u, "key");
        this.f20114w.put(c7619u, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticsConfiguration) {
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
            return Intrinsics.equals(this.f20114w, semanticsConfiguration.f20114w) && this.f20115x == semanticsConfiguration.f20115x && this.f20116y == semanticsConfiguration.f20116y;
        }
        return false;
    }

    /* renamed from: f */
    public final void m18036f(SemanticsConfiguration semanticsConfiguration) {
        Intrinsics.isThisObjectNull(semanticsConfiguration, "peer");
        if (semanticsConfiguration.f20115x) {
            this.f20115x = true;
        }
        if (semanticsConfiguration.f20116y) {
            this.f20116y = true;
        }
        for (Map.Entry entry : semanticsConfiguration.f20114w.entrySet()) {
            C7619u c7619u = (C7619u) entry.getKey();
            Object value = entry.getValue();
            if (!this.f20114w.containsKey(c7619u)) {
                this.f20114w.put(c7619u, value);
            } else if (value instanceof C7580a) {
                Object obj = this.f20114w.get(c7619u);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C7580a c7580a = (C7580a) obj;
                Map map = this.f20114w;
                String m18104b = c7580a.m18104b();
                if (m18104b == null) {
                    m18104b = ((C7580a) value).m18104b();
                }
                InterfaceC13174c m18105a = c7580a.m18105a();
                if (m18105a == null) {
                    m18105a = ((C7580a) value).m18105a();
                }
                map.put(c7619u, new C7580a(m18104b, m18105a));
            }
        }
    }

    /* renamed from: h */
    public final boolean m18035h(C7619u c7619u) {
        Intrinsics.isThisObjectNull(c7619u, "key");
        return this.f20114w.containsKey(c7619u);
    }

    public int hashCode() {
        return (((this.f20114w.hashCode() * 31) + Boolean.hashCode(this.f20115x)) * 31) + Boolean.hashCode(this.f20116y);
    }

    public Iterator iterator() {
        return this.f20114w.entrySet().iterator();
    }

    /* renamed from: l */
    public final SemanticsConfiguration m18034l() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f20115x = this.f20115x;
        semanticsConfiguration.f20116y = this.f20116y;
        semanticsConfiguration.f20114w.putAll(this.f20114w);
        return semanticsConfiguration;
    }

    /* renamed from: o */
    public final Object m18033o(C7619u c7619u) {
        Intrinsics.isThisObjectNull(c7619u, "key");
        Object obj = this.f20114w.get(c7619u);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + c7619u + " - consider getOrElse or getOrNull");
    }

    /* renamed from: p */
    public final Object m18032p(C7619u c7619u, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(c7619u, "key");
        Intrinsics.isThisObjectNull(interfaceC6097a, "defaultValue");
        Object obj = this.f20114w.get(c7619u);
        return obj == null ? interfaceC6097a.mo42214q() : obj;
    }

    /* renamed from: q */
    public final Object m18031q(C7619u c7619u, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(c7619u, "key");
        Intrinsics.isThisObjectNull(interfaceC6097a, "defaultValue");
        Object obj = this.f20114w.get(c7619u);
        return obj == null ? interfaceC6097a.mo42214q() : obj;
    }

    /* renamed from: t */
    public final boolean m18030t() {
        return this.f20116y;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        boolean z = this.f20115x;
        String str = BuildConfig.VERSION_NAME;
        if (z) {
            sb2.append(BuildConfig.VERSION_NAME);
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f20116y) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f20114w.entrySet()) {
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(((C7619u) entry.getKey()).m17913a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return C0843z0.m39450b(this, null) + "{ " + ((Object) sb2) + " }";
    }

    /* renamed from: u */
    public final boolean m18029u() {
        return this.f20115x;
    }

    /* renamed from: v */
    public final void m18028v(SemanticsConfiguration semanticsConfiguration) {
        Intrinsics.isThisObjectNull(semanticsConfiguration, "child");
        for (Map.Entry entry : semanticsConfiguration.f20114w.entrySet()) {
            C7619u c7619u = (C7619u) entry.getKey();
            Object m17912b = c7619u.m17912b(this.f20114w.get(c7619u), entry.getValue());
            if (m17912b != null) {
                this.f20114w.put(c7619u, m17912b);
            }
        }
    }

    /* renamed from: x */
    public final void m18027x(boolean z) {
        this.f20116y = z;
    }

    /* renamed from: y */
    public final void m18026y(boolean z) {
        this.f20115x = z;
    }
}
