package p209l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p150i2.InterfaceSubMenuC5995c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l.f */
/* loaded from: classes.dex */
public class SubMenuC6955f extends MenuC6953d implements SubMenu {

    /* renamed from: e */
    private final InterfaceSubMenuC5995c f18490e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC6955f(Context context, InterfaceSubMenuC5995c interfaceSubMenuC5995c) {
        super(context, interfaceSubMenuC5995c);
        this.f18490e = interfaceSubMenuC5995c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f18490e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m19727c(this.f18490e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f18490e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f18490e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f18490e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f18490e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f18490e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f18490e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f18490e.setIcon(drawable);
        return this;
    }
}
