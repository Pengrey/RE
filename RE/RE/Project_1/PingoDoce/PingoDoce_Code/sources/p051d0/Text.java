package p051d0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p092f0.AbstractC5250t0;
import p092f0.C5209j1;
import p092f0.C5255u0;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p286p1.C8392u;
import p286p1.TextStyle;
import p302q0.InterfaceC9570f;
import p359t1.AbstractC10364e;
import p359t1.C10366h;
import p359t1.FontWeight;
import p457y1.C13061c;
import p457y1.TextDecoration;
import p468yc.C13195u;

/* renamed from: d0.f1 */
/* loaded from: classes.dex */
public final class Text {

    /* renamed from: a */
    private static final AbstractC5250t0 f12400a = CompositionLocal.m24953b(C5209j1.m25065m(), C4572a.f12401w);

    /* compiled from: Text.kt */
    /* renamed from: d0.f1$a */
    /* loaded from: classes.dex */
    static final class C4572a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C4572a f12401w = new C4572a();

        C4572a() {
            super(0);
        }

        /* renamed from: a */
        public final TextStyle mo42214q() {
            return TextStyle.f21721s.m15501a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Text.kt */
    /* renamed from: d0.f1$b */
    /* loaded from: classes.dex */
    public static final class C4573b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ TextStyle f12402w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f12403x;

        /* renamed from: y */
        final /* synthetic */ int f12404y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4573b(TextStyle textStyle, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f12402w = textStyle;
            this.f12403x = interfaceC6112p;
            this.f12404y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27185a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27185a(InterfaceC5179i interfaceC5179i, int i) {
            Text.m27188a(this.f12402w, this.f12403x, interfaceC5179i, this.f12404y | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Text.kt */
    /* renamed from: d0.f1$c */
    /* loaded from: classes.dex */
    public static final class C4574c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C4574c f12405w = new C4574c();

        C4574c() {
            super(1);
        }

        /* renamed from: a */
        public final void m27184a(C8392u c8392u) {
            Intrinsics.isThisObjectNull(c8392u, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27184a((C8392u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Text.kt */
    /* renamed from: d0.f1$d */
    /* loaded from: classes.dex */
    public static final class C4575d extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C10366h f12406A;

        /* renamed from: B */
        final /* synthetic */ FontWeight f12407B;

        /* renamed from: C */
        final /* synthetic */ AbstractC10364e f12408C;

        /* renamed from: D */
        final /* synthetic */ long f12409D;

        /* renamed from: E */
        final /* synthetic */ TextDecoration f12410E;

        /* renamed from: F */
        final /* synthetic */ C13061c f12411F;

        /* renamed from: G */
        final /* synthetic */ long f12412G;

        /* renamed from: H */
        final /* synthetic */ int f12413H;

        /* renamed from: I */
        final /* synthetic */ boolean f12414I;

        /* renamed from: J */
        final /* synthetic */ int f12415J;

        /* renamed from: K */
        final /* synthetic */ InterfaceC6108l f12416K;

        /* renamed from: L */
        final /* synthetic */ TextStyle f12417L;

        /* renamed from: M */
        final /* synthetic */ int f12418M;

        /* renamed from: N */
        final /* synthetic */ int f12419N;

        /* renamed from: O */
        final /* synthetic */ int f12420O;

        /* renamed from: w */
        final /* synthetic */ String f12421w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f12422x;

        /* renamed from: y */
        final /* synthetic */ long f12423y;

        /* renamed from: z */
        final /* synthetic */ long f12424z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4575d(String str, InterfaceC9570f interfaceC9570f, long j, long j2, C10366h c10366h, FontWeight fontWeight, AbstractC10364e abstractC10364e, long j3, TextDecoration textDecoration, C13061c c13061c, long j4, int i, boolean z, int i2, InterfaceC6108l interfaceC6108l, TextStyle textStyle, int i3, int i4, int i5) {
            super(2);
            this.f12421w = str;
            this.f12422x = interfaceC9570f;
            this.f12423y = j;
            this.f12424z = j2;
            this.f12406A = c10366h;
            this.f12407B = fontWeight;
            this.f12408C = abstractC10364e;
            this.f12409D = j3;
            this.f12410E = textDecoration;
            this.f12411F = c13061c;
            this.f12412G = j4;
            this.f12413H = i;
            this.f12414I = z;
            this.f12415J = i2;
            this.f12416K = interfaceC6108l;
            this.f12417L = textStyle;
            this.f12418M = i3;
            this.f12419N = i4;
            this.f12420O = i5;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27183a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27183a(InterfaceC5179i interfaceC5179i, int i) {
            Text.m27187b(this.f12421w, this.f12422x, this.f12423y, this.f12424z, this.f12406A, this.f12407B, this.f12408C, this.f12409D, this.f12410E, this.f12411F, this.f12412G, this.f12413H, this.f12414I, this.f12415J, this.f12416K, this.f12417L, interfaceC5179i, this.f12418M | 1, this.f12419N, this.f12420O);
        }
    }

    /* renamed from: a */
    public static final void m27188a(TextStyle textStyle, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        Intrinsics.isThisObjectNull(textStyle, "value");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(1919620829);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC6112p) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            AbstractC5250t0 abstractC5250t0 = f12400a;
            CompositionLocal.m24954a(new C5255u0[]{abstractC5250t0.m24909c(((TextStyle) mo25249u.mo25256n(abstractC5250t0)).m15504w(textStyle))}, interfaceC6112p, mo25249u, (i2 & 112) | 8);
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C4573b(textStyle, interfaceC6112p, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27187b(java.lang.String r61, p302q0.InterfaceC9570f r62, long r63, long r65, p359t1.C10366h r67, p359t1.FontWeight r68, p359t1.AbstractC10364e r69, long r70, p457y1.TextDecoration r72, p457y1.C13061c r73, long r74, int r76, boolean r77, int r78, id.InterfaceC6108l r79, p286p1.TextStyle r80, p092f0.InterfaceC5179i r81, int r82, int r83, int r84) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.Text.m27187b(java.lang.String, q0.f, long, long, t1.h, t1.j, t1.e, long, y1.d, y1.c, long, int, boolean, int, id.l, p1.y, f0.i, int, int, int):void");
    }
}
