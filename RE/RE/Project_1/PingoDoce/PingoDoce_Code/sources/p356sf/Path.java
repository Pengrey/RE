package p356sf;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p181jd.Intrinsics;
import tf.C10616i;

/* renamed from: sf.y */
/* loaded from: classes2.dex */
public final class Path implements Comparable {

    /* renamed from: x */
    public static final C10205a f26595x = new C10205a(null);

    /* renamed from: y */
    public static final String f26596y;

    /* renamed from: w */
    private final ByteString f26597w;

    /* compiled from: Path.kt */
    /* renamed from: sf.y$a */
    /* loaded from: classes2.dex */
    public static final class C10205a {
        private C10205a() {
        }

        public /* synthetic */ C10205a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ Path m8514d(C10205a c10205a, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c10205a.m8517a(file, z);
        }

        /* renamed from: e */
        public static /* synthetic */ Path m8513e(C10205a c10205a, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c10205a.m8516b(str, z);
        }

        /* renamed from: f */
        public static /* synthetic */ Path m8512f(C10205a c10205a, java.nio.file.Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c10205a.m8515c(path, z);
        }

        /* renamed from: a */
        public final Path m8517a(File file, boolean z) {
            Intrinsics.isThisObjectNull(file, "<this>");
            String file2 = file.toString();
            Intrinsics.checkIfNull(file2, "toString()");
            return m8516b(file2, z);
        }

        /* renamed from: b */
        public final Path m8516b(String str, boolean z) {
            Intrinsics.isThisObjectNull(str, "<this>");
            return C10616i.m7496k(str, z);
        }

        @IgnoreJRERequirement
        /* renamed from: c */
        public final Path m8515c(java.nio.file.Path path, boolean z) {
            Intrinsics.isThisObjectNull(path, "<this>");
            return m8516b(path.toString(), z);
        }
    }

    static {
        String str = File.separator;
        Intrinsics.checkIfNull(str, "separator");
        f26596y = str;
    }

    public Path(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "bytes");
        this.f26597w = byteString;
    }

    /* renamed from: b */
    public int compareTo(Path path) {
        Intrinsics.isThisObjectNull(path, "other");
        return m8530c().m8719c(path.m8530c());
    }

    /* renamed from: c */
    public final ByteString m8530c() {
        return this.f26597w;
    }

    /* renamed from: d */
    public final Path m8529d() {
        int m7499h = C10616i.m7499h(this);
        if (m7499h == -1) {
            return null;
        }
        return new Path(m8530c().m8725C(0, m7499h));
    }

    /* renamed from: e */
    public final List m8528e() {
        ArrayList arrayList = new ArrayList();
        int m7499h = C10616i.m7499h(this);
        if (m7499h == -1) {
            m7499h = 0;
        } else if (m7499h < m8530c().size() && m8530c().m8714h(m7499h) == ((byte) 92)) {
            m7499h++;
        }
        int size = m8530c().size();
        int i = m7499h;
        while (m7499h < size) {
            if (m8530c().m8714h(m7499h) == ((byte) 47) || m8530c().m8714h(m7499h) == ((byte) 92)) {
                arrayList.add(m8530c().m8725C(i, m7499h));
                i = m7499h + 1;
            }
            m7499h++;
        }
        if (i < m8530c().size()) {
            arrayList.add(m8530c().m8725C(i, m8530c().size()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Path) && Intrinsics.equals(((Path) obj).m8530c(), m8530c());
    }

    /* renamed from: f */
    public final boolean m8527f() {
        return C10616i.m7499h(this) != -1;
    }

    /* renamed from: g */
    public final String m8526g() {
        return m8525h().m8722F();
    }

    /* renamed from: h */
    public final ByteString m8525h() {
        int m7503d = C10616i.m7503d(this);
        if (m7503d != -1) {
            return ByteString.m8724D(m8530c(), m7503d + 1, 0, 2, null);
        }
        return (m8518o() == null || m8530c().size() != 2) ? m8530c() : ByteString.f26547A;
    }

    public int hashCode() {
        return m8530c().hashCode();
    }

    /* renamed from: i */
    public final Path m8524i() {
        Path path;
        if (Intrinsics.equals(m8530c(), C10616i.m7505b()) || Intrinsics.equals(m8530c(), C10616i.m7502e()) || Intrinsics.equals(m8530c(), C10616i.m7506a()) || C10616i.m7500g(this)) {
            return null;
        }
        int m7503d = C10616i.m7503d(this);
        if (m7503d == 2 && m8518o() != null) {
            if (m8530c().size() == 3) {
                return null;
            }
            path = new Path(ByteString.m8724D(m8530c(), 0, 3, 1, null));
        } else if (m7503d == 1 && m8530c().m8726B(C10616i.m7506a())) {
            return null;
        } else {
            if (m7503d != -1 || m8518o() == null) {
                if (m7503d == -1) {
                    return new Path(C10616i.m7505b());
                }
                if (m7503d == 0) {
                    path = new Path(ByteString.m8724D(m8530c(), 0, 1, 1, null));
                } else {
                    return new Path(ByteString.m8724D(m8530c(), 0, m7503d, 1, null));
                }
            } else if (m8530c().size() == 2) {
                return null;
            } else {
                path = new Path(ByteString.m8724D(m8530c(), 0, 2, 1, null));
            }
        }
        return path;
    }

    /* renamed from: j */
    public final Path m8523j(Path path) {
        Intrinsics.isThisObjectNull(path, "other");
        if (Intrinsics.equals(m8529d(), path.m8529d())) {
            List m8528e = m8528e();
            List m8528e2 = path.m8528e();
            int min = Math.min(m8528e.size(), m8528e2.size());
            int i = 0;
            while (i < min && Intrinsics.equals(m8528e.get(i), m8528e2.get(i))) {
                i++;
            }
            if (i == min && m8530c().size() == path.m8530c().size()) {
                return C10205a.m8513e(f26595x, ".", false, 1, null);
            }
            if (m8528e2.subList(i, m8528e2.size()).indexOf(C10616i.m7504c()) == -1) {
                Buffer buffer = new Buffer();
                ByteString m7501f = C10616i.m7501f(path);
                if (m7501f == null && (m7501f = C10616i.m7501f(this)) == null) {
                    m7501f = C10616i.m7498i(f26596y);
                }
                int size = m8528e2.size();
                for (int i2 = i; i2 < size; i2++) {
                    buffer.m8794q0(C10616i.m7504c());
                    buffer.m8794q0(m7501f);
                }
                int size2 = m8528e.size();
                while (i < size2) {
                    buffer.m8794q0((ByteString) m8528e.get(i));
                    buffer.m8794q0(m7501f);
                    i++;
                }
                return C10616i.m7490q(buffer, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + path).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + path).toString());
    }

    /* renamed from: k */
    public final Path m8522k(String str) {
        Intrinsics.isThisObjectNull(str, "child");
        return C10616i.m7497j(this, C10616i.m7490q(new Buffer().m8814I0(str), false), false);
    }

    /* renamed from: l */
    public final Path m8521l(Path path, boolean z) {
        Intrinsics.isThisObjectNull(path, "child");
        return C10616i.m7497j(this, path, z);
    }

    /* renamed from: m */
    public final File m8520m() {
        return new File(toString());
    }

    @IgnoreJRERequirement
    /* renamed from: n */
    public final java.nio.file.Path m8519n() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkIfNull(path, "get(toString())");
        return path;
    }

    /* renamed from: o */
    public final Character m8518o() {
        boolean z = false;
        if (ByteString.m8706p(m8530c(), C10616i.m7502e(), 0, 2, null) == -1 && m8530c().size() >= 2 && m8530c().m8714h(1) == ((byte) 58)) {
            char m8714h = (char) m8530c().m8714h(0);
            if (!('a' <= m8714h && m8714h < '{')) {
                if ('A' <= m8714h && m8714h < '[') {
                    z = true;
                }
                if (!z) {
                    return null;
                }
            }
            return Character.valueOf(m8714h);
        }
        return null;
    }

    public String toString() {
        return m8530c().m8722F();
    }
}
