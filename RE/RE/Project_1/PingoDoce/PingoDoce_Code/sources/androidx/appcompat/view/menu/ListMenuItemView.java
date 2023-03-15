package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.appcompat.widget.C0520s0;
import androidx.core.view.C1112b0;
import p070e.C4897a;
import p070e.C4902f;
import p070e.C4903g;
import p070e.C4906j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0389k.InterfaceC0390a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    private CheckBox f983A;

    /* renamed from: B */
    private TextView f984B;

    /* renamed from: C */
    private ImageView f985C;

    /* renamed from: D */
    private ImageView f986D;

    /* renamed from: E */
    private LinearLayout f987E;

    /* renamed from: F */
    private Drawable f988F;

    /* renamed from: G */
    private int f989G;

    /* renamed from: H */
    private Context f990H;

    /* renamed from: I */
    private boolean f991I;

    /* renamed from: J */
    private Drawable f992J;

    /* renamed from: K */
    private boolean f993K;

    /* renamed from: L */
    private LayoutInflater f994L;

    /* renamed from: M */
    private boolean f995M;

    /* renamed from: w */
    private C0382g f996w;

    /* renamed from: x */
    private ImageView f997x;

    /* renamed from: y */
    private RadioButton f998y;

    /* renamed from: z */
    private TextView f999z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.listMenuViewStyle);
    }

    /* renamed from: a */
    private void m41075a(View view) {
        m41074b(view, -1);
    }

    /* renamed from: b */
    private void m41074b(View view, int i) {
        LinearLayout linearLayout = this.f987E;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m41073c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C4903g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f983A = checkBox;
        m41075a(checkBox);
    }

    /* renamed from: f */
    private void m41072f() {
        ImageView imageView = (ImageView) getInflater().inflate(C4903g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f997x = imageView;
        m41074b(imageView, 0);
    }

    /* renamed from: g */
    private void m41071g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C4903g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f998y = radioButton;
        m41075a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f994L == null) {
            this.f994L = LayoutInflater.from(getContext());
        }
        return this.f994L;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f985C;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f986D;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f986D.getLayoutParams();
        rect.top += this.f986D.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    /* renamed from: d */
    public boolean mo29453d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    /* renamed from: e */
    public void mo29452e(C0382g c0382g, int i) {
        this.f996w = c0382g;
        setVisibility(c0382g.isVisible() ? 0 : 8);
        setTitle(c0382g.m40987i(this));
        setCheckable(c0382g.isCheckable());
        m41070h(c0382g.m40995A(), c0382g.m40989g());
        setIcon(c0382g.getIcon());
        setEnabled(c0382g.isEnabled());
        setSubMenuArrowVisible(c0382g.hasSubMenu());
        setContentDescription(c0382g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    public C0382g getItemData() {
        return this.f996w;
    }

    /* renamed from: h */
    public void m41070h(boolean z, char c) {
        int i = (z && this.f996w.m40995A()) ? 0 : 8;
        if (i == 0) {
            this.f984B.setText(this.f996w.m40988h());
        }
        if (this.f984B.getVisibility() != i) {
            this.f984B.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C1112b0.m38399v0(this, this.f988F);
        TextView textView = (TextView) findViewById(C4902f.f13378M);
        this.f999z = textView;
        int i = this.f989G;
        if (i != -1) {
            textView.setTextAppearance(this.f990H, i);
        }
        this.f984B = (TextView) findViewById(C4902f.shortcut);
        ImageView imageView = (ImageView) findViewById(C4902f.submenuarrow);
        this.f985C = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f992J);
        }
        this.f986D = (ImageView) findViewById(C4902f.group_divider);
        this.f987E = (LinearLayout) findViewById(C4902f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f997x != null && this.f991I) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f997x.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f998y == null && this.f983A == null) {
            return;
        }
        if (this.f996w.m40983m()) {
            if (this.f998y == null) {
                m41071g();
            }
            compoundButton = this.f998y;
            compoundButton2 = this.f983A;
        } else {
            if (this.f983A == null) {
                m41073c();
            }
            compoundButton = this.f983A;
            compoundButton2 = this.f998y;
        }
        if (z) {
            compoundButton.setChecked(this.f996w.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f983A;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f998y;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f996w.m40983m()) {
            if (this.f998y == null) {
                m41071g();
            }
            compoundButton = this.f998y;
        } else {
            if (this.f983A == null) {
                m41073c();
            }
            compoundButton = this.f983A;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f995M = z;
        this.f991I = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f986D;
        if (imageView != null) {
            imageView.setVisibility((this.f993K || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f996w.m40970z() || this.f995M;
        if (z || this.f991I) {
            ImageView imageView = this.f997x;
            if (imageView == null && drawable == null && !this.f991I) {
                return;
            }
            if (imageView == null) {
                m41072f();
            }
            if (drawable == null && !this.f991I) {
                this.f997x.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f997x;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f997x.getVisibility() != 0) {
                this.f997x.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f999z.setText(charSequence);
            if (this.f999z.getVisibility() != 0) {
                this.f999z.setVisibility(0);
            }
        } else if (this.f999z.getVisibility() != 8) {
            this.f999z.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0520s0 m40453v = C0520s0.m40453v(getContext(), attributeSet, C4906j.f13421I1, i, 0);
        this.f988F = m40453v.m40468g(C4906j.f13429K1);
        this.f989G = m40453v.m40461n(C4906j.f13425J1, -1);
        this.f991I = m40453v.m40474a(C4906j.f13433L1, false);
        this.f990H = context;
        this.f992J = m40453v.m40468g(C4906j.f13437M1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C4897a.dropDownListViewStyle, 0);
        this.f993K = obtainStyledAttributes.hasValue(0);
        m40453v.m40452w();
        obtainStyledAttributes.recycle();
    }
}
