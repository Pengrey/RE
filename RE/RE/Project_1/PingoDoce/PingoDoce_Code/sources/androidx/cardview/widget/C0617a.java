package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C0625g;

/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes.dex */
class C0617a extends C0620c {

    /* compiled from: CardViewApi17Impl.java */
    /* renamed from: androidx.cardview.widget.a$a */
    /* loaded from: classes.dex */
    class C0618a implements C0625g.InterfaceC0626a {
        C0618a(C0617a c0617a) {
        }

        @Override // androidx.cardview.widget.C0625g.InterfaceC0626a
        /* renamed from: a */
        public void mo40040a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // androidx.cardview.widget.C0620c, androidx.cardview.widget.InterfaceC0623e
    /* renamed from: g */
    public void mo40078g() {
        C0625g.f1945r = new C0618a(this);
    }
}
