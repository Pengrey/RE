package p432x;

import id.InterfaceC6097a;
import id.InterfaceC6112p;
import p092f0.InterfaceC5179i;
import p127h1.InterfaceC5795l0;
import p127h1.InterfaceC5805t;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13599b;

/* renamed from: x.g */
/* loaded from: classes.dex */
public final class LazyLayout {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayout.kt */
    /* renamed from: x.g$a */
    /* loaded from: classes.dex */
    public static final class C12218a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ LazyLayoutItemContentFactory f32225w;

        /* renamed from: x */
        final /* synthetic */ LazyLayoutState f32226x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC12232r f32227y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12218a(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutState lazyLayoutState, InterfaceC12232r interfaceC12232r) {
            super(2);
            this.f32225w = lazyLayoutItemContentFactory;
            this.f32226x = lazyLayoutState;
            this.f32227y = interfaceC12232r;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m3371a((InterfaceC5795l0) obj, ((C13599b) obj2).m911s());
        }

        /* renamed from: a */
        public final InterfaceC5805t m3371a(InterfaceC5795l0 interfaceC5795l0, long j) {
            Intrinsics.isThisObjectNull(interfaceC5795l0, "$this$SubcomposeLayout");
            this.f32225w.m3384e(interfaceC5795l0, j);
            LazyMeasurePolicy lazyMeasurePolicy = new LazyMeasurePolicy((InterfaceC12217f) this.f32226x.m3339b().mo42214q(), this.f32225w, interfaceC5795l0);
            InterfaceC12220h mo3324a = this.f32227y.mo3324a(interfaceC5795l0, lazyMeasurePolicy, j);
            InterfaceC12221i m3337d = this.f32226x.m3337d();
            if (m3337d != null) {
                m3337d.mo3367d(mo3324a, lazyMeasurePolicy);
            }
            this.f32226x.m3338c().setValue(mo3324a);
            this.f32226x.m3333h(mo3324a);
            return mo3324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayout.kt */
    /* renamed from: x.g$b */
    /* loaded from: classes.dex */
    public static final class C12219b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC12232r f32228A;

        /* renamed from: B */
        final /* synthetic */ int f32229B;

        /* renamed from: C */
        final /* synthetic */ int f32230C;

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f32231w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f32232x;

        /* renamed from: y */
        final /* synthetic */ LazyLayoutState f32233y;

        /* renamed from: z */
        final /* synthetic */ C12222l f32234z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12219b(InterfaceC6097a interfaceC6097a, InterfaceC9570f interfaceC9570f, LazyLayoutState lazyLayoutState, C12222l c12222l, InterfaceC12232r interfaceC12232r, int i, int i2) {
            super(2);
            this.f32231w = interfaceC6097a;
            this.f32232x = interfaceC9570f;
            this.f32233y = lazyLayoutState;
            this.f32234z = c12222l;
            this.f32228A = interfaceC12232r;
            this.f32229B = i;
            this.f32230C = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m3369a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m3369a(InterfaceC5179i interfaceC5179i, int i) {
            LazyLayout.m3373a(this.f32231w, this.f32232x, this.f32233y, this.f32234z, this.f32228A, interfaceC5179i, this.f32229B | 1, this.f32230C);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m3373a(id.InterfaceC6097a r15, p302q0.InterfaceC9570f r16, p432x.LazyLayoutState r17, p432x.C12222l r18, p432x.InterfaceC12232r r19, p092f0.InterfaceC5179i r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p432x.LazyLayout.m3373a(id.a, q0.f, x.p, x.l, x.r, f0.i, int, int):void");
    }
}
