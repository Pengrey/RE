package p412w1;

import java.util.List;
import p181jd.Intrinsics;
import p286p1.InterfaceC8348k;
import p286p1.TextStyle;
import p359t1.InterfaceC10362d;
import p479z1.Density;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* renamed from: w1.e */
/* loaded from: classes.dex */
public final class C11540e {
    /* renamed from: a */
    public static final InterfaceC8348k m4767a(String str, TextStyle textStyle, List list, List list2, Density density, InterfaceC10362d.InterfaceC10363a interfaceC10363a) {
        Intrinsics.isThisObjectNull(str, "text");
        Intrinsics.isThisObjectNull(textStyle, "style");
        Intrinsics.isThisObjectNull(list, "spanStyles");
        Intrinsics.isThisObjectNull(list2, "placeholders");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(interfaceC10363a, "resourceLoader");
        return new C11539d(str, textStyle, list, list2, new C11545j(null, interfaceC10363a, 1, null), density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r6 == 1) goto L10;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m4766b(p457y1.C13064e r6, p394v1.LocaleList r7) {
        /*
            if (r6 != 0) goto L9
            y1.e$a r6 = p457y1.C13064e.f33977b
            int r6 = r6.m1708a()
            goto Ld
        L9:
            int r6 = r6.m1709l()
        Ld:
            y1.e$a r0 = p457y1.C13064e.f33977b
            int r1 = r0.m1707b()
            boolean r1 = p457y1.C13064e.m1712i(r6, r1)
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L1f
        L1d:
            r2 = r5
            goto L6d
        L1f:
            int r1 = r0.m1706c()
            boolean r1 = p457y1.C13064e.m1712i(r6, r1)
            if (r1 == 0) goto L2b
        L29:
            r2 = r4
            goto L6d
        L2b:
            int r1 = r0.m1705d()
            boolean r1 = p457y1.C13064e.m1712i(r6, r1)
            if (r1 == 0) goto L37
            r2 = r3
            goto L6d
        L37:
            int r1 = r0.m1704e()
            boolean r1 = p457y1.C13064e.m1712i(r6, r1)
            if (r1 == 0) goto L42
            goto L6d
        L42:
            int r0 = r0.m1708a()
            boolean r6 = p457y1.C13064e.m1712i(r6, r0)
            if (r6 == 0) goto L6e
            if (r7 != 0) goto L50
            r6 = 0
            goto L5e
        L50:
            v1.e r6 = r7.m6184h(r3)
            v1.g r6 = r6.m6189a()
            v1.a r6 = (p394v1.C11079a) r6
            java.util.Locale r6 = r6.m6191b()
        L5e:
            if (r6 != 0) goto L64
            java.util.Locale r6 = java.util.Locale.getDefault()
        L64:
            int r6 = androidx.core.text.C1066g.m38637b(r6)
            if (r6 == 0) goto L1d
            if (r6 == r2) goto L29
            goto L1d
        L6d:
            return r2
        L6e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p412w1.C11540e.m4766b(y1.e, v1.f):int");
    }
}
