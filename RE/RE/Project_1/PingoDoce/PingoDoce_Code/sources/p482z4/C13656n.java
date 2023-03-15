package p482z4;

import com.facebook.C2290b;
import com.facebook.internal.Utility;
import java.util.Arrays;
import java.util.Collection;
import p181jd.C6429c0;
import p181jd.Intrinsics;

/* renamed from: z4.n */
/* loaded from: classes.dex */
public final class C13656n {

    /* renamed from: a */
    private static final Collection f34708a;

    /* renamed from: b */
    private static final Collection f34709b;

    static {
        new C13656n();
        Intrinsics.checkIfNull(C13656n.class.getName(), "ServerProtocol::class.java.name");
        f34708a = Utility.m33958Z("service_disabled", "AndroidAuthKillSwitchException");
        f34709b = Utility.m33958Z("access_denied", "OAuthAccessDeniedException");
    }

    private C13656n() {
    }

    /* renamed from: a */
    public static final String m680a() {
        return "v11.0";
    }

    /* renamed from: b */
    public static final String m679b() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C2290b.m34101n()}, 1));
        Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: c */
    public static final String m678c() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{C2290b.m34101n()}, 1));
        Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
