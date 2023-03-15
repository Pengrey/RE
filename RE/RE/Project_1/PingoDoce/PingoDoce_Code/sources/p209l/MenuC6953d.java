package p209l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p150i2.InterfaceMenuC5993a;

/* renamed from: l.d */
/* loaded from: classes.dex */
public class MenuC6953d extends AbstractC6946b implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC5993a f18489d;

    public MenuC6953d(Context context, InterfaceMenuC5993a interfaceMenuC5993a) {
        super(context);
        if (interfaceMenuC5993a != null) {
            this.f18489d = interfaceMenuC5993a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m19727c(this.f18489d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f18489d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m19727c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m19726d(this.f18489d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m19725e();
        this.f18489d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f18489d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m19727c(this.f18489d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m19727c(this.f18489d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f18489d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f18489d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f18489d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f18489d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m19724f(i);
        this.f18489d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m19723g(i);
        this.f18489d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f18489d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f18489d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f18489d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f18489d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f18489d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m19727c(this.f18489d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m19726d(this.f18489d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m19727c(this.f18489d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m19726d(this.f18489d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m19727c(this.f18489d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m19726d(this.f18489d.addSubMenu(i, i2, i3, i4));
    }
}
