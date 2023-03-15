package p260o0;

import id.InterfaceC6108l;
import kotlin.ExceptionsH;
import p181jd.Intrinsics;

/* compiled from: Snapshot.kt */
/* renamed from: o0.g */
/* loaded from: classes.dex */
public final class C7960g extends AbstractC7961h {

    /* renamed from: e */
    private final InterfaceC6108l f20644e;

    /* renamed from: f */
    private int f20645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7960g(int i, SnapshotIdSet snapshotIdSet, InterfaceC6108l interfaceC6108l) {
        super(i, snapshotIdSet, null);
        Intrinsics.isThisObjectNull(snapshotIdSet, "invalid");
        this.f20644e = interfaceC6108l;
        this.f20645f = 1;
    }

    /* renamed from: b */
    public void m17396b() {
        if (m17385c()) {
            return;
        }
        m17391k(this);
        super.m17386b();
    }

    /* renamed from: f */
    public InterfaceC6108l m17395f() {
        return this.f20644e;
    }

    /* renamed from: g */
    public boolean m17394g() {
        return true;
    }

    /* renamed from: h */
    public InterfaceC6108l m17393h() {
        return null;
    }

    /* renamed from: j */
    public void m17392j(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        this.f20645f++;
    }

    /* renamed from: k */
    public void m17391k(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        int i = this.f20645f - 1;
        this.f20645f = i;
        if (i == 0) {
            m17387a();
        }
    }

    /* renamed from: l */
    public void m17390l() {
    }

    /* renamed from: m */
    public void m17389m(InterfaceC7950b0 interfaceC7950b0) {
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        C7971l.m17308o();
        throw new ExceptionsH();
    }

    /* renamed from: r */
    public AbstractC7961h m17388r(InterfaceC6108l interfaceC6108l) {
        C7971l.m17303t(this);
        return new C7956e(m17384d(), m17383e(), interfaceC6108l, this);
    }
}
