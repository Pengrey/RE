package p209l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p150i2.InterfaceMenuItemC5994b;
import p150i2.InterfaceSubMenuC5995c;
import p301q.C9558g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l.b */
/* loaded from: classes.dex */
public abstract class AbstractC6946b {

    /* renamed from: a */
    final Context f18476a;

    /* renamed from: b */
    private C9558g<InterfaceMenuItemC5994b, MenuItem> f18477b;

    /* renamed from: c */
    private C9558g<InterfaceSubMenuC5995c, SubMenu> f18478c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6946b(Context context) {
        this.f18476a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m19727c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC5994b) {
            InterfaceMenuItemC5994b interfaceMenuItemC5994b = (InterfaceMenuItemC5994b) menuItem;
            if (this.f18477b == null) {
                this.f18477b = new C9558g<>();
            }
            MenuItem menuItem2 = this.f18477b.get(menuItem);
            if (menuItem2 == null) {
                MenuItemC6947c menuItemC6947c = new MenuItemC6947c(this.f18476a, interfaceMenuItemC5994b);
                this.f18477b.put(interfaceMenuItemC5994b, menuItemC6947c);
                return menuItemC6947c;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m19726d(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC5995c) {
            InterfaceSubMenuC5995c interfaceSubMenuC5995c = (InterfaceSubMenuC5995c) subMenu;
            if (this.f18478c == null) {
                this.f18478c = new C9558g<>();
            }
            SubMenu subMenu2 = this.f18478c.get(interfaceSubMenuC5995c);
            if (subMenu2 == null) {
                SubMenuC6955f subMenuC6955f = new SubMenuC6955f(this.f18476a, interfaceSubMenuC5995c);
                this.f18478c.put(interfaceSubMenuC5995c, subMenuC6955f);
                return subMenuC6955f;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m19725e() {
        C9558g<InterfaceMenuItemC5994b, MenuItem> c9558g = this.f18477b;
        if (c9558g != null) {
            c9558g.clear();
        }
        C9558g<InterfaceSubMenuC5995c, SubMenu> c9558g2 = this.f18478c;
        if (c9558g2 != null) {
            c9558g2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m19724f(int i) {
        if (this.f18477b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f18477b.size()) {
            if (this.f18477b.m10614m(i2).getGroupId() == i) {
                this.f18477b.m10612o(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m19723g(int i) {
        if (this.f18477b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f18477b.size(); i2++) {
            if (this.f18477b.m10614m(i2).getItemId() == i) {
                this.f18477b.m10612o(i2);
                return;
            }
        }
    }
}
