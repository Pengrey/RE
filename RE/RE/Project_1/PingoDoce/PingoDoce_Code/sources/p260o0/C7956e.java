package p260o0;

import id.InterfaceC6108l;
import kotlin.ExceptionsH;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: Snapshot.kt */
/* renamed from: o0.e */
/* loaded from: classes.dex */
public final class C7956e extends AbstractC7961h {

    /* renamed from: e */
    private final AbstractC7961h f20637e;

    /* renamed from: f */
    private final InterfaceC6108l f20638f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    /* renamed from: o0.e$a */
    /* loaded from: classes.dex */
    public static final class C7957a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f20639w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f20640x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7957a(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
            super(1);
            this.f20639w = interfaceC6108l;
            this.f20640x = interfaceC6108l2;
        }

        /* renamed from: a */
        public final void m17416a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "state");
            this.f20639w.mo9587d(obj);
            this.f20640x.mo9587d(obj);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17416a(obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7956e(int i, SnapshotIdSet snapshotIdSet, InterfaceC6108l interfaceC6108l, AbstractC7961h abstractC7961h) {
        super(i, snapshotIdSet, null);
        Intrinsics.isThisObjectNull(snapshotIdSet, "invalid");
        Intrinsics.isThisObjectNull(abstractC7961h, "parent");
        InterfaceC6108l interfaceC6108l2 = null;
        this.f20637e = abstractC7961h;
        abstractC7961h.m17378j(this);
        if (interfaceC6108l != null) {
            InterfaceC6108l m17382f = m17421t().m17382f();
            interfaceC6108l2 = m17382f != null ? new C7957a(interfaceC6108l, m17382f) : interfaceC6108l;
        }
        this.f20638f = interfaceC6108l2 == null ? abstractC7961h.m17382f() : interfaceC6108l2;
    }

    /* renamed from: b */
    public void m17430b() {
        if (m17385c()) {
            return;
        }
        if (m17384d() != this.f20637e.m17384d()) {
            m17387a();
        }
        this.f20637e.m17377k(this);
        super.m17386b();
    }

    /* renamed from: f */
    public InterfaceC6108l m17429f() {
        return this.f20638f;
    }

    /* renamed from: g */
    public boolean m17428g() {
        return true;
    }

    /* renamed from: h */
    public InterfaceC6108l m17427h() {
        return null;
    }

    /* renamed from: l */
    public void m17424l() {
    }

    /* renamed from: t */
    public final AbstractC7961h m17421t() {
        return this.f20637e;
    }

    /* renamed from: u */
    public Void m17426j(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: v */
    public Void m17425k(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: w */
    public Void m17423m(InterfaceC7950b0 interfaceC7950b0) {
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        C7971l.m17308o();
        throw new ExceptionsH();
    }

    /* renamed from: x */
    public C7956e m17422r(InterfaceC6108l interfaceC6108l) {
        return new C7956e(m17384d(), m17383e(), interfaceC6108l, this.f20637e);
    }
}
