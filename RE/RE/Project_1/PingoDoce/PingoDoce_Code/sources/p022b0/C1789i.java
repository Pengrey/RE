package p022b0;

import id.InterfaceC6108l;
import p036c0.InterfaceC1962d;
import p127h1.InterfaceC5776j;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p286p1.C8392u;
import p373u0.C10774f;
import p393v0.Color;
import p468yc.C13195u;

/* compiled from: CoreText.kt */
/* renamed from: b0.i */
/* loaded from: classes.dex */
public final class C1789i {

    /* renamed from: a */
    private TextDelegate f5472a;

    /* renamed from: b */
    private final long f5473b;

    /* renamed from: c */
    private InterfaceC6108l f5474c;

    /* renamed from: d */
    private InterfaceC1962d f5475d;

    /* renamed from: e */
    private InterfaceC5776j f5476e;

    /* renamed from: f */
    private C8392u f5477f;

    /* renamed from: g */
    private long f5478g;

    /* renamed from: h */
    private long f5479h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreText.kt */
    /* renamed from: b0.i$a */
    /* loaded from: classes.dex */
    public static final class C1790a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C1790a f5480w = new C1790a();

        C1790a() {
            super(1);
        }

        /* renamed from: a */
        public final void m35349a(C8392u c8392u) {
            Intrinsics.isThisObjectNull(c8392u, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35349a((C8392u) obj);
            return C13195u.f34156a;
        }
    }

    public C1789i(TextDelegate textDelegate, long j) {
        Intrinsics.isThisObjectNull(textDelegate, "textDelegate");
        this.f5472a = textDelegate;
        this.f5473b = j;
        this.f5474c = C1790a.f5480w;
        this.f5478g = C10774f.f27866b.m7134c();
        this.f5479h = Color.f28297b.m6632f();
    }

    /* renamed from: a */
    public final InterfaceC5776j m35363a() {
        return this.f5476e;
    }

    /* renamed from: b */
    public final C8392u m35362b() {
        return this.f5477f;
    }

    /* renamed from: c */
    public final InterfaceC6108l m35361c() {
        return this.f5474c;
    }

    /* renamed from: d */
    public final long m35360d() {
        return this.f5478g;
    }

    /* renamed from: e */
    public final InterfaceC1962d m35359e() {
        return this.f5475d;
    }

    /* renamed from: f */
    public final long m35358f() {
        return this.f5473b;
    }

    /* renamed from: g */
    public final TextDelegate m35357g() {
        return this.f5472a;
    }

    /* renamed from: h */
    public final void m35356h(InterfaceC5776j interfaceC5776j) {
        this.f5476e = interfaceC5776j;
    }

    /* renamed from: i */
    public final void m35355i(C8392u c8392u) {
        this.f5477f = c8392u;
    }

    /* renamed from: j */
    public final void m35354j(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "<set-?>");
        this.f5474c = interfaceC6108l;
    }

    /* renamed from: k */
    public final void m35353k(long j) {
        this.f5478g = j;
    }

    /* renamed from: l */
    public final void m35352l(InterfaceC1962d interfaceC1962d) {
        this.f5475d = interfaceC1962d;
    }

    /* renamed from: m */
    public final void m35351m(long j) {
        this.f5479h = j;
    }

    /* renamed from: n */
    public final void m35350n(TextDelegate textDelegate) {
        Intrinsics.isThisObjectNull(textDelegate, "<set-?>");
        this.f5472a = textDelegate;
    }
}
