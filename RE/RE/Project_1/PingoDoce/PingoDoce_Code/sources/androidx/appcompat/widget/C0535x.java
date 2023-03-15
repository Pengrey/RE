package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.C1112b0;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p070e.C4906j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
public class C0535x {

    /* renamed from: l */
    private static final RectF f1804l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1805m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1806n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1807a = 0;

    /* renamed from: b */
    private boolean f1808b = false;

    /* renamed from: c */
    private float f1809c = -1.0f;

    /* renamed from: d */
    private float f1810d = -1.0f;

    /* renamed from: e */
    private float f1811e = -1.0f;

    /* renamed from: f */
    private int[] f1812f = new int[0];

    /* renamed from: g */
    private boolean f1813g = false;

    /* renamed from: h */
    private TextPaint f1814h;

    /* renamed from: i */
    private final TextView f1815i;

    /* renamed from: j */
    private final Context f1816j;

    /* renamed from: k */
    private final C0538c f1817k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.x$a */
    /* loaded from: classes.dex */
    private static class C0536a extends C0538c {
        C0536a() {
        }

        @Override // androidx.appcompat.widget.C0535x.C0538c
        /* renamed from: a */
        void mo40335a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0535x.m40344r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.x$b */
    /* loaded from: classes.dex */
    private static class C0537b extends C0536a {
        C0537b() {
        }

        @Override // androidx.appcompat.widget.C0535x.C0536a, androidx.appcompat.widget.C0535x.C0538c
        /* renamed from: a */
        void mo40335a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C0535x.C0538c
        /* renamed from: b */
        boolean mo40334b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.x$c */
    /* loaded from: classes.dex */
    public static class C0538c {
        C0538c() {
        }

        /* renamed from: a */
        void mo40335a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        boolean mo40334b(TextView textView) {
            return ((Boolean) C0535x.m40344r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0535x(TextView textView) {
        this.f1815i = textView;
        this.f1816j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f1817k = new C0537b();
        } else if (i >= 23) {
            this.f1817k = new C0536a();
        } else {
            this.f1817k = new C0538c();
        }
    }

    /* renamed from: A */
    private void m40366A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1812f = m40359c(iArr);
            m40365B();
        }
    }

    /* renamed from: B */
    private boolean m40365B() {
        int[] iArr = this.f1812f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1813g = z;
        if (z) {
            this.f1807a = 1;
            this.f1810d = iArr[0];
            this.f1811e = iArr[length - 1];
            this.f1809c = -1.0f;
        }
        return z;
    }

    /* renamed from: C */
    private boolean m40364C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1815i.getText();
        TransformationMethod transformationMethod = this.f1815i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1815i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1815i.getMaxLines() : -1;
        m40345q(i);
        StaticLayout m40357e = m40357e(text, (Layout.Alignment) m40344r(this.f1815i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (m40357e.getLineCount() <= maxLines && m40357e.getLineEnd(m40357e.getLineCount() - 1) == text.length())) && ((float) m40357e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m40363D() {
        return !(this.f1815i instanceof C0494j);
    }

    /* renamed from: E */
    private void m40362E(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1807a = 1;
            this.f1810d = f;
            this.f1811e = f2;
            this.f1809c = f3;
            this.f1813g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m40361a(Object obj, String str, T t) {
        try {
            Field m40347o = m40347o(str);
            return m40347o == null ? t : (T) m40347o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m40359c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m40358d() {
        this.f1807a = 0;
        this.f1810d = -1.0f;
        this.f1811e = -1.0f;
        this.f1809c = -1.0f;
        this.f1812f = new int[0];
        this.f1808b = false;
    }

    /* renamed from: f */
    private StaticLayout m40356f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1814h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1815i.getLineSpacingExtra(), this.f1815i.getLineSpacingMultiplier()).setIncludePad(this.f1815i.getIncludeFontPadding()).setBreakStrategy(this.f1815i.getBreakStrategy()).setHyphenationFrequency(this.f1815i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Reader.READ_DONE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f1817k.mo40335a(obtain, this.f1815i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m40355g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1814h, i, alignment, ((Float) m40361a(this.f1815i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m40361a(this.f1815i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m40361a(this.f1815i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m40354h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1814h, i, alignment, this.f1815i.getLineSpacingMultiplier(), this.f1815i.getLineSpacingExtra(), this.f1815i.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m40353i(RectF rectF) {
        int i;
        int length = this.f1812f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = length - 1;
        while (true) {
            int i5 = i3;
            int i6 = i2;
            i2 = i5;
            while (i2 <= i4) {
                i = (i2 + i4) / 2;
                if (m40364C(this.f1812f[i], rectF)) {
                    break;
                }
                i6 = i - 1;
                i4 = i6;
            }
            return this.f1812f[i6];
            i3 = i + 1;
        }
    }

    /* renamed from: o */
    private static Field m40347o(String str) {
        try {
            Field field = f1806n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1806n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m40346p(String str) {
        try {
            Method method = f1805m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1805m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m40344r(Object obj, String str, T t) {
        try {
            return (T) m40346p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: x */
    private void m40338x(float f) {
        if (f != this.f1815i.getPaint().getTextSize()) {
            this.f1815i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1815i.isInLayout() : false;
            if (this.f1815i.getLayout() != null) {
                this.f1808b = false;
                try {
                    Method m40346p = m40346p("nullLayouts");
                    if (m40346p != null) {
                        m40346p.invoke(this.f1815i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1815i.requestLayout();
                } else {
                    this.f1815i.forceLayout();
                }
                this.f1815i.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m40336z() {
        if (m40363D() && this.f1807a == 1) {
            if (!this.f1813g || this.f1812f.length == 0) {
                int floor = ((int) Math.floor((this.f1811e - this.f1810d) / this.f1809c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1810d + (i * this.f1809c));
                }
                this.f1812f = m40359c(iArr);
            }
            this.f1808b = true;
        } else {
            this.f1808b = false;
        }
        return this.f1808b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m40360b() {
        if (m40343s()) {
            if (this.f1808b) {
                if (this.f1815i.getMeasuredHeight() <= 0 || this.f1815i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1817k.mo40334b(this.f1815i) ? 1048576 : (this.f1815i.getMeasuredWidth() - this.f1815i.getTotalPaddingLeft()) - this.f1815i.getTotalPaddingRight();
                int height = (this.f1815i.getHeight() - this.f1815i.getCompoundPaddingBottom()) - this.f1815i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1804l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m40353i = m40353i(rectF);
                    if (m40353i != this.f1815i.getTextSize()) {
                        m40337y(0, m40353i);
                    }
                }
            }
            this.f1808b = true;
        }
    }

    /* renamed from: e */
    StaticLayout m40357e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return m40356f(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m40354h(charSequence, alignment, i);
        }
        return m40355g(charSequence, alignment, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m40352j() {
        return Math.round(this.f1811e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m40351k() {
        return Math.round(this.f1810d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m40350l() {
        return Math.round(this.f1809c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] m40349m() {
        return this.f1812f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m40348n() {
        return this.f1807a;
    }

    /* renamed from: q */
    void m40345q(int i) {
        TextPaint textPaint = this.f1814h;
        if (textPaint == null) {
            this.f1814h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1814h.set(this.f1815i.getPaint());
        this.f1814h.setTextSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m40343s() {
        return m40363D() && this.f1807a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m40342t(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f1816j;
        int[] iArr = C4906j.f13507d0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1815i;
        C1112b0.m38409q0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C4906j.f13532i0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1807a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C4906j.f13527h0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C4906j.f13517f0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C4906j.f13512e0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C4906j.f13522g0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m40366A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m40363D()) {
            if (this.f1807a == 1) {
                if (!this.f1813g) {
                    DisplayMetrics displayMetrics = this.f1816j.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    m40362E(dimension2, dimension3, dimension);
                }
                m40336z();
                return;
            }
            return;
        }
        this.f1807a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m40341u(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m40363D()) {
            DisplayMetrics displayMetrics = this.f1816j.getResources().getDisplayMetrics();
            m40362E(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m40336z()) {
                m40360b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m40340v(int[] iArr, int i) throws IllegalArgumentException {
        if (m40363D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1816j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1812f = m40359c(iArr2);
                if (!m40365B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1813g = false;
            }
            if (m40336z()) {
                m40360b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m40339w(int i) {
        if (m40363D()) {
            if (i == 0) {
                m40358d();
            } else if (i == 1) {
                DisplayMetrics displayMetrics = this.f1816j.getResources().getDisplayMetrics();
                m40362E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (m40336z()) {
                    m40360b();
                }
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m40337y(int i, float f) {
        Resources resources;
        Context context = this.f1816j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m40338x(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}
