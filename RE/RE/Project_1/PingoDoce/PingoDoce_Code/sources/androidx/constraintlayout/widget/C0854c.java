package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C0854c {

    /* renamed from: a */
    private SparseArray<C0855a> f2607a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<C0857d> f2608b = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes.dex */
    public static class C0855a {

        /* renamed from: a */
        int f2609a;

        /* renamed from: b */
        ArrayList<C0856b> f2610b = new ArrayList<>();

        /* renamed from: c */
        int f2611c;

        /* renamed from: d */
        C0857d f2612d;

        public C0855a(Context context, XmlPullParser xmlPullParser) {
            this.f2611c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0868i.f2791K3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0868i.f2796L3) {
                    this.f2609a = obtainStyledAttributes.getResourceId(index, this.f2609a);
                } else if (index == C0868i.f2801M3) {
                    this.f2611c = obtainStyledAttributes.getResourceId(index, this.f2611c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2611c);
                    context.getResources().getResourceName(this.f2611c);
                    if ("layout".equals(resourceTypeName)) {
                        C0857d c0857d = new C0857d();
                        this.f2612d = c0857d;
                        c0857d.m39397f(context, this.f2611c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m39403a(C0856b c0856b) {
            this.f2610b.add(c0856b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: classes.dex */
    public static class C0856b {

        /* renamed from: a */
        float f2613a;

        /* renamed from: b */
        float f2614b;

        /* renamed from: c */
        float f2615c;

        /* renamed from: d */
        float f2616d;

        /* renamed from: e */
        int f2617e;

        /* renamed from: f */
        C0857d f2618f;

        public C0856b(Context context, XmlPullParser xmlPullParser) {
            this.f2613a = Float.NaN;
            this.f2614b = Float.NaN;
            this.f2615c = Float.NaN;
            this.f2616d = Float.NaN;
            this.f2617e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0868i.f2866Z3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0868i.f2872a4) {
                    this.f2617e = obtainStyledAttributes.getResourceId(index, this.f2617e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2617e);
                    context.getResources().getResourceName(this.f2617e);
                    if ("layout".equals(resourceTypeName)) {
                        C0857d c0857d = new C0857d();
                        this.f2618f = c0857d;
                        c0857d.m39397f(context, this.f2617e);
                    }
                } else if (index == C0868i.f2878b4) {
                    this.f2616d = obtainStyledAttributes.getDimension(index, this.f2616d);
                } else if (index == C0868i.f2884c4) {
                    this.f2614b = obtainStyledAttributes.getDimension(index, this.f2614b);
                } else if (index == C0868i.f2890d4) {
                    this.f2615c = obtainStyledAttributes.getDimension(index, this.f2615c);
                } else if (index == C0868i.f2896e4) {
                    this.f2613a = obtainStyledAttributes.getDimension(index, this.f2613a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0854c(Context context, ConstraintLayout constraintLayout, int i) {
        m39406a(context, i);
    }

    /* renamed from: a */
    private void m39406a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0855a c0855a = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0 && c != 1) {
                        if (c == 2) {
                            c0855a = new C0855a(context, xml);
                            this.f2607a.put(c0855a.f2609a, c0855a);
                            continue;
                        } else if (c == 3) {
                            C0856b c0856b = new C0856b(context, xml);
                            if (c0855a != null) {
                                c0855a.m39403a(c0856b);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            continue;
                        } else {
                            m39405b(context, xml);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m39405b(Context context, XmlPullParser xmlPullParser) {
        C0857d c0857d = new C0857d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c0857d.m39388o(context, xmlPullParser);
                this.f2608b.put(identifier, c0857d);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m39404c(AbstractC0865f abstractC0865f) {
    }
}
