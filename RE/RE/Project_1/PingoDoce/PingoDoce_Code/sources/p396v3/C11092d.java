package p396v3;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Xml;
import androidx.core.content.C0928a;
import androidx.core.content.res.C0955h;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1491v;
import androidx.vectordrawable.graphics.drawable.C1694c;
import androidx.vectordrawable.graphics.drawable.C1704i;
import org.xmlpull.v1.XmlPullParserException;
import p111g.C5586a;
import p181jd.Intrinsics;

/* renamed from: v3.d */
/* loaded from: classes.dex */
public final class C11092d {
    /* renamed from: a */
    public static final Drawable m6168a(Context context, int i) {
        Drawable m23699b = C5586a.m23699b(context, i);
        if (m23699b != null) {
            return m23699b;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    /* renamed from: b */
    public static final Drawable m6167b(Resources resources, int i, Resources.Theme theme) {
        Drawable m38996e = C0955h.m38996e(resources, i, theme);
        if (m38996e != null) {
            return m38996e;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    /* renamed from: c */
    public static final AbstractC1469p m6166c(Context context) {
        while (!(context instanceof InterfaceC1491v)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((InterfaceC1491v) context).mo137b();
    }

    /* renamed from: d */
    public static final Drawable m6165d(Context context, Resources resources, int i) {
        XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            if (Build.VERSION.SDK_INT < 24) {
                String name = xml.getName();
                if (Intrinsics.equals(name, "vector")) {
                    return C1704i.m35655c(resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                }
                if (Intrinsics.equals(name, "animated-vector")) {
                    return C1694c.m35688a(context, resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                }
            }
            return m6167b(resources, i, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    /* renamed from: e */
    public static final boolean m6164e(Context context, String str) {
        return C0928a.m39116a(context, str) == 0;
    }
}
