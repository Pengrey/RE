package p294p9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* renamed from: p9.j */
/* loaded from: classes.dex */
final class C8540j extends AbstractC8472a0.AbstractC8482e.AbstractC8487c {

    /* renamed from: a */
    private final int f22053a;

    /* renamed from: b */
    private final String f22054b;

    /* renamed from: c */
    private final int f22055c;

    /* renamed from: d */
    private final long f22056d;

    /* renamed from: e */
    private final long f22057e;

    /* renamed from: f */
    private final boolean f22058f;

    /* renamed from: g */
    private final int f22059g;

    /* renamed from: h */
    private final String f22060h;

    /* renamed from: i */
    private final String f22061i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    /* renamed from: p9.j$b */
    /* loaded from: classes.dex */
    public static final class C8542b extends AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a {

        /* renamed from: a */
        private Integer f22062a;

        /* renamed from: b */
        private String f22063b;

        /* renamed from: c */
        private Integer f22064c;

        /* renamed from: d */
        private Long f22065d;

        /* renamed from: e */
        private Long f22066e;

        /* renamed from: f */
        private Boolean f22067f;

        /* renamed from: g */
        private Integer f22068g;

        /* renamed from: h */
        private String f22069h;

        /* renamed from: i */
        private String f22070i;

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: a */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c mo15231a() {
            Integer num = this.f22062a;
            String str = BuildConfig.VERSION_NAME;
            if (num == null) {
                str = BuildConfig.VERSION_NAME + " arch";
            }
            if (this.f22063b == null) {
                str = str + " model";
            }
            if (this.f22064c == null) {
                str = str + " cores";
            }
            if (this.f22065d == null) {
                str = str + " ram";
            }
            if (this.f22066e == null) {
                str = str + " diskSpace";
            }
            if (this.f22067f == null) {
                str = str + " simulator";
            }
            if (this.f22068g == null) {
                str = str + " state";
            }
            if (this.f22069h == null) {
                str = str + " manufacturer";
            }
            if (this.f22070i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C8540j(this.f22062a.intValue(), this.f22063b, this.f22064c.intValue(), this.f22065d.longValue(), this.f22066e.longValue(), this.f22067f.booleanValue(), this.f22068g.intValue(), this.f22069h, this.f22070i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: b */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15230b(int i) {
            this.f22062a = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: c */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15229c(int i) {
            this.f22064c = Integer.valueOf(i);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: d */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15228d(long j) {
            this.f22066e = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: e */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15227e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f22069h = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: f */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15226f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f22063b = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: g */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15225g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f22070i = str;
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: h */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15224h(long j) {
            this.f22065d = Long.valueOf(j);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: i */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15223i(boolean z) {
            this.f22067f = Boolean.valueOf(z);
            return this;
        }

        @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a
        /* renamed from: j */
        public AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a mo15222j(int i) {
            this.f22068g = Integer.valueOf(i);
            return this;
        }
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: b */
    public int mo15240b() {
        return this.f22053a;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: c */
    public int mo15239c() {
        return this.f22055c;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: d */
    public long mo15238d() {
        return this.f22057e;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: e */
    public String mo15237e() {
        return this.f22060h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8487c) {
            AbstractC8472a0.AbstractC8482e.AbstractC8487c abstractC8487c = (AbstractC8472a0.AbstractC8482e.AbstractC8487c) obj;
            return this.f22053a == abstractC8487c.mo15240b() && this.f22054b.equals(abstractC8487c.mo15236f()) && this.f22055c == abstractC8487c.mo15239c() && this.f22056d == abstractC8487c.mo15234h() && this.f22057e == abstractC8487c.mo15238d() && this.f22058f == abstractC8487c.mo15232j() && this.f22059g == abstractC8487c.mo15233i() && this.f22060h.equals(abstractC8487c.mo15237e()) && this.f22061i.equals(abstractC8487c.mo15235g());
        }
        return false;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: f */
    public String mo15236f() {
        return this.f22054b;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: g */
    public String mo15235g() {
        return this.f22061i;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: h */
    public long mo15234h() {
        return this.f22056d;
    }

    public int hashCode() {
        long j = this.f22056d;
        long j2 = this.f22057e;
        return ((((((((((((((((this.f22053a ^ 1000003) * 1000003) ^ this.f22054b.hashCode()) * 1000003) ^ this.f22055c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f22058f ? 1231 : 1237)) * 1000003) ^ this.f22059g) * 1000003) ^ this.f22060h.hashCode()) * 1000003) ^ this.f22061i.hashCode();
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: i */
    public int mo15233i() {
        return this.f22059g;
    }

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8487c
    /* renamed from: j */
    public boolean mo15232j() {
        return this.f22058f;
    }

    public String toString() {
        return "Device{arch=" + this.f22053a + ", model=" + this.f22054b + ", cores=" + this.f22055c + ", ram=" + this.f22056d + ", diskSpace=" + this.f22057e + ", simulator=" + this.f22058f + ", state=" + this.f22059g + ", manufacturer=" + this.f22060h + ", modelClass=" + this.f22061i + "}";
    }

    private C8540j(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f22053a = i;
        this.f22054b = str;
        this.f22055c = i2;
        this.f22056d = j;
        this.f22057e = j2;
        this.f22058f = z;
        this.f22059g = i3;
        this.f22060h = str2;
        this.f22061i = str3;
    }
}
