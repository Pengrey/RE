package p393v0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: GraphicsLayerModifier.kt */
/* renamed from: v0.f0 */
/* loaded from: classes.dex */
public final class C11015f0 {

    /* compiled from: InspectableValue.kt */
    /* renamed from: v0.f0$a */
    /* loaded from: classes.dex */
    public static final class C11016a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f28351w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11016a(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f28351w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m6526a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("graphicsLayer");
            c0816w0.m39492a().m39649b("block", this.f28351w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m6526a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: v0.f0$b */
    /* loaded from: classes.dex */
    public static final class C11017b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ float f28352A;

        /* renamed from: B */
        final /* synthetic */ float f28353B;

        /* renamed from: C */
        final /* synthetic */ float f28354C;

        /* renamed from: D */
        final /* synthetic */ float f28355D;

        /* renamed from: E */
        final /* synthetic */ float f28356E;

        /* renamed from: F */
        final /* synthetic */ float f28357F;

        /* renamed from: G */
        final /* synthetic */ long f28358G;

        /* renamed from: H */
        final /* synthetic */ InterfaceC11001b1 f28359H;

        /* renamed from: I */
        final /* synthetic */ boolean f28360I;

        /* renamed from: J */
        final /* synthetic */ AbstractC11073x0 f28361J;

        /* renamed from: w */
        final /* synthetic */ float f28362w;

        /* renamed from: x */
        final /* synthetic */ float f28363x;

        /* renamed from: y */
        final /* synthetic */ float f28364y;

        /* renamed from: z */
        final /* synthetic */ float f28365z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11017b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11001b1 interfaceC11001b1, boolean z, AbstractC11073x0 abstractC11073x0) {
            super(1);
            this.f28362w = f;
            this.f28363x = f2;
            this.f28364y = f3;
            this.f28365z = f4;
            this.f28352A = f5;
            this.f28353B = f6;
            this.f28354C = f7;
            this.f28355D = f8;
            this.f28356E = f9;
            this.f28357F = f10;
            this.f28358G = j;
            this.f28359H = interfaceC11001b1;
            this.f28360I = z;
        }

        /* renamed from: a */
        public final void m6525a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("graphicsLayer");
            c0816w0.m39492a().m39649b("scaleX", Float.valueOf(this.f28362w));
            c0816w0.m39492a().m39649b("scaleY", Float.valueOf(this.f28363x));
            c0816w0.m39492a().m39649b("alpha", Float.valueOf(this.f28364y));
            c0816w0.m39492a().m39649b("translationX", Float.valueOf(this.f28365z));
            c0816w0.m39492a().m39649b("translationY", Float.valueOf(this.f28352A));
            c0816w0.m39492a().m39649b("shadowElevation", Float.valueOf(this.f28353B));
            c0816w0.m39492a().m39649b("rotationX", Float.valueOf(this.f28354C));
            c0816w0.m39492a().m39649b("rotationY", Float.valueOf(this.f28355D));
            c0816w0.m39492a().m39649b("rotationZ", Float.valueOf(this.f28356E));
            c0816w0.m39492a().m39649b("cameraDistance", Float.valueOf(this.f28357F));
            c0816w0.m39492a().m39649b("transformOrigin", C11022g1.m6489b(this.f28358G));
            c0816w0.m39492a().m39649b("shape", this.f28359H);
            c0816w0.m39492a().m39649b("clip", Boolean.valueOf(this.f28360I));
            c0816w0.m39492a().m39649b("renderEffect", this.f28361J);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m6525a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m6530a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "block");
        return interfaceC9570f.mo7205u(new C11054r(interfaceC6108l, C0812v0.m39495c() ? new C11016a(interfaceC6108l) : C0812v0.m39497a()));
    }

    /* renamed from: b */
    public static final InterfaceC9570f m6529b(InterfaceC9570f interfaceC9570f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11001b1 interfaceC11001b1, boolean z, AbstractC11073x0 abstractC11073x0) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$graphicsLayer");
        Intrinsics.isThisObjectNull(interfaceC11001b1, "shape");
        return interfaceC9570f.mo7205u(new GraphicsLayerModifier(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, interfaceC11001b1, z, abstractC11073x0, C0812v0.m39495c() ? new C11017b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, interfaceC11001b1, z, abstractC11073x0) : C0812v0.m39497a(), null));
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC9570f m6528c(InterfaceC9570f interfaceC9570f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11001b1 interfaceC11001b1, boolean z, AbstractC11073x0 abstractC11073x0, int i, Object obj) {
        return m6529b(interfaceC9570f, (i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) == 0 ? f3 : 1.0f, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.0f : f8, (i & 256) == 0 ? f9 : 0.0f, (i & 512) != 0 ? 8.0f : f10, (i & 1024) != 0 ? C11022g1.f28371b.m6480a() : j, (i & 2048) != 0 ? RectangleShape.m6240a() : interfaceC11001b1, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? null : abstractC11073x0);
    }

    /* renamed from: d */
    public static final InterfaceC9570f m6527d(InterfaceC9570f interfaceC9570f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return C0812v0.m39495c() ? interfaceC9570f.mo7205u(m6528c(InterfaceC9570f.f25164r, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 16383, null)) : interfaceC9570f;
    }
}
