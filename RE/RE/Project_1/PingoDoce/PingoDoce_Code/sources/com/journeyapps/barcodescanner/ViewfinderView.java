package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.C4411o;
import com.journeyapps.barcodescanner.C4440a;
import java.util.ArrayList;
import java.util.List;
import p138hc.C5905q;
import p201kb.C6634j;
import p201kb.C6639o;

/* loaded from: classes2.dex */
public class ViewfinderView extends View {

    /* renamed from: J */
    protected static final int[] f11977J = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: A */
    protected final int f11978A;

    /* renamed from: B */
    protected final int f11979B;

    /* renamed from: C */
    protected boolean f11980C;

    /* renamed from: D */
    protected int f11981D;

    /* renamed from: E */
    protected List<C4411o> f11982E;

    /* renamed from: F */
    protected List<C4411o> f11983F;

    /* renamed from: G */
    protected C4440a f11984G;

    /* renamed from: H */
    protected Rect f11985H;

    /* renamed from: I */
    protected C5905q f11986I;

    /* renamed from: w */
    protected final Paint f11987w;

    /* renamed from: x */
    protected Bitmap f11988x;

    /* renamed from: y */
    protected int f11989y;

    /* renamed from: z */
    protected final int f11990z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    /* loaded from: classes2.dex */
    public class C4439a implements C4440a.InterfaceC4446f {
        C4439a() {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: a */
        public void mo27506a() {
            ViewfinderView.this.m27572b();
            ViewfinderView.this.invalidate();
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: b */
        public void mo27505b(Exception exc) {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: c */
        public void mo27504c() {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: d */
        public void mo27503d() {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: e */
        public void mo27502e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11987w = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C6639o.f17913f);
        this.f11989y = obtainStyledAttributes.getColor(C6639o.f17918k, resources.getColor(C6634j.zxing_viewfinder_mask));
        this.f11990z = obtainStyledAttributes.getColor(C6639o.f17915h, resources.getColor(C6634j.zxing_result_view));
        this.f11978A = obtainStyledAttributes.getColor(C6639o.f17916i, resources.getColor(C6634j.zxing_viewfinder_laser));
        this.f11979B = obtainStyledAttributes.getColor(C6639o.f17914g, resources.getColor(C6634j.zxing_possible_result_points));
        this.f11980C = obtainStyledAttributes.getBoolean(C6639o.f17917j, true);
        obtainStyledAttributes.recycle();
        this.f11981D = 0;
        this.f11982E = new ArrayList(20);
        this.f11983F = new ArrayList(20);
    }

    /* renamed from: a */
    public void m27573a(C4411o c4411o) {
        if (this.f11982E.size() < 20) {
            this.f11982E.add(c4411o);
        }
    }

    /* renamed from: b */
    protected void m27572b() {
        C4440a c4440a = this.f11984G;
        if (c4440a == null) {
            return;
        }
        Rect framingRect = c4440a.getFramingRect();
        C5905q previewSize = this.f11984G.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f11985H = framingRect;
        this.f11986I = previewSize;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C5905q c5905q;
        m27572b();
        Rect rect = this.f11985H;
        if (rect == null || (c5905q = this.f11986I) == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f11987w.setColor(this.f11988x != null ? this.f11990z : this.f11989y);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rect.top, this.f11987w);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f11987w);
        canvas.drawRect(rect.right + 1, rect.top, f, rect.bottom + 1, this.f11987w);
        canvas.drawRect(0.0f, rect.bottom + 1, f, height, this.f11987w);
        if (this.f11988x != null) {
            this.f11987w.setAlpha(160);
            canvas.drawBitmap(this.f11988x, (Rect) null, rect, this.f11987w);
            return;
        }
        if (this.f11980C) {
            this.f11987w.setColor(this.f11978A);
            Paint paint = this.f11987w;
            int[] iArr = f11977J;
            paint.setAlpha(iArr[this.f11981D]);
            this.f11981D = (this.f11981D + 1) % iArr.length;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, this.f11987w);
        }
        float width2 = getWidth() / c5905q.f16352w;
        float height3 = getHeight() / c5905q.f16353x;
        if (!this.f11983F.isEmpty()) {
            this.f11987w.setAlpha(80);
            this.f11987w.setColor(this.f11979B);
            for (C4411o c4411o : this.f11983F) {
                canvas.drawCircle((int) (c4411o.m27640c() * width2), (int) (c4411o.m27639d() * height3), 3.0f, this.f11987w);
            }
            this.f11983F.clear();
        }
        if (!this.f11982E.isEmpty()) {
            this.f11987w.setAlpha(160);
            this.f11987w.setColor(this.f11979B);
            for (C4411o c4411o2 : this.f11982E) {
                canvas.drawCircle((int) (c4411o2.m27640c() * width2), (int) (c4411o2.m27639d() * height3), 6.0f, this.f11987w);
            }
            List<C4411o> list = this.f11982E;
            List<C4411o> list2 = this.f11983F;
            this.f11982E = list2;
            this.f11983F = list;
            list2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(C4440a c4440a) {
        this.f11984G = c4440a;
        c4440a.m27559i(new C4439a());
    }

    public void setLaserVisibility(boolean z) {
        this.f11980C = z;
    }

    public void setMaskColor(int i) {
        this.f11989y = i;
    }
}
