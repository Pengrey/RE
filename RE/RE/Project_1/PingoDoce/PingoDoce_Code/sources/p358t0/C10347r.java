package p358t0;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p149i1.C5992f;
import p149i1.InterfaceC5991e;
import p149i1.ModifierLocalConsumer;
import p149i1.ModifierLocalProvider;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;

/* compiled from: FocusProperties.kt */
/* renamed from: t0.r */
/* loaded from: classes.dex */
public final class C10347r extends AbstractC0820x0 implements ModifierLocalConsumer, ModifierLocalProvider {

    /* renamed from: x */
    private final InterfaceC6108l f26938x;

    /* renamed from: y */
    private InterfaceC10344p f26939y;

    /* renamed from: z */
    private final C5992f f26940z;

    /* compiled from: FocusProperties.kt */
    /* renamed from: t0.r$a */
    /* loaded from: classes.dex */
    public static final class C10348a implements InterfaceC10344p {

        /* renamed from: a */
        private boolean f26941a = C10321a.f26897a.mo8202a();

        C10348a() {
        }

        /* renamed from: a */
        public boolean mo8202a() {
            return this.f26941a;
        }

        /* renamed from: b */
        public void mo8201b(boolean z) {
            this.f26941a = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10347r(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        super(interfaceC6108l2);
        Intrinsics.isThisObjectNull(interfaceC6108l, "focusPropertiesScope");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "inspectorInfo");
        this.f26938x = interfaceC6108l;
        this.f26940z = FocusProperties.m8199b();
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return ModifierLocalConsumer.C5989a.m22452a(this, interfaceC6108l);
    }

    /* renamed from: K */
    public void m8195K(InterfaceC5991e interfaceC5991e) {
        Intrinsics.isThisObjectNull(interfaceC5991e, "scope");
        this.f26939y = (InterfaceC10344p) interfaceC5991e.mo22443t(FocusProperties.m8199b());
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return ModifierLocalConsumer.C5989a.m22450c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public InterfaceC10344p mo41263getValue() {
        C10348a c10348a = new C10348a();
        this.f26938x.mo9587d(c10348a);
        InterfaceC10344p interfaceC10344p = this.f26939y;
        if (interfaceC10344p != null && !Intrinsics.equals(interfaceC10344p, C10321a.f26897a)) {
            c10348a.mo8201b(interfaceC10344p.mo8202a());
        }
        return c10348a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10347r) && Intrinsics.equals(this.f26938x, ((C10347r) obj).f26938x);
    }

    public C5992f getKey() {
        return this.f26940z;
    }

    public int hashCode() {
        return this.f26938x.hashCode();
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return ModifierLocalConsumer.C5989a.m22451b(this, obj, interfaceC6112p);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return ModifierLocalConsumer.C5989a.m22449d(this, interfaceC9570f);
    }
}
