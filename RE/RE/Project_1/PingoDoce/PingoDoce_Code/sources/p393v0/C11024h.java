package p393v0;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: AndroidPaint.android.kt */
/* renamed from: v0.h */
/* loaded from: classes.dex */
public final class C11024h implements InterfaceC11046o0 {

    /* renamed from: a */
    private Paint f28374a = C11028i.m6467i();

    /* renamed from: b */
    private int f28375b = C11047p.f28401a.m6351B();

    /* renamed from: c */
    private Shader f28376c;

    /* renamed from: d */
    private ColorFilter f28377d;

    /* renamed from: e */
    private InterfaceC11056r0 f28378e;

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: a */
    public long mo6408a() {
        return C11028i.m6473c(this.f28374a);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: b */
    public int mo6407b() {
        return C11028i.m6470f(this.f28374a);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: c */
    public void mo6406c(float f) {
        C11028i.m6466j(this.f28374a, f);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: d */
    public void mo6405d(int i) {
        C11028i.m6462n(this.f28374a, i);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: e */
    public void mo6404e(ColorFilter colorFilter) {
        this.f28377d = colorFilter;
        C11028i.m6463m(this.f28374a, colorFilter);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: f */
    public int mo6403f() {
        return C11028i.m6472d(this.f28374a);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: g */
    public void mo6402g(InterfaceC11056r0 interfaceC11056r0) {
        C11028i.m6461o(this.f28374a, interfaceC11056r0);
        this.f28378e = interfaceC11056r0;
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: h */
    public int mo6401h() {
        return C11028i.m6471e(this.f28374a);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: i */
    public void mo6400i(int i) {
        C11028i.m6459q(this.f28374a, i);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: j */
    public void mo6399j(int i) {
        C11028i.m6458r(this.f28374a, i);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: k */
    public float mo6398k() {
        return C11028i.m6474b(this.f28374a);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: l */
    public void mo6397l(int i) {
        C11028i.m6455u(this.f28374a, i);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: m */
    public void mo6396m(int i) {
        this.f28375b = i;
        C11028i.m6465k(this.f28374a, i);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: n */
    public float mo6395n() {
        return C11028i.m6469g(this.f28374a);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: o */
    public void mo6394o(long j) {
        C11028i.m6464l(this.f28374a, j);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: p */
    public ColorFilter mo6393p() {
        return this.f28377d;
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: q */
    public InterfaceC11056r0 mo6392q() {
        return this.f28378e;
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: r */
    public Paint mo6391r() {
        return this.f28374a;
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: s */
    public void mo6390s(Shader shader) {
        this.f28376c = shader;
        C11028i.m6460p(this.f28374a, shader);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: t */
    public Shader mo6389t() {
        return this.f28376c;
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: u */
    public void mo6388u(float f) {
        C11028i.m6456t(this.f28374a, f);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: v */
    public void mo6387v(float f) {
        C11028i.m6457s(this.f28374a, f);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: w */
    public float mo6386w() {
        return C11028i.m6468h(this.f28374a);
    }

    @Override // p393v0.InterfaceC11046o0
    /* renamed from: x */
    public int mo6385x() {
        return this.f28375b;
    }
}
