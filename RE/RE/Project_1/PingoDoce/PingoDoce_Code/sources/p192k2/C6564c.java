package p192k2;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: k2.c */
/* loaded from: classes.dex */
public final class C6564c {

    /* renamed from: a */
    private final InterfaceC6567c f17797a;

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: k2.c$b */
    /* loaded from: classes.dex */
    private static final class C6566b implements InterfaceC6567c {

        /* renamed from: a */
        private final Uri f17799a;

        /* renamed from: b */
        private final ClipDescription f17800b;

        /* renamed from: c */
        private final Uri f17801c;

        C6566b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f17799a = uri;
            this.f17800b = clipDescription;
            this.f17801c = uri2;
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: a */
        public ClipDescription mo20565a() {
            return this.f17800b;
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: b */
        public Object mo20564b() {
            return null;
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: c */
        public Uri mo20563c() {
            return this.f17799a;
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: d */
        public void mo20562d() {
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: e */
        public Uri mo20561e() {
            return this.f17801c;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: k2.c$c */
    /* loaded from: classes.dex */
    private interface InterfaceC6567c {
        /* renamed from: a */
        ClipDescription mo20565a();

        /* renamed from: b */
        Object mo20564b();

        /* renamed from: c */
        Uri mo20563c();

        /* renamed from: d */
        void mo20562d();

        /* renamed from: e */
        Uri mo20561e();
    }

    public C6564c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f17797a = new C6565a(uri, clipDescription, uri2);
        } else {
            this.f17797a = new C6566b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C6564c m20566f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C6564c(new C6565a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m20571a() {
        return this.f17797a.mo20563c();
    }

    /* renamed from: b */
    public ClipDescription m20570b() {
        return this.f17797a.mo20565a();
    }

    /* renamed from: c */
    public Uri m20569c() {
        return this.f17797a.mo20561e();
    }

    /* renamed from: d */
    public void m20568d() {
        this.f17797a.mo20562d();
    }

    /* renamed from: e */
    public Object m20567e() {
        return this.f17797a.mo20564b();
    }

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: k2.c$a */
    /* loaded from: classes.dex */
    private static final class C6565a implements InterfaceC6567c {

        /* renamed from: a */
        final InputContentInfo f17798a;

        C6565a(Object obj) {
            this.f17798a = (InputContentInfo) obj;
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: a */
        public ClipDescription mo20565a() {
            return this.f17798a.getDescription();
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: b */
        public Object mo20564b() {
            return this.f17798a;
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: c */
        public Uri mo20563c() {
            return this.f17798a.getContentUri();
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: d */
        public void mo20562d() {
            this.f17798a.requestPermission();
        }

        @Override // p192k2.C6564c.InterfaceC6567c
        /* renamed from: e */
        public Uri mo20561e() {
            return this.f17798a.getLinkUri();
        }

        C6565a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f17798a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C6564c(InterfaceC6567c interfaceC6567c) {
        this.f17797a = interfaceC6567c;
    }
}
