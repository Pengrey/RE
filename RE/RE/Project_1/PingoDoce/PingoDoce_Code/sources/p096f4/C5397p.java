package p096f4;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p116g4.AbstractC5604c;

/* renamed from: f4.p */
/* loaded from: classes.dex */
class C5397p {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14852a = AbstractC5604c.C5605a.m23609a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonUtils.java */
    /* renamed from: f4.p$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5398a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14853a;

        static {
            int[] iArr = new int[AbstractC5604c.EnumC5606b.values().length];
            f14853a = iArr;
            try {
                iArr[AbstractC5604c.EnumC5606b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14853a[AbstractC5604c.EnumC5606b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14853a[AbstractC5604c.EnumC5606b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    private static PointF m24424a(AbstractC5604c abstractC5604c, float f) throws IOException {
        abstractC5604c.mo23592c();
        float mo23603F = (float) abstractC5604c.mo23603F();
        float mo23603F2 = (float) abstractC5604c.mo23603F();
        while (abstractC5604c.mo23596R() != AbstractC5604c.EnumC5606b.END_ARRAY) {
            abstractC5604c.mo23593b0();
        }
        abstractC5604c.mo23589h();
        return new PointF(mo23603F * f, mo23603F2 * f);
    }

    /* renamed from: b */
    private static PointF m24423b(AbstractC5604c abstractC5604c, float f) throws IOException {
        float mo23603F = (float) abstractC5604c.mo23603F();
        float mo23603F2 = (float) abstractC5604c.mo23603F();
        while (abstractC5604c.mo23580y()) {
            abstractC5604c.mo23593b0();
        }
        return new PointF(mo23603F * f, mo23603F2 * f);
    }

    /* renamed from: c */
    private static PointF m24422c(AbstractC5604c abstractC5604c, float f) throws IOException {
        abstractC5604c.mo23591e();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14852a);
            if (mo23595X == 0) {
                f2 = m24418g(abstractC5604c);
            } else if (mo23595X != 1) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                f3 = m24418g(abstractC5604c);
            }
        }
        abstractC5604c.mo23584t();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m24421d(AbstractC5604c abstractC5604c) throws IOException {
        abstractC5604c.mo23592c();
        int mo23603F = (int) (abstractC5604c.mo23603F() * 255.0d);
        int mo23603F2 = (int) (abstractC5604c.mo23603F() * 255.0d);
        int mo23603F3 = (int) (abstractC5604c.mo23603F() * 255.0d);
        while (abstractC5604c.mo23580y()) {
            abstractC5604c.mo23593b0();
        }
        abstractC5604c.mo23589h();
        return Color.argb(255, mo23603F, mo23603F2, mo23603F3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static PointF m24420e(AbstractC5604c abstractC5604c, float f) throws IOException {
        int i = C5398a.f14853a[abstractC5604c.mo23596R().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m24422c(abstractC5604c, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + abstractC5604c.mo23596R());
            }
            return m24424a(abstractC5604c, f);
        }
        return m24423b(abstractC5604c, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static List<PointF> m24419f(AbstractC5604c abstractC5604c, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC5604c.mo23592c();
        while (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_ARRAY) {
            abstractC5604c.mo23592c();
            arrayList.add(m24420e(abstractC5604c, f));
            abstractC5604c.mo23589h();
        }
        abstractC5604c.mo23589h();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m24418g(AbstractC5604c abstractC5604c) throws IOException {
        AbstractC5604c.EnumC5606b mo23596R = abstractC5604c.mo23596R();
        int i = C5398a.f14853a[mo23596R.ordinal()];
        if (i != 1) {
            if (i == 2) {
                abstractC5604c.mo23592c();
                float mo23603F = (float) abstractC5604c.mo23603F();
                while (abstractC5604c.mo23580y()) {
                    abstractC5604c.mo23593b0();
                }
                abstractC5604c.mo23589h();
                return mo23603F;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + mo23596R);
        }
        return (float) abstractC5604c.mo23603F();
    }
}
