package p477z;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p112g0.MutableVector;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z.c */
/* loaded from: classes.dex */
public final class C13482c implements InterfaceC13480b {

    /* renamed from: a */
    private final MutableVector f34282a = new MutableVector(new BringIntoViewRequester[16], 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BringIntoViewRequester.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m20196f = "BringIntoViewRequester.kt", m20195l = {150}, m20194m = "bringIntoView")
    /* renamed from: z.c$a */
    /* loaded from: classes.dex */
    public static final class C13483a extends AbstractC6757d {

        /* renamed from: A */
        /* synthetic */ Object f34283A;

        /* renamed from: C */
        int f34285C;

        /* renamed from: w */
        Object f34286w;

        /* renamed from: x */
        Object f34287x;

        /* renamed from: y */
        int f34288y;

        /* renamed from: z */
        int f34289z;

        C13483a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f34283A = obj;
            this.f34285C |= Integer.MIN_VALUE;
            return C13482c.this.mo1289a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
        if (r11 < r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005c -> B:33:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0062 -> B:33:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008d -> B:33:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00aa -> B:32:0x00ab). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo1289a(p373u0.Rect r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p477z.C13482c.C13483a
            if (r0 == 0) goto L13
            r0 = r12
            z.c$a r0 = (p477z.C13482c.C13483a) r0
            int r1 = r0.f34285C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34285C = r1
            goto L18
        L13:
            z.c$a r0 = new z.c$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f34283A
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f34285C
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r11 = r0.f34289z
            int r2 = r0.f34288y
            java.lang.Object r4 = r0.f34287x
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f34286w
            u0.h r5 = (p373u0.Rect) r5
            p468yc.C13186n.m1453b(r12)
            goto Lab
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            p468yc.C13186n.m1453b(r12)
            g0.e r12 = r10.m1286b()
            int r2 = r12.m23649p()
            if (r2 <= 0) goto Laf
            r4 = 0
            java.lang.Object[] r12 = r12.m23650o()
            r9 = r12
            r12 = r11
            r11 = r4
            r4 = r9
        L54:
            r5 = r4[r11]
            z.a r5 = (p477z.BringIntoViewRequester) r5
            h1.j r6 = r5.m1293b()
            if (r6 == 0) goto Lac
            boolean r7 = r6.mo23109S()
            if (r7 != 0) goto L65
            goto Lac
        L65:
            if (r12 != 0) goto L74
            long r7 = r6.mo23107b()
            long r7 = p479z1.C13617n.m818b(r7)
            u0.h r7 = p373u0.C10783m.m7083c(r7)
            goto L75
        L74:
            r7 = r12
        L75:
            z.e r8 = r5.m1292c()
            u0.h r6 = r8.m1271b(r7, r6)
            z.e r7 = r5.m1292c()
            z.e$a r8 = p477z.BringIntoViewResponder.f34298v
            z.e r8 = r8.m1269b()
            boolean r7 = p181jd.Intrinsics.equals(r7, r8)
            if (r7 == 0) goto L95
            z.f r5 = r5.m1294a()
            r5.m1265a(r6)
            goto Lac
        L95:
            z.e r5 = r5.m1292c()
            r0.f34286w = r12
            r0.f34287x = r4
            r0.f34288y = r2
            r0.f34289z = r11
            r0.f34285C = r3
            java.lang.Object r5 = r5.m1272a(r6, r0)
            if (r5 != r1) goto Laa
            return r1
        Laa:
            r5 = r12
        Lab:
            r12 = r5
        Lac:
            int r11 = r11 + r3
            if (r11 < r2) goto L54
        Laf:
            yc.u r11 = p468yc.C13195u.f34156a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p477z.C13482c.mo1289a(u0.h, bd.d):java.lang.Object");
    }

    /* renamed from: b */
    public final MutableVector m1286b() {
        return this.f34282a;
    }
}
