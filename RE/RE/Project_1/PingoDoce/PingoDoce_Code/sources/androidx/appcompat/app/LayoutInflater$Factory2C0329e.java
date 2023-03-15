package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0375c;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0484i;
import androidx.appcompat.widget.C0520s0;
import androidx.appcompat.widget.C0541y0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0464d0;
import androidx.appcompat.widget.InterfaceC0542z;
import androidx.constraintlayout.widget.C0868i;
import androidx.core.app.C0905h;
import androidx.core.content.C0928a;
import androidx.core.content.res.C0955h;
import androidx.core.util.C1070c;
import androidx.core.view.C1112b0;
import androidx.core.view.C1162g;
import androidx.core.view.C1165h;
import androidx.core.view.C1166h0;
import androidx.core.view.C1174j0;
import androidx.core.view.C1183m0;
import androidx.core.view.InterfaceC1211u;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1491v;
import java.lang.Thread;
import java.util.List;
import p070e.C4897a;
import p070e.C4899c;
import p070e.C4902f;
import p070e.C4903g;
import p070e.C4905i;
import p070e.C4906j;
import p091f.DialogC5147b;
import p091f.InterfaceC5146a;
import p111g.C5586a;
import p189k.AbstractC6541b;
import p189k.C6544d;
import p189k.C6546f;
import p189k.C6548g;
import p189k.Window$CallbackC6553i;
import p301q.C9558g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0329e extends AbstractC0328d implements C0378e.InterfaceC0379a, LayoutInflater.Factory2 {

    /* renamed from: A0 */
    private static final boolean f806A0;

    /* renamed from: B0 */
    private static final boolean f807B0;

    /* renamed from: C0 */
    private static boolean f808C0;

    /* renamed from: x0 */
    private static final C9558g<String, Integer> f809x0 = new C9558g<>();

    /* renamed from: y0 */
    private static final boolean f810y0;

    /* renamed from: z0 */
    private static final int[] f811z0;

    /* renamed from: A */
    final Context f812A;

    /* renamed from: B */
    Window f813B;

    /* renamed from: C */
    private C0345n f814C;

    /* renamed from: D */
    final InterfaceC5146a f815D;

    /* renamed from: E */
    AbstractC0319a f816E;

    /* renamed from: F */
    MenuInflater f817F;

    /* renamed from: G */
    private CharSequence f818G;

    /* renamed from: H */
    private InterfaceC0542z f819H;

    /* renamed from: I */
    private C0338h f820I;

    /* renamed from: J */
    private C0353u f821J;

    /* renamed from: K */
    AbstractC6541b f822K;

    /* renamed from: L */
    ActionBarContextView f823L;

    /* renamed from: M */
    PopupWindow f824M;

    /* renamed from: N */
    Runnable f825N;

    /* renamed from: O */
    C1166h0 f826O;

    /* renamed from: P */
    private boolean f827P;

    /* renamed from: Q */
    private boolean f828Q;

    /* renamed from: R */
    ViewGroup f829R;

    /* renamed from: S */
    private TextView f830S;

    /* renamed from: T */
    private View f831T;

    /* renamed from: U */
    private boolean f832U;

    /* renamed from: V */
    private boolean f833V;

    /* renamed from: W */
    boolean f834W;

    /* renamed from: X */
    boolean f835X;

    /* renamed from: Y */
    boolean f836Y;

    /* renamed from: Z */
    boolean f837Z;

    /* renamed from: a0 */
    boolean f838a0;

    /* renamed from: b0 */
    private boolean f839b0;

    /* renamed from: c0 */
    private C0352t[] f840c0;

    /* renamed from: d0 */
    private C0352t f841d0;

    /* renamed from: e0 */
    private boolean f842e0;

    /* renamed from: f0 */
    private boolean f843f0;

    /* renamed from: g0 */
    private boolean f844g0;

    /* renamed from: h0 */
    private boolean f845h0;

    /* renamed from: i0 */
    boolean f846i0;

    /* renamed from: j0 */
    private int f847j0;

    /* renamed from: k0 */
    private int f848k0;

    /* renamed from: l0 */
    private boolean f849l0;

    /* renamed from: m0 */
    private boolean f850m0;

    /* renamed from: n0 */
    private AbstractC0347p f851n0;

    /* renamed from: o0 */
    private AbstractC0347p f852o0;

    /* renamed from: p0 */
    boolean f853p0;

    /* renamed from: q0 */
    int f854q0;

    /* renamed from: r0 */
    private final Runnable f855r0;

    /* renamed from: s0 */
    private boolean f856s0;

    /* renamed from: t0 */
    private Rect f857t0;

    /* renamed from: u0 */
    private Rect f858u0;

    /* renamed from: v0 */
    private C0354f f859v0;

    /* renamed from: w0 */
    private C0356g f860w0;

    /* renamed from: z */
    final Object f861z;

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$a */
    /* loaded from: classes.dex */
    class C0330a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f862a;

        C0330a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f862a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m41159a(Throwable th2) {
            String message;
            if (!(th2 instanceof Resources.NotFoundException) || (message = th2.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            if (m41159a(th2)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th2.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th2.getCause());
                notFoundException.setStackTrace(th2.getStackTrace());
                this.f862a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f862a.uncaughtException(thread, th2);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$b */
    /* loaded from: classes.dex */
    class RunnableC0331b implements Runnable {
        RunnableC0331b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e = LayoutInflater$Factory2C0329e.this;
            if ((layoutInflater$Factory2C0329e.f854q0 & 1) != 0) {
                layoutInflater$Factory2C0329e.m41208U(0);
            }
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e2 = LayoutInflater$Factory2C0329e.this;
            if ((layoutInflater$Factory2C0329e2.f854q0 & 4096) != 0) {
                layoutInflater$Factory2C0329e2.m41208U(C0868i.f2773H0);
            }
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e3 = LayoutInflater$Factory2C0329e.this;
            layoutInflater$Factory2C0329e3.f853p0 = false;
            layoutInflater$Factory2C0329e3.f854q0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$c */
    /* loaded from: classes.dex */
    public class C0332c implements InterfaceC1211u {
        C0332c() {
        }

        @Override // androidx.core.view.InterfaceC1211u
        /* renamed from: a */
        public C1183m0 mo29259a(View view, C1183m0 c1183m0) {
            int m38103k = c1183m0.m38103k();
            int m41218L0 = LayoutInflater$Factory2C0329e.this.m41218L0(c1183m0, null);
            if (m38103k != m41218L0) {
                c1183m0 = c1183m0.m38099o(c1183m0.m38105i(), m41218L0, c1183m0.m38104j(), c1183m0.m38106h());
            }
            return C1112b0.m38433e0(view, c1183m0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$d */
    /* loaded from: classes.dex */
    public class C0333d implements InterfaceC0464d0.InterfaceC0465a {
        C0333d() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0464d0.InterfaceC0465a
        /* renamed from: a */
        public void mo40650a(Rect rect) {
            rect.top = LayoutInflater$Factory2C0329e.this.m41218L0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$e */
    /* loaded from: classes.dex */
    public class C0334e implements ContentFrameLayout.InterfaceC0424a {
        C0334e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0424a
        /* renamed from: a */
        public void mo40826a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0424a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C0329e.this.m41210S();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$f */
    /* loaded from: classes.dex */
    public class RunnableC0335f implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.e$f$a */
        /* loaded from: classes.dex */
        class C0336a extends C1174j0 {
            C0336a() {
            }

            @Override // androidx.core.view.InterfaceC1172i0
            /* renamed from: b */
            public void mo20606b(View view) {
                LayoutInflater$Factory2C0329e.this.f823L.setAlpha(1.0f);
                LayoutInflater$Factory2C0329e.this.f826O.m38164h(null);
                LayoutInflater$Factory2C0329e.this.f826O = null;
            }

            @Override // androidx.core.view.C1174j0, androidx.core.view.InterfaceC1172i0
            /* renamed from: c */
            public void mo20605c(View view) {
                LayoutInflater$Factory2C0329e.this.f823L.setVisibility(0);
            }
        }

        RunnableC0335f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e = LayoutInflater$Factory2C0329e.this;
            layoutInflater$Factory2C0329e.f824M.showAtLocation(layoutInflater$Factory2C0329e.f823L, 55, 0, 0);
            LayoutInflater$Factory2C0329e.this.m41207V();
            if (LayoutInflater$Factory2C0329e.this.m41234D0()) {
                LayoutInflater$Factory2C0329e.this.f823L.setAlpha(0.0f);
                LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e2 = LayoutInflater$Factory2C0329e.this;
                layoutInflater$Factory2C0329e2.f826O = C1112b0.m38434e(layoutInflater$Factory2C0329e2.f823L).m38170b(1.0f);
                LayoutInflater$Factory2C0329e.this.f826O.m38164h(new C0336a());
                return;
            }
            LayoutInflater$Factory2C0329e.this.f823L.setAlpha(1.0f);
            LayoutInflater$Factory2C0329e.this.f823L.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$g */
    /* loaded from: classes.dex */
    public class C0337g extends C1174j0 {
        C0337g() {
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: b */
        public void mo20606b(View view) {
            LayoutInflater$Factory2C0329e.this.f823L.setAlpha(1.0f);
            LayoutInflater$Factory2C0329e.this.f826O.m38164h(null);
            LayoutInflater$Factory2C0329e.this.f826O = null;
        }

        @Override // androidx.core.view.C1174j0, androidx.core.view.InterfaceC1172i0
        /* renamed from: c */
        public void mo20605c(View view) {
            LayoutInflater$Factory2C0329e.this.f823L.setVisibility(0);
            LayoutInflater$Factory2C0329e.this.f823L.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2C0329e.this.f823L.getParent() instanceof View) {
                C1112b0.m38411p0((View) LayoutInflater$Factory2C0329e.this.f823L.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$h */
    /* loaded from: classes.dex */
    public final class C0338h implements InterfaceC0387j.InterfaceC0388a {
        C0338h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
        /* renamed from: b */
        public void mo40856b(C0378e c0378e, boolean z) {
            LayoutInflater$Factory2C0329e.this.m41219L(c0378e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
        /* renamed from: c */
        public boolean mo40855c(C0378e c0378e) {
            Window.Callback m41195f0 = LayoutInflater$Factory2C0329e.this.m41195f0();
            if (m41195f0 != null) {
                m41195f0.onMenuOpened(C0868i.f2773H0, c0378e);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$i */
    /* loaded from: classes.dex */
    public class C0339i implements AbstractC6541b.InterfaceC6542a {

        /* renamed from: a */
        private AbstractC6541b.InterfaceC6542a f871a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.e$i$a */
        /* loaded from: classes.dex */
        class C0340a extends C1174j0 {
            C0340a() {
            }

            @Override // androidx.core.view.InterfaceC1172i0
            /* renamed from: b */
            public void mo20606b(View view) {
                LayoutInflater$Factory2C0329e.this.f823L.setVisibility(8);
                LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e = LayoutInflater$Factory2C0329e.this;
                PopupWindow popupWindow = layoutInflater$Factory2C0329e.f824M;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C0329e.f823L.getParent() instanceof View) {
                    C1112b0.m38411p0((View) LayoutInflater$Factory2C0329e.this.f823L.getParent());
                }
                LayoutInflater$Factory2C0329e.this.f823L.m40924k();
                LayoutInflater$Factory2C0329e.this.f826O.m38164h(null);
                LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e2 = LayoutInflater$Factory2C0329e.this;
                layoutInflater$Factory2C0329e2.f826O = null;
                C1112b0.m38411p0(layoutInflater$Factory2C0329e2.f829R);
            }
        }

        public C0339i(AbstractC6541b.InterfaceC6542a interfaceC6542a) {
            this.f871a = interfaceC6542a;
        }

        @Override // p189k.AbstractC6541b.InterfaceC6542a
        /* renamed from: a */
        public boolean mo20632a(AbstractC6541b abstractC6541b, MenuItem menuItem) {
            return this.f871a.mo20632a(abstractC6541b, menuItem);
        }

        @Override // p189k.AbstractC6541b.InterfaceC6542a
        /* renamed from: b */
        public boolean mo20631b(AbstractC6541b abstractC6541b, Menu menu) {
            return this.f871a.mo20631b(abstractC6541b, menu);
        }

        @Override // p189k.AbstractC6541b.InterfaceC6542a
        /* renamed from: c */
        public boolean mo20630c(AbstractC6541b abstractC6541b, Menu menu) {
            C1112b0.m38411p0(LayoutInflater$Factory2C0329e.this.f829R);
            return this.f871a.mo20630c(abstractC6541b, menu);
        }

        @Override // p189k.AbstractC6541b.InterfaceC6542a
        /* renamed from: d */
        public void mo20629d(AbstractC6541b abstractC6541b) {
            this.f871a.mo20629d(abstractC6541b);
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e = LayoutInflater$Factory2C0329e.this;
            if (layoutInflater$Factory2C0329e.f824M != null) {
                layoutInflater$Factory2C0329e.f813B.getDecorView().removeCallbacks(LayoutInflater$Factory2C0329e.this.f825N);
            }
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e2 = LayoutInflater$Factory2C0329e.this;
            if (layoutInflater$Factory2C0329e2.f823L != null) {
                layoutInflater$Factory2C0329e2.m41207V();
                LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e3 = LayoutInflater$Factory2C0329e.this;
                layoutInflater$Factory2C0329e3.f826O = C1112b0.m38434e(layoutInflater$Factory2C0329e3.f823L).m38170b(0.0f);
                LayoutInflater$Factory2C0329e.this.f826O.m38164h(new C0340a());
            }
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e4 = LayoutInflater$Factory2C0329e.this;
            InterfaceC5146a interfaceC5146a = layoutInflater$Factory2C0329e4.f815D;
            if (interfaceC5146a != null) {
                interfaceC5146a.mo25555d(layoutInflater$Factory2C0329e4.f822K);
            }
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e5 = LayoutInflater$Factory2C0329e.this;
            layoutInflater$Factory2C0329e5.f822K = null;
            C1112b0.m38411p0(layoutInflater$Factory2C0329e5.f829R);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$j */
    /* loaded from: classes.dex */
    public static class C0341j {
        /* renamed from: a */
        static Context m41158a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m41157b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$k */
    /* loaded from: classes.dex */
    static class C0342k {
        /* renamed from: a */
        static boolean m41156a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$l */
    /* loaded from: classes.dex */
    public static class C0343l {
        /* renamed from: a */
        static void m41155a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$m */
    /* loaded from: classes.dex */
    public static class C0344m {
        /* renamed from: a */
        static void m41154a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$o */
    /* loaded from: classes.dex */
    public class C0346o extends AbstractC0347p {

        /* renamed from: c */
        private final PowerManager f875c;

        C0346o(Context context) {
            super();
            this.f875c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0329e.AbstractC0347p
        /* renamed from: b */
        IntentFilter mo41150b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0329e.AbstractC0347p
        /* renamed from: c */
        public int mo41149c() {
            return (Build.VERSION.SDK_INT < 21 || !C0342k.m41156a(this.f875c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0329e.AbstractC0347p
        /* renamed from: d */
        public void mo41148d() {
            LayoutInflater$Factory2C0329e.this.m41231F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$p */
    /* loaded from: classes.dex */
    public abstract class AbstractC0347p {

        /* renamed from: a */
        private BroadcastReceiver f877a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.e$p$a */
        /* loaded from: classes.dex */
        public class C0348a extends BroadcastReceiver {
            C0348a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC0347p.this.mo41148d();
            }
        }

        AbstractC0347p() {
        }

        /* renamed from: a */
        void m41152a() {
            BroadcastReceiver broadcastReceiver = this.f877a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C0329e.this.f812A.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f877a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo41150b();

        /* renamed from: c */
        abstract int mo41149c();

        /* renamed from: d */
        abstract void mo41148d();

        /* renamed from: e */
        void m41151e() {
            m41152a();
            IntentFilter mo41150b = mo41150b();
            if (mo41150b == null || mo41150b.countActions() == 0) {
                return;
            }
            if (this.f877a == null) {
                this.f877a = new C0348a();
            }
            LayoutInflater$Factory2C0329e.this.f812A.registerReceiver(this.f877a, mo41150b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$q */
    /* loaded from: classes.dex */
    public class C0349q extends AbstractC0347p {

        /* renamed from: c */
        private final C0359j f880c;

        C0349q(C0359j c0359j) {
            super();
            this.f880c = c0359j;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0329e.AbstractC0347p
        /* renamed from: b */
        IntentFilter mo41150b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0329e.AbstractC0347p
        /* renamed from: c */
        public int mo41149c() {
            return this.f880c.m41110d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0329e.AbstractC0347p
        /* renamed from: d */
        public void mo41148d() {
            LayoutInflater$Factory2C0329e.this.m41231F();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$r */
    /* loaded from: classes.dex */
    private static class C0350r {
        /* renamed from: a */
        static void m41147a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$s */
    /* loaded from: classes.dex */
    public class C0351s extends ContentFrameLayout {
        public C0351s(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m41146c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0329e.this.m41209T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m41146c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflater$Factory2C0329e.this.m41215N(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C5586a.m23699b(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$t */
    /* loaded from: classes.dex */
    public static final class C0352t {

        /* renamed from: a */
        int f883a;

        /* renamed from: b */
        int f884b;

        /* renamed from: c */
        int f885c;

        /* renamed from: d */
        int f886d;

        /* renamed from: e */
        int f887e;

        /* renamed from: f */
        int f888f;

        /* renamed from: g */
        ViewGroup f889g;

        /* renamed from: h */
        View f890h;

        /* renamed from: i */
        View f891i;

        /* renamed from: j */
        C0378e f892j;

        /* renamed from: k */
        C0375c f893k;

        /* renamed from: l */
        Context f894l;

        /* renamed from: m */
        boolean f895m;

        /* renamed from: n */
        boolean f896n;

        /* renamed from: o */
        boolean f897o;

        /* renamed from: p */
        public boolean f898p;

        /* renamed from: q */
        boolean f899q = false;

        /* renamed from: r */
        boolean f900r;

        /* renamed from: s */
        Bundle f901s;

        C0352t(int i) {
            this.f883a = i;
        }

        /* renamed from: a */
        InterfaceC0389k m41145a(InterfaceC0387j.InterfaceC0388a interfaceC0388a) {
            if (this.f892j == null) {
                return null;
            }
            if (this.f893k == null) {
                C0375c c0375c = new C0375c(this.f894l, C4903g.abc_list_menu_item_layout);
                this.f893k = c0375c;
                c0375c.mo40949m(interfaceC0388a);
                this.f892j.m41025b(this.f893k);
            }
            return this.f893k.m41056c(this.f889g);
        }

        /* renamed from: b */
        public boolean m41144b() {
            if (this.f890h == null) {
                return false;
            }
            return this.f891i != null || this.f893k.m41057a().getCount() > 0;
        }

        /* renamed from: c */
        void m41143c(C0378e c0378e) {
            C0375c c0375c;
            C0378e c0378e2 = this.f892j;
            if (c0378e == c0378e2) {
                return;
            }
            if (c0378e2 != null) {
                c0378e2.m41035Q(this.f893k);
            }
            this.f892j = c0378e;
            if (c0378e == null || (c0375c = this.f893k) == null) {
                return;
            }
            c0378e.m41025b(c0375c);
        }

        /* renamed from: d */
        void m41142d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C4897a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C4897a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C4905i.Theme_AppCompat_CompactMenu, true);
            }
            C6544d c6544d = new C6544d(context, 0);
            c6544d.getTheme().setTo(newTheme);
            this.f894l = c6544d;
            TypedArray obtainStyledAttributes = c6544d.obtainStyledAttributes(C4906j.f13592u0);
            this.f884b = obtainStyledAttributes.getResourceId(C4906j.f13607x0, 0);
            this.f888f = obtainStyledAttributes.getResourceId(C4906j.f13602w0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$u */
    /* loaded from: classes.dex */
    public final class C0353u implements InterfaceC0387j.InterfaceC0388a {
        C0353u() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
        /* renamed from: b */
        public void mo40856b(C0378e c0378e, boolean z) {
            C0378e mo40940F = c0378e.mo40940F();
            boolean z2 = mo40940F != c0378e;
            LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e = LayoutInflater$Factory2C0329e.this;
            if (z2) {
                c0378e = mo40940F;
            }
            C0352t m41204Y = layoutInflater$Factory2C0329e.m41204Y(c0378e);
            if (m41204Y != null) {
                if (z2) {
                    LayoutInflater$Factory2C0329e.this.m41221K(m41204Y.f883a, m41204Y, mo40940F);
                    LayoutInflater$Factory2C0329e.this.m41214O(m41204Y, true);
                    return;
                }
                LayoutInflater$Factory2C0329e.this.m41214O(m41204Y, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
        /* renamed from: c */
        public boolean mo40855c(C0378e c0378e) {
            Window.Callback m41195f0;
            if (c0378e == c0378e.mo40940F()) {
                LayoutInflater$Factory2C0329e layoutInflater$Factory2C0329e = LayoutInflater$Factory2C0329e.this;
                if (!layoutInflater$Factory2C0329e.f834W || (m41195f0 = layoutInflater$Factory2C0329e.m41195f0()) == null || LayoutInflater$Factory2C0329e.this.f846i0) {
                    return true;
                }
                m41195f0.onMenuOpened(C0868i.f2773H0, c0378e);
                return true;
            }
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = i < 21;
        f810y0 = z;
        f811z0 = new int[]{16842836};
        f806A0 = !"robolectric".equals(Build.FINGERPRINT);
        f807B0 = i >= 17;
        if (!z || f808C0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0330a(Thread.getDefaultUncaughtExceptionHandler()));
        f808C0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0329e(Activity activity, InterfaceC5146a interfaceC5146a) {
        this(activity, null, interfaceC5146a, activity);
    }

    /* renamed from: A0 */
    private boolean m41240A0(C0352t c0352t, KeyEvent keyEvent) {
        InterfaceC0542z interfaceC0542z;
        InterfaceC0542z interfaceC0542z2;
        InterfaceC0542z interfaceC0542z3;
        if (this.f846i0) {
            return false;
        }
        if (c0352t.f895m) {
            return true;
        }
        C0352t c0352t2 = this.f841d0;
        if (c0352t2 != null && c0352t2 != c0352t) {
            m41214O(c0352t2, false);
        }
        Window.Callback m41195f0 = m41195f0();
        if (m41195f0 != null) {
            c0352t.f891i = m41195f0.onCreatePanelView(c0352t.f883a);
        }
        int i = c0352t.f883a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0542z3 = this.f819H) != null) {
            interfaceC0542z3.mo40326c();
        }
        if (c0352t.f891i == null) {
            if (z) {
                m41162y0();
            }
            C0378e c0378e = c0352t.f892j;
            if (c0378e == null || c0352t.f900r) {
                if (c0378e == null && (!m41190j0(c0352t) || c0352t.f892j == null)) {
                    return false;
                }
                if (z && this.f819H != null) {
                    if (this.f820I == null) {
                        this.f820I = new C0338h();
                    }
                    this.f819H.mo40328a(c0352t.f892j, this.f820I);
                }
                c0352t.f892j.m41014h0();
                if (!m41195f0.onCreatePanelMenu(c0352t.f883a, c0352t.f892j)) {
                    c0352t.m41143c(null);
                    if (z && (interfaceC0542z = this.f819H) != null) {
                        interfaceC0542z.mo40328a(null, this.f820I);
                    }
                    return false;
                }
                c0352t.f900r = false;
            }
            c0352t.f892j.m41014h0();
            Bundle bundle = c0352t.f901s;
            if (bundle != null) {
                c0352t.f892j.m41034R(bundle);
                c0352t.f901s = null;
            }
            if (!m41195f0.onPreparePanel(0, c0352t.f891i, c0352t.f892j)) {
                if (z && (interfaceC0542z2 = this.f819H) != null) {
                    interfaceC0542z2.mo40328a(null, this.f820I);
                }
                c0352t.f892j.m41015g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c0352t.f898p = z2;
            c0352t.f892j.setQwertyMode(z2);
            c0352t.f892j.m41015g0();
        }
        c0352t.f895m = true;
        c0352t.f896n = false;
        this.f841d0 = c0352t;
        return true;
    }

    /* renamed from: B0 */
    private void m41238B0(boolean z) {
        InterfaceC0542z interfaceC0542z = this.f819H;
        if (interfaceC0542z != null && interfaceC0542z.mo40322g() && (!ViewConfiguration.get(this.f812A).hasPermanentMenuKey() || this.f819H.mo40325d())) {
            Window.Callback m41195f0 = m41195f0();
            if (this.f819H.mo40327b() && z) {
                this.f819H.mo40324e();
                if (this.f846i0) {
                    return;
                }
                m41195f0.onPanelClosed(C0868i.f2773H0, m41198d0(0, true).f892j);
                return;
            } else if (m41195f0 == null || this.f846i0) {
                return;
            } else {
                if (this.f853p0 && (this.f854q0 & 1) != 0) {
                    this.f813B.getDecorView().removeCallbacks(this.f855r0);
                    this.f855r0.run();
                }
                C0352t m41198d0 = m41198d0(0, true);
                C0378e c0378e = m41198d0.f892j;
                if (c0378e == null || m41198d0.f900r || !m41195f0.onPreparePanel(0, m41198d0.f891i, c0378e)) {
                    return;
                }
                m41195f0.onMenuOpened(C0868i.f2773H0, m41198d0.f892j);
                this.f819H.mo40323f();
                return;
            }
        }
        C0352t m41198d02 = m41198d0(0, true);
        m41198d02.f899q = true;
        m41214O(m41198d02, false);
        m41163x0(m41198d02, null);
    }

    /* renamed from: C0 */
    private int m41236C0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C0868i.f2773H0;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return C0868i.f2778I0;
        } else {
            return i;
        }
    }

    /* renamed from: E0 */
    private boolean m41232E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f813B.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C1112b0.m38447V((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: G */
    private boolean m41229G(boolean z) {
        if (this.f846i0) {
            return false;
        }
        int m41223J = m41223J();
        boolean m41222J0 = m41222J0(m41182n0(this.f812A, m41223J), z);
        if (m41223J == 0) {
            m41200c0(this.f812A).m41151e();
        } else {
            AbstractC0347p abstractC0347p = this.f851n0;
            if (abstractC0347p != null) {
                abstractC0347p.m41152a();
            }
        }
        if (m41223J == 3) {
            m41201b0(this.f812A).m41151e();
        } else {
            AbstractC0347p abstractC0347p2 = this.f852o0;
            if (abstractC0347p2 != null) {
                abstractC0347p2.m41152a();
            }
        }
        return m41222J0;
    }

    /* renamed from: H */
    private void m41227H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f829R.findViewById(16908290);
        View decorView = this.f813B.getDecorView();
        contentFrameLayout.m40827b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f812A.obtainStyledAttributes(C4906j.f13592u0);
        obtainStyledAttributes.getValue(C4906j.f13410G0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C4906j.f13415H0, contentFrameLayout.getMinWidthMinor());
        int i = C4906j.f13400E0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C4906j.f13405F0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C4906j.f13390C0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C4906j.f13395D0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: H0 */
    private void m41226H0() {
        if (this.f828Q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    private void m41225I(Window window) {
        if (this.f813B == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0345n)) {
                C0345n c0345n = new C0345n(callback);
                this.f814C = c0345n;
                window.setCallback(c0345n);
                C0520s0 m40454u = C0520s0.m40454u(this.f812A, null, f811z0);
                Drawable m40467h = m40454u.m40467h(0);
                if (m40467h != null) {
                    window.setBackgroundDrawable(m40467h);
                }
                m40454u.m40452w();
                this.f813B = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: I0 */
    private ActivityC0325c m41224I0() {
        for (Context context = this.f812A; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC0325c) {
                return (ActivityC0325c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: J */
    private int m41223J() {
        int i = this.f847j0;
        return i != -100 ? i : AbstractC0328d.m41244j();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m41222J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f812A
            r1 = 0
            android.content.res.Configuration r0 = r6.m41213P(r0, r7, r1)
            boolean r2 = r6.m41186l0()
            android.content.Context r3 = r6.f812A
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.f843f0
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.LayoutInflater$Factory2C0329e.f806A0
            if (r8 != 0) goto L30
            boolean r8 = r6.f844g0
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f861z
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f861z
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C0883b.m39263q(r8)
            r8 = r4
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.m41220K0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f861z
            boolean r0 = r8 instanceof androidx.appcompat.app.ActivityC0325c
            if (r0 == 0) goto L5e
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.ActivityC0325c) r8
            r8.m41255c0(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0329e.m41222J0(int, boolean):boolean");
    }

    /* renamed from: K0 */
    private void m41220K0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f812A.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            C0357h.m41120a(resources);
        }
        int i3 = this.f848k0;
        if (i3 != 0) {
            this.f812A.setTheme(i3);
            if (i2 >= 23) {
                this.f812A.getTheme().applyStyle(this.f848k0, true);
            }
        }
        if (z) {
            Object obj = this.f861z;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC1491v) {
                    if (((InterfaceC1491v) activity).mo137b().mo10401b().isAtLeast(AbstractC1469p.EnumC1472c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f845h0) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: M */
    private void m41217M() {
        AbstractC0347p abstractC0347p = this.f851n0;
        if (abstractC0347p != null) {
            abstractC0347p.m41152a();
        }
        AbstractC0347p abstractC0347p2 = this.f852o0;
        if (abstractC0347p2 != null) {
            abstractC0347p2.m41152a();
        }
    }

    /* renamed from: M0 */
    private void m41216M0(View view) {
        int m39113d;
        if ((C1112b0.m38454P(view) & 8192) != 0) {
            m39113d = C0928a.m39113d(this.f812A, C4899c.abc_decor_view_status_guard_light);
        } else {
            m39113d = C0928a.m39113d(this.f812A, C4899c.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(m39113d);
    }

    /* renamed from: P */
    private Configuration m41213P(Context context, int i, Configuration configuration) {
        int i2;
        if (i != 1) {
            i2 = i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: Q */
    private ViewGroup m41212Q() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f812A.obtainStyledAttributes(C4906j.f13592u0);
        int i = C4906j.f13617z0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C4906j.f13420I0, false)) {
                mo41161z(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo41161z(C0868i.f2773H0);
            }
            if (obtainStyledAttributes.getBoolean(C4906j.f13380A0, false)) {
                mo41161z(C0868i.f2778I0);
            }
            if (obtainStyledAttributes.getBoolean(C4906j.f13385B0, false)) {
                mo41161z(10);
            }
            this.f837Z = obtainStyledAttributes.getBoolean(C4906j.f13597v0, false);
            obtainStyledAttributes.recycle();
            m41205X();
            this.f813B.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f812A);
            if (!this.f838a0) {
                if (this.f837Z) {
                    viewGroup = (ViewGroup) from.inflate(C4903g.abc_dialog_title_material, (ViewGroup) null);
                    this.f835X = false;
                    this.f834W = false;
                } else if (this.f834W) {
                    TypedValue typedValue = new TypedValue();
                    this.f812A.getTheme().resolveAttribute(C4897a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C6544d(this.f812A, typedValue.resourceId);
                    } else {
                        context = this.f812A;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C4903g.abc_screen_toolbar, (ViewGroup) null);
                    InterfaceC0542z interfaceC0542z = (InterfaceC0542z) viewGroup.findViewById(C4902f.decor_content_parent);
                    this.f819H = interfaceC0542z;
                    interfaceC0542z.setWindowCallback(m41195f0());
                    if (this.f835X) {
                        this.f819H.mo40321k(C0868i.f2778I0);
                    }
                    if (this.f832U) {
                        this.f819H.mo40321k(2);
                    }
                    if (this.f833V) {
                        this.f819H.mo40321k(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f836Y ? (ViewGroup) from.inflate(C4903g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C4903g.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C1112b0.m38475E0(viewGroup, new C0332c());
                } else if (viewGroup instanceof InterfaceC0464d0) {
                    ((InterfaceC0464d0) viewGroup).setOnFitSystemWindowsListener(new C0333d());
                }
                if (this.f819H == null) {
                    this.f830S = (TextView) viewGroup.findViewById(C4902f.f13378M);
                }
                C0541y0.m40329c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C4902f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f813B.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f813B.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0334e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f834W + ", windowActionBarOverlay: " + this.f835X + ", android:windowIsFloating: " + this.f837Z + ", windowActionModeOverlay: " + this.f836Y + ", windowNoTitle: " + this.f838a0 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: W */
    private void m41206W() {
        if (this.f828Q) {
            return;
        }
        this.f829R = m41212Q();
        CharSequence m41197e0 = m41197e0();
        if (!TextUtils.isEmpty(m41197e0)) {
            InterfaceC0542z interfaceC0542z = this.f819H;
            if (interfaceC0542z != null) {
                interfaceC0542z.setWindowTitle(m41197e0);
            } else if (m41162y0() != null) {
                m41162y0().mo41086t(m41197e0);
            } else {
                TextView textView = this.f830S;
                if (textView != null) {
                    textView.setText(m41197e0);
                }
            }
        }
        m41227H();
        m41164w0(this.f829R);
        this.f828Q = true;
        C0352t m41198d0 = m41198d0(0, false);
        if (this.f846i0) {
            return;
        }
        if (m41198d0 == null || m41198d0.f892j == null) {
            m41188k0(C0868i.f2773H0);
        }
    }

    /* renamed from: X */
    private void m41205X() {
        if (this.f813B == null) {
            Object obj = this.f861z;
            if (obj instanceof Activity) {
                m41225I(((Activity) obj).getWindow());
            }
        }
        if (this.f813B == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Z */
    private static Configuration m41203Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0343l.m41155a(configuration, configuration2, configuration3);
            } else if (!C1070c.m38634a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0344m.m41154a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (i5 >= 17) {
                C0341j.m41157b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: b0 */
    private AbstractC0347p m41201b0(Context context) {
        if (this.f852o0 == null) {
            this.f852o0 = new C0346o(context);
        }
        return this.f852o0;
    }

    /* renamed from: c0 */
    private AbstractC0347p m41200c0(Context context) {
        if (this.f851n0 == null) {
            this.f851n0 = new C0349q(C0359j.m41113a(context));
        }
        return this.f851n0;
    }

    /* renamed from: g0 */
    private void m41194g0() {
        m41206W();
        if (this.f834W && this.f816E == null) {
            Object obj = this.f861z;
            if (obj instanceof Activity) {
                this.f816E = new C0361k((Activity) this.f861z, this.f835X);
            } else if (obj instanceof Dialog) {
                this.f816E = new C0361k((Dialog) this.f861z);
            }
            AbstractC0319a abstractC0319a = this.f816E;
            if (abstractC0319a != null) {
                abstractC0319a.mo41088r(this.f856s0);
            }
        }
    }

    /* renamed from: h0 */
    private boolean m41193h0(C0352t c0352t) {
        View view = c0352t.f891i;
        if (view != null) {
            c0352t.f890h = view;
            return true;
        } else if (c0352t.f892j == null) {
            return false;
        } else {
            if (this.f821J == null) {
                this.f821J = new C0353u();
            }
            View view2 = (View) c0352t.m41145a(this.f821J);
            c0352t.f890h = view2;
            return view2 != null;
        }
    }

    /* renamed from: i0 */
    private boolean m41191i0(C0352t c0352t) {
        c0352t.m41142d(m41202a0());
        c0352t.f889g = new C0351s(c0352t.f894l);
        c0352t.f885c = 81;
        return true;
    }

    /* renamed from: j0 */
    private boolean m41190j0(C0352t c0352t) {
        Context context = this.f812A;
        int i = c0352t.f883a;
        if ((i == 0 || i == 108) && this.f819H != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C4897a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C4897a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C4897a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C6544d c6544d = new C6544d(context, 0);
                c6544d.getTheme().setTo(theme2);
                context = c6544d;
            }
        }
        C0378e c0378e = new C0378e(context);
        c0378e.mo40936V(this);
        c0352t.m41143c(c0378e);
        return true;
    }

    /* renamed from: k0 */
    private void m41188k0(int i) {
        this.f854q0 = (1 << i) | this.f854q0;
        if (this.f853p0) {
            return;
        }
        C1112b0.m38421k0(this.f813B.getDecorView(), this.f855r0);
        this.f853p0 = true;
    }

    /* renamed from: l0 */
    private boolean m41186l0() {
        if (!this.f850m0 && (this.f861z instanceof Activity)) {
            PackageManager packageManager = this.f812A.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f812A, this.f861z.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f849l0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f849l0 = false;
            }
        }
        this.f850m0 = true;
        return this.f849l0;
    }

    /* renamed from: q0 */
    private boolean m41176q0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0352t m41198d0 = m41198d0(i, true);
            if (m41198d0.f897o) {
                return false;
            }
            return m41240A0(m41198d0, keyEvent);
        }
        return false;
    }

    /* renamed from: t0 */
    private boolean m41170t0(int i, KeyEvent keyEvent) {
        boolean z;
        InterfaceC0542z interfaceC0542z;
        if (this.f822K != null) {
            return false;
        }
        boolean z2 = true;
        C0352t m41198d0 = m41198d0(i, true);
        if (i == 0 && (interfaceC0542z = this.f819H) != null && interfaceC0542z.mo40322g() && !ViewConfiguration.get(this.f812A).hasPermanentMenuKey()) {
            if (!this.f819H.mo40327b()) {
                if (!this.f846i0 && m41240A0(m41198d0, keyEvent)) {
                    z2 = this.f819H.mo40323f();
                }
                z2 = false;
            } else {
                z2 = this.f819H.mo40324e();
            }
        } else {
            boolean z3 = m41198d0.f897o;
            if (!z3 && !m41198d0.f896n) {
                if (m41198d0.f895m) {
                    if (m41198d0.f900r) {
                        m41198d0.f895m = false;
                        z = m41240A0(m41198d0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m41163x0(m41198d0, keyEvent);
                    }
                }
                z2 = false;
            } else {
                m41214O(m41198d0, true);
                z2 = z3;
            }
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f812A.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* renamed from: x0 */
    private void m41163x0(C0352t c0352t, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0352t.f897o || this.f846i0) {
            return;
        }
        if (c0352t.f883a == 0) {
            if ((this.f812A.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m41195f0 = m41195f0();
        if (m41195f0 != null && !m41195f0.onMenuOpened(c0352t.f883a, c0352t.f892j)) {
            m41214O(c0352t, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f812A.getSystemService("window");
        if (windowManager != null && m41240A0(c0352t, keyEvent)) {
            ViewGroup viewGroup = c0352t.f889g;
            if (viewGroup != null && !c0352t.f899q) {
                View view = c0352t.f891i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    c0352t.f896n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, c0352t.f886d, c0352t.f887e, 1002, 8519680, -3);
                    layoutParams2.gravity = c0352t.f885c;
                    layoutParams2.windowAnimations = c0352t.f888f;
                    windowManager.addView(c0352t.f889g, layoutParams2);
                    c0352t.f897o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!m41191i0(c0352t) || c0352t.f889g == null) {
                        return;
                    }
                } else if (c0352t.f899q && viewGroup.getChildCount() > 0) {
                    c0352t.f889g.removeAllViews();
                }
                if (m41193h0(c0352t) && c0352t.m41144b()) {
                    ViewGroup.LayoutParams layoutParams3 = c0352t.f890h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    c0352t.f889g.setBackgroundResource(c0352t.f884b);
                    ViewParent parent = c0352t.f890h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(c0352t.f890h);
                    }
                    c0352t.f889g.addView(c0352t.f890h, layoutParams3);
                    if (!c0352t.f890h.hasFocus()) {
                        c0352t.f890h.requestFocus();
                    }
                } else {
                    c0352t.f899q = true;
                    return;
                }
            }
            i = -2;
            c0352t.f896n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, c0352t.f886d, c0352t.f887e, 1002, 8519680, -3);
            layoutParams22.gravity = c0352t.f885c;
            layoutParams22.windowAnimations = c0352t.f888f;
            windowManager.addView(c0352t.f889g, layoutParams22);
            c0352t.f897o = true;
        }
    }

    /* renamed from: z0 */
    private boolean m41160z0(C0352t c0352t, int i, KeyEvent keyEvent, int i2) {
        C0378e c0378e;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0352t.f895m || m41240A0(c0352t, keyEvent)) && (c0378e = c0352t.f892j) != null) {
            z = c0378e.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f819H == null) {
            m41214O(c0352t, true);
        }
        return z;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: A */
    public void mo41241A(int i) {
        m41206W();
        ViewGroup viewGroup = (ViewGroup) this.f829R.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f812A).inflate(i, viewGroup);
        this.f814C.m20603a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: B */
    public void mo41239B(View view) {
        m41206W();
        ViewGroup viewGroup = (ViewGroup) this.f829R.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f814C.m20603a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: C */
    public void mo41237C(View view, ViewGroup.LayoutParams layoutParams) {
        m41206W();
        ViewGroup viewGroup = (ViewGroup) this.f829R.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f814C.m20603a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: D */
    public void mo41235D(int i) {
        this.f848k0 = i;
    }

    /* renamed from: D0 */
    final boolean m41234D0() {
        ViewGroup viewGroup;
        return this.f828Q && (viewGroup = this.f829R) != null && C1112b0.m38446W(viewGroup);
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: E */
    public final void mo41233E(CharSequence charSequence) {
        this.f818G = charSequence;
        InterfaceC0542z interfaceC0542z = this.f819H;
        if (interfaceC0542z != null) {
            interfaceC0542z.setWindowTitle(charSequence);
        } else if (m41162y0() != null) {
            m41162y0().mo41086t(charSequence);
        } else {
            TextView textView = this.f830S;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: F */
    public boolean m41231F() {
        return m41229G(true);
    }

    /* renamed from: F0 */
    public AbstractC6541b m41230F0(AbstractC6541b.InterfaceC6542a interfaceC6542a) {
        InterfaceC5146a interfaceC5146a;
        if (interfaceC6542a != null) {
            AbstractC6541b abstractC6541b = this.f822K;
            if (abstractC6541b != null) {
                abstractC6541b.mo20646c();
            }
            C0339i c0339i = new C0339i(interfaceC6542a);
            AbstractC0319a mo41185m = mo41185m();
            if (mo41185m != null) {
                AbstractC6541b mo41085u = mo41185m.mo41085u(c0339i);
                this.f822K = mo41085u;
                if (mo41085u != null && (interfaceC5146a = this.f815D) != null) {
                    interfaceC5146a.mo25552y(mo41085u);
                }
            }
            if (this.f822K == null) {
                this.f822K = m41228G0(c0339i);
            }
            return this.f822K;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p189k.AbstractC6541b m41228G0(p189k.AbstractC6541b.InterfaceC6542a r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0329e.m41228G0(k.b$a):k.b");
    }

    /* renamed from: K */
    void m41221K(int i, C0352t c0352t, Menu menu) {
        if (menu == null) {
            if (c0352t == null && i >= 0) {
                C0352t[] c0352tArr = this.f840c0;
                if (i < c0352tArr.length) {
                    c0352t = c0352tArr[i];
                }
            }
            if (c0352t != null) {
                menu = c0352t.f892j;
            }
        }
        if ((c0352t == null || c0352t.f897o) && !this.f846i0) {
            this.f814C.m20603a().onPanelClosed(i, menu);
        }
    }

    /* renamed from: L */
    void m41219L(C0378e c0378e) {
        if (this.f839b0) {
            return;
        }
        this.f839b0 = true;
        this.f819H.mo40320l();
        Window.Callback m41195f0 = m41195f0();
        if (m41195f0 != null && !this.f846i0) {
            m41195f0.onPanelClosed(C0868i.f2773H0, c0378e);
        }
        this.f839b0 = false;
    }

    /* renamed from: L0 */
    final int m41218L0(C1183m0 c1183m0, Rect rect) {
        int i;
        boolean z;
        boolean z2;
        if (c1183m0 != null) {
            i = c1183m0.m38103k();
        } else {
            i = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f823L;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f823L.getLayoutParams();
            if (this.f823L.isShown()) {
                if (this.f857t0 == null) {
                    this.f857t0 = new Rect();
                    this.f858u0 = new Rect();
                }
                Rect rect2 = this.f857t0;
                Rect rect3 = this.f858u0;
                if (c1183m0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c1183m0.m38105i(), c1183m0.m38103k(), c1183m0.m38104j(), c1183m0.m38106h());
                }
                C0541y0.m40331a(this.f829R, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                C1183m0 m38462L = C1112b0.m38462L(this.f829R);
                int m38105i = m38462L == null ? 0 : m38462L.m38105i();
                int m38104j = m38462L == null ? 0 : m38462L.m38104j();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && this.f831T == null) {
                    View view = new View(this.f812A);
                    this.f831T = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m38105i;
                    layoutParams.rightMargin = m38104j;
                    this.f829R.addView(this.f831T, -1, layoutParams);
                } else {
                    View view2 = this.f831T;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != m38105i || marginLayoutParams2.rightMargin != m38104j) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = m38105i;
                            marginLayoutParams2.rightMargin = m38104j;
                            this.f831T.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f831T;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    m41216M0(this.f831T);
                }
                if (!this.f836Y && r5) {
                    i = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.f823L.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f831T;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    /* renamed from: N */
    void m41215N(int i) {
        m41214O(m41198d0(i, true), true);
    }

    /* renamed from: O */
    void m41214O(C0352t c0352t, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0542z interfaceC0542z;
        if (z && c0352t.f883a == 0 && (interfaceC0542z = this.f819H) != null && interfaceC0542z.mo40327b()) {
            m41219L(c0352t.f892j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f812A.getSystemService("window");
        if (windowManager != null && c0352t.f897o && (viewGroup = c0352t.f889g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m41221K(c0352t.f883a, c0352t, null);
            }
        }
        c0352t.f895m = false;
        c0352t.f896n = false;
        c0352t.f897o = false;
        c0352t.f890h = null;
        c0352t.f899q = true;
        if (this.f841d0 == c0352t) {
            this.f841d0 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L26;
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m41211R(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.f r0 = r11.f859v0
            r1 = 0
            if (r0 != 0) goto L55
            android.content.Context r0 = r11.f812A
            int[] r2 = p070e.C4906j.f13592u0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p070e.C4906j.f13612y0
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1d
            androidx.appcompat.app.f r0 = new androidx.appcompat.app.f
            r0.<init>()
            r11.f859v0 = r0
            goto L55
        L1d:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.f r2 = (androidx.appcompat.app.C0354f) r2     // Catch: java.lang.Throwable -> L32
            r11.f859v0 = r2     // Catch: java.lang.Throwable -> L32
            goto L55
        L32:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.f r0 = new androidx.appcompat.app.f
            r0.<init>()
            r11.f859v0 = r0
        L55:
            boolean r8 = androidx.appcompat.app.LayoutInflater$Factory2C0329e.f810y0
            r0 = 1
            if (r8 == 0) goto L85
            androidx.appcompat.app.g r2 = r11.f860w0
            if (r2 != 0) goto L65
            androidx.appcompat.app.g r2 = new androidx.appcompat.app.g
            r2.<init>()
            r11.f860w0 = r2
        L65:
            androidx.appcompat.app.g r2 = r11.f860w0
            boolean r2 = r2.m41124a(r15)
            if (r2 == 0) goto L6f
            r7 = r0
            goto L86
        L6f:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L7d
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L85
            goto L84
        L7d:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.m41232E0(r0)
        L84:
            r1 = r0
        L85:
            r7 = r1
        L86:
            androidx.appcompat.app.f r2 = r11.f859v0
            r9 = 1
            boolean r10 = androidx.appcompat.widget.C0539x0.m40332c()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.m41130q(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0329e.m41211R(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: S */
    void m41210S() {
        C0378e c0378e;
        InterfaceC0542z interfaceC0542z = this.f819H;
        if (interfaceC0542z != null) {
            interfaceC0542z.mo40320l();
        }
        if (this.f824M != null) {
            this.f813B.getDecorView().removeCallbacks(this.f825N);
            if (this.f824M.isShowing()) {
                try {
                    this.f824M.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f824M = null;
        }
        m41207V();
        C0352t m41198d0 = m41198d0(0, false);
        if (m41198d0 == null || (c0378e = m41198d0.f892j) == null) {
            return;
        }
        c0378e.close();
    }

    /* renamed from: T */
    boolean m41209T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f861z;
        if (((obj instanceof C1162g.InterfaceC1163a) || (obj instanceof DialogC5147b)) && (decorView = this.f813B.getDecorView()) != null && C1162g.m38176d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f814C.m20603a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m41178p0(keyCode, keyEvent) : m41172s0(keyCode, keyEvent);
    }

    /* renamed from: U */
    void m41208U(int i) {
        C0352t m41198d0;
        C0352t m41198d02 = m41198d0(i, true);
        if (m41198d02.f892j != null) {
            Bundle bundle = new Bundle();
            m41198d02.f892j.m41032T(bundle);
            if (bundle.size() > 0) {
                m41198d02.f901s = bundle;
            }
            m41198d02.f892j.m41014h0();
            m41198d02.f892j.clear();
        }
        m41198d02.f900r = true;
        m41198d02.f899q = true;
        if ((i != 108 && i != 0) || this.f819H == null || (m41198d0 = m41198d0(0, false)) == null) {
            return;
        }
        m41198d0.f895m = false;
        m41240A0(m41198d0, null);
    }

    /* renamed from: V */
    void m41207V() {
        C1166h0 c1166h0 = this.f826O;
        if (c1166h0 != null) {
            c1166h0.m38169c();
        }
    }

    /* renamed from: Y */
    C0352t m41204Y(Menu menu) {
        C0352t[] c0352tArr = this.f840c0;
        int length = c0352tArr != null ? c0352tArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0352t c0352t = c0352tArr[i];
            if (c0352t != null && c0352t.f892j == menu) {
                return c0352t;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
    /* renamed from: a */
    public boolean mo20648a(C0378e c0378e, MenuItem menuItem) {
        C0352t m41204Y;
        Window.Callback m41195f0 = m41195f0();
        if (m41195f0 == null || this.f846i0 || (m41204Y = m41204Y(c0378e.mo40940F())) == null) {
            return false;
        }
        return m41195f0.onMenuItemSelected(m41204Y.f883a, menuItem);
    }

    /* renamed from: a0 */
    final Context m41202a0() {
        AbstractC0319a mo41185m = mo41185m();
        Context mo41091k = mo41185m != null ? mo41185m.mo41091k() : null;
        return mo41091k == null ? this.f812A : mo41091k;
    }

    @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
    /* renamed from: b */
    public void mo20647b(C0378e c0378e) {
        m41238B0(true);
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: d */
    public void mo41199d(View view, ViewGroup.LayoutParams layoutParams) {
        m41206W();
        ((ViewGroup) this.f829R.findViewById(16908290)).addView(view, layoutParams);
        this.f814C.m20603a().onContentChanged();
    }

    /* renamed from: d0 */
    protected C0352t m41198d0(int i, boolean z) {
        C0352t[] c0352tArr = this.f840c0;
        if (c0352tArr == null || c0352tArr.length <= i) {
            C0352t[] c0352tArr2 = new C0352t[i + 1];
            if (c0352tArr != null) {
                System.arraycopy(c0352tArr, 0, c0352tArr2, 0, c0352tArr.length);
            }
            this.f840c0 = c0352tArr2;
            c0352tArr = c0352tArr2;
        }
        C0352t c0352t = c0352tArr[i];
        if (c0352t == null) {
            C0352t c0352t2 = new C0352t(i);
            c0352tArr[i] = c0352t2;
            return c0352t2;
        }
        return c0352t;
    }

    /* renamed from: e0 */
    final CharSequence m41197e0() {
        Object obj = this.f861z;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f818G;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: f */
    public Context mo41196f(Context context) {
        this.f843f0 = true;
        int m41182n0 = m41182n0(context, m41223J());
        Configuration configuration = null;
        if (f807B0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0350r.m41147a((ContextThemeWrapper) context, m41213P(context, m41182n0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C6544d) {
            try {
                ((C6544d) context).m20653a(m41213P(context, m41182n0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f806A0) {
            return super.mo41196f(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = C0341j.m41158a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = m41203Z(configuration3, configuration4);
            }
        }
        Configuration m41213P = m41213P(context, m41182n0, configuration);
        C6544d c6544d = new C6544d(context, C4905i.Theme_AppCompat_Empty);
        c6544d.m20653a(m41213P);
        boolean z = false;
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            C0955h.C0962g.m38974a(c6544d.getTheme());
        }
        return super.mo41196f(c6544d);
    }

    /* renamed from: f0 */
    final Window.Callback m41195f0() {
        return this.f813B.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: i */
    public <T extends View> T mo41192i(int i) {
        m41206W();
        return (T) this.f813B.findViewById(i);
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: k */
    public int mo41189k() {
        return this.f847j0;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: l */
    public MenuInflater mo41187l() {
        if (this.f817F == null) {
            m41194g0();
            AbstractC0319a abstractC0319a = this.f816E;
            this.f817F = new C6548g(abstractC0319a != null ? abstractC0319a.mo41091k() : this.f812A);
        }
        return this.f817F;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: m */
    public AbstractC0319a mo41185m() {
        m41194g0();
        return this.f816E;
    }

    /* renamed from: m0 */
    public boolean m41184m0() {
        return this.f827P;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: n */
    public void mo41183n() {
        LayoutInflater from = LayoutInflater.from(this.f812A);
        if (from.getFactory() == null) {
            C1165h.m38172b(from, this);
        } else if (from.getFactory2() instanceof LayoutInflater$Factory2C0329e) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: n0 */
    int m41182n0(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return m41200c0(context).mo41149c();
                    }
                    return -1;
                } else if (i != 1 && i != 2) {
                    if (i == 3) {
                        return m41201b0(context).mo41149c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: o */
    public void mo41181o() {
        AbstractC0319a mo41185m = mo41185m();
        if (mo41185m == null || !mo41185m.m41292l()) {
            m41188k0(0);
        }
    }

    /* renamed from: o0 */
    boolean m41180o0() {
        AbstractC6541b abstractC6541b = this.f822K;
        if (abstractC6541b != null) {
            abstractC6541b.mo20646c();
            return true;
        }
        AbstractC0319a mo41185m = mo41185m();
        return mo41185m != null && mo41185m.mo41094h();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m41211R(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: p */
    public void mo41179p(Configuration configuration) {
        AbstractC0319a mo41185m;
        if (this.f834W && this.f828Q && (mo41185m = mo41185m()) != null) {
            mo41185m.mo41090m(configuration);
        }
        C0484i.m40590b().m40585g(this.f812A);
        m41229G(false);
    }

    /* renamed from: p0 */
    boolean m41178p0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f842e0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m41176q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: q */
    public void mo41177q(Bundle bundle) {
        this.f843f0 = true;
        m41229G(false);
        m41205X();
        Object obj = this.f861z;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0905h.m39221c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0319a m41162y0 = m41162y0();
                if (m41162y0 == null) {
                    this.f856s0 = true;
                } else {
                    m41162y0.mo41088r(true);
                }
            }
            AbstractC0328d.m41248c(this);
        }
        this.f844g0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo41175r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f861z
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AbstractC0328d.m41243x(r3)
        L9:
            boolean r0 = r3.f853p0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f813B
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f855r0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f845h0 = r0
            r0 = 1
            r3.f846i0 = r0
            int r0 = r3.f847j0
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f861z
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            q.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0329e.f809x0
            java.lang.Object r1 = r3.f861z
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f847j0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            q.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0329e.f809x0
            java.lang.Object r1 = r3.f861z
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.f816E
            if (r0 == 0) goto L5e
            r0.m41291n()
        L5e:
            r3.m41217M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0329e.mo41175r():void");
    }

    /* renamed from: r0 */
    boolean m41174r0(int i, KeyEvent keyEvent) {
        AbstractC0319a mo41185m = mo41185m();
        if (mo41185m == null || !mo41185m.mo41089o(i, keyEvent)) {
            C0352t c0352t = this.f841d0;
            if (c0352t != null && m41160z0(c0352t, keyEvent.getKeyCode(), keyEvent, 1)) {
                C0352t c0352t2 = this.f841d0;
                if (c0352t2 != null) {
                    c0352t2.f896n = true;
                }
                return true;
            }
            if (this.f841d0 == null) {
                C0352t m41198d0 = m41198d0(0, true);
                m41240A0(m41198d0, keyEvent);
                boolean m41160z0 = m41160z0(m41198d0, keyEvent.getKeyCode(), keyEvent, 1);
                m41198d0.f895m = false;
                if (m41160z0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: s */
    public void mo41173s(Bundle bundle) {
        m41206W();
    }

    /* renamed from: s0 */
    boolean m41172s0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f842e0;
            this.f842e0 = false;
            C0352t m41198d0 = m41198d0(0, false);
            if (m41198d0 != null && m41198d0.f897o) {
                if (!z) {
                    m41214O(m41198d0, true);
                }
                return true;
            } else if (m41180o0()) {
                return true;
            }
        } else if (i == 82) {
            m41170t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: t */
    public void mo41171t() {
        AbstractC0319a mo41185m = mo41185m();
        if (mo41185m != null) {
            mo41185m.mo41087s(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: u */
    public void mo41169u(Bundle bundle) {
    }

    /* renamed from: u0 */
    void m41168u0(int i) {
        AbstractC0319a mo41185m;
        if (i != 108 || (mo41185m = mo41185m()) == null) {
            return;
        }
        mo41185m.mo41093i(true);
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: v */
    public void mo41167v() {
        this.f845h0 = true;
        m41231F();
    }

    /* renamed from: v0 */
    void m41166v0(int i) {
        if (i == 108) {
            AbstractC0319a mo41185m = mo41185m();
            if (mo41185m != null) {
                mo41185m.mo41093i(false);
            }
        } else if (i == 0) {
            C0352t m41198d0 = m41198d0(i, true);
            if (m41198d0.f897o) {
                m41214O(m41198d0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: w */
    public void mo41165w() {
        this.f845h0 = false;
        AbstractC0319a mo41185m = mo41185m();
        if (mo41185m != null) {
            mo41185m.mo41087s(false);
        }
    }

    /* renamed from: w0 */
    void m41164w0(ViewGroup viewGroup) {
    }

    /* renamed from: y0 */
    final AbstractC0319a m41162y0() {
        return this.f816E;
    }

    @Override // androidx.appcompat.app.AbstractC0328d
    /* renamed from: z */
    public boolean mo41161z(int i) {
        int m41236C0 = m41236C0(i);
        if (this.f838a0 && m41236C0 == 108) {
            return false;
        }
        if (this.f834W && m41236C0 == 1) {
            this.f834W = false;
        }
        if (m41236C0 == 1) {
            m41226H0();
            this.f838a0 = true;
            return true;
        } else if (m41236C0 == 2) {
            m41226H0();
            this.f832U = true;
            return true;
        } else if (m41236C0 == 5) {
            m41226H0();
            this.f833V = true;
            return true;
        } else if (m41236C0 == 10) {
            m41226H0();
            this.f836Y = true;
            return true;
        } else if (m41236C0 == 108) {
            m41226H0();
            this.f834W = true;
            return true;
        } else if (m41236C0 != 109) {
            return this.f813B.requestFeature(m41236C0);
        } else {
            m41226H0();
            this.f835X = true;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0329e(Dialog dialog, InterfaceC5146a interfaceC5146a) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC5146a, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflater$Factory2C0329e(Context context, Window window, InterfaceC5146a interfaceC5146a, Object obj) {
        C9558g<String, Integer> c9558g;
        Integer num;
        ActivityC0325c m41224I0;
        this.f826O = null;
        this.f827P = true;
        this.f847j0 = -100;
        this.f855r0 = new RunnableC0331b();
        this.f812A = context;
        this.f815D = interfaceC5146a;
        this.f861z = obj;
        if (this.f847j0 == -100 && (obj instanceof Dialog) && (m41224I0 = m41224I0()) != null) {
            this.f847j0 = m41224I0.m41259Y().mo41189k();
        }
        if (this.f847j0 == -100 && (num = (c9558g = f809x0).get(obj.getClass().getName())) != null) {
            this.f847j0 = num.intValue();
            c9558g.remove(obj.getClass().getName());
        }
        if (window != null) {
            m41225I(window);
        }
        C0484i.m40584h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$n */
    /* loaded from: classes.dex */
    public class C0345n extends Window$CallbackC6553i {
        C0345n(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        final ActionMode m41153b(ActionMode.Callback callback) {
            C6546f.C6547a c6547a = new C6546f.C6547a(LayoutInflater$Factory2C0329e.this.f812A, callback);
            AbstractC6541b m41230F0 = LayoutInflater$Factory2C0329e.this.m41230F0(c6547a);
            if (m41230F0 != null) {
                return c6547a.m20628e(m41230F0);
            }
            return null;
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0329e.this.m41209T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C0329e.this.m41174r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0378e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0329e.this.m41168u0(i);
            return true;
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0329e.this.m41166v0(i);
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0378e c0378e = menu instanceof C0378e ? (C0378e) menu : null;
            if (i == 0 && c0378e == null) {
                return false;
            }
            if (c0378e != null) {
                c0378e.m41018e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0378e != null) {
                c0378e.m41018e0(false);
            }
            return onPreparePanel;
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0378e c0378e;
            C0352t m41198d0 = LayoutInflater$Factory2C0329e.this.m41198d0(0, true);
            if (m41198d0 != null && (c0378e = m41198d0.f892j) != null) {
                super.onProvideKeyboardShortcuts(list, c0378e, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflater$Factory2C0329e.this.m41184m0()) {
                return m41153b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // p189k.Window$CallbackC6553i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (LayoutInflater$Factory2C0329e.this.m41184m0() && i == 0) {
                return m41153b(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }
}
