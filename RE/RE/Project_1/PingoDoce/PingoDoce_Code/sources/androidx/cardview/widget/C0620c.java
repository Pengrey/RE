package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C0625g;

/* renamed from: androidx.cardview.widget.c */
/* loaded from: classes.dex */
class C0620c implements InterfaceC0623e {

    /* renamed from: a */
    final RectF f1931a = new RectF();

    /* compiled from: CardViewBaseImpl.java */
    /* renamed from: androidx.cardview.widget.c$a */
    /* loaded from: classes.dex */
    class C0621a implements C0625g.InterfaceC0626a {
        C0621a() {
        }

        @Override // androidx.cardview.widget.C0625g.InterfaceC0626a
        /* renamed from: a */
        public void mo40040a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0620c.this.f1931a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C0620c.this.f1931a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0620c.this.f1931a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0620c.this.f1931a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0620c.this.f1931a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    /* renamed from: p */
    private C0625g m40093p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0625g(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: q */
    private C0625g m40092q(InterfaceC0622d interfaceC0622d) {
        return (C0625g) interfaceC0622d.mo40085g();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: a */
    public float mo40084a(InterfaceC0622d interfaceC0622d) {
        return m40092q(interfaceC0622d).m40052i();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: b */
    public ColorStateList mo40083b(InterfaceC0622d interfaceC0622d) {
        return m40092q(interfaceC0622d).m40055f();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: c */
    public void mo40082c(InterfaceC0622d interfaceC0622d, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0625g m40093p = m40093p(context, colorStateList, f, f2, f3);
        m40093p.m40048m(interfaceC0622d.mo40087e());
        interfaceC0622d.mo40088d(m40093p);
        mo40079f(interfaceC0622d);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: d */
    public void mo40081d(InterfaceC0622d interfaceC0622d, float f) {
        m40092q(interfaceC0622d).m40045p(f);
        mo40079f(interfaceC0622d);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: e */
    public float mo40080e(InterfaceC0622d interfaceC0622d) {
        return m40092q(interfaceC0622d).m40049l();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: f */
    public void mo40079f(InterfaceC0622d interfaceC0622d) {
        Rect rect = new Rect();
        m40092q(interfaceC0622d).m40053h(rect);
        interfaceC0622d.mo40089c((int) Math.ceil(mo40075j(interfaceC0622d)), (int) Math.ceil(mo40076i(interfaceC0622d)));
        interfaceC0622d.mo40091a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: g */
    public void mo40078g() {
        C0625g.f1945r = new C0621a();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: h */
    public float mo40077h(InterfaceC0622d interfaceC0622d) {
        return m40092q(interfaceC0622d).m40054g();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: i */
    public float mo40076i(InterfaceC0622d interfaceC0622d) {
        return m40092q(interfaceC0622d).m40051j();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: j */
    public float mo40075j(InterfaceC0622d interfaceC0622d) {
        return m40092q(interfaceC0622d).m40050k();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: k */
    public void mo40074k(InterfaceC0622d interfaceC0622d) {
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: l */
    public void mo40073l(InterfaceC0622d interfaceC0622d, float f) {
        m40092q(interfaceC0622d).m40043r(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: m */
    public void mo40072m(InterfaceC0622d interfaceC0622d) {
        m40092q(interfaceC0622d).m40048m(interfaceC0622d.mo40087e());
        mo40079f(interfaceC0622d);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: n */
    public void mo40071n(InterfaceC0622d interfaceC0622d, ColorStateList colorStateList) {
        m40092q(interfaceC0622d).m40046o(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: o */
    public void mo40070o(InterfaceC0622d interfaceC0622d, float f) {
        m40092q(interfaceC0622d).m40044q(f);
        mo40079f(interfaceC0622d);
    }
}
