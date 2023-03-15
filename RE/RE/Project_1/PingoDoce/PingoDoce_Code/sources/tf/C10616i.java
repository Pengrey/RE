package tf;

import java.util.ArrayList;
import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.Path;
import p489zc.C13777q;

/* compiled from: -Path.kt */
/* renamed from: tf.i */
/* loaded from: classes2.dex */
public final class C10616i {

    /* renamed from: a */
    private static final ByteString f27356a;

    /* renamed from: b */
    private static final ByteString f27357b;

    /* renamed from: c */
    private static final ByteString f27358c;

    /* renamed from: d */
    private static final ByteString f27359d;

    /* renamed from: e */
    private static final ByteString f27360e;

    static {
        ByteString.C10188a c10188a = ByteString.f26546z;
        f27356a = c10188a.m8692d("/");
        f27357b = c10188a.m8692d("\\");
        f27358c = c10188a.m8692d("/\\");
        f27359d = c10188a.m8692d(".");
        f27360e = c10188a.m8692d("..");
    }

    /* renamed from: a */
    public static final /* synthetic */ ByteString m7506a() {
        return f27357b;
    }

    /* renamed from: b */
    public static final /* synthetic */ ByteString m7505b() {
        return f27359d;
    }

    /* renamed from: c */
    public static final /* synthetic */ ByteString m7504c() {
        return f27360e;
    }

    /* renamed from: d */
    public static final /* synthetic */ int m7503d(Path path) {
        return m7495l(path);
    }

    /* renamed from: e */
    public static final /* synthetic */ ByteString m7502e() {
        return f27356a;
    }

    /* renamed from: f */
    public static final /* synthetic */ ByteString m7501f(Path path) {
        return m7494m(path);
    }

    /* renamed from: g */
    public static final /* synthetic */ boolean m7500g(Path path) {
        return m7493n(path);
    }

    /* renamed from: h */
    public static final /* synthetic */ int m7499h(Path path) {
        return m7492o(path);
    }

    /* renamed from: i */
    public static final /* synthetic */ ByteString m7498i(String str) {
        return m7488s(str);
    }

    /* renamed from: j */
    public static final Path m7497j(Path path, Path path2, boolean z) {
        Intrinsics.isThisObjectNull(path, "<this>");
        Intrinsics.isThisObjectNull(path2, "child");
        if (path2.m8527f() || path2.m8518o() != null) {
            return path2;
        }
        ByteString m7494m = m7494m(path);
        if (m7494m == null && (m7494m = m7494m(path2)) == null) {
            m7494m = m7488s(Path.f26596y);
        }
        Buffer buffer = new Buffer();
        buffer.m8794q0(path.m8530c());
        if (buffer.size() > 0) {
            buffer.m8794q0(m7494m);
        }
        buffer.m8794q0(path2.m8530c());
        return m7490q(buffer, z);
    }

    /* renamed from: k */
    public static final Path m7496k(String str, boolean z) {
        Intrinsics.isThisObjectNull(str, "<this>");
        return m7490q(new Buffer().m8814I0(str), z);
    }

    /* renamed from: l */
    private static final int m7495l(Path path) {
        int m8701u = ByteString.m8701u(path.m8530c(), f27356a, 0, 2, null);
        return m8701u != -1 ? m8701u : ByteString.m8701u(path.m8530c(), f27357b, 0, 2, null);
    }

    /* renamed from: m */
    private static final ByteString m7494m(Path path) {
        ByteString m8530c = path.m8530c();
        ByteString byteString = f27356a;
        if (ByteString.m8706p(m8530c, byteString, 0, 2, null) != -1) {
            return byteString;
        }
        ByteString m8530c2 = path.m8530c();
        ByteString byteString2 = f27357b;
        if (ByteString.m8706p(m8530c2, byteString2, 0, 2, null) != -1) {
            return byteString2;
        }
        return null;
    }

    /* renamed from: n */
    private static final boolean m7493n(Path path) {
        return path.m8530c().m8715g(f27360e) && (path.m8530c().size() == 2 || path.m8530c().m8700v(path.m8530c().size() + (-3), f27356a, 0, 1) || path.m8530c().m8700v(path.m8530c().size() + (-3), f27357b, 0, 1));
    }

    /* renamed from: o */
    private static final int m7492o(Path path) {
        if (path.m8530c().size() == 0) {
            return -1;
        }
        boolean z = false;
        if (path.m8530c().m8714h(0) == ((byte) 47)) {
            return 1;
        }
        byte b = (byte) 92;
        if (path.m8530c().m8714h(0) == b) {
            if (path.m8530c().size() <= 2 || path.m8530c().m8714h(1) != b) {
                return 1;
            }
            int m8708n = path.m8530c().m8708n(f27357b, 2);
            return m8708n == -1 ? path.m8530c().size() : m8708n;
        } else if (path.m8530c().size() > 2 && path.m8530c().m8714h(1) == ((byte) 58) && path.m8530c().m8714h(2) == b) {
            char m8714h = (char) path.m8530c().m8714h(0);
            if ('a' <= m8714h && m8714h < '{') {
                return 3;
            }
            if ('A' <= m8714h && m8714h < '[') {
                z = true;
            }
            return !z ? -1 : 3;
        } else {
            return -1;
        }
    }

    /* renamed from: p */
    private static final boolean m7491p(Buffer buffer, ByteString byteString) {
        if (Intrinsics.equals(byteString, f27357b) && buffer.size() >= 2 && buffer.m8811L(1L) == ((byte) 58)) {
            char m8811L = (char) buffer.m8811L(0L);
            if (!('a' <= m8811L && m8811L < '{')) {
                if (!('A' <= m8811L && m8811L < '[')) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final Path m7490q(Buffer buffer, boolean z) {
        ByteString byteString;
        ByteString mo8748u;
        Intrinsics.isThisObjectNull(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString byteString2 = null;
        int i = 0;
        while (true) {
            if (!buffer.mo8749s(0L, f27356a)) {
                byteString = f27357b;
                if (!buffer.mo8749s(0L, byteString)) {
                    break;
                }
            }
            byte readByte = buffer.readByte();
            if (byteString2 == null) {
                byteString2 = m7489r(readByte);
            }
            i++;
        }
        boolean z2 = i >= 2 && Intrinsics.equals(byteString2, byteString);
        if (z2) {
            Intrinsics.ifNullDoSomething(byteString2);
            buffer2.m8794q0(byteString2);
            buffer2.m8794q0(byteString2);
        } else if (i > 0) {
            Intrinsics.ifNullDoSomething(byteString2);
            buffer2.m8794q0(byteString2);
        } else {
            long mo8761T = buffer.mo8761T(f27358c);
            if (byteString2 == null) {
                if (mo8761T == -1) {
                    byteString2 = m7488s(Path.f26596y);
                } else {
                    byteString2 = m7489r(buffer.m8811L(mo8761T));
                }
            }
            if (m7491p(buffer, byteString2)) {
                if (mo8761T == 2) {
                    buffer2.mo8688B(buffer, 3L);
                } else {
                    buffer2.mo8688B(buffer, 2L);
                }
            }
        }
        boolean z3 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.mo8762Q()) {
            long mo8761T2 = buffer.mo8761T(f27358c);
            if (mo8761T2 == -1) {
                mo8748u = buffer.mo8751r();
            } else {
                mo8748u = buffer.mo8748u(mo8761T2);
                buffer.readByte();
            }
            ByteString byteString3 = f27360e;
            if (Intrinsics.equals(mo8748u, byteString3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (z && (z3 || (!arrayList.isEmpty() && !Intrinsics.equals(C13777q.m249W(arrayList), byteString3)))) {
                        if (!z2 || arrayList.size() != 1) {
                            C13777q.m264B(arrayList);
                        }
                    } else {
                        arrayList.add(mo8748u);
                    }
                }
            } else if (!Intrinsics.equals(mo8748u, f27359d) && !Intrinsics.equals(mo8748u, ByteString.f26547A)) {
                arrayList.add(mo8748u);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                buffer2.m8794q0(byteString2);
            }
            buffer2.m8794q0((ByteString) arrayList.get(i2));
        }
        if (buffer2.size() == 0) {
            buffer2.m8794q0(f27359d);
        }
        return new Path(buffer2.mo8751r());
    }

    /* renamed from: r */
    private static final ByteString m7489r(byte b) {
        if (b == 47) {
            return f27356a;
        }
        if (b == 92) {
            return f27357b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b));
    }

    /* renamed from: s */
    private static final ByteString m7488s(String str) {
        if (Intrinsics.equals(str, "/")) {
            return f27356a;
        }
        if (Intrinsics.equals(str, "\\")) {
            return f27357b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
