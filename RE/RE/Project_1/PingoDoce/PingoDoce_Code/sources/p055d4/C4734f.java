package p055d4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C2210f;
import java.util.Collections;
import java.util.List;
import p005a4.C0018e;
import p040c4.C2080n;
import p436x3.C12265d;

/* renamed from: d4.f */
/* loaded from: classes.dex */
public class C4734f extends AbstractC4724a {

    /* renamed from: z */
    private final C12265d f12982z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4734f(C2210f c2210f, C4730d c4730d) {
        super(c2210f, c4730d);
        C12265d c12265d = new C12265d(c2210f, this, new C2080n("__container", c4730d.m26754l(), false));
        this.f12982z = c12265d;
        c12265d.mo3144d(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: F */
    protected void mo26742F(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2) {
        this.f12982z.mo3150i(c0018e, i, list, c0018e2);
    }

    @Override // p055d4.AbstractC4724a, p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        super.mo3152b(rectF, matrix, z);
        this.f12982z.mo3152b(rectF, this.f12933m, z);
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: v */
    void mo26726v(Canvas canvas, Matrix matrix, int i) {
        this.f12982z.mo3146f(canvas, matrix, i);
    }
}
