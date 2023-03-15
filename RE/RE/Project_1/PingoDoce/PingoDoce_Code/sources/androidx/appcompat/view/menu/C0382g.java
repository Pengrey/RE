package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.AbstractC1109b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import p070e.C4904h;
import p111g.C5586a;
import p150i2.InterfaceMenuItemC5994b;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class C0382g implements InterfaceMenuItemC5994b {

    /* renamed from: A */
    private View f1095A;

    /* renamed from: B */
    private AbstractC1109b f1096B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1097C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1099E;

    /* renamed from: a */
    private final int f1100a;

    /* renamed from: b */
    private final int f1101b;

    /* renamed from: c */
    private final int f1102c;

    /* renamed from: d */
    private final int f1103d;

    /* renamed from: e */
    private CharSequence f1104e;

    /* renamed from: f */
    private CharSequence f1105f;

    /* renamed from: g */
    private Intent f1106g;

    /* renamed from: h */
    private char f1107h;

    /* renamed from: j */
    private char f1109j;

    /* renamed from: l */
    private Drawable f1111l;

    /* renamed from: n */
    C0378e f1113n;

    /* renamed from: o */
    private SubMenuC0394m f1114o;

    /* renamed from: p */
    private Runnable f1115p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1116q;

    /* renamed from: r */
    private CharSequence f1117r;

    /* renamed from: s */
    private CharSequence f1118s;

    /* renamed from: z */
    private int f1125z;

    /* renamed from: i */
    private int f1108i = 4096;

    /* renamed from: k */
    private int f1110k = 4096;

    /* renamed from: m */
    private int f1112m = 0;

    /* renamed from: t */
    private ColorStateList f1119t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1120u = null;

    /* renamed from: v */
    private boolean f1121v = false;

    /* renamed from: w */
    private boolean f1122w = false;

    /* renamed from: x */
    private boolean f1123x = false;

    /* renamed from: y */
    private int f1124y = 16;

    /* renamed from: D */
    private boolean f1098D = false;

    /* compiled from: MenuItemImpl.java */
    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    class C0383a implements AbstractC1109b.InterfaceC1111b {
        C0383a() {
        }

        @Override // androidx.core.view.AbstractC1109b.InterfaceC1111b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0382g c0382g = C0382g.this;
            c0382g.f1113n.m41040L(c0382g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0382g(C0378e c0378e, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1125z = 0;
        this.f1113n = c0378e;
        this.f1100a = i2;
        this.f1101b = i;
        this.f1102c = i3;
        this.f1103d = i4;
        this.f1104e = charSequence;
        this.f1125z = i5;
    }

    /* renamed from: d */
    private static void m40992d(StringBuilder sb2, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb2.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m40991e(Drawable drawable) {
        if (drawable != null && this.f1123x && (this.f1121v || this.f1122w)) {
            drawable = C0981a.m38859r(drawable).mutate();
            if (this.f1121v) {
                C0981a.m38862o(drawable, this.f1119t);
            }
            if (this.f1122w) {
                C0981a.m38861p(drawable, this.f1120u);
            }
            this.f1123x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m40995A() {
        return this.f1113n.mo40937J() && m40989g() != 0;
    }

    /* renamed from: B */
    public boolean m40994B() {
        return (this.f1125z & 4) == 4;
    }

    @Override // p150i2.InterfaceMenuItemC5994b
    /* renamed from: a */
    public InterfaceMenuItemC5994b mo19733a(AbstractC1109b abstractC1109b) {
        AbstractC1109b abstractC1109b2 = this.f1096B;
        if (abstractC1109b2 != null) {
            abstractC1109b2.m38486h();
        }
        this.f1095A = null;
        this.f1096B = abstractC1109b;
        this.f1113n.m41039M(true);
        AbstractC1109b abstractC1109b3 = this.f1096B;
        if (abstractC1109b3 != null) {
            abstractC1109b3.mo19714j(new C0383a());
        }
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b
    /* renamed from: b */
    public AbstractC1109b mo19732b() {
        return this.f1096B;
    }

    /* renamed from: c */
    public void m40993c() {
        this.f1113n.m41041K(this);
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1125z & 8) == 0) {
            return false;
        }
        if (this.f1095A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1097C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1113n.mo40935f(this);
        }
        return false;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public boolean expandActionView() {
        if (m40986j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f1097C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f1113n.mo40932m(this);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public int m40990f() {
        return this.f1103d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public char m40989g() {
        return this.f1113n.mo40938I() ? this.f1109j : this.f1107h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1095A;
        if (view != null) {
            return view;
        }
        AbstractC1109b abstractC1109b = this.f1096B;
        if (abstractC1109b != null) {
            View mo19716d = abstractC1109b.mo19716d(this);
            this.f1095A = mo19716d;
            return mo19716d;
        }
        return null;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1110k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1109j;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1117r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1101b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1111l;
        if (drawable != null) {
            return m40991e(drawable);
        }
        if (this.f1112m != 0) {
            Drawable m23699b = C5586a.m23699b(this.f1113n.m41001w(), this.f1112m);
            this.f1112m = 0;
            this.f1111l = m23699b;
            return m40991e(m23699b);
        }
        return null;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1119t;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1120u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1106g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1100a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1099E;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1108i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1107h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1102c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1114o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1104e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1105f;
        if (charSequence == null) {
            charSequence = this.f1104e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1118s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m40988h() {
        char m40989g = m40989g();
        if (m40989g == 0) {
            return BuildConfig.VERSION_NAME;
        }
        Resources resources = this.f1113n.m41001w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1113n.m41001w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C4904h.abc_prepend_shortcut_label));
        }
        int i = this.f1113n.mo40938I() ? this.f1110k : this.f1108i;
        m40992d(sb2, i, 65536, resources.getString(C4904h.abc_menu_meta_shortcut_label));
        m40992d(sb2, i, 4096, resources.getString(C4904h.abc_menu_ctrl_shortcut_label));
        m40992d(sb2, i, 2, resources.getString(C4904h.abc_menu_alt_shortcut_label));
        m40992d(sb2, i, 1, resources.getString(C4904h.abc_menu_shift_shortcut_label));
        m40992d(sb2, i, 4, resources.getString(C4904h.abc_menu_sym_shortcut_label));
        m40992d(sb2, i, 8, resources.getString(C4904h.abc_menu_function_shortcut_label));
        if (m40989g == '\b') {
            sb2.append(resources.getString(C4904h.abc_menu_delete_shortcut_label));
        } else if (m40989g == '\n') {
            sb2.append(resources.getString(C4904h.abc_menu_enter_shortcut_label));
        } else if (m40989g != ' ') {
            sb2.append(m40989g);
        } else {
            sb2.append(resources.getString(C4904h.abc_menu_space_shortcut_label));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1114o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence m40987i(InterfaceC0389k.InterfaceC0390a interfaceC0390a) {
        if (interfaceC0390a != null && interfaceC0390a.mo29453d()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1098D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1124y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1124y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1124y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1109b abstractC1109b = this.f1096B;
        return (abstractC1109b == null || !abstractC1109b.mo19715g()) ? (this.f1124y & 8) == 0 : (this.f1124y & 8) == 0 && this.f1096B.mo19717b();
    }

    /* renamed from: j */
    public boolean m40986j() {
        AbstractC1109b abstractC1109b;
        if ((this.f1125z & 8) != 0) {
            if (this.f1095A == null && (abstractC1109b = this.f1096B) != null) {
                this.f1095A = abstractC1109b.mo19716d(this);
            }
            return this.f1095A != null;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m40985k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1116q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C0378e c0378e = this.f1113n;
            if (c0378e.mo40934h(c0378e, this)) {
                return true;
            }
            Runnable runnable = this.f1115p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f1106g != null) {
                try {
                    this.f1113n.m41001w().startActivity(this.f1106g);
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            AbstractC1109b abstractC1109b = this.f1096B;
            return abstractC1109b != null && abstractC1109b.mo19719e();
        }
        return true;
    }

    /* renamed from: l */
    public boolean m40984l() {
        return (this.f1124y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m40983m() {
        return (this.f1124y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m40982n() {
        return (this.f1125z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m40981o() {
        return (this.f1125z & 2) == 2;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    /* renamed from: p */
    public InterfaceMenuItemC5994b setActionView(int i) {
        Context m41001w = this.f1113n.m41001w();
        setActionView(LayoutInflater.from(m41001w).inflate(i, (ViewGroup) new LinearLayout(m41001w), false));
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    /* renamed from: q */
    public InterfaceMenuItemC5994b setActionView(View view) {
        int i;
        this.f1095A = view;
        this.f1096B = null;
        if (view != null && view.getId() == -1 && (i = this.f1100a) > 0) {
            view.setId(i);
        }
        this.f1113n.m41041K(this);
        return this;
    }

    /* renamed from: r */
    public void m40978r(boolean z) {
        this.f1098D = z;
        this.f1113n.m41039M(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m40977s(boolean z) {
        int i = this.f1124y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f1124y = i2;
        if (i != i2) {
            this.f1113n.m41039M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1109j == c) {
            return this;
        }
        this.f1109j = Character.toLowerCase(c);
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1124y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f1124y = i2;
        if (i != i2) {
            this.f1113n.m41039M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1124y & 4) != 0) {
            this.f1113n.m41029X(this);
        } else {
            m40977s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1124y |= 16;
        } else {
            this.f1124y &= -17;
        }
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1112m = 0;
        this.f1111l = drawable;
        this.f1123x = true;
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1119t = colorStateList;
        this.f1121v = true;
        this.f1123x = true;
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1120u = mode;
        this.f1122w = true;
        this.f1123x = true;
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1106g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f1107h == c) {
            return this;
        }
        this.f1107h = c;
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1097C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1116q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1107h = c;
        this.f1109j = Character.toLowerCase(c2);
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1125z = i;
        this.f1113n.m41041K(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1104e = charSequence;
        this.f1113n.m41039M(false);
        SubMenuC0394m subMenuC0394m = this.f1114o;
        if (subMenuC0394m != null) {
            subMenuC0394m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1105f = charSequence;
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m40971y(z)) {
            this.f1113n.m41040L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m40976t(boolean z) {
        this.f1124y = (z ? 4 : 0) | (this.f1124y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1104e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m40975u(boolean z) {
        if (z) {
            this.f1124y |= 32;
        } else {
            this.f1124y &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m40974v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1099E = contextMenuInfo;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    /* renamed from: w */
    public InterfaceMenuItemC5994b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void m40972x(SubMenuC0394m subMenuC0394m) {
        this.f1114o = subMenuC0394m;
        subMenuC0394m.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m40971y(boolean z) {
        int i = this.f1124y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f1124y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean m40970z() {
        return this.f1113n.m41045C();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC5994b setContentDescription(CharSequence charSequence) {
        this.f1117r = charSequence;
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC5994b setTooltipText(CharSequence charSequence) {
        this.f1118s = charSequence;
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1109j == c && this.f1110k == i) {
            return this;
        }
        this.f1109j = Character.toLowerCase(c);
        this.f1110k = KeyEvent.normalizeMetaState(i);
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1107h == c && this.f1108i == i) {
            return this;
        }
        this.f1107h = c;
        this.f1108i = KeyEvent.normalizeMetaState(i);
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1107h = c;
        this.f1108i = KeyEvent.normalizeMetaState(i);
        this.f1109j = Character.toLowerCase(c2);
        this.f1110k = KeyEvent.normalizeMetaState(i2);
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1111l = null;
        this.f1112m = i;
        this.f1123x = true;
        this.f1113n.m41039M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f1113n.m41001w().getString(i));
    }
}
