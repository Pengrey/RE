package mc;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.AbstractC7034d;
import lc.C7032b;
import p181jd.Intrinsics;
import sd.C10171u;

/* renamed from: mc.e */
/* loaded from: classes2.dex */
public final class C7175e extends AbstractC7034d {

    /* renamed from: b */
    private final AbstractC7176a f19004b;

    /* compiled from: ValueState.kt */
    /* renamed from: mc.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7176a {

        /* compiled from: ValueState.kt */
        /* renamed from: mc.e$a$a */
        /* loaded from: classes2.dex */
        public static final class C7177a extends AbstractC7176a {
            public C7177a() {
                super(null);
            }
        }

        /* compiled from: ValueState.kt */
        /* renamed from: mc.e$a$b */
        /* loaded from: classes2.dex */
        public static final class C7178b extends AbstractC7176a {

            /* renamed from: a */
            private final char f19005a;

            /* renamed from: b */
            private final String f19006b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7178b(char c, String str) {
                super(null);
                Intrinsics.m20926i(str, "characterSet");
                this.f19005a = c;
                this.f19006b = str;
            }

            /* renamed from: a */
            public final char m19000a() {
                return this.f19005a;
            }

            /* renamed from: b */
            public final String m18999b() {
                return this.f19006b;
            }
        }

        /* compiled from: ValueState.kt */
        /* renamed from: mc.e$a$c */
        /* loaded from: classes2.dex */
        public static final class C7179c extends AbstractC7176a {

            /* renamed from: a */
            private final AbstractC7176a f19007a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7179c(AbstractC7176a abstractC7176a) {
                super(null);
                Intrinsics.m20926i(abstractC7176a, "inheritedType");
                this.f19007a = abstractC7176a;
            }

            /* renamed from: a */
            public final AbstractC7176a m18998a() {
                return this.f19007a;
            }
        }

        /* compiled from: ValueState.kt */
        /* renamed from: mc.e$a$d */
        /* loaded from: classes2.dex */
        public static final class C7180d extends AbstractC7176a {
            public C7180d() {
                super(null);
            }
        }

        /* compiled from: ValueState.kt */
        /* renamed from: mc.e$a$e */
        /* loaded from: classes2.dex */
        public static final class C7181e extends AbstractC7176a {
            public C7181e() {
                super(null);
            }
        }

        private AbstractC7176a() {
        }

        public /* synthetic */ AbstractC7176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7175e(AbstractC7176a abstractC7176a) {
        super(null);
        Intrinsics.m20926i(abstractC7176a, "inheritedType");
        this.f19004b = new AbstractC7176a.C7179c(abstractC7176a);
    }

    /* renamed from: e */
    private final boolean m19002e(char c) {
        boolean m8924G;
        boolean m8924G2;
        AbstractC7176a abstractC7176a = this.f19004b;
        if (abstractC7176a instanceof AbstractC7176a.C7181e) {
            return Character.isDigit(c);
        }
        if (abstractC7176a instanceof AbstractC7176a.C7180d) {
            return Character.isLetter(c);
        }
        if (abstractC7176a instanceof AbstractC7176a.C7177a) {
            return Character.isLetterOrDigit(c);
        }
        if (abstractC7176a instanceof AbstractC7176a.C7179c) {
            AbstractC7176a m18998a = ((AbstractC7176a.C7179c) abstractC7176a).m18998a();
            if (m18998a instanceof AbstractC7176a.C7181e) {
                return Character.isDigit(c);
            }
            if (m18998a instanceof AbstractC7176a.C7180d) {
                return Character.isLetter(c);
            }
            if (m18998a instanceof AbstractC7176a.C7177a) {
                return Character.isLetterOrDigit(c);
            }
            if (m18998a instanceof AbstractC7176a.C7178b) {
                m8924G2 = C10171u.m8924G(((AbstractC7176a.C7178b) ((AbstractC7176a.C7179c) this.f19004b).m18998a()).m18999b(), c, false, 2, null);
                return m8924G2;
            }
            return false;
        } else if (abstractC7176a instanceof AbstractC7176a.C7178b) {
            m8924G = C10171u.m8924G(((AbstractC7176a.C7178b) abstractC7176a).m18999b(), c, false, 2, null);
            return m8924G;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // lc.AbstractC7034d
    /* renamed from: a */
    public C7032b mo19004a(char c) {
        if (m19002e(c)) {
            return new C7032b(mo19003d(), Character.valueOf(c), true, Character.valueOf(c));
        }
        return null;
    }

    @Override // lc.AbstractC7034d
    /* renamed from: d */
    public AbstractC7034d mo19003d() {
        return this.f19004b instanceof AbstractC7176a.C7179c ? this : super.mo19003d();
    }

    /* renamed from: f */
    public final boolean m19001f() {
        return this.f19004b instanceof AbstractC7176a.C7179c;
    }

    @Override // lc.AbstractC7034d
    public String toString() {
        AbstractC7176a abstractC7176a = this.f19004b;
        if (abstractC7176a instanceof AbstractC7176a.C7180d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[A] -> ");
            sb2.append(m19536c() != null ? m19536c().toString() : "null");
            return sb2.toString();
        } else if (abstractC7176a instanceof AbstractC7176a.C7181e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[0] -> ");
            sb3.append(m19536c() != null ? m19536c().toString() : "null");
            return sb3.toString();
        } else if (abstractC7176a instanceof AbstractC7176a.C7177a) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[_] -> ");
            sb4.append(m19536c() != null ? m19536c().toString() : "null");
            return sb4.toString();
        } else if (abstractC7176a instanceof AbstractC7176a.C7179c) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("[…] -> ");
            sb5.append(m19536c() != null ? m19536c().toString() : "null");
            return sb5.toString();
        } else if (abstractC7176a instanceof AbstractC7176a.C7178b) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("[");
            sb6.append(((AbstractC7176a.C7178b) this.f19004b).m19000a());
            sb6.append("] -> ");
            sb6.append(m19536c() != null ? m19536c().toString() : "null");
            return sb6.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7175e(AbstractC7034d abstractC7034d, AbstractC7176a abstractC7176a) {
        super(abstractC7034d);
        Intrinsics.m20926i(abstractC7176a, "type");
        this.f19004b = abstractC7176a;
    }
}
