package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0459c;
import androidx.appcompat.widget.C0466e;
import androidx.appcompat.widget.C0470f;
import androidx.appcompat.widget.C0479g;
import androidx.appcompat.widget.C0494j;
import androidx.appcompat.widget.C0498l;
import androidx.appcompat.widget.C0507n;
import androidx.appcompat.widget.C0512p0;
import androidx.appcompat.widget.C0513q;
import androidx.appcompat.widget.C0515r;
import androidx.appcompat.widget.C0521t;
import androidx.appcompat.widget.C0540y;
import androidx.core.view.C1112b0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p070e.C4906j;
import p189k.C6544d;
import p301q.C9558g;

/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
public class C0354f {

    /* renamed from: b */
    private static final Class<?>[] f903b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f904c = {16843375};

    /* renamed from: d */
    private static final String[] f905d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final C9558g<String, Constructor<? extends View>> f906e = new C9558g<>();

    /* renamed from: a */
    private final Object[] f907a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatViewInflater.java */
    /* renamed from: androidx.appcompat.app.f$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC0355a implements View.OnClickListener {

        /* renamed from: w */
        private final View f908w;

        /* renamed from: x */
        private final String f909x;

        /* renamed from: y */
        private Method f910y;

        /* renamed from: z */
        private Context f911z;

        public View$OnClickListenerC0355a(View view, String str) {
            this.f908w = view;
            this.f909x = str;
        }

        /* renamed from: a */
        private void m41125a(Context context) {
            int id2;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f909x, View.class)) != null) {
                        this.f910y = method;
                        this.f911z = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f908w.getId() == -1) {
                str = BuildConfig.VERSION_NAME;
            } else {
                str = " with id '" + this.f908w.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f909x + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f908w.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f910y == null) {
                m41125a(this.f908w.getContext());
            }
            try {
                this.f910y.invoke(this.f911z, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m41141a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || C1112b0.m38451R(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f904c);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new View$OnClickListenerC0355a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: r */
    private View m41129r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        C9558g<String, Constructor<? extends View>> c9558g = f906e;
        Constructor<? extends View> constructor = c9558g.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f903b);
            c9558g.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f907a);
    }

    /* renamed from: s */
    private View m41128s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f907a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m41129r(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f905d;
                if (i >= strArr.length) {
                    return null;
                }
                View m41129r = m41129r(context, str, strArr[i]);
                if (m41129r != null) {
                    return m41129r;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f907a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m41127t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4906j.f13610x3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C4906j.f13615y3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C4906j.f13620z3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C6544d) && ((C6544d) context).m20651c() == resourceId) ? context : new C6544d(context, resourceId) : context;
    }

    /* renamed from: u */
    private void m41126u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: b */
    protected C0459c mo28861b(Context context, AttributeSet attributeSet) {
        return new C0459c(context, attributeSet);
    }

    /* renamed from: c */
    protected C0466e mo28860c(Context context, AttributeSet attributeSet) {
        return new C0466e(context, attributeSet);
    }

    /* renamed from: d */
    protected C0470f mo28859d(Context context, AttributeSet attributeSet) {
        return new C0470f(context, attributeSet);
    }

    /* renamed from: e */
    protected C0479g m41140e(Context context, AttributeSet attributeSet) {
        return new C0479g(context, attributeSet);
    }

    /* renamed from: f */
    protected C0494j m41139f(Context context, AttributeSet attributeSet) {
        return new C0494j(context, attributeSet);
    }

    /* renamed from: g */
    protected C0498l m41138g(Context context, AttributeSet attributeSet) {
        return new C0498l(context, attributeSet);
    }

    /* renamed from: h */
    protected AppCompatImageView m41137h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: i */
    protected C0507n m41136i(Context context, AttributeSet attributeSet) {
        return new C0507n(context, attributeSet);
    }

    /* renamed from: j */
    protected C0513q mo28858j(Context context, AttributeSet attributeSet) {
        return new C0513q(context, attributeSet);
    }

    /* renamed from: k */
    protected C0515r m41135k(Context context, AttributeSet attributeSet) {
        return new C0515r(context, attributeSet);
    }

    /* renamed from: l */
    protected C0521t m41134l(Context context, AttributeSet attributeSet) {
        return new C0521t(context, attributeSet);
    }

    /* renamed from: m */
    protected AppCompatSpinner m41133m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* renamed from: n */
    protected AppCompatTextView mo28857n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: o */
    protected C0540y m41132o(Context context, AttributeSet attributeSet) {
        return new C0540y(context, attributeSet);
    }

    /* renamed from: p */
    protected View m41131p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final View m41130q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View m41135k;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m41127t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0512p0.m40482b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m41135k = m41135k(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case 1:
                m41135k = m41140e(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case 2:
                m41135k = m41136i(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case 3:
                m41135k = mo28857n(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case 4:
                m41135k = m41138g(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case 5:
                m41135k = m41134l(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case 6:
                m41135k = m41133m(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case 7:
                m41135k = mo28858j(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case '\b':
                m41135k = m41132o(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case '\t':
                m41135k = m41137h(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case '\n':
                m41135k = mo28861b(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case 11:
                m41135k = mo28859d(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case '\f':
                m41135k = m41139f(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            case '\r':
                m41135k = mo28860c(context2, attributeSet);
                m41126u(m41135k, str);
                break;
            default:
                m41135k = m41131p(context2, str, attributeSet);
                break;
        }
        if (m41135k == null && context != context2) {
            m41135k = m41128s(context2, str, attributeSet);
        }
        if (m41135k != null) {
            m41141a(m41135k, attributeSet);
        }
        return m41135k;
    }
}
