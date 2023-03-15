package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.graphics.C0975d;
import androidx.core.provider.C1038g;
import androidx.core.util.InterfaceC1068a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p301q.C9557f;
import p301q.C9558g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.f */
/* loaded from: classes.dex */
public class C1032f {

    /* renamed from: a */
    static final C9557f<String, Typeface> f3334a = new C9557f<>(16);

    /* renamed from: b */
    private static final ExecutorService f3335b = C1042h.m38692a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f3336c = new Object();

    /* renamed from: d */
    static final C9558g<String, ArrayList<InterfaceC1068a<C1037e>>> f3337d = new C9558g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: androidx.core.provider.f$a */
    /* loaded from: classes.dex */
    public class CallableC1033a implements Callable<C1037e> {

        /* renamed from: a */
        final /* synthetic */ String f3338a;

        /* renamed from: b */
        final /* synthetic */ Context f3339b;

        /* renamed from: c */
        final /* synthetic */ C1031e f3340c;

        /* renamed from: d */
        final /* synthetic */ int f3341d;

        CallableC1033a(String str, Context context, C1031e c1031e, int i) {
            this.f3338a = str;
            this.f3339b = context;
            this.f3340c = c1031e;
            this.f3341d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1037e call() {
            return C1032f.m38712c(this.f3338a, this.f3339b, this.f3340c, this.f3341d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: androidx.core.provider.f$b */
    /* loaded from: classes.dex */
    public class C1034b implements InterfaceC1068a<C1037e> {

        /* renamed from: a */
        final /* synthetic */ C1024a f3342a;

        C1034b(C1024a c1024a) {
            this.f3342a = c1024a;
        }

        @Override // androidx.core.util.InterfaceC1068a
        /* renamed from: a */
        public void accept(C1037e c1037e) {
            if (c1037e == null) {
                c1037e = new C1037e(-3);
            }
            this.f3342a.m38733b(c1037e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: androidx.core.provider.f$c */
    /* loaded from: classes.dex */
    public class CallableC1035c implements Callable<C1037e> {

        /* renamed from: a */
        final /* synthetic */ String f3343a;

        /* renamed from: b */
        final /* synthetic */ Context f3344b;

        /* renamed from: c */
        final /* synthetic */ C1031e f3345c;

        /* renamed from: d */
        final /* synthetic */ int f3346d;

        CallableC1035c(String str, Context context, C1031e c1031e, int i) {
            this.f3343a = str;
            this.f3344b = context;
            this.f3345c = c1031e;
            this.f3346d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1037e call() {
            try {
                return C1032f.m38712c(this.f3343a, this.f3344b, this.f3345c, this.f3346d);
            } catch (Throwable unused) {
                return new C1037e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: androidx.core.provider.f$d */
    /* loaded from: classes.dex */
    public class C1036d implements InterfaceC1068a<C1037e> {

        /* renamed from: a */
        final /* synthetic */ String f3347a;

        C1036d(String str) {
            this.f3347a = str;
        }

        @Override // androidx.core.util.InterfaceC1068a
        /* renamed from: a */
        public void accept(C1037e c1037e) {
            synchronized (C1032f.f3336c) {
                C9558g<String, ArrayList<InterfaceC1068a<C1037e>>> c9558g = C1032f.f3337d;
                ArrayList<InterfaceC1068a<C1037e>> arrayList = c9558g.get(this.f3347a);
                if (arrayList == null) {
                    return;
                }
                c9558g.remove(this.f3347a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(c1037e);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m38714a(C1031e c1031e, int i) {
        return c1031e.m38718d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m38713b(C1038g.C1039a c1039a) {
        int i = 1;
        if (c1039a.m38701c() != 0) {
            return c1039a.m38701c() != 1 ? -3 : -2;
        }
        C1038g.C1040b[] m38702b = c1039a.m38702b();
        if (m38702b != null && m38702b.length != 0) {
            i = 0;
            for (C1038g.C1040b c1040b : m38702b) {
                int m38699b = c1040b.m38699b();
                if (m38699b != 0) {
                    if (m38699b < 0) {
                        return -3;
                    }
                    return m38699b;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    static C1037e m38712c(String str, Context context, C1031e c1031e, int i) {
        C9557f<String, Typeface> c9557f = f3334a;
        Typeface m10631d = c9557f.m10631d(str);
        if (m10631d != null) {
            return new C1037e(m10631d);
        }
        try {
            C1038g.C1039a m38726e = C1029d.m38726e(context, c1031e, null);
            int m38713b = m38713b(m38726e);
            if (m38713b != 0) {
                return new C1037e(m38713b);
            }
            Typeface m38916b = C0975d.m38916b(context, null, m38726e.m38702b(), i);
            if (m38916b != null) {
                c9557f.m10629f(str, m38916b);
                return new C1037e(m38916b);
            }
            return new C1037e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1037e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Typeface m38711d(Context context, C1031e c1031e, int i, Executor executor, C1024a c1024a) {
        String m38714a = m38714a(c1031e, i);
        Typeface m10631d = f3334a.m10631d(m38714a);
        if (m10631d != null) {
            c1024a.m38733b(new C1037e(m10631d));
            return m10631d;
        }
        C1034b c1034b = new C1034b(c1024a);
        synchronized (f3336c) {
            C9558g<String, ArrayList<InterfaceC1068a<C1037e>>> c9558g = f3337d;
            ArrayList<InterfaceC1068a<C1037e>> arrayList = c9558g.get(m38714a);
            if (arrayList != null) {
                arrayList.add(c1034b);
                return null;
            }
            ArrayList<InterfaceC1068a<C1037e>> arrayList2 = new ArrayList<>();
            arrayList2.add(c1034b);
            c9558g.put(m38714a, arrayList2);
            CallableC1035c callableC1035c = new CallableC1035c(m38714a, context, c1031e, i);
            if (executor == null) {
                executor = f3335b;
            }
            C1042h.m38691b(executor, callableC1035c, new C1036d(m38714a));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Typeface m38710e(Context context, C1031e c1031e, C1024a c1024a, int i, int i2) {
        String m38714a = m38714a(c1031e, i);
        Typeface m10631d = f3334a.m10631d(m38714a);
        if (m10631d != null) {
            c1024a.m38733b(new C1037e(m10631d));
            return m10631d;
        } else if (i2 == -1) {
            C1037e m38712c = m38712c(m38714a, context, c1031e, i);
            c1024a.m38733b(m38712c);
            return m38712c.f3348a;
        } else {
            try {
                C1037e c1037e = (C1037e) C1042h.m38690c(f3335b, new CallableC1033a(m38714a, context, c1031e, i), i2);
                c1024a.m38733b(c1037e);
                return c1037e.f3348a;
            } catch (InterruptedException unused) {
                c1024a.m38733b(new C1037e(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: androidx.core.provider.f$e */
    /* loaded from: classes.dex */
    public static final class C1037e {

        /* renamed from: a */
        final Typeface f3348a;

        /* renamed from: b */
        final int f3349b;

        C1037e(int i) {
            this.f3348a = null;
            this.f3349b = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean m38705a() {
            return this.f3349b == 0;
        }

        @SuppressLint({"WrongConstant"})
        C1037e(Typeface typeface) {
            this.f3348a = typeface;
            this.f3349b = 0;
        }
    }
}
