package p107ff;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import sd.C10171u;

/* renamed from: ff.d */
/* loaded from: classes2.dex */
public final class CacheControl {

    /* renamed from: n */
    public static final C5467b f15394n = new C5467b(null);

    /* renamed from: o */
    public static final CacheControl f15395o = new C5466a().m24218d().m24221a();

    /* renamed from: p */
    public static final CacheControl f15396p = new C5466a().m24216f().m24219c(Reader.READ_DONE, TimeUnit.SECONDS).m24221a();

    /* renamed from: a */
    private final boolean f15397a;

    /* renamed from: b */
    private final boolean f15398b;

    /* renamed from: c */
    private final int f15399c;

    /* renamed from: d */
    private final int f15400d;

    /* renamed from: e */
    private final boolean f15401e;

    /* renamed from: f */
    private final boolean f15402f;

    /* renamed from: g */
    private final boolean f15403g;

    /* renamed from: h */
    private final int f15404h;

    /* renamed from: i */
    private final int f15405i;

    /* renamed from: j */
    private final boolean f15406j;

    /* renamed from: k */
    private final boolean f15407k;

    /* renamed from: l */
    private final boolean f15408l;

    /* renamed from: m */
    private String f15409m;

    /* compiled from: CacheControl.kt */
    /* renamed from: ff.d$a */
    /* loaded from: classes2.dex */
    public static final class C5466a {

        /* renamed from: a */
        private boolean f15410a;

        /* renamed from: b */
        private boolean f15411b;

        /* renamed from: c */
        private int f15412c = -1;

        /* renamed from: d */
        private int f15413d = -1;

        /* renamed from: e */
        private int f15414e = -1;

        /* renamed from: f */
        private boolean f15415f;

        /* renamed from: g */
        private boolean f15416g;

        /* renamed from: h */
        private boolean f15417h;

        /* renamed from: b */
        private final int m24220b(long j) {
            return j > 2147483647L ? Reader.READ_DONE : (int) j;
        }

        /* renamed from: a */
        public final CacheControl m24221a() {
            return new CacheControl(this.f15410a, this.f15411b, this.f15412c, -1, false, false, false, this.f15413d, this.f15414e, this.f15415f, this.f15416g, this.f15417h, null, null);
        }

        /* renamed from: c */
        public final C5466a m24219c(int i, TimeUnit timeUnit) {
            Intrinsics.isThisObjectNull(timeUnit, "timeUnit");
            if (i >= 0) {
                this.f15413d = m24220b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("maxStale < 0: ", Integer.valueOf(i)).toString());
        }

        /* renamed from: d */
        public final C5466a m24218d() {
            this.f15410a = true;
            return this;
        }

        /* renamed from: e */
        public final C5466a m24217e() {
            this.f15411b = true;
            return this;
        }

        /* renamed from: f */
        public final C5466a m24216f() {
            this.f15415f = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    /* renamed from: ff.d$b */
    /* loaded from: classes2.dex */
    public static final class C5467b {
        private C5467b() {
        }

        public /* synthetic */ C5467b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m24215a(String str, String str2, int i) {
            boolean m8924G;
            int length = str.length();
            while (i < length) {
                int i2 = i + 1;
                m8924G = C10171u.m8924G(str2, str.charAt(i), false, 2, null);
                if (m8924G) {
                    return i;
                }
                i = i2;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p107ff.CacheControl m24214b(p107ff.Headers r31) {
            /*
                Method dump skipped, instructions count: 398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.CacheControl.C5467b.m24214b(ff.u):ff.d");
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f15397a = z;
        this.f15398b = z2;
        this.f15399c = i;
        this.f15400d = i2;
        this.f15401e = z3;
        this.f15402f = z4;
        this.f15403g = z5;
        this.f15404h = i3;
        this.f15405i = i4;
        this.f15406j = z6;
        this.f15407k = z7;
        this.f15408l = z8;
        this.f15409m = str;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    /* renamed from: a */
    public final boolean m24233a() {
        return this.f15408l;
    }

    /* renamed from: b */
    public final boolean m24232b() {
        return this.f15401e;
    }

    /* renamed from: c */
    public final boolean m24231c() {
        return this.f15402f;
    }

    /* renamed from: d */
    public final int m24230d() {
        return this.f15399c;
    }

    /* renamed from: e */
    public final int m24229e() {
        return this.f15404h;
    }

    /* renamed from: f */
    public final int m24228f() {
        return this.f15405i;
    }

    /* renamed from: g */
    public final boolean m24227g() {
        return this.f15403g;
    }

    /* renamed from: h */
    public final boolean m24226h() {
        return this.f15397a;
    }

    /* renamed from: i */
    public final boolean m24225i() {
        return this.f15398b;
    }

    /* renamed from: j */
    public final boolean m24224j() {
        return this.f15407k;
    }

    /* renamed from: k */
    public final boolean m24223k() {
        return this.f15406j;
    }

    /* renamed from: l */
    public final int m24222l() {
        return this.f15400d;
    }

    public String toString() {
        String str = this.f15409m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (m24226h()) {
                sb2.append("no-cache, ");
            }
            if (m24225i()) {
                sb2.append("no-store, ");
            }
            if (m24230d() != -1) {
                sb2.append("max-age=");
                sb2.append(m24230d());
                sb2.append(", ");
            }
            if (m24222l() != -1) {
                sb2.append("s-maxage=");
                sb2.append(m24222l());
                sb2.append(", ");
            }
            if (m24232b()) {
                sb2.append("private, ");
            }
            if (m24231c()) {
                sb2.append("public, ");
            }
            if (m24227g()) {
                sb2.append("must-revalidate, ");
            }
            if (m24229e() != -1) {
                sb2.append("max-stale=");
                sb2.append(m24229e());
                sb2.append(", ");
            }
            if (m24228f() != -1) {
                sb2.append("min-fresh=");
                sb2.append(m24228f());
                sb2.append(", ");
            }
            if (m24223k()) {
                sb2.append("only-if-cached, ");
            }
            if (m24224j()) {
                sb2.append("no-transform, ");
            }
            if (m24233a()) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return BuildConfig.VERSION_NAME;
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f15409m = sb3;
            return sb3;
        }
        return str;
    }
}
