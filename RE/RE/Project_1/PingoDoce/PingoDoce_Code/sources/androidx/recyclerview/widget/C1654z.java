package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.z */
/* loaded from: classes.dex */
public class C1654z {

    /* renamed from: a */
    final InterfaceC1656b f5018a;

    /* renamed from: b */
    C1655a f5019b = new C1655a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewBoundsCheck.java */
    /* renamed from: androidx.recyclerview.widget.z$a */
    /* loaded from: classes.dex */
    public static class C1655a {

        /* renamed from: a */
        int f5020a = 0;

        /* renamed from: b */
        int f5021b;

        /* renamed from: c */
        int f5022c;

        /* renamed from: d */
        int f5023d;

        /* renamed from: e */
        int f5024e;

        C1655a() {
        }

        /* renamed from: a */
        void m35808a(int i) {
            this.f5020a = i | this.f5020a;
        }

        /* renamed from: b */
        boolean m35807b() {
            int i = this.f5020a;
            if ((i & 7) == 0 || (i & (m35806c(this.f5023d, this.f5021b) << 0)) != 0) {
                int i2 = this.f5020a;
                if ((i2 & 112) == 0 || (i2 & (m35806c(this.f5023d, this.f5022c) << 4)) != 0) {
                    int i3 = this.f5020a;
                    if ((i3 & 1792) == 0 || (i3 & (m35806c(this.f5024e, this.f5021b) << 8)) != 0) {
                        int i4 = this.f5020a;
                        return (i4 & 28672) == 0 || (i4 & (m35806c(this.f5024e, this.f5022c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* renamed from: c */
        int m35806c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        void m35805d() {
            this.f5020a = 0;
        }

        /* renamed from: e */
        void m35804e(int i, int i2, int i3, int i4) {
            this.f5021b = i;
            this.f5022c = i2;
            this.f5023d = i3;
            this.f5024e = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewBoundsCheck.java */
    /* renamed from: androidx.recyclerview.widget.z$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1656b {
        /* renamed from: a */
        View mo35803a(int i);

        /* renamed from: b */
        int mo35802b();

        /* renamed from: c */
        int mo35801c(View view);

        /* renamed from: d */
        int mo35800d();

        /* renamed from: e */
        int mo35799e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1654z(InterfaceC1656b interfaceC1656b) {
        this.f5018a = interfaceC1656b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m35810a(int i, int i2, int i3, int i4) {
        int mo35800d = this.f5018a.mo35800d();
        int mo35802b = this.f5018a.mo35802b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View mo35803a = this.f5018a.mo35803a(i);
            this.f5019b.m35804e(mo35800d, mo35802b, this.f5018a.mo35801c(mo35803a), this.f5018a.mo35799e(mo35803a));
            if (i3 != 0) {
                this.f5019b.m35805d();
                this.f5019b.m35808a(i3);
                if (this.f5019b.m35807b()) {
                    return mo35803a;
                }
            }
            if (i4 != 0) {
                this.f5019b.m35805d();
                this.f5019b.m35808a(i4);
                if (this.f5019b.m35807b()) {
                    view = mo35803a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m35809b(View view, int i) {
        this.f5019b.m35804e(this.f5018a.mo35800d(), this.f5018a.mo35802b(), this.f5018a.mo35801c(view), this.f5018a.mo35799e(view));
        if (i != 0) {
            this.f5019b.m35805d();
            this.f5019b.m35808a(i);
            return this.f5019b.m35807b();
        }
        return false;
    }
}
