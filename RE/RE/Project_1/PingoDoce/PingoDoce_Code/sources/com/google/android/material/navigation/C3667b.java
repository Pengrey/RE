package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.C0382g;

/* renamed from: com.google.android.material.navigation.b */
/* loaded from: classes.dex */
public final class C3667b extends C0378e {

    /* renamed from: B */
    private final Class<?> f10290B;

    /* renamed from: C */
    private final int f10291C;

    public C3667b(Context context, Class<?> cls, int i) {
        super(context);
        this.f10290B = cls;
        this.f10291C = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.C0378e
    /* renamed from: a */
    public MenuItem mo29428a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f10291C) {
            m41014h0();
            MenuItem mo29428a = super.mo29428a(i, i2, i3, charSequence);
            if (mo29428a instanceof C0382g) {
                ((C0382g) mo29428a).m40976t(true);
            }
            m41015g0();
            return mo29428a;
        }
        String simpleName = this.f10290B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f10291C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.C0378e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f10290B.getSimpleName() + " does not support submenus");
    }
}
