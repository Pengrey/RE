package p002a1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0945d;
import androidx.core.content.res.C0967k;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p181jd.Intrinsics;
import p393v0.AbstractC11057s;
import p393v0.Brush;
import p393v0.C11003c0;
import p393v0.C11012e1;
import p393v0.C11018f1;
import p393v0.C11047p;
import p393v0.C11059s0;
import p393v0.C11061t;
import p393v0.Color;
import p478z0.AbstractC13505e;
import p478z0.C13565o;
import p478z0.ImageVector;
import p479z1.C13605g;

/* compiled from: XmlVectorParser.android.kt */
/* renamed from: a1.c */
/* loaded from: classes.dex */
public final class C0009c {

    /* renamed from: a */
    private static final int f51a = 0;

    /* renamed from: a */
    public static final ImageVector.C13500a m42143a(C0007a c0007a, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long m6632f;
        int m6324z;
        Intrinsics.isThisObjectNull(c0007a, "<this>");
        Intrinsics.isThisObjectNull(resources, "res");
        Intrinsics.isThisObjectNull(attributeSet, "attrs");
        C0008b c0008b = C0008b.f19a;
        TypedArray m42179k = c0007a.m42179k(resources, theme, attributeSet, c0008b.m42173E());
        float m42183g = c0007a.m42183g(m42179k, "viewportWidth", c0008b.m42171G(), 0.0f);
        float m42183g2 = c0007a.m42183g(m42179k, "viewportHeight", c0008b.m42172F(), 0.0f);
        if (m42183g > 0.0f) {
            if (m42183g2 > 0.0f) {
                float m42188b = c0007a.m42188b(m42179k, c0008b.m42170H(), 0.0f);
                float m42188b2 = c0007a.m42188b(m42179k, c0008b.m42157m(), 0.0f);
                if (m42179k.hasValue(c0008b.m42175C())) {
                    TypedValue typedValue = new TypedValue();
                    m42179k.getValue(c0008b.m42175C(), typedValue);
                    if (typedValue.type == 2) {
                        m6632f = Color.f28297b.m6632f();
                    } else {
                        ColorStateList m42185e = c0007a.m42185e(m42179k, theme, "tint", c0008b.m42175C());
                        if (m42185e != null) {
                            m6632f = C11003c0.m6594b(m42185e.getDefaultColor());
                        } else {
                            m6632f = Color.f28297b.m6632f();
                        }
                    }
                } else {
                    m6632f = Color.f28297b.m6632f();
                }
                long j = m6632f;
                int m42186d = c0007a.m42186d(m42179k, c0008b.m42174D(), -1);
                if (m42186d == -1) {
                    m6324z = C11047p.f28401a.m6324z();
                } else if (m42186d == 3) {
                    m6324z = C11047p.f28401a.m6351B();
                } else if (m42186d == 5) {
                    m6324z = C11047p.f28401a.m6324z();
                } else if (m42186d != 9) {
                    switch (m42186d) {
                        case 14:
                            m6324z = C11047p.f28401a.m6333q();
                            break;
                        case 15:
                            m6324z = C11047p.f28401a.m6328v();
                            break;
                        case 16:
                            m6324z = C11047p.f28401a.m6330t();
                            break;
                        default:
                            m6324z = C11047p.f28401a.m6324z();
                            break;
                    }
                } else {
                    m6324z = C11047p.f28401a.m6325y();
                }
                int i = m6324z;
                float m875g = C13605g.m875g(m42188b / resources.getDisplayMetrics().density);
                float m875g2 = C13605g.m875g(m42188b2 / resources.getDisplayMetrics().density);
                m42179k.recycle();
                return new ImageVector.C13500a(null, m875g, m875g2, m42183g, m42183g2, j, i, 1, null);
            }
            throw new XmlPullParserException(Intrinsics.addStrAndObj(m42179k.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
        }
        throw new XmlPullParserException(Intrinsics.addStrAndObj(m42179k.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
    }

    /* renamed from: b */
    private static final int m42142b(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? i2 : C11012e1.f28346b.m6535c();
            }
            return C11012e1.f28346b.m6536b();
        }
        return C11012e1.f28346b.m6537a();
    }

    /* renamed from: c */
    private static final int m42141c(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? i2 : C11018f1.f28366b.m6514a();
            }
            return C11018f1.f28366b.m6512c();
        }
        return C11018f1.f28366b.m6513b();
    }

    /* renamed from: d */
    public static final boolean m42140d(XmlPullParser xmlPullParser) {
        Intrinsics.isThisObjectNull(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    /* renamed from: e */
    private static final AbstractC11057s m42139e(C0945d c0945d) {
        if (c0945d.m39028l()) {
            Shader m39034f = c0945d.m39034f();
            if (m39034f != null) {
                return C11061t.m6281a(m39034f);
            }
            return new Brush(C11003c0.m6594b(c0945d.m39035e()), null);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m42138f(C0007a c0007a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.C13500a c13500a) {
        Intrinsics.isThisObjectNull(c0007a, "<this>");
        Intrinsics.isThisObjectNull(resources, "res");
        Intrinsics.isThisObjectNull(attributeSet, "attrs");
        Intrinsics.isThisObjectNull(c13500a, "builder");
        C0008b c0008b = C0008b.f19a;
        TypedArray m42179k = c0007a.m42179k(resources, theme, attributeSet, c0008b.m42169a());
        String m42181i = c0007a.m42181i(m42179k, c0008b.m42168b());
        if (m42181i == null) {
            m42181i = BuildConfig.VERSION_NAME;
        }
        List<AbstractC13505e> m981a = C13565o.m981a(c0007a.m42181i(m42179k, c0008b.m42167c()));
        m42179k.recycle();
        ImageVector.C13500a.m1226b(c13500a, m42181i, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, m981a, 254, null);
    }

    /* renamed from: g */
    public static final int m42137g(C0007a c0007a, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.C13500a c13500a, int i) {
        Intrinsics.isThisObjectNull(c0007a, "<this>");
        Intrinsics.isThisObjectNull(resources, "res");
        Intrinsics.isThisObjectNull(attributeSet, "attrs");
        Intrinsics.isThisObjectNull(c13500a, "builder");
        int eventType = c0007a.m42180j().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && Intrinsics.equals("group", c0007a.m42180j().getName())) {
                int i2 = i + 1;
                int i3 = 0;
                while (i3 < i2) {
                    i3++;
                    c13500a.m1222f();
                }
                return 0;
            }
            return i;
        }
        String name = c0007a.m42180j().getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode == -1649314686) {
                if (name.equals("clip-path")) {
                    m42138f(c0007a, resources, theme, attributeSet, c13500a);
                    return i + 1;
                }
                return i;
            } else if (hashCode == 3433509) {
                if (name.equals("path")) {
                    m42135i(c0007a, resources, theme, attributeSet, c13500a);
                    return i;
                }
                return i;
            } else if (hashCode == 98629247 && name.equals("group")) {
                m42136h(c0007a, resources, theme, attributeSet, c13500a);
                return i;
            } else {
                return i;
            }
        }
        return i;
    }

    /* renamed from: h */
    public static final void m42136h(C0007a c0007a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.C13500a c13500a) {
        Intrinsics.isThisObjectNull(c0007a, "<this>");
        Intrinsics.isThisObjectNull(resources, "res");
        Intrinsics.isThisObjectNull(attributeSet, "attrs");
        Intrinsics.isThisObjectNull(c13500a, "builder");
        C0008b c0008b = C0008b.f19a;
        TypedArray m42179k = c0007a.m42179k(resources, theme, attributeSet, c0008b.m42166d());
        float m42183g = c0007a.m42183g(m42179k, "rotation", c0008b.m42162h(), 0.0f);
        float m42187c = c0007a.m42187c(m42179k, c0008b.m42164f(), 0.0f);
        float m42187c2 = c0007a.m42187c(m42179k, c0008b.m42163g(), 0.0f);
        float m42183g2 = c0007a.m42183g(m42179k, "scaleX", c0008b.m42161i(), 1.0f);
        float m42183g3 = c0007a.m42183g(m42179k, "scaleY", c0008b.m42160j(), 1.0f);
        float m42183g4 = c0007a.m42183g(m42179k, "translateX", c0008b.m42159k(), 0.0f);
        float m42183g5 = c0007a.m42183g(m42179k, "translateY", c0008b.m42158l(), 0.0f);
        String m42181i = c0007a.m42181i(m42179k, c0008b.m42165e());
        if (m42181i == null) {
            m42181i = BuildConfig.VERSION_NAME;
        }
        m42179k.recycle();
        c13500a.m1227a(m42181i, m42183g, m42187c, m42187c2, m42183g2, m42183g3, m42183g4, m42183g5, C13565o.m977e());
    }

    /* renamed from: i */
    public static final void m42135i(C0007a c0007a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.C13500a c13500a) throws IllegalArgumentException {
        Intrinsics.isThisObjectNull(c0007a, "<this>");
        Intrinsics.isThisObjectNull(resources, "res");
        Intrinsics.isThisObjectNull(attributeSet, "attrs");
        Intrinsics.isThisObjectNull(c13500a, "builder");
        C0008b c0008b = C0008b.f19a;
        TypedArray m42179k = c0007a.m42179k(resources, theme, attributeSet, c0008b.m42156n());
        if (C0967k.m38962j(c0007a.m42180j(), "pathData")) {
            String m42181i = c0007a.m42181i(m42179k, c0008b.m42153q());
            if (m42181i == null) {
                m42181i = BuildConfig.VERSION_NAME;
            }
            String str = m42181i;
            List<AbstractC13505e> m981a = C13565o.m981a(c0007a.m42181i(m42179k, c0008b.m42152r()));
            C0945d m42184f = c0007a.m42184f(m42179k, theme, "fillColor", c0008b.m42154p(), 0);
            float m42183g = c0007a.m42183g(m42179k, "fillAlpha", c0008b.m42155o(), 1.0f);
            int m42142b = m42142b(c0007a.m42182h(m42179k, "strokeLineCap", c0008b.m42149u(), -1), C11012e1.f28346b.m6537a());
            int m42141c = m42141c(c0007a.m42182h(m42179k, "strokeLineJoin", c0008b.m42148v(), -1), C11018f1.f28366b.m6514a());
            float m42183g2 = c0007a.m42183g(m42179k, "strokeMiterLimit", c0008b.m42147w(), 1.0f);
            C0945d m42184f2 = c0007a.m42184f(m42179k, theme, "strokeColor", c0008b.m42150t(), 0);
            float m42183g3 = c0007a.m42183g(m42179k, "strokeAlpha", c0008b.m42151s(), 1.0f);
            float m42183g4 = c0007a.m42183g(m42179k, "strokeWidth", c0008b.m42146x(), 1.0f);
            float m42183g5 = c0007a.m42183g(m42179k, "trimPathEnd", c0008b.m42145y(), 1.0f);
            float m42183g6 = c0007a.m42183g(m42179k, "trimPathOffset", c0008b.m42177A(), 0.0f);
            float m42183g7 = c0007a.m42183g(m42179k, "trimPathStart", c0008b.m42176B(), 0.0f);
            int m42182h = c0007a.m42182h(m42179k, "fillType", c0008b.m42144z(), f51a);
            m42179k.recycle();
            AbstractC11057s m42139e = m42139e(m42184f);
            AbstractC11057s m42139e2 = m42139e(m42184f2);
            C11059s0.C11060a c11060a = C11059s0.f28438b;
            c13500a.m1225c(m981a, m42182h == 0 ? c11060a.m6282b() : c11060a.m6283a(), str, m42139e, m42183g, m42139e2, m42183g3, m42183g4, m42142b, m42141c, m42183g2, m42183g7, m42183g5, m42183g6);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    /* renamed from: j */
    public static final XmlPullParser m42134j(XmlPullParser xmlPullParser) throws XmlPullParserException {
        Intrinsics.isThisObjectNull(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
