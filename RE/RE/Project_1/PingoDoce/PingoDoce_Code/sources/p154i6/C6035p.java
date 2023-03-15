package p154i6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.AbstractC2395d;
import com.google.android.datatransport.runtime.backends.AbstractC2397e;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007a6.AbstractC0046i;
import p007a6.AbstractC0056o;
import p007a6.C0045h;
import p028b6.InterfaceC1825b;
import p028b6.InterfaceC1831g;
import p077e6.C4987a;
import p077e6.C4991c;
import p098f6.C5414a;
import p174j6.AbstractC6331k;
import p174j6.InterfaceC6311c;
import p174j6.InterfaceC6313d;
import p196k6.InterfaceC6601a;
import p216l6.InterfaceC6984a;
import p461y5.C13111b;

/* renamed from: i6.p */
/* loaded from: classes.dex */
public class C6035p {

    /* renamed from: a */
    private final Context f16662a;

    /* renamed from: b */
    private final InterfaceC1825b f16663b;

    /* renamed from: c */
    private final InterfaceC6313d f16664c;

    /* renamed from: d */
    private final InterfaceC6041v f16665d;

    /* renamed from: e */
    private final Executor f16666e;

    /* renamed from: f */
    private final InterfaceC6601a f16667f;

    /* renamed from: g */
    private final InterfaceC6984a f16668g;

    /* renamed from: h */
    private final InterfaceC6984a f16669h;

    /* renamed from: i */
    private final InterfaceC6311c f16670i;

    public C6035p(Context context, InterfaceC1825b interfaceC1825b, InterfaceC6313d interfaceC6313d, InterfaceC6041v interfaceC6041v, Executor executor, InterfaceC6601a interfaceC6601a, InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2, InterfaceC6311c interfaceC6311c) {
        this.f16662a = context;
        this.f16663b = interfaceC1825b;
        this.f16664c = interfaceC6313d;
        this.f16665d = interfaceC6041v;
        this.f16666e = executor;
        this.f16667f = interfaceC6601a;
        this.f16668g = interfaceC6984a;
        this.f16669h = interfaceC6984a2;
        this.f16670i = interfaceC6311c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m22332l(AbstractC0056o abstractC0056o) {
        return Boolean.valueOf(this.f16664c.mo21177m0(abstractC0056o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m22331m(AbstractC0056o abstractC0056o) {
        return this.f16664c.mo21232G(abstractC0056o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m22330n(Iterable iterable, AbstractC0056o abstractC0056o, long j) {
        this.f16664c.mo21171p0(iterable);
        this.f16664c.mo21178m(abstractC0056o, this.f16668g.mo19644a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m22329o(Iterable iterable) {
        this.f16664c.mo21175n(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m22328p() {
        this.f16670i.mo21193e();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m22327q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f16670i.mo21197c(((Integer) entry.getValue()).intValue(), C4991c.EnumC4993b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m22326r(AbstractC0056o abstractC0056o, long j) {
        this.f16664c.mo21178m(abstractC0056o, this.f16668g.mo19644a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m22325s(AbstractC0056o abstractC0056o, int i) {
        this.f16665d.mo22310a(abstractC0056o, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m22324t(final AbstractC0056o abstractC0056o, final int i, Runnable runnable) {
        try {
            try {
                InterfaceC6601a interfaceC6601a = this.f16667f;
                final InterfaceC6313d interfaceC6313d = this.f16664c;
                Objects.requireNonNull(interfaceC6313d);
                interfaceC6601a.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.f
                    @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC6313d.this.mo21186i());
                    }
                });
                if (!m22333k()) {
                    this.f16667f.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.j
                        @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                        public final Object execute() {
                            Object m22325s;
                            m22325s = C6035p.this.m22325s(abstractC0056o, i);
                            return m22325s;
                        }
                    });
                } else {
                    m22323u(abstractC0056o, i);
                }
            } catch (SynchronizationException unused) {
                this.f16665d.mo22310a(abstractC0056o, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC0046i m22334j(InterfaceC1831g interfaceC1831g) {
        InterfaceC6601a interfaceC6601a = this.f16667f;
        final InterfaceC6311c interfaceC6311c = this.f16670i;
        Objects.requireNonNull(interfaceC6311c);
        return interfaceC1831g.mo33711b(AbstractC0046i.m42088a().mo42068i(this.f16668g.mo19644a()).mo42066k(this.f16669h.mo19644a()).mo42067j("GDT_CLIENT_METRICS").mo42069h(new C0045h(C13111b.m1584b("proto"), ((C4987a) interfaceC6601a.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.o
            @Override // p196k6.InterfaceC6601a.InterfaceC6602a
            public final Object execute() {
                return InterfaceC6311c.this.mo21202a();
            }
        })).m25956f())).mo42073d());
    }

    /* renamed from: k */
    boolean m22333k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f16662a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: u */
    void m22323u(final AbstractC0056o abstractC0056o, int i) {
        AbstractC2397e mo33712a;
        InterfaceC1831g mo35291a = this.f16663b.mo35291a(abstractC0056o.mo42044b());
        long j = 0;
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f16667f.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.h
                @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                public final Object execute() {
                    Boolean m22332l;
                    m22332l = C6035p.this.m22332l(abstractC0056o);
                    return m22332l;
                }
            })).booleanValue()) {
                final Iterable<AbstractC6331k> iterable = (Iterable) this.f16667f.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.i
                    @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                    public final Object execute() {
                        Iterable m22331m;
                        m22331m = C6035p.this.m22331m(abstractC0056o);
                        return m22331m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (mo35291a == null) {
                    C5414a.m24382a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC0056o);
                    mo33712a = AbstractC2397e.m33690a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC6331k abstractC6331k : iterable) {
                        arrayList.add(abstractC6331k.mo21241b());
                    }
                    if (abstractC0056o.m42041e()) {
                        arrayList.add(m22334j(mo35291a));
                    }
                    mo33712a = mo35291a.mo33712a(AbstractC2395d.m33696a().mo33692b(arrayList).mo33691c(abstractC0056o.mo42043c()).mo33693a());
                }
                if (mo33712a.mo33688c() == AbstractC2397e.EnumC2398a.TRANSIENT_ERROR) {
                    this.f16667f.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.m
                        @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                        public final Object execute() {
                            Object m22330n;
                            m22330n = C6035p.this.m22330n(iterable, abstractC0056o, j2);
                            return m22330n;
                        }
                    });
                    this.f16665d.mo22309b(abstractC0056o, i + 1, true);
                    return;
                }
                this.f16667f.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.l
                    @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                    public final Object execute() {
                        Object m22329o;
                        m22329o = C6035p.this.m22329o(iterable);
                        return m22329o;
                    }
                });
                if (mo33712a.mo33688c() == AbstractC2397e.EnumC2398a.OK) {
                    j = Math.max(j2, mo33712a.mo33689b());
                    if (abstractC0056o.m42041e()) {
                        this.f16667f.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.g
                            @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                            public final Object execute() {
                                Object m22328p;
                                m22328p = C6035p.this.m22328p();
                                return m22328p;
                            }
                        });
                    }
                } else if (mo33712a.mo33688c() == AbstractC2397e.EnumC2398a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (AbstractC6331k abstractC6331k2 : iterable) {
                        String mo42079j = abstractC6331k2.mo21241b().mo42079j();
                        if (!hashMap.containsKey(mo42079j)) {
                            hashMap.put(mo42079j, 1);
                        } else {
                            hashMap.put(mo42079j, Integer.valueOf(((Integer) hashMap.get(mo42079j)).intValue() + 1));
                        }
                    }
                    this.f16667f.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.n
                        @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                        public final Object execute() {
                            Object m22327q;
                            m22327q = C6035p.this.m22327q(hashMap);
                            return m22327q;
                        }
                    });
                }
            }
            this.f16667f.mo20509h(new InterfaceC6601a.InterfaceC6602a() { // from class: i6.k
                @Override // p196k6.InterfaceC6601a.InterfaceC6602a
                public final Object execute() {
                    Object m22326r;
                    m22326r = C6035p.this.m22326r(abstractC0056o, j2);
                    return m22326r;
                }
            });
            return;
        }
    }

    /* renamed from: v */
    public void m22322v(final AbstractC0056o abstractC0056o, final int i, final Runnable runnable) {
        this.f16666e.execute(new Runnable() { // from class: i6.e
            @Override // java.lang.Runnable
            public final void run() {
                C6035p.this.m22324t(abstractC0056o, i, runnable);
            }
        });
    }
}
