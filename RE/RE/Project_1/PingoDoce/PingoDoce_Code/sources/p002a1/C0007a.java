package p002a1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.res.C0945d;
import androidx.core.content.res.C0967k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import p181jd.Intrinsics;

/* compiled from: XmlVectorParser.android.kt */
/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class C0007a {

    /* renamed from: a */
    private final XmlPullParser f14a;

    /* renamed from: b */
    private int f15b;

    public C0007a(XmlPullParser xmlPullParser, int i) {
        Intrinsics.isThisObjectNull(xmlPullParser, "xmlParser");
        this.f14a = xmlPullParser;
        this.f15b = i;
    }

    /* renamed from: l */
    private final void m42178l(int i) {
        this.f15b = i | this.f15b;
    }

    /* renamed from: a */
    public final int m42189a() {
        return this.f15b;
    }

    /* renamed from: b */
    public final float m42188b(TypedArray typedArray, int i, float f) {
        Intrinsics.isThisObjectNull(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i, f);
        m42178l(typedArray.getChangingConfigurations());
        return dimension;
    }

    /* renamed from: c */
    public final float m42187c(TypedArray typedArray, int i, float f) {
        Intrinsics.isThisObjectNull(typedArray, "typedArray");
        float f2 = typedArray.getFloat(i, f);
        m42178l(typedArray.getChangingConfigurations());
        return f2;
    }

    /* renamed from: d */
    public final int m42186d(TypedArray typedArray, int i, int i2) {
        Intrinsics.isThisObjectNull(typedArray, "typedArray");
        int i3 = typedArray.getInt(i, i2);
        m42178l(typedArray.getChangingConfigurations());
        return i3;
    }

    /* renamed from: e */
    public final ColorStateList m42185e(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        Intrinsics.isThisObjectNull(typedArray, "typedArray");
        Intrinsics.isThisObjectNull(str, "attrName");
        ColorStateList m38969c = C0967k.m38969c(typedArray, m42180j(), theme, str, i);
        m42178l(typedArray.getChangingConfigurations());
        return m38969c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0007a) {
            C0007a c0007a = (C0007a) obj;
            return Intrinsics.equals(this.f14a, c0007a.f14a) && this.f15b == c0007a.f15b;
        }
        return false;
    }

    /* renamed from: f */
    public final C0945d m42184f(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        Intrinsics.isThisObjectNull(typedArray, "typedArray");
        Intrinsics.isThisObjectNull(str, "attrName");
        C0945d m38967e = C0967k.m38967e(typedArray, m42180j(), theme, str, i, i2);
        m42178l(typedArray.getChangingConfigurations());
        Intrinsics.checkIfNull(m38967e, "result");
        return m38967e;
    }

    /* renamed from: g */
    public final float m42183g(TypedArray typedArray, String str, int i, float f) {
        Intrinsics.isThisObjectNull(typedArray, "typedArray");
        Intrinsics.isThisObjectNull(str, "attrName");
        float m38966f = C0967k.m38966f(typedArray, m42180j(), str, i, f);
        m42178l(typedArray.getChangingConfigurations());
        return m38966f;
    }

    /* renamed from: h */
    public final int m42182h(TypedArray typedArray, String str, int i, int i2) {
        Intrinsics.isThisObjectNull(typedArray, "typedArray");
        Intrinsics.isThisObjectNull(str, "attrName");
        int m38965g = C0967k.m38965g(typedArray, m42180j(), str, i, i2);
        m42178l(typedArray.getChangingConfigurations());
        return m38965g;
    }

    public int hashCode() {
        return (this.f14a.hashCode() * 31) + Integer.hashCode(this.f15b);
    }

    /* renamed from: i */
    public final String m42181i(TypedArray typedArray, int i) {
        Intrinsics.isThisObjectNull(typedArray, "typedArray");
        String string = typedArray.getString(i);
        m42178l(typedArray.getChangingConfigurations());
        return string;
    }

    /* renamed from: j */
    public final XmlPullParser m42180j() {
        return this.f14a;
    }

    /* renamed from: k */
    public final TypedArray m42179k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        Intrinsics.isThisObjectNull(resources, "res");
        Intrinsics.isThisObjectNull(attributeSet, "set");
        Intrinsics.isThisObjectNull(iArr, "attrs");
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, iArr);
        Intrinsics.checkIfNull(m38961k, "obtainAttributes(\n      …          attrs\n        )");
        m42178l(m38961k.getChangingConfigurations());
        return m38961k;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f14a + ", config=" + this.f15b + ')';
    }

    public /* synthetic */ C0007a(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
