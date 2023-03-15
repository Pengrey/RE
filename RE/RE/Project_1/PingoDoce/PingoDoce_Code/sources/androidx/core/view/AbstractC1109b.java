package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC1109b {

    /* renamed from: a */
    private InterfaceC1111b f3448a;

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1110a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1111b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC1109b(Context context) {
    }

    /* renamed from: a */
    public boolean mo19721a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo19717b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo19720c();

    /* renamed from: d */
    public View mo19716d(MenuItem menuItem) {
        return mo19720c();
    }

    /* renamed from: e */
    public boolean mo19719e() {
        return false;
    }

    /* renamed from: f */
    public void mo19718f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo19715g() {
        return false;
    }

    /* renamed from: h */
    public void m38486h() {
        this.f3448a = null;
    }

    /* renamed from: i */
    public void m38485i(InterfaceC1110a interfaceC1110a) {
    }

    /* renamed from: j */
    public void mo19714j(InterfaceC1111b interfaceC1111b) {
        if (this.f3448a != null && interfaceC1111b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3448a = interfaceC1111b;
    }
}
