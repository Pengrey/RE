package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1112b0;
import androidx.core.view.C1166h0;
import androidx.core.view.InterfaceC1172i0;
import p070e.C4897a;
import p070e.C4906j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0452a extends ViewGroup {

    /* renamed from: A */
    protected int f1508A;

    /* renamed from: B */
    protected C1166h0 f1509B;

    /* renamed from: C */
    private boolean f1510C;

    /* renamed from: D */
    private boolean f1511D;

    /* renamed from: w */
    protected final C0453a f1512w;

    /* renamed from: x */
    protected final Context f1513x;

    /* renamed from: y */
    protected ActionMenuView f1514y;

    /* renamed from: z */
    protected ActionMenuPresenter f1515z;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    protected class C0453a implements InterfaceC1172i0 {

        /* renamed from: a */
        private boolean f1516a = false;

        /* renamed from: b */
        int f1517b;

        protected C0453a() {
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: a */
        public void mo38143a(View view) {
            this.f1516a = true;
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: b */
        public void mo20606b(View view) {
            if (this.f1516a) {
                return;
            }
            AbstractC0452a abstractC0452a = AbstractC0452a.this;
            abstractC0452a.f1509B = null;
            AbstractC0452a.super.setVisibility(this.f1517b);
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: c */
        public void mo20605c(View view) {
            AbstractC0452a.super.setVisibility(0);
            this.f1516a = false;
        }

        /* renamed from: d */
        public C0453a m40683d(C1166h0 c1166h0, int i) {
            AbstractC0452a.this.f1509B = c1166h0;
            this.f1517b = i;
            return this;
        }
    }

    AbstractC0452a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static int m40686d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m40687c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m40685e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C1166h0 m40684f(int i, long j) {
        C1166h0 c1166h0 = this.f1509B;
        if (c1166h0 != null) {
            c1166h0.m38169c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1166h0 m38170b = C1112b0.m38434e(this).m38170b(1.0f);
            m38170b.m38166f(j);
            m38170b.m38164h(this.f1512w.m40683d(m38170b, i));
            return m38170b;
        }
        C1166h0 m38170b2 = C1112b0.m38434e(this).m38170b(0.0f);
        m38170b2.m38166f(j);
        m38170b2.m38164h(this.f1512w.m40683d(m38170b2, i));
        return m38170b2;
    }

    public int getAnimatedVisibility() {
        if (this.f1509B != null) {
            return this.f1512w.f1517b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1508A;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C4906j.f13491a, C4897a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C4906j.f13536j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1515z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m40896H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1511D = false;
        }
        if (!this.f1511D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1511D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1511D = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1510C = false;
        }
        if (!this.f1510C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1510C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1510C = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1166h0 c1166h0 = this.f1509B;
            if (c1166h0 != null) {
                c1166h0.m38169c();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0452a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1512w = new C0453a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C4897a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f1513x = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1513x = context;
        }
    }
}
