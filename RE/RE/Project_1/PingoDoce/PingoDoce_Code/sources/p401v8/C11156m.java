package p401v8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p381u8.C10850a;

/* renamed from: v8.m */
/* loaded from: classes.dex */
public class C11156m {
    @Deprecated

    /* renamed from: a */
    public float f28665a;
    @Deprecated

    /* renamed from: b */
    public float f28666b;
    @Deprecated

    /* renamed from: c */
    public float f28667c;
    @Deprecated

    /* renamed from: d */
    public float f28668d;
    @Deprecated

    /* renamed from: e */
    public float f28669e;
    @Deprecated

    /* renamed from: f */
    public float f28670f;

    /* renamed from: g */
    private final List<AbstractC11162f> f28671g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC11163g> f28672h = new ArrayList();

    /* renamed from: i */
    private boolean f28673i;

    /* compiled from: ShapePath.java */
    /* renamed from: v8.m$a */
    /* loaded from: classes.dex */
    class C11157a extends AbstractC11163g {

        /* renamed from: b */
        final /* synthetic */ List f28674b;

        /* renamed from: c */
        final /* synthetic */ Matrix f28675c;

        C11157a(C11156m c11156m, List list, Matrix matrix) {
            this.f28674b = list;
            this.f28675c = matrix;
        }

        @Override // p401v8.C11156m.AbstractC11163g
        /* renamed from: a */
        public void mo5836a(Matrix matrix, C10850a c10850a, int i, Canvas canvas) {
            for (AbstractC11163g abstractC11163g : this.f28674b) {
                abstractC11163g.mo5836a(this.f28675c, c10850a, i, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* renamed from: v8.m$b */
    /* loaded from: classes.dex */
    public static class C11158b extends AbstractC11163g {

        /* renamed from: b */
        private final C11160d f28676b;

        public C11158b(C11160d c11160d) {
            this.f28676b = c11160d;
        }

        @Override // p401v8.C11156m.AbstractC11163g
        /* renamed from: a */
        public void mo5836a(Matrix matrix, C10850a c10850a, int i, Canvas canvas) {
            c10850a.m6884a(canvas, matrix, new RectF(this.f28676b.m5852k(), this.f28676b.m5848o(), this.f28676b.m5851l(), this.f28676b.m5853j()), i, this.f28676b.m5850m(), this.f28676b.m5849n());
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: v8.m$c */
    /* loaded from: classes.dex */
    static class C11159c extends AbstractC11163g {

        /* renamed from: b */
        private final C11161e f28677b;

        /* renamed from: c */
        private final float f28678c;

        /* renamed from: d */
        private final float f28679d;

        public C11159c(C11161e c11161e, float f, float f2) {
            this.f28677b = c11161e;
            this.f28678c = f;
            this.f28679d = f2;
        }

        @Override // p401v8.C11156m.AbstractC11163g
        /* renamed from: a */
        public void mo5836a(Matrix matrix, C10850a c10850a, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f28677b.f28688c - this.f28679d, this.f28677b.f28687b - this.f28678c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f28678c, this.f28679d);
            matrix2.preRotate(m5862c());
            c10850a.m6883b(canvas, matrix2, rectF, i);
        }

        /* renamed from: c */
        float m5862c() {
            return (float) Math.toDegrees(Math.atan((this.f28677b.f28688c - this.f28679d) / (this.f28677b.f28687b - this.f28678c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: v8.m$d */
    /* loaded from: classes.dex */
    public static class C11160d extends AbstractC11162f {

        /* renamed from: h */
        private static final RectF f28680h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f28681b;
        @Deprecated

        /* renamed from: c */
        public float f28682c;
        @Deprecated

        /* renamed from: d */
        public float f28683d;
        @Deprecated

        /* renamed from: e */
        public float f28684e;
        @Deprecated

        /* renamed from: f */
        public float f28685f;
        @Deprecated

        /* renamed from: g */
        public float f28686g;

        public C11160d(float f, float f2, float f3, float f4) {
            m5846q(f);
            m5842u(f2);
            m5845r(f3);
            m5847p(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m5853j() {
            return this.f28684e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m5852k() {
            return this.f28681b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m5851l() {
            return this.f28683d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m5850m() {
            return this.f28685f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m5849n() {
            return this.f28686g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public float m5848o() {
            return this.f28682c;
        }

        /* renamed from: p */
        private void m5847p(float f) {
            this.f28684e = f;
        }

        /* renamed from: q */
        private void m5846q(float f) {
            this.f28681b = f;
        }

        /* renamed from: r */
        private void m5845r(float f) {
            this.f28683d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m5844s(float f) {
            this.f28685f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m5843t(float f) {
            this.f28686g = f;
        }

        /* renamed from: u */
        private void m5842u(float f) {
            this.f28682c = f;
        }

        @Override // p401v8.C11156m.AbstractC11162f
        /* renamed from: a */
        public void mo5837a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f28689a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f28680h;
            rectF.set(m5852k(), m5848o(), m5851l(), m5853j());
            path.arcTo(rectF, m5850m(), m5849n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: v8.m$e */
    /* loaded from: classes.dex */
    public static class C11161e extends AbstractC11162f {

        /* renamed from: b */
        private float f28687b;

        /* renamed from: c */
        private float f28688c;

        @Override // p401v8.C11156m.AbstractC11162f
        /* renamed from: a */
        public void mo5837a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f28689a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f28687b, this.f28688c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: v8.m$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11162f {

        /* renamed from: a */
        protected final Matrix f28689a = new Matrix();

        /* renamed from: a */
        public abstract void mo5837a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* renamed from: v8.m$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11163g {

        /* renamed from: a */
        static final Matrix f28690a = new Matrix();

        AbstractC11163g() {
        }

        /* renamed from: a */
        public abstract void mo5836a(Matrix matrix, C10850a c10850a, int i, Canvas canvas);

        /* renamed from: b */
        public final void m5835b(C10850a c10850a, int i, Canvas canvas) {
            mo5836a(f28690a, c10850a, i, canvas);
        }
    }

    public C11156m() {
        m5870n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m5882b(float f) {
        if (m5877g() == f) {
            return;
        }
        float m5877g = ((f - m5877g()) + 360.0f) % 360.0f;
        if (m5877g > 180.0f) {
            return;
        }
        C11160d c11160d = new C11160d(m5875i(), m5874j(), m5875i(), m5874j());
        c11160d.m5844s(m5877g());
        c11160d.m5843t(m5877g);
        this.f28672h.add(new C11158b(c11160d));
        m5868p(f);
    }

    /* renamed from: c */
    private void m5881c(AbstractC11163g abstractC11163g, float f, float f2) {
        m5882b(f);
        this.f28672h.add(abstractC11163g);
        m5868p(f2);
    }

    /* renamed from: g */
    private float m5877g() {
        return this.f28669e;
    }

    /* renamed from: h */
    private float m5876h() {
        return this.f28670f;
    }

    /* renamed from: p */
    private void m5868p(float f) {
        this.f28669e = f;
    }

    /* renamed from: q */
    private void m5867q(float f) {
        this.f28670f = f;
    }

    /* renamed from: r */
    private void m5866r(float f) {
        this.f28667c = f;
    }

    /* renamed from: s */
    private void m5865s(float f) {
        this.f28668d = f;
    }

    /* renamed from: t */
    private void m5864t(float f) {
        this.f28665a = f;
    }

    /* renamed from: u */
    private void m5863u(float f) {
        this.f28666b = f;
    }

    /* renamed from: a */
    public void m5883a(float f, float f2, float f3, float f4, float f5, float f6) {
        C11160d c11160d = new C11160d(f, f2, f3, f4);
        c11160d.m5844s(f5);
        c11160d.m5843t(f6);
        this.f28671g.add(c11160d);
        C11158b c11158b = new C11158b(c11160d);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m5881c(c11158b, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        m5866r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m5865s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void m5880d(Matrix matrix, Path path) {
        int size = this.f28671g.size();
        for (int i = 0; i < size; i++) {
            this.f28671g.get(i).mo5837a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m5879e() {
        return this.f28673i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC11163g m5878f(Matrix matrix) {
        m5882b(m5876h());
        return new C11157a(this, new ArrayList(this.f28672h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m5875i() {
        return this.f28667c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m5874j() {
        return this.f28668d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m5873k() {
        return this.f28665a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float m5872l() {
        return this.f28666b;
    }

    /* renamed from: m */
    public void m5871m(float f, float f2) {
        C11161e c11161e = new C11161e();
        c11161e.f28687b = f;
        c11161e.f28688c = f2;
        this.f28671g.add(c11161e);
        C11159c c11159c = new C11159c(c11161e, m5875i(), m5874j());
        m5881c(c11159c, c11159c.m5862c() + 270.0f, c11159c.m5862c() + 270.0f);
        m5866r(f);
        m5865s(f2);
    }

    /* renamed from: n */
    public void m5870n(float f, float f2) {
        m5869o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m5869o(float f, float f2, float f3, float f4) {
        m5864t(f);
        m5863u(f2);
        m5866r(f);
        m5865s(f2);
        m5868p(f3);
        m5867q((f3 + f4) % 360.0f);
        this.f28671g.clear();
        this.f28672h.clear();
        this.f28673i = false;
    }
}
