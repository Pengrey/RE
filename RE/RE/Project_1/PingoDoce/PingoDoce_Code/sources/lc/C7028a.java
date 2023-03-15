package lc;

import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import sd._Strings;

/* renamed from: lc.a */
/* loaded from: classes2.dex */
public final class C7028a {

    /* renamed from: a */
    private final String f18658a;

    /* renamed from: b */
    private final int f18659b;

    /* renamed from: c */
    private final AbstractC7029a f18660c;

    /* compiled from: CaretString.kt */
    /* renamed from: lc.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7029a {

        /* compiled from: CaretString.kt */
        /* renamed from: lc.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C7030a extends AbstractC7029a {

            /* renamed from: a */
            private final boolean f18661a;

            public C7030a(boolean z) {
                super(null);
                this.f18661a = z;
            }

            /* renamed from: c */
            public final boolean m19545c() {
                return this.f18661a;
            }
        }

        /* compiled from: CaretString.kt */
        /* renamed from: lc.a$a$b */
        /* loaded from: classes2.dex */
        public static final class C7031b extends AbstractC7029a {

            /* renamed from: a */
            private final boolean f18662a;

            public C7031b(boolean z) {
                super(null);
                this.f18662a = z;
            }

            /* renamed from: c */
            public final boolean m19544c() {
                return this.f18662a;
            }
        }

        private AbstractC7029a() {
        }

        /* renamed from: a */
        public final boolean m19547a() {
            if (this instanceof C7031b) {
                return ((C7031b) this).m19544c();
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m19546b() {
            if (this instanceof C7030a) {
                return ((C7030a) this).m19545c();
            }
            return false;
        }

        public /* synthetic */ AbstractC7029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C7028a(String str, int i, AbstractC7029a abstractC7029a) {
        Intrinsics.m20926i(str, "string");
        Intrinsics.m20926i(abstractC7029a, "caretGravity");
        this.f18658a = str;
        this.f18659b = i;
        this.f18660c = abstractC7029a;
    }

    /* renamed from: a */
    public final AbstractC7029a m19551a() {
        return this.f18660c;
    }

    /* renamed from: b */
    public final int m19550b() {
        return this.f18659b;
    }

    /* renamed from: c */
    public final String m19549c() {
        return this.f18658a;
    }

    /* renamed from: d */
    public final C7028a m19548d() {
        CharSequence m8866P0;
        String str = this.f18658a;
        if (str != null) {
            m8866P0 = _Strings.m8866P0(str);
            return new C7028a(m8866P0.toString(), this.f18658a.length() - this.f18659b, this.f18660c);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7028a) {
                C7028a c7028a = (C7028a) obj;
                if (Intrinsics.equals(this.f18658a, c7028a.f18658a)) {
                    if (!(this.f18659b == c7028a.f18659b) || !Intrinsics.equals(this.f18660c, c7028a.f18660c)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f18658a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f18659b) * 31;
        AbstractC7029a abstractC7029a = this.f18660c;
        return hashCode + (abstractC7029a != null ? abstractC7029a.hashCode() : 0);
    }

    public String toString() {
        return "CaretString(string=" + this.f18658a + ", caretPosition=" + this.f18659b + ", caretGravity=" + this.f18660c + ")";
    }
}
