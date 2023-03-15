package p368ta;

import com.google.gson.AbstractC4376l;
import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.C4373i;
import com.google.gson.C4377m;
import com.google.gson.C4378n;
import com.google.gson.C4379o;
import com.google.gson.InterfaceC4391t;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p334ra.InterfaceC9832c;
import p421wa.C11605a;
import sa.C10123g;

/* renamed from: ta.n */
/* loaded from: classes2.dex */
public final class C10432n {

    /* renamed from: A */
    public static final AbstractC4385s<String> f27107A;

    /* renamed from: B */
    public static final AbstractC4385s<BigDecimal> f27108B;

    /* renamed from: C */
    public static final AbstractC4385s<BigInteger> f27109C;

    /* renamed from: D */
    public static final InterfaceC4391t f27110D;

    /* renamed from: E */
    public static final AbstractC4385s<StringBuilder> f27111E;

    /* renamed from: F */
    public static final InterfaceC4391t f27112F;

    /* renamed from: G */
    public static final AbstractC4385s<StringBuffer> f27113G;

    /* renamed from: H */
    public static final InterfaceC4391t f27114H;

    /* renamed from: I */
    public static final AbstractC4385s<URL> f27115I;

    /* renamed from: J */
    public static final InterfaceC4391t f27116J;

    /* renamed from: K */
    public static final AbstractC4385s<URI> f27117K;

    /* renamed from: L */
    public static final InterfaceC4391t f27118L;

    /* renamed from: M */
    public static final AbstractC4385s<InetAddress> f27119M;

    /* renamed from: N */
    public static final InterfaceC4391t f27120N;

    /* renamed from: O */
    public static final AbstractC4385s<UUID> f27121O;

    /* renamed from: P */
    public static final InterfaceC4391t f27122P;

    /* renamed from: Q */
    public static final AbstractC4385s<Currency> f27123Q;

    /* renamed from: R */
    public static final InterfaceC4391t f27124R;

    /* renamed from: S */
    public static final InterfaceC4391t f27125S;

    /* renamed from: T */
    public static final AbstractC4385s<Calendar> f27126T;

    /* renamed from: U */
    public static final InterfaceC4391t f27127U;

    /* renamed from: V */
    public static final AbstractC4385s<Locale> f27128V;

    /* renamed from: W */
    public static final InterfaceC4391t f27129W;

    /* renamed from: X */
    public static final AbstractC4385s<AbstractC4376l> f27130X;

    /* renamed from: Y */
    public static final InterfaceC4391t f27131Y;

    /* renamed from: Z */
    public static final InterfaceC4391t f27132Z;

    /* renamed from: a */
    public static final AbstractC4385s<Class> f27133a;

    /* renamed from: b */
    public static final InterfaceC4391t f27134b;

    /* renamed from: c */
    public static final AbstractC4385s<BitSet> f27135c;

    /* renamed from: d */
    public static final InterfaceC4391t f27136d;

    /* renamed from: e */
    public static final AbstractC4385s<Boolean> f27137e;

    /* renamed from: f */
    public static final AbstractC4385s<Boolean> f27138f;

    /* renamed from: g */
    public static final InterfaceC4391t f27139g;

    /* renamed from: h */
    public static final AbstractC4385s<Number> f27140h;

    /* renamed from: i */
    public static final InterfaceC4391t f27141i;

    /* renamed from: j */
    public static final AbstractC4385s<Number> f27142j;

    /* renamed from: k */
    public static final InterfaceC4391t f27143k;

    /* renamed from: l */
    public static final AbstractC4385s<Number> f27144l;

    /* renamed from: m */
    public static final InterfaceC4391t f27145m;

    /* renamed from: n */
    public static final AbstractC4385s<AtomicInteger> f27146n;

    /* renamed from: o */
    public static final InterfaceC4391t f27147o;

    /* renamed from: p */
    public static final AbstractC4385s<AtomicBoolean> f27148p;

    /* renamed from: q */
    public static final InterfaceC4391t f27149q;

    /* renamed from: r */
    public static final AbstractC4385s<AtomicIntegerArray> f27150r;

    /* renamed from: s */
    public static final InterfaceC4391t f27151s;

    /* renamed from: t */
    public static final AbstractC4385s<Number> f27152t;

    /* renamed from: u */
    public static final AbstractC4385s<Number> f27153u;

    /* renamed from: v */
    public static final AbstractC4385s<Number> f27154v;

    /* renamed from: w */
    public static final AbstractC4385s<Number> f27155w;

    /* renamed from: x */
    public static final InterfaceC4391t f27156x;

    /* renamed from: y */
    public static final AbstractC4385s<Character> f27157y;

    /* renamed from: z */
    public static final InterfaceC4391t f27158z;

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$a */
    /* loaded from: classes2.dex */
    class C10433a extends AbstractC4385s<AtomicIntegerArray> {
        C10433a() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public AtomicIntegerArray mo27782e(C4387a c4387a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c4387a.mo8044a();
            while (c4387a.mo8055H()) {
                try {
                    arrayList.add(Integer.valueOf(c4387a.mo8045X()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            c4387a.mo8037v();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c4390c.mo8030e();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                c4390c.mo8028l0(atomicIntegerArray.get(i));
            }
            c4390c.mo8024v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$a0 */
    /* loaded from: classes2.dex */
    public class C10434a0 implements InterfaceC4391t {

        /* renamed from: w */
        final /* synthetic */ Class f27159w;

        /* renamed from: x */
        final /* synthetic */ Class f27160x;

        /* renamed from: y */
        final /* synthetic */ AbstractC4385s f27161y;

        C10434a0(Class cls, Class cls2, AbstractC4385s abstractC4385s) {
            this.f27159w = cls;
            this.f27160x = cls2;
            this.f27161y = abstractC4385s;
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            Class<? super T> m4629c = c11605a.m4629c();
            if (m4629c == this.f27159w || m4629c == this.f27160x) {
                return this.f27161y;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27159w.getName() + "+" + this.f27160x.getName() + ",adapter=" + this.f27161y + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$b */
    /* loaded from: classes2.dex */
    class C10435b extends AbstractC4385s<Number> {
        C10435b() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Number mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            try {
                return Long.valueOf(c4387a.mo8043a0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            c4390c.mo8026q0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$b0 */
    /* loaded from: classes2.dex */
    public class C10436b0 implements InterfaceC4391t {

        /* renamed from: w */
        final /* synthetic */ Class f27162w;

        /* renamed from: x */
        final /* synthetic */ AbstractC4385s f27163x;

        /* compiled from: TypeAdapters.java */
        /* renamed from: ta.n$b0$a */
        /* loaded from: classes2.dex */
        class C10437a extends AbstractC4385s<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f27164a;

            C10437a(Class cls) {
                this.f27164a = cls;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
            @Override // com.google.gson.AbstractC4385s
            /* renamed from: b */
            public T1 mo27782e(C4387a c4387a) throws IOException {
                ?? mo27782e = C10436b0.this.f27163x.mo27782e(c4387a);
                if (mo27782e == 0 || this.f27164a.isInstance(mo27782e)) {
                    return mo27782e;
                }
                throw new JsonSyntaxException("Expected a " + this.f27164a.getName() + " but was " + mo27782e.getClass().getName());
            }

            @Override // com.google.gson.AbstractC4385s
            /* renamed from: d */
            public void mo27781f(C4390c c4390c, T1 t1) throws IOException {
                C10436b0.this.f27163x.mo27781f(c4390c, t1);
            }
        }

        C10436b0(Class cls, AbstractC4385s abstractC4385s) {
            this.f27162w = cls;
            this.f27163x = abstractC4385s;
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T2> AbstractC4385s<T2> mo7935a(C4364f c4364f, C11605a<T2> c11605a) {
            Class<? super T2> m4629c = c11605a.m4629c();
            if (this.f27162w.isAssignableFrom(m4629c)) {
                return new C10437a(m4629c);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f27162w.getName() + ",adapter=" + this.f27163x + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$c */
    /* loaded from: classes2.dex */
    class C10438c extends AbstractC4385s<Number> {
        C10438c() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Number mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return Float.valueOf((float) c4387a.mo8046W());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            c4390c.mo8026q0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$c0 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C10439c0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27166a;

        static {
            int[] iArr = new int[EnumC4389b.values().length];
            f27166a = iArr;
            try {
                iArr[EnumC4389b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27166a[EnumC4389b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27166a[EnumC4389b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27166a[EnumC4389b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27166a[EnumC4389b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27166a[EnumC4389b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27166a[EnumC4389b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27166a[EnumC4389b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27166a[EnumC4389b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27166a[EnumC4389b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$d */
    /* loaded from: classes2.dex */
    class C10440d extends AbstractC4385s<Number> {
        C10440d() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Number mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return Double.valueOf(c4387a.mo8046W());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            c4390c.mo8026q0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$d0 */
    /* loaded from: classes2.dex */
    class C10441d0 extends AbstractC4385s<Boolean> {
        C10441d0() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Boolean mo27782e(C4387a c4387a) throws IOException {
            EnumC4389b mo8038o0 = c4387a.mo8038o0();
            if (mo8038o0 == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            } else if (mo8038o0 == EnumC4389b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(c4387a.mo8039j0()));
            } else {
                return Boolean.valueOf(c4387a.mo8047R());
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Boolean bool) throws IOException {
            c4390c.mo8027o0(bool);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$e */
    /* loaded from: classes2.dex */
    class C10442e extends AbstractC4385s<Number> {
        C10442e() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Number mo27782e(C4387a c4387a) throws IOException {
            EnumC4389b mo8038o0 = c4387a.mo8038o0();
            int i = C10439c0.f27166a[mo8038o0.ordinal()];
            if (i == 1 || i == 3) {
                return new C10123g(c4387a.mo8039j0());
            }
            if (i == 4) {
                c4387a.mo8040e0();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + mo8038o0);
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            c4390c.mo8026q0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$e0 */
    /* loaded from: classes2.dex */
    class C10443e0 extends AbstractC4385s<Boolean> {
        C10443e0() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Boolean mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return Boolean.valueOf(c4387a.mo8039j0());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Boolean bool) throws IOException {
            c4390c.mo8025t0(bool == null ? "null" : bool.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$f */
    /* loaded from: classes2.dex */
    class C10444f extends AbstractC4385s<Character> {
        C10444f() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Character mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            String mo8039j0 = c4387a.mo8039j0();
            if (mo8039j0.length() == 1) {
                return Character.valueOf(mo8039j0.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + mo8039j0);
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Character ch2) throws IOException {
            c4390c.mo8025t0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$f0 */
    /* loaded from: classes2.dex */
    class C10445f0 extends AbstractC4385s<Number> {
        C10445f0() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Number mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            try {
                return Byte.valueOf((byte) c4387a.mo8045X());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            c4390c.mo8026q0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$g */
    /* loaded from: classes2.dex */
    class C10446g extends AbstractC4385s<String> {
        C10446g() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public String mo27782e(C4387a c4387a) throws IOException {
            EnumC4389b mo8038o0 = c4387a.mo8038o0();
            if (mo8038o0 == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            } else if (mo8038o0 == EnumC4389b.BOOLEAN) {
                return Boolean.toString(c4387a.mo8047R());
            } else {
                return c4387a.mo8039j0();
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, String str) throws IOException {
            c4390c.mo8025t0(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$g0 */
    /* loaded from: classes2.dex */
    class C10447g0 extends AbstractC4385s<Number> {
        C10447g0() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Number mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            try {
                return Short.valueOf((short) c4387a.mo8045X());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            c4390c.mo8026q0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$h */
    /* loaded from: classes2.dex */
    class C10448h extends AbstractC4385s<BigDecimal> {
        C10448h() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public BigDecimal mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            try {
                return new BigDecimal(c4387a.mo8039j0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, BigDecimal bigDecimal) throws IOException {
            c4390c.mo8026q0(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$h0 */
    /* loaded from: classes2.dex */
    class C10449h0 extends AbstractC4385s<Number> {
        C10449h0() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Number mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            try {
                return Integer.valueOf(c4387a.mo8045X());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            c4390c.mo8026q0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$i */
    /* loaded from: classes2.dex */
    class C10450i extends AbstractC4385s<BigInteger> {
        C10450i() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public BigInteger mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            try {
                return new BigInteger(c4387a.mo8039j0());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, BigInteger bigInteger) throws IOException {
            c4390c.mo8026q0(bigInteger);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$i0 */
    /* loaded from: classes2.dex */
    class C10451i0 extends AbstractC4385s<AtomicInteger> {
        C10451i0() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public AtomicInteger mo27782e(C4387a c4387a) throws IOException {
            try {
                return new AtomicInteger(c4387a.mo8045X());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, AtomicInteger atomicInteger) throws IOException {
            c4390c.mo8028l0(atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$j */
    /* loaded from: classes2.dex */
    class C10452j extends AbstractC4385s<StringBuilder> {
        C10452j() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public StringBuilder mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return new StringBuilder(c4387a.mo8039j0());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, StringBuilder sb2) throws IOException {
            c4390c.mo8025t0(sb2 == null ? null : sb2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$j0 */
    /* loaded from: classes2.dex */
    class C10453j0 extends AbstractC4385s<AtomicBoolean> {
        C10453j0() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public AtomicBoolean mo27782e(C4387a c4387a) throws IOException {
            return new AtomicBoolean(c4387a.mo8047R());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, AtomicBoolean atomicBoolean) throws IOException {
            c4390c.mo8023v0(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$k */
    /* loaded from: classes2.dex */
    class C10454k extends AbstractC4385s<Class> {
        C10454k() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Class mo27782e(C4387a c4387a) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$k0 */
    /* loaded from: classes2.dex */
    private static final class C10455k0<T extends Enum<T>> extends AbstractC4385s<T> {

        /* renamed from: a */
        private final Map<String, T> f27167a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f27168b = new HashMap();

        public C10455k0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    InterfaceC9832c interfaceC9832c = (InterfaceC9832c) cls.getField(name).getAnnotation(InterfaceC9832c.class);
                    if (interfaceC9832c != null) {
                        name = interfaceC9832c.value();
                        for (String str : interfaceC9832c.alternate()) {
                            this.f27167a.put(str, t);
                        }
                    }
                    this.f27167a.put(name, t);
                    this.f27168b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public T mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return this.f27167a.get(c4387a.mo8039j0());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, T t) throws IOException {
            c4390c.mo8025t0(t == null ? null : this.f27168b.get(t));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$l */
    /* loaded from: classes2.dex */
    class C10456l extends AbstractC4385s<StringBuffer> {
        C10456l() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public StringBuffer mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return new StringBuffer(c4387a.mo8039j0());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, StringBuffer stringBuffer) throws IOException {
            c4390c.mo8025t0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$m */
    /* loaded from: classes2.dex */
    class C10457m extends AbstractC4385s<URL> {
        C10457m() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public URL mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            String mo8039j0 = c4387a.mo8039j0();
            if ("null".equals(mo8039j0)) {
                return null;
            }
            return new URL(mo8039j0);
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, URL url) throws IOException {
            c4390c.mo8025t0(url == null ? null : url.toExternalForm());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$n */
    /* loaded from: classes2.dex */
    class C10458n extends AbstractC4385s<URI> {
        C10458n() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public URI mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            try {
                String mo8039j0 = c4387a.mo8039j0();
                if ("null".equals(mo8039j0)) {
                    return null;
                }
                return new URI(mo8039j0);
            } catch (URISyntaxException e) {
                throw new JsonIOException(e);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, URI uri) throws IOException {
            c4390c.mo8025t0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$o */
    /* loaded from: classes2.dex */
    class C10459o extends AbstractC4385s<InetAddress> {
        C10459o() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public InetAddress mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return InetAddress.getByName(c4387a.mo8039j0());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, InetAddress inetAddress) throws IOException {
            c4390c.mo8025t0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$p */
    /* loaded from: classes2.dex */
    class C10460p extends AbstractC4385s<UUID> {
        C10460p() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public UUID mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return UUID.fromString(c4387a.mo8039j0());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, UUID uuid) throws IOException {
            c4390c.mo8025t0(uuid == null ? null : uuid.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$q */
    /* loaded from: classes2.dex */
    class C10461q extends AbstractC4385s<Currency> {
        C10461q() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Currency mo27782e(C4387a c4387a) throws IOException {
            return Currency.getInstance(c4387a.mo8039j0());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Currency currency) throws IOException {
            c4390c.mo8025t0(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$r */
    /* loaded from: classes2.dex */
    class C10462r implements InterfaceC4391t {

        /* compiled from: TypeAdapters.java */
        /* renamed from: ta.n$r$a */
        /* loaded from: classes2.dex */
        class C10463a extends AbstractC4385s<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ AbstractC4385s f27169a;

            C10463a(C10462r c10462r, AbstractC4385s abstractC4385s) {
                this.f27169a = abstractC4385s;
            }

            @Override // com.google.gson.AbstractC4385s
            /* renamed from: e */
            public Timestamp mo27782e(C4387a c4387a) throws IOException {
                Date date = (Date) this.f27169a.mo27782e(c4387a);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // com.google.gson.AbstractC4385s
            /* renamed from: f */
            public void mo27781f(C4390c c4390c, Timestamp timestamp) throws IOException {
                this.f27169a.mo27781f(c4390c, timestamp);
            }
        }

        C10462r() {
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            if (c11605a.m4629c() != Timestamp.class) {
                return null;
            }
            return new C10463a(this, c4364f.m27795k(Date.class));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$s */
    /* loaded from: classes2.dex */
    class C10464s extends AbstractC4385s<Calendar> {
        C10464s() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Calendar mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            c4387a.mo8041c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (c4387a.mo8038o0() != EnumC4389b.END_OBJECT) {
                String mo8042b0 = c4387a.mo8042b0();
                int mo8045X = c4387a.mo8045X();
                if ("year".equals(mo8042b0)) {
                    i = mo8045X;
                } else if ("month".equals(mo8042b0)) {
                    i2 = mo8045X;
                } else if ("dayOfMonth".equals(mo8042b0)) {
                    i3 = mo8045X;
                } else if ("hourOfDay".equals(mo8042b0)) {
                    i4 = mo8045X;
                } else if ("minute".equals(mo8042b0)) {
                    i5 = mo8045X;
                } else if ("second".equals(mo8042b0)) {
                    i6 = mo8045X;
                }
            }
            c4387a.mo8036y();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Calendar calendar) throws IOException {
            if (calendar == null) {
                c4390c.mo8031P();
                return;
            }
            c4390c.mo8029h();
            c4390c.mo8032L("year");
            c4390c.mo8028l0(calendar.get(1));
            c4390c.mo8032L("month");
            c4390c.mo8028l0(calendar.get(2));
            c4390c.mo8032L("dayOfMonth");
            c4390c.mo8028l0(calendar.get(5));
            c4390c.mo8032L("hourOfDay");
            c4390c.mo8028l0(calendar.get(11));
            c4390c.mo8032L("minute");
            c4390c.mo8028l0(calendar.get(12));
            c4390c.mo8032L("second");
            c4390c.mo8028l0(calendar.get(13));
            c4390c.mo8022y();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$t */
    /* loaded from: classes2.dex */
    class C10465t extends AbstractC4385s<Locale> {
        C10465t() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Locale mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c4387a.mo8039j0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Locale locale) throws IOException {
            c4390c.mo8025t0(locale == null ? null : locale.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$u */
    /* loaded from: classes2.dex */
    class C10466u extends AbstractC4385s<AbstractC4376l> {
        C10466u() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public AbstractC4376l mo27782e(C4387a c4387a) throws IOException {
            switch (C10439c0.f27166a[c4387a.mo8038o0().ordinal()]) {
                case 1:
                    return new C4379o(new C10123g(c4387a.mo8039j0()));
                case 2:
                    return new C4379o(Boolean.valueOf(c4387a.mo8047R()));
                case 3:
                    return new C4379o(c4387a.mo8039j0());
                case 4:
                    c4387a.mo8040e0();
                    return C4377m.f11854a;
                case 5:
                    C4373i c4373i = new C4373i();
                    c4387a.mo8044a();
                    while (c4387a.mo8055H()) {
                        c4373i.m27767u(mo27782e(c4387a));
                    }
                    c4387a.mo8037v();
                    return c4373i;
                case 6:
                    C4378n c4378n = new C4378n();
                    c4387a.mo8041c();
                    while (c4387a.mo8055H()) {
                        c4378n.m27757u(c4387a.mo8042b0(), mo27782e(c4387a));
                    }
                    c4387a.mo8036y();
                    return c4378n;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, AbstractC4376l abstractC4376l) throws IOException {
            if (abstractC4376l != null && !abstractC4376l.m27760p()) {
                if (abstractC4376l.m27758t()) {
                    C4379o m27762g = abstractC4376l.m27762g();
                    if (m27762g.m27751D()) {
                        c4390c.mo8026q0(m27762g.m27744y());
                        return;
                    } else if (m27762g.m27753B()) {
                        c4390c.mo8023v0(m27762g.m27747u());
                        return;
                    } else {
                        c4390c.mo8025t0(m27762g.mo27748l());
                        return;
                    }
                } else if (abstractC4376l.m27761o()) {
                    c4390c.mo8030e();
                    Iterator<AbstractC4376l> it = abstractC4376l.m27764b().iterator();
                    while (it.hasNext()) {
                        mo27781f(c4390c, it.next());
                    }
                    c4390c.mo8024v();
                    return;
                } else if (abstractC4376l.m27759q()) {
                    c4390c.mo8029h();
                    for (Map.Entry<String, AbstractC4376l> entry : abstractC4376l.m27763f().m27756v()) {
                        c4390c.mo8032L(entry.getKey());
                        mo27781f(c4390c, entry.getValue());
                    }
                    c4390c.mo8022y();
                    return;
                } else {
                    throw new IllegalArgumentException("Couldn't write " + abstractC4376l.getClass());
                }
            }
            c4390c.mo8031P();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$v */
    /* loaded from: classes2.dex */
    class C10467v extends AbstractC4385s<BitSet> {
        C10467v() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
            if (r8.mo8045X() != 0) goto L15;
         */
        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet mo27782e(com.google.gson.stream.C4387a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo8044a()
                com.google.gson.stream.b r1 = r8.mo8038o0()
                r2 = 0
                r3 = r2
            Le:
                com.google.gson.stream.b r4 = com.google.gson.stream.EnumC4389b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = p368ta.C10432n.C10439c0.f27166a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.mo8039j0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = r2
                goto L69
            L30:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.mo8047R()
                goto L69
            L63:
                int r1 = r8.mo8045X()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.b r1 = r8.mo8038o0()
                goto Le
            L75:
                r8.mo8037v()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p368ta.C10432n.C10467v.mo27782e(com.google.gson.stream.a):java.util.BitSet");
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, BitSet bitSet) throws IOException {
            c4390c.mo8030e();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                c4390c.mo8028l0(bitSet.get(i) ? 1L : 0L);
            }
            c4390c.mo8024v();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$w */
    /* loaded from: classes2.dex */
    class C10468w implements InterfaceC4391t {
        C10468w() {
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            Class m4629c = c11605a.m4629c();
            if (!Enum.class.isAssignableFrom(m4629c) || m4629c == Enum.class) {
                return null;
            }
            if (!m4629c.isEnum()) {
                m4629c = (Class<? super Object>) m4629c.getSuperclass();
            }
            return new C10455k0(m4629c);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$x */
    /* loaded from: classes2.dex */
    class C10469x implements InterfaceC4391t {

        /* renamed from: w */
        final /* synthetic */ C11605a f27170w;

        /* renamed from: x */
        final /* synthetic */ AbstractC4385s f27171x;

        C10469x(C11605a c11605a, AbstractC4385s abstractC4385s) {
            this.f27170w = c11605a;
            this.f27171x = abstractC4385s;
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            if (c11605a.equals(this.f27170w)) {
                return this.f27171x;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$y */
    /* loaded from: classes2.dex */
    public class C10470y implements InterfaceC4391t {

        /* renamed from: w */
        final /* synthetic */ Class f27172w;

        /* renamed from: x */
        final /* synthetic */ AbstractC4385s f27173x;

        C10470y(Class cls, AbstractC4385s abstractC4385s) {
            this.f27172w = cls;
            this.f27173x = abstractC4385s;
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            if (c11605a.m4629c() == this.f27172w) {
                return this.f27173x;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27172w.getName() + ",adapter=" + this.f27173x + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* renamed from: ta.n$z */
    /* loaded from: classes2.dex */
    public class C10471z implements InterfaceC4391t {

        /* renamed from: w */
        final /* synthetic */ Class f27174w;

        /* renamed from: x */
        final /* synthetic */ Class f27175x;

        /* renamed from: y */
        final /* synthetic */ AbstractC4385s f27176y;

        C10471z(Class cls, Class cls2, AbstractC4385s abstractC4385s) {
            this.f27174w = cls;
            this.f27175x = cls2;
            this.f27176y = abstractC4385s;
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            Class<? super T> m4629c = c11605a.m4629c();
            if (m4629c == this.f27174w || m4629c == this.f27175x) {
                return this.f27176y;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27175x.getName() + "+" + this.f27174w.getName() + ",adapter=" + this.f27176y + "]";
        }
    }

    static {
        AbstractC4385s<Class> m27742a = new C10454k().m27742a();
        f27133a = m27742a;
        f27134b = m8002a(Class.class, m27742a);
        AbstractC4385s<BitSet> m27742a2 = new C10467v().m27742a();
        f27135c = m27742a2;
        f27136d = m8002a(BitSet.class, m27742a2);
        C10441d0 c10441d0 = new C10441d0();
        f27137e = c10441d0;
        f27138f = new C10443e0();
        f27139g = m8001b(Boolean.TYPE, Boolean.class, c10441d0);
        C10445f0 c10445f0 = new C10445f0();
        f27140h = c10445f0;
        f27141i = m8001b(Byte.TYPE, Byte.class, c10445f0);
        C10447g0 c10447g0 = new C10447g0();
        f27142j = c10447g0;
        f27143k = m8001b(Short.TYPE, Short.class, c10447g0);
        C10449h0 c10449h0 = new C10449h0();
        f27144l = c10449h0;
        f27145m = m8001b(Integer.TYPE, Integer.class, c10449h0);
        AbstractC4385s<AtomicInteger> m27742a3 = new C10451i0().m27742a();
        f27146n = m27742a3;
        f27147o = m8002a(AtomicInteger.class, m27742a3);
        AbstractC4385s<AtomicBoolean> m27742a4 = new C10453j0().m27742a();
        f27148p = m27742a4;
        f27149q = m8002a(AtomicBoolean.class, m27742a4);
        AbstractC4385s<AtomicIntegerArray> m27742a5 = new C10433a().m27742a();
        f27150r = m27742a5;
        f27151s = m8002a(AtomicIntegerArray.class, m27742a5);
        f27152t = new C10435b();
        f27153u = new C10438c();
        f27154v = new C10440d();
        C10442e c10442e = new C10442e();
        f27155w = c10442e;
        f27156x = m8002a(Number.class, c10442e);
        C10444f c10444f = new C10444f();
        f27157y = c10444f;
        f27158z = m8001b(Character.TYPE, Character.class, c10444f);
        C10446g c10446g = new C10446g();
        f27107A = c10446g;
        f27108B = new C10448h();
        f27109C = new C10450i();
        f27110D = m8002a(String.class, c10446g);
        C10452j c10452j = new C10452j();
        f27111E = c10452j;
        f27112F = m8002a(StringBuilder.class, c10452j);
        C10456l c10456l = new C10456l();
        f27113G = c10456l;
        f27114H = m8002a(StringBuffer.class, c10456l);
        C10457m c10457m = new C10457m();
        f27115I = c10457m;
        f27116J = m8002a(URL.class, c10457m);
        C10458n c10458n = new C10458n();
        f27117K = c10458n;
        f27118L = m8002a(URI.class, c10458n);
        C10459o c10459o = new C10459o();
        f27119M = c10459o;
        f27120N = m7998e(InetAddress.class, c10459o);
        C10460p c10460p = new C10460p();
        f27121O = c10460p;
        f27122P = m8002a(UUID.class, c10460p);
        AbstractC4385s<Currency> m27742a6 = new C10461q().m27742a();
        f27123Q = m27742a6;
        f27124R = m8002a(Currency.class, m27742a6);
        f27125S = new C10462r();
        C10464s c10464s = new C10464s();
        f27126T = c10464s;
        f27127U = m7999d(Calendar.class, GregorianCalendar.class, c10464s);
        C10465t c10465t = new C10465t();
        f27128V = c10465t;
        f27129W = m8002a(Locale.class, c10465t);
        C10466u c10466u = new C10466u();
        f27130X = c10466u;
        f27131Y = m7998e(AbstractC4376l.class, c10466u);
        f27132Z = new C10468w();
    }

    /* renamed from: a */
    public static <TT> InterfaceC4391t m8002a(Class<TT> cls, AbstractC4385s<TT> abstractC4385s) {
        return new C10470y(cls, abstractC4385s);
    }

    /* renamed from: b */
    public static <TT> InterfaceC4391t m8001b(Class<TT> cls, Class<TT> cls2, AbstractC4385s<? super TT> abstractC4385s) {
        return new C10471z(cls, cls2, abstractC4385s);
    }

    /* renamed from: c */
    public static <TT> InterfaceC4391t m8000c(C11605a<TT> c11605a, AbstractC4385s<TT> abstractC4385s) {
        return new C10469x(c11605a, abstractC4385s);
    }

    /* renamed from: d */
    public static <TT> InterfaceC4391t m7999d(Class<TT> cls, Class<? extends TT> cls2, AbstractC4385s<? super TT> abstractC4385s) {
        return new C10434a0(cls, cls2, abstractC4385s);
    }

    /* renamed from: e */
    public static <T1> InterfaceC4391t m7998e(Class<T1> cls, AbstractC4385s<T1> abstractC4385s) {
        return new C10436b0(cls, abstractC4385s);
    }
}
