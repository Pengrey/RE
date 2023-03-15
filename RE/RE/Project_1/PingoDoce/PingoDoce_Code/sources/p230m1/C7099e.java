package p230m1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
import p002a1.C0007a;
import p002a1.C0009c;
import p181jd.Intrinsics;
import p230m1.C7094b;
import p478z0.ImageVector;

/* compiled from: VectorResources.android.kt */
/* renamed from: m1.e */
/* loaded from: classes.dex */
public final class C7099e {
    /* renamed from: a */
    public static final C7094b.C7095a m19305a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser) throws XmlPullParserException {
        Intrinsics.isThisObjectNull(resources, "res");
        Intrinsics.isThisObjectNull(xmlResourceParser, "parser");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C0007a c0007a = new C0007a(xmlResourceParser, 0, 2, null);
        Intrinsics.checkIfNull(asAttributeSet, "attrs");
        ImageVector.C13500a m42143a = C0009c.m42143a(c0007a, resources, theme, asAttributeSet);
        int i = 0;
        while (!C0009c.m42140d(xmlResourceParser)) {
            i = C0009c.m42137g(c0007a, resources, asAttributeSet, theme, m42143a, i);
            xmlResourceParser.next();
        }
        return new C7094b.C7095a(m42143a.m1223e(), c0007a.m42189a());
    }
}
