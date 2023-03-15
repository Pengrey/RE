package p103fb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0928a;
import p443xa.C12332b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fb.a */
/* loaded from: classes2.dex */
public class C5442a extends Drawable {

    /* renamed from: a */
    private final Drawable f15326a;

    /* renamed from: b */
    private final Drawable f15327b;

    /* renamed from: c */
    private int f15328c = -1;

    public C5442a(Context context) {
        this.f15327b = C0928a.m39111f(context, C12332b.f32489a);
        this.f15326a = C0928a.m39111f(context, C12332b.f32490b);
    }

    /* renamed from: a */
    public void m24354a(int i) {
        this.f15328c = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f15327b.draw(canvas);
        canvas.drawColor(this.f15328c, PorterDuff.Mode.SRC_IN);
        this.f15326a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f15327b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        this.f15327b.setBounds(i, i2, i3, i4);
        this.f15326a.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.f15327b.setBounds(rect);
        this.f15326a.setBounds(rect);
    }
}
