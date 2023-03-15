package p356sf;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p489zc.AbstractList;

/* renamed from: sf.w */
/* loaded from: classes2.dex */
public final class Options extends AbstractList implements RandomAccess {

    /* renamed from: z */
    public static final C10203a f26590z = new C10203a(null);

    /* renamed from: x */
    private final ByteString[] f26591x;

    /* renamed from: y */
    private final int[] f26592y;

    /* compiled from: Options.kt */
    /* renamed from: sf.w$a */
    /* loaded from: classes2.dex */
    public static final class C10203a {
        private C10203a() {
        }

        public /* synthetic */ C10203a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m8536a(long j, Buffer buffer, int i, List list, int i2, int i3, List list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            Buffer buffer2;
            int i8 = i;
            if (i2 < i3) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (!(((ByteString) list.get(i9)).size() >= i8)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = (ByteString) list.get(i2);
                ByteString byteString2 = (ByteString) list.get(i3 - 1);
                int i10 = -1;
                if (i8 == byteString.size()) {
                    int i11 = i2 + 1;
                    i4 = i11;
                    i5 = ((Number) list2.get(i2)).intValue();
                    byteString = (ByteString) list.get(i11);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (byteString.m8714h(i8) != byteString2.m8714h(i8)) {
                    int i12 = 1;
                    for (int i13 = i4 + 1; i13 < i3; i13++) {
                        if (((ByteString) list.get(i13 - 1)).m8714h(i8) != ((ByteString) list.get(i13)).m8714h(i8)) {
                            i12++;
                        }
                    }
                    long m8534c = j + m8534c(buffer) + 2 + (i12 * 2);
                    buffer.m8820E0(i12);
                    buffer.m8820E0(i5);
                    for (int i14 = i4; i14 < i3; i14++) {
                        byte m8714h = ((ByteString) list.get(i14)).m8714h(i8);
                        if (i14 == i4 || m8714h != ((ByteString) list.get(i14 - 1)).m8714h(i8)) {
                            buffer.m8820E0(m8714h & 255);
                        }
                    }
                    Buffer buffer3 = new Buffer();
                    while (i4 < i3) {
                        byte m8714h2 = ((ByteString) list.get(i4)).m8714h(i8);
                        int i15 = i4 + 1;
                        int i16 = i15;
                        while (true) {
                            if (i16 >= i3) {
                                i6 = i3;
                                break;
                            } else if (m8714h2 != ((ByteString) list.get(i16)).m8714h(i8)) {
                                i6 = i16;
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (i15 == i6 && i8 + 1 == ((ByteString) list.get(i4)).size()) {
                            buffer.m8820E0(((Number) list2.get(i4)).intValue());
                            i7 = i6;
                            buffer2 = buffer3;
                        } else {
                            buffer.m8820E0(((int) (m8534c + m8534c(buffer3))) * i10);
                            i7 = i6;
                            buffer2 = buffer3;
                            m8536a(m8534c, buffer3, i8 + 1, list, i4, i6, list2);
                        }
                        buffer3 = buffer2;
                        i4 = i7;
                        i10 = -1;
                    }
                    buffer.mo8783A(buffer3);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i17 = 0;
                for (int i18 = i8; i18 < min && byteString.m8714h(i18) == byteString2.m8714h(i18); i18++) {
                    i17++;
                }
                long m8534c2 = j + m8534c(buffer) + 2 + i17 + 1;
                buffer.m8820E0(-i17);
                buffer.m8820E0(i5);
                int i19 = i8 + i17;
                while (i8 < i19) {
                    buffer.m8820E0(byteString.m8714h(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i19 == ((ByteString) list.get(i4)).size()) {
                        buffer.m8820E0(((Number) list2.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                Buffer buffer4 = new Buffer();
                buffer.m8820E0(((int) (m8534c(buffer4) + m8534c2)) * (-1));
                m8536a(m8534c2, buffer4, i19, list, i4, i3, list2);
                buffer.mo8783A(buffer4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m8535b(C10203a c10203a, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            c10203a.m8536a((i4 & 1) != 0 ? 0L : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: c */
        private final long m8534c(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
            continue;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p356sf.Options m8533d(p356sf.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p356sf.Options.C10203a.m8533d(sf.f[]):sf.w");
        }
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.f26591x = byteStringArr;
        this.f26592y = iArr;
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    /* renamed from: t */
    public static final Options m8537t(ByteString... byteStringArr) {
        return f26590z.m8533d(byteStringArr);
    }

    /* renamed from: b */
    public int m8544b() {
        return this.f26591x.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return m8543f((ByteString) obj);
        }
        return false;
    }

    /* renamed from: f */
    public /* bridge */ boolean m8543f(ByteString byteString) {
        return super.contains(byteString);
    }

    /* renamed from: h */
    public ByteString get(int i) {
        return this.f26591x[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return m8539p((ByteString) obj);
        }
        return -1;
    }

    /* renamed from: l */
    public final ByteString[] m8541l() {
        return this.f26591x;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return m8538q((ByteString) obj);
        }
        return -1;
    }

    /* renamed from: o */
    public final int[] m8540o() {
        return this.f26592y;
    }

    /* renamed from: p */
    public /* bridge */ int m8539p(ByteString byteString) {
        return super.indexOf(byteString);
    }

    /* renamed from: q */
    public /* bridge */ int m8538q(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }
}
