package p181jd;

import kotlin.jvm.internal.AbstractC6765a;
import p314qd.InterfaceC9716a;
import p314qd.InterfaceC9724h;

/* renamed from: jd.t */
/* loaded from: classes2.dex */
public abstract class AbstractC6444t extends AbstractC6765a implements InterfaceC9724h {
    public AbstractC6444t() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6444t) {
            AbstractC6444t abstractC6444t = (AbstractC6444t) obj;
            return m20179f().equals(abstractC6444t.m20179f()) && m20180e().equals(abstractC6444t.m20180e()) && m20177h().equals(abstractC6444t.m20177h()) && Intrinsics.equals(m20181d(), abstractC6444t.m20181d());
        } else if (obj instanceof InterfaceC9724h) {
            return obj.equals(m20183b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((m20179f().hashCode() * 31) + m20180e().hashCode()) * 31) + m20177h().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public InterfaceC9724h m20908i() {
        return (InterfaceC9724h) super.m20178g();
    }

    public String toString() {
        InterfaceC9716a m20183b = m20183b();
        if (m20183b != this) {
            return m20183b.toString();
        }
        return "property " + m20180e() + " (Kotlin reflection is not available)";
    }

    public AbstractC6444t(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
