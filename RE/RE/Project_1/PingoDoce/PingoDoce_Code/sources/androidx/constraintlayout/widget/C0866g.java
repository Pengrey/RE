package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p073e2.C4966e;

/* renamed from: androidx.constraintlayout.widget.g */
/* loaded from: classes.dex */
public class C0866g extends View {

    /* renamed from: w */
    private int f2734w;

    /* renamed from: x */
    private View f2735x;

    /* renamed from: y */
    private int f2736y;

    /* renamed from: a */
    public void m39366a(ConstraintLayout constraintLayout) {
        if (this.f2735x == null) {
            return;
        }
        ConstraintLayout.C0847b c0847b = (ConstraintLayout.C0847b) getLayoutParams();
        ConstraintLayout.C0847b c0847b2 = (ConstraintLayout.C0847b) this.f2735x.getLayoutParams();
        c0847b2.f2568m0.m26101T0(0);
        C4966e.EnumC4968b m26052y = c0847b.f2568m0.m26052y();
        C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.FIXED;
        if (m26052y != enumC4968b) {
            c0847b.f2568m0.m26099U0(c0847b2.f2568m0.m26106R());
        }
        if (c0847b.f2568m0.m26112O() != enumC4968b) {
            c0847b.f2568m0.m26057v0(c0847b2.f2568m0.m26058v());
        }
        c0847b2.f2568m0.m26101T0(8);
    }

    /* renamed from: b */
    public void m39365b(ConstraintLayout constraintLayout) {
        if (this.f2734w == -1 && !isInEditMode()) {
            setVisibility(this.f2736y);
        }
        View findViewById = constraintLayout.findViewById(this.f2734w);
        this.f2735x = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0847b) findViewById.getLayoutParams()).f2544a0 = true;
            this.f2735x.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2735x;
    }

    public int getEmptyVisibility() {
        return this.f2736y;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2734w == i) {
            return;
        }
        View view = this.f2735x;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0847b) this.f2735x.getLayoutParams()).f2544a0 = false;
            this.f2735x = null;
        }
        this.f2734w = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f2736y = i;
    }
}
