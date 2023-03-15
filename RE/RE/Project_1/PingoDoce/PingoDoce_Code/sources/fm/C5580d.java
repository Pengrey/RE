package fm;

import android.graphics.Bitmap;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.google.zxing.EnumC4392a;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import p000a.C0001b;
import p239mb.C7155b;
import p403vb.C11186j;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10587w0;
import td.InterfaceC10524i0;

/* renamed from: fm.d */
/* loaded from: classes2.dex */
public final class C5580d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZxingHelper.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.utils.ZxingHelper$generateBarcode$2", m20196f = "ZxingHelper.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: fm.d$a */
    /* loaded from: classes2.dex */
    public static final class C5581a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f15765A;

        /* renamed from: B */
        final /* synthetic */ int f15766B;

        /* renamed from: C */
        final /* synthetic */ int f15767C;

        /* renamed from: x */
        int f15768x;

        /* renamed from: y */
        final /* synthetic */ String f15769y;

        /* renamed from: z */
        final /* synthetic */ int f15770z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5581a(String str, int i, int i2, int i3, int i4, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f15769y = str;
            this.f15770z = i;
            this.f15765A = i2;
            this.f15766B = i3;
            this.f15767C = i4;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5581a(this.f15769y, this.f15770z, this.f15765A, this.f15766B, this.f15767C, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5581a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f15768x == 0) {
                C13186n.m1453b(obj);
                try {
                    C7155b m5780d = new C11186j().m5780d(this.f15769y, EnumC4392a.EAN_13, this.f15770z, this.f15765A);
                    int[] iArr = new int[m5780d.m19053l() * m5780d.m19056i()];
                    int m19056i = m5780d.m19056i();
                    for (int i = 0; i < m19056i; i++) {
                        int m19053l = m5780d.m19053l() * i;
                        int m19053l2 = m5780d.m19053l();
                        for (int i2 = 0; i2 < m19053l2; i2++) {
                            iArr[m19053l + i2] = m5780d.m19059e(i2, i) ? this.f15766B : this.f15767C;
                        }
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(m5780d.m19053l(), m5780d.m19056i(), Bitmap.Config.ARGB_8888);
                    createBitmap.setPixels(iArr, 0, m5780d.m19053l(), 0, 0, m5780d.m19053l(), m5780d.m19056i());
                    return createBitmap;
                } catch (Exception unused) {
                    return null;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZxingHelper.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.utils.ZxingHelper", m20196f = "ZxingHelper.kt", m20195l = {61}, m20194m = "generateQrCodeImage")
    /* renamed from: fm.d$b */
    /* loaded from: classes2.dex */
    public static final class C5582b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f15771w;

        /* renamed from: y */
        int f15773y;

        C5582b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f15771w = obj;
            this.f15773y |= Integer.MIN_VALUE;
            return C5580d.this.m23708c(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZxingHelper.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.utils.ZxingHelper$generateQrCodeImage$2", m20196f = "ZxingHelper.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: fm.d$c */
    /* loaded from: classes2.dex */
    public static final class C5583c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15774x;

        /* renamed from: y */
        final /* synthetic */ String f15775y;

        /* renamed from: z */
        final /* synthetic */ int f15776z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5583c(String str, int i, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f15775y = str;
            this.f15776z = i;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5583c(this.f15775y, this.f15776z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5583c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f15774x == 0) {
                C13186n.m1453b(obj);
                C0001b c0001b = new C0001b(this.f15775y, null, "TEXT_TYPE", this.f15776z);
                c0001b.m42206h(0);
                return c0001b.m42210d();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Object m23709b(C5580d c5580d, String str, int i, int i2, int i3, int i4, InterfaceC1886d interfaceC1886d, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = -16777216;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = 0;
        }
        return c5580d.m23710a(str, i, i2, i6, i4, interfaceC1886d);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m23707d(C5580d c5580d, String str, int i, InterfaceC1886d interfaceC1886d, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 500;
        }
        return c5580d.m23708c(str, i, interfaceC1886d);
    }

    /* renamed from: a */
    public final Object m23710a(String str, int i, int i2, int i3, int i4, InterfaceC1886d interfaceC1886d) {
        return C6769b.m20164g(C10587w0.m7621a(), new C5581a(str, i, i2, i3, i4, null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m23708c(java.lang.String r6, int r7, bd.InterfaceC1886d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof fm.C5580d.C5582b
            if (r0 == 0) goto L13
            r0 = r8
            fm.d$b r0 = (fm.C5580d.C5582b) r0
            int r1 = r0.f15773y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15773y = r1
            goto L18
        L13:
            fm.d$b r0 = new fm.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15771w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f15773y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p468yc.C13186n.m1453b(r8)
            td.e0 r8 = td.C10587w0.m7621a()
            fm.d$c r2 = new fm.d$c
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f15773y = r3
            java.lang.Object r8 = kotlinx.coroutines.C6769b.m20164g(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.lang.String r6 = "textToEncode: String, qr…t qrgEncoder.bitmap\n    }"
            p181jd.Intrinsics.checkIfNull(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fm.C5580d.m23708c(java.lang.String, int, bd.d):java.lang.Object");
    }
}
