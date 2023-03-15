package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p073e2.C4966e;
import p073e2.InterfaceC4972h;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0853b extends View {

    /* renamed from: A */
    protected boolean f2599A;

    /* renamed from: B */
    protected String f2600B;

    /* renamed from: C */
    protected String f2601C;

    /* renamed from: D */
    private HashMap<Integer, String> f2602D;

    /* renamed from: w */
    protected int[] f2603w;

    /* renamed from: x */
    protected int f2604x;

    /* renamed from: y */
    protected Context f2605y;

    /* renamed from: z */
    protected InterfaceC4972h f2606z;

    public AbstractC0853b(Context context) {
        super(context);
        this.f2603w = new int[32];
        this.f2599A = false;
        this.f2602D = new HashMap<>();
        this.f2605y = context;
        mo39364h(null);
    }

    /* renamed from: a */
    private void m39419a(String str) {
        if (str == null || str.length() == 0 || this.f2605y == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int m39413g = m39413g(trim);
        if (m39413g != 0) {
            this.f2602D.put(Integer.valueOf(m39413g), trim);
            m39418b(m39413g);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: b */
    private void m39418b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f2604x + 1;
        int[] iArr = this.f2603w;
        if (i2 > iArr.length) {
            this.f2603w = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2603w;
        int i3 = this.f2604x;
        iArr2[i3] = i;
        this.f2604x = i3 + 1;
    }

    /* renamed from: c */
    private void m39417c(String str) {
        if (str == null || str.length() == 0 || this.f2605y == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C0847b) && trim.equals(((ConstraintLayout.C0847b) layoutParams).f2537U)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m39418b(childAt.getId());
                }
            }
        }
    }

    /* renamed from: f */
    private int m39414f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2605y.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    private int m39413g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m39440g = constraintLayout.m39440g(0, str);
            if (m39440g instanceof Integer) {
                i = ((Integer) m39440g).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m39414f(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0867h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f2605y.getResources().getIdentifier(str, "id", this.f2605y.getPackageName()) : i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m39416d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m39415e((ConstraintLayout) parent);
    }

    /* renamed from: e */
    protected void m39415e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f2604x; i++) {
            View m39438i = constraintLayout.m39438i(this.f2603w[i]);
            if (m39438i != null) {
                m39438i.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    m39438i.setTranslationZ(m39438i.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2603w, this.f2604x);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void mo39364h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0868i.f2783J0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0868i.f2843V0) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2600B = string;
                    setIds(string);
                } else if (index == C0868i.f2848W0) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2601C = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    public void mo39412i(C4966e c4966e, boolean z) {
    }

    /* renamed from: j */
    public void mo39411j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void m39410k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void m39409l(ConstraintLayout constraintLayout) {
    }

    /* renamed from: m */
    public void m39408m(ConstraintLayout constraintLayout) {
        String str;
        int m39414f;
        if (isInEditMode()) {
            setIds(this.f2600B);
        }
        InterfaceC4972h interfaceC4972h = this.f2606z;
        if (interfaceC4972h == null) {
            return;
        }
        interfaceC4972h.mo25998c();
        for (int i = 0; i < this.f2604x; i++) {
            int i2 = this.f2603w[i];
            View m39438i = constraintLayout.m39438i(i2);
            if (m39438i == null && (m39414f = m39414f(constraintLayout, (str = this.f2602D.get(Integer.valueOf(i2))))) != 0) {
                this.f2603w[i] = m39414f;
                this.f2602D.put(Integer.valueOf(m39414f), str);
                m39438i = constraintLayout.m39438i(m39414f);
            }
            if (m39438i != null) {
                this.f2606z.mo26000b(constraintLayout.m39437j(m39438i));
            }
        }
        this.f2606z.mo25995a(constraintLayout.f2514y);
    }

    /* renamed from: n */
    public void m39407n() {
        if (this.f2606z == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0847b) {
            ((ConstraintLayout.C0847b) layoutParams).f2568m0 = (C4966e) this.f2606z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2600B;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2601C;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f2599A) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f2600B = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2604x = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m39419a(str.substring(i));
                return;
            } else {
                m39419a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f2601C = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2604x = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m39417c(str.substring(i));
                return;
            } else {
                m39417c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2600B = null;
        this.f2604x = 0;
        for (int i : iArr) {
            m39418b(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2600B == null) {
            m39418b(i);
        }
    }

    public AbstractC0853b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2603w = new int[32];
        this.f2599A = false;
        this.f2602D = new HashMap<>();
        this.f2605y = context;
        mo39364h(attributeSet);
    }
}
