package p306q4;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;

/* renamed from: q4.f */
/* loaded from: classes.dex */
public class C9655f {

    /* renamed from: a */
    private static final String f25478a = "q4.f";

    /* renamed from: b */
    private static WeakReference<View> f25479b = new WeakReference<>(null);

    /* renamed from: c */
    private static Method f25480c = null;

    /* renamed from: a */
    public static View m10276a(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!m10260q(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, C9655f.class);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static List<View> m10275b(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: c */
    public static int m10274c(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return 0;
        }
        try {
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            if (m10262o(view)) {
                i |= 512;
            }
            if (view instanceof TextView) {
                int i2 = i | 1024 | 1;
                if (view instanceof Button) {
                    i2 |= 4;
                    if (view instanceof Switch) {
                        i2 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i2 |= 32768;
                    }
                }
                return view instanceof EditText ? i2 | 2048 : i2;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                return view instanceof RatingBar ? i | 65536 : view instanceof RadioGroup ? i | 16384 : ((view instanceof ViewGroup) && m10261p(view, f25479b.get())) ? i | 64 : i;
            }
            return i | 4096;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return 0;
        }
    }

    /* renamed from: d */
    public static JSONObject m10273d(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f25479b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m10258s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> m10275b = m10275b(view);
                for (int i = 0; i < m10275b.size(); i++) {
                    jSONArray.put(m10273d(m10275b.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e) {
                Log.e(f25478a, "Failed to create JSONObject for view.", e);
            }
            return jSONObject;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: e */
    private static JSONObject m10272e(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e) {
                Log.e(f25478a, "Failed to create JSONObject for dimension.", e);
            }
            return jSONObject;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: f */
    private static Class<?> m10271f(String str) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: g */
    public static View.OnClickListener m10270g(View view) {
        Field declaredField;
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: h */
    public static View.OnTouchListener m10269h(View view) {
        Field declaredField;
        try {
            if (CrashShieldHandler.m25963d(C9655f.class)) {
                return null;
            }
            try {
                Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
                Object obj = declaredField2.get(view);
                if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                    return null;
                }
                declaredField.setAccessible(true);
                return (View.OnTouchListener) declaredField.get(obj);
            } catch (ClassNotFoundException e) {
                Utility.m33974J(f25478a, e);
                return null;
            } catch (IllegalAccessException e2) {
                Utility.m33974J(f25478a, e2);
                return null;
            } catch (NoSuchFieldException e3) {
                Utility.m33974J(f25478a, e3);
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: i */
    public static String m10268i(View view) {
        CharSequence hint;
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return hint == null ? BuildConfig.VERSION_NAME : hint.toString();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: j */
    public static ViewGroup m10267j(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:5:0x000a, B:7:0x000e, B:9:0x0019, B:43:0x00dd, B:14:0x0029, B:16:0x002d, B:18:0x0036, B:20:0x003e, B:21:0x0043, B:23:0x004a, B:24:0x0074, B:26:0x0078, B:27:0x009f, B:29:0x00a3, B:31:0x00af, B:33:0x00b9, B:35:0x00bd, B:36:0x00c5, B:37:0x00c8, B:39:0x00cc), top: B:48:0x000a }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m10266k(android.view.View r9) {
        /*
            java.lang.Class<q4.f> r0 = p306q4.C9655f.class
            boolean r1 = p076e5.CrashShieldHandler.m25963d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r9 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L29
            r1 = r9
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Throwable -> Le2
            java.lang.CharSequence r1 = r1.getText()     // Catch: java.lang.Throwable -> Le2
            boolean r3 = r9 instanceof android.widget.Switch     // Catch: java.lang.Throwable -> Le2
            if (r3 == 0) goto Ld8
            android.widget.Switch r9 = (android.widget.Switch) r9     // Catch: java.lang.Throwable -> Le2
            boolean r9 = r9.isChecked()     // Catch: java.lang.Throwable -> Le2
            if (r9 == 0) goto L24
            java.lang.String r9 = "1"
            goto L26
        L24:
            java.lang.String r9 = "0"
        L26:
            r1 = r9
            goto Ld8
        L29:
            boolean r1 = r9 instanceof android.widget.Spinner     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L43
            r1 = r9
            android.widget.Spinner r1 = (android.widget.Spinner) r1     // Catch: java.lang.Throwable -> Le2
            int r1 = r1.getCount()     // Catch: java.lang.Throwable -> Le2
            if (r1 <= 0) goto Ld7
            android.widget.Spinner r9 = (android.widget.Spinner) r9     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r9 = r9.getSelectedItem()     // Catch: java.lang.Throwable -> Le2
            if (r9 == 0) goto Ld7
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le2
            goto L26
        L43:
            boolean r1 = r9 instanceof android.widget.DatePicker     // Catch: java.lang.Throwable -> Le2
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L74
            android.widget.DatePicker r9 = (android.widget.DatePicker) r9     // Catch: java.lang.Throwable -> Le2
            int r1 = r9.getYear()     // Catch: java.lang.Throwable -> Le2
            int r6 = r9.getMonth()     // Catch: java.lang.Throwable -> Le2
            int r9 = r9.getDayOfMonth()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r7 = "%04d-%02d-%02d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le2
            r8[r5] = r1     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Le2
            r8[r4] = r1     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Le2
            r8[r3] = r9     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = java.lang.String.format(r7, r8)     // Catch: java.lang.Throwable -> Le2
            goto Ld8
        L74:
            boolean r1 = r9 instanceof android.widget.TimePicker     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L9f
            android.widget.TimePicker r9 = (android.widget.TimePicker) r9     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r1 = r9.getCurrentHour()     // Catch: java.lang.Throwable -> Le2
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r9 = r9.getCurrentMinute()     // Catch: java.lang.Throwable -> Le2
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r6 = "%02d:%02d"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le2
            r3[r5] = r1     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Le2
            r3[r4] = r9     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = java.lang.String.format(r6, r3)     // Catch: java.lang.Throwable -> Le2
            goto Ld8
        L9f:
            boolean r1 = r9 instanceof android.widget.RadioGroup     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Lc8
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9     // Catch: java.lang.Throwable -> Le2
            int r1 = r9.getCheckedRadioButtonId()     // Catch: java.lang.Throwable -> Le2
            int r3 = r9.getChildCount()     // Catch: java.lang.Throwable -> Le2
        Lad:
            if (r5 >= r3) goto Ld7
            android.view.View r4 = r9.getChildAt(r5)     // Catch: java.lang.Throwable -> Le2
            int r6 = r4.getId()     // Catch: java.lang.Throwable -> Le2
            if (r6 != r1) goto Lc5
            boolean r6 = r4 instanceof android.widget.RadioButton     // Catch: java.lang.Throwable -> Le2
            if (r6 == 0) goto Lc5
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4     // Catch: java.lang.Throwable -> Le2
            java.lang.CharSequence r9 = r4.getText()     // Catch: java.lang.Throwable -> Le2
            goto L26
        Lc5:
            int r5 = r5 + 1
            goto Lad
        Lc8:
            boolean r1 = r9 instanceof android.widget.RatingBar     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Ld7
            android.widget.RatingBar r9 = (android.widget.RatingBar) r9     // Catch: java.lang.Throwable -> Le2
            float r9 = r9.getRating()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Le2
            goto Ld8
        Ld7:
            r1 = r2
        Ld8:
            if (r1 != 0) goto Ldd
            java.lang.String r9 = ""
            goto Le1
        Ldd:
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Le2
        Le1:
            return r9
        Le2:
            r9 = move-exception
            p076e5.CrashShieldHandler.m25965b(r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p306q4.C9655f.m10266k(android.view.View):java.lang.String");
    }

    /* renamed from: l */
    public static View m10265l(float[] fArr, View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        try {
            m10263n();
            Method method = f25480c;
            if (method != null && view != null) {
                try {
                    View view2 = (View) method.invoke(null, fArr, view);
                    if (view2 != null && view2.getId() > 0) {
                        View view3 = (View) view2.getParent();
                        if (view3 != null) {
                            return view3;
                        }
                        return null;
                    }
                } catch (IllegalAccessException e) {
                    Utility.m33974J(f25478a, e);
                } catch (InvocationTargetException e2) {
                    Utility.m33974J(f25478a, e2);
                }
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: m */
    private static float[] m10264m(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return null;
        }
    }

    /* renamed from: n */
    private static void m10263n() {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return;
        }
        try {
            if (f25480c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f25480c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                Utility.m33974J(f25478a, e);
            } catch (NoSuchMethodException e2) {
                Utility.m33974J(f25478a, e2);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
        }
    }

    /* renamed from: o */
    private static boolean m10262o(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> m10271f = m10271f("android.support.v4.view.NestedScrollingChild");
            if (m10271f == null || !m10271f.isInstance(parent)) {
                Class<?> m10271f2 = m10271f("androidx.core.view.NestedScrollingChild");
                if (m10271f2 != null) {
                    if (m10271f2.isInstance(parent)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m10261p(View view, View view2) {
        View m10265l;
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") || (m10265l = m10265l(m10264m(view), view2)) == null) {
                return false;
            }
            return m10265l.getId() == view.getId();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m10260q(View view) {
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return false;
        }
        try {
            return view.getClass().getName().equals("com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
            return false;
        }
    }

    /* renamed from: r */
    public static void m10259r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (CrashShieldHandler.m25963d(C9655f.class)) {
            return;
        }
        Object obj = null;
        try {
            try {
                field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                try {
                    field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                    field2 = null;
                    if (field == null) {
                    }
                    view.setOnClickListener(onClickListener);
                }
            } catch (Exception unused2) {
                return;
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, C9655f.class);
                return;
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused3) {
            field = null;
        }
        if (field == null && field2 != null) {
            field.setAccessible(true);
            field2.setAccessible(true);
            try {
                field.setAccessible(true);
                obj = field.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
                return;
            } else {
                field2.set(obj, onClickListener);
                return;
            }
        }
        view.setOnClickListener(onClickListener);
    }

    /* renamed from: s */
    public static void m10258s(View view, JSONObject jSONObject) {
        try {
            if (CrashShieldHandler.m25963d(C9655f.class)) {
                return;
            }
            try {
                String m10266k = m10266k(view);
                String m10268i = m10268i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m10274c(view));
                jSONObject.put("id", view.getId());
                if (!C9653d.m10280g(view)) {
                    jSONObject.put("text", Utility.m33952f(Utility.m33959Y(m10266k), BuildConfig.VERSION_NAME));
                } else {
                    jSONObject.put("text", BuildConfig.VERSION_NAME);
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", Utility.m33952f(Utility.m33959Y(m10268i), BuildConfig.VERSION_NAME));
                if (tag != null) {
                    jSONObject.put("tag", Utility.m33952f(Utility.m33959Y(tag.toString()), BuildConfig.VERSION_NAME));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", Utility.m33952f(Utility.m33959Y(contentDescription.toString()), BuildConfig.VERSION_NAME));
                }
                jSONObject.put("dimension", m10272e(view));
            } catch (JSONException e) {
                Utility.m33974J(f25478a, e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9655f.class);
        }
    }
}
