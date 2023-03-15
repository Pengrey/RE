package tf;

import ad.C0127b;
import gd.C5640a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import p181jd.AbstractC6438m;
import p181jd.C6445u;
import p181jd.C6448x;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p356sf.C10200t;
import p356sf.FileHandle;
import p356sf.FileMetadata;
import p356sf.FileSystem;
import p356sf.InterfaceC10187e;
import p356sf.Path;
import p356sf.ZipFileSystem;
import p468yc.C13191r;
import p468yc.C13195u;
import p489zc.C13769l0;
import p489zc._Collections;
import sd.C10171u;
import sd.CharJVM;
import sd.StringsJVM;

/* renamed from: tf.e */
/* loaded from: classes2.dex */
public final class zip {

    /* compiled from: Comparisons.kt */
    /* renamed from: tf.e$a */
    /* loaded from: classes2.dex */
    public static final class C10610a<T> implements Comparator {
        public final int compare(Object obj, Object obj2) {
            int m41795a;
            m41795a = C0127b.m41795a(((ZipEntry) obj).m7541a(), ((ZipEntry) obj2).m7541a());
            return m41795a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: zip.kt */
    /* renamed from: tf.e$b */
    /* loaded from: classes2.dex */
    public static final class C10611b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C6448x f27344A;

        /* renamed from: B */
        final /* synthetic */ C6448x f27345B;

        /* renamed from: w */
        final /* synthetic */ C6445u f27346w;

        /* renamed from: x */
        final /* synthetic */ long f27347x;

        /* renamed from: y */
        final /* synthetic */ C6448x f27348y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC10187e f27349z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10611b(C6445u c6445u, long j, C6448x c6448x, InterfaceC10187e interfaceC10187e, C6448x c6448x2, C6448x c6448x3) {
            super(2);
            this.f27346w = c6445u;
            this.f27347x = j;
            this.f27348y = c6448x;
            this.f27349z = interfaceC10187e;
            this.f27344A = c6448x2;
            this.f27345B = c6448x3;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m7522a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m7522a(int i, long j) {
            if (i == 1) {
                C6445u c6445u = this.f27346w;
                if (!c6445u.f17529w) {
                    c6445u.f17529w = true;
                    if (j >= this.f27347x) {
                        C6448x c6448x = this.f27348y;
                        long j2 = c6448x.f17532w;
                        if (j2 == 4294967295L) {
                            j2 = this.f27349z.mo8757g0();
                        }
                        c6448x.f17532w = j2;
                        C6448x c6448x2 = this.f27344A;
                        c6448x2.f17532w = c6448x2.f17532w == 4294967295L ? this.f27349z.mo8757g0() : 0L;
                        C6448x c6448x3 = this.f27345B;
                        c6448x3.f17532w = c6448x3.f17532w == 4294967295L ? this.f27349z.mo8757g0() : 0L;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: zip.kt */
    /* renamed from: tf.e$c */
    /* loaded from: classes2.dex */
    public static final class C10612c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10187e f27350w;

        /* renamed from: x */
        final /* synthetic */ C6449y f27351x;

        /* renamed from: y */
        final /* synthetic */ C6449y f27352y;

        /* renamed from: z */
        final /* synthetic */ C6449y f27353z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10612c(InterfaceC10187e interfaceC10187e, C6449y c6449y, C6449y c6449y2, C6449y c6449y3) {
            super(2);
            this.f27350w = interfaceC10187e;
            this.f27351x = c6449y;
            this.f27352y = c6449y2;
            this.f27353z = c6449y3;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m7521a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C13195u.f34156a;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v12, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
        /* renamed from: a */
        public final void m7521a(int i, long j) {
            if (i == 21589) {
                if (j >= 1) {
                    int readByte = this.f27350w.readByte() & 255;
                    boolean z = (readByte & 1) == 1;
                    boolean z2 = (readByte & 2) == 2;
                    boolean z3 = (readByte & 4) == 4;
                    InterfaceC10187e interfaceC10187e = this.f27350w;
                    long j2 = z ? 5L : 1L;
                    if (z2) {
                        j2 += 4;
                    }
                    if (z3) {
                        j2 += 4;
                    }
                    if (j < j2) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        this.f27351x.f17533w = Long.valueOf(interfaceC10187e.mo8763O() * 1000);
                    }
                    if (z2) {
                        this.f27352y.f17533w = Long.valueOf(this.f27350w.mo8763O() * 1000);
                    }
                    if (z3) {
                        this.f27353z.f17533w = Long.valueOf(this.f27350w.mo8763O() * 1000);
                        return;
                    }
                    return;
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
    }

    /* renamed from: a */
    private static final Map m7533a(List list) {
        Map m330i;
        List<ZipEntry> m461h0;
        Path m8513e = Path.C10205a.m8513e(Path.f26595x, "/", false, 1, null);
        m330i = C13769l0.m330i(C13191r.m1447a(m8513e, new ZipEntry(m8513e, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        m461h0 = _Collections.m461h0(list, new C10610a());
        for (ZipEntry zipEntry : m461h0) {
            if (((ZipEntry) m330i.put(zipEntry.m7541a(), zipEntry)) == null) {
                while (true) {
                    Path m8524i = zipEntry.m7541a().m8524i();
                    if (m8524i != null) {
                        ZipEntry zipEntry2 = (ZipEntry) m330i.get(m8524i);
                        if (zipEntry2 != null) {
                            zipEntry2.m7540b().add(zipEntry.m7541a());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(m8524i, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        m330i.put(m8524i, zipEntry3);
                        zipEntry3.m7540b().add(zipEntry.m7541a());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return m330i;
    }

    /* renamed from: b */
    private static final Long m7532b(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    /* renamed from: c */
    private static final String m7531c(int i) {
        int m9044a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        m9044a = CharJVM.m9044a(16);
        String num = Integer.toString(i, m9044a);
        Intrinsics.checkIfNull(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        return sb2.toString();
    }

    /* renamed from: d */
    public static final ZipFileSystem m7530d(Path path, FileSystem fileSystem, InterfaceC6108l interfaceC6108l) throws IOException {
        int mo8763O;
        Intrinsics.isThisObjectNull(path, "zipPath");
        Intrinsics.isThisObjectNull(fileSystem, "fileSystem");
        Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
        FileHandle m8656n = fileSystem.m8656n(path);
        try {
            long size = m8656n.size() - 22;
            if (size >= 0) {
                long max = Math.max(size - 65536, 0L);
                while (true) {
                    InterfaceC10187e m8565c = C10200t.m8565c(m8656n.m8686F(size));
                    if (m8565c.mo8763O() == 101010256) {
                        C10606a m7528f = m7528f(m8565c);
                        String mo8754l = m8565c.mo8754l(m7528f.m7567b());
                        m8565c.close();
                        long j = size - 20;
                        if (j > 0) {
                            InterfaceC10187e m8565c2 = C10200t.m8565c(m8656n.m8686F(j));
                            if (m8565c2.mo8763O() == 117853008) {
                                int mo8763O2 = m8565c2.mo8763O();
                                long mo8757g0 = m8565c2.mo8757g0();
                                if (m8565c2.mo8763O() == 1 && mo8763O2 == 0) {
                                    InterfaceC10187e m8565c3 = C10200t.m8565c(m8656n.m8686F(mo8757g0));
                                    try {
                                        if (m8565c3.mo8763O() == 101075792) {
                                            m7528f = m7524j(m8565c3, m7528f);
                                            C13195u c13195u = C13195u.f34156a;
                                            C5640a.m23456a(m8565c3, null);
                                        } else {
                                            throw new IOException("bad zip: expected " + m7531c(101075792) + " but was " + m7531c(mo8763O));
                                        }
                                    } finally {
                                    }
                                } else {
                                    throw new IOException("unsupported zip: spanned");
                                }
                            }
                            C13195u c13195u2 = C13195u.f34156a;
                            C5640a.m23456a(m8565c2, null);
                        }
                        ArrayList arrayList = new ArrayList();
                        InterfaceC10187e m8565c4 = C10200t.m8565c(m8656n.m8686F(m7528f.m7568a()));
                        long m7566c = m7528f.m7566c();
                        for (long j2 = 0; j2 < m7566c; j2++) {
                            ZipEntry m7529e = m7529e(m8565c4);
                            if (m7529e.m7536f() < m7528f.m7568a()) {
                                if (((Boolean) interfaceC6108l.mo9587d(m7529e)).booleanValue()) {
                                    arrayList.add(m7529e);
                                }
                            } else {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                        }
                        C13195u c13195u3 = C13195u.f34156a;
                        C5640a.m23456a(m8565c4, null);
                        ZipFileSystem zipFileSystem = new ZipFileSystem(path, fileSystem, m7533a(arrayList), mo8754l);
                        C5640a.m23456a(m8656n, null);
                        return zipFileSystem;
                    }
                    m8565c.close();
                    size--;
                    if (size < max) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                }
            } else {
                throw new IOException("not a zip: size=" + m8656n.size());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5640a.m23456a(m8656n, th2);
                throw th3;
            }
        }
    }

    /* renamed from: e */
    public static final ZipEntry m7529e(InterfaceC10187e interfaceC10187e) throws IOException {
        int mo8763O;
        int mo8758c0;
        boolean m8924G;
        C6448x c6448x;
        long j;
        boolean m8944p;
        Intrinsics.isThisObjectNull(interfaceC10187e, "<this>");
        if (interfaceC10187e.mo8763O() == 33639248) {
            interfaceC10187e.skip(4L);
            if ((interfaceC10187e.mo8758c0() & 65535 & 1) == 0) {
                int mo8758c02 = interfaceC10187e.mo8758c0() & 65535;
                Long m7532b = m7532b(interfaceC10187e.mo8758c0() & 65535, interfaceC10187e.mo8758c0() & 65535);
                long mo8763O2 = interfaceC10187e.mo8763O() & 4294967295L;
                C6448x c6448x2 = new C6448x();
                c6448x2.f17532w = interfaceC10187e.mo8763O() & 4294967295L;
                C6448x c6448x3 = new C6448x();
                c6448x3.f17532w = interfaceC10187e.mo8763O() & 4294967295L;
                int mo8758c03 = interfaceC10187e.mo8758c0() & 65535;
                int mo8758c04 = interfaceC10187e.mo8758c0() & 65535;
                interfaceC10187e.skip(8L);
                C6448x c6448x4 = new C6448x();
                c6448x4.f17532w = interfaceC10187e.mo8763O() & 4294967295L;
                String mo8754l = interfaceC10187e.mo8754l(interfaceC10187e.mo8758c0() & 65535);
                m8924G = C10171u.m8924G(mo8754l, (char) 0, false, 2, null);
                if (!m8924G) {
                    if (c6448x3.f17532w == 4294967295L) {
                        j = 8 + 0;
                        c6448x = c6448x4;
                    } else {
                        c6448x = c6448x4;
                        j = 0;
                    }
                    if (c6448x2.f17532w == 4294967295L) {
                        j += 8;
                    }
                    C6448x c6448x5 = c6448x;
                    if (c6448x5.f17532w == 4294967295L) {
                        j += 8;
                    }
                    long j2 = j;
                    C6445u c6445u = new C6445u();
                    m7527g(interfaceC10187e, mo8758c03, new C10611b(c6445u, j2, c6448x3, interfaceC10187e, c6448x2, c6448x5));
                    if (j2 > 0 && !c6445u.f17529w) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String mo8754l2 = interfaceC10187e.mo8754l(mo8758c04);
                    Path m8522k = Path.C10205a.m8513e(Path.f26595x, "/", false, 1, null).m8522k(mo8754l);
                    m8944p = StringsJVM.m8944p(mo8754l, "/", false, 2, null);
                    return new ZipEntry(m8522k, m8944p, mo8754l2, mo8763O2, c6448x2.f17532w, c6448x3.f17532w, mo8758c02, m7532b, c6448x5.f17532w);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + m7531c(mo8758c0));
        }
        throw new IOException("bad zip: expected " + m7531c(33639248) + " but was " + m7531c(mo8763O));
    }

    /* renamed from: f */
    private static final C10606a m7528f(InterfaceC10187e interfaceC10187e) throws IOException {
        int mo8758c0 = interfaceC10187e.mo8758c0() & 65535;
        int mo8758c02 = interfaceC10187e.mo8758c0() & 65535;
        long mo8758c03 = interfaceC10187e.mo8758c0() & 65535;
        if (mo8758c03 == (interfaceC10187e.mo8758c0() & 65535) && mo8758c0 == 0 && mo8758c02 == 0) {
            interfaceC10187e.skip(4L);
            return new C10606a(mo8758c03, 4294967295L & interfaceC10187e.mo8763O(), interfaceC10187e.mo8758c0() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    /* renamed from: g */
    private static final void m7527g(InterfaceC10187e interfaceC10187e, int i, InterfaceC6112p interfaceC6112p) {
        long j = i;
        while (j != 0) {
            if (j >= 4) {
                int mo8758c0 = interfaceC10187e.mo8758c0() & 65535;
                long mo8758c02 = interfaceC10187e.mo8758c0() & 65535;
                long j2 = j - 4;
                if (j2 >= mo8758c02) {
                    interfaceC10187e.mo8750r0(mo8758c02);
                    long size = interfaceC10187e.mo8759b().size();
                    interfaceC6112p.mo39856d(Integer.valueOf(mo8758c0), Long.valueOf(mo8758c02));
                    long size2 = (interfaceC10187e.mo8759b().size() + mo8758c02) - size;
                    int i2 = (size2 > 0L ? 1 : (size2 == 0L ? 0 : -1));
                    if (i2 < 0) {
                        throw new IOException("unsupported zip: too many bytes processed for " + mo8758c0);
                    }
                    if (i2 > 0) {
                        interfaceC10187e.mo8759b().skip(size2);
                    }
                    j = j2 - mo8758c02;
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    /* renamed from: h */
    public static final FileMetadata m7526h(InterfaceC10187e interfaceC10187e, FileMetadata fileMetadata) {
        Intrinsics.isThisObjectNull(interfaceC10187e, "<this>");
        Intrinsics.isThisObjectNull(fileMetadata, "basicMetadata");
        FileMetadata m7525i = m7525i(interfaceC10187e, fileMetadata);
        Intrinsics.ifNullDoSomething(m7525i);
        return m7525i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private static final FileMetadata m7525i(InterfaceC10187e interfaceC10187e, FileMetadata fileMetadata) {
        C6449y c6449y = new C6449y();
        c6449y.f17533w = fileMetadata != null ? fileMetadata.m8674c() : 0;
        C6449y c6449y2 = new C6449y();
        C6449y c6449y3 = new C6449y();
        int mo8763O = interfaceC10187e.mo8763O();
        if (mo8763O == 67324752) {
            interfaceC10187e.skip(2L);
            int mo8758c0 = interfaceC10187e.mo8758c0() & 65535;
            if ((mo8758c0 & 1) == 0) {
                interfaceC10187e.skip(18L);
                int mo8758c02 = interfaceC10187e.mo8758c0() & 65535;
                interfaceC10187e.skip(interfaceC10187e.mo8758c0() & 65535);
                if (fileMetadata == null) {
                    interfaceC10187e.skip(mo8758c02);
                    return null;
                }
                m7527g(interfaceC10187e, mo8758c02, new C10612c(interfaceC10187e, c6449y, c6449y2, c6449y3));
                return new FileMetadata(fileMetadata.m8670g(), fileMetadata.m8671f(), null, fileMetadata.m8673d(), (Long) c6449y3.f17533w, (Long) c6449y.f17533w, (Long) c6449y2.f17533w, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + m7531c(mo8758c0));
        }
        throw new IOException("bad zip: expected " + m7531c(67324752) + " but was " + m7531c(mo8763O));
    }

    /* renamed from: j */
    private static final C10606a m7524j(InterfaceC10187e interfaceC10187e, C10606a c10606a) throws IOException {
        interfaceC10187e.skip(12L);
        int mo8763O = interfaceC10187e.mo8763O();
        int mo8763O2 = interfaceC10187e.mo8763O();
        long mo8757g0 = interfaceC10187e.mo8757g0();
        if (mo8757g0 == interfaceC10187e.mo8757g0() && mo8763O == 0 && mo8763O2 == 0) {
            interfaceC10187e.skip(8L);
            return new C10606a(mo8757g0, interfaceC10187e.mo8757g0(), c10606a.m7567b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    /* renamed from: k */
    public static final void m7523k(InterfaceC10187e interfaceC10187e) {
        Intrinsics.isThisObjectNull(interfaceC10187e, "<this>");
        m7525i(interfaceC10187e, null);
    }
}
