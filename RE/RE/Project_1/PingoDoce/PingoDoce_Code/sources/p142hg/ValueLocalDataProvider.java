package p142hg;

import android.content.SharedPreferences;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.p283bp.C8216e;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p398v5.SharedPrefsKtx;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* renamed from: hg.d */
/* loaded from: classes2.dex */
public abstract class ValueLocalDataProvider<T> extends AbstractC5932c {

    /* renamed from: a */
    protected SharedPreferences f16419a;

    /* renamed from: b */
    protected SharedPreferences f16420b;

    /* renamed from: c */
    private final InterfaceC13178g f16421c;

    /* renamed from: d */
    private final boolean f16422d;

    /* renamed from: e */
    private final long f16423e;

    /* renamed from: f */
    private final long f16424f;

    /* compiled from: ValueLocalDataProvider.kt */
    /* renamed from: hg.d$a */
    /* loaded from: classes2.dex */
    public static final class C5933a {
        private C5933a() {
        }

        public /* synthetic */ C5933a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ValueLocalDataProvider.kt */
    /* renamed from: hg.d$b */
    /* loaded from: classes2.dex */
    public static final class C5934b extends AbstractC6438m implements InterfaceC6097a {
        C5934b() {
            super(0);
        }

        /* renamed from: a */
        public final SharedPreferences mo42214q() {
            return ValueLocalDataProvider.this.mo23349x() ? ValueLocalDataProvider.this.m22664m() : ValueLocalDataProvider.this.m22660q();
        }
    }

    static {
        new C5933a(null);
    }

    public ValueLocalDataProvider() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C5934b());
        this.f16421c = m1464a;
        this.f16423e = 300L;
        this.f16424f = 86400L;
    }

    /* renamed from: A */
    static /* synthetic */ Object m22680A(ValueLocalDataProvider valueLocalDataProvider, Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        valueLocalDataProvider.m22675F();
        if (obj == null) {
            Object mo22690a = valueLocalDataProvider.mo22690a(interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo22690a == m34636d ? mo22690a : C13195u.f34156a;
        }
        SharedPrefsKtx.m6038i(valueLocalDataProvider.m22659r(), valueLocalDataProvider.mo23352p(), obj, valueLocalDataProvider.mo23350w(), null, 8, null);
        return C13195u.f34156a;
    }

    /* renamed from: C */
    private final void m22678C(C8216e c8216e) {
        SharedPrefsKtx.m6038i(m22659r(), m22662o(), c8216e, C8216e.class, null, 8, null);
    }

    /* renamed from: E */
    private final void m22676E(C8216e c8216e) {
        SharedPrefsKtx.m6038i(m22659r(), m22657t(), c8216e, C8216e.class, null, 8, null);
    }

    /* renamed from: F */
    private final void m22675F() {
        C8216e m16144P = C8216e.m16153G().m16144P(mo23351u());
        Intrinsics.checkIfNull(m16144P, "now().plusSeconds(timeToExpiry)");
        m22679B(m16144P);
        C8216e m16144P2 = C8216e.m16153G().m16144P(m22655v());
        Intrinsics.checkIfNull(m16144P2, "now().plusSeconds(timeToRefresh)");
        m22677D(m16144P2);
    }

    /* renamed from: k */
    static /* synthetic */ Object m22666k(ValueLocalDataProvider valueLocalDataProvider, InterfaceC1886d interfaceC1886d) {
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        valueLocalDataProvider.m22679B(c8216e);
        Intrinsics.checkIfNull(c8216e, "MIN");
        valueLocalDataProvider.m22677D(c8216e);
        valueLocalDataProvider.m22659r().edit().remove(valueLocalDataProvider.mo23352p()).apply();
        return C13195u.f34156a;
    }

    /* renamed from: l */
    static /* synthetic */ Object m22665l(ValueLocalDataProvider valueLocalDataProvider, InterfaceC1886d interfaceC1886d) {
        return C5935e.m22649a(valueLocalDataProvider.m22659r(), valueLocalDataProvider.mo23352p(), valueLocalDataProvider.mo23350w(), null);
    }

    /* renamed from: n */
    private final C8216e m22663n() {
        SharedPreferences m22659r = m22659r();
        String m22662o = m22662o();
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        return (C8216e) SharedPrefsKtx.m6044c(m22659r, m22662o, C8216e.class, c8216e, null, 8, null);
    }

    /* renamed from: o */
    private final String m22662o() {
        String mo23352p = mo23352p();
        return mo23352p + "_EXPIRY_DATE";
    }

    /* renamed from: r */
    private final SharedPreferences m22659r() {
        return (SharedPreferences) this.f16421c.getValue();
    }

    /* renamed from: s */
    private final C8216e m22658s() {
        SharedPreferences m22659r = m22659r();
        String m22657t = m22657t();
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        return (C8216e) SharedPrefsKtx.m6044c(m22659r, m22657t, C8216e.class, c8216e, null, 8, null);
    }

    /* renamed from: t */
    private final String m22657t() {
        String mo23352p = mo23352p();
        return mo23352p + "_REFRESH_DATE";
    }

    /* renamed from: y */
    static /* synthetic */ Object m22652y(ValueLocalDataProvider valueLocalDataProvider, InterfaceC1886d interfaceC1886d) {
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        valueLocalDataProvider.m22679B(c8216e);
        return C13195u.f34156a;
    }

    /* renamed from: z */
    static /* synthetic */ Object m22651z(ValueLocalDataProvider valueLocalDataProvider, InterfaceC1886d interfaceC1886d) {
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        valueLocalDataProvider.m22677D(c8216e);
        return C13195u.f34156a;
    }

    /* renamed from: B */
    public void m22679B(C8216e c8216e) {
        Intrinsics.isThisObjectNull(c8216e, "value");
        m22678C(c8216e);
    }

    /* renamed from: D */
    public void m22677D(C8216e c8216e) {
        Intrinsics.isThisObjectNull(c8216e, "value");
        m22676E(c8216e);
    }

    /* renamed from: a */
    public Object mo22690a(InterfaceC1886d interfaceC1886d) {
        return m22666k(this, interfaceC1886d);
    }

    /* renamed from: b */
    public boolean mo22689b() {
        return m22659r().contains(mo23352p());
    }

    /* renamed from: c */
    public Object mo22688c(InterfaceC1886d interfaceC1886d) {
        return m22665l(this, interfaceC1886d);
    }

    /* renamed from: d */
    public C8216e mo22687d() {
        return m22663n();
    }

    /* renamed from: e */
    public C8216e mo22686e() {
        return m22658s();
    }

    /* renamed from: g */
    public Object mo22684g(InterfaceC1886d interfaceC1886d) {
        return m22652y(this, interfaceC1886d);
    }

    /* renamed from: h */
    public Object mo22683h(InterfaceC1886d interfaceC1886d) {
        return m22651z(this, interfaceC1886d);
    }

    /* renamed from: i */
    public Object mo22682i(Object obj, InterfaceC1886d interfaceC1886d) {
        return m22680A(this, obj, interfaceC1886d);
    }

    /* renamed from: m */
    protected final SharedPreferences m22664m() {
        SharedPreferences sharedPreferences = this.f16420b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitPropException("encryptedPrefs");
        return null;
    }

    /* renamed from: p */
    public abstract String mo23352p();

    /* renamed from: q */
    protected final SharedPreferences m22660q() {
        SharedPreferences sharedPreferences = this.f16419a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitPropException("notEncryptedPrefs");
        return null;
    }

    /* renamed from: u */
    protected long mo23351u() {
        return this.f16424f;
    }

    /* renamed from: v */
    protected long m22655v() {
        return this.f16423e;
    }

    /* renamed from: w */
    protected abstract Type mo23350w();

    /* renamed from: x */
    public boolean mo23349x() {
        return this.f16422d;
    }
}
