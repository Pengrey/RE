package p132h6;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c;
import p057d6.C4746d;
import p057d6.InterfaceC4744b;
import p154i6.InterfaceC6041v;
import p174j6.InterfaceC6313d;
import p216l6.InterfaceC6984a;
import p445xc.InterfaceC12341a;

/* renamed from: h6.i */
/* loaded from: classes.dex */
public final class C5865i implements InterfaceC4744b<InterfaceC6041v> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f16295a;

    /* renamed from: b */
    private final InterfaceC12341a<InterfaceC6313d> f16296b;

    /* renamed from: c */
    private final InterfaceC12341a<AbstractC2404c> f16297c;

    /* renamed from: d */
    private final InterfaceC12341a<InterfaceC6984a> f16298d;

    public C5865i(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<InterfaceC6313d> interfaceC12341a2, InterfaceC12341a<AbstractC2404c> interfaceC12341a3, InterfaceC12341a<InterfaceC6984a> interfaceC12341a4) {
        this.f16295a = interfaceC12341a;
        this.f16296b = interfaceC12341a2;
        this.f16297c = interfaceC12341a3;
        this.f16298d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C5865i m22858a(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<InterfaceC6313d> interfaceC12341a2, InterfaceC12341a<AbstractC2404c> interfaceC12341a3, InterfaceC12341a<InterfaceC6984a> interfaceC12341a4) {
        return new C5865i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static InterfaceC6041v m22856c(Context context, InterfaceC6313d interfaceC6313d, AbstractC2404c abstractC2404c, InterfaceC6984a interfaceC6984a) {
        return (InterfaceC6041v) C4746d.m26713c(AbstractC5864h.m22859a(context, interfaceC6313d, abstractC2404c, interfaceC6984a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public InterfaceC6041v mo42226get() {
        return m22856c(this.f16295a.mo42226get(), this.f16296b.mo42226get(), this.f16297c.mo42226get(), this.f16298d.mo42226get());
    }
}
