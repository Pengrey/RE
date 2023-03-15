package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.provider.C1031e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p128h2.C5817d;

/* renamed from: androidx.core.content.res.e */
/* loaded from: classes.dex */
public class C0946e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.e$a */
    /* loaded from: classes.dex */
    public static class C0947a {
        /* renamed from: a */
        static int m39019a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.e$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0948b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.e$c */
    /* loaded from: classes.dex */
    public static final class C0949c implements InterfaceC0948b {

        /* renamed from: a */
        private final C0950d[] f3210a;

        public C0949c(C0950d[] c0950dArr) {
            this.f3210a = c0950dArr;
        }

        /* renamed from: a */
        public C0950d[] m39018a() {
            return this.f3210a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.e$d */
    /* loaded from: classes.dex */
    public static final class C0950d {

        /* renamed from: a */
        private final String f3211a;

        /* renamed from: b */
        private final int f3212b;

        /* renamed from: c */
        private final boolean f3213c;

        /* renamed from: d */
        private final String f3214d;

        /* renamed from: e */
        private final int f3215e;

        /* renamed from: f */
        private final int f3216f;

        public C0950d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f3211a = str;
            this.f3212b = i;
            this.f3213c = z;
            this.f3214d = str2;
            this.f3215e = i2;
            this.f3216f = i3;
        }

        /* renamed from: a */
        public String m39017a() {
            return this.f3211a;
        }

        /* renamed from: b */
        public int m39016b() {
            return this.f3216f;
        }

        /* renamed from: c */
        public int m39015c() {
            return this.f3215e;
        }

        /* renamed from: d */
        public String m39014d() {
            return this.f3214d;
        }

        /* renamed from: e */
        public int m39013e() {
            return this.f3212b;
        }

        /* renamed from: f */
        public boolean m39012f() {
            return this.f3213c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.e$e */
    /* loaded from: classes.dex */
    public static final class C0951e implements InterfaceC0948b {

        /* renamed from: a */
        private final C1031e f3217a;

        /* renamed from: b */
        private final int f3218b;

        /* renamed from: c */
        private final int f3219c;

        /* renamed from: d */
        private final String f3220d;

        public C0951e(C1031e c1031e, int i, int i2, String str) {
            this.f3217a = c1031e;
            this.f3219c = i;
            this.f3218b = i2;
            this.f3220d = str;
        }

        /* renamed from: a */
        public int m39011a() {
            return this.f3219c;
        }

        /* renamed from: b */
        public C1031e m39010b() {
            return this.f3217a;
        }

        /* renamed from: c */
        public String m39009c() {
            return this.f3220d;
        }

        /* renamed from: d */
        public int m39008d() {
            return this.f3218b;
        }
    }

    /* renamed from: a */
    private static int m39027a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0947a.m39019a(typedArray, i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static InterfaceC0948b m39026b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m39024d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m39025c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m39027a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m39020h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m39020h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static InterfaceC0948b m39024d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m39023e(xmlPullParser, resources);
        }
        m39021g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static InterfaceC0948b m39023e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5817d.f16196g);
        String string = obtainAttributes.getString(C5817d.f16197h);
        String string2 = obtainAttributes.getString(C5817d.f16201l);
        String string3 = obtainAttributes.getString(C5817d.f16202m);
        int resourceId = obtainAttributes.getResourceId(C5817d.f16198i, 0);
        int integer = obtainAttributes.getInteger(C5817d.f16199j, 1);
        int integer2 = obtainAttributes.getInteger(C5817d.f16200k, 500);
        String string4 = obtainAttributes.getString(C5817d.f16203n);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m39021g(xmlPullParser);
            }
            return new C0951e(new C1031e(string, string2, string3, m39025c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m39022f(xmlPullParser, resources));
                } else {
                    m39021g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0949c((C0950d[]) arrayList.toArray(new C0950d[0]));
    }

    /* renamed from: f */
    private static C0950d m39022f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5817d.f16204o);
        int i = C5817d.f16213x;
        if (!obtainAttributes.hasValue(i)) {
            i = C5817d.f16206q;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C5817d.f16211v;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C5817d.f16207r;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C5817d.f16214y;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C5817d.f16208s;
        }
        int i5 = C5817d.f16212w;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C5817d.f16209t;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C5817d.f16210u;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C5817d.f16205p;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m39021g(xmlPullParser);
        }
        return new C0950d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m39021g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m39020h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
