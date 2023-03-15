package p138hc;

import android.graphics.Bitmap;
import p239mb.C7155b;

/* renamed from: hc.b */
/* loaded from: classes2.dex */
public class C5887b {
    /* renamed from: a */
    public Bitmap m22818a(C7155b c7155b) {
        int m19053l = c7155b.m19053l();
        int m19056i = c7155b.m19056i();
        int[] iArr = new int[m19053l * m19056i];
        for (int i = 0; i < m19056i; i++) {
            int i2 = i * m19053l;
            for (int i3 = 0; i3 < m19053l; i3++) {
                iArr[i2 + i3] = c7155b.m19059e(i3, i) ? -16777216 : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(m19053l, m19056i, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, m19053l, 0, 0, m19053l, m19056i);
        return createBitmap;
    }
}
