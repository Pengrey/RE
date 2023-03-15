package p358t0;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import androidx.compose.p018ui.platform.C0812v0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p149i1.InterfaceC5991e;
import p149i1.ModifierLocalConsumer;
import p169j1.ModifiedFocusNode;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;

/* renamed from: t0.j */
/* loaded from: classes.dex */
public final class FocusModifier extends AbstractC0820x0 implements ModifierLocalConsumer {

    /* renamed from: A */
    public ModifiedFocusNode f26917A;

    /* renamed from: B */
    public InterfaceC5991e f26918B;

    /* renamed from: x */
    private EnumC10353v f26919x;

    /* renamed from: y */
    private ModifiedFocusNode f26920y;

    /* renamed from: z */
    private boolean f26921z;

    public /* synthetic */ FocusModifier(EnumC10353v enumC10353v, InterfaceC6108l interfaceC6108l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC10353v, (i & 2) != 0 ? C0812v0.m39497a() : interfaceC6108l);
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return ModifierLocalConsumer.C5989a.m22452a(this, interfaceC6108l);
    }

    /* renamed from: K */
    public void m8234K(InterfaceC5991e interfaceC5991e) {
        Intrinsics.isThisObjectNull(interfaceC5991e, "scope");
        m8224l(interfaceC5991e);
        m8225j(((Boolean) interfaceC5991e.mo22443t(C10335k.m8221c())).booleanValue());
        FocusProperties.m8198c(m8233b(), (InterfaceC10344p) interfaceC5991e.mo22443t(FocusProperties.m8199b()));
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return ModifierLocalConsumer.C5989a.m22450c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final ModifiedFocusNode m8233b() {
        ModifiedFocusNode modifiedFocusNode = this.f26917A;
        if (modifiedFocusNode != null) {
            return modifiedFocusNode;
        }
        Intrinsics.throwUninitPropException("focusNode");
        return null;
    }

    /* renamed from: c */
    public final EnumC10353v m8232c() {
        return this.f26919x;
    }

    /* renamed from: d */
    public final ModifiedFocusNode m8231d() {
        return this.f26920y;
    }

    /* renamed from: e */
    public final boolean m8230e() {
        return this.f26921z;
    }

    /* renamed from: f */
    public final InterfaceC5991e m8229f() {
        InterfaceC5991e interfaceC5991e = this.f26918B;
        if (interfaceC5991e != null) {
            return interfaceC5991e;
        }
        Intrinsics.throwUninitPropException("modifierLocalReadScope");
        return null;
    }

    /* renamed from: g */
    public final void m8228g(ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.isThisObjectNull(modifiedFocusNode, "<set-?>");
        this.f26917A = modifiedFocusNode;
    }

    /* renamed from: h */
    public final void m8227h(EnumC10353v enumC10353v) {
        Intrinsics.isThisObjectNull(enumC10353v, "<set-?>");
        this.f26919x = enumC10353v;
    }

    /* renamed from: i */
    public final void m8226i(ModifiedFocusNode modifiedFocusNode) {
        this.f26920y = modifiedFocusNode;
    }

    /* renamed from: j */
    public final void m8225j(boolean z) {
        this.f26921z = z;
    }

    /* renamed from: l */
    public final void m8224l(InterfaceC5991e interfaceC5991e) {
        Intrinsics.isThisObjectNull(interfaceC5991e, "<set-?>");
        this.f26918B = interfaceC5991e;
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return ModifierLocalConsumer.C5989a.m22451b(this, obj, interfaceC6112p);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return ModifierLocalConsumer.C5989a.m22449d(this, interfaceC9570f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusModifier(EnumC10353v enumC10353v, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        Intrinsics.isThisObjectNull(enumC10353v, "initialFocus");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        this.f26919x = enumC10353v;
    }
}
