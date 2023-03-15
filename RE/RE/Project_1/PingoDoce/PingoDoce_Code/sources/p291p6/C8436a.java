package p291p6;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C2426d;
import com.google.android.gms.common.api.C2461a;
import p217l7.C6997f;
import p217l7.C6999h;
import p352s6.InterfaceC10073a;
import p379u6.C10845d;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: p6.a */
/* loaded from: classes.dex */
public final class C8436a {
    @RecentlyNonNull

    /* renamed from: a */
    public static final C2461a<C8437a> f21832a;
    @RecentlyNonNull

    /* renamed from: b */
    public static final C2461a<GoogleSignInOptions> f21833b;
    @RecentlyNonNull

    /* renamed from: c */
    public static final C2461a.C2471g<C6999h> f21834c;
    @RecentlyNonNull

    /* renamed from: d */
    public static final C2461a.C2471g<C2426d> f21835d;

    /* renamed from: e */
    private static final C2461a.AbstractC2462a<C6999h, C8437a> f21836e;

    /* renamed from: f */
    private static final C2461a.AbstractC2462a<C2426d, GoogleSignInOptions> f21837f;

    /* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
    @Deprecated
    /* renamed from: p6.a$a */
    /* loaded from: classes.dex */
    public static class C8437a implements C2461a.InterfaceC2465d {
        @RecentlyNonNull

        /* renamed from: z */
        public static final C8437a f21838z = new C8437a(new C8438a());

        /* renamed from: w */
        private final String f21839w = null;

        /* renamed from: x */
        private final boolean f21840x;

        /* renamed from: y */
        private final String f21841y;

        /* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
        @Deprecated
        /* renamed from: p6.a$a$a */
        /* loaded from: classes.dex */
        public static class C8438a {
            @RecentlyNonNull

            /* renamed from: a */
            protected Boolean f21842a;
            @RecentlyNullable

            /* renamed from: b */
            protected String f21843b;

            public C8438a() {
                this.f21842a = Boolean.FALSE;
            }

            @RecentlyNonNull
            /* renamed from: a */
            public final C8438a m15400a(@RecentlyNonNull String str) {
                this.f21843b = str;
                return this;
            }

            public C8438a(@RecentlyNonNull C8437a c8437a) {
                this.f21842a = Boolean.FALSE;
                String unused = c8437a.f21839w;
                this.f21842a = Boolean.valueOf(c8437a.f21840x);
                this.f21843b = c8437a.f21841y;
            }
        }

        public C8437a(@RecentlyNonNull C8438a c8438a) {
            this.f21840x = c8438a.f21842a.booleanValue();
            this.f21841y = c8438a.f21843b;
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final Bundle m15405a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f21840x);
            bundle.putString("log_session_id", this.f21841y);
            return bundle;
        }

        @RecentlyNullable
        /* renamed from: e */
        public final String m15402e() {
            return this.f21841y;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C8437a) {
                C8437a c8437a = (C8437a) obj;
                String str = c8437a.f21839w;
                return C13701c.m575a(null, null) && this.f21840x == c8437a.f21840x && C13701c.m575a(this.f21841y, c8437a.f21841y);
            }
            return false;
        }

        public int hashCode() {
            return C13701c.m574b(null, Boolean.valueOf(this.f21840x), this.f21841y);
        }
    }

    static {
        C2461a.C2471g<C6999h> c2471g = new C2461a.C2471g<>();
        f21834c = c2471g;
        C2461a.C2471g<C2426d> c2471g2 = new C2461a.C2471g<>();
        f21835d = c2471g2;
        C8441d c8441d = new C8441d();
        f21836e = c8441d;
        C8442e c8442e = new C8442e();
        f21837f = c8442e;
        C2461a<C8440c> c2461a = C8439b.f21846c;
        f21832a = new C2461a<>("Auth.CREDENTIALS_API", c8441d, c2471g);
        f21833b = new C2461a<>("Auth.GOOGLE_SIGN_IN_API", c8442e, c2471g2);
        InterfaceC10073a interfaceC10073a = C8439b.f21847d;
        new C6997f();
        new C10845d();
    }
}
