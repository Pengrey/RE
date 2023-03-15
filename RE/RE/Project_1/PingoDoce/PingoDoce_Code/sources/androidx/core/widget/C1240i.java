package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.C1055d;
import androidx.core.util.C1076h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public final class C1240i {

    /* renamed from: a */
    private static Field f3651a;

    /* renamed from: b */
    private static boolean f3652b;

    /* renamed from: c */
    private static Field f3653c;

    /* renamed from: d */
    private static boolean f3654d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewCompat.java */
    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: classes.dex */
    public static class C1241a {
        /* renamed from: a */
        static boolean m37869a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m37868b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m37867c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewCompat.java */
    /* renamed from: androidx.core.widget.i$b */
    /* loaded from: classes.dex */
    public static class C1242b {
        /* renamed from: a */
        static Drawable[] m37866a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m37865b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m37864c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m37863d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m37862e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m37861f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m37860g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m37859h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewCompat.java */
    /* renamed from: androidx.core.widget.i$c */
    /* loaded from: classes.dex */
    public static class C1243c {
        /* renamed from: a */
        static int m37858a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m37857b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m37856c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m37855d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m37854e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        static void m37853f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m37852g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m37851h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewCompat.java */
    /* renamed from: androidx.core.widget.i$d */
    /* loaded from: classes.dex */
    public static class C1244d {
        /* renamed from: a */
        static DecimalFormatSymbols m37850a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewCompat.java */
    /* renamed from: androidx.core.widget.i$e */
    /* loaded from: classes.dex */
    public static class C1245e {
        /* renamed from: a */
        static String[] m37849a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        static PrecomputedText.Params m37848b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        static void m37847c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextViewCompat.java */
    /* renamed from: androidx.core.widget.i$f */
    /* loaded from: classes.dex */
    public static class ActionMode$CallbackC1246f implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f3655a;

        /* renamed from: b */
        private final TextView f3656b;

        /* renamed from: c */
        private Class<?> f3657c;

        /* renamed from: d */
        private Method f3658d;

        /* renamed from: e */
        private boolean f3659e;

        /* renamed from: f */
        private boolean f3660f = false;

        ActionMode$CallbackC1246f(ActionMode.Callback callback, TextView textView) {
            this.f3655a = callback;
            this.f3656b = textView;
        }

        /* renamed from: a */
        private Intent m37846a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m37845b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m37846a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m37843d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m37844c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m37846a(), 0)) {
                    if (m37842e(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        /* renamed from: d */
        private boolean m37843d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: e */
        private boolean m37842e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo.exported) {
                String str = activityInfo.permission;
                return str == null || context.checkSelfPermission(str) == 0;
            }
            return false;
        }

        /* renamed from: f */
        private void m37841f(Menu menu) {
            Method declaredMethod;
            Context context = this.f3656b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3660f) {
                this.f3660f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3657c = cls;
                    this.f3658d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f3659e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3657c = null;
                    this.f3658d = null;
                    this.f3659e = false;
                }
            }
            try {
                if (this.f3659e && this.f3657c.isInstance(menu)) {
                    declaredMethod = this.f3658d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m37844c = m37844c(context, packageManager);
                for (int i = 0; i < m37844c.size(); i++) {
                    ResolveInfo resolveInfo = m37844c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m37845b(resolveInfo, this.f3656b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3655a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3655a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3655a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m37841f(menu);
            return this.f3655a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m37888a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return C1242b.m37866a(textView);
        }
        if (i >= 17) {
            boolean z = C1242b.m37865b(textView) == 1;
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
        return textView.getCompoundDrawables();
    }

    /* renamed from: b */
    public static int m37887b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m37886c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m37885d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1241a.m37868b(textView);
        }
        if (!f3654d) {
            f3653c = m37881h("mMaxMode");
            f3654d = true;
        }
        Field field = f3653c;
        if (field == null || m37880i(field, textView) != 1) {
            return -1;
        }
        if (!f3652b) {
            f3651a = m37881h("mMaximum");
            f3652b = true;
        }
        Field field2 = f3651a;
        if (field2 != null) {
            return m37880i(field2, textView);
        }
        return -1;
    }

    /* renamed from: e */
    private static int m37884e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m37883f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C1245e.m37849a(C1244d.m37850a(C1242b.m37863d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        boolean z = C1242b.m37865b(textView) == 1;
        switch (C1242b.m37864c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: g */
    public static C1055d.C1056a m37882g(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C1055d.C1056a(C1245e.m37848b(textView));
        }
        C1055d.C1056a.C1057a c1057a = new C1055d.C1056a.C1057a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            c1057a.m38647b(C1243c.m37858a(textView));
            c1057a.m38646c(C1243c.m37855d(textView));
        }
        if (i >= 18) {
            c1057a.m38645d(m37883f(textView));
        }
        return c1057a.m38648a();
    }

    /* renamed from: h */
    private static Field m37881h(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            Log.e("TextViewCompat", "Could not retrieve " + str + " field.");
            return field;
        }
    }

    /* renamed from: i */
    private static int m37880i(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: j */
    public static void m37879j(TextView textView, ColorStateList colorStateList) {
        C1076h.m38619f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C1243c.m37853f(textView, colorStateList);
        } else if (textView instanceof InterfaceC1251l) {
            ((InterfaceC1251l) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: k */
    public static void m37878k(TextView textView, PorterDuff.Mode mode) {
        C1076h.m38619f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C1243c.m37852g(textView, mode);
        } else if (textView instanceof InterfaceC1251l) {
            ((InterfaceC1251l) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: l */
    public static void m37877l(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            C1242b.m37862e(textView, drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = C1242b.m37865b(textView) == 1;
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: m */
    public static void m37876m(TextView textView, int i) {
        int i2;
        C1076h.m38621d(i);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            C1245e.m37847c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (i3 >= 16 && !C1241a.m37869a(textView)) {
            i2 = fontMetricsInt.ascent;
        } else {
            i2 = fontMetricsInt.top;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: n */
    public static void m37875n(TextView textView, int i) {
        int i2;
        C1076h.m38621d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT >= 16 && !C1241a.m37869a(textView)) {
            i2 = fontMetricsInt.descent;
        } else {
            i2 = fontMetricsInt.bottom;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: o */
    public static void m37874o(TextView textView, int i) {
        C1076h.m38621d(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* renamed from: p */
    public static void m37873p(TextView textView, C1055d c1055d) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(c1055d.m38654b());
        } else if (m37882g(textView).m38653a(c1055d.m38655a())) {
            textView.setText(c1055d);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: q */
    public static void m37872q(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: r */
    public static void m37871r(TextView textView, C1055d.C1056a c1056a) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            C1242b.m37859h(textView, m37884e(c1056a.m38650d()));
        }
        if (i < 23) {
            float textScaleX = c1056a.m38649e().getTextScaleX();
            textView.getPaint().set(c1056a.m38649e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(c1056a.m38649e());
        C1243c.m37854e(textView, c1056a.m38652b());
        C1243c.m37851h(textView, c1056a.m38651c());
    }

    /* renamed from: s */
    public static ActionMode.Callback m37870s(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC1246f) || callback == null) ? callback : new ActionMode$CallbackC1246f(callback, textView);
    }
}
