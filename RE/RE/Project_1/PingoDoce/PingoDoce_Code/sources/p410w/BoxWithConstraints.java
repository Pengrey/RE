package p410w;

import id.InterfaceC6112p;
import id.InterfaceC6113q;
import p092f0.InterfaceC5179i;
import p127h1.InterfaceC5795l0;
import p127h1.InterfaceC5804s;
import p127h1.InterfaceC5805t;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13599b;

/* renamed from: w.g */
/* loaded from: classes.dex */
public final class BoxWithConstraints {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BoxWithConstraints.kt */
    /* renamed from: w.g$a */
    /* loaded from: classes.dex */
    public static final class C11455a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5804s f29360w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6113q f29361x;

        /* renamed from: y */
        final /* synthetic */ int f29362y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BoxWithConstraints.kt */
        /* renamed from: w.g$a$a */
        /* loaded from: classes.dex */
        public static final class C11456a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6113q f29363w;

            /* renamed from: x */
            final /* synthetic */ C11462i f29364x;

            /* renamed from: y */
            final /* synthetic */ int f29365y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11456a(InterfaceC6113q interfaceC6113q, C11462i c11462i, int i) {
                super(2);
                this.f29363w = interfaceC6113q;
                this.f29364x = c11462i;
                this.f29365y = i;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m5075a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m5075a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    this.f29363w.mo4533i(this.f29364x, interfaceC5179i, Integer.valueOf((this.f29365y >> 6) & 112));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11455a(InterfaceC5804s interfaceC5804s, InterfaceC6113q interfaceC6113q, int i) {
            super(2);
            this.f29360w = interfaceC5804s;
            this.f29361x = interfaceC6113q;
            this.f29362y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m5076a((InterfaceC5795l0) obj, ((C13599b) obj2).m911s());
        }

        /* renamed from: a */
        public final InterfaceC5805t m5076a(InterfaceC5795l0 interfaceC5795l0, long j) {
            Intrinsics.isThisObjectNull(interfaceC5795l0, "$this$SubcomposeLayout");
            return this.f29360w.mo23006a(interfaceC5795l0, interfaceC5795l0.m23027f0(C13195u.f34156a, ComposableLambda.m19326c(-985531317, true, new C11456a(this.f29361x, new C11462i(interfaceC5795l0, j, null), this.f29362y))), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BoxWithConstraints.kt */
    /* renamed from: w.g$b */
    /* loaded from: classes.dex */
    public static final class C11457b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f29366A;

        /* renamed from: B */
        final /* synthetic */ int f29367B;

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f29368w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9560a f29369x;

        /* renamed from: y */
        final /* synthetic */ boolean f29370y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6113q f29371z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11457b(InterfaceC9570f interfaceC9570f, InterfaceC9560a interfaceC9560a, boolean z, InterfaceC6113q interfaceC6113q, int i, int i2) {
            super(2);
            this.f29368w = interfaceC9570f;
            this.f29369x = interfaceC9560a;
            this.f29370y = z;
            this.f29371z = interfaceC6113q;
            this.f29366A = i;
            this.f29367B = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m5074a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m5074a(InterfaceC5179i interfaceC5179i, int i) {
            BoxWithConstraints.m5077a(this.f29368w, this.f29369x, this.f29370y, this.f29371z, interfaceC5179i, this.f29366A | 1, this.f29367B);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m5077a(p302q0.InterfaceC9570f r11, p302q0.InterfaceC9560a r12, boolean r13, id.InterfaceC6113q r14, p092f0.InterfaceC5179i r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p410w.BoxWithConstraints.m5077a(q0.f, q0.a, boolean, id.q, f0.i, int, int):void");
    }
}
