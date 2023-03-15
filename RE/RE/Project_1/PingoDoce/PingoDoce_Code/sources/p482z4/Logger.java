package p482z4;

import android.util.Log;
import com.facebook.C2290b;
import com.facebook.EnumC2305f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import sd.StringsJVM;

/* renamed from: z4.k */
/* loaded from: classes.dex */
public final class Logger {

    /* renamed from: a */
    private final EnumC2305f f34693a;

    /* renamed from: b */
    private final String f34694b;

    /* renamed from: c */
    private StringBuilder f34695c;

    /* renamed from: d */
    private int f34696d;

    /* renamed from: f */
    public static final C13648a f34697f = new C13648a(null);

    /* renamed from: e */
    private static final HashMap f34698e = new HashMap();

    /* compiled from: Logger.kt */
    /* renamed from: z4.k$a */
    /* loaded from: classes.dex */
    public static final class C13648a {
        private C13648a() {
        }

        /* renamed from: g */
        private final synchronized String m698g(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : Logger.m712a().entrySet()) {
                str2 = StringsJVM.m8935y(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }

        /* renamed from: a */
        public final void m704a(EnumC2305f enumC2305f, int i, String str, String str2) {
            boolean m8948C;
            Intrinsics.isThisObjectNull(enumC2305f, "behavior");
            Intrinsics.isThisObjectNull(str, "tag");
            Intrinsics.isThisObjectNull(str2, "string");
            if (C2290b.m34093v(enumC2305f)) {
                String m698g = m698g(str2);
                m8948C = StringsJVM.m8948C(str, "FacebookSDK.", false, 2, null);
                if (!m8948C) {
                    str = "FacebookSDK." + str;
                }
                Log.println(i, str, m698g);
                if (enumC2305f == EnumC2305f.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void m703b(EnumC2305f enumC2305f, int i, String str, String str2, Object... objArr) {
            Intrinsics.isThisObjectNull(enumC2305f, "behavior");
            Intrinsics.isThisObjectNull(str, "tag");
            Intrinsics.isThisObjectNull(str2, "format");
            Intrinsics.isThisObjectNull(objArr, "args");
            if (C2290b.m34093v(enumC2305f)) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                m704a(enumC2305f, i, str, format);
            }
        }

        /* renamed from: c */
        public final void m702c(EnumC2305f enumC2305f, String str, String str2) {
            Intrinsics.isThisObjectNull(enumC2305f, "behavior");
            Intrinsics.isThisObjectNull(str, "tag");
            Intrinsics.isThisObjectNull(str2, "string");
            m704a(enumC2305f, 3, str, str2);
        }

        /* renamed from: d */
        public final void m701d(EnumC2305f enumC2305f, String str, String str2, Object... objArr) {
            Intrinsics.isThisObjectNull(enumC2305f, "behavior");
            Intrinsics.isThisObjectNull(str, "tag");
            Intrinsics.isThisObjectNull(str2, "format");
            Intrinsics.isThisObjectNull(objArr, "args");
            if (C2290b.m34093v(enumC2305f)) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                m704a(enumC2305f, 3, str, format);
            }
        }

        /* renamed from: e */
        public final synchronized void m700e(String str) {
            Intrinsics.isThisObjectNull(str, "accessToken");
            if (!C2290b.m34093v(EnumC2305f.INCLUDE_ACCESS_TOKENS)) {
                m699f(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        /* renamed from: f */
        public final synchronized void m699f(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "original");
            Intrinsics.isThisObjectNull(str2, "replace");
            Logger.m712a().put(str, str2);
        }

        public /* synthetic */ C13648a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Logger(EnumC2305f enumC2305f, String str) {
        Intrinsics.isThisObjectNull(enumC2305f, "behavior");
        Intrinsics.isThisObjectNull(str, "tag");
        this.f34696d = 3;
        Validate.m670h(str, "tag");
        this.f34693a = enumC2305f;
        this.f34694b = "FacebookSDK." + str;
        this.f34695c = new StringBuilder();
    }

    /* renamed from: a */
    public static final /* synthetic */ HashMap m712a() {
        return f34698e;
    }

    /* renamed from: f */
    public static final void m707f(EnumC2305f enumC2305f, String str, String str2) {
        f34697f.m702c(enumC2305f, str, str2);
    }

    /* renamed from: h */
    private final boolean m705h() {
        return C2290b.m34093v(this.f34693a);
    }

    /* renamed from: b */
    public final void m711b(String str) {
        Intrinsics.isThisObjectNull(str, "string");
        if (m705h()) {
            this.f34695c.append(str);
        }
    }

    /* renamed from: c */
    public final void m710c(String str, Object... objArr) {
        Intrinsics.isThisObjectNull(str, "format");
        Intrinsics.isThisObjectNull(objArr, "args");
        if (m705h()) {
            StringBuilder sb2 = this.f34695c;
            C6429c0 c6429c0 = C6429c0.f17515a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            sb2.append(format);
        }
    }

    /* renamed from: d */
    public final void m709d(String str, Object obj) {
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(obj, "value");
        m710c("  %s:\t%s\n", str, obj);
    }

    /* renamed from: e */
    public final void m708e() {
        String sb2 = this.f34695c.toString();
        Intrinsics.checkIfNull(sb2, "contents.toString()");
        m706g(sb2);
        this.f34695c = new StringBuilder();
    }

    /* renamed from: g */
    public final void m706g(String str) {
        Intrinsics.isThisObjectNull(str, "string");
        f34697f.m704a(this.f34693a, this.f34696d, this.f34694b, str);
    }
}
