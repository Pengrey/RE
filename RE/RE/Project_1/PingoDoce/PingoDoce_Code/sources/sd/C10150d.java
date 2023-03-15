package sd;

import java.nio.charset.Charset;
import p181jd.Intrinsics;

/* renamed from: sd.d */
/* loaded from: classes2.dex */
public final class C10150d {

    /* renamed from: a */
    public static final C10150d f26471a = new C10150d();

    /* renamed from: b */
    public static final Charset f26472b;

    /* renamed from: c */
    private static Charset f26473c;

    /* renamed from: d */
    private static Charset f26474d;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkIfNull(forName, "forName(\"UTF-8\")");
        f26472b = forName;
        Intrinsics.checkIfNull(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        Intrinsics.checkIfNull(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        Intrinsics.checkIfNull(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Intrinsics.checkIfNull(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        Intrinsics.checkIfNull(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }

    private C10150d() {
    }

    /* renamed from: a */
    public final Charset m9038a() {
        Charset charset = f26474d;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            Intrinsics.checkIfNull(forName, "forName(\"UTF-32BE\")");
            f26474d = forName;
            return forName;
        }
        return charset;
    }

    /* renamed from: b */
    public final Charset m9037b() {
        Charset charset = f26473c;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            Intrinsics.checkIfNull(forName, "forName(\"UTF-32LE\")");
            f26473c = forName;
            return forName;
        }
        return charset;
    }
}
