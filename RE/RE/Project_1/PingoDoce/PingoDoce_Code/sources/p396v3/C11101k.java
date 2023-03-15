package p396v3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p129h3.C5828f;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p327r3.C9796b;
import p327r3.C9805i;
import p327r3.EnumC9804h;

/* renamed from: v3.k */
/* loaded from: classes.dex */
public final class C11101k {

    /* renamed from: a */
    public static final C11101k f28493a = new C11101k();

    private C11101k() {
    }

    /* renamed from: b */
    private final boolean m6127b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == C11089a.m6172e(config);
    }

    /* renamed from: c */
    private final boolean m6126c(boolean z, Bitmap bitmap, C9805i c9805i, EnumC9804h enumC9804h) {
        if (z) {
            return true;
        }
        return C5828f.m22969c(bitmap.getWidth(), bitmap.getHeight(), C9796b.m9946a(c9805i) ? bitmap.getWidth() : C11098i.m6156A(c9805i.m9942d(), enumC9804h), C9796b.m9946a(c9805i) ? bitmap.getHeight() : C11098i.m6156A(c9805i.m9943c(), enumC9804h), enumC9804h) == 1.0d;
    }

    /* renamed from: a */
    public final Bitmap m6128a(Drawable drawable, Bitmap.Config config, C9805i c9805i, EnumC9804h enumC9804h, boolean z) {
        int m19531b;
        int m19531b2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (m6127b(bitmap, config) && m6126c(z, bitmap, c9805i, enumC9804h)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int m6139q = C11098i.m6139q(mutate);
        if (m6139q <= 0) {
            m6139q = 512;
        }
        int m6146j = C11098i.m6146j(mutate);
        int i = m6146j > 0 ? m6146j : 512;
        double m22969c = C5828f.m22969c(m6139q, i, C9796b.m9946a(c9805i) ? m6139q : C11098i.m6156A(c9805i.m9942d(), enumC9804h), C9796b.m9946a(c9805i) ? i : C11098i.m6156A(c9805i.m9943c(), enumC9804h), enumC9804h);
        m19531b = C7037c.m19531b(m6139q * m22969c);
        m19531b2 = C7037c.m19531b(m22969c * i);
        Bitmap createBitmap = Bitmap.createBitmap(m19531b, m19531b2, C11089a.m6172e(config));
        Intrinsics.checkIfNull(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        mutate.setBounds(0, 0, m19531b, m19531b2);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i2, i3, i4, i5);
        return createBitmap;
    }
}
