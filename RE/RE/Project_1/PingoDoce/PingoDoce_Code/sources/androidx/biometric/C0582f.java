package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.C0549a;
import androidx.lifecycle.AbstractC1468o0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.f */
/* loaded from: classes.dex */
public class C0582f extends AbstractC1468o0 {

    /* renamed from: c */
    private Executor f1878c;

    /* renamed from: d */
    private BiometricPrompt.AbstractC0544a f1879d;

    /* renamed from: e */
    private BiometricPrompt.C0547d f1880e;

    /* renamed from: f */
    private BiometricPrompt.C0546c f1881f;

    /* renamed from: g */
    private C0549a f1882g;

    /* renamed from: h */
    private C0587g f1883h;

    /* renamed from: i */
    private DialogInterface.OnClickListener f1884i;

    /* renamed from: j */
    private CharSequence f1885j;

    /* renamed from: l */
    private boolean f1887l;

    /* renamed from: m */
    private boolean f1888m;

    /* renamed from: n */
    private boolean f1889n;

    /* renamed from: o */
    private boolean f1890o;

    /* renamed from: p */
    private boolean f1891p;

    /* renamed from: q */
    private C1436e0<BiometricPrompt.C0545b> f1892q;

    /* renamed from: r */
    private C1436e0<C0556c> f1893r;

    /* renamed from: s */
    private C1436e0<CharSequence> f1894s;

    /* renamed from: t */
    private C1436e0<Boolean> f1895t;

    /* renamed from: u */
    private C1436e0<Boolean> f1896u;

    /* renamed from: w */
    private C1436e0<Boolean> f1898w;

    /* renamed from: y */
    private C1436e0<Integer> f1900y;

    /* renamed from: z */
    private C1436e0<CharSequence> f1901z;

    /* renamed from: k */
    private int f1886k = 0;

    /* renamed from: v */
    private boolean f1897v = true;

    /* renamed from: x */
    private int f1899x = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BiometricViewModel.java */
    /* renamed from: androidx.biometric.f$a */
    /* loaded from: classes.dex */
    public class C0583a extends BiometricPrompt.AbstractC0544a {
        C0583a(C0582f c0582f) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricViewModel.java */
    /* renamed from: androidx.biometric.f$b */
    /* loaded from: classes.dex */
    public static final class C0584b extends C0549a.C0554d {

        /* renamed from: a */
        private final WeakReference<C0582f> f1902a;

        C0584b(C0582f c0582f) {
            this.f1902a = new WeakReference<>(c0582f);
        }

        @Override // androidx.biometric.C0549a.C0554d
        /* renamed from: a */
        void mo40157a(int i, CharSequence charSequence) {
            if (this.f1902a.get() == null || this.f1902a.get().m40207C() || !this.f1902a.get().m40209A()) {
                return;
            }
            this.f1902a.get().m40199K(new C0556c(i, charSequence));
        }

        @Override // androidx.biometric.C0549a.C0554d
        /* renamed from: b */
        void mo40156b() {
            if (this.f1902a.get() == null || !this.f1902a.get().m40209A()) {
                return;
            }
            this.f1902a.get().m40198L(true);
        }

        @Override // androidx.biometric.C0549a.C0554d
        /* renamed from: c */
        void mo40155c(CharSequence charSequence) {
            if (this.f1902a.get() != null) {
                this.f1902a.get().m40197M(charSequence);
            }
        }

        @Override // androidx.biometric.C0549a.C0554d
        /* renamed from: d */
        void mo40154d(BiometricPrompt.C0545b c0545b) {
            if (this.f1902a.get() == null || !this.f1902a.get().m40209A()) {
                return;
            }
            if (c0545b.m40309a() == -1) {
                c0545b = new BiometricPrompt.C0545b(c0545b.m40308b(), this.f1902a.get().m40163u());
            }
            this.f1902a.get().m40196N(c0545b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricViewModel.java */
    /* renamed from: androidx.biometric.f$c */
    /* loaded from: classes.dex */
    public static class ExecutorC0585c implements Executor {

        /* renamed from: w */
        private final Handler f1903w = new Handler(Looper.getMainLooper());

        ExecutorC0585c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1903w.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BiometricViewModel.java */
    /* renamed from: androidx.biometric.f$d */
    /* loaded from: classes.dex */
    public static class DialogInterface$OnClickListenerC0586d implements DialogInterface.OnClickListener {

        /* renamed from: w */
        private final WeakReference<C0582f> f1904w;

        DialogInterface$OnClickListenerC0586d(C0582f c0582f) {
            this.f1904w = new WeakReference<>(c0582f);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f1904w.get() != null) {
                this.f1904w.get().m40182b0(true);
            }
        }
    }

    /* renamed from: f0 */
    private static <T> void m40178f0(C1436e0<T> c1436e0, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c1436e0.mo166p(t);
        } else {
            c1436e0.mo169m(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m40209A() {
        return this.f1888m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m40208B() {
        BiometricPrompt.C0547d c0547d = this.f1880e;
        return c0547d == null || c0547d.m40298f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m40207C() {
        return this.f1889n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m40206D() {
        return this.f1890o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public LiveData<Boolean> m40205E() {
        if (this.f1898w == null) {
            this.f1898w = new C1436e0<>();
        }
        return this.f1898w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean m40204F() {
        return this.f1897v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m40203G() {
        return this.f1891p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public LiveData<Boolean> m40202H() {
        if (this.f1896u == null) {
            this.f1896u = new C1436e0<>();
        }
        return this.f1896u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean m40201I() {
        return this.f1887l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m40200J() {
        this.f1879d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m40199K(C0556c c0556c) {
        if (this.f1893r == null) {
            this.f1893r = new C1436e0<>();
        }
        m40178f0(this.f1893r, c0556c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m40198L(boolean z) {
        if (this.f1895t == null) {
            this.f1895t = new C1436e0<>();
        }
        m40178f0(this.f1895t, Boolean.valueOf(z));
    }

    /* renamed from: M */
    void m40197M(CharSequence charSequence) {
        if (this.f1894s == null) {
            this.f1894s = new C1436e0<>();
        }
        m40178f0(this.f1894s, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m40196N(BiometricPrompt.C0545b c0545b) {
        if (this.f1892q == null) {
            this.f1892q = new C1436e0<>();
        }
        m40178f0(this.f1892q, c0545b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m40195O(boolean z) {
        this.f1888m = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m40194P(int i) {
        this.f1886k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m40193Q(BiometricPrompt.AbstractC0544a abstractC0544a) {
        this.f1879d = abstractC0544a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m40192R(Executor executor) {
        this.f1878c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m40191S(boolean z) {
        this.f1889n = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m40190T(BiometricPrompt.C0546c c0546c) {
        this.f1881f = c0546c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m40189U(boolean z) {
        this.f1890o = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m40188V(boolean z) {
        if (this.f1898w == null) {
            this.f1898w = new C1436e0<>();
        }
        m40178f0(this.f1898w, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m40187W(boolean z) {
        this.f1897v = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m40186X(CharSequence charSequence) {
        if (this.f1901z == null) {
            this.f1901z = new C1436e0<>();
        }
        m40178f0(this.f1901z, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m40185Y(int i) {
        this.f1899x = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m40184Z(int i) {
        if (this.f1900y == null) {
            this.f1900y = new C1436e0<>();
        }
        m40178f0(this.f1900y, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void m40183a0(boolean z) {
        this.f1891p = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m40182b0(boolean z) {
        if (this.f1896u == null) {
            this.f1896u = new C1436e0<>();
        }
        m40178f0(this.f1896u, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m40181c0(CharSequence charSequence) {
        this.f1885j = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m40180d0(BiometricPrompt.C0547d c0547d) {
        this.f1880e = c0547d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void m40179e0(boolean z) {
        this.f1887l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m40177g() {
        BiometricPrompt.C0547d c0547d = this.f1880e;
        if (c0547d != null) {
            return C0555b.m40286b(c0547d, this.f1881f);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C0549a m40176h() {
        if (this.f1882g == null) {
            this.f1882g = new C0549a(new C0584b(this));
        }
        return this.f1882g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C1436e0<C0556c> m40175i() {
        if (this.f1893r == null) {
            this.f1893r = new C1436e0<>();
        }
        return this.f1893r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public LiveData<CharSequence> m40174j() {
        if (this.f1894s == null) {
            this.f1894s = new C1436e0<>();
        }
        return this.f1894s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public LiveData<BiometricPrompt.C0545b> m40173k() {
        if (this.f1892q == null) {
            this.f1892q = new C1436e0<>();
        }
        return this.f1892q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m40172l() {
        return this.f1886k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C0587g m40171m() {
        if (this.f1883h == null) {
            this.f1883h = new C0587g();
        }
        return this.f1883h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public BiometricPrompt.AbstractC0544a m40170n() {
        if (this.f1879d == null) {
            this.f1879d = new C0583a(this);
        }
        return this.f1879d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public Executor m40169o() {
        Executor executor = this.f1878c;
        return executor != null ? executor : new ExecutorC0585c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public BiometricPrompt.C0546c m40168p() {
        return this.f1881f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence m40167q() {
        BiometricPrompt.C0547d c0547d = this.f1880e;
        if (c0547d != null) {
            return c0547d.m40302b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public LiveData<CharSequence> m40166r() {
        if (this.f1901z == null) {
            this.f1901z = new C1436e0<>();
        }
        return this.f1901z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public int m40165s() {
        return this.f1899x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public LiveData<Integer> m40164t() {
        if (this.f1900y == null) {
            this.f1900y = new C1436e0<>();
        }
        return this.f1900y;
    }

    /* renamed from: u */
    int m40163u() {
        int m40177g = m40177g();
        return (!C0555b.m40284d(m40177g) || C0555b.m40285c(m40177g)) ? -1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public DialogInterface.OnClickListener m40162v() {
        if (this.f1884i == null) {
            this.f1884i = new DialogInterface$OnClickListenerC0586d(this);
        }
        return this.f1884i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public CharSequence m40161w() {
        CharSequence charSequence = this.f1885j;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.C0547d c0547d = this.f1880e;
        if (c0547d != null) {
            return c0547d.m40301c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public CharSequence m40160x() {
        BiometricPrompt.C0547d c0547d = this.f1880e;
        if (c0547d != null) {
            return c0547d.m40300d();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public CharSequence m40159y() {
        BiometricPrompt.C0547d c0547d = this.f1880e;
        if (c0547d != null) {
            return c0547d.m40299e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public LiveData<Boolean> m40158z() {
        if (this.f1895t == null) {
            this.f1895t = new C1436e0<>();
        }
        return this.f1895t;
    }
}
