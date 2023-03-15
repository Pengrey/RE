package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.C0967k;
import androidx.core.graphics.C0972c;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.e */
/* loaded from: classes.dex */
public class C1699e {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatorInflaterCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.e$a */
    /* loaded from: classes.dex */
    public static class C1700a implements TypeEvaluator<C0972c.C0974b[]> {

        /* renamed from: a */
        private C0972c.C0974b[] f5172a;

        C1700a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C0972c.C0974b[] evaluate(float f, C0972c.C0974b[] c0974bArr, C0972c.C0974b[] c0974bArr2) {
            if (C0972c.m38931b(c0974bArr, c0974bArr2)) {
                if (!C0972c.m38931b(this.f5172a, c0974bArr)) {
                    this.f5172a = C0972c.m38927f(c0974bArr);
                }
                for (int i = 0; i < c0974bArr.length; i++) {
                    this.f5172a[i].m38919d(c0974bArr[i], c0974bArr2[i], f);
                }
                return this.f5172a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m35682a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return m35681b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m35681b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1699e.m35681b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m35680c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: d */
    private static void m35679d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m35678e(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        float f;
        PropertyValuesHolder ofFloat;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m35675h(i7)) || (z2 && m35675h(i8))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0972c.C0974b[] m38929d = C0972c.m38929d(string);
            C0972c.C0974b[] m38929d2 = C0972c.m38929d(string2);
            if (m38929d == null && m38929d2 == null) {
                return null;
            }
            if (m38929d == null) {
                if (m38929d2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C1700a(), m38929d2);
                }
                return null;
            }
            C1700a c1700a = new C1700a();
            if (m38929d2 != null) {
                if (C0972c.m38931b(m38929d, m38929d2)) {
                    ofObject = PropertyValuesHolder.ofObject(str, c1700a, m38929d, m38929d2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, c1700a, m38929d);
            }
            return ofObject;
        }
        C1701f m35662a = i == 3 ? C1701f.m35662a() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (m35675h(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m35675h(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5);
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (m35675h(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i4);
        }
        if (propertyValuesHolder == null || m35662a == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(m35662a);
        return propertyValuesHolder;
    }

    /* renamed from: f */
    private static int m35677f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && m35675h(i3)) || (z2 && m35675h(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    private static int m35676g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5158j);
        int i = 0;
        TypedValue m38960l = C0967k.m38960l(m38961k, xmlPullParser, "value", 0);
        if ((m38960l != null) && m35675h(m38960l.type)) {
            i = 3;
        }
        m38961k.recycle();
        return i;
    }

    /* renamed from: h */
    private static boolean m35675h(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: i */
    public static Animator m35674i(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m35673j(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: j */
    public static Animator m35673j(Context context, Resources resources, Resources.Theme theme, int i) throws Resources.NotFoundException {
        return m35672k(context, resources, theme, i, 1.0f);
    }

    /* renamed from: k */
    public static Animator m35672k(Context context, Resources resources, Resources.Theme theme, int i, float f) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m35682a(context, resources, theme, xmlResourceParser, f);
                } catch (IOException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m35671l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5155g);
        TypedArray m38961k2 = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5159k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m35666q(valueAnimator, m38961k, m38961k2, f, xmlPullParser);
        int m38964h = C0967k.m38964h(m38961k, xmlPullParser, "interpolator", 0, 0);
        if (m38964h > 0) {
            valueAnimator.setInterpolator(C1698d.m35683b(context, m38964h));
        }
        m38961k.recycle();
        if (m38961k2 != null) {
            m38961k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m35670m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe ofInt;
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5158j);
        float m38966f = C0967k.m38966f(m38961k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m38960l = C0967k.m38960l(m38961k, xmlPullParser, "value", 0);
        boolean z = m38960l != null;
        if (i == 4) {
            i = (z && m35675h(m38960l.type)) ? 3 : 0;
        }
        if (z) {
            if (i != 0) {
                ofInt = (i == 1 || i == 3) ? Keyframe.ofInt(m38966f, C0967k.m38965g(m38961k, xmlPullParser, "value", 0, 0)) : null;
            } else {
                ofInt = Keyframe.ofFloat(m38966f, C0967k.m38966f(m38961k, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i == 0) {
            ofInt = Keyframe.ofFloat(m38966f);
        } else {
            ofInt = Keyframe.ofInt(m38966f);
        }
        int m38964h = C0967k.m38964h(m38961k, xmlPullParser, "interpolator", 1, 0);
        if (m38964h > 0) {
            ofInt.setInterpolator(C1698d.m35683b(context, m38964h));
        }
        m38961k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m35669n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m35671l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m35668o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m35676g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m35670m = m35670m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m35670m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m35670m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m35680c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m35680c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m35679d(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C1701f.m35662a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m35667p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5157i);
                    String m38963i = C0967k.m38963i(m38961k, xmlPullParser, "propertyName", 3);
                    int m38965g = C0967k.m38965g(m38961k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m35668o = m35668o(context, resources, theme, xmlPullParser, m38963i, m38965g);
                    if (m35668o == null) {
                        m35668o = m35678e(m38961k, m38965g, 0, 1, m38963i);
                    }
                    if (m35668o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m35668o);
                    }
                    m38961k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m35666q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m38965g = C0967k.m38965g(typedArray, xmlPullParser, "duration", 1, 300);
        long m38965g2 = C0967k.m38965g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m38965g3 = C0967k.m38965g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0967k.m38962j(xmlPullParser, "valueFrom") && C0967k.m38962j(xmlPullParser, "valueTo")) {
            if (m38965g3 == 4) {
                m38965g3 = m35677f(typedArray, 5, 6);
            }
            PropertyValuesHolder m35678e = m35678e(typedArray, m38965g3, 5, 6, BuildConfig.VERSION_NAME);
            if (m35678e != null) {
                valueAnimator.setValues(m35678e);
            }
        }
        valueAnimator.setDuration(m38965g);
        valueAnimator.setStartDelay(m38965g2);
        valueAnimator.setRepeatCount(C0967k.m38965g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0967k.m38965g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m35665r(valueAnimator, typedArray2, m38965g3, f, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m35665r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m38963i = C0967k.m38963i(typedArray, xmlPullParser, "pathData", 1);
        if (m38963i != null) {
            String m38963i2 = C0967k.m38963i(typedArray, xmlPullParser, "propertyXName", 2);
            String m38963i3 = C0967k.m38963i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (m38963i2 == null && m38963i3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m35664s(C0972c.m38928e(m38963i), objectAnimator, f * 0.5f, m38963i2, m38963i3);
            return;
        }
        objectAnimator.setPropertyName(C0967k.m38963i(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: s */
    private static void m35664s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
