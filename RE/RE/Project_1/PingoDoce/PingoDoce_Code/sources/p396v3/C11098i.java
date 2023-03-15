package p396v3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0928a;
import androidx.vectordrawable.graphics.drawable.C1704i;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import p095f3.InterfaceC5351c;
import p107ff.Headers;
import p115g3.C5601a;
import p129h3.EnumC5826d;
import p151i3.InterfaceC5996a;
import p181jd.Intrinsics;
import p213l3.C6980c;
import p213l3.InterfaceC6978b;
import p305q3.C9636l;
import p305q3.C9642o;
import p305q3.View$OnAttachStateChangeListenerC9645q;
import p327r3.AbstractC9797c;
import p327r3.EnumC9804h;
import p489zc.C13777q;
import sd.C10171u;
import sd.StringNumberConversions;

/* renamed from: v3.i */
/* loaded from: classes.dex */
public final class C11098i {

    /* renamed from: a */
    private static final Bitmap.Config[] f28485a;

    /* renamed from: b */
    private static final Bitmap.Config f28486b;

    /* renamed from: c */
    private static final Headers f28487c;

    /* compiled from: Utils.kt */
    /* renamed from: v3.i$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11099a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28488a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28489b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f28490c;

        static {
            int[] iArr = new int[EnumC5826d.values().length];
            iArr[EnumC5826d.MEMORY_CACHE.ordinal()] = 1;
            iArr[EnumC5826d.MEMORY.ordinal()] = 2;
            iArr[EnumC5826d.DISK.ordinal()] = 3;
            iArr[EnumC5826d.NETWORK.ordinal()] = 4;
            f28488a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            f28489b = iArr2;
            int[] iArr3 = new int[EnumC9804h.values().length];
            iArr3[EnumC9804h.FILL.ordinal()] = 1;
            iArr3[EnumC9804h.FIT.ordinal()] = 2;
            f28490c = iArr3;
        }
    }

    static {
        Bitmap.Config config;
        int i = Build.VERSION.SDK_INT;
        f28485a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f28486b = config;
        f28487c = new Headers.C5498a().m24002f();
    }

    /* renamed from: A */
    public static final int m6156A(AbstractC9797c abstractC9797c, EnumC9804h enumC9804h) {
        if (abstractC9797c instanceof AbstractC9797c.C9798a) {
            return ((AbstractC9797c.C9798a) abstractC9797c).f25738a;
        }
        int i = C11099a.f28490c[enumC9804h.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Reader.READ_DONE;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static final void m6155a(InterfaceC5996a.InterfaceC5998b interfaceC5998b) {
        try {
            interfaceC5998b.mo22370h();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final Headers.C5498a m6154b(Headers.C5498a c5498a, String str) {
        int m8906T;
        CharSequence m8915K0;
        m8906T = C10171u.m8906T(str, ':', 0, false, 6, null);
        if (m8906T != -1) {
            String substring = str.substring(0, m8906T);
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            m8915K0 = C10171u.m8915K0(substring);
            String obj = m8915K0.toString();
            String substring2 = str.substring(m8906T + 1);
            Intrinsics.checkIfNull(substring2, "this as java.lang.String).substring(startIndex)");
            c5498a.m24003e(obj, substring2);
            return c5498a;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    /* renamed from: c */
    public static final int m6153c(Context context, double d) {
        int i;
        try {
            Object m39107j = C0928a.m39107j(context, ActivityManager.class);
            Intrinsics.ifNullDoSomething(m39107j);
            ActivityManager activityManager = (ActivityManager) m39107j;
            i = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i = 256;
        }
        double d2 = 1024;
        return (int) (d * i * d2 * d2);
    }

    /* renamed from: d */
    public static final void m6152d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final double m6151e(Context context) {
        try {
            Object m39107j = C0928a.m39107j(context, ActivityManager.class);
            Intrinsics.ifNullDoSomething(m39107j);
            return ((ActivityManager) m39107j).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    /* renamed from: f */
    public static final Bitmap.Config m6150f() {
        return f28486b;
    }

    /* renamed from: g */
    public static final String m6149g(EnumC5826d enumC5826d) {
        int i = C11099a.f28488a[enumC5826d.ordinal()];
        if (i == 1 || i == 2) {
            return "🧠";
        }
        if (i != 3) {
            if (i == 4) {
                return "☁️ ";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "💾";
    }

    /* renamed from: h */
    public static final InterfaceC5351c m6148h(InterfaceC6978b.InterfaceC6979a interfaceC6979a) {
        return interfaceC6979a instanceof C6980c ? ((C6980c) interfaceC6979a).m19665f() : InterfaceC5351c.f14769a;
    }

    /* renamed from: i */
    public static final String m6147i(Uri uri) {
        return (String) C13777q.m254N(uri.getPathSegments());
    }

    /* renamed from: j */
    public static final int m6146j(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m6145k(android.webkit.MimeTypeMap r3, java.lang.String r4) {
        /*
            if (r4 == 0) goto Lb
            boolean r0 = sd.C10163k.m8971r(r4)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            r0 = 35
            r2 = 2
            java.lang.String r4 = sd.C10163k.m9000J0(r4, r0, r1, r2, r1)
            r0 = 63
            java.lang.String r4 = sd.C10163k.m9000J0(r4, r0, r1, r2, r1)
            r0 = 47
            java.lang.String r4 = sd.C10163k.m9006D0(r4, r0, r1, r2, r1)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r4 = sd.C10163k.m9007C0(r4, r0, r1)
            java.lang.String r3 = r3.getMimeTypeFromExtension(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p396v3.C11098i.m6145k(android.webkit.MimeTypeMap, java.lang.String):java.lang.String");
    }

    /* renamed from: l */
    public static final int m6144l(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* renamed from: m */
    public static final View$OnAttachStateChangeListenerC9645q m6143m(View view) {
        int i = C5601a.coil_request_manager;
        Object tag = view.getTag(i);
        View.OnAttachStateChangeListener onAttachStateChangeListener = tag instanceof View$OnAttachStateChangeListenerC9645q ? (View$OnAttachStateChangeListenerC9645q) tag : null;
        if (onAttachStateChangeListener == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i);
                View$OnAttachStateChangeListenerC9645q view$OnAttachStateChangeListenerC9645q = tag2 instanceof View$OnAttachStateChangeListenerC9645q ? (View$OnAttachStateChangeListenerC9645q) tag2 : null;
                if (view$OnAttachStateChangeListenerC9645q != null) {
                    onAttachStateChangeListener = view$OnAttachStateChangeListenerC9645q;
                } else {
                    onAttachStateChangeListener = new View$OnAttachStateChangeListenerC9645q(view);
                    view.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    view.setTag(i, onAttachStateChangeListener);
                }
            }
        }
        return onAttachStateChangeListener;
    }

    /* renamed from: n */
    public static final File m6142n(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    /* renamed from: o */
    public static final EnumC9804h m6141o(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : C11099a.f28489b[scaleType.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return EnumC9804h.FILL;
        }
        return EnumC9804h.FIT;
    }

    /* renamed from: p */
    public static final Bitmap.Config[] m6140p() {
        return f28485a;
    }

    /* renamed from: q */
    public static final int m6139q(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    /* renamed from: r */
    public static final boolean m6138r(Uri uri) {
        return Intrinsics.equals(uri.getScheme(), "file") && Intrinsics.equals(m6147i(uri), "android_asset");
    }

    /* renamed from: s */
    public static final boolean m6137s() {
        return Intrinsics.equals(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: t */
    public static final boolean m6136t(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    /* renamed from: u */
    public static final boolean m6135u(InterfaceC6978b.InterfaceC6979a interfaceC6979a) {
        return (interfaceC6979a instanceof C6980c) && ((C6980c) interfaceC6979a).m19664g();
    }

    /* renamed from: v */
    public static final boolean m6134v(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof C1704i);
    }

    /* renamed from: w */
    public static final Headers m6133w(Headers headers) {
        return headers == null ? f28487c : headers;
    }

    /* renamed from: x */
    public static final C9636l m6132x(C9636l c9636l) {
        return c9636l == null ? C9636l.f25433x : c9636l;
    }

    /* renamed from: y */
    public static final C9642o m6131y(C9642o c9642o) {
        return c9642o == null ? C9642o.f25449c : c9642o;
    }

    /* renamed from: z */
    public static final int m6130z(String str, int i) {
        Long m8952k;
        m8952k = StringNumberConversions.m8952k(str);
        if (m8952k != null) {
            long longValue = m8952k.longValue();
            if (longValue > 2147483647L) {
                return Reader.READ_DONE;
            }
            if (longValue < 0) {
                return 0;
            }
            return (int) longValue;
        }
        return i;
    }
}
