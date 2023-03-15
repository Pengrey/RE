package mc;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.AbstractC7034d;
import lc.C7032b;
import p181jd.Intrinsics;
import sd.C10171u;

/* renamed from: mc.d */
/* loaded from: classes2.dex */
public final class C7169d extends AbstractC7034d {

    /* renamed from: b */
    private final AbstractC7170a f19001b;

    /* compiled from: OptionalValueState.kt */
    /* renamed from: mc.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7170a {

        /* compiled from: OptionalValueState.kt */
        /* renamed from: mc.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C7171a extends AbstractC7170a {
            public C7171a() {
                super(null);
            }
        }

        /* compiled from: OptionalValueState.kt */
        /* renamed from: mc.d$a$b */
        /* loaded from: classes2.dex */
        public static final class C7172b extends AbstractC7170a {

            /* renamed from: a */
            private final char f19002a;

            /* renamed from: b */
            private final String f19003b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7172b(char c, String str) {
                super(null);
                Intrinsics.m20926i(str, "characterSet");
                this.f19002a = c;
                this.f19003b = str;
            }

            /* renamed from: a */
            public final char m19006a() {
                return this.f19002a;
            }

            /* renamed from: b */
            public final String m19005b() {
                return this.f19003b;
            }
        }

        /* compiled from: OptionalValueState.kt */
        /* renamed from: mc.d$a$c */
        /* loaded from: classes2.dex */
        public static final class C7173c extends AbstractC7170a {
            public C7173c() {
                super(null);
            }
        }

        /* compiled from: OptionalValueState.kt */
        /* renamed from: mc.d$a$d */
        /* loaded from: classes2.dex */
        public static final class C7174d extends AbstractC7170a {
            public C7174d() {
                super(null);
            }
        }

        private AbstractC7170a() {
        }

        public /* synthetic */ AbstractC7170a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7169d(AbstractC7034d abstractC7034d, AbstractC7170a abstractC7170a) {
        super(abstractC7034d);
        Intrinsics.m20926i(abstractC7034d, "child");
        Intrinsics.m20926i(abstractC7170a, "type");
        this.f19001b = abstractC7170a;
    }

    /* renamed from: e */
    private final boolean m19007e(char c) {
        boolean m8924G;
        AbstractC7170a abstractC7170a = this.f19001b;
        if (abstractC7170a instanceof AbstractC7170a.C7174d) {
            return Character.isDigit(c);
        }
        if (abstractC7170a instanceof AbstractC7170a.C7173c) {
            return Character.isLetter(c);
        }
        if (abstractC7170a instanceof AbstractC7170a.C7171a) {
            return Character.isLetterOrDigit(c);
        }
        if (abstractC7170a instanceof AbstractC7170a.C7172b) {
            m8924G = C10171u.m8924G(((AbstractC7170a.C7172b) abstractC7170a).m19005b(), c, false, 2, null);
            return m8924G;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // lc.AbstractC7034d
    /* renamed from: a */
    public C7032b mo19004a(char c) {
        if (m19007e(c)) {
            return new C7032b(mo19003d(), Character.valueOf(c), true, Character.valueOf(c));
        }
        return new C7032b(mo19003d(), null, false, null);
    }

    @Override // lc.AbstractC7034d
    public String toString() {
        AbstractC7170a abstractC7170a = this.f19001b;
        if (abstractC7170a instanceof AbstractC7170a.C7173c) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[a] -> ");
            sb2.append(m19536c() != null ? m19536c().toString() : "null");
            return sb2.toString();
        } else if (abstractC7170a instanceof AbstractC7170a.C7174d) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[9] -> ");
            sb3.append(m19536c() != null ? m19536c().toString() : "null");
            return sb3.toString();
        } else if (abstractC7170a instanceof AbstractC7170a.C7171a) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[-] -> ");
            sb4.append(m19536c() != null ? m19536c().toString() : "null");
            return sb4.toString();
        } else if (abstractC7170a instanceof AbstractC7170a.C7172b) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("[");
            sb5.append(((AbstractC7170a.C7172b) this.f19001b).m19006a());
            sb5.append("] -> ");
            sb5.append(m19536c() != null ? m19536c().toString() : "null");
            return sb5.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
