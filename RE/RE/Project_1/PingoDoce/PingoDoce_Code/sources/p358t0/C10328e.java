package p358t0;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p149i1.C5992f;
import p149i1.ModifierLocalProvider;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p358t0.FocusEventModifier;

/* compiled from: FocusEventModifier.kt */
/* renamed from: t0.e */
/* loaded from: classes.dex */
public final class C10328e extends AbstractC0820x0 implements FocusEventModifier, ModifierLocalProvider {

    /* renamed from: x */
    private final InterfaceC6108l f26912x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10328e(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        super(interfaceC6108l2);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onFocusEvent");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "inspectorInfo");
        this.f26912x = interfaceC6108l;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return FocusEventModifier.C10327a.m8255a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return FocusEventModifier.C10327a.m8253c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public Boolean mo41263getValue() {
        return Boolean.TRUE;
    }

    public C5992f getKey() {
        return C10335k.m8221c();
    }

    /* renamed from: j0 */
    public void m8250j0(InterfaceC10352u interfaceC10352u) {
        Intrinsics.isThisObjectNull(interfaceC10352u, "focusState");
        this.f26912x.mo9587d(interfaceC10352u);
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return FocusEventModifier.C10327a.m8254b(this, obj, interfaceC6112p);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return FocusEventModifier.C10327a.m8252d(this, interfaceC9570f);
    }
}
