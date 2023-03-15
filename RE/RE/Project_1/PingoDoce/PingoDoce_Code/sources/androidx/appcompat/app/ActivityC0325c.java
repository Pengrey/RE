package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0539x0;
import androidx.core.app.C0883b;
import androidx.core.app.C0905h;
import androidx.core.app.C0926p;
import androidx.fragment.app.ActivityC1354d;
import androidx.lifecycle.C1490u0;
import androidx.lifecycle.C1492v0;
import androidx.savedstate.C1664d;
import androidx.savedstate.SavedStateRegistry;
import p035c.InterfaceC1960b;
import p091f.InterfaceC5146a;
import p189k.AbstractC6541b;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public class ActivityC0325c extends ActivityC1354d implements InterfaceC5146a, C0926p.InterfaceC0927a {

    /* renamed from: M */
    private AbstractC0328d f799M;

    /* renamed from: N */
    private Resources f800N;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatActivity.java */
    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    public class C0326a implements SavedStateRegistry.InterfaceC1660b {
        C0326a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1660b
        /* renamed from: a */
        public Bundle mo35789a() {
            Bundle bundle = new Bundle();
            ActivityC0325c.this.m41259Y().mo41169u(bundle);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatActivity.java */
    /* renamed from: androidx.appcompat.app.c$b */
    /* loaded from: classes.dex */
    public class C0327b implements InterfaceC1960b {
        C0327b() {
        }

        @Override // p035c.InterfaceC1960b
        /* renamed from: a */
        public void mo35026a(Context context) {
            AbstractC0328d m41259Y = ActivityC0325c.this.m41259Y();
            m41259Y.mo41183n();
            m41259Y.mo41177q(ActivityC0325c.this.mo35784i().m35796a("androidx:appcompat"));
        }
    }

    public ActivityC0325c() {
        m41257a0();
    }

    /* renamed from: H */
    private void m41260H() {
        C1490u0.m36968b(getWindow().getDecorView(), this);
        C1492v0.m36966b(getWindow().getDecorView(), this);
        C1664d.m35782b(getWindow().getDecorView(), this);
    }

    /* renamed from: a0 */
    private void m41257a0() {
        mo35784i().m35793d("androidx:appcompat", new C0326a());
        m41371F(new C0327b());
    }

    /* renamed from: g0 */
    private boolean m41251g0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.fragment.app.ActivityC1354d
    /* renamed from: X */
    public void mo37315X() {
        m41259Y().mo41181o();
    }

    /* renamed from: Y */
    public AbstractC0328d m41259Y() {
        if (this.f799M == null) {
            this.f799M = AbstractC0328d.m41246g(this, this);
        }
        return this.f799M;
    }

    /* renamed from: Z */
    public AbstractC0319a m41258Z() {
        return m41259Y().mo41185m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m41260H();
        m41259Y().mo41199d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(m41259Y().mo41196f(context));
    }

    /* renamed from: b0 */
    public void m41256b0(C0926p c0926p) {
        c0926p.m39122f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c0 */
    public void m41255c0(int i) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0319a m41258Z = m41258Z();
        if (getWindow().hasFeature(0)) {
            if (m41258Z == null || !m41258Z.m41293g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p091f.InterfaceC5146a
    /* renamed from: d */
    public void mo25555d(AbstractC6541b abstractC6541b) {
    }

    /* renamed from: d0 */
    public void m41254d0(C0926p c0926p) {
    }

    @Override // androidx.core.app.ActivityC0904g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0319a m41258Z = m41258Z();
        if (keyCode == 82 && m41258Z != null && m41258Z.m41290p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Deprecated
    /* renamed from: e0 */
    public void m41253e0() {
    }

    /* renamed from: f0 */
    public boolean m41252f0() {
        Intent mo39117v = mo39117v();
        if (mo39117v != null) {
            if (m41249i0(mo39117v)) {
                C0926p m39120h = C0926p.m39120h(this);
                m41256b0(m39120h);
                m41254d0(m39120h);
                m39120h.m39119l();
                try {
                    C0883b.m39265o(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            m41250h0(mo39117v);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m41259Y().mo41192i(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m41259Y().mo41187l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f800N == null && C0539x0.m40332c()) {
            this.f800N = new C0539x0(this, super.getResources());
        }
        Resources resources = this.f800N;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: h0 */
    public void m41250h0(Intent intent) {
        C0905h.m39219e(this, intent);
    }

    /* renamed from: i0 */
    public boolean m41249i0(Intent intent) {
        return C0905h.m39218f(this, intent);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m41259Y().mo41181o();
    }

    @Override // p091f.InterfaceC5146a
    /* renamed from: o */
    public AbstractC6541b mo25553o(AbstractC6541b.InterfaceC6542a interfaceC6542a) {
        return null;
    }

    @Override // androidx.fragment.app.ActivityC1354d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f800N != null) {
            this.f800N.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m41259Y().mo41179p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m41253e0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC1354d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m41259Y().mo41175r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m41251g0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC1354d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0319a m41258Z = m41258Z();
        if (menuItem.getItemId() != 16908332 || m41258Z == null || (m41258Z.mo41092j() & 4) == 0) {
            return false;
        }
        return m41252f0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.ActivityC1354d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m41259Y().mo41173s(bundle);
    }

    @Override // androidx.fragment.app.ActivityC1354d, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m41259Y().mo41171t();
    }

    @Override // androidx.fragment.app.ActivityC1354d, android.app.Activity
    protected void onStart() {
        super.onStart();
        m41259Y().mo41167v();
    }

    @Override // androidx.fragment.app.ActivityC1354d, android.app.Activity
    protected void onStop() {
        super.onStop();
        m41259Y().mo41165w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m41259Y().mo41233E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0319a m41258Z = m41258Z();
        if (getWindow().hasFeature(0)) {
            if (m41258Z == null || !m41258Z.m41289q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        m41260H();
        m41259Y().mo41241A(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m41259Y().mo41235D(i);
    }

    @Override // androidx.core.app.C0926p.InterfaceC0927a
    /* renamed from: v */
    public Intent mo39117v() {
        return C0905h.m39223a(this);
    }

    @Override // p091f.InterfaceC5146a
    /* renamed from: y */
    public void mo25552y(AbstractC6541b abstractC6541b) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m41260H();
        m41259Y().mo41239B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m41260H();
        m41259Y().mo41237C(view, layoutParams);
    }
}
