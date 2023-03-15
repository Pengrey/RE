package p022b0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p036c0.C1973h;
import p036c0.InterfaceC1972g;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p244n0.InterfaceC7575i;
import p244n0.InterfaceC7579k;
import p244n0.Saver;
import p286p1.C8392u;
import p286p1.TextStyle;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* renamed from: b0.a */
/* loaded from: classes.dex */
public final class BasicText {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* renamed from: b0.a$a */
    /* loaded from: classes.dex */
    public static final class C1763a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C1763a f5415w = new C1763a();

        C1763a() {
            super(1);
        }

        /* renamed from: a */
        public final void m35417a(C8392u c8392u) {
            Intrinsics.isThisObjectNull(c8392u, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35417a((C8392u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* renamed from: b0.a$b */
    /* loaded from: classes.dex */
    public static final class C1764b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f5416A;

        /* renamed from: B */
        final /* synthetic */ boolean f5417B;

        /* renamed from: C */
        final /* synthetic */ int f5418C;

        /* renamed from: D */
        final /* synthetic */ int f5419D;

        /* renamed from: E */
        final /* synthetic */ int f5420E;

        /* renamed from: w */
        final /* synthetic */ String f5421w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f5422x;

        /* renamed from: y */
        final /* synthetic */ TextStyle f5423y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6108l f5424z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1764b(String str, InterfaceC9570f interfaceC9570f, TextStyle textStyle, InterfaceC6108l interfaceC6108l, int i, boolean z, int i2, int i3, int i4) {
            super(2);
            this.f5421w = str;
            this.f5422x = interfaceC9570f;
            this.f5423y = textStyle;
            this.f5424z = interfaceC6108l;
            this.f5416A = i;
            this.f5417B = z;
            this.f5418C = i2;
            this.f5419D = i3;
            this.f5420E = i4;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m35416a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m35416a(InterfaceC5179i interfaceC5179i, int i) {
            BasicText.m35419a(this.f5421w, this.f5422x, this.f5423y, this.f5424z, this.f5416A, this.f5417B, this.f5418C, interfaceC5179i, this.f5419D | 1, this.f5420E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* renamed from: b0.a$c */
    /* loaded from: classes.dex */
    public static final class C1765c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC1972g f5425w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1765c(InterfaceC1972g interfaceC1972g) {
            super(0);
            this.f5425w = interfaceC1972g;
        }

        /* renamed from: a */
        public final Long mo42214q() {
            InterfaceC1972g interfaceC1972g = this.f5425w;
            return Long.valueOf(interfaceC1972g == null ? 0L : interfaceC1972g.m35005f());
        }
    }

    /* compiled from: Composables.kt */
    /* renamed from: b0.a$d */
    /* loaded from: classes.dex */
    public static final class C1766d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f5426w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1766d(InterfaceC6097a interfaceC6097a) {
            super(0);
            this.f5426w = interfaceC6097a;
        }

        /* renamed from: q */
        public final Object mo42214q() {
            return this.f5426w.mo42214q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* renamed from: b0.a$e */
    /* loaded from: classes.dex */
    public static final class C1767e extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC1972g f5427w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1767e(InterfaceC1972g interfaceC1972g) {
            super(2);
            this.f5427w = interfaceC1972g;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m35414a((InterfaceC7579k) obj, ((Number) obj2).longValue());
        }

        /* renamed from: a */
        public final Long m35414a(InterfaceC7579k interfaceC7579k, long j) {
            Intrinsics.isThisObjectNull(interfaceC7579k, "$this$Saver");
            if (C1973h.m34999b(this.f5427w, j)) {
                return Long.valueOf(j);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    /* renamed from: b0.a$f */
    /* loaded from: classes.dex */
    public static final class C1768f extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C1768f f5428w = new C1768f();

        C1768f() {
            super(1);
        }

        /* renamed from: a */
        public final Long m35413a(long j) {
            return Long.valueOf(j);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m35413a(((Number) obj).longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m35419a(java.lang.String r28, p302q0.InterfaceC9570f r29, p286p1.TextStyle r30, id.InterfaceC6108l r31, int r32, boolean r33, int r34, p092f0.InterfaceC5179i r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p022b0.BasicText.m35419a(java.lang.String, q0.f, p1.y, id.l, int, boolean, int, f0.i, int, int):void");
    }

    /* renamed from: b */
    private static final InterfaceC7575i m35418b(InterfaceC1972g interfaceC1972g) {
        return Saver.m18111a(new C1767e(interfaceC1972g), C1768f.f5428w);
    }
}
