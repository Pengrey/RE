package p007a6;

import p057d6.InterfaceC4744b;
import p132h6.InterfaceC5861e;
import p154i6.C6035p;
import p154i6.C6039t;
import p216l6.InterfaceC6984a;
import p445xc.InterfaceC12341a;

/* renamed from: a6.v */
/* loaded from: classes.dex */
public final class C0065v implements InterfaceC4744b<C0062t> {

    /* renamed from: a */
    private final InterfaceC12341a<InterfaceC6984a> f173a;

    /* renamed from: b */
    private final InterfaceC12341a<InterfaceC6984a> f174b;

    /* renamed from: c */
    private final InterfaceC12341a<InterfaceC5861e> f175c;

    /* renamed from: d */
    private final InterfaceC12341a<C6035p> f176d;

    /* renamed from: e */
    private final InterfaceC12341a<C6039t> f177e;

    public C0065v(InterfaceC12341a<InterfaceC6984a> interfaceC12341a, InterfaceC12341a<InterfaceC6984a> interfaceC12341a2, InterfaceC12341a<InterfaceC5861e> interfaceC12341a3, InterfaceC12341a<C6035p> interfaceC12341a4, InterfaceC12341a<C6039t> interfaceC12341a5) {
        this.f173a = interfaceC12341a;
        this.f174b = interfaceC12341a2;
        this.f175c = interfaceC12341a3;
        this.f176d = interfaceC12341a4;
        this.f177e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C0065v m42023a(InterfaceC12341a<InterfaceC6984a> interfaceC12341a, InterfaceC12341a<InterfaceC6984a> interfaceC12341a2, InterfaceC12341a<InterfaceC5861e> interfaceC12341a3, InterfaceC12341a<C6035p> interfaceC12341a4, InterfaceC12341a<C6039t> interfaceC12341a5) {
        return new C0065v(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static C0062t m42021c(InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2, InterfaceC5861e interfaceC5861e, C6035p c6035p, C6039t c6039t) {
        return new C0062t(interfaceC6984a, interfaceC6984a2, interfaceC5861e, c6035p, c6039t);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C0062t mo42226get() {
        return m42021c(this.f173a.mo42226get(), this.f174b.mo42226get(), this.f175c.mo42226get(), this.f176d.mo42226get(), this.f177e.mo42226get());
    }
}
