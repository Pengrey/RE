package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0303a;
import androidx.activity.result.InterfaceC0305c;
import androidx.core.app.ActivityC0904g;
import androidx.core.app.C0883b;
import androidx.core.app.C0890c;
import androidx.core.content.C0928a;
import androidx.core.view.C1173j;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1463m0;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.C1490u0;
import androidx.lifecycle.C1492v0;
import androidx.lifecycle.C1493x;
import androidx.lifecycle.FragmentC1454k0;
import androidx.lifecycle.InterfaceC1467o;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1488t0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.savedstate.C1662b;
import androidx.savedstate.C1664d;
import androidx.savedstate.InterfaceC1663c;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import p025b3.C1795a;
import p035c.C1959a;
import p035c.InterfaceC1960b;
import p050d.ActivityResultContract;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC0904g implements InterfaceC1488t0, InterfaceC1467o, InterfaceC1663c, InterfaceC0294f, InterfaceC0305c {

    /* renamed from: B */
    private C1486s0 f610B;

    /* renamed from: C */
    private C1479r0.InterfaceC1481b f611C;

    /* renamed from: E */
    private int f612E;

    /* renamed from: x */
    final C1959a f613x = new C1959a();

    /* renamed from: y */
    private final C1173j f614y = new C1173j(new Runnable() { // from class: androidx.activity.d
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.m41368I();
        }
    });

    /* renamed from: z */
    private final C1493x f615z = new C1493x(this);

    /* renamed from: A */
    final C1662b f616A = C1662b.m35788a(this);

    /* renamed from: D */
    private final OnBackPressedDispatcher f617D = new OnBackPressedDispatcher(new RunnableC0282a());

    /* renamed from: F */
    private final AtomicInteger f618F = new AtomicInteger();

    /* renamed from: G */
    private final ActivityResultRegistry f619G = new C0283b();

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    class RunnableC0282a implements Runnable {
        RunnableC0282a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    class C0283b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes.dex */
        class RunnableC0284a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ int f625w;

            /* renamed from: x */
            final /* synthetic */ ActivityResultContract.C4517a f626x;

            RunnableC0284a(int i, ActivityResultContract.C4517a c4517a) {
                this.f625w = i;
                this.f626x = c4517a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0283b.this.m41345c(this.f625w, this.f626x.m27321a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        class RunnableC0285b implements Runnable {

            /* renamed from: w */
            final /* synthetic */ int f628w;

            /* renamed from: x */
            final /* synthetic */ IntentSender.SendIntentException f629x;

            RunnableC0285b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f628w = i;
                this.f629x = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0283b.this.m41346b(this.f628w, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f629x));
            }
        }

        C0283b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo41342f(int i, ActivityResultContract<I, O> activityResultContract, I i2, C0890c c0890c) {
            ComponentActivity componentActivity = ComponentActivity.this;
            ActivityResultContract.C4517a<O> m27323b = activityResultContract.m27323b(componentActivity, i2);
            if (m27323b != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0284a(i, m27323b));
                return;
            }
            Intent mo37402d = activityResultContract.mo37402d(componentActivity, i2);
            Bundle bundle = null;
            if (mo37402d.getExtras() != null && mo37402d.getExtras().getClassLoader() == null) {
                mo37402d.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo37402d.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = mo37402d.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo37402d.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (c0890c != null) {
                bundle = c0890c.mo39250b();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo37402d.getAction())) {
                String[] stringArrayExtra = mo37402d.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C0883b.m39262r(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo37402d.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) mo37402d.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C0883b.m39259u(componentActivity, intentSenderRequest.m41330d(), i, intentSenderRequest.m41333a(), intentSenderRequest.m41332b(), intentSenderRequest.m41331c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0285b(i, e));
                }
            } else {
                C0883b.m39260t(componentActivity, mo37402d, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes.dex */
    static class C0286c {
        /* renamed from: a */
        static void m41362a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes.dex */
    public static final class C0287d {

        /* renamed from: a */
        Object f631a;

        /* renamed from: b */
        C1486s0 f632b;

        C0287d() {
        }
    }

    public ComponentActivity() {
        if (mo137b() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                mo137b().mo10402a(new InterfaceC1485s() { // from class: androidx.activity.ComponentActivity.3
                    @Override // androidx.lifecycle.InterfaceC1485s
                    /* renamed from: n */
                    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                        if (enumC1471b == AbstractC1469p.EnumC1471b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                C0286c.m41362a(peekDecorView);
                            }
                        }
                    }
                });
            }
            mo137b().mo10402a(new InterfaceC1485s() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.InterfaceC1485s
                /* renamed from: n */
                public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                    if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY) {
                        ComponentActivity.this.f613x.m35028b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.mo36970z().m36975a();
                    }
                }
            });
            mo137b().mo10402a(new InterfaceC1485s() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.InterfaceC1485s
                /* renamed from: n */
                public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                    ComponentActivity.this.m41370G();
                    ComponentActivity.this.mo137b().mo10400c(this);
                }
            });
            if (19 <= i && i <= 23) {
                mo137b().mo10402a(new ImmLeaksCleaner(this));
            }
            mo35784i().m35793d("android:support:activity-result", new SavedStateRegistry.InterfaceC1660b() { // from class: androidx.activity.b
                @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1660b
                /* renamed from: a */
                public final Bundle mo35789a() {
                    Bundle m41367J;
                    m41367J = ComponentActivity.this.m41367J();
                    return m41367J;
                }
            });
            m41371F(new InterfaceC1960b() { // from class: androidx.activity.c
                @Override // p035c.InterfaceC1960b
                /* renamed from: a */
                public final void mo35026a(Context context) {
                    ComponentActivity.this.m41366K(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: H */
    private void m41369H() {
        C1490u0.m36968b(getWindow().getDecorView(), this);
        C1492v0.m36966b(getWindow().getDecorView(), this);
        C1664d.m35782b(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ Bundle m41367J() {
        Bundle bundle = new Bundle();
        this.f619G.m41340h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m41366K(Context context) {
        Bundle m35796a = mo35784i().m35796a("android:support:activity-result");
        if (m35796a != null) {
            this.f619G.m41341g(m35796a);
        }
    }

    /* renamed from: F */
    public final void m41371F(InterfaceC1960b interfaceC1960b) {
        this.f613x.m35029a(interfaceC1960b);
    }

    /* renamed from: G */
    void m41370G() {
        if (this.f610B == null) {
            C0287d c0287d = (C0287d) getLastNonConfigurationInstance();
            if (c0287d != null) {
                this.f610B = c0287d.f632b;
            }
            if (this.f610B == null) {
                this.f610B = new C1486s0();
            }
        }
    }

    /* renamed from: I */
    public void m41368I() {
        invalidateOptionsMenu();
    }

    @Deprecated
    /* renamed from: L */
    public Object m41365L() {
        return null;
    }

    /* renamed from: M */
    public final <I, O> AbstractC0304b<I> m41364M(ActivityResultContract<I, O> activityResultContract, InterfaceC0303a<O> interfaceC0303a) {
        return m41363N(activityResultContract, this.f619G, interfaceC0303a);
    }

    /* renamed from: N */
    public final <I, O> AbstractC0304b<I> m41363N(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, InterfaceC0303a<O> interfaceC0303a) {
        return activityResultRegistry.m41339i("activity_rq#" + this.f618F.getAndIncrement(), this, activityResultContract, interfaceC0303a);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m41369H();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC1491v
    /* renamed from: b */
    public AbstractC1469p mo137b() {
        return this.f615z;
    }

    @Override // androidx.activity.InterfaceC0294f
    /* renamed from: h */
    public final OnBackPressedDispatcher mo37313h() {
        return this.f617D;
    }

    @Override // androidx.savedstate.InterfaceC1663c
    /* renamed from: i */
    public final SavedStateRegistry mo35784i() {
        return this.f616A.m35787b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f619G.m41346b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f617D.m41358c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0904g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f616A.m35786c(bundle);
        this.f613x.m35027c(this);
        super.onCreate(bundle);
        FragmentC1454k0.m37013g(this);
        int i = this.f612E;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f614y.m38145a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.f614y.m38144b(menuItem);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f619G.m41346b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0287d c0287d;
        Object m41365L = m41365L();
        C1486s0 c1486s0 = this.f610B;
        if (c1486s0 == null && (c0287d = (C0287d) getLastNonConfigurationInstance()) != null) {
            c1486s0 = c0287d.f632b;
        }
        if (c1486s0 == null && m41365L == null) {
            return null;
        }
        C0287d c0287d2 = new C0287d();
        c0287d2.f631a = m41365L;
        c0287d2.f632b = c1486s0;
        return c0287d2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0904g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1469p mo137b = mo137b();
        if (mo137b instanceof C1493x) {
            ((C1493x) mo137b).m36953o(AbstractC1469p.EnumC1472c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f616A.m35785d(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC1467o
    /* renamed from: p */
    public C1479r0.InterfaceC1481b mo36992p() {
        if (getApplication() != null) {
            if (this.f611C == null) {
                this.f611C = new C1463m0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.f611C;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C1795a.m35344d()) {
                C1795a.m35347a("reportFullyDrawn() for ComponentActivity");
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 19) {
                super.reportFullyDrawn();
            } else if (i == 19 && C0928a.m39116a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            C1795a.m35346b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m41369H();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // androidx.activity.result.InterfaceC0305c
    /* renamed from: u */
    public final ActivityResultRegistry mo37311u() {
        return this.f619G;
    }

    @Override // androidx.lifecycle.InterfaceC1488t0
    /* renamed from: z */
    public C1486s0 mo36970z() {
        if (getApplication() != null) {
            m41370G();
            return this.f610B;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m41369H();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m41369H();
        super.setContentView(view, layoutParams);
    }
}
