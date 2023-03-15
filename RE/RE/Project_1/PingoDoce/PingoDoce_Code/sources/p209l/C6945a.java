package p209l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.AbstractC1109b;
import p150i2.InterfaceMenuItemC5994b;

/* renamed from: l.a */
/* loaded from: classes.dex */
public class C6945a implements InterfaceMenuItemC5994b {

    /* renamed from: a */
    private final int f18457a;

    /* renamed from: b */
    private final int f18458b;

    /* renamed from: c */
    private final int f18459c;

    /* renamed from: d */
    private CharSequence f18460d;

    /* renamed from: e */
    private CharSequence f18461e;

    /* renamed from: f */
    private Intent f18462f;

    /* renamed from: g */
    private char f18463g;

    /* renamed from: i */
    private char f18465i;

    /* renamed from: k */
    private Drawable f18467k;

    /* renamed from: l */
    private Context f18468l;

    /* renamed from: m */
    private CharSequence f18469m;

    /* renamed from: n */
    private CharSequence f18470n;

    /* renamed from: h */
    private int f18464h = 4096;

    /* renamed from: j */
    private int f18466j = 4096;

    /* renamed from: o */
    private ColorStateList f18471o = null;

    /* renamed from: p */
    private PorterDuff.Mode f18472p = null;

    /* renamed from: q */
    private boolean f18473q = false;

    /* renamed from: r */
    private boolean f18474r = false;

    /* renamed from: s */
    private int f18475s = 16;

    public C6945a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f18468l = context;
        this.f18457a = i2;
        this.f18458b = i;
        this.f18459c = i4;
        this.f18460d = charSequence;
    }

    /* renamed from: c */
    private void m19731c() {
        Drawable drawable = this.f18467k;
        if (drawable != null) {
            if (this.f18473q || this.f18474r) {
                Drawable m38859r = C0981a.m38859r(drawable);
                this.f18467k = m38859r;
                Drawable mutate = m38859r.mutate();
                this.f18467k = mutate;
                if (this.f18473q) {
                    C0981a.m38862o(mutate, this.f18471o);
                }
                if (this.f18474r) {
                    C0981a.m38861p(this.f18467k, this.f18472p);
                }
            }
        }
    }

    @Override // p150i2.InterfaceMenuItemC5994b
    /* renamed from: a */
    public InterfaceMenuItemC5994b mo19733a(AbstractC1109b abstractC1109b) {
        throw new UnsupportedOperationException();
    }

    @Override // p150i2.InterfaceMenuItemC5994b
    /* renamed from: b */
    public AbstractC1109b mo19732b() {
        return null;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    /* renamed from: d */
    public InterfaceMenuItemC5994b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    /* renamed from: e */
    public InterfaceMenuItemC5994b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    /* renamed from: f */
    public InterfaceMenuItemC5994b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f18466j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f18465i;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f18469m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f18458b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f18467k;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f18471o;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f18472p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f18462f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f18457a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f18464h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f18463g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f18459c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f18460d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18461e;
        return charSequence != null ? charSequence : this.f18460d;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f18470n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f18475s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f18475s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f18475s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f18475s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f18465i = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f18475s = (z ? 1 : 0) | (this.f18475s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f18475s = (z ? 2 : 0) | (this.f18475s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f18475s = (z ? 16 : 0) | (this.f18475s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f18467k = drawable;
        m19731c();
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18471o = colorStateList;
        this.f18473q = true;
        m19731c();
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18472p = mode;
        this.f18474r = true;
        m19731c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f18462f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f18463g = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f18463g = c;
        this.f18465i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f18460d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18461e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f18475s = (this.f18475s & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f18465i = Character.toLowerCase(c);
        this.f18466j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC5994b setContentDescription(CharSequence charSequence) {
        this.f18469m = charSequence;
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f18463g = c;
        this.f18464h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f18460d = this.f18468l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC5994b setTooltipText(CharSequence charSequence) {
        this.f18470n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f18467k = C0928a.m39111f(this.f18468l, i);
        m19731c();
        return this;
    }

    @Override // p150i2.InterfaceMenuItemC5994b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f18463g = c;
        this.f18464h = KeyEvent.normalizeMetaState(i);
        this.f18465i = Character.toLowerCase(c2);
        this.f18466j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
