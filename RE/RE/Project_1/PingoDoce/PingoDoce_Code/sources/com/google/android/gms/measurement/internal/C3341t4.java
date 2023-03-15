package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.t4 */
/* loaded from: classes.dex */
public final class C3341t4 {

    /* renamed from: A */
    private long f8980A;

    /* renamed from: B */
    private String f8981B;

    /* renamed from: C */
    private boolean f8982C;

    /* renamed from: D */
    private long f8983D;

    /* renamed from: E */
    private long f8984E;

    /* renamed from: a */
    private final C3242k4 f8985a;

    /* renamed from: b */
    private final String f8986b;

    /* renamed from: c */
    private String f8987c;

    /* renamed from: d */
    private String f8988d;

    /* renamed from: e */
    private String f8989e;

    /* renamed from: f */
    private String f8990f;

    /* renamed from: g */
    private long f8991g;

    /* renamed from: h */
    private long f8992h;

    /* renamed from: i */
    private long f8993i;

    /* renamed from: j */
    private String f8994j;

    /* renamed from: k */
    private long f8995k;

    /* renamed from: l */
    private String f8996l;

    /* renamed from: m */
    private long f8997m;

    /* renamed from: n */
    private long f8998n;

    /* renamed from: o */
    private boolean f8999o;

    /* renamed from: p */
    private long f9000p;

    /* renamed from: q */
    private boolean f9001q;

    /* renamed from: r */
    private String f9002r;

    /* renamed from: s */
    private Boolean f9003s;

    /* renamed from: t */
    private long f9004t;

    /* renamed from: u */
    private List f9005u;

    /* renamed from: v */
    private long f9006v;

    /* renamed from: w */
    private long f9007w;

    /* renamed from: x */
    private long f9008x;

    /* renamed from: y */
    private long f9009y;

    /* renamed from: z */
    private long f9010z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3341t4(C3242k4 c3242k4, String str) {
        C2597i.m33076j(c3242k4);
        C2597i.m33080f(str);
        this.f8985a = c3242k4;
        this.f8986b = str;
        c3242k4.mo31118b().mo30825h();
    }

    /* renamed from: A */
    public final long m30997A() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9000p;
    }

    /* renamed from: B */
    public final void m30996B(long j) {
        C2597i.m33085a(j >= 0);
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8991g != j;
        this.f8991g = j;
    }

    /* renamed from: C */
    public final void m30995C(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8992h != j;
        this.f8992h = j;
    }

    /* renamed from: D */
    public final void m30994D(boolean z) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8999o != z;
        this.f8999o = z;
    }

    /* renamed from: E */
    public final void m30993E(Boolean bool) {
        boolean equals;
        this.f8985a.mo31118b().mo30825h();
        boolean z = this.f8982C;
        Boolean bool2 = this.f9003s;
        int i = C3203g9.f8477i;
        if (bool2 == null && bool == null) {
            equals = true;
        } else {
            equals = bool2 == null ? false : bool2.equals(bool);
        }
        this.f8982C = z | (!equals);
        this.f9003s = bool;
    }

    /* renamed from: F */
    public final void m30992F(String str) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= !C3203g9.m31298Z(this.f8989e, str);
        this.f8989e = str;
    }

    /* renamed from: G */
    public final void m30991G(List list) {
        this.f8985a.mo31118b().mo30825h();
        List list2 = this.f9005u;
        int i = C3203g9.f8477i;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.f8982C = true;
        this.f9005u = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: H */
    public final boolean m30990H() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9001q;
    }

    /* renamed from: I */
    public final boolean m30989I() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8999o;
    }

    /* renamed from: J */
    public final boolean m30988J() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8982C;
    }

    /* renamed from: K */
    public final long m30987K() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8995k;
    }

    /* renamed from: L */
    public final long m30986L() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8983D;
    }

    /* renamed from: M */
    public final long m30985M() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9009y;
    }

    /* renamed from: N */
    public final long m30984N() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9010z;
    }

    /* renamed from: O */
    public final long m30983O() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9008x;
    }

    /* renamed from: P */
    public final long m30982P() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9007w;
    }

    /* renamed from: Q */
    public final long m30981Q() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8980A;
    }

    /* renamed from: R */
    public final long m30980R() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9006v;
    }

    /* renamed from: S */
    public final long m30979S() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8998n;
    }

    /* renamed from: T */
    public final long m30978T() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9004t;
    }

    /* renamed from: U */
    public final long m30977U() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8984E;
    }

    /* renamed from: V */
    public final long m30976V() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8997m;
    }

    /* renamed from: W */
    public final long m30975W() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8993i;
    }

    /* renamed from: X */
    public final long m30974X() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8991g;
    }

    /* renamed from: Y */
    public final long m30973Y() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8992h;
    }

    /* renamed from: Z */
    public final Boolean m30972Z() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9003s;
    }

    /* renamed from: a */
    public final String m30971a() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8989e;
    }

    /* renamed from: a0 */
    public final String m30970a0() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9002r;
    }

    /* renamed from: b */
    public final List m30969b() {
        this.f8985a.mo31118b().mo30825h();
        return this.f9005u;
    }

    /* renamed from: b0 */
    public final String m30968b0() {
        this.f8985a.mo31118b().mo30825h();
        String str = this.f8981B;
        m30938y(null);
        return str;
    }

    /* renamed from: c */
    public final void m30967c() {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C = false;
    }

    /* renamed from: c0 */
    public final String m30966c0() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8986b;
    }

    /* renamed from: d */
    public final void m30965d() {
        this.f8985a.mo31118b().mo30825h();
        long j = this.f8991g + 1;
        if (j > 2147483647L) {
            this.f8985a.mo31116d().m31327w().m31397b("Bundle index overflow. appId", C3197g3.m31324z(this.f8986b));
            j = 0;
        }
        this.f8982C = true;
        this.f8991g = j;
    }

    /* renamed from: d0 */
    public final String m30964d0() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8987c;
    }

    /* renamed from: e */
    public final void m30963e(String str) {
        this.f8985a.mo31118b().mo30825h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8982C |= true ^ C3203g9.m31298Z(this.f9002r, str);
        this.f9002r = str;
    }

    /* renamed from: e0 */
    public final String m30962e0() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8996l;
    }

    /* renamed from: f */
    public final void m30961f(boolean z) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f9001q != z;
        this.f9001q = z;
    }

    /* renamed from: f0 */
    public final String m30960f0() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8994j;
    }

    /* renamed from: g */
    public final void m30959g(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f9000p != j;
        this.f9000p = j;
    }

    /* renamed from: g0 */
    public final String m30958g0() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8990f;
    }

    /* renamed from: h */
    public final void m30957h(String str) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= !C3203g9.m31298Z(this.f8987c, str);
        this.f8987c = str;
    }

    /* renamed from: h0 */
    public final String m30956h0() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8988d;
    }

    /* renamed from: i */
    public final void m30955i(String str) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= !C3203g9.m31298Z(this.f8996l, str);
        this.f8996l = str;
    }

    /* renamed from: i0 */
    public final String m30954i0() {
        this.f8985a.mo31118b().mo30825h();
        return this.f8981B;
    }

    /* renamed from: j */
    public final void m30953j(String str) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= !C3203g9.m31298Z(this.f8994j, str);
        this.f8994j = str;
    }

    /* renamed from: k */
    public final void m30952k(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8995k != j;
        this.f8995k = j;
    }

    /* renamed from: l */
    public final void m30951l(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8983D != j;
        this.f8983D = j;
    }

    /* renamed from: m */
    public final void m30950m(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f9009y != j;
        this.f9009y = j;
    }

    /* renamed from: n */
    public final void m30949n(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f9010z != j;
        this.f9010z = j;
    }

    /* renamed from: o */
    public final void m30948o(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f9008x != j;
        this.f9008x = j;
    }

    /* renamed from: p */
    public final void m30947p(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f9007w != j;
        this.f9007w = j;
    }

    /* renamed from: q */
    public final void m30946q(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8980A != j;
        this.f8980A = j;
    }

    /* renamed from: r */
    public final void m30945r(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f9006v != j;
        this.f9006v = j;
    }

    /* renamed from: s */
    public final void m30944s(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8998n != j;
        this.f8998n = j;
    }

    /* renamed from: t */
    public final void m30943t(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f9004t != j;
        this.f9004t = j;
    }

    /* renamed from: u */
    public final void m30942u(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8984E != j;
        this.f8984E = j;
    }

    /* renamed from: v */
    public final void m30941v(String str) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= !C3203g9.m31298Z(this.f8990f, str);
        this.f8990f = str;
    }

    /* renamed from: w */
    public final void m30940w(String str) {
        this.f8985a.mo31118b().mo30825h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8982C |= true ^ C3203g9.m31298Z(this.f8988d, str);
        this.f8988d = str;
    }

    /* renamed from: x */
    public final void m30939x(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8997m != j;
        this.f8997m = j;
    }

    /* renamed from: y */
    public final void m30938y(String str) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= !C3203g9.m31298Z(this.f8981B, str);
        this.f8981B = str;
    }

    /* renamed from: z */
    public final void m30937z(long j) {
        this.f8985a.mo31118b().mo30825h();
        this.f8982C |= this.f8993i != j;
        this.f8993i = j;
    }
}
