package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C1032f;
import androidx.core.provider.C1038g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.a */
/* loaded from: classes.dex */
public class C1024a {

    /* renamed from: a */
    private final C1038g.C1041c f3320a;

    /* renamed from: b */
    private final Handler f3321b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes.dex */
    public class RunnableC1025a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ C1038g.C1041c f3322w;

        /* renamed from: x */
        final /* synthetic */ Typeface f3323x;

        RunnableC1025a(C1024a c1024a, C1038g.C1041c c1041c, Typeface typeface) {
            this.f3322w = c1041c;
            this.f3323x = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3322w.mo38693b(this.f3323x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: androidx.core.provider.a$b */
    /* loaded from: classes.dex */
    public class RunnableC1026b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ C1038g.C1041c f3324w;

        /* renamed from: x */
        final /* synthetic */ int f3325x;

        RunnableC1026b(C1024a c1024a, C1038g.C1041c c1041c, int i) {
            this.f3324w = c1041c;
            this.f3325x = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3324w.mo38694a(this.f3325x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1024a(C1038g.C1041c c1041c, Handler handler) {
        this.f3320a = c1041c;
        this.f3321b = handler;
    }

    /* renamed from: a */
    private void m38734a(int i) {
        this.f3321b.post(new RunnableC1026b(this, this.f3320a, i));
    }

    /* renamed from: c */
    private void m38732c(Typeface typeface) {
        this.f3321b.post(new RunnableC1025a(this, this.f3320a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m38733b(C1032f.C1037e c1037e) {
        if (c1037e.m38705a()) {
            m38732c(c1037e.f3348a);
        } else {
            m38734a(c1037e.f3349b);
        }
    }
}
