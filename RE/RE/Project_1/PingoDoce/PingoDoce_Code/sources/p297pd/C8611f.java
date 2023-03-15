package p297pd;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: pd.f */
/* loaded from: classes2.dex */
public final class C8611f extends C8608d implements InterfaceC8607c<Integer> {

    /* renamed from: A */
    public static final C8612a f22229A = new C8612a(null);

    /* renamed from: B */
    private static final C8611f f22230B = new C8611f(1, 0);

    /* compiled from: Ranges.kt */
    /* renamed from: pd.f$a */
    /* loaded from: classes2.dex */
    public static final class C8612a {
        private C8612a() {
        }

        public /* synthetic */ C8612a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C8611f m15025a() {
            return C8611f.f22230B;
        }
    }

    public C8611f(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // p297pd.C8608d
    public boolean equals(Object obj) {
        if (obj instanceof C8611f) {
            if (!isEmpty() || !((C8611f) obj).isEmpty()) {
                C8611f c8611f = (C8611f) obj;
                if (m15034f() != c8611f.m15034f() || m15033h() != c8611f.m15033h()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p297pd.C8608d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m15034f() * 31) + m15033h();
    }

    @Override // p297pd.C8608d
    public boolean isEmpty() {
        return m15034f() > m15033h();
    }

    /* renamed from: q */
    public boolean m15028q(int i) {
        return m15034f() <= i && i <= m15033h();
    }

    /* renamed from: t */
    public Integer m15027t() {
        return Integer.valueOf(m15033h());
    }

    @Override // p297pd.C8608d
    public String toString() {
        return m15034f() + ".." + m15033h();
    }

    /* renamed from: u */
    public Integer m15026u() {
        return Integer.valueOf(m15034f());
    }
}
