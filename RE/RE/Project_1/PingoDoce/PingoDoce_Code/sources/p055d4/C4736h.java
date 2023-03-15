package p055d4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C2201d;
import com.airbnb.lottie.C2210f;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005a4.C0014b;
import p005a4.C0016c;
import p005a4.C0017d;
import p026b4.C1797a;
import p026b4.C1798b;
import p026b4.C1807k;
import p040c4.C2080n;
import p130h4.C5852h;
import p152i4.C6015c;
import p301q.C9556e;
import p436x3.C12265d;
import p459y3.AbstractC13078a;
import p459y3.C13097n;
import p459y3.C13099p;

/* renamed from: d4.h */
/* loaded from: classes.dex */
public class C4736h extends AbstractC4724a {

    /* renamed from: A */
    private final RectF f12989A;

    /* renamed from: B */
    private final Matrix f12990B;

    /* renamed from: C */
    private final Paint f12991C;

    /* renamed from: D */
    private final Paint f12992D;

    /* renamed from: E */
    private final Map<C0017d, List<C12265d>> f12993E;

    /* renamed from: F */
    private final C9556e<String> f12994F;

    /* renamed from: G */
    private final C13097n f12995G;

    /* renamed from: H */
    private final C2210f f12996H;

    /* renamed from: I */
    private final C2201d f12997I;

    /* renamed from: J */
    private AbstractC13078a<Integer, Integer> f12998J;

    /* renamed from: K */
    private AbstractC13078a<Integer, Integer> f12999K;

    /* renamed from: L */
    private AbstractC13078a<Integer, Integer> f13000L;

    /* renamed from: M */
    private AbstractC13078a<Integer, Integer> f13001M;

    /* renamed from: N */
    private AbstractC13078a<Float, Float> f13002N;

    /* renamed from: O */
    private AbstractC13078a<Float, Float> f13003O;

    /* renamed from: P */
    private AbstractC13078a<Float, Float> f13004P;

    /* renamed from: Q */
    private AbstractC13078a<Float, Float> f13005Q;

    /* renamed from: R */
    private AbstractC13078a<Float, Float> f13006R;

    /* renamed from: S */
    private AbstractC13078a<Float, Float> f13007S;

    /* renamed from: T */
    private AbstractC13078a<Typeface, Typeface> f13008T;

    /* renamed from: z */
    private final StringBuilder f13009z;

    /* compiled from: TextLayer.java */
    /* renamed from: d4.h$a */
    /* loaded from: classes.dex */
    class C4737a extends Paint {
        C4737a(C4736h c4736h, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* renamed from: d4.h$b */
    /* loaded from: classes.dex */
    class C4738b extends Paint {
        C4738b(C4736h c4736h, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextLayer.java */
    /* renamed from: d4.h$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4739c {

        /* renamed from: a */
        static final /* synthetic */ int[] f13010a;

        static {
            int[] iArr = new int[C0014b.EnumC0015a.values().length];
            f13010a = iArr;
            try {
                iArr[C0014b.EnumC0015a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13010a[C0014b.EnumC0015a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13010a[C0014b.EnumC0015a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4736h(C2210f c2210f, C4730d c4730d) {
        super(c2210f, c4730d);
        C1798b c1798b;
        C1798b c1798b2;
        C1797a c1797a;
        C1797a c1797a2;
        this.f13009z = new StringBuilder(2);
        this.f12989A = new RectF();
        this.f12990B = new Matrix();
        this.f12991C = new C4737a(this, 1);
        this.f12992D = new C4738b(this, 1);
        this.f12993E = new HashMap();
        this.f12994F = new C9556e<>();
        this.f12996H = c2210f;
        this.f12997I = c4730d.m26765a();
        C13097n mo35329a = c4730d.m26749q().mo35329a();
        this.f12995G = mo35329a;
        mo35329a.m1687a(this);
        m26783k(mo35329a);
        C1807k m26748r = c4730d.m26748r();
        if (m26748r != null && (c1797a2 = m26748r.f5489a) != null) {
            AbstractC13078a<Integer, Integer> mo35329a2 = c1797a2.mo35329a();
            this.f12998J = mo35329a2;
            mo35329a2.m1687a(this);
            m26783k(this.f12998J);
        }
        if (m26748r != null && (c1797a = m26748r.f5490b) != null) {
            AbstractC13078a<Integer, Integer> mo35329a3 = c1797a.mo35329a();
            this.f13000L = mo35329a3;
            mo35329a3.m1687a(this);
            m26783k(this.f13000L);
        }
        if (m26748r != null && (c1798b2 = m26748r.f5491c) != null) {
            AbstractC13078a<Float, Float> mo35329a4 = c1798b2.mo35329a();
            this.f13002N = mo35329a4;
            mo35329a4.m1687a(this);
            m26783k(this.f13002N);
        }
        if (m26748r == null || (c1798b = m26748r.f5492d) == null) {
            return;
        }
        AbstractC13078a<Float, Float> mo35329a5 = c1798b.mo35329a();
        this.f13004P = mo35329a5;
        mo35329a5.m1687a(this);
        m26783k(this.f13004P);
    }

    /* renamed from: M */
    private void m26741M(C0014b.EnumC0015a enumC0015a, Canvas canvas, float f) {
        int i = C4739c.f13010a[enumC0015a.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i != 3) {
        } else {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: N */
    private String m26740N(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m26727a0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.f12994F.m10646d(j)) {
            return this.f12994F.m10644f(j);
        }
        this.f13009z.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f13009z.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = this.f13009z.toString();
        this.f12994F.m10639l(j, sb2);
        return sb2;
    }

    /* renamed from: O */
    private void m26739O(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* renamed from: P */
    private void m26738P(C0017d c0017d, Matrix matrix, float f, C0014b c0014b, Canvas canvas) {
        List<C12265d> m26731W = m26731W(c0017d);
        for (int i = 0; i < m26731W.size(); i++) {
            Path mo3148g = m26731W.get(i).mo3148g();
            mo3148g.computeBounds(this.f12989A, false);
            this.f12990B.set(matrix);
            this.f12990B.preTranslate(0.0f, (-c0014b.f61g) * C5852h.m22886e());
            this.f12990B.preScale(f, f);
            mo3148g.transform(this.f12990B);
            if (c0014b.f65k) {
                m26735S(mo3148g, this.f12991C, canvas);
                m26735S(mo3148g, this.f12992D, canvas);
            } else {
                m26735S(mo3148g, this.f12992D, canvas);
                m26735S(mo3148g, this.f12991C, canvas);
            }
        }
    }

    /* renamed from: Q */
    private void m26737Q(String str, C0014b c0014b, Canvas canvas) {
        if (c0014b.f65k) {
            m26739O(str, this.f12991C, canvas);
            m26739O(str, this.f12992D, canvas);
            return;
        }
        m26739O(str, this.f12992D, canvas);
        m26739O(str, this.f12991C, canvas);
    }

    /* renamed from: R */
    private void m26736R(String str, C0014b c0014b, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String m26740N = m26740N(str, i);
            i += m26740N.length();
            m26737Q(m26740N, c0014b, canvas);
            canvas.translate(this.f12991C.measureText(m26740N) + f, 0.0f);
        }
    }

    /* renamed from: S */
    private void m26735S(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: T */
    private void m26734T(String str, C0014b c0014b, Matrix matrix, C0016c c0016c, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            C0017d m10604f = this.f12997I.m34429c().m10604f(C0017d.m42120c(str.charAt(i), c0016c.m42126a(), c0016c.m42124c()));
            if (m10604f != null) {
                m26738P(m10604f, matrix, f2, c0014b, canvas);
                float m42121b = ((float) m10604f.m42121b()) * f2 * C5852h.m22886e() * f;
                float f3 = c0014b.f59e / 10.0f;
                AbstractC13078a<Float, Float> abstractC13078a = this.f13005Q;
                if (abstractC13078a != null) {
                    floatValue = abstractC13078a.mo1634h().floatValue();
                } else {
                    AbstractC13078a<Float, Float> abstractC13078a2 = this.f13004P;
                    if (abstractC13078a2 != null) {
                        floatValue = abstractC13078a2.mo1634h().floatValue();
                    }
                    canvas.translate(m42121b + (f3 * f), 0.0f);
                }
                f3 += floatValue;
                canvas.translate(m42121b + (f3 * f), 0.0f);
            }
        }
    }

    /* renamed from: U */
    private void m26733U(C0014b c0014b, Matrix matrix, C0016c c0016c, Canvas canvas) {
        float f;
        AbstractC13078a<Float, Float> abstractC13078a = this.f13007S;
        if (abstractC13078a != null) {
            f = abstractC13078a.mo1634h().floatValue();
        } else {
            AbstractC13078a<Float, Float> abstractC13078a2 = this.f13006R;
            if (abstractC13078a2 != null) {
                f = abstractC13078a2.mo1634h().floatValue();
            } else {
                f = c0014b.f57c;
            }
        }
        float f2 = f / 100.0f;
        float m22884g = C5852h.m22884g(matrix);
        String str = c0014b.f55a;
        float m22886e = c0014b.f60f * C5852h.m22886e();
        List<String> m26729Y = m26729Y(str);
        int size = m26729Y.size();
        for (int i = 0; i < size; i++) {
            String str2 = m26729Y.get(i);
            float m26730X = m26730X(str2, c0016c, f2, m22884g);
            canvas.save();
            m26741M(c0014b.f58d, canvas, m26730X);
            canvas.translate(0.0f, (i * m22886e) - (((size - 1) * m22886e) / 2.0f));
            m26734T(str2, c0014b, matrix, c0016c, canvas, m22884g, f2);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[LOOP:0: B:20:0x0091->B:21:0x0093, LOOP_END] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26732V(p005a4.C0014b r7, p005a4.C0016c r8, android.graphics.Matrix r9, android.graphics.Canvas r10) {
        /*
            r6 = this;
            android.graphics.Typeface r8 = r6.m26728Z(r8)
            if (r8 != 0) goto L7
            return
        L7:
            java.lang.String r9 = r7.f55a
            com.airbnb.lottie.f r0 = r6.f12996H
            r0.m34374F()
            android.graphics.Paint r0 = r6.f12991C
            r0.setTypeface(r8)
            y3.a<java.lang.Float, java.lang.Float> r8 = r6.f13007S
            if (r8 == 0) goto L22
            java.lang.Object r8 = r8.mo1634h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L33
        L22:
            y3.a<java.lang.Float, java.lang.Float> r8 = r6.f13006R
            if (r8 == 0) goto L31
            java.lang.Object r8 = r8.mo1634h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L33
        L31:
            float r8 = r7.f57c
        L33:
            android.graphics.Paint r0 = r6.f12991C
            float r1 = p130h4.C5852h.m22886e()
            float r1 = r1 * r8
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.f12992D
            android.graphics.Paint r1 = r6.f12991C
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r6.f12992D
            android.graphics.Paint r1 = r6.f12991C
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            float r0 = r7.f60f
            float r1 = p130h4.C5852h.m22886e()
            float r0 = r0 * r1
            int r1 = r7.f59e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            y3.a<java.lang.Float, java.lang.Float> r2 = r6.f13005Q
            if (r2 == 0) goto L70
            java.lang.Object r2 = r2.mo1634h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L6e:
            float r1 = r1 + r2
            goto L7f
        L70:
            y3.a<java.lang.Float, java.lang.Float> r2 = r6.f13004P
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r2.mo1634h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L6e
        L7f:
            float r2 = p130h4.C5852h.m22886e()
            float r1 = r1 * r2
            float r1 = r1 * r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r8
            java.util.List r8 = r6.m26729Y(r9)
            int r9 = r8.size()
            r2 = 0
        L91:
            if (r2 >= r9) goto Lc7
            java.lang.Object r3 = r8.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            android.graphics.Paint r4 = r6.f12992D
            float r4 = r4.measureText(r3)
            int r5 = r3.length()
            int r5 = r5 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            float r4 = r4 + r5
            r10.save()
            a4.b$a r5 = r7.f58d
            r6.m26741M(r5, r10, r4)
            int r4 = r9 + (-1)
            float r4 = (float) r4
            float r4 = r4 * r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r5 = (float) r2
            float r5 = r5 * r0
            float r5 = r5 - r4
            r4 = 0
            r10.translate(r4, r5)
            r6.m26736R(r3, r7, r10, r1)
            r10.restore()
            int r2 = r2 + 1
            goto L91
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p055d4.C4736h.m26732V(a4.b, a4.c, android.graphics.Matrix, android.graphics.Canvas):void");
    }

    /* renamed from: W */
    private List<C12265d> m26731W(C0017d c0017d) {
        if (this.f12993E.containsKey(c0017d)) {
            return this.f12993E.get(c0017d);
        }
        List<C2080n> m42122a = c0017d.m42122a();
        int size = m42122a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C12265d(this.f12996H, this, m42122a.get(i)));
        }
        this.f12993E.put(c0017d, arrayList);
        return arrayList;
    }

    /* renamed from: X */
    private float m26730X(String str, C0016c c0016c, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C0017d m10604f = this.f12997I.m34429c().m10604f(C0017d.m42120c(str.charAt(i), c0016c.m42126a(), c0016c.m42124c()));
            if (m10604f != null) {
                f3 = (float) (f3 + (m10604f.m42121b() * f * C5852h.m22886e() * f2));
            }
        }
        return f3;
    }

    /* renamed from: Y */
    private List<String> m26729Y(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: Z */
    private Typeface m26728Z(C0016c c0016c) {
        Typeface mo1634h;
        AbstractC13078a<Typeface, Typeface> abstractC13078a = this.f13008T;
        if (abstractC13078a == null || (mo1634h = abstractC13078a.mo1634h()) == null) {
            Typeface m34373G = this.f12996H.m34373G(c0016c.m42126a(), c0016c.m42124c());
            return m34373G != null ? m34373G : c0016c.m42123d();
        }
        return mo1634h;
    }

    /* renamed from: a0 */
    private boolean m26727a0(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    @Override // p055d4.AbstractC4724a, p436x3.InterfaceC12266e
    /* renamed from: b */
    public void mo3152b(RectF rectF, Matrix matrix, boolean z) {
        super.mo3152b(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f12997I.m34430b().width(), this.f12997I.m34430b().height());
    }

    @Override // p055d4.AbstractC4724a, p005a4.InterfaceC0019f
    /* renamed from: h */
    public <T> void mo3145h(T t, C6015c<T> c6015c) {
        super.mo3145h(t, c6015c);
        if (t == InterfaceC2230k.f6461a) {
            AbstractC13078a<Integer, Integer> abstractC13078a = this.f12999K;
            if (abstractC13078a != null) {
                m26790E(abstractC13078a);
            }
            if (c6015c == null) {
                this.f12999K = null;
                return;
            }
            C13099p c13099p = new C13099p(c6015c);
            this.f12999K = c13099p;
            c13099p.m1687a(this);
            m26783k(this.f12999K);
        } else if (t == InterfaceC2230k.f6462b) {
            AbstractC13078a<Integer, Integer> abstractC13078a2 = this.f13001M;
            if (abstractC13078a2 != null) {
                m26790E(abstractC13078a2);
            }
            if (c6015c == null) {
                this.f13001M = null;
                return;
            }
            C13099p c13099p2 = new C13099p(c6015c);
            this.f13001M = c13099p2;
            c13099p2.m1687a(this);
            m26783k(this.f13001M);
        } else if (t == InterfaceC2230k.f6477q) {
            AbstractC13078a<Float, Float> abstractC13078a3 = this.f13003O;
            if (abstractC13078a3 != null) {
                m26790E(abstractC13078a3);
            }
            if (c6015c == null) {
                this.f13003O = null;
                return;
            }
            C13099p c13099p3 = new C13099p(c6015c);
            this.f13003O = c13099p3;
            c13099p3.m1687a(this);
            m26783k(this.f13003O);
        } else if (t == InterfaceC2230k.f6478r) {
            AbstractC13078a<Float, Float> abstractC13078a4 = this.f13005Q;
            if (abstractC13078a4 != null) {
                m26790E(abstractC13078a4);
            }
            if (c6015c == null) {
                this.f13005Q = null;
                return;
            }
            C13099p c13099p4 = new C13099p(c6015c);
            this.f13005Q = c13099p4;
            c13099p4.m1687a(this);
            m26783k(this.f13005Q);
        } else if (t == InterfaceC2230k.f6456D) {
            AbstractC13078a<Float, Float> abstractC13078a5 = this.f13007S;
            if (abstractC13078a5 != null) {
                m26790E(abstractC13078a5);
            }
            if (c6015c == null) {
                this.f13007S = null;
                return;
            }
            C13099p c13099p5 = new C13099p(c6015c);
            this.f13007S = c13099p5;
            c13099p5.m1687a(this);
            m26783k(this.f13007S);
        } else if (t == InterfaceC2230k.f6459G) {
            AbstractC13078a<Typeface, Typeface> abstractC13078a6 = this.f13008T;
            if (abstractC13078a6 != null) {
                m26790E(abstractC13078a6);
            }
            if (c6015c == null) {
                this.f13008T = null;
                return;
            }
            C13099p c13099p6 = new C13099p(c6015c);
            this.f13008T = c13099p6;
            c13099p6.m1687a(this);
            m26783k(this.f13008T);
        }
    }

    @Override // p055d4.AbstractC4724a
    /* renamed from: v */
    void mo26726v(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f12996H.m34328m0()) {
            canvas.concat(matrix);
        }
        C0014b mo1634h = this.f12995G.mo1634h();
        C0016c c0016c = this.f12997I.m34425g().get(mo1634h.f56b);
        if (c0016c == null) {
            canvas.restore();
            return;
        }
        AbstractC13078a<Integer, Integer> abstractC13078a = this.f12999K;
        if (abstractC13078a != null) {
            this.f12991C.setColor(abstractC13078a.mo1634h().intValue());
        } else {
            AbstractC13078a<Integer, Integer> abstractC13078a2 = this.f12998J;
            if (abstractC13078a2 != null) {
                this.f12991C.setColor(abstractC13078a2.mo1634h().intValue());
            } else {
                this.f12991C.setColor(mo1634h.f62h);
            }
        }
        AbstractC13078a<Integer, Integer> abstractC13078a3 = this.f13001M;
        if (abstractC13078a3 != null) {
            this.f12992D.setColor(abstractC13078a3.mo1634h().intValue());
        } else {
            AbstractC13078a<Integer, Integer> abstractC13078a4 = this.f13000L;
            if (abstractC13078a4 != null) {
                this.f12992D.setColor(abstractC13078a4.mo1634h().intValue());
            } else {
                this.f12992D.setColor(mo1634h.f63i);
            }
        }
        int intValue = ((this.f12942v.m1638h() == null ? 100 : this.f12942v.m1638h().mo1634h().intValue()) * 255) / 100;
        this.f12991C.setAlpha(intValue);
        this.f12992D.setAlpha(intValue);
        AbstractC13078a<Float, Float> abstractC13078a5 = this.f13003O;
        if (abstractC13078a5 != null) {
            this.f12992D.setStrokeWidth(abstractC13078a5.mo1634h().floatValue());
        } else {
            AbstractC13078a<Float, Float> abstractC13078a6 = this.f13002N;
            if (abstractC13078a6 != null) {
                this.f12992D.setStrokeWidth(abstractC13078a6.mo1634h().floatValue());
            } else {
                this.f12992D.setStrokeWidth(mo1634h.f64j * C5852h.m22886e() * C5852h.m22884g(matrix));
            }
        }
        if (this.f12996H.m34328m0()) {
            m26733U(mo1634h, matrix, c0016c, canvas);
        } else {
            m26732V(mo1634h, c0016c, matrix, canvas);
        }
        canvas.restore();
    }
}
