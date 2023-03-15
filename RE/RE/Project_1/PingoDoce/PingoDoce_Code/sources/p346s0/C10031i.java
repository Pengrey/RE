package p346s0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p127h1.InterfaceC5753d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p393v0.ColorFilter;
import p456y0.Painter;
import p468yc.C13195u;

/* compiled from: PainterModifier.kt */
/* renamed from: s0.i */
/* loaded from: classes.dex */
public final class C10031i {

    /* compiled from: InspectableValue.kt */
    /* renamed from: s0.i$a */
    /* loaded from: classes.dex */
    public static final class C10032a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ float f26221A;

        /* renamed from: B */
        final /* synthetic */ ColorFilter f26222B;

        /* renamed from: w */
        final /* synthetic */ Painter f26223w;

        /* renamed from: x */
        final /* synthetic */ boolean f26224x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC9560a f26225y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC5753d f26226z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10032a(Painter painter, boolean z, InterfaceC9560a interfaceC9560a, InterfaceC5753d interfaceC5753d, float f, ColorFilter colorFilter) {
            super(1);
            this.f26223w = painter;
            this.f26224x = z;
            this.f26225y = interfaceC9560a;
            this.f26226z = interfaceC5753d;
            this.f26221A = f;
            this.f26222B = colorFilter;
        }

        /* renamed from: a */
        public final void m9354a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("paint");
            c0816w0.m39492a().m39649b("painter", this.f26223w);
            c0816w0.m39492a().m39649b("sizeToIntrinsics", Boolean.valueOf(this.f26224x));
            c0816w0.m39492a().m39649b("alignment", this.f26225y);
            c0816w0.m39492a().m39649b("contentScale", this.f26226z);
            c0816w0.m39492a().m39649b("alpha", Float.valueOf(this.f26221A));
            c0816w0.m39492a().m39649b("colorFilter", this.f26222B);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9354a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m9356a(InterfaceC9570f interfaceC9570f, Painter painter, boolean z, InterfaceC9560a interfaceC9560a, InterfaceC5753d interfaceC5753d, float f, ColorFilter colorFilter) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(painter, "painter");
        Intrinsics.isThisObjectNull(interfaceC9560a, "alignment");
        Intrinsics.isThisObjectNull(interfaceC5753d, "contentScale");
        return interfaceC9570f.mo7205u(new PainterModifier(painter, z, interfaceC9560a, interfaceC5753d, f, colorFilter, C0812v0.m39495c() ? new C10032a(painter, z, interfaceC9560a, interfaceC5753d, f, colorFilter) : C0812v0.m39497a()));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9570f m9355b(InterfaceC9570f interfaceC9570f, Painter painter, boolean z, InterfaceC9560a interfaceC9560a, InterfaceC5753d interfaceC5753d, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            interfaceC9560a = InterfaceC9560a.f25145a.m10595a();
        }
        InterfaceC9560a interfaceC9560a2 = interfaceC9560a;
        if ((i & 8) != 0) {
            interfaceC5753d = InterfaceC5753d.f16069a.m23143b();
        }
        InterfaceC5753d interfaceC5753d2 = interfaceC5753d;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            colorFilter = null;
        }
        return m9356a(interfaceC9570f, painter, z2, interfaceC9560a2, interfaceC5753d2, f2, colorFilter);
    }
}
