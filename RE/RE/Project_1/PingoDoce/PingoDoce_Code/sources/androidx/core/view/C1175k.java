package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p150i2.InterfaceMenuItemC5994b;

/* renamed from: androidx.core.view.k */
/* loaded from: classes.dex */
public final class C1175k {

    /* compiled from: MenuItemCompat.java */
    /* renamed from: androidx.core.view.k$a */
    /* loaded from: classes.dex */
    static class C1176a {
        /* renamed from: a */
        static int m38135a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        static CharSequence m38134b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        static ColorStateList m38133c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        static PorterDuff.Mode m38132d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        static int m38131e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        static CharSequence m38130f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        static MenuItem m38129g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: h */
        static MenuItem m38128h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        static MenuItem m38127i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        static MenuItem m38126j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        static MenuItem m38125k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: l */
        static MenuItem m38124l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        /* renamed from: m */
        static MenuItem m38123m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m38142a(MenuItem menuItem, AbstractC1109b abstractC1109b) {
        if (menuItem instanceof InterfaceMenuItemC5994b) {
            return ((InterfaceMenuItemC5994b) menuItem).mo19733a(abstractC1109b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m38141b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC5994b) {
            ((InterfaceMenuItemC5994b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1176a.m38129g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m38140c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC5994b) {
            ((InterfaceMenuItemC5994b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1176a.m38128h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m38139d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC5994b) {
            ((InterfaceMenuItemC5994b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1176a.m38127i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m38138e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC5994b) {
            ((InterfaceMenuItemC5994b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1176a.m38126j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m38137f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC5994b) {
            ((InterfaceMenuItemC5994b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1176a.m38125k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m38136g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC5994b) {
            ((InterfaceMenuItemC5994b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1176a.m38123m(menuItem, charSequence);
        }
    }
}
