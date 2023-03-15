package p127h1;

import id.InterfaceC6112p;
import p181jd.C6435i;
import p181jd.Intrinsics;
import p220ld.C7035a;

/* renamed from: h1.b */
/* loaded from: classes.dex */
public final class AlignmentLine {

    /* renamed from: a */
    private static final C5767g f16055a = new C5767g(C5746a.f16057F);

    /* renamed from: b */
    private static final C5767g f16056b = new C5767g(C5747b.f16058F);

    /* compiled from: AlignmentLine.kt */
    /* renamed from: h1.b$a */
    /* loaded from: classes.dex */
    /* synthetic */ class C5746a extends C6435i implements InterfaceC6112p {

        /* renamed from: F */
        public static final C5746a f16057F = new C5746a();

        C5746a() {
            super(2, C7035a.class, "min", "min(II)I", 1);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m23195i(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        /* renamed from: i */
        public final Integer m23195i(int i, int i2) {
            return Integer.valueOf(Math.min(i, i2));
        }
    }

    /* compiled from: AlignmentLine.kt */
    /* renamed from: h1.b$b */
    /* loaded from: classes.dex */
    /* synthetic */ class C5747b extends C6435i implements InterfaceC6112p {

        /* renamed from: F */
        public static final C5747b f16058F = new C5747b();

        C5747b() {
            super(2, C7035a.class, "max", "max(II)I", 1);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m23194i(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        /* renamed from: i */
        public final Integer m23194i(int i, int i2) {
            return Integer.valueOf(Math.max(i, i2));
        }
    }

    /* renamed from: a */
    public static final C5767g m23198a() {
        return f16055a;
    }

    /* renamed from: b */
    public static final C5767g m23197b() {
        return f16056b;
    }

    /* renamed from: c */
    public static final int m23196c(AbstractC5743a abstractC5743a, int i, int i2) {
        Intrinsics.isThisObjectNull(abstractC5743a, "<this>");
        return abstractC5743a.m23200a().mo39856d(Integer.valueOf(i), Integer.valueOf(i2)).intValue();
    }
}
