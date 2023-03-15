package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0955h;
import p111g.C5586a;

/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
public class C0520s0 {

    /* renamed from: a */
    private final Context f1730a;

    /* renamed from: b */
    private final TypedArray f1731b;

    /* renamed from: c */
    private TypedValue f1732c;

    private C0520s0(Context context, TypedArray typedArray) {
        this.f1730a = context;
        this.f1731b = typedArray;
    }

    /* renamed from: t */
    public static C0520s0 m40455t(Context context, int i, int[] iArr) {
        return new C0520s0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0520s0 m40454u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0520s0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0520s0 m40453v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0520s0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m40474a(int i, boolean z) {
        return this.f1731b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m40473b(int i, int i2) {
        return this.f1731b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m40472c(int i) {
        int resourceId;
        ColorStateList m23700a;
        return (!this.f1731b.hasValue(i) || (resourceId = this.f1731b.getResourceId(i, 0)) == 0 || (m23700a = C5586a.m23700a(this.f1730a, resourceId)) == null) ? this.f1731b.getColorStateList(i) : m23700a;
    }

    /* renamed from: d */
    public float m40471d(int i, float f) {
        return this.f1731b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m40470e(int i, int i2) {
        return this.f1731b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m40469f(int i, int i2) {
        return this.f1731b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m40468g(int i) {
        int resourceId;
        if (this.f1731b.hasValue(i) && (resourceId = this.f1731b.getResourceId(i, 0)) != 0) {
            return C5586a.m23699b(this.f1730a, resourceId);
        }
        return this.f1731b.getDrawable(i);
    }

    /* renamed from: h */
    public Drawable m40467h(int i) {
        int resourceId;
        if (!this.f1731b.hasValue(i) || (resourceId = this.f1731b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0484i.m40590b().m40588d(this.f1730a, resourceId, true);
    }

    /* renamed from: i */
    public float m40466i(int i, float f) {
        return this.f1731b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface m40465j(int i, int i2, C0955h.AbstractC0961f abstractC0961f) {
        int resourceId = this.f1731b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1732c == null) {
            this.f1732c = new TypedValue();
        }
        return C0955h.m38993h(this.f1730a, resourceId, this.f1732c, i2, abstractC0961f);
    }

    /* renamed from: k */
    public int m40464k(int i, int i2) {
        return this.f1731b.getInt(i, i2);
    }

    /* renamed from: l */
    public int m40463l(int i, int i2) {
        return this.f1731b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int m40462m(int i, int i2) {
        return this.f1731b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int m40461n(int i, int i2) {
        return this.f1731b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String m40460o(int i) {
        return this.f1731b.getString(i);
    }

    /* renamed from: p */
    public CharSequence m40459p(int i) {
        return this.f1731b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] m40458q(int i) {
        return this.f1731b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray m40457r() {
        return this.f1731b;
    }

    /* renamed from: s */
    public boolean m40456s(int i) {
        return this.f1731b.hasValue(i);
    }

    /* renamed from: w */
    public void m40452w() {
        this.f1731b.recycle();
    }
}
