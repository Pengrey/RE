package p209l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1109b;
import java.lang.reflect.Method;
import p150i2.InterfaceMenuItemC5994b;
import p189k.InterfaceC6543c;

/* renamed from: l.c */
/* loaded from: classes.dex */
public class MenuItemC6947c extends AbstractC6946b implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC5994b f18479d;

    /* renamed from: e */
    private Method f18480e;

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: l.c$a */
    /* loaded from: classes.dex */
    private class C6948a extends AbstractC1109b {

        /* renamed from: b */
        final ActionProvider f18481b;

        C6948a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f18481b = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1109b
        /* renamed from: a */
        public boolean mo19721a() {
            return this.f18481b.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1109b
        /* renamed from: c */
        public View mo19720c() {
            return this.f18481b.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC1109b
        /* renamed from: e */
        public boolean mo19719e() {
            return this.f18481b.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1109b
        /* renamed from: f */
        public void mo19718f(SubMenu subMenu) {
            this.f18481b.onPrepareSubMenu(MenuItemC6947c.this.m19726d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: l.c$b */
    /* loaded from: classes.dex */
    private class ActionProvider$VisibilityListenerC6949b extends C6948a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private AbstractC1109b.InterfaceC1111b f18483d;

        ActionProvider$VisibilityListenerC6949b(MenuItemC6947c menuItemC6947c, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC1109b
        /* renamed from: b */
        public boolean mo19717b() {
            return this.f18481b.isVisible();
        }

        @Override // androidx.core.view.AbstractC1109b
        /* renamed from: d */
        public View mo19716d(MenuItem menuItem) {
            return this.f18481b.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1109b
        /* renamed from: g */
        public boolean mo19715g() {
            return this.f18481b.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1109b
        /* renamed from: j */
        public void mo19714j(AbstractC1109b.InterfaceC1111b interfaceC1111b) {
            this.f18483d = interfaceC1111b;
            this.f18481b.setVisibilityListener(interfaceC1111b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC1109b.InterfaceC1111b interfaceC1111b = this.f18483d;
            if (interfaceC1111b != null) {
                interfaceC1111b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: l.c$c */
    /* loaded from: classes.dex */
    static class C6950c extends FrameLayout implements InterfaceC6543c {

        /* renamed from: w */
        final CollapsibleActionView f18484w;

        C6950c(View view) {
            super(view.getContext());
            this.f18484w = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m19713a() {
            return (View) this.f18484w;
        }

        @Override // p189k.InterfaceC6543c
        /* renamed from: c */
        public void mo19712c() {
            this.f18484w.onActionViewExpanded();
        }

        @Override // p189k.InterfaceC6543c
        /* renamed from: f */
        public void mo19711f() {
            this.f18484w.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: l.c$d */
    /* loaded from: classes.dex */
    private class MenuItem$OnActionExpandListenerC6951d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f18485a;

        MenuItem$OnActionExpandListenerC6951d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f18485a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f18485a.onMenuItemActionCollapse(MenuItemC6947c.this.m19727c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f18485a.onMenuItemActionExpand(MenuItemC6947c.this.m19727c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: l.c$e */
    /* loaded from: classes.dex */
    private class MenuItem$OnMenuItemClickListenerC6952e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f18487a;

        MenuItem$OnMenuItemClickListenerC6952e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f18487a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f18487a.onMenuItemClick(MenuItemC6947c.this.m19727c(menuItem));
        }
    }

    public MenuItemC6947c(Context context, InterfaceMenuItemC5994b interfaceMenuItemC5994b) {
        super(context);
        if (interfaceMenuItemC5994b != null) {
            this.f18479d = interfaceMenuItemC5994b;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f18479d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f18479d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1109b mo19732b = this.f18479d.mo19732b();
        if (mo19732b instanceof C6948a) {
            return ((C6948a) mo19732b).f18481b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f18479d.getActionView();
        return actionView instanceof C6950c ? ((C6950c) actionView).m19713a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f18479d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f18479d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f18479d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f18479d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f18479d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f18479d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f18479d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f18479d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f18479d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f18479d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f18479d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f18479d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f18479d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m19726d(this.f18479d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f18479d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f18479d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f18479d.getTooltipText();
    }

    /* renamed from: h */
    public void m19722h(boolean z) {
        try {
            if (this.f18480e == null) {
                this.f18480e = this.f18479d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f18480e.invoke(this.f18479d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f18479d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f18479d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f18479d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f18479d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f18479d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f18479d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC1109b c6948a;
        if (Build.VERSION.SDK_INT >= 16) {
            c6948a = new ActionProvider$VisibilityListenerC6949b(this, this.f18476a, actionProvider);
        } else {
            c6948a = new C6948a(this.f18476a, actionProvider);
        }
        InterfaceMenuItemC5994b interfaceMenuItemC5994b = this.f18479d;
        if (actionProvider == null) {
            c6948a = null;
        }
        interfaceMenuItemC5994b.mo19733a(c6948a);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C6950c(view);
        }
        this.f18479d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f18479d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f18479d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f18479d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f18479d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f18479d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f18479d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18479d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18479d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f18479d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f18479d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f18479d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC6951d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18479d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC6952e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f18479d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f18479d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f18479d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f18479d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18479d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f18479d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f18479d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f18479d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f18479d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f18479d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f18479d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f18479d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f18479d.setActionView(i);
        View actionView = this.f18479d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f18479d.setActionView(new C6950c(actionView));
        }
        return this;
    }
}
