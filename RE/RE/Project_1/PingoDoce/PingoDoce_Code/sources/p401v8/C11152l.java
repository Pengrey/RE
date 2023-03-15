package p401v8;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: v8.l */
/* loaded from: classes.dex */
public class C11152l {

    /* renamed from: a */
    private final C11156m[] f28647a = new C11156m[4];

    /* renamed from: b */
    private final Matrix[] f28648b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f28649c = new Matrix[4];

    /* renamed from: d */
    private final PointF f28650d = new PointF();

    /* renamed from: e */
    private final Path f28651e = new Path();

    /* renamed from: f */
    private final Path f28652f = new Path();

    /* renamed from: g */
    private final C11156m f28653g = new C11156m();

    /* renamed from: h */
    private final float[] f28654h = new float[2];

    /* renamed from: i */
    private final float[] f28655i = new float[2];

    /* renamed from: j */
    private final Path f28656j = new Path();

    /* renamed from: k */
    private final Path f28657k = new Path();

    /* renamed from: l */
    private boolean f28658l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: v8.l$a */
    /* loaded from: classes.dex */
    private static class C11153a {

        /* renamed from: a */
        static final C11152l f28659a = new C11152l();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: v8.l$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11154b {
        /* renamed from: a */
        void mo5885a(C11156m c11156m, Matrix matrix, int i);

        /* renamed from: b */
        void mo5884b(C11156m c11156m, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: v8.l$c */
    /* loaded from: classes.dex */
    public static final class C11155c {

        /* renamed from: a */
        public final C11148k f28660a;

        /* renamed from: b */
        public final Path f28661b;

        /* renamed from: c */
        public final RectF f28662c;

        /* renamed from: d */
        public final InterfaceC11154b f28663d;

        /* renamed from: e */
        public final float f28664e;

        C11155c(C11148k c11148k, float f, RectF rectF, InterfaceC11154b interfaceC11154b, Path path) {
            this.f28663d = interfaceC11154b;
            this.f28660a = c11148k;
            this.f28664e = f;
            this.f28662c = rectF;
            this.f28661b = path;
        }
    }

    public C11152l() {
        for (int i = 0; i < 4; i++) {
            this.f28647a[i] = new C11156m();
            this.f28648b[i] = new Matrix();
            this.f28649c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m5899a(int i) {
        return (i + 1) * 90;
    }

    /* renamed from: b */
    private void m5898b(C11155c c11155c, int i) {
        this.f28654h[0] = this.f28647a[i].m5873k();
        this.f28654h[1] = this.f28647a[i].m5872l();
        this.f28648b[i].mapPoints(this.f28654h);
        if (i == 0) {
            Path path = c11155c.f28661b;
            float[] fArr = this.f28654h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = c11155c.f28661b;
            float[] fArr2 = this.f28654h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f28647a[i].m5880d(this.f28648b[i], c11155c.f28661b);
        InterfaceC11154b interfaceC11154b = c11155c.f28663d;
        if (interfaceC11154b != null) {
            interfaceC11154b.mo5885a(this.f28647a[i], this.f28648b[i], i);
        }
    }

    /* renamed from: c */
    private void m5897c(C11155c c11155c, int i) {
        int i2 = (i + 1) % 4;
        this.f28654h[0] = this.f28647a[i].m5875i();
        this.f28654h[1] = this.f28647a[i].m5874j();
        this.f28648b[i].mapPoints(this.f28654h);
        this.f28655i[0] = this.f28647a[i2].m5873k();
        this.f28655i[1] = this.f28647a[i2].m5872l();
        this.f28648b[i2].mapPoints(this.f28655i);
        float[] fArr = this.f28654h;
        float f = fArr[0];
        float[] fArr2 = this.f28655i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float m5891i = m5891i(c11155c.f28662c, i);
        this.f28653g.m5870n(0.0f, 0.0f);
        C11140f m5890j = m5890j(i, c11155c.f28660a);
        m5890j.mo6030b(max, m5891i, c11155c.f28664e, this.f28653g);
        this.f28656j.reset();
        this.f28653g.m5880d(this.f28649c[i], this.f28656j);
        if (this.f28658l && Build.VERSION.SDK_INT >= 19 && (m5890j.m6031a() || m5888l(this.f28656j, i) || m5888l(this.f28656j, i2))) {
            Path path = this.f28656j;
            path.op(path, this.f28652f, Path.Op.DIFFERENCE);
            this.f28654h[0] = this.f28653g.m5873k();
            this.f28654h[1] = this.f28653g.m5872l();
            this.f28649c[i].mapPoints(this.f28654h);
            Path path2 = this.f28651e;
            float[] fArr3 = this.f28654h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f28653g.m5880d(this.f28649c[i], this.f28651e);
        } else {
            this.f28653g.m5880d(this.f28649c[i], c11155c.f28661b);
        }
        InterfaceC11154b interfaceC11154b = c11155c.f28663d;
        if (interfaceC11154b != null) {
            interfaceC11154b.mo5884b(this.f28653g, this.f28649c[i], i);
        }
    }

    /* renamed from: f */
    private void m5894f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private InterfaceC11137c m5893g(int i, C11148k c11148k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c11148k.m5938t();
                }
                return c11148k.m5940r();
            }
            return c11148k.m5948j();
        }
        return c11148k.m5946l();
    }

    /* renamed from: h */
    private C11138d m5892h(int i, C11148k c11148k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c11148k.m5939s();
                }
                return c11148k.m5941q();
            }
            return c11148k.m5949i();
        }
        return c11148k.m5947k();
    }

    /* renamed from: i */
    private float m5891i(RectF rectF, int i) {
        float[] fArr = this.f28654h;
        C11156m[] c11156mArr = this.f28647a;
        fArr[0] = c11156mArr[i].f28667c;
        fArr[1] = c11156mArr[i].f28668d;
        this.f28648b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.f28654h[1]);
        }
        return Math.abs(rectF.centerX() - this.f28654h[0]);
    }

    /* renamed from: j */
    private C11140f m5890j(int i, C11148k c11148k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c11148k.m5943o();
                }
                return c11148k.m5942p();
            }
            return c11148k.m5944n();
        }
        return c11148k.m5950h();
    }

    /* renamed from: k */
    public static C11152l m5889k() {
        return C11153a.f28659a;
    }

    /* renamed from: l */
    private boolean m5888l(Path path, int i) {
        this.f28657k.reset();
        this.f28647a[i].m5880d(this.f28648b[i], this.f28657k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f28657k.computeBounds(rectF, true);
        path.op(this.f28657k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: m */
    private void m5887m(C11155c c11155c, int i) {
        m5892h(i, c11155c.f28660a).m6032b(this.f28647a[i], 90.0f, c11155c.f28664e, c11155c.f28662c, m5893g(i, c11155c.f28660a));
        float m5899a = m5899a(i);
        this.f28648b[i].reset();
        m5894f(i, c11155c.f28662c, this.f28650d);
        Matrix matrix = this.f28648b[i];
        PointF pointF = this.f28650d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f28648b[i].preRotate(m5899a);
    }

    /* renamed from: n */
    private void m5886n(int i) {
        this.f28654h[0] = this.f28647a[i].m5875i();
        this.f28654h[1] = this.f28647a[i].m5874j();
        this.f28648b[i].mapPoints(this.f28654h);
        float m5899a = m5899a(i);
        this.f28649c[i].reset();
        Matrix matrix = this.f28649c[i];
        float[] fArr = this.f28654h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f28649c[i].preRotate(m5899a);
    }

    /* renamed from: d */
    public void m5896d(C11148k c11148k, float f, RectF rectF, Path path) {
        m5895e(c11148k, f, rectF, null, path);
    }

    /* renamed from: e */
    public void m5895e(C11148k c11148k, float f, RectF rectF, InterfaceC11154b interfaceC11154b, Path path) {
        path.rewind();
        this.f28651e.rewind();
        this.f28652f.rewind();
        this.f28652f.addRect(rectF, Path.Direction.CW);
        C11155c c11155c = new C11155c(c11148k, f, rectF, interfaceC11154b, path);
        for (int i = 0; i < 4; i++) {
            m5887m(c11155c, i);
            m5886n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m5898b(c11155c, i2);
            m5897c(c11155c, i2);
        }
        path.close();
        this.f28651e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f28651e.isEmpty()) {
            return;
        }
        path.op(this.f28651e, Path.Op.UNION);
    }
}
