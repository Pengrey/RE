package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0294f;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0305c;
import androidx.core.app.C0883b;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.C1493x;
import androidx.lifecycle.InterfaceC1488t0;
import androidx.loader.app.AbstractC1497a;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p035c.InterfaceC1960b;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class ActivityC1354d extends ComponentActivity implements C0883b.InterfaceC0887d, C0883b.InterfaceC0889f {

    /* renamed from: J */
    boolean f4041J;

    /* renamed from: K */
    boolean f4042K;

    /* renamed from: H */
    final C1366g f4043H = C1366g.m37304b(new C1357c());

    /* renamed from: I */
    final C1493x f4044I = new C1493x(this);

    /* renamed from: L */
    boolean f4045L = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    public class C1355a implements SavedStateRegistry.InterfaceC1660b {
        C1355a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1660b
        /* renamed from: a */
        public Bundle mo35789a() {
            Bundle bundle = new Bundle();
            ActivityC1354d.this.m37320S();
            ActivityC1354d.this.f4044I.m36960h(AbstractC1469p.EnumC1471b.ON_STOP);
            Parcelable m37282x = ActivityC1354d.this.f4043H.m37282x();
            if (m37282x != null) {
                bundle.putParcelable("android:support:fragments", m37282x);
            }
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: classes.dex */
    public class C1356b implements InterfaceC1960b {
        C1356b() {
        }

        @Override // p035c.InterfaceC1960b
        /* renamed from: a */
        public void mo35026a(Context context) {
            ActivityC1354d.this.f4043H.m37305a(null);
            Bundle m35796a = ActivityC1354d.this.mo35784i().m35796a("android:support:fragments");
            if (m35796a != null) {
                ActivityC1354d.this.f4043H.m37283w(m35796a.getParcelable("android:support:fragments"));
            }
        }
    }

    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: classes.dex */
    class C1357c extends AbstractC1368i<ActivityC1354d> implements InterfaceC1488t0, InterfaceC0294f, InterfaceC0305c, InterfaceC1376n {
        public C1357c() {
            super(ActivityC1354d.this);
        }

        @Override // androidx.fragment.app.InterfaceC1376n
        /* renamed from: a */
        public void mo37237a(FragmentManager fragmentManager, Fragment fragment) {
            ActivityC1354d.this.m37318U(fragment);
        }

        @Override // androidx.lifecycle.InterfaceC1491v
        /* renamed from: b */
        public AbstractC1469p mo137b() {
            return ActivityC1354d.this.f4044I;
        }

        @Override // androidx.fragment.app.AbstractC1368i, androidx.fragment.app.AbstractC1365f
        /* renamed from: d */
        public View mo37277d(int i) {
            return ActivityC1354d.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC1368i, androidx.fragment.app.AbstractC1365f
        /* renamed from: e */
        public boolean mo37276e() {
            Window window = ActivityC1354d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.InterfaceC0294f
        /* renamed from: h */
        public OnBackPressedDispatcher mo37313h() {
            return ActivityC1354d.this.mo37313h();
        }

        @Override // androidx.fragment.app.AbstractC1368i
        /* renamed from: k */
        public void mo37272k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC1354d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1368i
        /* renamed from: m */
        public LayoutInflater mo37270m() {
            return ActivityC1354d.this.getLayoutInflater().cloneInContext(ActivityC1354d.this);
        }

        @Override // androidx.fragment.app.AbstractC1368i
        /* renamed from: o */
        public boolean mo37268o(Fragment fragment) {
            return !ActivityC1354d.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC1368i
        /* renamed from: p */
        public boolean mo37267p(String str) {
            return C0883b.m39261s(ActivityC1354d.this, str);
        }

        @Override // androidx.fragment.app.AbstractC1368i
        /* renamed from: r */
        public void mo37265r() {
            ActivityC1354d.this.mo37315X();
        }

        @Override // androidx.fragment.app.AbstractC1368i
        /* renamed from: s */
        public ActivityC1354d mo37312s() {
            return ActivityC1354d.this;
        }

        @Override // androidx.activity.result.InterfaceC0305c
        /* renamed from: u */
        public ActivityResultRegistry mo37311u() {
            return ActivityC1354d.this.mo37311u();
        }

        @Override // androidx.lifecycle.InterfaceC1488t0
        /* renamed from: z */
        public C1486s0 mo36970z() {
            return ActivityC1354d.this.mo36970z();
        }
    }

    public ActivityC1354d() {
        m37321R();
    }

    /* renamed from: R */
    private void m37321R() {
        mo35784i().m35793d("android:support:fragments", new C1355a());
        m41371F(new C1356b());
    }

    /* renamed from: T */
    private static boolean m37319T(FragmentManager fragmentManager, AbstractC1469p.EnumC1472c enumC1472c) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.m37422u0()) {
            if (fragment != null) {
                if (fragment.m37635O() != null) {
                    z |= m37319T(fragment.m37657F(), enumC1472c);
                }
                C1403v c1403v = fragment.f3836o0;
                if (c1403v != null && c1403v.mo137b().mo10401b().isAtLeast(AbstractC1469p.EnumC1472c.STARTED)) {
                    fragment.f3836o0.m37124g(enumC1472c);
                    z = true;
                }
                if (fragment.f3835n0.mo10401b().isAtLeast(AbstractC1469p.EnumC1472c.STARTED)) {
                    fragment.f3835n0.m36953o(enumC1472c);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: O */
    final View m37324O(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4043H.m37284v(view, str, context, attributeSet);
    }

    /* renamed from: P */
    public FragmentManager m37323P() {
        return this.f4043H.m37286t();
    }

    @Deprecated
    /* renamed from: Q */
    public AbstractC1497a m37322Q() {
        return AbstractC1497a.m36943b(this);
    }

    /* renamed from: S */
    void m37320S() {
        do {
        } while (m37319T(m37323P(), AbstractC1469p.EnumC1472c.CREATED));
    }

    @Deprecated
    /* renamed from: U */
    public void m37318U(Fragment fragment) {
    }

    @Deprecated
    /* renamed from: V */
    protected boolean m37317V(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: W */
    protected void m37316W() {
        this.f4044I.m36960h(AbstractC1469p.EnumC1471b.ON_RESUME);
        this.f4043H.m37290p();
    }

    @Deprecated
    /* renamed from: X */
    public void mo37315X() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.C0883b.InterfaceC0889f
    @Deprecated
    /* renamed from: a */
    public final void mo37314a(int i) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f4041J);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4042K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4045L);
        if (getApplication() != null) {
            AbstractC1497a.m36943b(this).mo36942a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f4043H.m37286t().m37489X(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f4043H.m37285u();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f4043H.m37285u();
        super.onConfigurationChanged(configuration);
        this.f4043H.m37302d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0904g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4044I.m36960h(AbstractC1469p.EnumC1471b.ON_CREATE);
        this.f4043H.m37300f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.f4043H.m37299g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m37324O = m37324O(view, str, context, attributeSet);
        return m37324O == null ? super.onCreateView(view, str, context, attributeSet) : m37324O;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f4043H.m37298h();
        this.f4044I.m36960h(AbstractC1469p.EnumC1471b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f4043H.m37297i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.f4043H.m37301e(menuItem);
        }
        return this.f4043H.m37295k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f4043H.m37296j(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f4043H.m37285u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f4043H.m37294l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f4042K = false;
        this.f4043H.m37293m();
        this.f4044I.m36960h(AbstractC1469p.EnumC1471b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f4043H.m37292n(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m37316W();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return m37317V(view, menu) | this.f4043H.m37291o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f4043H.m37285u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.f4043H.m37285u();
        super.onResume();
        this.f4042K = true;
        this.f4043H.m37287s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.f4043H.m37285u();
        super.onStart();
        this.f4045L = false;
        if (!this.f4041J) {
            this.f4041J = true;
            this.f4043H.m37303c();
        }
        this.f4043H.m37287s();
        this.f4044I.m36960h(AbstractC1469p.EnumC1471b.ON_START);
        this.f4043H.m37289q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f4043H.m37285u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f4045L = true;
        m37320S();
        this.f4043H.m37288r();
        this.f4044I.m36960h(AbstractC1469p.EnumC1471b.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m37324O = m37324O(null, str, context, attributeSet);
        return m37324O == null ? super.onCreateView(str, context, attributeSet) : m37324O;
    }
}
