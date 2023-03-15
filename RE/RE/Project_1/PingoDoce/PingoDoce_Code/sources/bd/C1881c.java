package bd;

import bd.CoroutineContext;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6112p;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6447w;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: CoroutineContextImpl.kt */
/* renamed from: bd.c */
/* loaded from: classes2.dex */
public final class C1881c implements CoroutineContext, Serializable {

    /* renamed from: w */
    private final CoroutineContext f5612w;

    /* renamed from: x */
    private final CoroutineContext.InterfaceC1891b f5613x;

    /* compiled from: CoroutineContextImpl.kt */
    /* renamed from: bd.c$a */
    /* loaded from: classes2.dex */
    private static final class C1882a implements Serializable {

        /* renamed from: w */
        private final CoroutineContext[] f5614w;

        /* compiled from: CoroutineContextImpl.kt */
        /* renamed from: bd.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C1883a {
            private C1883a() {
            }

            public /* synthetic */ C1883a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C1883a(null);
        }

        public C1882a(CoroutineContext[] coroutineContextArr) {
            Intrinsics.isThisObjectNull(coroutineContextArr, "elements");
            this.f5614w = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f5614w;
            CoroutineContext coroutineContext = C1894h.f5621w;
            for (CoroutineContext coroutineContext2 : coroutineContextArr) {
                coroutineContext = coroutineContext.mo4545f0(coroutineContext2);
            }
            return coroutineContext;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    /* renamed from: bd.c$b */
    /* loaded from: classes2.dex */
    static final class C1884b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C1884b f5615w = new C1884b();

        C1884b() {
            super(2);
        }

        /* renamed from: a */
        public final String mo39856d(String str, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            Intrinsics.isThisObjectNull(str, "acc");
            Intrinsics.isThisObjectNull(interfaceC1891b, "element");
            if (str.length() == 0) {
                return interfaceC1891b.toString();
            }
            return str + ", " + interfaceC1891b;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    /* renamed from: bd.c$c */
    /* loaded from: classes2.dex */
    static final class C1885c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ CoroutineContext[] f5616w;

        /* renamed from: x */
        final /* synthetic */ C6447w f5617x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1885c(CoroutineContext[] coroutineContextArr, C6447w c6447w) {
            super(2);
            this.f5616w = coroutineContextArr;
            this.f5617x = c6447w;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m35192a((C13195u) obj, (CoroutineContext.InterfaceC1891b) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m35192a(C13195u c13195u, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            Intrinsics.isThisObjectNull(c13195u, "<anonymous parameter 0>");
            Intrinsics.isThisObjectNull(interfaceC1891b, "element");
            CoroutineContext[] coroutineContextArr = this.f5616w;
            C6447w c6447w = this.f5617x;
            int i = c6447w.f17531w;
            c6447w.f17531w = i + 1;
            coroutineContextArr[i] = interfaceC1891b;
        }
    }

    public C1881c(CoroutineContext coroutineContext, CoroutineContext.InterfaceC1891b interfaceC1891b) {
        Intrinsics.isThisObjectNull(coroutineContext, "left");
        Intrinsics.isThisObjectNull(interfaceC1891b, "element");
        this.f5612w = coroutineContext;
        this.f5613x = interfaceC1891b;
    }

    /* renamed from: b */
    private final boolean m35196b(CoroutineContext.InterfaceC1891b interfaceC1891b) {
        return Intrinsics.equals(mo4546c(interfaceC1891b.getKey()), interfaceC1891b);
    }

    /* renamed from: d */
    private final boolean m35195d(C1881c c1881c) {
        while (m35196b(c1881c.f5613x)) {
            CoroutineContext coroutineContext = c1881c.f5612w;
            if (coroutineContext instanceof C1881c) {
                c1881c = (C1881c) coroutineContext;
            } else {
                Intrinsics.m20929f(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m35196b((CoroutineContext.InterfaceC1891b) coroutineContext);
            }
        }
        return false;
    }

    /* renamed from: f */
    private final int m35194f() {
        int i = 2;
        C1881c c1881c = this;
        while (true) {
            CoroutineContext coroutineContext = c1881c.f5612w;
            c1881c = coroutineContext instanceof C1881c ? (C1881c) coroutineContext : null;
            if (c1881c == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int m35194f = m35194f();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[m35194f];
        C6447w c6447w = new C6447w();
        mo4547M(C13195u.f34156a, new C1885c(coroutineContextArr, c6447w));
        if (c6447w.f17531w == m35194f) {
            return new C1882a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: M */
    public Object mo4547M(Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
        return interfaceC6112p.mo39856d(this.f5612w.mo4547M(obj, interfaceC6112p), this.f5613x);
    }

    /* renamed from: c */
    public CoroutineContext.InterfaceC1891b mo4546c(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        Intrinsics.isThisObjectNull(interfaceC1893c, "key");
        C1881c c1881c = this;
        while (true) {
            CoroutineContext.InterfaceC1891b mo4546c = c1881c.f5613x.mo4546c(interfaceC1893c);
            if (mo4546c != null) {
                return mo4546c;
            }
            CoroutineContext coroutineContext = c1881c.f5612w;
            if (coroutineContext instanceof C1881c) {
                c1881c = (C1881c) coroutineContext;
            } else {
                return coroutineContext.mo4546c(interfaceC1893c);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1881c) {
                C1881c c1881c = (C1881c) obj;
                if (c1881c.m35194f() != m35194f() || !c1881c.m35195d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return CoroutineContext.C1889a.m35186a(this, coroutineContext);
    }

    public int hashCode() {
        return this.f5612w.hashCode() + this.f5613x.hashCode();
    }

    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        Intrinsics.isThisObjectNull(interfaceC1893c, "key");
        if (this.f5613x.mo4546c(interfaceC1893c) != null) {
            return this.f5612w;
        }
        CoroutineContext mo4544l0 = this.f5612w.mo4544l0(interfaceC1893c);
        return mo4544l0 == this.f5612w ? this : mo4544l0 == C1894h.f5621w ? this.f5613x : new C1881c(mo4544l0, this.f5613x);
    }

    public String toString() {
        return '[' + ((String) mo4547M(BuildConfig.VERSION_NAME, C1884b.f5615w)) + ']';
    }
}
