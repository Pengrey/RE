package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0377d;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: classes.dex */
public class C0482h0 extends C0471f0 implements InterfaceC0480g0 {

    /* renamed from: f0 */
    private static Method f1619f0;

    /* renamed from: e0 */
    private InterfaceC0480g0 f1620e0;

    /* compiled from: MenuPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.h0$a */
    /* loaded from: classes.dex */
    public static class C0483a extends C0460c0 {

        /* renamed from: K */
        final int f1621K;

        /* renamed from: L */
        final int f1622L;

        /* renamed from: M */
        private InterfaceC0480g0 f1623M;

        /* renamed from: N */
        private MenuItem f1624N;

        public C0483a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.f1621K = 21;
                this.f1622L = 22;
                return;
            }
            this.f1621K = 22;
            this.f1622L = 21;
        }

        @Override // androidx.appcompat.widget.C0460c0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0377d c0377d;
            int pointToPosition;
            int i2;
            if (this.f1623M != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c0377d = (C0377d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    c0377d = (C0377d) adapter;
                }
                C0382g c0382g = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0377d.getCount()) {
                    c0382g = c0377d.getItem(i2);
                }
                MenuItem menuItem = this.f1624N;
                if (menuItem != c0382g) {
                    C0378e m41050b = c0377d.m41050b();
                    if (menuItem != null) {
                        this.f1623M.mo40593f(m41050b, menuItem);
                    }
                    this.f1624N = c0382g;
                    if (c0382g != null) {
                        this.f1623M.mo40594e(m41050b, c0382g);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C0377d c0377d;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1621K) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.f1622L) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    c0377d = (C0377d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    c0377d = (C0377d) adapter;
                }
                c0377d.m41050b().m41019e(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        public void setHoverListener(InterfaceC0480g0 interfaceC0480g0) {
            this.f1623M = interfaceC0480g0;
        }

        @Override // androidx.appcompat.widget.C0460c0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1619f0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0482h0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void m40598R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1599a0.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void m40597S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1599a0.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: T */
    public void m40596T(InterfaceC0480g0 interfaceC0480g0) {
        this.f1620e0 = interfaceC0480g0;
    }

    /* renamed from: U */
    public void m40595U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1619f0;
            if (method != null) {
                try {
                    method.invoke(this.f1599a0, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.f1599a0.setTouchModal(z);
    }

    @Override // androidx.appcompat.widget.InterfaceC0480g0
    /* renamed from: e */
    public void mo40594e(C0378e c0378e, MenuItem menuItem) {
        InterfaceC0480g0 interfaceC0480g0 = this.f1620e0;
        if (interfaceC0480g0 != null) {
            interfaceC0480g0.mo40594e(c0378e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0480g0
    /* renamed from: f */
    public void mo40593f(C0378e c0378e, MenuItem menuItem) {
        InterfaceC0480g0 interfaceC0480g0 = this.f1620e0;
        if (interfaceC0480g0 != null) {
            interfaceC0480g0.mo40593f(c0378e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0471f0
    /* renamed from: s */
    C0460c0 mo40592s(Context context, boolean z) {
        C0483a c0483a = new C0483a(context, z);
        c0483a.setHoverListener(this);
        return c0483a;
    }
}
