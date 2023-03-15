package p092f0;

import ad.C0127b;
import androidx.compose.runtime.CompositionContext;
import bd.CoroutineContext;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.ExceptionsH;
import p070e.C4906j;
import p112g0.IdentityArrayMap;
import p112g0.IdentityArraySet;
import p126h0.C5732a;
import p126h0.InterfaceC5740f;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p260o0.AbstractC7961h;
import p260o0.C7971l;
import p260o0.ListUtils;
import p285p0.C8335c;
import p285p0.InterfaceC8333a;
import p468yc.C13195u;
import p489zc.MutableCollectionsJVM;
import p489zc._ArraysJvm;
import p489zc._Collections;

/* compiled from: Composer.kt */
/* renamed from: f0.j */
/* loaded from: classes.dex */
public final class C5184j implements InterfaceC5179i {

    /* renamed from: A */
    private AbstractC7961h f14334A;

    /* renamed from: B */
    private final C5239q1 f14335B;

    /* renamed from: C */
    private boolean f14336C;

    /* renamed from: D */
    private C5161d1 f14337D;

    /* renamed from: E */
    private final C5164e1 f14338E;

    /* renamed from: F */
    private C5173g1 f14339F;

    /* renamed from: G */
    private boolean f14340G;

    /* renamed from: H */
    private C5159d f14341H;

    /* renamed from: I */
    private final List f14342I;

    /* renamed from: J */
    private boolean f14343J;

    /* renamed from: K */
    private int f14344K;

    /* renamed from: L */
    private int f14345L;

    /* renamed from: M */
    private C5239q1 f14346M;

    /* renamed from: N */
    private int f14347N;

    /* renamed from: O */
    private boolean f14348O;

    /* renamed from: P */
    private final C5160d0 f14349P;

    /* renamed from: Q */
    private final C5239q1 f14350Q;

    /* renamed from: R */
    private int f14351R;

    /* renamed from: S */
    private int f14352S;

    /* renamed from: T */
    private int f14353T;

    /* renamed from: U */
    private int f14354U;

    /* renamed from: b */
    private final Applier f14355b;

    /* renamed from: c */
    private final CompositionContext f14356c;

    /* renamed from: d */
    private final C5164e1 f14357d;

    /* renamed from: e */
    private final Set f14358e;

    /* renamed from: f */
    private final List f14359f;

    /* renamed from: g */
    private final InterfaceC5243s f14360g;

    /* renamed from: h */
    private final C5239q1 f14361h;

    /* renamed from: i */
    private C5237q0 f14362i;

    /* renamed from: j */
    private int f14363j;

    /* renamed from: k */
    private C5160d0 f14364k;

    /* renamed from: l */
    private int f14365l;

    /* renamed from: m */
    private C5160d0 f14366m;

    /* renamed from: n */
    private int[] f14367n;

    /* renamed from: o */
    private HashMap f14368o;

    /* renamed from: p */
    private boolean f14369p;

    /* renamed from: q */
    private boolean f14370q;

    /* renamed from: r */
    private final List f14371r;

    /* renamed from: s */
    private final C5160d0 f14372s;

    /* renamed from: t */
    private InterfaceC5740f f14373t;

    /* renamed from: u */
    private final HashMap f14374u;

    /* renamed from: v */
    private boolean f14375v;

    /* renamed from: w */
    private final C5160d0 f14376w;

    /* renamed from: x */
    private boolean f14377x;

    /* renamed from: y */
    private int f14378y;

    /* renamed from: z */
    private int f14379z;

    /* compiled from: Composer.kt */
    /* renamed from: f0.j$a */
    /* loaded from: classes.dex */
    private static final class C5185a implements InterfaceC5269z0 {

        /* renamed from: w */
        private final C5186b f14380w;

        public C5185a(C5186b c5186b) {
            Intrinsics.isThisObjectNull(c5186b, "ref");
            this.f14380w = c5186b;
        }

        /* renamed from: a */
        public void mo24845a() {
        }

        /* renamed from: b */
        public void mo24844b() {
            this.f14380w.m25105m();
        }

        /* renamed from: c */
        public final C5186b m25118c() {
            return this.f14380w;
        }

        /* renamed from: e */
        public void mo24843e() {
            this.f14380w.m25105m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$b */
    /* loaded from: classes.dex */
    public final class C5186b extends CompositionContext {

        /* renamed from: a */
        private final int f14381a;

        /* renamed from: b */
        private final boolean f14382b;

        /* renamed from: c */
        private Set f14383c;

        /* renamed from: d */
        private final Set f14384d;

        /* renamed from: e */
        private final InterfaceC5220m0 f14385e;

        /* renamed from: f */
        final /* synthetic */ C5184j f14386f;

        public C5186b(C5184j c5184j, int i, boolean z) {
            InterfaceC5220m0 m24962d;
            Intrinsics.isThisObjectNull(c5184j, "this$0");
            this.f14386f = c5184j;
            this.f14381a = i;
            this.f14382b = z;
            this.f14384d = new LinkedHashSet();
            m24962d = C5232o1.m24962d(C5732a.m23211a(), null, 2, null);
            this.f14385e = m24962d;
        }

        /* renamed from: o */
        private final InterfaceC5740f m25103o() {
            return (InterfaceC5740f) this.f14385e.getValue();
        }

        /* renamed from: p */
        private final void m25102p(InterfaceC5740f interfaceC5740f) {
            this.f14385e.setValue(interfaceC5740f);
        }

        /* renamed from: a */
        public void m25117a(InterfaceC5243s interfaceC5243s, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(interfaceC5243s, "composition");
            Intrinsics.isThisObjectNull(interfaceC6112p, "content");
            C5184j.m25205S(this.f14386f).m39999a(interfaceC5243s, interfaceC6112p);
        }

        /* renamed from: b */
        public void m25116b() {
            C5184j c5184j = this.f14386f;
            C5184j.m25201U(c5184j, C5184j.m25207R(c5184j) - 1);
        }

        /* renamed from: c */
        public boolean m25115c() {
            return this.f14382b;
        }

        /* renamed from: d */
        public InterfaceC5740f m25114d() {
            return m25103o();
        }

        /* renamed from: e */
        public int m25113e() {
            return this.f14381a;
        }

        /* renamed from: f */
        public CoroutineContext m25112f() {
            return C5184j.m25205S(this.f14386f).m39994f();
        }

        /* renamed from: g */
        public void m25111g(InterfaceC5243s interfaceC5243s) {
            Intrinsics.isThisObjectNull(interfaceC5243s, "composition");
            C5184j.m25205S(this.f14386f).m39993g(this.f14386f.m25149n0());
            C5184j.m25205S(this.f14386f).m39993g(interfaceC5243s);
        }

        /* renamed from: h */
        public void m25110h(Set set) {
            Intrinsics.isThisObjectNull(set, "table");
            Set set2 = this.f14383c;
            if (set2 == null) {
                set2 = new HashSet();
                m25101q(set2);
            }
            set2.add(set);
        }

        /* renamed from: i */
        public void m25109i(InterfaceC5179i interfaceC5179i) {
            Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
            super.m39991i((C5184j) interfaceC5179i);
            this.f14384d.add(interfaceC5179i);
        }

        /* renamed from: j */
        public void m25108j() {
            C5184j c5184j = this.f14386f;
            C5184j.m25201U(c5184j, C5184j.m25207R(c5184j) + 1);
        }

        /* renamed from: k */
        public void m25107k(InterfaceC5179i interfaceC5179i) {
            Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
            Set<Set> set = this.f14383c;
            if (set != null) {
                for (Set set2 : set) {
                    set2.remove(C5184j.m25203T((C5184j) interfaceC5179i));
                }
            }
            this.f14384d.remove(interfaceC5179i);
        }

        /* renamed from: l */
        public void m25106l(InterfaceC5243s interfaceC5243s) {
            Intrinsics.isThisObjectNull(interfaceC5243s, "composition");
            C5184j.m25205S(this.f14386f).m39988l(interfaceC5243s);
        }

        /* renamed from: m */
        public final void m25105m() {
            if (!this.f14384d.isEmpty()) {
                Set<Set> set = this.f14383c;
                if (set != null) {
                    for (C5184j c5184j : m25104n()) {
                        for (Set set2 : set) {
                            set2.remove(C5184j.m25203T(c5184j));
                        }
                    }
                }
                this.f14384d.clear();
            }
        }

        /* renamed from: n */
        public final Set m25104n() {
            return this.f14384d;
        }

        /* renamed from: q */
        public final void m25101q(Set set) {
            this.f14383c = set;
        }

        /* renamed from: r */
        public final void m25100r(InterfaceC5740f interfaceC5740f) {
            Intrinsics.isThisObjectNull(interfaceC5740f, "scope");
            m25102p(interfaceC5740f);
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: f0.j$c */
    /* loaded from: classes.dex */
    static final class C5187c extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f14387w;

        /* renamed from: x */
        final /* synthetic */ Object f14388x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5187c(InterfaceC6112p interfaceC6112p, Object obj) {
            super(3);
            this.f14387w = interfaceC6112p;
            this.f14388x = obj;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25099a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25099a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "applier");
            Intrinsics.isThisObjectNull(c5173g1, "$noName_1");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            this.f14387w.mo39856d(applier.mo25549a(), this.f14388x);
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: f0.j$d */
    /* loaded from: classes.dex */
    static final class C5188d extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f14389w;

        /* renamed from: x */
        final /* synthetic */ C5159d f14390x;

        /* renamed from: y */
        final /* synthetic */ int f14391y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5188d(InterfaceC6097a interfaceC6097a, C5159d c5159d, int i) {
            super(3);
            this.f14389w = interfaceC6097a;
            this.f14390x = c5159d;
            this.f14391y = i;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25098a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25098a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "applier");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            Object mo42214q = this.f14389w.mo42214q();
            c5173g1.m25314n0(this.f14390x, mo42214q);
            applier.m25455e(this.f14391y, mo42214q);
            applier.mo25548c(mo42214q);
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: f0.j$e */
    /* loaded from: classes.dex */
    static final class C5189e extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ C5159d f14392w;

        /* renamed from: x */
        final /* synthetic */ int f14393x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5189e(C5159d c5159d, int i) {
            super(3);
            this.f14392w = c5159d;
            this.f14393x = i;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25097a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25097a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "applier");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            Object m25355M = c5173g1.m25355M(this.f14392w);
            applier.mo25545i();
            applier.m25458b(this.f14393x, m25355M);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$f */
    /* loaded from: classes.dex */
    public static final class C5190f extends AbstractC6438m implements InterfaceC6108l {
        C5190f() {
            super(1);
        }

        /* renamed from: a */
        public final void m25096a(InterfaceC5242r1 interfaceC5242r1) {
            Intrinsics.isThisObjectNull(interfaceC5242r1, "it");
            C5184j c5184j = C5184j.this;
            C5184j.m25201U(c5184j, C5184j.m25207R(c5184j) + 1);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m25096a((InterfaceC5242r1) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$g */
    /* loaded from: classes.dex */
    public static final class C5191g extends AbstractC6438m implements InterfaceC6108l {
        C5191g() {
            super(1);
        }

        /* renamed from: a */
        public final void m25095a(InterfaceC5242r1 interfaceC5242r1) {
            Intrinsics.isThisObjectNull(interfaceC5242r1, "it");
            C5184j c5184j = C5184j.this;
            C5184j.m25201U(c5184j, C5184j.m25207R(c5184j) - 1);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m25095a((InterfaceC5242r1) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$h */
    /* loaded from: classes.dex */
    public static final class C5192h extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f14396w;

        /* renamed from: x */
        final /* synthetic */ C5184j f14397x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5192h(InterfaceC6112p interfaceC6112p, C5184j c5184j) {
            super(0);
            this.f14396w = interfaceC6112p;
            this.f14397x = c5184j;
        }

        /* renamed from: a */
        public final void m25094a() {
            if (this.f14396w != null) {
                C5184j.m25199V(this.f14397x, 200, C5210k.m25023y());
                C5210k.m25058G(this.f14397x, this.f14396w);
                C5184j.m25209Q(this.f14397x);
                return;
            }
            this.f14397x.m25190Z0();
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m25094a();
            return C13195u.f34156a;
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: f0.j$i */
    /* loaded from: classes.dex */
    public static final class C5193i<T> implements Comparator {
        public final int compare(Object obj, Object obj2) {
            int m41795a;
            m41795a = C0127b.m41795a(Integer.valueOf(((C5163e0) obj).m25447b()), Integer.valueOf(((C5163e0) obj2).m25447b()));
            return m41795a;
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: f0.j$j */
    /* loaded from: classes.dex */
    static final class C5194j extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f14398w;

        /* renamed from: x */
        final /* synthetic */ C5184j f14399x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5194j(InterfaceC6108l interfaceC6108l, C5184j c5184j) {
            super(3);
            this.f14398w = interfaceC6108l;
            this.f14399x = c5184j;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25093a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25093a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "$noName_1");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            this.f14398w.mo9587d(this.f14399x.m25149n0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$k */
    /* loaded from: classes.dex */
    public static final class C5195k extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ Object[] f14400w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5195k(Object[] objArr) {
            super(3);
            this.f14400w = objArr;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25092a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25092a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "applier");
            Intrinsics.isThisObjectNull(c5173g1, "$noName_1");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            int length = this.f14400w.length;
            for (int i = 0; i < length; i++) {
                applier.mo25548c(this.f14400w[i]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$l */
    /* loaded from: classes.dex */
    public static final class C5196l extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ int f14401w;

        /* renamed from: x */
        final /* synthetic */ int f14402x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5196l(int i, int i2) {
            super(3);
            this.f14401w = i;
            this.f14402x = i2;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25091a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25091a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "applier");
            Intrinsics.isThisObjectNull(c5173g1, "$noName_1");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            applier.m25452h(this.f14401w, this.f14402x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$m */
    /* loaded from: classes.dex */
    public static final class C5197m extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ int f14403w;

        /* renamed from: x */
        final /* synthetic */ int f14404x;

        /* renamed from: y */
        final /* synthetic */ int f14405y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5197m(int i, int i2, int i3) {
            super(3);
            this.f14403w = i;
            this.f14404x = i2;
            this.f14405y = i3;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25090a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25090a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "applier");
            Intrinsics.isThisObjectNull(c5173g1, "$noName_1");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            applier.m25453g(this.f14403w, this.f14404x, this.f14405y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$n */
    /* loaded from: classes.dex */
    public static final class C5198n extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ int f14406w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5198n(int i) {
            super(3);
            this.f14406w = i;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25089a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25089a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            c5173g1.m25337c(this.f14406w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$o */
    /* loaded from: classes.dex */
    public static final class C5199o extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ int f14407w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5199o(int i) {
            super(3);
            this.f14407w = i;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25088a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25088a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "applier");
            Intrinsics.isThisObjectNull(c5173g1, "$noName_1");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            int i = this.f14407w;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                applier.mo25545i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$p */
    /* loaded from: classes.dex */
    public static final class C5200p extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ C5164e1 f14408w;

        /* renamed from: x */
        final /* synthetic */ C5159d f14409x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5200p(C5164e1 c5164e1, C5159d c5159d) {
            super(3);
            this.f14408w = c5164e1;
            this.f14409x = c5159d;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25087a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25087a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            c5173g1.m25329g();
            C5164e1 c5164e1 = this.f14408w;
            c5173g1.m25360H(c5164e1, this.f14409x.m25508d(c5164e1));
            c5173g1.m25313o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$q */
    /* loaded from: classes.dex */
    public static final class C5201q extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ C5164e1 f14410w;

        /* renamed from: x */
        final /* synthetic */ C5159d f14411x;

        /* renamed from: y */
        final /* synthetic */ List f14412y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5201q(C5164e1 c5164e1, C5159d c5159d, List list) {
            super(3);
            this.f14410w = c5164e1;
            this.f14411x = c5159d;
            this.f14412y = list;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25086a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25086a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "applier");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "rememberManager");
            C5164e1 c5164e1 = this.f14410w;
            List list = this.f14412y;
            C5173g1 m25430y = c5164e1.m25430y();
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC6113q) list.get(i)).mo4533i(applier, m25430y, interfaceC5267y0);
                }
                C13195u c13195u = C13195u.f34156a;
                m25430y.m25327h();
                c5173g1.m25329g();
                C5164e1 c5164e12 = this.f14410w;
                c5173g1.m25360H(c5164e12, this.f14411x.m25508d(c5164e12));
                c5173g1.m25313o();
            } catch (Throwable th2) {
                m25430y.m25327h();
                throw th2;
            }
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: f0.j$r */
    /* loaded from: classes.dex */
    static final class C5202r extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f14413w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5202r(InterfaceC6097a interfaceC6097a) {
            super(3);
            this.f14413w = interfaceC6097a;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25085a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25085a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "$noName_1");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "rememberManager");
            interfaceC5267y0.mo24848b(this.f14413w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$s */
    /* loaded from: classes.dex */
    public static final class C5203s extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ C5159d f14414w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5203s(C5159d c5159d) {
            super(3);
            this.f14414w = c5159d;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25084a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25084a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            c5173g1.m25309q(this.f14414w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$t */
    /* loaded from: classes.dex */
    public static final class C5204t extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ int f14415w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5204t(int i) {
            super(3);
            this.f14415w = i;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25083a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25083a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            c5173g1.m25359I(this.f14415w);
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: f0.j$u */
    /* loaded from: classes.dex */
    static final class C5205u extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ C5255u0[] f14416w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC5740f f14417x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5205u(C5255u0[] c5255u0Arr, InterfaceC5740f interfaceC5740f) {
            super(2);
            this.f14416w = c5255u0Arr;
            this.f14417x = interfaceC5740f;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m25082a((InterfaceC5179i) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final InterfaceC5740f m25082a(InterfaceC5179i interfaceC5179i, int i) {
            interfaceC5179i.mo25263g(2083456980);
            InterfaceC5740f m25045c = C5210k.m25045c(this.f14416w, this.f14417x, interfaceC5179i, 8);
            interfaceC5179i.mo25282C();
            return m25045c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$v */
    /* loaded from: classes.dex */
    public static final class C5206v extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ Object f14418w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5206v(Object obj) {
            super(3);
            this.f14418w = obj;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25081a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25081a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            c5173g1.m25318l0(this.f14418w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$w */
    /* loaded from: classes.dex */
    public static final class C5207w extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ Object f14419w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5207w(Object obj) {
            super(3);
            this.f14419w = obj;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25080a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25080a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "$noName_1");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "rememberManager");
            interfaceC5267y0.mo24849a((InterfaceC5269z0) this.f14419w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.j$x */
    /* loaded from: classes.dex */
    public static final class C5208x extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ Object f14420w;

        /* renamed from: x */
        final /* synthetic */ int f14421x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5208x(Object obj, int i) {
            super(3);
            this.f14420w = obj;
            this.f14421x = i;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25079a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25079a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            RecomposeScopeImpl recomposeScopeImpl;
            Composition m24874j;
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "rememberManager");
            Object obj = this.f14420w;
            if (obj instanceof InterfaceC5269z0) {
                interfaceC5267y0.mo24849a((InterfaceC5269z0) obj);
            }
            Object m25343Y = c5173g1.m25343Y(this.f14421x, this.f14420w);
            if (m25343Y instanceof InterfaceC5269z0) {
                interfaceC5267y0.mo24847c((InterfaceC5269z0) m25343Y);
            } else if (!(m25343Y instanceof RecomposeScopeImpl) || (m24874j = (recomposeScopeImpl = (RecomposeScopeImpl) m25343Y).m24874j()) == null) {
            } else {
                recomposeScopeImpl.m24860x(null);
                m24874j.m24977y(true);
            }
        }
    }

    public C5184j(Applier applier, CompositionContext compositionContext, C5164e1 c5164e1, Set set, List list, InterfaceC5243s interfaceC5243s) {
        Intrinsics.isThisObjectNull(applier, "applier");
        Intrinsics.isThisObjectNull(compositionContext, "parentContext");
        Intrinsics.isThisObjectNull(c5164e1, "slotTable");
        Intrinsics.isThisObjectNull(set, "abandonSet");
        Intrinsics.isThisObjectNull(list, "changes");
        Intrinsics.isThisObjectNull(interfaceC5243s, "composition");
        this.f14355b = applier;
        this.f14356c = compositionContext;
        this.f14357d = c5164e1;
        this.f14358e = set;
        this.f14359f = list;
        this.f14360g = interfaceC5243s;
        this.f14361h = new C5239q1();
        this.f14364k = new C5160d0();
        this.f14366m = new C5160d0();
        this.f14371r = new ArrayList();
        this.f14372s = new C5160d0();
        this.f14373t = C5732a.m23211a();
        this.f14374u = new HashMap();
        this.f14376w = new C5160d0();
        this.f14378y = -1;
        this.f14334A = C7971l.m17298y();
        this.f14335B = new C5239q1();
        C5161d1 m25431x = c5164e1.m25431x();
        m25431x.m25482d();
        this.f14337D = m25431x;
        C5164e1 c5164e12 = new C5164e1();
        this.f14338E = c5164e12;
        C5173g1 m25430y = c5164e12.m25430y();
        m25430y.m25327h();
        this.f14339F = m25430y;
        C5161d1 m25431x2 = c5164e12.m25431x();
        try {
            C5159d m25485a = m25431x2.m25485a(0);
            m25431x2.m25482d();
            this.f14341H = m25485a;
            this.f14342I = new ArrayList();
            this.f14346M = new C5239q1();
            this.f14349P = new C5160d0();
            this.f14350Q = new C5239q1();
            this.f14351R = -1;
            this.f14352S = -1;
            this.f14353T = -1;
        } catch (Throwable th2) {
            m25431x2.m25482d();
            throw th2;
        }
    }

    /* renamed from: A0 */
    private final void m25240A0(boolean z) {
        int m25470p = z ? this.f14337D.m25470p() : this.f14337D.m25478h();
        int i = m25470p - this.f14347N;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Tried to seek backward".toString());
        }
        if (i > 0) {
            m25230F0(new C5198n(i));
            this.f14347N = m25470p;
        }
    }

    /* renamed from: B0 */
    static /* synthetic */ void m25238B0(C5184j c5184j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c5184j.m25240A0(z);
    }

    /* renamed from: C0 */
    private final void m25236C0() {
        int i = this.f14345L;
        if (i > 0) {
            this.f14345L = 0;
            m25230F0(new C5199o(i));
        }
    }

    /* renamed from: E0 */
    private final void m25232E0() {
        boolean z = this.f14336C;
        this.f14336C = true;
        int m25470p = this.f14337D.m25470p();
        int m25462x = this.f14337D.m25462x(m25470p) + m25470p;
        int i = this.f14363j;
        int mo25244z = mo25244z();
        int i2 = this.f14365l;
        C5163e0 m25044d = C5210k.m25044d(this.f14371r, this.f14337D.m25478h(), m25462x);
        boolean z2 = false;
        int i3 = m25470p;
        while (m25044d != null) {
            int m25447b = m25044d.m25447b();
            C5210k.m25034n(this.f14371r, m25447b);
            if (m25044d.m25445d()) {
                this.f14337D.m25491I(m25447b);
                int m25478h = this.f14337D.m25478h();
                m25196W0(i3, m25478h, m25470p);
                this.f14363j = m25127v0(m25447b, m25478h, m25470p, i);
                this.f14344K = m25188a0(this.f14337D.m25492H(m25478h), m25470p, mo25244z);
                m25044d.m25446c().m24877g(this);
                this.f14337D.m25490J(m25470p);
                i3 = m25478h;
                z2 = true;
            } else {
                this.f14335B.m24926h(m25044d.m25446c());
                m25044d.m25446c().m24863u();
                this.f14335B.m24927g();
            }
            m25044d = C5210k.m25044d(this.f14371r, this.f14337D.m25478h(), m25462x);
        }
        if (z2) {
            m25196W0(i3, m25470p, m25470p);
            this.f14337D.m25488L();
            int m25139q1 = m25139q1(m25470p);
            this.f14363j = i + m25139q1;
            this.f14365l = i2 + m25139q1;
        } else {
            m25184b1();
        }
        this.f14344K = mo25244z;
        this.f14336C = z;
    }

    /* renamed from: F0 */
    private final void m25230F0(InterfaceC6113q interfaceC6113q) {
        this.f14359f.add(interfaceC6113q);
    }

    /* renamed from: G0 */
    private final void m25228G0(InterfaceC6113q interfaceC6113q) {
        m25236C0();
        m25123x0();
        m25230F0(interfaceC6113q);
    }

    /* renamed from: H0 */
    private final void m25226H0() {
        m25204S0(C5210k.m25041g());
        this.f14347N += this.f14337D.m25473m();
    }

    /* renamed from: I0 */
    private final void m25224I0(Object obj) {
        this.f14346M.m24926h(obj);
    }

    /* renamed from: J0 */
    private final void m25222J0() {
        int m25470p = this.f14337D.m25470p();
        if (this.f14349P.m25502e(-1) <= m25470p) {
            if (this.f14349P.m25502e(-1) == m25470p) {
                this.f14349P.m25501f();
                m25200U0(this, false, C5210k.m25043e(), 1, null);
                return;
            }
            return;
        }
        C5210k.m25030r("Missed recording an endGroup".toString());
        throw new ExceptionsH();
    }

    /* renamed from: K0 */
    private final void m25220K0() {
        if (this.f14348O) {
            m25200U0(this, false, C5210k.m25043e(), 1, null);
            this.f14348O = false;
        }
    }

    /* renamed from: L0 */
    private final void m25218L0(InterfaceC6113q interfaceC6113q) {
        this.f14342I.add(interfaceC6113q);
    }

    /* renamed from: M0 */
    private final void m25216M0(C5159d c5159d) {
        List m453p0;
        if (this.f14342I.isEmpty()) {
            m25204S0(new C5200p(this.f14338E, c5159d));
            return;
        }
        m453p0 = _Collections.m453p0(this.f14342I);
        this.f14342I.clear();
        m25236C0();
        m25123x0();
        m25204S0(new C5201q(this.f14338E, c5159d, m453p0));
    }

    /* renamed from: N0 */
    private final void m25214N0(InterfaceC6113q interfaceC6113q) {
        this.f14350Q.m24926h(interfaceC6113q);
    }

    /* renamed from: O0 */
    private final void m25212O0(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.f14354U;
            if (i4 > 0 && this.f14352S == i - i4 && this.f14353T == i2 - i4) {
                this.f14354U = i4 + i3;
                return;
            }
            m25119z0();
            this.f14352S = i;
            this.f14353T = i2;
            this.f14354U = i3;
        }
    }

    /* renamed from: P */
    private final void m25211P() {
        m25195X();
        this.f14361h.m24933a();
        this.f14364k.m25506a();
        this.f14366m.m25506a();
        this.f14372s.m25506a();
        this.f14376w.m25506a();
        this.f14337D.m25482d();
        this.f14344K = 0;
        this.f14379z = 0;
        this.f14370q = false;
        this.f14336C = false;
    }

    /* renamed from: P0 */
    private final void m25210P0(int i) {
        this.f14347N = i - (this.f14337D.m25478h() - this.f14347N);
    }

    /* renamed from: Q */
    public static final /* synthetic */ void m25209Q(C5184j c5184j) {
        c5184j.m25170g0();
    }

    /* renamed from: Q0 */
    private final void m25208Q0(int i, int i2) {
        if (i2 > 0) {
            if (i >= 0) {
                if (this.f14351R == i) {
                    this.f14354U += i2;
                    return;
                }
                m25119z0();
                this.f14351R = i;
                this.f14354U = i2;
                return;
            }
            C5210k.m25030r(Intrinsics.addStrAndObj("Invalid remove index ", Integer.valueOf(i)).toString());
            throw new ExceptionsH();
        }
    }

    /* renamed from: R */
    public static final /* synthetic */ int m25207R(C5184j c5184j) {
        return c5184j.f14379z;
    }

    /* renamed from: R0 */
    private final void m25206R0() {
        C5161d1 c5161d1;
        int m25470p;
        if (this.f14357d.isEmpty() || this.f14349P.m25502e(-1) == (m25470p = (c5161d1 = this.f14337D).m25470p())) {
            return;
        }
        if (!this.f14348O) {
            m25200U0(this, false, C5210k.m25040h(), 1, null);
            this.f14348O = true;
        }
        C5159d m25485a = c5161d1.m25485a(m25470p);
        this.f14349P.m25500g(m25470p);
        m25200U0(this, false, new C5203s(m25485a), 1, null);
    }

    /* renamed from: S */
    public static final /* synthetic */ CompositionContext m25205S(C5184j c5184j) {
        return c5184j.f14356c;
    }

    /* renamed from: S0 */
    private final void m25204S0(InterfaceC6113q interfaceC6113q) {
        m25238B0(this, false, 1, null);
        m25206R0();
        m25230F0(interfaceC6113q);
    }

    /* renamed from: T */
    public static final /* synthetic */ C5164e1 m25203T(C5184j c5184j) {
        return c5184j.f14357d;
    }

    /* renamed from: T0 */
    private final void m25202T0(boolean z, InterfaceC6113q interfaceC6113q) {
        m25240A0(z);
        m25230F0(interfaceC6113q);
    }

    /* renamed from: U */
    public static final /* synthetic */ void m25201U(C5184j c5184j, int i) {
        c5184j.f14379z = i;
    }

    /* renamed from: U0 */
    static /* synthetic */ void m25200U0(C5184j c5184j, boolean z, InterfaceC6113q interfaceC6113q, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c5184j.m25202T0(z, interfaceC6113q);
    }

    /* renamed from: V */
    public static final /* synthetic */ void m25199V(C5184j c5184j, int i, Object obj) {
        c5184j.m25175e1(i, obj);
    }

    /* renamed from: V0 */
    private final void m25198V0() {
        if (this.f14346M.m24930d()) {
            this.f14346M.m24927g();
        } else {
            this.f14345L++;
        }
    }

    /* renamed from: W */
    private final void m25197W() {
        if (mo25254p()) {
            RecomposeScopeImpl recomposeScopeImpl = new RecomposeScopeImpl((Composition) m25149n0());
            this.f14335B.m24926h(recomposeScopeImpl);
            m25142p1(recomposeScopeImpl);
            recomposeScopeImpl.m24884E(this.f14334A.m17384d());
            return;
        }
        C5163e0 m25034n = C5210k.m25034n(this.f14371r, this.f14337D.m25470p());
        Object m25497C = this.f14337D.m25497C();
        Objects.requireNonNull(m25497C, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) m25497C;
        recomposeScopeImpl2.m24888A(m25034n != null);
        this.f14335B.m24926h(recomposeScopeImpl2);
        recomposeScopeImpl2.m24884E(this.f14334A.m17384d());
    }

    /* renamed from: W0 */
    private final void m25196W0(int i, int i2, int i3) {
        C5161d1 c5161d1 = this.f14337D;
        int m25037k = C5210k.m25037k(c5161d1, i, i2, i3);
        while (i > 0 && i != m25037k) {
            if (c5161d1.m25498B(i)) {
                m25198V0();
            }
            i = c5161d1.m25492H(i);
        }
        m25176e0(i2, m25037k);
    }

    /* renamed from: X */
    private final void m25195X() {
        this.f14362i = null;
        this.f14363j = 0;
        this.f14365l = 0;
        this.f14347N = 0;
        this.f14344K = 0;
        this.f14370q = false;
        this.f14348O = false;
        this.f14349P.m25506a();
        this.f14335B.m24933a();
        m25193Y();
    }

    /* renamed from: X0 */
    private final void m25194X0() {
        this.f14342I.add(this.f14350Q.m24927g());
    }

    /* renamed from: Y */
    private final void m25193Y() {
        this.f14367n = null;
        this.f14368o = null;
    }

    /* renamed from: Y0 */
    private final Object m25192Y0(AbstractC5233p abstractC5233p, InterfaceC5740f interfaceC5740f) {
        if (C5210k.m25028t(interfaceC5740f, abstractC5233p)) {
            return C5210k.m25060E(interfaceC5740f, abstractC5233p);
        }
        return abstractC5233p.m24960a().getValue();
    }

    /* renamed from: a0 */
    private final int m25188a0(int i, int i2, int i3) {
        return i == i2 ? i3 : Integer.rotateLeft(m25188a0(this.f14337D.m25492H(i), i2, i3), 3) ^ m25140q0(this.f14337D, i);
    }

    /* renamed from: a1 */
    private final void m25187a1() {
        this.f14365l += this.f14337D.m25489K();
    }

    /* renamed from: b0 */
    private final InterfaceC5740f m25185b0() {
        if (mo25254p() && this.f14340G) {
            int m25304v = this.f14339F.m25304v();
            while (m25304v > 0) {
                if (this.f14339F.m25367A(m25304v) == 202 && Intrinsics.equals(this.f14339F.m25366B(m25304v), C5210k.m25024x())) {
                    Object m25301y = this.f14339F.m25301y(m25304v);
                    Objects.requireNonNull(m25301y, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    return (InterfaceC5740f) m25301y;
                }
                m25304v = this.f14339F.m25353O(m25304v);
            }
        }
        if (this.f14357d.m25436p() > 0) {
            int m25470p = this.f14337D.m25470p();
            while (m25470p > 0) {
                if (this.f14337D.m25464v(m25470p) == 202 && Intrinsics.equals(this.f14337D.m25463w(m25470p), C5210k.m25024x())) {
                    InterfaceC5740f interfaceC5740f = (InterfaceC5740f) this.f14374u.get(Integer.valueOf(m25470p));
                    if (interfaceC5740f == null) {
                        Object m25466t = this.f14337D.m25466t(m25470p);
                        Objects.requireNonNull(m25466t, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        return (InterfaceC5740f) m25466t;
                    }
                    return interfaceC5740f;
                }
                m25470p = this.f14337D.m25492H(m25470p);
            }
        }
        return this.f14373t;
    }

    /* renamed from: b1 */
    private final void m25184b1() {
        this.f14365l = this.f14337D.m25469q();
        this.f14337D.m25488L();
    }

    /* renamed from: c1 */
    private final void m25181c1(int i, Object obj, boolean z, Object obj2) {
        m25133s1();
        m25163i1(i, obj, obj2);
        C5237q0 c5237q0 = null;
        if (mo25254p()) {
            this.f14337D.m25483c();
            int m25305u = this.f14339F.m25305u();
            if (z) {
                this.f14339F.m25324i0(InterfaceC5179i.f14328a.m25243a());
            } else if (obj2 != null) {
                C5173g1 c5173g1 = this.f14339F;
                if (obj == null) {
                    obj = InterfaceC5179i.f14328a.m25243a();
                }
                c5173g1.m25332e0(i, obj, obj2);
            } else {
                C5173g1 c5173g12 = this.f14339F;
                if (obj == null) {
                    obj = InterfaceC5179i.f14328a.m25243a();
                }
                c5173g12.m25328g0(i, obj);
            }
            C5237q0 c5237q02 = this.f14362i;
            if (c5237q02 != null) {
                C5172g0 c5172g0 = new C5172g0(i, -1, m25137r0(m25305u), -1, 0);
                c5237q02.m24941i(c5172g0, this.f14363j - c5237q02.m24945e());
                c5237q02.m24942h(c5172g0);
            }
            m25161j0(z, null);
            return;
        }
        if (this.f14362i == null) {
            if (this.f14337D.m25475k() == i && Intrinsics.equals(obj, this.f14337D.m25474l())) {
                m25172f1(z, obj2);
            } else {
                this.f14362i = new C5237q0(this.f14337D.m25479g(), this.f14363j);
            }
        }
        C5237q0 c5237q03 = this.f14362i;
        if (c5237q03 != null) {
            C5172g0 m24946d = c5237q03.m24946d(i, obj);
            if (m24946d != null) {
                c5237q03.m24942h(m24946d);
                int m25370b = m24946d.m25370b();
                this.f14363j = c5237q03.m24943g(m24946d) + c5237q03.m24945e();
                int m24937m = c5237q03.m24937m(m24946d);
                int m24949a = m24937m - c5237q03.m24949a();
                c5237q03.m24939k(m24937m, c5237q03.m24949a());
                m25210P0(m25370b);
                this.f14337D.m25491I(m25370b);
                if (m24949a > 0) {
                    m25204S0(new C5204t(m24949a));
                }
                m25172f1(z, obj2);
            } else {
                this.f14337D.m25483c();
                this.f14343J = true;
                m25164i0();
                this.f14339F.m25329g();
                int m25305u2 = this.f14339F.m25305u();
                if (z) {
                    this.f14339F.m25324i0(InterfaceC5179i.f14328a.m25243a());
                } else if (obj2 != null) {
                    C5173g1 c5173g13 = this.f14339F;
                    if (obj == null) {
                        obj = InterfaceC5179i.f14328a.m25243a();
                    }
                    c5173g13.m25332e0(i, obj, obj2);
                } else {
                    C5173g1 c5173g14 = this.f14339F;
                    if (obj == null) {
                        obj = InterfaceC5179i.f14328a.m25243a();
                    }
                    c5173g14.m25328g0(i, obj);
                }
                this.f14341H = this.f14339F.m25335d(m25305u2);
                C5172g0 c5172g02 = new C5172g0(i, -1, m25137r0(m25305u2), -1, 0);
                c5237q03.m24941i(c5172g02, this.f14363j - c5237q03.m24945e());
                c5237q03.m24942h(c5172g02);
                c5237q0 = new C5237q0(new ArrayList(), z ? 0 : this.f14363j);
            }
        }
        m25161j0(z, c5237q0);
    }

    /* renamed from: d0 */
    private final void m25179d0(IdentityArrayMap identityArrayMap, InterfaceC6112p interfaceC6112p) {
        if (!this.f14336C) {
            Object m24890a = C5259v1.f14529a.m24890a("Compose:recompose");
            try {
                this.f14334A = C7971l.m17298y();
                int m23686f = identityArrayMap.m23686f();
                int i = 0;
                while (i < m23686f) {
                    int i2 = i + 1;
                    Object obj = identityArrayMap.m23687e()[i];
                    if (obj != null) {
                        IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.m23685g()[i];
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        C5159d m24875i = recomposeScopeImpl.m24875i();
                        Integer valueOf = m24875i == null ? null : Integer.valueOf(m24875i.m25511a());
                        if (valueOf == null) {
                            return;
                        }
                        this.f14371r.add(new C5163e0(recomposeScopeImpl, valueOf.intValue(), identityArraySet));
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    }
                }
                List list = this.f14371r;
                if (list.size() > 1) {
                    MutableCollectionsJVM.m184t(list, new C5193i());
                }
                this.f14363j = 0;
                this.f14336C = true;
                m25169g1();
                C5209j1.m25070h(new C5190f(), new C5191g(), new C5192h(interfaceC6112p, this));
                m25167h0();
                this.f14336C = false;
                this.f14371r.clear();
                this.f14374u.clear();
                C13195u c13195u = C13195u.f34156a;
                return;
            } finally {
                C5259v1.f14529a.m24889b(m24890a);
            }
        }
        C5210k.m25030r("Reentrant composition is not supported".toString());
        throw new ExceptionsH();
    }

    /* renamed from: d1 */
    private final void m25178d1(int i) {
        m25181c1(i, null, false, null);
    }

    /* renamed from: e0 */
    private final void m25176e0(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m25176e0(this.f14337D.m25492H(i), i2);
        if (this.f14337D.m25498B(i)) {
            m25224I0(m25129u0(this.f14337D, i));
        }
    }

    /* renamed from: e1 */
    private final void m25175e1(int i, Object obj) {
        m25181c1(i, obj, false, null);
    }

    /* renamed from: f0 */
    private final void m25173f0(boolean z) {
        List list;
        if (mo25254p()) {
            int m25304v = this.f14339F.m25304v();
            m25157k1(this.f14339F.m25367A(m25304v), this.f14339F.m25366B(m25304v), this.f14339F.m25301y(m25304v));
        } else {
            int m25470p = this.f14337D.m25470p();
            m25157k1(this.f14337D.m25464v(m25470p), this.f14337D.m25463w(m25470p), this.f14337D.m25466t(m25470p));
        }
        int i = this.f14365l;
        C5237q0 c5237q0 = this.f14362i;
        int i2 = 0;
        if (c5237q0 != null && c5237q0.m24948b().size() > 0) {
            List m24948b = c5237q0.m24948b();
            List m24944f = c5237q0.m24944f();
            Set m17476e = ListUtils.m17476e(m24944f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = m24944f.size();
            int size2 = m24948b.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                C5172g0 c5172g0 = (C5172g0) m24948b.get(i3);
                if (!m17476e.contains(c5172g0)) {
                    m25208Q0(c5237q0.m24943g(c5172g0) + c5237q0.m24945e(), c5172g0.m25369c());
                    c5237q0.m24936n(c5172g0.m25370b(), i2);
                    m25210P0(c5172g0.m25370b());
                    this.f14337D.m25491I(c5172g0.m25370b());
                    m25226H0();
                    this.f14337D.m25489K();
                    C5210k.m25033o(this.f14371r, c5172g0.m25370b(), c5172g0.m25370b() + this.f14337D.m25462x(c5172g0.m25370b()));
                } else if (!linkedHashSet.contains(c5172g0)) {
                    if (i4 < size) {
                        C5172g0 c5172g02 = (C5172g0) m24944f.get(i4);
                        if (c5172g02 != c5172g0) {
                            int m24943g = c5237q0.m24943g(c5172g02);
                            linkedHashSet.add(c5172g02);
                            if (m24943g != i5) {
                                int m24935o = c5237q0.m24935o(c5172g02);
                                list = m24944f;
                                m25212O0(c5237q0.m24945e() + m24943g, i5 + c5237q0.m24945e(), m24935o);
                                c5237q0.m24940j(m24943g, i5, m24935o);
                            } else {
                                list = m24944f;
                            }
                        } else {
                            list = m24944f;
                            i3++;
                        }
                        i4++;
                        i5 += c5237q0.m24935o(c5172g02);
                        m24944f = list;
                    }
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            m25119z0();
            if (m24948b.size() > 0) {
                m25210P0(this.f14337D.m25476j());
                this.f14337D.m25488L();
            }
        }
        int i6 = this.f14363j;
        while (!this.f14337D.m25460z()) {
            int m25478h = this.f14337D.m25478h();
            m25226H0();
            m25208Q0(i6, this.f14337D.m25489K());
            C5210k.m25033o(this.f14371r, m25478h, this.f14337D.m25478h());
        }
        boolean mo25254p = mo25254p();
        if (mo25254p) {
            if (z) {
                m25194X0();
                i = 1;
            }
            this.f14337D.m25481e();
            int m25304v2 = this.f14339F.m25304v();
            this.f14339F.m25315n();
            if (!this.f14337D.m25471o()) {
                int m25137r0 = m25137r0(m25304v2);
                this.f14339F.m25313o();
                this.f14339F.m25327h();
                m25216M0(this.f14341H);
                this.f14343J = false;
                if (!this.f14357d.isEmpty()) {
                    m25151m1(m25137r0, 0);
                    m25148n1(m25137r0, i);
                }
            }
        } else {
            if (z) {
                m25198V0();
            }
            m25222J0();
            int m25470p2 = this.f14337D.m25470p();
            if (i != m25139q1(m25470p2)) {
                m25148n1(m25470p2, i);
            }
            if (z) {
                i = 1;
            }
            this.f14337D.m25480f();
            m25119z0();
        }
        m25158k0(i, mo25254p);
    }

    /* renamed from: f1 */
    private final void m25172f1(boolean z, Object obj) {
        if (z) {
            this.f14337D.m25486N();
            return;
        }
        if (obj != null && this.f14337D.m25477i() != obj) {
            m25200U0(this, false, new C5206v(obj), 1, null);
        }
        this.f14337D.m25487M();
    }

    /* renamed from: g0 */
    private final void m25170g0() {
        m25173f0(false);
    }

    /* renamed from: g1 */
    private final void m25169g1() {
        this.f14337D = this.f14357d.m25431x();
        m25178d1(100);
        this.f14356c.m39990j();
        this.f14373t = this.f14356c.m39996d();
        this.f14376w.m25500g(C5210k.m25046b(this.f14375v));
        this.f14375v = mo25276I(this.f14373t);
        if (!this.f14369p) {
            this.f14369p = this.f14356c.m39997c();
        }
        Set set = (Set) m25192Y0(C8335c.m15778a(), this.f14373t);
        if (set != null) {
            set.add(this.f14357d);
            this.f14356c.m39992h(set);
        }
        m25178d1(this.f14356c.m39995e());
    }

    /* renamed from: h0 */
    private final void m25167h0() {
        m25170g0();
        this.f14356c.m39998b();
        m25170g0();
        m25220K0();
        m25155l0();
        this.f14337D.m25482d();
    }

    /* renamed from: i0 */
    private final void m25164i0() {
        if (this.f14339F.m25306t()) {
            C5173g1 m25430y = this.f14338E.m25430y();
            this.f14339F = m25430y;
            m25430y.m25336c0();
            this.f14340G = false;
        }
    }

    /* renamed from: i1 */
    private final void m25163i1(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !Intrinsics.equals(obj2, InterfaceC5179i.f14328a.m25243a())) {
                m25160j1(obj2.hashCode());
            } else {
                m25160j1(i);
            }
        } else if (obj instanceof Enum) {
            m25160j1(((Enum) obj).ordinal());
        } else {
            m25160j1(obj.hashCode());
        }
    }

    /* renamed from: j0 */
    private final void m25161j0(boolean z, C5237q0 c5237q0) {
        this.f14361h.m24926h(this.f14362i);
        this.f14362i = c5237q0;
        this.f14364k.m25500g(this.f14363j);
        if (z) {
            this.f14363j = 0;
        }
        this.f14366m.m25500g(this.f14365l);
        this.f14365l = 0;
    }

    /* renamed from: j1 */
    private final void m25160j1(int i) {
        this.f14344K = i ^ Integer.rotateLeft(mo25244z(), 3);
    }

    /* renamed from: k0 */
    private final void m25158k0(int i, boolean z) {
        C5237q0 c5237q0 = (C5237q0) this.f14361h.m24927g();
        if (c5237q0 != null && !z) {
            c5237q0.m24938l(c5237q0.m24949a() + 1);
        }
        this.f14362i = c5237q0;
        this.f14363j = this.f14364k.m25501f() + i;
        this.f14365l = this.f14366m.m25501f() + i;
    }

    /* renamed from: k1 */
    private final void m25157k1(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !Intrinsics.equals(obj2, InterfaceC5179i.f14328a.m25243a())) {
                m25154l1(obj2.hashCode());
            } else {
                m25154l1(i);
            }
        } else if (obj instanceof Enum) {
            m25154l1(((Enum) obj).ordinal());
        } else {
            m25154l1(obj.hashCode());
        }
    }

    /* renamed from: l0 */
    private final void m25155l0() {
        m25236C0();
        if (this.f14361h.m24931c()) {
            if (this.f14349P.m25504c()) {
                m25195X();
                return;
            } else {
                C5210k.m25030r("Missed recording an endGroup()".toString());
                throw new ExceptionsH();
            }
        }
        C5210k.m25030r("Start/end imbalance".toString());
        throw new ExceptionsH();
    }

    /* renamed from: l1 */
    private final void m25154l1(int i) {
        this.f14344K = Integer.rotateRight(Integer.hashCode(i) ^ mo25244z(), 3);
    }

    /* renamed from: m1 */
    private final void m25151m1(int i, int i2) {
        if (m25139q1(i) != i2) {
            if (i < 0) {
                HashMap hashMap = this.f14368o;
                if (hashMap == null) {
                    hashMap = new HashMap();
                    this.f14368o = hashMap;
                }
                hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            int[] iArr = this.f14367n;
            if (iArr == null) {
                iArr = new int[this.f14337D.m25468r()];
                _ArraysJvm.m305s(iArr, -1, 0, 0, 6, null);
                this.f14367n = iArr;
            }
            iArr[i] = i2;
        }
    }

    /* renamed from: n1 */
    private final void m25148n1(int i, int i2) {
        int m25139q1 = m25139q1(i);
        if (m25139q1 != i2) {
            int i3 = i2 - m25139q1;
            int m24932b = this.f14361h.m24932b() - 1;
            while (i != -1) {
                int m25139q12 = m25139q1(i) + i3;
                m25151m1(i, m25139q12);
                if (m24932b >= 0) {
                    int i4 = m24932b;
                    while (true) {
                        int i5 = i4 - 1;
                        C5237q0 c5237q0 = (C5237q0) this.f14361h.m24928f(i4);
                        if (c5237q0 != null && c5237q0.m24936n(i, m25139q12)) {
                            m24932b = i4 - 1;
                            break;
                        } else if (i5 < 0) {
                            break;
                        } else {
                            i4 = i5;
                        }
                    }
                }
                if (i < 0) {
                    i = this.f14337D.m25470p();
                } else if (this.f14337D.m25498B(i)) {
                    return;
                } else {
                    i = this.f14337D.m25492H(i);
                }
            }
        }
    }

    /* renamed from: o1 */
    private final InterfaceC5740f m25145o1(InterfaceC5740f interfaceC5740f, InterfaceC5740f interfaceC5740f2) {
        InterfaceC5740f.InterfaceC5741a mo23201i = interfaceC5740f.mo23201i();
        mo23201i.putAll(interfaceC5740f2);
        InterfaceC5740f mo21191h = mo23201i.mo21191h();
        m25175e1(204, C5210k.m25063B());
        mo25276I(mo21191h);
        mo25276I(interfaceC5740f2);
        m25170g0();
        return mo21191h;
    }

    /* renamed from: p0 */
    private final Object m25143p0(C5161d1 c5161d1) {
        return c5161d1.m25496D(c5161d1.m25470p());
    }

    /* renamed from: q0 */
    private final int m25140q0(C5161d1 c5161d1, int i) {
        Object m25466t;
        if (c5161d1.m25461y(i)) {
            Object m25463w = c5161d1.m25463w(i);
            if (m25463w == null) {
                return 0;
            }
            return m25463w instanceof Enum ? ((Enum) m25463w).ordinal() : m25463w.hashCode();
        }
        int m25464v = c5161d1.m25464v(i);
        if (m25464v == 207 && (m25466t = c5161d1.m25466t(i)) != null && !Intrinsics.equals(m25466t, InterfaceC5179i.f14328a.m25243a())) {
            m25464v = m25466t.hashCode();
        }
        return m25464v;
    }

    /* renamed from: q1 */
    private final int m25139q1(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap hashMap = this.f14368o;
            if (hashMap == null || (num = (Integer) hashMap.get(Integer.valueOf(i))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.f14367n;
        return (iArr == null || (i2 = iArr[i]) < 0) ? this.f14337D.m25494F(i) : i2;
    }

    /* renamed from: r0 */
    private final int m25137r0(int i) {
        return (-2) - i;
    }

    /* renamed from: r1 */
    private final void m25136r1() {
        if (this.f14370q) {
            this.f14370q = false;
        } else {
            C5210k.m25030r("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new ExceptionsH();
        }
    }

    /* renamed from: s1 */
    private final void m25133s1() {
        if (!this.f14370q) {
            return;
        }
        C5210k.m25030r("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new ExceptionsH();
    }

    /* renamed from: u0 */
    private final Object m25129u0(C5161d1 c5161d1, int i) {
        return c5161d1.m25496D(i);
    }

    /* renamed from: v0 */
    private final int m25127v0(int i, int i2, int i3, int i4) {
        int m25492H = this.f14337D.m25492H(i2);
        while (m25492H != i3 && !this.f14337D.m25498B(m25492H)) {
            m25492H = this.f14337D.m25492H(m25492H);
        }
        if (this.f14337D.m25498B(m25492H)) {
            i4 = 0;
        }
        if (m25492H == i2) {
            return i4;
        }
        int m25139q1 = (m25139q1(m25492H) - this.f14337D.m25494F(i2)) + i4;
        loop1: while (i4 < m25139q1 && m25492H != i) {
            m25492H++;
            while (m25492H < i) {
                int m25462x = this.f14337D.m25462x(m25492H) + m25492H;
                if (i < m25462x) {
                    break;
                }
                i4 += m25139q1(m25492H);
                m25492H = m25462x;
            }
            break loop1;
        }
        return i4;
    }

    /* renamed from: x0 */
    private final void m25123x0() {
        if (this.f14346M.m24930d()) {
            m25121y0(this.f14346M.m24925i());
            this.f14346M.m24933a();
        }
    }

    /* renamed from: y0 */
    private final void m25121y0(Object[] objArr) {
        m25230F0(new C5195k(objArr));
    }

    /* renamed from: z0 */
    private final void m25119z0() {
        int i = this.f14354U;
        this.f14354U = 0;
        if (i > 0) {
            int i2 = this.f14351R;
            if (i2 >= 0) {
                this.f14351R = -1;
                m25228G0(new C5196l(i2, i));
                return;
            }
            int i3 = this.f14352S;
            this.f14352S = -1;
            int i4 = this.f14353T;
            this.f14353T = -1;
            m25228G0(new C5197m(i3, i4, i));
        }
    }

    /* renamed from: A */
    public CompositionContext mo25284A() {
        m25175e1(206, C5210k.m25061D());
        Object m25131t0 = m25131t0();
        C5185a c5185a = m25131t0 instanceof C5185a ? (C5185a) m25131t0 : null;
        if (c5185a == null) {
            c5185a = new C5185a(new C5186b(this, mo25244z(), this.f14369p));
            m25142p1(c5185a);
        }
        c5185a.m25118c().m25100r(m25185b0());
        m25170g0();
        return c5185a.m25118c();
    }

    /* renamed from: B */
    public void mo25283B() {
        m25170g0();
    }

    /* renamed from: C */
    public void mo25282C() {
        m25170g0();
    }

    /* renamed from: D */
    public void mo25281D() {
        m25173f0(true);
    }

    /* renamed from: D0 */
    public final boolean m25234D0(IdentityArrayMap identityArrayMap) {
        Intrinsics.isThisObjectNull(identityArrayMap, "invalidationsRequested");
        if (this.f14359f.isEmpty()) {
            if (identityArrayMap.m23684h() || (!this.f14371r.isEmpty())) {
                m25179d0(identityArrayMap, null);
                return !this.f14359f.isEmpty();
            }
            return false;
        }
        C5210k.m25030r("Expected applyChanges() to have been called".toString());
        throw new ExceptionsH();
    }

    /* renamed from: E */
    public void mo25280E() {
        this.f14377x = false;
    }

    /* renamed from: F */
    public void mo25279F() {
        m25170g0();
        RecomposeScopeImpl m25146o0 = m25146o0();
        if (m25146o0 == null || !m25146o0.m24868p()) {
            return;
        }
        m25146o0.m24859y(true);
    }

    /* renamed from: G */
    public Applier mo25278G() {
        return this.f14355b;
    }

    /* renamed from: H */
    public void mo25277H(Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        C5187c c5187c = new C5187c(interfaceC6112p, obj);
        if (mo25254p()) {
            m25218L0(c5187c);
        } else {
            m25228G0(c5187c);
        }
    }

    /* renamed from: I */
    public boolean mo25276I(Object obj) {
        if (Intrinsics.equals(m25131t0(), obj)) {
            return false;
        }
        m25142p1(obj);
        return true;
    }

    /* renamed from: J */
    public void mo25275J(int i, Object obj) {
        if (this.f14337D.m25475k() == i && !Intrinsics.equals(this.f14337D.m25477i(), obj) && this.f14378y < 0) {
            this.f14378y = this.f14337D.m25478h();
            this.f14377x = true;
        }
        m25181c1(i, null, false, obj);
    }

    /* renamed from: K */
    public InterfaceC5151a1 mo25274K() {
        C5159d m25485a;
        InterfaceC6108l m24876h;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = this.f14335B.m24930d() ? (RecomposeScopeImpl) this.f14335B.m24927g() : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.m24888A(false);
        }
        if (recomposeScopeImpl2 != null && (m24876h = recomposeScopeImpl2.m24876h(this.f14334A.m17384d())) != null) {
            m25230F0(new C5194j(m24876h, this));
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.m24869o() && (recomposeScopeImpl2.m24868p() || this.f14369p)) {
            if (recomposeScopeImpl2.m24875i() == null) {
                if (mo25254p()) {
                    C5173g1 c5173g1 = this.f14339F;
                    m25485a = c5173g1.m25335d(c5173g1.m25304v());
                } else {
                    C5161d1 c5161d1 = this.f14337D;
                    m25485a = c5161d1.m25485a(c5161d1.m25470p());
                }
                recomposeScopeImpl2.m24861w(m25485a);
            }
            recomposeScopeImpl2.m24858z(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        m25173f0(false);
        return recomposeScopeImpl;
    }

    /* renamed from: L */
    public void mo25273L() {
        boolean mo25254p = mo25254p();
        int i = C4906j.f13420I0;
        if (mo25254p || (!this.f14377x ? this.f14337D.m25475k() != 126 : this.f14337D.m25475k() != 125)) {
            i = 125;
        }
        m25181c1(i, null, true, null);
        this.f14370q = true;
    }

    /* renamed from: M */
    public void mo25272M(C5255u0[] c5255u0Arr) {
        InterfaceC5740f m25145o1;
        boolean z;
        Intrinsics.isThisObjectNull(c5255u0Arr, "values");
        InterfaceC5740f m25185b0 = m25185b0();
        m25175e1(201, C5210k.m25064A());
        m25175e1(203, C5210k.m25062C());
        InterfaceC5740f interfaceC5740f = (InterfaceC5740f) C5210k.m25057H(this, new C5205u(c5255u0Arr, m25185b0));
        m25170g0();
        if (mo25254p()) {
            m25145o1 = m25145o1(m25185b0, interfaceC5740f);
            this.f14340G = true;
        } else {
            Object m25465u = this.f14337D.m25465u(0);
            Objects.requireNonNull(m25465u, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            InterfaceC5740f interfaceC5740f2 = (InterfaceC5740f) m25465u;
            Object m25465u2 = this.f14337D.m25465u(1);
            Objects.requireNonNull(m25465u2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            InterfaceC5740f interfaceC5740f3 = (InterfaceC5740f) m25465u2;
            if (mo25245y() && Intrinsics.equals(interfaceC5740f3, interfaceC5740f)) {
                m25187a1();
                m25145o1 = interfaceC5740f2;
            } else {
                m25145o1 = m25145o1(m25185b0, interfaceC5740f);
                z = !Intrinsics.equals(m25145o1, interfaceC5740f2);
                if (z && !mo25254p()) {
                    this.f14374u.put(Integer.valueOf(this.f14337D.m25478h()), m25145o1);
                }
                this.f14376w.m25500g(C5210k.m25046b(this.f14375v));
                this.f14375v = z;
                m25181c1(202, C5210k.m25024x(), false, m25145o1);
            }
        }
        z = false;
        if (z) {
            this.f14374u.put(Integer.valueOf(this.f14337D.m25478h()), m25145o1);
        }
        this.f14376w.m25500g(C5210k.m25046b(this.f14375v));
        this.f14375v = z;
        m25181c1(202, C5210k.m25024x(), false, m25145o1);
    }

    /* renamed from: N */
    public void mo25271N(InterfaceC5258v0 interfaceC5258v0) {
        Intrinsics.isThisObjectNull(interfaceC5258v0, "scope");
        RecomposeScopeImpl recomposeScopeImpl = interfaceC5258v0 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) interfaceC5258v0 : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.m24885D(true);
    }

    /* renamed from: O */
    public void mo25270O(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "factory");
        m25136r1();
        if (mo25254p()) {
            int m25503d = this.f14364k.m25503d();
            C5173g1 c5173g1 = this.f14339F;
            C5159d m25335d = c5173g1.m25335d(c5173g1.m25304v());
            this.f14365l++;
            m25218L0(new C5188d(interfaceC6097a, m25335d, m25503d));
            m25214N0(new C5189e(m25335d, m25503d));
            return;
        }
        C5210k.m25030r("createNode() can only be called when inserting".toString());
        throw new ExceptionsH();
    }

    /* renamed from: Z */
    public final void m25191Z(IdentityArrayMap identityArrayMap, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(identityArrayMap, "invalidationsRequested");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        if (this.f14359f.isEmpty()) {
            m25179d0(identityArrayMap, interfaceC6112p);
        } else {
            C5210k.m25030r("Expected applyChanges() to have been called".toString());
            throw new ExceptionsH();
        }
    }

    /* renamed from: Z0 */
    public void m25190Z0() {
        if (this.f14371r.isEmpty()) {
            m25187a1();
            return;
        }
        C5161d1 c5161d1 = this.f14337D;
        int m25475k = c5161d1.m25475k();
        Object m25474l = c5161d1.m25474l();
        Object m25477i = c5161d1.m25477i();
        m25163i1(m25475k, m25474l, m25477i);
        m25172f1(c5161d1.m25499A(), null);
        m25232E0();
        c5161d1.m25480f();
        m25157k1(m25475k, m25474l, m25477i);
    }

    /* renamed from: a */
    public void mo25269a() {
        this.f14369p = true;
    }

    /* renamed from: b */
    public InterfaceC5258v0 mo25268b() {
        return m25146o0();
    }

    /* renamed from: c */
    public void mo25267c(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "effect");
        m25230F0(new C5202r(interfaceC6097a));
    }

    /* renamed from: c0 */
    public final void m25182c0() {
        C5259v1 c5259v1 = C5259v1.f14529a;
        Object m24890a = c5259v1.m24890a("Compose:Composer.dispose");
        try {
            this.f14356c.m39989k(this);
            this.f14335B.m24933a();
            this.f14371r.clear();
            this.f14359f.clear();
            mo25278G().clear();
            C13195u c13195u = C13195u.f34156a;
            c5259v1.m24889b(m24890a);
        } catch (Throwable th2) {
            C5259v1.f14529a.m24889b(m24890a);
            throw th2;
        }
    }

    /* renamed from: d */
    public boolean mo25266d(boolean z) {
        Object m25131t0 = m25131t0();
        if ((m25131t0 instanceof Boolean) && z == ((Boolean) m25131t0).booleanValue()) {
            return false;
        }
        m25142p1(Boolean.valueOf(z));
        return true;
    }

    /* renamed from: e */
    public void mo25265e() {
        if (this.f14377x && this.f14337D.m25470p() == this.f14378y) {
            this.f14378y = -1;
            this.f14377x = false;
        }
        m25173f0(false);
    }

    /* renamed from: f */
    public void mo25264f() {
        if (this.f14365l == 0) {
            RecomposeScopeImpl m25146o0 = m25146o0();
            if (m25146o0 != null) {
                m25146o0.m24862v();
            }
            if (this.f14371r.isEmpty()) {
                m25184b1();
                return;
            } else {
                m25232E0();
                return;
            }
        }
        C5210k.m25030r("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new ExceptionsH();
    }

    /* renamed from: g */
    public void mo25263g(int i) {
        m25181c1(i, null, false, null);
    }

    /* renamed from: h */
    public Object mo25262h() {
        return m25131t0();
    }

    /* renamed from: h1 */
    public final boolean m25166h1(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Intrinsics.isThisObjectNull(recomposeScopeImpl, "scope");
        C5159d m24875i = recomposeScopeImpl.m24875i();
        if (m24875i == null) {
            return false;
        }
        int m25508d = m24875i.m25508d(this.f14357d);
        if (!this.f14336C || m25508d < this.f14337D.m25478h()) {
            return false;
        }
        C5210k.m25039i(this.f14371r, m25508d, recomposeScopeImpl, obj);
        return true;
    }

    /* renamed from: i */
    public boolean mo25261i(float f) {
        Object m25131t0 = m25131t0();
        if (m25131t0 instanceof Float) {
            if (f == ((Number) m25131t0).floatValue()) {
                return false;
            }
        }
        m25142p1(Float.valueOf(f));
        return true;
    }

    /* renamed from: j */
    public void mo25260j() {
        this.f14377x = this.f14378y >= 0;
    }

    /* renamed from: k */
    public boolean mo25259k(int i) {
        Object m25131t0 = m25131t0();
        if ((m25131t0 instanceof Integer) && i == ((Number) m25131t0).intValue()) {
            return false;
        }
        m25142p1(Integer.valueOf(i));
        return true;
    }

    /* renamed from: l */
    public boolean mo25258l(long j) {
        Object m25131t0 = m25131t0();
        if ((m25131t0 instanceof Long) && j == ((Number) m25131t0).longValue()) {
            return false;
        }
        m25142p1(Long.valueOf(j));
        return true;
    }

    /* renamed from: m */
    public InterfaceC8333a mo25257m() {
        return this.f14357d;
    }

    /* renamed from: m0 */
    public final boolean m25152m0() {
        return this.f14379z > 0;
    }

    /* renamed from: n */
    public Object mo25256n(AbstractC5233p abstractC5233p) {
        Intrinsics.isThisObjectNull(abstractC5233p, "key");
        return m25192Y0(abstractC5233p, m25185b0());
    }

    /* renamed from: n0 */
    public InterfaceC5243s m25149n0() {
        return this.f14360g;
    }

    /* renamed from: o */
    public CoroutineContext mo25255o() {
        return this.f14356c.m39994f();
    }

    /* renamed from: o0 */
    public final RecomposeScopeImpl m25146o0() {
        C5239q1 c5239q1 = this.f14335B;
        if (this.f14379z == 0 && c5239q1.m24930d()) {
            return (RecomposeScopeImpl) c5239q1.m24929e();
        }
        return null;
    }

    /* renamed from: p */
    public boolean mo25254p() {
        return this.f14343J;
    }

    /* renamed from: p1 */
    public final void m25142p1(Object obj) {
        if (mo25254p()) {
            this.f14339F.m25322j0(obj);
            if (obj instanceof InterfaceC5269z0) {
                m25230F0(new C5207w(obj));
                this.f14358e.add(obj);
                return;
            }
            return;
        }
        int m25472n = this.f14337D.m25472n() - 1;
        if (obj instanceof InterfaceC5269z0) {
            this.f14358e.add(obj);
        }
        m25202T0(true, new C5208x(obj, m25472n));
    }

    /* renamed from: q */
    public void mo25253q() {
        m25170g0();
        m25170g0();
        this.f14375v = C5210k.m25047a(this.f14376w.m25501f());
    }

    /* renamed from: r */
    public boolean mo25252r() {
        if (!this.f14375v) {
            RecomposeScopeImpl m25146o0 = m25146o0();
            if (!(m25146o0 != null && m25146o0.m24872l())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public void mo25251s() {
        m25136r1();
        if (!mo25254p()) {
            m25224I0(m25143p0(this.f14337D));
        } else {
            C5210k.m25030r("useNode() called while inserting".toString());
            throw new ExceptionsH();
        }
    }

    /* renamed from: s0 */
    public final boolean m25134s0() {
        return this.f14336C;
    }

    /* renamed from: t */
    public void mo25250t() {
        m25181c1(-127, null, false, null);
    }

    /* renamed from: t0 */
    public final Object m25131t0() {
        if (!mo25254p()) {
            return this.f14377x ? InterfaceC5179i.f14328a.m25243a() : this.f14337D.m25497C();
        }
        m25133s1();
        return InterfaceC5179i.f14328a.m25243a();
    }

    /* renamed from: u */
    public InterfaceC5179i mo25249u(int i) {
        m25181c1(i, null, false, null);
        m25197W();
        return this;
    }

    /* renamed from: v */
    public void mo25248v(int i, Object obj) {
        m25181c1(i, obj, false, null);
    }

    /* renamed from: w */
    public void mo25247w(Object obj) {
        m25142p1(obj);
    }

    /* renamed from: w0 */
    public final void m25125w0(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        if (!this.f14336C) {
            this.f14336C = true;
            try {
                interfaceC6097a.mo42214q();
                return;
            } finally {
                this.f14336C = false;
            }
        }
        C5210k.m25030r("Preparing a composition while composing is not supported".toString());
        throw new ExceptionsH();
    }

    /* renamed from: x */
    public void mo25246x() {
        m25181c1(C4906j.f13415H0, null, true, null);
        this.f14370q = true;
    }

    /* renamed from: y */
    public boolean mo25245y() {
        if (!mo25254p() && !this.f14377x && !this.f14375v) {
            RecomposeScopeImpl m25146o0 = m25146o0();
            if ((m25146o0 == null || m25146o0.m24871m()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public int mo25244z() {
        return this.f14344K;
    }
}
