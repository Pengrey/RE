package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0378e;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public class SubMenuC0394m extends C0378e implements SubMenu {

    /* renamed from: B */
    private C0378e f1164B;

    /* renamed from: C */
    private C0382g f1165C;

    public SubMenuC0394m(Context context, C0378e c0378e, C0382g c0382g) {
        super(context);
        this.f1164B = c0378e;
        this.f1165C = c0382g;
    }

    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: F */
    public C0378e mo40940F() {
        return this.f1164B.mo40940F();
    }

    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: H */
    public boolean mo40939H() {
        return this.f1164B.mo40939H();
    }

    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: I */
    public boolean mo40938I() {
        return this.f1164B.mo40938I();
    }

    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: J */
    public boolean mo40937J() {
        return this.f1164B.mo40937J();
    }

    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: V */
    public void mo40936V(C0378e.InterfaceC0379a interfaceC0379a) {
        this.f1164B.mo40936V(interfaceC0379a);
    }

    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: f */
    public boolean mo40935f(C0382g c0382g) {
        return this.f1164B.mo40935f(c0382g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1165C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: h */
    public boolean mo40934h(C0378e c0378e, MenuItem menuItem) {
        return super.mo40934h(c0378e, menuItem) || this.f1164B.mo40934h(c0378e, menuItem);
    }

    /* renamed from: i0 */
    public Menu m40933i0() {
        return this.f1164B;
    }

    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: m */
    public boolean mo40932m(C0382g c0382g) {
        return this.f1164B.mo40932m(c0382g);
    }

    @Override // androidx.appcompat.view.menu.C0378e, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1164B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m41027Z(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m41022c0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m41020d0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1165C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0378e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1164B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: v */
    public String mo40931v() {
        C0382g c0382g = this.f1165C;
        int itemId = c0382g != null ? c0382g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo40931v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m41028Y(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m41024b0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1165C.setIcon(i);
        return this;
    }
}
