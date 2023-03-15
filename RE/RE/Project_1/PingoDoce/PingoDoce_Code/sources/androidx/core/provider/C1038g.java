package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.core.util.C1076h;

/* renamed from: androidx.core.provider.g */
/* loaded from: classes.dex */
public class C1038g {

    /* compiled from: FontsContractCompat.java */
    /* renamed from: androidx.core.provider.g$a */
    /* loaded from: classes.dex */
    public static class C1039a {

        /* renamed from: a */
        private final int f3350a;

        /* renamed from: b */
        private final C1040b[] f3351b;

        @Deprecated
        public C1039a(int i, C1040b[] c1040bArr) {
            this.f3350a = i;
            this.f3351b = c1040bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C1039a m38703a(int i, C1040b[] c1040bArr) {
            return new C1039a(i, c1040bArr);
        }

        /* renamed from: b */
        public C1040b[] m38702b() {
            return this.f3351b;
        }

        /* renamed from: c */
        public int m38701c() {
            return this.f3350a;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: androidx.core.provider.g$b */
    /* loaded from: classes.dex */
    public static class C1040b {

        /* renamed from: a */
        private final Uri f3352a;

        /* renamed from: b */
        private final int f3353b;

        /* renamed from: c */
        private final int f3354c;

        /* renamed from: d */
        private final boolean f3355d;

        /* renamed from: e */
        private final int f3356e;

        @Deprecated
        public C1040b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f3352a = (Uri) C1076h.m38619f(uri);
            this.f3353b = i;
            this.f3354c = i2;
            this.f3355d = z;
            this.f3356e = i3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C1040b m38700a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C1040b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int m38699b() {
            return this.f3356e;
        }

        /* renamed from: c */
        public int m38698c() {
            return this.f3353b;
        }

        /* renamed from: d */
        public Uri m38697d() {
            return this.f3352a;
        }

        /* renamed from: e */
        public int m38696e() {
            return this.f3354c;
        }

        /* renamed from: f */
        public boolean m38695f() {
            return this.f3355d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: androidx.core.provider.g$c */
    /* loaded from: classes.dex */
    public static class C1041c {
        /* renamed from: a */
        public void mo38694a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo38693b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m38704a(Context context, C1031e c1031e, int i, boolean z, int i2, Handler handler, C1041c c1041c) {
        C1024a c1024a = new C1024a(c1041c, handler);
        if (z) {
            return C1032f.m38710e(context, c1031e, c1024a, i, i2);
        }
        return C1032f.m38711d(context, c1031e, i, null, c1024a);
    }
}
