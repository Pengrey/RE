package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0459c;
import androidx.appcompat.widget.C0471f0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.material.internal.C3632g;
import com.google.android.material.internal.C3646n;
import p100f8.C5419b;
import p100f8.C5425h;
import p100f8.C5428k;
import p100f8.C5429l;
import p419w8.C11602a;

/* renamed from: com.google.android.material.textfield.h */
/* loaded from: classes.dex */
public class C3782h extends C0459c {

    /* renamed from: A */
    private final AccessibilityManager f10764A;

    /* renamed from: B */
    private final Rect f10765B;

    /* renamed from: C */
    private final int f10766C;

    /* renamed from: z */
    private final C0471f0 f10767z;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* renamed from: com.google.android.material.textfield.h$a */
    /* loaded from: classes.dex */
    class C3783a implements AdapterView.OnItemClickListener {
        C3783a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C3782h c3782h = C3782h.this;
            C3782h.this.m28898e(i < 0 ? c3782h.f10767z.m40611v() : c3782h.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = C3782h.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C3782h.this.f10767z.m40608y();
                    i = C3782h.this.f10767z.m40609x();
                    j = C3782h.this.f10767z.m40610w();
                }
                onItemClickListener.onItemClick(C3782h.this.f10767z.mo19708h(), view, i, j);
            }
            C3782h.this.f10767z.dismiss();
        }
    }

    public C3782h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.f14884b);
    }

    /* renamed from: c */
    private TextInputLayout m28900c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m28899d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m28900c = m28900c();
        int i = 0;
        if (adapter == null || m28900c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f10767z.m40609x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, m28900c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable m40620g = this.f10767z.m40620g();
        if (m40620g != null) {
            m40620g.getPadding(this.f10765B);
            Rect rect = this.f10765B;
            i2 += rect.left + rect.right;
        }
        return i2 + m28900c.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m28898e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m28900c = m28900c();
        if (m28900c != null && m28900c.m29068O()) {
            return m28900c.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m28900c = m28900c();
        if (m28900c != null && m28900c.m29068O() && super.getHint() == null && C3632g.m29539a()) {
            setHint(BuildConfig.VERSION_NAME);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m28899d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f10767z.mo40616p(getAdapter());
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f10764A;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f10767z.mo19710a();
        } else {
            super.showDropDown();
        }
    }

    public C3782h(Context context, AttributeSet attributeSet, int i) {
        super(C11602a.m4640c(context, attributeSet, i, 0), attributeSet, i);
        this.f10765B = new Rect();
        Context context2 = getContext();
        TypedArray m29500h = C3646n.m29500h(context2, attributeSet, C5429l.f14902B2, i, C5428k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = C5429l.f14910C2;
        if (m29500h.hasValue(i2) && m29500h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f10766C = m29500h.getResourceId(C5429l.f14918D2, C5425h.mtrl_auto_complete_simple_item);
        this.f10764A = (AccessibilityManager) context2.getSystemService("accessibility");
        C0471f0 c0471f0 = new C0471f0(context2);
        this.f10767z = c0471f0;
        c0471f0.m40630J(true);
        c0471f0.m40636D(this);
        c0471f0.m40631I(2);
        c0471f0.mo40616p(getAdapter());
        c0471f0.m40628L(new C3783a());
        int i3 = C5429l.f14926E2;
        if (m29500h.hasValue(i3)) {
            setSimpleItems(m29500h.getResourceId(i3, 0));
        }
        m29500h.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f10766C, strArr));
    }
}
