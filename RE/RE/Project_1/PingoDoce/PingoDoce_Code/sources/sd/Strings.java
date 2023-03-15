package sd;

import id.InterfaceC6112p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p297pd.C8611f;
import p297pd._Ranges;
import p337rd.InterfaceC9870e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.e */
/* loaded from: classes2.dex */
public final class Strings implements InterfaceC9870e {

    /* renamed from: a */
    private final CharSequence f26475a;

    /* renamed from: b */
    private final int f26476b;

    /* renamed from: c */
    private final int f26477c;

    /* renamed from: d */
    private final InterfaceC6112p f26478d;

    /* compiled from: Strings.kt */
    /* renamed from: sd.e$a */
    /* loaded from: classes2.dex */
    public static final class C10151a implements Iterator, InterfaceC6650a {

        /* renamed from: A */
        private int f26479A;

        /* renamed from: w */
        private int f26481w = -1;

        /* renamed from: x */
        private int f26482x;

        /* renamed from: y */
        private int f26483y;

        /* renamed from: z */
        private C8611f f26484z;

        C10151a() {
            int m14996m;
            m14996m = _Ranges.m14996m(Strings.m9033e(Strings.this), 0, Strings.m9035c(Strings.this).length());
            this.f26482x = m14996m;
            this.f26483y = m14996m;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < sd.Strings.m9034d(r6.f26480B)) goto L13;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m9032a() {
            /*
                r6 = this;
                int r0 = r6.f26483y
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f26481w = r1
                r0 = 0
                r6.f26484z = r0
                goto L9e
            Lc:
                sd.e r0 = sd.Strings.this
                int r0 = sd.Strings.m9034d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f26479A
                int r0 = r0 + r3
                r6.f26479A = r0
                sd.e r4 = sd.Strings.this
                int r4 = sd.Strings.m9034d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f26483y
                sd.e r4 = sd.Strings.this
                java.lang.CharSequence r4 = sd.Strings.m9035c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                pd.f r0 = new pd.f
                int r1 = r6.f26482x
                sd.e r4 = sd.Strings.this
                java.lang.CharSequence r4 = sd.Strings.m9035c(r4)
                int r4 = sd.C10171u.m8911O(r4)
                r0.<init>(r1, r4)
                r6.f26484z = r0
                r6.f26483y = r2
                goto L9c
            L47:
                sd.e r0 = sd.Strings.this
                id.p r0 = sd.Strings.m9036b(r0)
                sd.e r4 = sd.Strings.this
                java.lang.CharSequence r4 = sd.Strings.m9035c(r4)
                int r5 = r6.f26483y
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo39856d(r4, r5)
                yc.l r0 = (p468yc.C13182l) r0
                if (r0 != 0) goto L77
                pd.f r0 = new pd.f
                int r1 = r6.f26482x
                sd.e r4 = sd.Strings.this
                java.lang.CharSequence r4 = sd.Strings.m9035c(r4)
                int r4 = sd.C10171u.m8911O(r4)
                r0.<init>(r1, r4)
                r6.f26484z = r0
                r6.f26483y = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m1462a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m1461b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f26482x
                pd.f r4 = p297pd.C8613g.m15009q(r4, r2)
                r6.f26484z = r4
                int r2 = r2 + r0
                r6.f26482x = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f26483y = r2
            L9c:
                r6.f26481w = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.Strings.C10151a.m9032a():void");
        }

        /* renamed from: b */
        public C8611f next() {
            if (this.f26481w == -1) {
                m9032a();
            }
            if (this.f26481w != 0) {
                C8611f c8611f = this.f26484z;
                Intrinsics.m20929f(c8611f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f26484z = null;
                this.f26481w = -1;
                return c8611f;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f26481w == -1) {
                m9032a();
            }
            return this.f26481w == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Strings(CharSequence charSequence, int i, int i2, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(charSequence, "input");
        Intrinsics.isThisObjectNull(interfaceC6112p, "getNextMatch");
        this.f26475a = charSequence;
        this.f26476b = i;
        this.f26477c = i2;
        this.f26478d = interfaceC6112p;
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC6112p m9036b(Strings strings) {
        return strings.f26478d;
    }

    /* renamed from: c */
    public static final /* synthetic */ CharSequence m9035c(Strings strings) {
        return strings.f26475a;
    }

    /* renamed from: d */
    public static final /* synthetic */ int m9034d(Strings strings) {
        return strings.f26477c;
    }

    /* renamed from: e */
    public static final /* synthetic */ int m9033e(Strings strings) {
        return strings.f26476b;
    }

    public Iterator iterator() {
        return new C10151a();
    }
}
