package p132h6;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c;
import p057d6.C4746d;
import p057d6.InterfaceC4744b;
import p216l6.InterfaceC6984a;
import p445xc.InterfaceC12341a;

/* renamed from: h6.g */
/* loaded from: classes.dex */
public final class C5863g implements InterfaceC4744b<AbstractC2404c> {

    /* renamed from: a */
    private final InterfaceC12341a<InterfaceC6984a> f16294a;

    public C5863g(InterfaceC12341a<InterfaceC6984a> interfaceC12341a) {
        this.f16294a = interfaceC12341a;
    }

    /* renamed from: a */
    public static AbstractC2404c m22862a(InterfaceC6984a interfaceC6984a) {
        return (AbstractC2404c) C4746d.m26713c(AbstractC5862f.m22863a(interfaceC6984a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C5863g m22861b(InterfaceC12341a<InterfaceC6984a> interfaceC12341a) {
        return new C5863g(interfaceC12341a);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: c */
    public AbstractC2404c mo42226get() {
        return m22862a(this.f16294a.mo42226get());
    }
}
