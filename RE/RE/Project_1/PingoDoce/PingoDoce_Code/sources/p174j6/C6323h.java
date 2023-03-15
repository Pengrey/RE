package p174j6;

import android.content.Context;
import p057d6.C4746d;
import p057d6.InterfaceC4744b;
import p445xc.InterfaceC12341a;

/* renamed from: j6.h */
/* loaded from: classes.dex */
public final class C6323h implements InterfaceC4744b<String> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f17336a;

    public C6323h(InterfaceC12341a<Context> interfaceC12341a) {
        this.f17336a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C6323h m21253a(InterfaceC12341a<Context> interfaceC12341a) {
        return new C6323h(interfaceC12341a);
    }

    /* renamed from: c */
    public static String m21251c(Context context) {
        return (String) C4746d.m26713c(AbstractC6318f.m21260b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public String mo42226get() {
        return m21251c(this.f17336a.mo42226get());
    }
}
