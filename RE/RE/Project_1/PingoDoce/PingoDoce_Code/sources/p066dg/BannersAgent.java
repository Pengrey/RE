package p066dg;

import bd.InterfaceC1886d;
import cd.C2116d;
import eg.AbstractC5067d;
import gg.C5649a;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Banner;
import tg.C10618a;
import vg.BannerService;

/* renamed from: dg.b */
/* loaded from: classes2.dex */
public final class BannersAgent extends AbstractC5067d {

    /* renamed from: e */
    private final BannerService f13125e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannersAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.BannersAgent", m20196f = "BannersAgent.kt", m20195l = {21, 22, 28, 29}, m20194m = "dismissBanner")
    /* renamed from: dg.b$a */
    /* loaded from: classes2.dex */
    public static final class C4795a extends AbstractC6757d {

        /* renamed from: B */
        int f13127B;

        /* renamed from: w */
        Object f13128w;

        /* renamed from: x */
        Object f13129x;

        /* renamed from: y */
        int f13130y;

        /* renamed from: z */
        /* synthetic */ Object f13131z;

        C4795a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13131z = obj;
            this.f13127B |= Integer.MIN_VALUE;
            return BannersAgent.this.m26583o(null, 0, this);
        }
    }

    /* compiled from: BannersAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.BannersAgent$getFromNetwork$1", m20196f = "BannersAgent.kt", m20195l = {18}, m20194m = "invokeSuspend")
    /* renamed from: dg.b$b */
    /* loaded from: classes2.dex */
    static final class C4796b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13132x;

        /* renamed from: y */
        /* synthetic */ Object f13133y;

        C4796b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C4796b c4796b = new C4796b(interfaceC1886d);
            c4796b.f13133y = obj;
            return c4796b;
        }

        /* renamed from: d */
        public final Object mo39856d(C10618a c10618a, InterfaceC1886d interfaceC1886d) {
            return ((C4796b) create(c10618a, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13132x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BannerService m26584n = BannersAgent.m26584n(BannersAgent.this);
                int m7485a = ((C10618a) this.f13133y).m7485a();
                this.f13132x = 1;
                obj = m26584n.m5591n(m7485a, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersAgent(BannerService bannerService, C5649a c5649a) {
        super(c5649a);
        Intrinsics.isThisObjectNull(bannerService, "service");
        Intrinsics.isThisObjectNull(c5649a, "localDataProvider");
        this.f13125e = bannerService;
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m26585m(int i, Banner banner) {
        return m26582p(i, banner);
    }

    /* renamed from: n */
    public static final /* synthetic */ BannerService m26584n(BannersAgent bannersAgent) {
        return bannersAgent.f13125e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final boolean m26582p(int i, Banner banner) {
        Intrinsics.isThisObjectNull(banner, "it");
        return banner.m13950h() == i;
    }

    /* renamed from: h */
    public InterfaceC6112p m26586h() {
        return new C4796b(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[RETURN] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26583o(tg.C10618a r9, int r10, bd.InterfaceC1886d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p066dg.BannersAgent.C4795a
            if (r0 == 0) goto L13
            r0 = r11
            dg.b$a r0 = (p066dg.BannersAgent.C4795a) r0
            int r1 = r0.f13127B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13127B = r1
            goto L18
        L13:
            dg.b$a r0 = new dg.b$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f13131z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13127B
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L63
            if (r2 == r6) goto L55
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            p468yc.C13186n.m1453b(r11)
            goto Lb5
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.Object r9 = r0.f13129x
            tg.a r9 = (tg.C10618a) r9
            java.lang.Object r10 = r0.f13128w
            dg.b r10 = (p066dg.BannersAgent) r10
            p468yc.C13186n.m1453b(r11)
            goto La7
        L47:
            int r9 = r0.f13130y
            java.lang.Object r10 = r0.f13129x
            tg.a r10 = (tg.C10618a) r10
            java.lang.Object r2 = r0.f13128w
            dg.b r2 = (p066dg.BannersAgent) r2
            p468yc.C13186n.m1453b(r11)
            goto L8a
        L55:
            int r10 = r0.f13130y
            java.lang.Object r9 = r0.f13129x
            tg.a r9 = (tg.C10618a) r9
            java.lang.Object r2 = r0.f13128w
            dg.b r2 = (p066dg.BannersAgent) r2
            p468yc.C13186n.m1453b(r11)
            goto L78
        L63:
            p468yc.C13186n.m1453b(r11)
            vg.c r11 = r8.f13125e
            r0.f13128w = r8
            r0.f13129x = r9
            r0.f13130y = r10
            r0.f13127B = r6
            java.lang.Object r11 = r11.m5592m(r10, r0)
            if (r11 != r1) goto L77
            return r1
        L77:
            r2 = r8
        L78:
            r0.f13128w = r2
            r0.f13129x = r9
            r0.f13130y = r10
            r0.f13127B = r5
            java.lang.Object r11 = r2.m25752d(r9, r0)
            if (r11 != r1) goto L87
            return r1
        L87:
            r7 = r10
            r10 = r9
            r9 = r7
        L8a:
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.List r11 = p489zc.C13777q.m221p0(r11)
            dg.a r5 = new dg.a
            r5.<init>()
            r11.removeIf(r5)
            r0.f13128w = r2
            r0.f13129x = r10
            r0.f13127B = r4
            java.lang.Object r9 = r2.m25744l(r10, r11, r0)
            if (r9 != r1) goto La5
            return r1
        La5:
            r9 = r10
            r10 = r2
        La7:
            r11 = 0
            r0.f13128w = r11
            r0.f13129x = r11
            r0.f13127B = r3
            java.lang.Object r9 = r10.m25745k(r9, r0)
            if (r9 != r1) goto Lb5
            return r1
        Lb5:
            yc.u r9 = p468yc.C13195u.f34156a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.BannersAgent.m26583o(tg.a, int, bd.d):java.lang.Object");
    }
}
