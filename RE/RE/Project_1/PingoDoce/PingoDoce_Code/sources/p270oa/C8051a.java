package p270oa;

import com.github.aachartmodel.aainfographics.BuildConfig;
import p309q7.InterfaceC9689q;
import p309q7.InterfaceC9691s;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: oa.a */
/* loaded from: classes.dex */
public final class C8051a {

    /* renamed from: a */
    private final long f20810a;

    /* renamed from: b */
    private final String f20811b;

    /* renamed from: c */
    private final String f20812c;

    /* renamed from: d */
    private final EnumC8054c f20813d;

    /* renamed from: e */
    private final EnumC8055d f20814e;

    /* renamed from: f */
    private final String f20815f;

    /* renamed from: g */
    private final String f20816g;

    /* renamed from: h */
    private final int f20817h;

    /* renamed from: i */
    private final int f20818i;

    /* renamed from: j */
    private final String f20819j;

    /* renamed from: k */
    private final long f20820k;

    /* renamed from: l */
    private final EnumC8053b f20821l;

    /* renamed from: m */
    private final String f20822m;

    /* renamed from: n */
    private final long f20823n;

    /* renamed from: o */
    private final String f20824o;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: oa.a$a */
    /* loaded from: classes.dex */
    public static final class C8052a {

        /* renamed from: a */
        private long f20825a = 0;

        /* renamed from: b */
        private String f20826b = BuildConfig.VERSION_NAME;

        /* renamed from: c */
        private String f20827c = BuildConfig.VERSION_NAME;

        /* renamed from: d */
        private EnumC8054c f20828d = EnumC8054c.UNKNOWN;

        /* renamed from: e */
        private EnumC8055d f20829e = EnumC8055d.UNKNOWN_OS;

        /* renamed from: f */
        private String f20830f = BuildConfig.VERSION_NAME;

        /* renamed from: g */
        private String f20831g = BuildConfig.VERSION_NAME;

        /* renamed from: h */
        private int f20832h = 0;

        /* renamed from: i */
        private int f20833i = 0;

        /* renamed from: j */
        private String f20834j = BuildConfig.VERSION_NAME;

        /* renamed from: k */
        private long f20835k = 0;

        /* renamed from: l */
        private EnumC8053b f20836l = EnumC8053b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f20837m = BuildConfig.VERSION_NAME;

        /* renamed from: n */
        private long f20838n = 0;

        /* renamed from: o */
        private String f20839o = BuildConfig.VERSION_NAME;

        C8052a() {
        }

        /* renamed from: a */
        public C8051a m17043a() {
            return new C8051a(this.f20825a, this.f20826b, this.f20827c, this.f20828d, this.f20829e, this.f20830f, this.f20831g, this.f20832h, this.f20833i, this.f20834j, this.f20835k, this.f20836l, this.f20837m, this.f20838n, this.f20839o);
        }

        /* renamed from: b */
        public C8052a m17042b(String str) {
            this.f20837m = str;
            return this;
        }

        /* renamed from: c */
        public C8052a m17041c(String str) {
            this.f20831g = str;
            return this;
        }

        /* renamed from: d */
        public C8052a m17040d(String str) {
            this.f20839o = str;
            return this;
        }

        /* renamed from: e */
        public C8052a m17039e(EnumC8053b enumC8053b) {
            this.f20836l = enumC8053b;
            return this;
        }

        /* renamed from: f */
        public C8052a m17038f(String str) {
            this.f20827c = str;
            return this;
        }

        /* renamed from: g */
        public C8052a m17037g(String str) {
            this.f20826b = str;
            return this;
        }

        /* renamed from: h */
        public C8052a m17036h(EnumC8054c enumC8054c) {
            this.f20828d = enumC8054c;
            return this;
        }

        /* renamed from: i */
        public C8052a m17035i(String str) {
            this.f20830f = str;
            return this;
        }

        /* renamed from: j */
        public C8052a m17034j(long j) {
            this.f20825a = j;
            return this;
        }

        /* renamed from: k */
        public C8052a m17033k(EnumC8055d enumC8055d) {
            this.f20829e = enumC8055d;
            return this;
        }

        /* renamed from: l */
        public C8052a m17032l(String str) {
            this.f20834j = str;
            return this;
        }

        /* renamed from: m */
        public C8052a m17031m(int i) {
            this.f20833i = i;
            return this;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: oa.a$b */
    /* loaded from: classes.dex */
    public enum EnumC8053b implements InterfaceC9689q {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        EnumC8053b(int i) {
            this.number_ = i;
        }

        @Override // p309q7.InterfaceC9689q
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: oa.a$c */
    /* loaded from: classes.dex */
    public enum EnumC8054c implements InterfaceC9689q {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        EnumC8054c(int i) {
            this.number_ = i;
        }

        @Override // p309q7.InterfaceC9689q
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: oa.a$d */
    /* loaded from: classes.dex */
    public enum EnumC8055d implements InterfaceC9689q {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        EnumC8055d(int i) {
            this.number_ = i;
        }

        @Override // p309q7.InterfaceC9689q
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        new C8052a().m17043a();
    }

    C8051a(long j, String str, String str2, EnumC8054c enumC8054c, EnumC8055d enumC8055d, String str3, String str4, int i, int i2, String str5, long j2, EnumC8053b enumC8053b, String str6, long j3, String str7) {
        this.f20810a = j;
        this.f20811b = str;
        this.f20812c = str2;
        this.f20813d = enumC8054c;
        this.f20814e = enumC8055d;
        this.f20815f = str3;
        this.f20816g = str4;
        this.f20817h = i;
        this.f20818i = i2;
        this.f20819j = str5;
        this.f20820k = j2;
        this.f20821l = enumC8053b;
        this.f20822m = str6;
        this.f20823n = j3;
        this.f20824o = str7;
    }

    /* renamed from: p */
    public static C8052a m17044p() {
        return new C8052a();
    }

    @InterfaceC9691s(zza = 13)
    /* renamed from: a */
    public String m17059a() {
        return this.f20822m;
    }

    @InterfaceC9691s(zza = 11)
    /* renamed from: b */
    public long m17058b() {
        return this.f20820k;
    }

    @InterfaceC9691s(zza = 14)
    /* renamed from: c */
    public long m17057c() {
        return this.f20823n;
    }

    @InterfaceC9691s(zza = 7)
    /* renamed from: d */
    public String m17056d() {
        return this.f20816g;
    }

    @InterfaceC9691s(zza = 15)
    /* renamed from: e */
    public String m17055e() {
        return this.f20824o;
    }

    @InterfaceC9691s(zza = 12)
    /* renamed from: f */
    public EnumC8053b m17054f() {
        return this.f20821l;
    }

    @InterfaceC9691s(zza = 3)
    /* renamed from: g */
    public String m17053g() {
        return this.f20812c;
    }

    @InterfaceC9691s(zza = 2)
    /* renamed from: h */
    public String m17052h() {
        return this.f20811b;
    }

    @InterfaceC9691s(zza = 4)
    /* renamed from: i */
    public EnumC8054c m17051i() {
        return this.f20813d;
    }

    @InterfaceC9691s(zza = 6)
    /* renamed from: j */
    public String m17050j() {
        return this.f20815f;
    }

    @InterfaceC9691s(zza = 8)
    /* renamed from: k */
    public int m17049k() {
        return this.f20817h;
    }

    @InterfaceC9691s(zza = 1)
    /* renamed from: l */
    public long m17048l() {
        return this.f20810a;
    }

    @InterfaceC9691s(zza = 5)
    /* renamed from: m */
    public EnumC8055d m17047m() {
        return this.f20814e;
    }

    @InterfaceC9691s(zza = 10)
    /* renamed from: n */
    public String m17046n() {
        return this.f20819j;
    }

    @InterfaceC9691s(zza = 9)
    /* renamed from: o */
    public int m17045o() {
        return this.f20818i;
    }
}
