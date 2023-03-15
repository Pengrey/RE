package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.k */
/* loaded from: classes.dex */
public class C0967k {
    /* renamed from: a */
    public static boolean m38971a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m38962j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m38970b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m38962j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m38969c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (m38962j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                if (i2 >= 28 && i2 <= 31) {
                    return m38968d(typedValue);
                }
                return C0944c.m39044d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    /* renamed from: d */
    private static ColorStateList m38968d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C0945d m38967e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m38962j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0945d.m39038b(typedValue.data);
            }
            C0945d m39033g = C0945d.m39033g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m39033g != null) {
                return m39033g;
            }
        }
        return C0945d.m39038b(i2);
    }

    /* renamed from: f */
    public static float m38966f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m38962j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m38965g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m38962j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m38964h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m38962j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m38963i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m38962j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m38962j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m38961k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m38960l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m38962j(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}
