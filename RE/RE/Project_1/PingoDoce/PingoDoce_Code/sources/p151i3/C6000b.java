package p151i3;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p356sf.C10200t;
import p356sf.FileSystem;
import p356sf.ForwardingFileSystem;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10187e;
import p356sf.InterfaceC10189f0;
import p356sf.Path;
import p396v3.C11093e;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.Exceptions;
import sd.C10156i;
import sd.C10171u;
import sd.StringsJVM;
import td.AbstractC10505e0;
import td.C10531j0;
import td.C10549n2;
import td.InterfaceC10524i0;

/* renamed from: i3.b */
/* loaded from: classes.dex */
public final class C6000b implements Closeable, Flushable {

    /* renamed from: O */
    private static final C10156i f16556O;

    /* renamed from: A */
    private final Path f16557A;

    /* renamed from: B */
    private final Path f16558B;

    /* renamed from: C */
    private final Path f16559C;

    /* renamed from: D */
    private final LinkedHashMap f16560D;

    /* renamed from: E */
    private final InterfaceC10524i0 f16561E;

    /* renamed from: F */
    private long f16562F;

    /* renamed from: G */
    private int f16563G;

    /* renamed from: H */
    private InterfaceC10186d f16564H;

    /* renamed from: I */
    private boolean f16565I;

    /* renamed from: J */
    private boolean f16566J;

    /* renamed from: K */
    private boolean f16567K;

    /* renamed from: L */
    private boolean f16568L;

    /* renamed from: M */
    private boolean f16569M;

    /* renamed from: N */
    private final C6005e f16570N;

    /* renamed from: w */
    private final Path f16571w;

    /* renamed from: x */
    private final long f16572x;

    /* renamed from: y */
    private final int f16573y;

    /* renamed from: z */
    private final int f16574z;

    /* compiled from: DiskLruCache.kt */
    /* renamed from: i3.b$a */
    /* loaded from: classes.dex */
    public static final class C6001a {
        private C6001a() {
        }

        public /* synthetic */ C6001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* renamed from: i3.b$b */
    /* loaded from: classes.dex */
    public final class C6002b {

        /* renamed from: a */
        private final C6003c f16575a;

        /* renamed from: b */
        private boolean f16576b;

        /* renamed from: c */
        private final boolean[] f16577c;

        public C6002b(C6003c c6003c) {
            this.f16575a = c6003c;
            this.f16577c = new boolean[C6000b.m22412v(C6000b.this)];
        }

        /* renamed from: d */
        private final void m22405d(boolean z) {
            C6000b c6000b = C6000b.this;
            synchronized (c6000b) {
                if (!this.f16576b) {
                    if (Intrinsics.equals(this.f16575a.m22399b(), this)) {
                        C6000b.m22427a(c6000b, this, z);
                    }
                    this.f16576b = true;
                    C13195u c13195u = C13195u.f34156a;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
        }

        /* renamed from: a */
        public final void m22408a() {
            m22405d(false);
        }

        /* renamed from: b */
        public final void m22407b() {
            m22405d(true);
        }

        /* renamed from: c */
        public final C6004d m22406c() {
            C6004d m22423d0;
            C6000b c6000b = C6000b.this;
            synchronized (c6000b) {
                m22407b();
                m22423d0 = c6000b.m22423d0(this.f16575a.m22397d());
            }
            return m22423d0;
        }

        /* renamed from: e */
        public final void m22404e() {
            if (Intrinsics.equals(this.f16575a.m22399b(), this)) {
                this.f16575a.m22388m(true);
            }
        }

        /* renamed from: f */
        public final Path m22403f(int i) {
            Path path;
            C6000b c6000b = C6000b.this;
            synchronized (c6000b) {
                if (!this.f16576b) {
                    this.f16577c[i] = true;
                    Object obj = this.f16575a.m22398c().get(i);
                    C11093e.m6163a(C6000b.m22419h(c6000b), (Path) obj);
                    path = (Path) obj;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
            return path;
        }

        /* renamed from: g */
        public final C6003c m22402g() {
            return this.f16575a;
        }

        /* renamed from: h */
        public final boolean[] m22401h() {
            return this.f16577c;
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* renamed from: i3.b$c */
    /* loaded from: classes.dex */
    public final class C6003c {

        /* renamed from: a */
        private final String f16579a;

        /* renamed from: b */
        private final long[] f16580b;

        /* renamed from: c */
        private final ArrayList f16581c;

        /* renamed from: d */
        private final ArrayList f16582d;

        /* renamed from: e */
        private boolean f16583e;

        /* renamed from: f */
        private boolean f16584f;

        /* renamed from: g */
        private C6002b f16585g;

        /* renamed from: h */
        private int f16586h;

        public C6003c(String str) {
            this.f16579a = str;
            this.f16580b = new long[C6000b.m22412v(C6000b.this)];
            this.f16581c = new ArrayList(C6000b.m22412v(C6000b.this));
            this.f16582d = new ArrayList(C6000b.m22412v(C6000b.this));
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int m22412v = C6000b.m22412v(C6000b.this);
            for (int i = 0; i < m22412v; i++) {
                sb2.append(i);
                this.f16581c.add(C6000b.m22422e(C6000b.this).m8522k(sb2.toString()));
                sb2.append(".tmp");
                this.f16582d.add(C6000b.m22422e(C6000b.this).m8522k(sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* renamed from: a */
        public final ArrayList m22400a() {
            return this.f16581c;
        }

        /* renamed from: b */
        public final C6002b m22399b() {
            return this.f16585g;
        }

        /* renamed from: c */
        public final ArrayList m22398c() {
            return this.f16582d;
        }

        /* renamed from: d */
        public final String m22397d() {
            return this.f16579a;
        }

        /* renamed from: e */
        public final long[] m22396e() {
            return this.f16580b;
        }

        /* renamed from: f */
        public final int m22395f() {
            return this.f16586h;
        }

        /* renamed from: g */
        public final boolean m22394g() {
            return this.f16583e;
        }

        /* renamed from: h */
        public final boolean m22393h() {
            return this.f16584f;
        }

        /* renamed from: i */
        public final void m22392i(C6002b c6002b) {
            this.f16585g = c6002b;
        }

        /* renamed from: j */
        public final void m22391j(List list) {
            if (list.size() == C6000b.m22412v(C6000b.this)) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.f16580b[i] = Long.parseLong((String) list.get(i));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            }
            throw new IOException("unexpected journal line: " + list);
        }

        /* renamed from: k */
        public final void m22390k(int i) {
            this.f16586h = i;
        }

        /* renamed from: l */
        public final void m22389l(boolean z) {
            this.f16583e = z;
        }

        /* renamed from: m */
        public final void m22388m(boolean z) {
            this.f16584f = z;
        }

        /* renamed from: n */
        public final C6004d m22387n() {
            if (this.f16583e && this.f16585g == null && !this.f16584f) {
                ArrayList arrayList = this.f16581c;
                C6000b c6000b = C6000b.this;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (!C6000b.m22419h(c6000b).m8660j((Path) arrayList.get(i))) {
                        try {
                            C6000b.m22437E(c6000b, this);
                        } catch (IOException unused) {
                        }
                        return null;
                    }
                }
                this.f16586h++;
                return new C6004d(this);
            }
            return null;
        }

        /* renamed from: o */
        public final void m22386o(InterfaceC10186d interfaceC10186d) {
            for (long j : this.f16580b) {
                interfaceC10186d.mo8780S(32).mo8773w0(j);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* renamed from: i3.b$d */
    /* loaded from: classes.dex */
    public final class C6004d implements Closeable {

        /* renamed from: w */
        private final C6003c f16588w;

        /* renamed from: x */
        private boolean f16589x;

        public C6004d(C6003c c6003c) {
            this.f16588w = c6003c;
        }

        /* renamed from: a */
        public final C6002b m22385a() {
            C6002b m22425b0;
            C6000b c6000b = C6000b.this;
            synchronized (c6000b) {
                close();
                m22425b0 = c6000b.m22425b0(this.f16588w.m22397d());
            }
            return m22425b0;
        }

        /* renamed from: c */
        public final Path m22384c(int i) {
            if (!this.f16589x) {
                return (Path) this.f16588w.m22400a().get(i);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        public void close() {
            if (this.f16589x) {
                return;
            }
            this.f16589x = true;
            C6000b c6000b = C6000b.this;
            synchronized (c6000b) {
                C6003c c6003c = this.f16588w;
                c6003c.m22390k(c6003c.m22395f() - 1);
                if (this.f16588w.m22395f() == 0 && this.f16588w.m22393h()) {
                    C6000b.m22437E(c6000b, this.f16588w);
                }
                C13195u c13195u = C13195u.f34156a;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* renamed from: i3.b$e */
    /* loaded from: classes.dex */
    public static final class C6005e extends ForwardingFileSystem {
        C6005e(FileSystem fileSystem) {
            super(fileSystem);
        }

        /* renamed from: p */
        public InterfaceC10189f0 m22383p(Path path, boolean z) {
            Path m8524i = path.m8524i();
            if (m8524i != null) {
                m8666d(m8524i);
            }
            return super.m8634p(path, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.kt */
    @InterfaceC6759f(m20197c = "coil.disk.DiskLruCache$launchCleanup$1", m20196f = "DiskLruCache.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: i3.b$f */
    /* loaded from: classes.dex */
    public static final class C6006f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f16591x;

        C6006f(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C6006f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C6006f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f16591x == 0) {
                C13186n.m1453b(obj);
                C6000b c6000b = C6000b.this;
                synchronized (c6000b) {
                    if (C6000b.m22414t(c6000b) && !C6000b.m22424c(c6000b)) {
                        try {
                            C6000b.m22431P(c6000b);
                        } catch (IOException unused) {
                            C6000b.m22432M(c6000b, true);
                        }
                        try {
                            if (C6000b.m22409y(c6000b)) {
                                C6000b.m22430R(c6000b);
                            }
                        } catch (IOException unused2) {
                            C6000b.m22433L(c6000b, true);
                            C6000b.m22434H(c6000b, C10200t.m8566b(C10200t.m8567a()));
                        }
                        return C13195u.f34156a;
                    }
                    return C13195u.f34156a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.kt */
    /* renamed from: i3.b$g */
    /* loaded from: classes.dex */
    public static final class C6007g extends AbstractC6438m implements InterfaceC6108l {
        C6007g() {
            super(1);
        }

        /* renamed from: a */
        public final void m22381a(IOException iOException) {
            C6000b.m22435F(C6000b.this, true);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22381a((IOException) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C6001a(null);
        f16556O = new C10156i("[a-z0-9_-]{1,120}");
    }

    public C6000b(FileSystem fileSystem, Path path, AbstractC10505e0 abstractC10505e0, long j, int i, int i2) {
        this.f16571w = path;
        this.f16572x = j;
        this.f16573y = i;
        this.f16574z = i2;
        if (!(j > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i2 > 0) {
            this.f16557A = path.m8522k("journal");
            this.f16558B = path.m8522k("journal.tmp");
            this.f16559C = path.m8522k("journal.bkp");
            this.f16560D = new LinkedHashMap(0, 0.75f, true);
            this.f16561E = C10531j0.m7771a(C10549n2.m7695b(null, 1, null).mo4545f0(abstractC10505e0.mo7626G0(1)));
            this.f16570N = new C6005e(fileSystem);
            return;
        }
        throw new IllegalArgumentException("valueCount <= 0".toString());
    }

    /* renamed from: A0 */
    private final void m22439A0() {
        while (this.f16562F > this.f16572x) {
            if (!m22410x0()) {
                return;
            }
        }
        this.f16568L = false;
    }

    /* renamed from: D0 */
    private final void m22438D0(String str) {
        if (f16556O.m9021d(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* renamed from: E */
    public static final /* synthetic */ boolean m22437E(C6000b c6000b, C6003c c6003c) {
        return c6000b.m22411v0(c6003c);
    }

    /* renamed from: E0 */
    private final synchronized void m22436E0() {
        C13195u c13195u;
        InterfaceC10186d interfaceC10186d = this.f16564H;
        if (interfaceC10186d != null) {
            interfaceC10186d.close();
        }
        InterfaceC10186d m8566b = C10200t.m8566b(this.f16570N.m8654p(this.f16558B, false));
        Throwable th2 = null;
        try {
            m8566b.mo8774u0("libcore.io.DiskLruCache").mo8780S(10);
            m8566b.mo8774u0("1").mo8780S(10);
            m8566b.mo8773w0(this.f16573y).mo8780S(10);
            m8566b.mo8773w0(this.f16574z).mo8780S(10);
            m8566b.mo8780S(10);
            for (C6003c c6003c : this.f16560D.values()) {
                if (c6003c.m22399b() != null) {
                    m8566b.mo8774u0("DIRTY");
                    m8566b.mo8780S(32);
                    m8566b.mo8774u0(c6003c.m22397d());
                    m8566b.mo8780S(10);
                } else {
                    m8566b.mo8774u0("CLEAN");
                    m8566b.mo8780S(32);
                    m8566b.mo8774u0(c6003c.m22397d());
                    c6003c.m22386o(m8566b);
                    m8566b.mo8780S(10);
                }
            }
            c13195u = C13195u.f34156a;
        } catch (Throwable th3) {
            c13195u = null;
            th2 = th3;
        }
        if (m8566b != null) {
            m8566b.close();
        }
        if (th2 == null) {
            Intrinsics.ifNullDoSomething(c13195u);
            if (this.f16570N.m8660j(this.f16557A)) {
                this.f16570N.m8640c(this.f16557A, this.f16559C);
                this.f16570N.m8640c(this.f16558B, this.f16557A);
                this.f16570N.m8662h(this.f16559C);
            } else {
                this.f16570N.m8640c(this.f16558B, this.f16557A);
            }
            this.f16564H = m22417l0();
            this.f16563G = 0;
            this.f16565I = false;
            this.f16569M = false;
        } else {
            throw th2;
        }
    }

    /* renamed from: F */
    public static final /* synthetic */ void m22435F(C6000b c6000b, boolean z) {
        c6000b.f16565I = z;
    }

    /* renamed from: H */
    public static final /* synthetic */ void m22434H(C6000b c6000b, InterfaceC10186d interfaceC10186d) {
        c6000b.f16564H = interfaceC10186d;
    }

    /* renamed from: L */
    public static final /* synthetic */ void m22433L(C6000b c6000b, boolean z) {
        c6000b.f16569M = z;
    }

    /* renamed from: M */
    public static final /* synthetic */ void m22432M(C6000b c6000b, boolean z) {
        c6000b.f16568L = z;
    }

    /* renamed from: P */
    public static final /* synthetic */ void m22431P(C6000b c6000b) {
        c6000b.m22439A0();
    }

    /* renamed from: R */
    public static final /* synthetic */ void m22430R(C6000b c6000b) {
        c6000b.m22436E0();
    }

    /* renamed from: W */
    private final void m22429W() {
        if (!(!this.f16567K)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* renamed from: X */
    private final synchronized void m22428X(C6002b c6002b, boolean z) {
        C6003c m22402g = c6002b.m22402g();
        if (Intrinsics.equals(m22402g.m22399b(), c6002b)) {
            int i = 0;
            if (z && !m22402g.m22393h()) {
                int i2 = this.f16574z;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c6002b.m22401h()[i3] && !this.f16570N.m8660j((Path) m22402g.m22398c().get(i3))) {
                        c6002b.m22408a();
                        return;
                    }
                }
                int i4 = this.f16574z;
                while (i < i4) {
                    Path path = (Path) m22402g.m22398c().get(i);
                    Path path2 = (Path) m22402g.m22400a().get(i);
                    if (this.f16570N.m8660j(path)) {
                        this.f16570N.m8640c(path, path2);
                    } else {
                        C11093e.m6163a(this.f16570N, (Path) m22402g.m22400a().get(i));
                    }
                    long j = m22402g.m22396e()[i];
                    Long m8673d = this.f16570N.m8658l(path2).m8673d();
                    long longValue = m8673d != null ? m8673d.longValue() : 0L;
                    m22402g.m22396e()[i] = longValue;
                    this.f16562F = (this.f16562F - j) + longValue;
                    i++;
                }
            } else {
                int i5 = this.f16574z;
                while (i < i5) {
                    this.f16570N.m8662h((Path) m22402g.m22398c().get(i));
                    i++;
                }
            }
            m22402g.m22392i(null);
            if (m22402g.m22393h()) {
                m22411v0(m22402g);
                return;
            }
            this.f16563G++;
            InterfaceC10186d interfaceC10186d = this.f16564H;
            Intrinsics.ifNullDoSomething(interfaceC10186d);
            if (!z && !m22402g.m22394g()) {
                this.f16560D.remove(m22402g.m22397d());
                interfaceC10186d.mo8774u0("REMOVE");
                interfaceC10186d.mo8780S(32);
                interfaceC10186d.mo8774u0(m22402g.m22397d());
                interfaceC10186d.mo8780S(10);
                interfaceC10186d.flush();
                if (this.f16562F <= this.f16572x || m22420f0()) {
                    m22418j0();
                }
                return;
            }
            m22402g.m22389l(true);
            interfaceC10186d.mo8774u0("CLEAN");
            interfaceC10186d.mo8780S(32);
            interfaceC10186d.mo8774u0(m22402g.m22397d());
            m22402g.m22386o(interfaceC10186d);
            interfaceC10186d.mo8780S(10);
            interfaceC10186d.flush();
            if (this.f16562F <= this.f16572x) {
            }
            m22418j0();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public static final /* synthetic */ void m22427a(C6000b c6000b, C6002b c6002b, boolean z) {
        c6000b.m22428X(c6002b, z);
    }

    /* renamed from: a0 */
    private final void m22426a0() {
        close();
        C11093e.m6162b(this.f16570N, this.f16571w);
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m22424c(C6000b c6000b) {
        return c6000b.f16567K;
    }

    /* renamed from: e */
    public static final /* synthetic */ Path m22422e(C6000b c6000b) {
        return c6000b.f16571w;
    }

    /* renamed from: f0 */
    private final boolean m22420f0() {
        return this.f16563G >= 2000;
    }

    /* renamed from: h */
    public static final /* synthetic */ C6005e m22419h(C6000b c6000b) {
        return c6000b.f16570N;
    }

    /* renamed from: j0 */
    private final void m22418j0() {
        C6772d.m20158d(this.f16561E, null, null, new C6006f(null), 3, null);
    }

    /* renamed from: l0 */
    private final InterfaceC10186d m22417l0() {
        return C10200t.m8566b(new C6008c(this.f16570N.m8669a(this.f16557A), new C6007g()));
    }

    /* renamed from: o0 */
    private final void m22416o0() {
        Iterator it = this.f16560D.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C6003c c6003c = (C6003c) it.next();
            int i = 0;
            if (c6003c.m22399b() == null) {
                int i2 = this.f16574z;
                while (i < i2) {
                    j += c6003c.m22396e()[i];
                    i++;
                }
            } else {
                c6003c.m22392i(null);
                int i3 = this.f16574z;
                while (i < i3) {
                    this.f16570N.m8662h((Path) c6003c.m22400a().get(i));
                    this.f16570N.m8662h((Path) c6003c.m22398c().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f16562F = j;
    }

    /* renamed from: q0 */
    private final void m22415q0() {
        C13195u c13195u;
        InterfaceC10187e m8565c = C10200t.m8565c(this.f16570N.m8653q(this.f16557A));
        Throwable th2 = null;
        try {
            String mo8765J = m8565c.mo8765J();
            String mo8765J2 = m8565c.mo8765J();
            String mo8765J3 = m8565c.mo8765J();
            String mo8765J4 = m8565c.mo8765J();
            String mo8765J5 = m8565c.mo8765J();
            if (Intrinsics.equals("libcore.io.DiskLruCache", mo8765J) && Intrinsics.equals("1", mo8765J2) && Intrinsics.equals(String.valueOf(this.f16573y), mo8765J3) && Intrinsics.equals(String.valueOf(this.f16574z), mo8765J4)) {
                int i = 0;
                if (!(mo8765J5.length() > 0)) {
                    while (true) {
                        try {
                            m22413t0(m8565c.mo8765J());
                            i++;
                        } catch (EOFException unused) {
                            this.f16563G = i - this.f16560D.size();
                            if (!m8565c.mo8762Q()) {
                                m22436E0();
                            } else {
                                this.f16564H = m22417l0();
                            }
                            c13195u = C13195u.f34156a;
                            if (m8565c != null) {
                                try {
                                    m8565c.close();
                                } catch (Throwable th3) {
                                    if (th2 == null) {
                                        th2 = th3;
                                    } else {
                                        Exceptions.m1470a(th2, th3);
                                    }
                                }
                            }
                            if (th2 == null) {
                                Intrinsics.ifNullDoSomething(c13195u);
                                return;
                            }
                            throw th2;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + mo8765J + ", " + mo8765J2 + ", " + mo8765J3 + ", " + mo8765J4 + ", " + mo8765J5 + ']');
        } catch (Throwable th4) {
            th2 = th4;
            c13195u = null;
        }
    }

    /* renamed from: t */
    public static final /* synthetic */ boolean m22414t(C6000b c6000b) {
        return c6000b.f16566J;
    }

    /* renamed from: t0 */
    private final void m22413t0(String str) {
        int m8906T;
        int m8906T2;
        String substring;
        boolean m8948C;
        boolean m8948C2;
        boolean m8948C3;
        List m8884p0;
        boolean m8948C4;
        m8906T = C10171u.m8906T(str, ' ', 0, false, 6, null);
        if (m8906T != -1) {
            int i = m8906T + 1;
            m8906T2 = C10171u.m8906T(str, ' ', i, false, 4, null);
            if (m8906T2 == -1) {
                substring = str.substring(i);
                Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
                if (m8906T == 6) {
                    m8948C4 = StringsJVM.m8948C(str, "REMOVE", false, 2, null);
                    if (m8948C4) {
                        this.f16560D.remove(substring);
                        return;
                    }
                }
            } else {
                substring = str.substring(i, m8906T2);
                Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            LinkedHashMap linkedHashMap = this.f16560D;
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new C6003c(substring);
                linkedHashMap.put(substring, obj);
            }
            C6003c c6003c = (C6003c) obj;
            if (m8906T2 != -1 && m8906T == 5) {
                m8948C3 = StringsJVM.m8948C(str, "CLEAN", false, 2, null);
                if (m8948C3) {
                    String substring2 = str.substring(m8906T2 + 1);
                    Intrinsics.checkIfNull(substring2, "this as java.lang.String).substring(startIndex)");
                    m8884p0 = C10171u.m8884p0(substring2, new char[]{' '}, false, 0, 6, null);
                    c6003c.m22389l(true);
                    c6003c.m22392i(null);
                    c6003c.m22391j(m8884p0);
                    return;
                }
            }
            if (m8906T2 == -1 && m8906T == 5) {
                m8948C2 = StringsJVM.m8948C(str, "DIRTY", false, 2, null);
                if (m8948C2) {
                    c6003c.m22392i(new C6002b(c6003c));
                    return;
                }
            }
            if (m8906T2 == -1 && m8906T == 4) {
                m8948C = StringsJVM.m8948C(str, "READ", false, 2, null);
                if (m8948C) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: v */
    public static final /* synthetic */ int m22412v(C6000b c6000b) {
        return c6000b.f16574z;
    }

    /* renamed from: v0 */
    private final boolean m22411v0(C6003c c6003c) {
        InterfaceC10186d interfaceC10186d;
        if (c6003c.m22395f() > 0 && (interfaceC10186d = this.f16564H) != null) {
            interfaceC10186d.mo8774u0("DIRTY");
            interfaceC10186d.mo8780S(32);
            interfaceC10186d.mo8774u0(c6003c.m22397d());
            interfaceC10186d.mo8780S(10);
            interfaceC10186d.flush();
        }
        if (c6003c.m22395f() <= 0 && c6003c.m22399b() == null) {
            int i = this.f16574z;
            for (int i2 = 0; i2 < i; i2++) {
                this.f16570N.m8662h((Path) c6003c.m22400a().get(i2));
                this.f16562F -= c6003c.m22396e()[i2];
                c6003c.m22396e()[i2] = 0;
            }
            this.f16563G++;
            InterfaceC10186d interfaceC10186d2 = this.f16564H;
            if (interfaceC10186d2 != null) {
                interfaceC10186d2.mo8774u0("REMOVE");
                interfaceC10186d2.mo8780S(32);
                interfaceC10186d2.mo8774u0(c6003c.m22397d());
                interfaceC10186d2.mo8780S(10);
            }
            this.f16560D.remove(c6003c.m22397d());
            if (m22420f0()) {
                m22418j0();
            }
            return true;
        }
        c6003c.m22388m(true);
        return true;
    }

    /* renamed from: x0 */
    private final boolean m22410x0() {
        for (C6003c c6003c : this.f16560D.values()) {
            if (!c6003c.m22393h()) {
                m22411v0(c6003c);
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public static final /* synthetic */ boolean m22409y(C6000b c6000b) {
        return c6000b.m22420f0();
    }

    /* renamed from: b0 */
    public final synchronized C6002b m22425b0(String str) {
        m22429W();
        m22438D0(str);
        m22421e0();
        C6003c c6003c = (C6003c) this.f16560D.get(str);
        if ((c6003c != null ? c6003c.m22399b() : null) != null) {
            return null;
        }
        if (c6003c == null || c6003c.m22395f() == 0) {
            if (!this.f16568L && !this.f16569M) {
                InterfaceC10186d interfaceC10186d = this.f16564H;
                Intrinsics.ifNullDoSomething(interfaceC10186d);
                interfaceC10186d.mo8774u0("DIRTY");
                interfaceC10186d.mo8780S(32);
                interfaceC10186d.mo8774u0(str);
                interfaceC10186d.mo8780S(10);
                interfaceC10186d.flush();
                if (this.f16565I) {
                    return null;
                }
                if (c6003c == null) {
                    c6003c = new C6003c(str);
                    this.f16560D.put(str, c6003c);
                }
                C6002b c6002b = new C6002b(c6003c);
                c6003c.m22392i(c6002b);
                return c6002b;
            }
            m22418j0();
            return null;
        }
        return null;
    }

    public synchronized void close() {
        if (this.f16566J && !this.f16567K) {
            Object[] array = this.f16560D.values().toArray(new C6003c[0]);
            Intrinsics.m20929f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            for (C6003c c6003c : (C6003c[]) array) {
                C6002b m22399b = c6003c.m22399b();
                if (m22399b != null) {
                    m22399b.m22404e();
                }
            }
            m22439A0();
            C10531j0.m7769c(this.f16561E, null, 1, null);
            InterfaceC10186d interfaceC10186d = this.f16564H;
            Intrinsics.ifNullDoSomething(interfaceC10186d);
            interfaceC10186d.close();
            this.f16564H = null;
            this.f16567K = true;
            return;
        }
        this.f16567K = true;
    }

    /* renamed from: d0 */
    public final synchronized C6004d m22423d0(String str) {
        C6004d m22387n;
        m22429W();
        m22438D0(str);
        m22421e0();
        C6003c c6003c = (C6003c) this.f16560D.get(str);
        if (c6003c != null && (m22387n = c6003c.m22387n()) != null) {
            this.f16563G++;
            InterfaceC10186d interfaceC10186d = this.f16564H;
            Intrinsics.ifNullDoSomething(interfaceC10186d);
            interfaceC10186d.mo8774u0("READ");
            interfaceC10186d.mo8780S(32);
            interfaceC10186d.mo8774u0(str);
            interfaceC10186d.mo8780S(10);
            if (m22420f0()) {
                m22418j0();
            }
            return m22387n;
        }
        return null;
    }

    /* renamed from: e0 */
    public final synchronized void m22421e0() {
        if (this.f16566J) {
            return;
        }
        this.f16570N.m8662h(this.f16558B);
        if (this.f16570N.m8660j(this.f16559C)) {
            if (this.f16570N.m8660j(this.f16557A)) {
                this.f16570N.m8662h(this.f16559C);
            } else {
                this.f16570N.m8640c(this.f16559C, this.f16557A);
            }
        }
        if (this.f16570N.m8660j(this.f16557A)) {
            try {
                m22415q0();
                m22416o0();
                this.f16566J = true;
                return;
            } catch (IOException unused) {
                m22426a0();
                this.f16567K = false;
            }
        }
        m22436E0();
        this.f16566J = true;
    }

    public synchronized void flush() {
        if (this.f16566J) {
            m22429W();
            m22439A0();
            InterfaceC10186d interfaceC10186d = this.f16564H;
            Intrinsics.ifNullDoSomething(interfaceC10186d);
            interfaceC10186d.flush();
        }
    }
}
