package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.d */
/* loaded from: classes.dex */
public final class C0945d {

    /* renamed from: a */
    private final Shader f3207a;

    /* renamed from: b */
    private final ColorStateList f3208b;

    /* renamed from: c */
    private int f3209c;

    private C0945d(Shader shader, ColorStateList colorStateList, int i) {
        this.f3207a = shader;
        this.f3208b = colorStateList;
        this.f3209c = i;
    }

    /* renamed from: a */
    private static C0945d m39039a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return m39036d(C0952f.m39006b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m39037c(C0944c.m39046b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0945d m39038b(int i) {
        return new C0945d(null, null, i);
    }

    /* renamed from: c */
    static C0945d m39037c(ColorStateList colorStateList) {
        return new C0945d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0945d m39036d(Shader shader) {
        return new C0945d(shader, null, 0);
    }

    /* renamed from: g */
    public static C0945d m39033g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m39039a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int m39035e() {
        return this.f3209c;
    }

    /* renamed from: f */
    public Shader m39034f() {
        return this.f3207a;
    }

    /* renamed from: h */
    public boolean m39032h() {
        return this.f3207a != null;
    }

    /* renamed from: i */
    public boolean m39031i() {
        ColorStateList colorStateList;
        return this.f3207a == null && (colorStateList = this.f3208b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m39030j(int[] iArr) {
        if (m39031i()) {
            ColorStateList colorStateList = this.f3208b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3209c) {
                this.f3209c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m39029k(int i) {
        this.f3209c = i;
    }

    /* renamed from: l */
    public boolean m39028l() {
        return m39032h() || this.f3209c != 0;
    }
}
