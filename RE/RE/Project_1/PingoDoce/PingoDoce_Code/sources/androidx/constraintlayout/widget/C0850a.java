package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0850a {

    /* renamed from: a */
    String f2591a;

    /* renamed from: b */
    private EnumC0852b f2592b;

    /* renamed from: c */
    private int f2593c;

    /* renamed from: d */
    private float f2594d;

    /* renamed from: e */
    private String f2595e;

    /* renamed from: f */
    boolean f2596f;

    /* renamed from: g */
    private int f2597g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0851a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2598a;

        static {
            int[] iArr = new int[EnumC0852b.values().length];
            f2598a = iArr;
            try {
                iArr[EnumC0852b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2598a[EnumC0852b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2598a[EnumC0852b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2598a[EnumC0852b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2598a[EnumC0852b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2598a[EnumC0852b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2598a[EnumC0852b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* loaded from: classes.dex */
    public enum EnumC0852b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0850a(String str, EnumC0852b enumC0852b, Object obj) {
        this.f2591a = str;
        this.f2592b = enumC0852b;
        m39420d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0850a> m39423a(HashMap<String, C0850a> hashMap, View view) {
        HashMap<String, C0850a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0850a c0850a = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new C0850a(c0850a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new C0850a(c0850a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m39422b(Context context, XmlPullParser xmlPullParser, HashMap<String, C0850a> hashMap) {
        EnumC0852b enumC0852b;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0868i.f2925k2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0852b enumC0852b2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0868i.f2930l2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0868i.f2935m2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0852b2 = EnumC0852b.BOOLEAN_TYPE;
            } else {
                if (index == C0868i.f2945o2) {
                    enumC0852b = EnumC0852b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0868i.f2940n2) {
                    enumC0852b = EnumC0852b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0868i.f2965s2) {
                    enumC0852b = EnumC0852b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C0868i.f2950p2) {
                    enumC0852b = EnumC0852b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0868i.f2955q2) {
                    enumC0852b = EnumC0852b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C0868i.f2960r2) {
                    enumC0852b = EnumC0852b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C0868i.f2970t2) {
                    enumC0852b = EnumC0852b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                enumC0852b2 = enumC0852b;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C0850a(str, enumC0852b2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m39421c(View view, HashMap<String, C0850a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0850a c0850a = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C0851a.f2598a[c0850a.f2592b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0850a.f2597g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0850a.f2597g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0850a.f2593c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0850a.f2594d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0850a.f2595e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0850a.f2596f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0850a.f2594d));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void m39420d(Object obj) {
        switch (C0851a.f2598a[this.f2592b.ordinal()]) {
            case 1:
            case 2:
                this.f2597g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f2593c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f2594d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f2595e = (String) obj;
                return;
            case 6:
                this.f2596f = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f2594d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C0850a(C0850a c0850a, Object obj) {
        this.f2591a = c0850a.f2591a;
        this.f2592b = c0850a.f2592b;
        m39420d(obj);
    }
}
