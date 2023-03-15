package p411w0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w0.a */
/* loaded from: classes.dex */
public abstract class AbstractC11502a {

    /* renamed from: b */
    public static final C11506d f29447b = new C11506d(null);

    /* renamed from: c */
    private static final AbstractC11502a f29448c = new C11503a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d */
    private static final AbstractC11502a f29449d = new C11505c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: a */
    private final float[] f29450a;

    /* compiled from: Adaptation.kt */
    /* renamed from: w0.a$a */
    /* loaded from: classes.dex */
    public static final class C11503a extends AbstractC11502a {
        C11503a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* compiled from: Adaptation.kt */
    /* renamed from: w0.a$b */
    /* loaded from: classes.dex */
    public static final class C11504b extends AbstractC11502a {
        C11504b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* compiled from: Adaptation.kt */
    /* renamed from: w0.a$c */
    /* loaded from: classes.dex */
    public static final class C11505c extends AbstractC11502a {
        C11505c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* compiled from: Adaptation.kt */
    /* renamed from: w0.a$d */
    /* loaded from: classes.dex */
    public static final class C11506d {
        private C11506d() {
        }

        public /* synthetic */ C11506d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC11502a m4938a() {
            return AbstractC11502a.f29448c;
        }

        /* renamed from: b */
        public final AbstractC11502a m4937b() {
            return AbstractC11502a.f29449d;
        }
    }

    static {
        new C11504b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    }

    private AbstractC11502a(float[] fArr) {
        this.f29450a = fArr;
    }

    public /* synthetic */ AbstractC11502a(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    /* renamed from: c */
    public final float[] m4939c() {
        return this.f29450a;
    }
}
