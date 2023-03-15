package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0526u0;
import p070e.C4906j;
import p209l.InterfaceC6954e;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0389k.InterfaceC0390a, View.OnClickListener, ActionMenuView.InterfaceC0409a {

    /* renamed from: B */
    C0382g f968B;

    /* renamed from: C */
    private CharSequence f969C;

    /* renamed from: D */
    private Drawable f970D;

    /* renamed from: E */
    C0378e.InterfaceC0380b f971E;

    /* renamed from: F */
    private AbstractView$OnTouchListenerC0467e0 f972F;

    /* renamed from: G */
    AbstractC0367b f973G;

    /* renamed from: H */
    private boolean f974H;

    /* renamed from: I */
    private boolean f975I;

    /* renamed from: J */
    private int f976J;

    /* renamed from: K */
    private int f977K;

    /* renamed from: L */
    private int f978L;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0366a extends AbstractView$OnTouchListenerC0467e0 {
        public C0366a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0
        /* renamed from: b */
        public InterfaceC6954e mo40648b() {
            AbstractC0367b abstractC0367b = ActionMenuItemView.this.f973G;
            if (abstractC0367b != null) {
                return abstractC0367b.mo40876a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0
        /* renamed from: c */
        protected boolean mo40647c() {
            InterfaceC6954e mo40648b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0378e.InterfaceC0380b interfaceC0380b = actionMenuItemView.f971E;
            return interfaceC0380b != null && interfaceC0380b.mo40859a(actionMenuItemView.f968B) && (mo40648b = mo40648b()) != null && mo40648b.mo19709c();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0367b {
        /* renamed from: a */
        public abstract InterfaceC6954e mo40876a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private boolean m41077g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: h */
    private void m41076h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f969C);
        if (this.f970D != null && (!this.f968B.m40994B() || (!this.f974H && !this.f975I))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f969C : null);
        CharSequence contentDescription = this.f968B.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f968B.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f968B.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0526u0.m40411a(this, z3 ? null : this.f968B.getTitle());
        } else {
            C0526u0.m40411a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0409a
    /* renamed from: a */
    public boolean mo40858a() {
        return m41078f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0409a
    /* renamed from: b */
    public boolean mo40857b() {
        return m41078f() && this.f968B.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    /* renamed from: d */
    public boolean mo29453d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    /* renamed from: e */
    public void mo29452e(C0382g c0382g, int i) {
        this.f968B = c0382g;
        setIcon(c0382g.getIcon());
        setTitle(c0382g.m40987i(this));
        setId(c0382g.getItemId());
        setVisibility(c0382g.isVisible() ? 0 : 8);
        setEnabled(c0382g.isEnabled());
        if (c0382g.hasSubMenu() && this.f972F == null) {
            this.f972F = new C0366a();
        }
    }

    /* renamed from: f */
    public boolean m41078f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    public C0382g getItemData() {
        return this.f968B;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0378e.InterfaceC0380b interfaceC0380b = this.f971E;
        if (interfaceC0380b != null) {
            interfaceC0380b.mo40859a(this.f968B);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f974H = m41077g();
        m41076h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean m41078f = m41078f();
        if (m41078f && (i4 = this.f977K) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f976J);
        } else {
            i3 = this.f976J;
        }
        if (mode != 1073741824 && this.f976J > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (m41078f || this.f970D == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f970D.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0467e0 abstractView$OnTouchListenerC0467e0;
        if (this.f968B.hasSubMenu() && (abstractView$OnTouchListenerC0467e0 = this.f972F) != null && abstractView$OnTouchListenerC0467e0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f975I != z) {
            this.f975I = z;
            C0382g c0382g = this.f968B;
            if (c0382g != null) {
                c0382g.m40993c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f970D = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f978L;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m41076h();
    }

    public void setItemInvoker(C0378e.InterfaceC0380b interfaceC0380b) {
        this.f971E = interfaceC0380b;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f977K = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0367b abstractC0367b) {
        this.f973G = abstractC0367b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f969C = charSequence;
        m41076h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f974H = m41077g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4906j.f13596v, i, 0);
        this.f976J = obtainStyledAttributes.getDimensionPixelSize(C4906j.f13601w, 0);
        obtainStyledAttributes.recycle();
        this.f978L = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f977K = -1;
        setSaveEnabled(false);
    }
}
