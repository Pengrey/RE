package p357t;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p393v0.Color;
import p393v0.InterfaceC11001b1;
import p393v0.RectangleShape;
import p468yc.C13195u;

/* compiled from: Background.kt */
/* renamed from: t.b */
/* loaded from: classes.dex */
public final class C10255b {

    /* compiled from: InspectableValue.kt */
    /* renamed from: t.b$a */
    /* loaded from: classes.dex */
    public static final class C10256a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ long f26716w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC11001b1 f26717x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10256a(long j, InterfaceC11001b1 interfaceC11001b1) {
            super(1);
            this.f26716w = j;
            this.f26717x = interfaceC11001b1;
        }

        /* renamed from: a */
        public final void m8381a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("background");
            c0816w0.m39490c(Color.m6652h(this.f26716w));
            c0816w0.m39492a().m39649b("color", Color.m6652h(this.f26716w));
            c0816w0.m39492a().m39649b("shape", this.f26717x);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8381a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m8383a(InterfaceC9570f interfaceC9570f, long j, InterfaceC11001b1 interfaceC11001b1) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$background");
        Intrinsics.isThisObjectNull(interfaceC11001b1, "shape");
        return interfaceC9570f.mo7205u(new Background(Color.m6652h(j), null, 0.0f, interfaceC11001b1, C0812v0.m39495c() ? new C10256a(j, interfaceC11001b1) : C0812v0.m39497a(), 6, null));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9570f m8382b(InterfaceC9570f interfaceC9570f, long j, InterfaceC11001b1 interfaceC11001b1, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11001b1 = RectangleShape.m6240a();
        }
        return m8383a(interfaceC9570f, j, interfaceC11001b1);
    }
}
