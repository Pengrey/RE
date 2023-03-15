package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.r */
/* loaded from: classes2.dex */
public class C6894r extends C6896t {
    /* renamed from: A */
    public final boolean m19887A() {
        return m19875o() == this;
    }

    /* renamed from: B */
    public final Void m19886B() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    @Override // kotlinx.coroutines.internal.C6896t
    /* renamed from: u */
    public boolean mo19885u() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.C6896t
    /* renamed from: v */
    public /* bridge */ /* synthetic */ boolean mo5634v() {
        return ((Boolean) m19886B()).booleanValue();
    }
}
