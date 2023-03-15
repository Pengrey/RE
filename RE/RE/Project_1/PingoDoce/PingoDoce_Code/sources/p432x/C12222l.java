package p432x;

import p468yc.C13195u;
import p479z1.C13601c;

/* renamed from: x.l */
/* loaded from: classes.dex */
public final class C12222l {

    /* renamed from: a */
    private InterfaceC12223a f32241a;

    /* renamed from: b */
    private long f32242b = C13601c.m906b(0, 0, 0, 0, 15, null);

    /* compiled from: LazyLayoutPrefetchPolicy.kt */
    /* renamed from: x.l$a */
    /* loaded from: classes.dex */
    public interface InterfaceC12223a {
        /* renamed from: c */
        void mo3358c(int i);

        /* renamed from: f */
        void mo3357f(int i);
    }

    /* renamed from: a */
    public final long m3363a() {
        return this.f32242b;
    }

    /* renamed from: b */
    public final C13195u m3362b(int i) {
        InterfaceC12223a interfaceC12223a = this.f32241a;
        if (interfaceC12223a == null) {
            return null;
        }
        interfaceC12223a.mo3358c(i);
        return C13195u.f34156a;
    }

    /* renamed from: c */
    public final C13195u m3361c(int i) {
        InterfaceC12223a interfaceC12223a = this.f32241a;
        if (interfaceC12223a == null) {
            return null;
        }
        interfaceC12223a.mo3357f(i);
        return C13195u.f34156a;
    }

    /* renamed from: d */
    public final void m3360d(long j) {
        this.f32242b = j;
    }

    /* renamed from: e */
    public final void m3359e(InterfaceC12223a interfaceC12223a) {
        this.f32241a = interfaceC12223a;
    }
}
