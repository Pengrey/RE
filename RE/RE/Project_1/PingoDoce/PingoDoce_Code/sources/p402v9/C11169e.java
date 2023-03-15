package p402v9;

/* renamed from: v9.e */
/* loaded from: classes.dex */
public class C11169e implements InterfaceC11168d {

    /* renamed from: a */
    public final C11165a f28695a;

    /* renamed from: b */
    public final C11167c f28696b;

    /* renamed from: c */
    public final C11166b f28697c;

    /* renamed from: d */
    public final long f28698d;

    public C11169e(long j, C11165a c11165a, C11167c c11167c, C11166b c11166b, int i, int i2) {
        this.f28698d = j;
        this.f28695a = c11165a;
        this.f28696b = c11167c;
        this.f28697c = c11166b;
    }

    @Override // p402v9.InterfaceC11168d
    /* renamed from: a */
    public C11167c mo5834a() {
        return this.f28696b;
    }

    @Override // p402v9.InterfaceC11168d
    /* renamed from: b */
    public C11166b mo5833b() {
        return this.f28697c;
    }

    /* renamed from: c */
    public C11165a m5832c() {
        return this.f28695a;
    }

    /* renamed from: d */
    public long m5831d() {
        return this.f28698d;
    }

    /* renamed from: e */
    public boolean m5830e(long j) {
        return this.f28698d < j;
    }
}
