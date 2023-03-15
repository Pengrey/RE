package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p128h2.C5817d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.f */
/* loaded from: classes.dex */
public final class C0952f {
    /* renamed from: a */
    private static C0953a m39007a(C0953a c0953a, int i, int i2, boolean z, int i3) {
        if (c0953a != null) {
            return c0953a;
        }
        if (z) {
            return new C0953a(i, i3, i2);
        }
        return new C0953a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Shader m39006b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C5817d.f16215z);
            float m38966f = C0967k.m38966f(m38961k, xmlPullParser, "startX", C5817d.f16183I, 0.0f);
            float m38966f2 = C0967k.m38966f(m38961k, xmlPullParser, "startY", C5817d.f16184J, 0.0f);
            float m38966f3 = C0967k.m38966f(m38961k, xmlPullParser, "endX", C5817d.f16185K, 0.0f);
            float m38966f4 = C0967k.m38966f(m38961k, xmlPullParser, "endY", C5817d.f16186L, 0.0f);
            float m38966f5 = C0967k.m38966f(m38961k, xmlPullParser, "centerX", C5817d.f16178D, 0.0f);
            float m38966f6 = C0967k.m38966f(m38961k, xmlPullParser, "centerY", C5817d.f16179E, 0.0f);
            int m38965g = C0967k.m38965g(m38961k, xmlPullParser, "type", C5817d.f16177C, 0);
            int m38970b = C0967k.m38970b(m38961k, xmlPullParser, "startColor", C5817d.f16175A, 0);
            boolean m38962j = C0967k.m38962j(xmlPullParser, "centerColor");
            int m38970b2 = C0967k.m38970b(m38961k, xmlPullParser, "centerColor", C5817d.f16182H, 0);
            int m38970b3 = C0967k.m38970b(m38961k, xmlPullParser, "endColor", C5817d.f16176B, 0);
            int m38965g2 = C0967k.m38965g(m38961k, xmlPullParser, "tileMode", C5817d.f16181G, 0);
            float m38966f7 = C0967k.m38966f(m38961k, xmlPullParser, "gradientRadius", C5817d.f16180F, 0.0f);
            m38961k.recycle();
            C0953a m39007a = m39007a(m39005c(resources, xmlPullParser, attributeSet, theme), m38970b, m38970b3, m38962j, m38970b2);
            if (m38965g != 1) {
                if (m38965g != 2) {
                    return new LinearGradient(m38966f, m38966f2, m38966f3, m38966f4, m39007a.f3221a, m39007a.f3222b, m39004d(m38965g2));
                }
                return new SweepGradient(m38966f5, m38966f6, m39007a.f3221a, m39007a.f3222b);
            } else if (m38966f7 > 0.0f) {
                return new RadialGradient(m38966f5, m38966f6, m38966f7, m39007a.f3221a, m39007a.f3222b, m39004d(m38965g2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.C0952f.C0953a m39005c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p128h2.C5817d.f16187M
            android.content.res.TypedArray r3 = androidx.core.content.res.C0967k.m38961k(r9, r12, r11, r3)
            int r5 = p128h2.C5817d.f16188N
            boolean r6 = r3.hasValue(r5)
            int r7 = p128h2.C5817d.f16189O
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0952f.m39005c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m39004d(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradientColorInflaterCompat.java */
    /* renamed from: androidx.core.content.res.f$a */
    /* loaded from: classes.dex */
    public static final class C0953a {

        /* renamed from: a */
        final int[] f3221a;

        /* renamed from: b */
        final float[] f3222b;

        C0953a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f3221a = new int[size];
            this.f3222b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f3221a[i] = list.get(i).intValue();
                this.f3222b[i] = list2.get(i).floatValue();
            }
        }

        C0953a(int i, int i2) {
            this.f3221a = new int[]{i, i2};
            this.f3222b = new float[]{0.0f, 1.0f};
        }

        C0953a(int i, int i2, int i3) {
            this.f3221a = new int[]{i, i2, i3};
            this.f3222b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
