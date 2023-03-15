package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import p128h2.C5815b;

/* renamed from: androidx.core.app.j */
/* loaded from: classes.dex */
public class C0908j {

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.j$a */
    /* loaded from: classes.dex */
    public static class C0909a {

        /* renamed from: a */
        final Bundle f3090a;

        /* renamed from: b */
        private IconCompat f3091b;

        /* renamed from: c */
        private final C0923n[] f3092c;

        /* renamed from: d */
        private final C0923n[] f3093d;

        /* renamed from: e */
        private boolean f3094e;

        /* renamed from: f */
        boolean f3095f;

        /* renamed from: g */
        private final int f3096g;

        /* renamed from: h */
        private final boolean f3097h;
        @Deprecated

        /* renamed from: i */
        public int f3098i;

        /* renamed from: j */
        public CharSequence f3099j;

        /* renamed from: k */
        public PendingIntent f3100k;

        /* renamed from: l */
        private boolean f3101l;

        public C0909a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m38902h(null, BuildConfig.VERSION_NAME, i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m39213a() {
            return this.f3100k;
        }

        /* renamed from: b */
        public boolean m39212b() {
            return this.f3094e;
        }

        /* renamed from: c */
        public C0923n[] m39211c() {
            return this.f3093d;
        }

        /* renamed from: d */
        public Bundle m39210d() {
            return this.f3090a;
        }

        /* renamed from: e */
        public IconCompat m39209e() {
            int i;
            if (this.f3091b == null && (i = this.f3098i) != 0) {
                this.f3091b = IconCompat.m38902h(null, BuildConfig.VERSION_NAME, i);
            }
            return this.f3091b;
        }

        /* renamed from: f */
        public C0923n[] m39208f() {
            return this.f3092c;
        }

        /* renamed from: g */
        public int m39207g() {
            return this.f3096g;
        }

        /* renamed from: h */
        public boolean m39206h() {
            return this.f3095f;
        }

        /* renamed from: i */
        public CharSequence m39205i() {
            return this.f3099j;
        }

        /* renamed from: j */
        public boolean m39204j() {
            return this.f3101l;
        }

        /* renamed from: k */
        public boolean m39203k() {
            return this.f3097h;
        }

        public C0909a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        C0909a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0923n[] c0923nArr, C0923n[] c0923nArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f3095f = true;
            this.f3091b = iconCompat;
            if (iconCompat != null && iconCompat.m38898l() == 2) {
                this.f3098i = iconCompat.m38900j();
            }
            this.f3099j = C0916e.m39189d(charSequence);
            this.f3100k = pendingIntent;
            this.f3090a = bundle == null ? new Bundle() : bundle;
            this.f3092c = c0923nArr;
            this.f3093d = c0923nArr2;
            this.f3094e = z;
            this.f3096g = i;
            this.f3095f = z2;
            this.f3097h = z3;
            this.f3101l = z4;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.j$b */
    /* loaded from: classes.dex */
    public static class C0910b extends AbstractC0917f {

        /* renamed from: e */
        private Bitmap f3102e;

        /* renamed from: f */
        private IconCompat f3103f;

        /* renamed from: g */
        private boolean f3104g;

        /* renamed from: h */
        private CharSequence f3105h;

        /* renamed from: i */
        private boolean f3106i;

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.j$b$a */
        /* loaded from: classes.dex */
        private static class C0911a {
            /* renamed from: a */
            static void m39200a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m39199b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.j$b$b */
        /* loaded from: classes.dex */
        private static class C0912b {
            /* renamed from: a */
            static void m39198a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.j$b$c */
        /* loaded from: classes.dex */
        private static class C0913c {
            /* renamed from: a */
            static void m39197a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: b */
            static void m39196b(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // androidx.core.app.C0908j.AbstractC0917f
        /* renamed from: b */
        public void mo39165b(InterfaceC0907i interfaceC0907i) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(interfaceC0907i.mo39159a()).setBigContentTitle(this.f3157b).bigPicture(this.f3102e);
                if (this.f3104g) {
                    IconCompat iconCompat = this.f3103f;
                    if (iconCompat == null) {
                        C0911a.m39200a(bigPicture, null);
                    } else if (i >= 23) {
                        C0912b.m39198a(bigPicture, this.f3103f.m38892r(interfaceC0907i instanceof C0918k ? ((C0918k) interfaceC0907i).m39154f() : null));
                    } else if (iconCompat.m38898l() == 1) {
                        C0911a.m39200a(bigPicture, this.f3103f.m38901i());
                    } else {
                        C0911a.m39200a(bigPicture, null);
                    }
                }
                if (this.f3159d) {
                    C0911a.m39199b(bigPicture, this.f3158c);
                }
                if (i >= 31) {
                    C0913c.m39196b(bigPicture, this.f3106i);
                    C0913c.m39197a(bigPicture, this.f3105h);
                }
            }
        }

        @Override // androidx.core.app.C0908j.AbstractC0917f
        /* renamed from: c */
        protected String mo39164c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public C0910b m39202h(Bitmap bitmap) {
            this.f3103f = bitmap == null ? null : IconCompat.m38905e(bitmap);
            this.f3104g = true;
            return this;
        }

        /* renamed from: i */
        public C0910b m39201i(Bitmap bitmap) {
            this.f3102e = bitmap;
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.j$c */
    /* loaded from: classes.dex */
    public static class C0914c extends AbstractC0917f {

        /* renamed from: e */
        private CharSequence f3107e;

        @Override // androidx.core.app.C0908j.AbstractC0917f
        /* renamed from: a */
        public void mo39166a(Bundle bundle) {
            super.mo39166a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f3107e);
            }
        }

        @Override // androidx.core.app.C0908j.AbstractC0917f
        /* renamed from: b */
        public void mo39165b(InterfaceC0907i interfaceC0907i) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC0907i.mo39159a()).setBigContentTitle(this.f3157b).bigText(this.f3107e);
                if (this.f3159d) {
                    bigText.setSummaryText(this.f3158c);
                }
            }
        }

        @Override // androidx.core.app.C0908j.AbstractC0917f
        /* renamed from: c */
        protected String mo39164c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C0914c m39195h(CharSequence charSequence) {
            this.f3107e = C0916e.m39189d(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.j$d */
    /* loaded from: classes.dex */
    public static final class C0915d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m39194a(C0915d c0915d) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.j$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0917f {

        /* renamed from: a */
        protected C0916e f3156a;

        /* renamed from: b */
        CharSequence f3157b;

        /* renamed from: c */
        CharSequence f3158c;

        /* renamed from: d */
        boolean f3159d = false;

        /* renamed from: a */
        public void mo39166a(Bundle bundle) {
            if (this.f3159d) {
                bundle.putCharSequence("android.summaryText", this.f3158c);
            }
            CharSequence charSequence = this.f3157b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo39164c = mo39164c();
            if (mo39164c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo39164c);
            }
        }

        /* renamed from: b */
        public abstract void mo39165b(InterfaceC0907i interfaceC0907i);

        /* renamed from: c */
        protected abstract String mo39164c();

        /* renamed from: d */
        public RemoteViews m39163d(InterfaceC0907i interfaceC0907i) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m39162e(InterfaceC0907i interfaceC0907i) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m39161f(InterfaceC0907i interfaceC0907i) {
            return null;
        }

        /* renamed from: g */
        public void m39160g(C0916e c0916e) {
            if (this.f3156a != c0916e) {
                this.f3156a = c0916e;
                if (c0916e != null) {
                    c0916e.m39170w(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m39214a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0919l.m39149c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.j$e */
    /* loaded from: classes.dex */
    public static class C0916e {

        /* renamed from: A */
        boolean f3108A;

        /* renamed from: B */
        boolean f3109B;

        /* renamed from: C */
        String f3110C;

        /* renamed from: D */
        Bundle f3111D;

        /* renamed from: E */
        int f3112E;

        /* renamed from: F */
        int f3113F;

        /* renamed from: G */
        Notification f3114G;

        /* renamed from: H */
        RemoteViews f3115H;

        /* renamed from: I */
        RemoteViews f3116I;

        /* renamed from: J */
        RemoteViews f3117J;

        /* renamed from: K */
        String f3118K;

        /* renamed from: L */
        int f3119L;

        /* renamed from: M */
        String f3120M;

        /* renamed from: N */
        long f3121N;

        /* renamed from: O */
        int f3122O;

        /* renamed from: P */
        int f3123P;

        /* renamed from: Q */
        boolean f3124Q;

        /* renamed from: R */
        C0915d f3125R;

        /* renamed from: S */
        Notification f3126S;

        /* renamed from: T */
        boolean f3127T;

        /* renamed from: U */
        Icon f3128U;
        @Deprecated

        /* renamed from: V */
        public ArrayList<String> f3129V;

        /* renamed from: a */
        public Context f3130a;

        /* renamed from: b */
        public ArrayList<C0909a> f3131b;

        /* renamed from: c */
        public ArrayList<C0920m> f3132c;

        /* renamed from: d */
        ArrayList<C0909a> f3133d;

        /* renamed from: e */
        CharSequence f3134e;

        /* renamed from: f */
        CharSequence f3135f;

        /* renamed from: g */
        PendingIntent f3136g;

        /* renamed from: h */
        PendingIntent f3137h;

        /* renamed from: i */
        RemoteViews f3138i;

        /* renamed from: j */
        Bitmap f3139j;

        /* renamed from: k */
        CharSequence f3140k;

        /* renamed from: l */
        int f3141l;

        /* renamed from: m */
        int f3142m;

        /* renamed from: n */
        boolean f3143n;

        /* renamed from: o */
        boolean f3144o;

        /* renamed from: p */
        AbstractC0917f f3145p;

        /* renamed from: q */
        CharSequence f3146q;

        /* renamed from: r */
        CharSequence f3147r;

        /* renamed from: s */
        CharSequence[] f3148s;

        /* renamed from: t */
        int f3149t;

        /* renamed from: u */
        int f3150u;

        /* renamed from: v */
        boolean f3151v;

        /* renamed from: w */
        String f3152w;

        /* renamed from: x */
        boolean f3153x;

        /* renamed from: y */
        String f3154y;

        /* renamed from: z */
        boolean f3155z;

        public C0916e(Context context, String str) {
            this.f3131b = new ArrayList<>();
            this.f3132c = new ArrayList<>();
            this.f3133d = new ArrayList<>();
            this.f3143n = true;
            this.f3155z = false;
            this.f3112E = 0;
            this.f3113F = 0;
            this.f3119L = 0;
            this.f3122O = 0;
            this.f3123P = 0;
            Notification notification = new Notification();
            this.f3126S = notification;
            this.f3130a = context;
            this.f3118K = str;
            notification.when = System.currentTimeMillis();
            this.f3126S.audioStreamType = -1;
            this.f3142m = 0;
            this.f3129V = new ArrayList<>();
            this.f3124Q = true;
        }

        /* renamed from: d */
        protected static CharSequence m39189d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: e */
        private Bitmap m39188e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f3130a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C5815b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C5815b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        /* renamed from: n */
        private void m39179n(int i, boolean z) {
            if (z) {
                Notification notification = this.f3126S;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f3126S;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: A */
        public C0916e m39193A(long j) {
            this.f3126S.when = j;
            return this;
        }

        /* renamed from: a */
        public C0916e m39192a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3131b.add(new C0909a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification m39191b() {
            return new C0918k(this).m39157c();
        }

        /* renamed from: c */
        public Bundle m39190c() {
            if (this.f3111D == null) {
                this.f3111D = new Bundle();
            }
            return this.f3111D;
        }

        /* renamed from: f */
        public C0916e m39187f(boolean z) {
            m39179n(16, z);
            return this;
        }

        /* renamed from: g */
        public C0916e m39186g(String str) {
            this.f3118K = str;
            return this;
        }

        /* renamed from: h */
        public C0916e m39185h(int i) {
            this.f3112E = i;
            return this;
        }

        /* renamed from: i */
        public C0916e m39184i(PendingIntent pendingIntent) {
            this.f3136g = pendingIntent;
            return this;
        }

        /* renamed from: j */
        public C0916e m39183j(CharSequence charSequence) {
            this.f3135f = m39189d(charSequence);
            return this;
        }

        /* renamed from: k */
        public C0916e m39182k(CharSequence charSequence) {
            this.f3134e = m39189d(charSequence);
            return this;
        }

        /* renamed from: l */
        public C0916e m39181l(int i) {
            Notification notification = this.f3126S;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: m */
        public C0916e m39180m(PendingIntent pendingIntent) {
            this.f3126S.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: o */
        public C0916e m39178o(Bitmap bitmap) {
            this.f3139j = m39188e(bitmap);
            return this;
        }

        /* renamed from: p */
        public C0916e m39177p(int i, int i2, int i3) {
            Notification notification = this.f3126S;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* renamed from: q */
        public C0916e m39176q(boolean z) {
            this.f3155z = z;
            return this;
        }

        /* renamed from: r */
        public C0916e m39175r(int i) {
            this.f3141l = i;
            return this;
        }

        /* renamed from: s */
        public C0916e m39174s(int i) {
            this.f3142m = i;
            return this;
        }

        /* renamed from: t */
        public C0916e m39173t(boolean z) {
            this.f3143n = z;
            return this;
        }

        /* renamed from: u */
        public C0916e m39172u(int i) {
            this.f3126S.icon = i;
            return this;
        }

        /* renamed from: v */
        public C0916e m39171v(Uri uri) {
            Notification notification = this.f3126S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: w */
        public C0916e m39170w(AbstractC0917f abstractC0917f) {
            if (this.f3145p != abstractC0917f) {
                this.f3145p = abstractC0917f;
                if (abstractC0917f != null) {
                    abstractC0917f.m39160g(this);
                }
            }
            return this;
        }

        /* renamed from: x */
        public C0916e m39169x(CharSequence charSequence) {
            this.f3126S.tickerText = m39189d(charSequence);
            return this;
        }

        /* renamed from: y */
        public C0916e m39168y(long[] jArr) {
            this.f3126S.vibrate = jArr;
            return this;
        }

        /* renamed from: z */
        public C0916e m39167z(int i) {
            this.f3113F = i;
            return this;
        }

        @Deprecated
        public C0916e(Context context) {
            this(context, null);
        }
    }
}
