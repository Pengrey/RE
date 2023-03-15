package kotlinx.coroutines.flow;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import java.util.Arrays;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.internal.C6867h0;
import p181jd.Intrinsics;
import p424wd.AbstractC11618a;
import p424wd.AbstractC11620c;
import p424wd.C11619b;
import p424wd.InterfaceC11646o;
import p468yc.C13183m;
import p468yc.C13195u;
import td.C10534k;
import td.C10539l0;
import td.C10542m;
import td.InterfaceC10595y0;

/* renamed from: kotlinx.coroutines.flow.u */
/* loaded from: classes2.dex */
public class C6838u<T> extends AbstractC11618a implements InterfaceC6834q, InterfaceC6785c, InterfaceC11646o {

    /* renamed from: A */
    private final int f18261A;

    /* renamed from: B */
    private final EnumC6771a f18262B;

    /* renamed from: C */
    private Object[] f18263C;

    /* renamed from: D */
    private long f18264D;

    /* renamed from: E */
    private long f18265E;

    /* renamed from: F */
    private int f18266F;

    /* renamed from: G */
    private int f18267G;

    /* renamed from: z */
    private final int f18268z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedFlow.kt */
    /* renamed from: kotlinx.coroutines.flow.u$a */
    /* loaded from: classes2.dex */
    public static final class C6839a implements InterfaceC10595y0 {

        /* renamed from: w */
        public final C6838u f18269w;

        /* renamed from: x */
        public long f18270x;

        /* renamed from: y */
        public final Object f18271y;

        /* renamed from: z */
        public final InterfaceC1886d f18272z;

        public C6839a(C6838u c6838u, long j, Object obj, InterfaceC1886d interfaceC1886d) {
            this.f18269w = c6838u;
            this.f18270x = j;
            this.f18271y = obj;
            this.f18272z = interfaceC1886d;
        }

        /* renamed from: b */
        public void mo6823b() {
            C6838u.m20053n(this.f18269w, this);
        }
    }

    /* compiled from: SharedFlow.kt */
    /* renamed from: kotlinx.coroutines.flow.u$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6840b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18273a;

        static {
            int[] iArr = new int[EnumC6771a.values().length];
            iArr[EnumC6771a.SUSPEND.ordinal()] = 1;
            iArr[EnumC6771a.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC6771a.DROP_OLDEST.ordinal()] = 3;
            f18273a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedFlow.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.SharedFlowImpl", m20196f = "SharedFlow.kt", m20195l = {373, 380, 383}, m20194m = "collect$suspendImpl")
    /* renamed from: kotlinx.coroutines.flow.u$c */
    /* loaded from: classes2.dex */
    public static final class C6841c extends AbstractC6757d {

        /* renamed from: A */
        /* synthetic */ Object f18274A;

        /* renamed from: C */
        int f18276C;

        /* renamed from: w */
        Object f18277w;

        /* renamed from: x */
        Object f18278x;

        /* renamed from: y */
        Object f18279y;

        /* renamed from: z */
        Object f18280z;

        C6841c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f18274A = obj;
            this.f18276C |= Integer.MIN_VALUE;
            return C6838u.m20080A(C6838u.this, null, this);
        }
    }

    public C6838u(int i, int i2, EnumC6771a enumC6771a) {
        this.f18268z = i;
        this.f18261A = i2;
        this.f18262B = enumC6771a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab A[SYNTHETIC] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m20080A(kotlinx.coroutines.flow.C6838u r8, kotlinx.coroutines.flow.InterfaceC6787d r9, bd.InterfaceC1886d r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6838u.m20080A(kotlinx.coroutines.flow.u, kotlinx.coroutines.flow.d, bd.d):java.lang.Object");
    }

    /* renamed from: B */
    private final void m20079B(long j) {
        AbstractC11620c[] m4585g;
        if (AbstractC11618a.m4586f(this) != 0 && (m4585g = AbstractC11618a.m4585g(this)) != null) {
            for (AbstractC11620c abstractC11620c : m4585g) {
                if (abstractC11620c != null) {
                    C6843w c6843w = (C6843w) abstractC11620c;
                    long j2 = c6843w.f18282a;
                    if (j2 >= 0 && j2 < j) {
                        c6843w.f18282a = j;
                    }
                }
            }
        }
        this.f18265E = j;
    }

    /* renamed from: E */
    private final void m20076E() {
        Object[] objArr = this.f18263C;
        Intrinsics.ifNullDoSomething(objArr);
        C6842v.m20034g(objArr, m20070K(), null);
        this.f18266F--;
        long m20070K = m20070K() + 1;
        if (this.f18264D < m20070K) {
            this.f18264D = m20070K;
        }
        if (this.f18265E < m20070K) {
            m20079B(m20070K);
        }
        if (C10539l0.m7720a()) {
            if (!(m20070K() == m20070K)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: F */
    static /* synthetic */ Object m20075F(C6838u c6838u, Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        if (c6838u.mo20083c(obj)) {
            return C13195u.f34156a;
        }
        Object m20074G = c6838u.m20074G(obj, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20074G == m34636d ? m20074G : C13195u.f34156a;
    }

    /* renamed from: G */
    private final Object m20074G(Object obj, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        InterfaceC1886d[] interfaceC1886dArr;
        C6839a c6839a;
        Object m34636d;
        Object m34636d2;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        InterfaceC1886d[] interfaceC1886dArr2 = C11619b.f29708a;
        synchronized (this) {
            if (m20045v(this, obj)) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                c10534k.resumeWith(C13183m.m1458a(C13195u.f34156a));
                interfaceC1886dArr = m20051p(this, interfaceC1886dArr2);
                c6839a = null;
            } else {
                C6839a c6839a2 = new C6839a(this, m20047t(this) + m20049r(this), obj, c10534k);
                m20052o(this, c6839a2);
                m20046u(this, m20048s(this) + 1);
                if (m20050q(this) == 0) {
                    interfaceC1886dArr2 = m20051p(this, interfaceC1886dArr2);
                }
                interfaceC1886dArr = interfaceC1886dArr2;
                c6839a = c6839a2;
            }
        }
        if (c6839a != null) {
            C10542m.m7715a(c10534k, c6839a);
        }
        for (InterfaceC1886d interfaceC1886d2 : interfaceC1886dArr) {
            if (interfaceC1886d2 != null) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                interfaceC1886d2.resumeWith(C13183m.m1458a(C13195u.f34156a));
            }
        }
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        m34636d2 = C2116d.m34636d();
        return m7728t == m34636d2 ? m7728t : C13195u.f34156a;
    }

    /* renamed from: H */
    private final void m20073H(Object obj) {
        int m20066O = m20066O();
        Object[] objArr = this.f18263C;
        if (objArr == null) {
            objArr = m20065P(null, 0, 2);
        } else if (m20066O >= objArr.length) {
            objArr = m20065P(objArr, m20066O, objArr.length * 2);
        }
        C6842v.m20034g(objArr, m20070K() + m20066O, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: I */
    private final InterfaceC1886d[] m20072I(InterfaceC1886d[] interfaceC1886dArr) {
        AbstractC11620c[] m4585g;
        C6843w c6843w;
        InterfaceC1886d<? super C13195u> interfaceC1886d;
        int length = interfaceC1886dArr.length;
        if (AbstractC11618a.m4586f(this) != 0 && (m4585g = AbstractC11618a.m4585g(this)) != null) {
            int i = 0;
            int length2 = m4585g.length;
            interfaceC1886dArr = interfaceC1886dArr;
            while (i < length2) {
                AbstractC11620c abstractC11620c = m4585g[i];
                if (abstractC11620c != null && (interfaceC1886d = (c6843w = (C6843w) abstractC11620c).f18283b) != null && m20062S(c6843w) >= 0) {
                    int length3 = interfaceC1886dArr.length;
                    interfaceC1886dArr = interfaceC1886dArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC1886dArr, Math.max(2, interfaceC1886dArr.length * 2));
                        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
                        interfaceC1886dArr = copyOf;
                    }
                    interfaceC1886dArr[length] = interfaceC1886d;
                    c6843w.f18283b = null;
                    length++;
                }
                i++;
                interfaceC1886dArr = interfaceC1886dArr;
            }
        }
        return interfaceC1886dArr;
    }

    /* renamed from: J */
    private final long m20071J() {
        return m20070K() + this.f18266F;
    }

    /* renamed from: K */
    private final long m20070K() {
        return Math.min(this.f18265E, this.f18264D);
    }

    /* renamed from: L */
    private final Object m20069L(long j) {
        Object m20035f;
        Object[] objArr = this.f18263C;
        Intrinsics.ifNullDoSomething(objArr);
        m20035f = C6842v.m20035f(objArr, j);
        return m20035f instanceof C6839a ? ((C6839a) m20035f).f18271y : m20035f;
    }

    /* renamed from: M */
    private final long m20068M() {
        return m20070K() + this.f18266F + this.f18267G;
    }

    /* renamed from: N */
    private final int m20067N() {
        return (int) ((m20070K() + this.f18266F) - this.f18264D);
    }

    /* renamed from: O */
    private final int m20066O() {
        return this.f18266F + this.f18267G;
    }

    /* renamed from: P */
    private final Object[] m20065P(Object[] objArr, int i, int i2) {
        Object m20035f;
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f18263C = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m20070K = m20070K();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + m20070K;
                m20035f = C6842v.m20035f(objArr, j);
                C6842v.m20034g(objArr2, j, m20035f);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: Q */
    private final boolean m20064Q(Object obj) {
        if (m4580l() == 0) {
            return m20063R(obj);
        }
        if (this.f18266F >= this.f18261A && this.f18265E <= this.f18264D) {
            int i = C6840b.f18273a[this.f18262B.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m20073H(obj);
        int i2 = this.f18266F + 1;
        this.f18266F = i2;
        if (i2 > this.f18261A) {
            m20076E();
        }
        if (m20067N() > this.f18268z) {
            m20060U(this.f18264D + 1, this.f18265E, m20071J(), m20068M());
        }
        return true;
    }

    /* renamed from: R */
    private final boolean m20063R(Object obj) {
        if (C10539l0.m7720a()) {
            if (!(m4580l() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f18268z == 0) {
            return true;
        }
        m20073H(obj);
        int i = this.f18266F + 1;
        this.f18266F = i;
        if (i > this.f18268z) {
            m20076E();
        }
        this.f18265E = m20070K() + this.f18266F;
        return true;
    }

    /* renamed from: S */
    private final long m20062S(C6843w c6843w) {
        long j = c6843w.f18282a;
        if (j < m20071J()) {
            return j;
        }
        if (this.f18261A <= 0 && j <= m20070K() && this.f18267G != 0) {
            return j;
        }
        return -1L;
    }

    /* renamed from: T */
    private final Object m20061T(C6843w c6843w) {
        Object obj;
        InterfaceC1886d[] interfaceC1886dArr = C11619b.f29708a;
        synchronized (this) {
            long m20062S = m20062S(c6843w);
            if (m20062S < 0) {
                obj = C6842v.f18281a;
            } else {
                long j = c6843w.f18282a;
                Object m20069L = m20069L(m20062S);
                c6843w.f18282a = m20062S + 1;
                interfaceC1886dArr = m20059V(j);
                obj = m20069L;
            }
        }
        for (InterfaceC1886d interfaceC1886d : interfaceC1886dArr) {
            if (interfaceC1886d != null) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                interfaceC1886d.resumeWith(C13183m.m1458a(C13195u.f34156a));
            }
        }
        return obj;
    }

    /* renamed from: U */
    private final void m20060U(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        if (C10539l0.m7720a()) {
            if (!(min >= m20070K())) {
                throw new AssertionError();
            }
        }
        for (long m20070K = m20070K(); m20070K < min; m20070K++) {
            Object[] objArr = this.f18263C;
            Intrinsics.ifNullDoSomething(objArr);
            C6842v.m20034g(objArr, m20070K, null);
        }
        this.f18264D = j;
        this.f18265E = j2;
        this.f18266F = (int) (j3 - min);
        this.f18267G = (int) (j4 - j3);
        if (C10539l0.m7720a()) {
            if (!(this.f18266F >= 0)) {
                throw new AssertionError();
            }
        }
        if (C10539l0.m7720a()) {
            if (!(this.f18267G >= 0)) {
                throw new AssertionError();
            }
        }
        if (C10539l0.m7720a()) {
            if (!(this.f18264D <= m20070K() + ((long) this.f18266F))) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m20053n(C6838u c6838u, C6839a c6839a) {
        c6838u.m20042y(c6839a);
    }

    /* renamed from: o */
    public static final /* synthetic */ void m20052o(C6838u c6838u, Object obj) {
        c6838u.m20073H(obj);
    }

    /* renamed from: p */
    public static final /* synthetic */ InterfaceC1886d[] m20051p(C6838u c6838u, InterfaceC1886d[] interfaceC1886dArr) {
        return c6838u.m20072I(interfaceC1886dArr);
    }

    /* renamed from: q */
    public static final /* synthetic */ int m20050q(C6838u c6838u) {
        return c6838u.f18261A;
    }

    /* renamed from: r */
    public static final /* synthetic */ long m20049r(C6838u c6838u) {
        return c6838u.m20070K();
    }

    /* renamed from: s */
    public static final /* synthetic */ int m20048s(C6838u c6838u) {
        return c6838u.f18267G;
    }

    /* renamed from: t */
    public static final /* synthetic */ int m20047t(C6838u c6838u) {
        return c6838u.m20066O();
    }

    /* renamed from: u */
    public static final /* synthetic */ void m20046u(C6838u c6838u, int i) {
        c6838u.f18267G = i;
    }

    /* renamed from: v */
    public static final /* synthetic */ boolean m20045v(C6838u c6838u, Object obj) {
        return c6838u.m20064Q(obj);
    }

    /* renamed from: w */
    public static final /* synthetic */ long m20044w(C6838u c6838u, C6843w c6843w) {
        return c6838u.m20062S(c6843w);
    }

    /* renamed from: x */
    private final Object m20043x(C6843w c6843w, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        C13195u c13195u;
        Object m34636d;
        Object m34636d2;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        synchronized (this) {
            if (m20044w(this, c6843w) < 0) {
                c6843w.f18283b = c10534k;
                c6843w.f18283b = c10534k;
            } else {
                C13183m.C13184a c13184a = C13183m.f34143w;
                c10534k.resumeWith(C13183m.m1458a(C13195u.f34156a));
            }
            c13195u = C13195u.f34156a;
        }
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        m34636d2 = C2116d.m34636d();
        return m7728t == m34636d2 ? m7728t : c13195u;
    }

    /* renamed from: y */
    private final void m20042y(C6839a c6839a) {
        Object m20035f;
        synchronized (this) {
            if (c6839a.f18270x < m20070K()) {
                return;
            }
            Object[] objArr = this.f18263C;
            Intrinsics.ifNullDoSomething(objArr);
            m20035f = C6842v.m20035f(objArr, c6839a.f18270x);
            if (m20035f != c6839a) {
                return;
            }
            C6842v.m20034g(objArr, c6839a.f18270x, C6842v.f18281a);
            m20041z();
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: z */
    private final void m20041z() {
        Object m20035f;
        if (this.f18261A != 0 || this.f18267G > 1) {
            Object[] objArr = this.f18263C;
            Intrinsics.ifNullDoSomething(objArr);
            while (this.f18267G > 0) {
                m20035f = C6842v.m20035f(objArr, (m20070K() + m20066O()) - 1);
                if (m20035f != C6842v.f18281a) {
                    return;
                }
                this.f18267G--;
                C6842v.m20034g(objArr, m20070K() + m20066O(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public C6843w m20055i() {
        return new C6843w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public C6843w[] m20054j(int i) {
        return new C6843w[i];
    }

    /* renamed from: V */
    public final InterfaceC1886d[] m20059V(long j) {
        int i;
        long j2;
        Object m20035f;
        Object m20035f2;
        long j3;
        AbstractC11620c[] m4585g;
        if (C10539l0.m7720a()) {
            if (!(j >= this.f18265E)) {
                throw new AssertionError();
            }
        }
        if (j > this.f18265E) {
            return C11619b.f29708a;
        }
        long m20070K = m20070K();
        long j4 = this.f18266F + m20070K;
        if (this.f18261A == 0 && this.f18267G > 0) {
            j4++;
        }
        if (AbstractC11618a.m4586f(this) != 0 && (m4585g = AbstractC11618a.m4585g(this)) != null) {
            for (AbstractC11620c abstractC11620c : m4585g) {
                if (abstractC11620c != null) {
                    long j5 = ((C6843w) abstractC11620c).f18282a;
                    if (j5 >= 0 && j5 < j4) {
                        j4 = j5;
                    }
                }
            }
        }
        if (C10539l0.m7720a()) {
            if (!(j4 >= this.f18265E)) {
                throw new AssertionError();
            }
        }
        if (j4 <= this.f18265E) {
            return C11619b.f29708a;
        }
        long m20071J = m20071J();
        if (m4580l() > 0) {
            i = Math.min(this.f18267G, this.f18261A - ((int) (m20071J - j4)));
        } else {
            i = this.f18267G;
        }
        InterfaceC1886d[] interfaceC1886dArr = C11619b.f29708a;
        long j6 = this.f18267G + m20071J;
        if (i > 0) {
            interfaceC1886dArr = new InterfaceC1886d[i];
            Object[] objArr = this.f18263C;
            Intrinsics.ifNullDoSomething(objArr);
            long j7 = m20071J;
            int i2 = 0;
            while (true) {
                if (m20071J >= j6) {
                    j2 = j4;
                    break;
                }
                m20035f2 = C6842v.m20035f(objArr, m20071J);
                C6867h0 c6867h0 = C6842v.f18281a;
                j2 = j4;
                if (m20035f2 != c6867h0) {
                    Objects.requireNonNull(m20035f2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C6839a c6839a = (C6839a) m20035f2;
                    int i3 = i2 + 1;
                    interfaceC1886dArr[i2] = c6839a.f18272z;
                    C6842v.m20034g(objArr, m20071J, c6867h0);
                    C6842v.m20034g(objArr, j7, c6839a.f18271y);
                    j3 = 1;
                    j7++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j3 = 1;
                }
                m20071J += j3;
                j4 = j2;
            }
            m20071J = j7;
        } else {
            j2 = j4;
        }
        int i4 = (int) (m20071J - m20070K);
        long j8 = m4580l() == 0 ? m20071J : j2;
        long max = Math.max(this.f18264D, m20071J - Math.min(this.f18268z, i4));
        if (this.f18261A == 0 && max < j6) {
            Object[] objArr2 = this.f18263C;
            Intrinsics.ifNullDoSomething(objArr2);
            m20035f = C6842v.m20035f(objArr2, max);
            if (Intrinsics.equals(m20035f, C6842v.f18281a)) {
                m20071J++;
                max++;
            }
        }
        m20060U(max, j8, m20071J, j6);
        m20041z();
        return true ^ (interfaceC1886dArr.length == 0) ? m20072I(interfaceC1886dArr) : interfaceC1886dArr;
    }

    /* renamed from: W */
    public final long m20058W() {
        long j = this.f18264D;
        if (j < this.f18265E) {
            this.f18265E = j;
        }
        return j;
    }

    /* renamed from: a */
    public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
        return m20075F(this, obj, interfaceC1886d);
    }

    /* renamed from: c */
    public boolean mo20083c(Object obj) {
        int i;
        boolean z;
        InterfaceC1886d[] interfaceC1886dArr = C11619b.f29708a;
        synchronized (this) {
            if (m20064Q(obj)) {
                interfaceC1886dArr = m20072I(interfaceC1886dArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC1886d interfaceC1886d : interfaceC1886dArr) {
            if (interfaceC1886d != null) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                interfaceC1886d.resumeWith(C13183m.m1458a(C13195u.f34156a));
            }
        }
        return z;
    }

    /* renamed from: d */
    public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
        return m20080A(this, interfaceC6787d, interfaceC1886d);
    }

    /* renamed from: e */
    public InterfaceC6785c mo4540e(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        return C6842v.m20036e(this, coroutineContext, i, enumC6771a);
    }
}
