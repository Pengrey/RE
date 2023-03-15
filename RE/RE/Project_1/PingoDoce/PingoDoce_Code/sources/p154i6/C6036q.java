package p154i6;

import android.content.Context;
import java.util.concurrent.Executor;
import p028b6.InterfaceC1825b;
import p057d6.InterfaceC4744b;
import p174j6.InterfaceC6311c;
import p174j6.InterfaceC6313d;
import p196k6.InterfaceC6601a;
import p216l6.InterfaceC6984a;
import p445xc.InterfaceC12341a;

/* renamed from: i6.q */
/* loaded from: classes.dex */
public final class C6036q implements InterfaceC4744b<C6035p> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f16671a;

    /* renamed from: b */
    private final InterfaceC12341a<InterfaceC1825b> f16672b;

    /* renamed from: c */
    private final InterfaceC12341a<InterfaceC6313d> f16673c;

    /* renamed from: d */
    private final InterfaceC12341a<InterfaceC6041v> f16674d;

    /* renamed from: e */
    private final InterfaceC12341a<Executor> f16675e;

    /* renamed from: f */
    private final InterfaceC12341a<InterfaceC6601a> f16676f;

    /* renamed from: g */
    private final InterfaceC12341a<InterfaceC6984a> f16677g;

    /* renamed from: h */
    private final InterfaceC12341a<InterfaceC6984a> f16678h;

    /* renamed from: i */
    private final InterfaceC12341a<InterfaceC6311c> f16679i;

    public C6036q(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<InterfaceC1825b> interfaceC12341a2, InterfaceC12341a<InterfaceC6313d> interfaceC12341a3, InterfaceC12341a<InterfaceC6041v> interfaceC12341a4, InterfaceC12341a<Executor> interfaceC12341a5, InterfaceC12341a<InterfaceC6601a> interfaceC12341a6, InterfaceC12341a<InterfaceC6984a> interfaceC12341a7, InterfaceC12341a<InterfaceC6984a> interfaceC12341a8, InterfaceC12341a<InterfaceC6311c> interfaceC12341a9) {
        this.f16671a = interfaceC12341a;
        this.f16672b = interfaceC12341a2;
        this.f16673c = interfaceC12341a3;
        this.f16674d = interfaceC12341a4;
        this.f16675e = interfaceC12341a5;
        this.f16676f = interfaceC12341a6;
        this.f16677g = interfaceC12341a7;
        this.f16678h = interfaceC12341a8;
        this.f16679i = interfaceC12341a9;
    }

    /* renamed from: a */
    public static C6036q m22321a(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<InterfaceC1825b> interfaceC12341a2, InterfaceC12341a<InterfaceC6313d> interfaceC12341a3, InterfaceC12341a<InterfaceC6041v> interfaceC12341a4, InterfaceC12341a<Executor> interfaceC12341a5, InterfaceC12341a<InterfaceC6601a> interfaceC12341a6, InterfaceC12341a<InterfaceC6984a> interfaceC12341a7, InterfaceC12341a<InterfaceC6984a> interfaceC12341a8, InterfaceC12341a<InterfaceC6311c> interfaceC12341a9) {
        return new C6036q(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9);
    }

    /* renamed from: c */
    public static C6035p m22319c(Context context, InterfaceC1825b interfaceC1825b, InterfaceC6313d interfaceC6313d, InterfaceC6041v interfaceC6041v, Executor executor, InterfaceC6601a interfaceC6601a, InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2, InterfaceC6311c interfaceC6311c) {
        return new C6035p(context, interfaceC1825b, interfaceC6313d, interfaceC6041v, executor, interfaceC6601a, interfaceC6984a, interfaceC6984a2, interfaceC6311c);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C6035p mo42226get() {
        return m22319c(this.f16671a.mo42226get(), this.f16672b.mo42226get(), this.f16673c.mo42226get(), this.f16674d.mo42226get(), this.f16675e.mo42226get(), this.f16676f.mo42226get(), this.f16677g.mo42226get(), this.f16678h.mo42226get(), this.f16679i.mo42226get());
    }
}
