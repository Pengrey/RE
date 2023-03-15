package com.airbnb.lottie;

import android.content.Context;
import androidx.core.p020os.C1020i;
import java.io.File;
import p075e4.C4979b;
import p075e4.C4984g;
import p075e4.C4985h;
import p075e4.InterfaceC4982e;
import p075e4.InterfaceC4983f;

/* renamed from: com.airbnb.lottie.c */
/* loaded from: classes.dex */
public class C2199c {

    /* renamed from: a */
    public static boolean f6354a = false;

    /* renamed from: b */
    private static boolean f6355b = false;

    /* renamed from: c */
    private static String[] f6356c;

    /* renamed from: d */
    private static long[] f6357d;

    /* renamed from: e */
    private static int f6358e;

    /* renamed from: f */
    private static int f6359f;

    /* renamed from: g */
    private static InterfaceC4983f f6360g;

    /* renamed from: h */
    private static InterfaceC4982e f6361h;

    /* renamed from: i */
    private static volatile C4985h f6362i;

    /* renamed from: j */
    private static volatile C4984g f6363j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: L.java */
    /* renamed from: com.airbnb.lottie.c$a */
    /* loaded from: classes.dex */
    public class C2200a implements InterfaceC4982e {

        /* renamed from: a */
        final /* synthetic */ Context f6364a;

        C2200a(Context context) {
            this.f6364a = context;
        }

        @Override // p075e4.InterfaceC4982e
        /* renamed from: a */
        public File mo25980a() {
            return new File(this.f6364a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m34435a(String str) {
        if (f6355b) {
            int i = f6358e;
            if (i == 20) {
                f6359f++;
                return;
            }
            f6356c[i] = str;
            f6357d[i] = System.nanoTime();
            C1020i.m38740a(str);
            f6358e++;
        }
    }

    /* renamed from: b */
    public static float m34434b(String str) {
        int i = f6359f;
        if (i > 0) {
            f6359f = i - 1;
            return 0.0f;
        } else if (f6355b) {
            int i2 = f6358e - 1;
            f6358e = i2;
            if (i2 != -1) {
                if (str.equals(f6356c[i2])) {
                    C1020i.m38739b();
                    return ((float) (System.nanoTime() - f6357d[f6358e])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f6356c[f6358e] + ".");
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public static C4984g m34433c(Context context) {
        Context applicationContext = context.getApplicationContext();
        C4984g c4984g = f6363j;
        if (c4984g == null) {
            synchronized (C4984g.class) {
                c4984g = f6363j;
                if (c4984g == null) {
                    InterfaceC4982e interfaceC4982e = f6361h;
                    if (interfaceC4982e == null) {
                        interfaceC4982e = new C2200a(applicationContext);
                    }
                    c4984g = new C4984g(interfaceC4982e);
                    f6363j = c4984g;
                }
            }
        }
        return c4984g;
    }

    /* renamed from: d */
    public static C4985h m34432d(Context context) {
        C4985h c4985h = f6362i;
        if (c4985h == null) {
            synchronized (C4985h.class) {
                c4985h = f6362i;
                if (c4985h == null) {
                    C4984g m34433c = m34433c(context);
                    InterfaceC4983f interfaceC4983f = f6360g;
                    if (interfaceC4983f == null) {
                        interfaceC4983f = new C4979b();
                    }
                    c4985h = new C4985h(m34433c, interfaceC4983f);
                    f6362i = c4985h;
                }
            }
        }
        return c4985h;
    }
}
