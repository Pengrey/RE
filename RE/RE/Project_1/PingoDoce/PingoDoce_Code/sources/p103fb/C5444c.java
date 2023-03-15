package p103fb;

import android.content.Context;
import android.graphics.Canvas;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: fb.c */
/* loaded from: classes2.dex */
public class C5444c extends AppCompatTextView {

    /* renamed from: B */
    private int f15335B;

    /* renamed from: C */
    private int f15336C;

    public C5444c(Context context) {
        super(context);
        this.f15335B = 0;
        this.f15336C = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.f15336C / 2, this.f15335B / 2);
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f15335B = measuredWidth - measuredHeight;
            this.f15336C = 0;
        } else {
            this.f15335B = 0;
            this.f15336C = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
