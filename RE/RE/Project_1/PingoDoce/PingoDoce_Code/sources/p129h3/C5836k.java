package p129h3;

import android.graphics.Paint;
import androidx.exifinterface.media.C1288a;
import p356sf.InterfaceC10187e;

/* renamed from: h3.k */
/* loaded from: classes.dex */
public final class C5836k {

    /* renamed from: a */
    public static final C5836k f16237a = new C5836k();

    /* renamed from: b */
    private static final Paint f16238b = new Paint(3);

    private C5836k() {
    }

    /* renamed from: a */
    public final C5832h m22963a(String str, InterfaceC10187e interfaceC10187e, EnumC5835j enumC5835j) {
        if (C5837l.m22959c(enumC5835j, str)) {
            C1288a c1288a = new C1288a(new C5834i(interfaceC10187e.mo8753n0().mo8767C0()));
            return new C5832h(c1288a.m37706s(), c1288a.m37713l());
        }
        return C5832h.f16232c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r1.top == 0.0f) == false) goto L27;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m22962b(android.graphics.Bitmap r8, p129h3.C5832h r9) {
        /*
            r7 = this;
            boolean r0 = r9.m22965b()
            if (r0 != 0) goto Ld
            boolean r0 = p129h3.C5837l.m22961a(r9)
            if (r0 != 0) goto Ld
            return r8
        Ld:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            boolean r2 = r9.m22965b()
            if (r2 == 0) goto L2d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r4, r1, r3)
        L2d:
            boolean r2 = p129h3.C5837l.m22961a(r9)
            if (r2 == 0) goto L3b
            int r2 = r9.m22966a()
            float r2 = (float) r2
            r0.postRotate(r2, r1, r3)
        L3b:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r2 = r1.left
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L58
            r3 = r5
            goto L59
        L58:
            r3 = r6
        L59:
            if (r3 == 0) goto L65
            float r3 = r1.top
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L62
            goto L63
        L62:
            r5 = r6
        L63:
            if (r5 != 0) goto L6c
        L65:
            float r2 = -r2
            float r1 = r1.top
            float r1 = -r1
            r0.postTranslate(r2, r1)
        L6c:
            boolean r9 = p129h3.C5837l.m22960b(r9)
            java.lang.String r1 = "createBitmap(width, height, config)"
            if (r9 == 0) goto L88
            int r9 = r8.getHeight()
            int r2 = r8.getWidth()
            android.graphics.Bitmap$Config r3 = p396v3.C11089a.m6174c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            p181jd.Intrinsics.checkIfNull(r9, r1)
            goto L9b
        L88:
            int r9 = r8.getWidth()
            int r2 = r8.getHeight()
            android.graphics.Bitmap$Config r3 = p396v3.C11089a.m6174c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            p181jd.Intrinsics.checkIfNull(r9, r1)
        L9b:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r9)
            android.graphics.Paint r2 = p129h3.C5836k.f16238b
            r1.drawBitmap(r8, r0, r2)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p129h3.C5836k.m22962b(android.graphics.Bitmap, h3.h):android.graphics.Bitmap");
    }
}
