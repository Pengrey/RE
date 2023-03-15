package p239mb;

import com.google.zxing.NotFoundException;

/* renamed from: mb.i */
/* loaded from: classes2.dex */
public abstract class AbstractC7162i {

    /* renamed from: a */
    private static AbstractC7162i f18986a = new C7159f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m19025a(p239mb.C7155b r10, float[] r11) throws com.google.zxing.NotFoundException {
        /*
            int r0 = r10.m19053l()
            int r10 = r10.m19056i()
            int r1 = r11.length
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5 = r2
            r4 = r3
        Le:
            r6 = 0
            r7 = -1
            if (r4 >= r1) goto L49
            if (r5 == 0) goto L49
            r5 = r11[r4]
            int r5 = (int) r5
            int r8 = r4 + 1
            r9 = r11[r8]
            int r9 = (int) r9
            if (r5 < r7) goto L44
            if (r5 > r0) goto L44
            if (r9 < r7) goto L44
            if (r9 > r10) goto L44
            if (r5 != r7) goto L2a
            r11[r4] = r6
        L28:
            r5 = r2
            goto L33
        L2a:
            if (r5 != r0) goto L32
            int r5 = r0 + (-1)
            float r5 = (float) r5
            r11[r4] = r5
            goto L28
        L32:
            r5 = r3
        L33:
            if (r9 != r7) goto L39
            r11[r8] = r6
        L37:
            r5 = r2
            goto L41
        L39:
            if (r9 != r10) goto L41
            int r5 = r10 + (-1)
            float r5 = (float) r5
            r11[r8] = r5
            goto L37
        L41:
            int r4 = r4 + 2
            goto Le
        L44:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m27700a()
            throw r10
        L49:
            int r1 = r11.length
            int r1 = r1 + (-2)
            r4 = r2
        L4d:
            if (r1 < 0) goto L86
            if (r4 == 0) goto L86
            r4 = r11[r1]
            int r4 = (int) r4
            int r5 = r1 + 1
            r8 = r11[r5]
            int r8 = (int) r8
            if (r4 < r7) goto L81
            if (r4 > r0) goto L81
            if (r8 < r7) goto L81
            if (r8 > r10) goto L81
            if (r4 != r7) goto L67
            r11[r1] = r6
        L65:
            r4 = r2
            goto L70
        L67:
            if (r4 != r0) goto L6f
            int r4 = r0 + (-1)
            float r4 = (float) r4
            r11[r1] = r4
            goto L65
        L6f:
            r4 = r3
        L70:
            if (r8 != r7) goto L76
            r11[r5] = r6
        L74:
            r4 = r2
            goto L7e
        L76:
            if (r8 != r10) goto L7e
            int r4 = r10 + (-1)
            float r4 = (float) r4
            r11[r5] = r4
            goto L74
        L7e:
            int r1 = r1 + (-2)
            goto L4d
        L81:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m27700a()
            throw r10
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239mb.AbstractC7162i.m19025a(mb.b, float[]):void");
    }

    /* renamed from: b */
    public static AbstractC7162i m19024b() {
        return f18986a;
    }

    /* renamed from: c */
    public abstract C7155b mo19023c(C7155b c7155b, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException;

    /* renamed from: d */
    public abstract C7155b mo19022d(C7155b c7155b, int i, int i2, C7164k c7164k) throws NotFoundException;
}
