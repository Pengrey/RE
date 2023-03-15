package p193k3;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p095f3.InterfaceC5359e;
import p181jd.Intrinsics;
import p193k3.InterfaceC6580h;
import p305q3.C9635k;

/* renamed from: k3.k */
/* loaded from: classes.dex */
public final class C6589k implements InterfaceC6580h {

    /* renamed from: a */
    private final Uri f17835a;

    /* renamed from: b */
    private final C9635k f17836b;

    /* compiled from: ResourceUriFetcher.kt */
    /* renamed from: k3.k$a */
    /* loaded from: classes.dex */
    public static final class C6590a {
        private C6590a() {
        }

        public /* synthetic */ C6590a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ResourceUriFetcher.kt */
    /* renamed from: k3.k$b */
    /* loaded from: classes.dex */
    public static final class C6591b implements InterfaceC6580h.InterfaceC6581a {
        /* renamed from: c */
        private final boolean m20524c(Uri uri) {
            return Intrinsics.equals(uri.getScheme(), "android.resource");
        }

        /* renamed from: b */
        public InterfaceC6580h mo20560b(Uri uri, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            if (m20524c(uri)) {
                return new C6589k(uri, c9635k);
            }
            return null;
        }
    }

    static {
        new C6590a(null);
    }

    public C6589k(Uri uri, C9635k c9635k) {
        this.f17835a = uri;
        this.f17836b = c9635k;
    }

    /* renamed from: b */
    private final Void m20527b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        r0 = sd.C10533s.m8485i(r0);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo20548a(bd.InterfaceC1886d r12) {
        /*
            r11 = this;
            android.net.Uri r12 = r11.f17835a
            java.lang.String r12 = r12.getAuthority()
            if (r12 == 0) goto Lf3
            boolean r0 = sd.C10163k.m8971r(r12)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L11
            goto L12
        L11:
            r12 = 0
        L12:
            if (r12 == 0) goto Lf3
            android.net.Uri r0 = r11.f17835a
            java.util.List r0 = r0.getPathSegments()
            java.lang.Object r0 = p489zc.C13777q.m248X(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Le8
            java.lang.Integer r0 = sd.C10163k.m8983i(r0)
            if (r0 == 0) goto Le8
            int r0 = r0.intValue()
            q3.k r2 = r11.f17836b
            android.content.Context r2 = r2.m10324g()
            java.lang.String r3 = r2.getPackageName()
            boolean r3 = p181jd.Intrinsics.equals(r12, r3)
            if (r3 == 0) goto L41
            android.content.res.Resources r3 = r2.getResources()
            goto L49
        L41:
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            android.content.res.Resources r3 = r3.getResourcesForApplication(r12)
        L49:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r3.getValue(r0, r4, r1)
            java.lang.CharSequence r1 = r4.string
            r6 = 47
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r1
            int r4 = sd.C10163k.m8988Y(r5, r6, r7, r8, r9, r10)
            int r5 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r4, r5)
            java.lang.String r1 = r1.toString()
            android.webkit.MimeTypeMap r4 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = p396v3.C11098i.m6145k(r4, r1)
            java.lang.String r4 = "text/xml"
            boolean r4 = p181jd.Intrinsics.equals(r1, r4)
            if (r4 == 0) goto Lc3
            java.lang.String r1 = r2.getPackageName()
            boolean r12 = p181jd.Intrinsics.equals(r12, r1)
            if (r12 == 0) goto L89
            android.graphics.drawable.Drawable r12 = p396v3.C11092d.m6168a(r2, r0)
            goto L8d
        L89:
            android.graphics.drawable.Drawable r12 = p396v3.C11092d.m6165d(r2, r3, r0)
        L8d:
            r4 = r12
            boolean r12 = p396v3.C11098i.m6134v(r4)
            k3.f r0 = new k3.f
            if (r12 == 0) goto Lbd
            v3.k r3 = p396v3.C11101k.f28493a
            q3.k r1 = r11.f17836b
            android.graphics.Bitmap$Config r5 = r1.m10325f()
            q3.k r1 = r11.f17836b
            r3.i r6 = r1.m10317n()
            q3.k r1 = r11.f17836b
            r3.h r7 = r1.m10318m()
            q3.k r1 = r11.f17836b
            boolean r8 = r1.m10328c()
            android.graphics.Bitmap r1 = r3.m6128a(r4, r5, r6, r7, r8)
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r2, r1)
        Lbd:
            h3.d r1 = p129h3.EnumC5826d.DISK
            r0.<init>(r4, r12, r1)
            goto Le7
        Lc3:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            java.io.InputStream r3 = r3.openRawResource(r0, r4)
            k3.l r5 = new k3.l
            sf.h0 r3 = p356sf.C10200t.m8558j(r3)
            sf.e r3 = p356sf.C10200t.m8565c(r3)
            h3.p r6 = new h3.p
            int r4 = r4.density
            r6.<init>(r12, r0, r4)
            h3.n r12 = p129h3.C5842o.m22952b(r3, r2, r6)
            h3.d r0 = p129h3.EnumC5826d.DISK
            r5.<init>(r12, r1, r0)
            r0 = r5
        Le7:
            return r0
        Le8:
            android.net.Uri r12 = r11.f17835a
            r11.m20527b(r12)
            kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException
            r12.<init>()
            throw r12
        Lf3:
            android.net.Uri r12 = r11.f17835a
            r11.m20527b(r12)
            kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k3.C6589k.mo20548a(bd.d):java.lang.Object");
    }
}
