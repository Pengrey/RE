package p129h3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import bd.InterfaceC1886d;
import com.google.crypto.tink.shaded.protobuf.Reader;
import gd.C5640a;
import id.InterfaceC6097a;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.sync.C6943h;
import kotlinx.coroutines.sync.InterfaceC6940f;
import p095f3.InterfaceC5359e;
import p129h3.AbstractC5840n;
import p129h3.InterfaceC5830g;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p193k3.C6592l;
import p220ld.C7037c;
import p297pd._Ranges;
import p305q3.C9635k;
import p327r3.C9796b;
import p327r3.C9805i;
import p356sf.Buffer;
import p356sf.C10200t;
import p356sf.ForwardingSource;
import p356sf.InterfaceC10187e;
import p356sf.InterfaceC10191h0;
import p396v3.C11089a;
import p396v3.C11098i;

/* renamed from: h3.b */
/* loaded from: classes.dex */
public final class C5819b implements InterfaceC5830g {

    /* renamed from: a */
    private final AbstractC5840n f16216a;

    /* renamed from: b */
    private final C9635k f16217b;

    /* renamed from: c */
    private final InterfaceC6940f f16218c;

    /* renamed from: d */
    private final EnumC5835j f16219d;

    /* compiled from: BitmapFactoryDecoder.kt */
    /* renamed from: h3.b$a */
    /* loaded from: classes.dex */
    public static final class C5820a {
        private C5820a() {
        }

        public /* synthetic */ C5820a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BitmapFactoryDecoder.kt */
    /* renamed from: h3.b$b */
    /* loaded from: classes.dex */
    public static final class C5821b extends ForwardingSource {

        /* renamed from: w */
        private Exception f16220w;

        public C5821b(InterfaceC10191h0 interfaceC10191h0) {
            super(interfaceC10191h0);
        }

        /* renamed from: a */
        public final Exception m22975a() {
            return this.f16220w;
        }

        public long read(Buffer buffer, long j) {
            try {
                return super.read(buffer, j);
            } catch (Exception e) {
                this.f16220w = e;
                throw e;
            }
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    /* renamed from: h3.b$c */
    /* loaded from: classes.dex */
    public static final class C5822c implements InterfaceC5830g.InterfaceC5831a {

        /* renamed from: a */
        private final EnumC5835j f16221a;

        /* renamed from: b */
        private final InterfaceC6940f f16222b;

        public C5822c(int i, EnumC5835j enumC5835j) {
            this.f16221a = enumC5835j;
            this.f16222b = C6943h.m19744b(i, 0, 2, null);
        }

        /* renamed from: a */
        public InterfaceC5830g mo22967a(C6592l c6592l, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            return new C5819b(c6592l.m20522b(), c9635k, this.f16222b, this.f16221a);
        }

        public boolean equals(Object obj) {
            return obj instanceof C5822c;
        }

        public int hashCode() {
            return C5822c.class.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapFactoryDecoder.kt */
    @InterfaceC6759f(m20197c = "coil.decode.BitmapFactoryDecoder", m20196f = "BitmapFactoryDecoder.kt", m20195l = {232, 46}, m20194m = "decode")
    /* renamed from: h3.b$d */
    /* loaded from: classes.dex */
    public static final class C5823d extends AbstractC6757d {

        /* renamed from: A */
        int f16223A;

        /* renamed from: w */
        Object f16224w;

        /* renamed from: x */
        Object f16225x;

        /* renamed from: y */
        /* synthetic */ Object f16226y;

        C5823d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16226y = obj;
            this.f16223A |= Integer.MIN_VALUE;
            return C5819b.this.mo22968a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapFactoryDecoder.kt */
    /* renamed from: h3.b$e */
    /* loaded from: classes.dex */
    public static final class C5824e extends AbstractC6438m implements InterfaceC6097a {
        C5824e() {
            super(0);
        }

        /* renamed from: a */
        public final C5827e mo42214q() {
            return C5819b.m22979b(C5819b.this, new BitmapFactory.Options());
        }
    }

    static {
        new C5820a(null);
    }

    public C5819b(AbstractC5840n abstractC5840n, C9635k c9635k, InterfaceC6940f interfaceC6940f, EnumC5835j enumC5835j) {
        this.f16216a = abstractC5840n;
        this.f16217b = c9635k;
        this.f16218c = interfaceC6940f;
        this.f16219d = enumC5835j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C5827e m22979b(C5819b c5819b, BitmapFactory.Options options) {
        return c5819b.m22976e(options);
    }

    /* renamed from: c */
    private final void m22978c(BitmapFactory.Options options, C5832h c5832h) {
        Bitmap.Config m10325f = this.f16217b.m10325f();
        if (c5832h.m22965b() || C5837l.m22961a(c5832h)) {
            m10325f = C11089a.m6172e(m10325f);
        }
        if (this.f16217b.m10327d() && m10325f == Bitmap.Config.ARGB_8888 && Intrinsics.equals(options.outMimeType, "image/jpeg")) {
            m10325f = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && m10325f != Bitmap.Config.HARDWARE) {
            m10325f = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = m10325f;
    }

    /* renamed from: d */
    private final void m22977d(BitmapFactory.Options options, C5832h c5832h) {
        int m19531b;
        int m19531b2;
        AbstractC5840n.AbstractC5841a mo22955a = this.f16216a.mo22955a();
        if ((mo22955a instanceof C5843p) && C9796b.m9946a(this.f16217b.m10317n())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((C5843p) mo22955a).m22949a();
            options.inTargetDensity = this.f16217b.m10324g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth > 0 && options.outHeight > 0) {
            int i = C5837l.m22960b(c5832h) ? options.outHeight : options.outWidth;
            int i2 = C5837l.m22960b(c5832h) ? options.outWidth : options.outHeight;
            C9805i m10317n = this.f16217b.m10317n();
            int m6156A = C9796b.m9946a(m10317n) ? i : C11098i.m6156A(m10317n.m9942d(), this.f16217b.m10318m());
            C9805i m10317n2 = this.f16217b.m10317n();
            int m6156A2 = C9796b.m9946a(m10317n2) ? i2 : C11098i.m6156A(m10317n2.m9943c(), this.f16217b.m10318m());
            int m22971a = C5828f.m22971a(i, i2, m6156A, m6156A2, this.f16217b.m10318m());
            options.inSampleSize = m22971a;
            double m22970b = C5828f.m22970b(i / m22971a, i2 / m22971a, m6156A, m6156A2, this.f16217b.m10318m());
            if (this.f16217b.m10328c()) {
                m22970b = _Ranges.m15002g(m22970b, 1.0d);
            }
            boolean z = !(m22970b == 1.0d);
            options.inScaled = z;
            if (z) {
                if (m22970b > 1.0d) {
                    m19531b2 = C7037c.m19531b(((double) Reader.READ_DONE) / m22970b);
                    options.inDensity = m19531b2;
                    options.inTargetDensity = Reader.READ_DONE;
                    return;
                }
                options.inDensity = Reader.READ_DONE;
                m19531b = C7037c.m19531b(((double) Reader.READ_DONE) * m22970b);
                options.inTargetDensity = m19531b;
                return;
            }
            return;
        }
        options.inSampleSize = 1;
        options.inScaled = false;
    }

    /* renamed from: e */
    private final C5827e m22976e(BitmapFactory.Options options) {
        C5821b c5821b = new C5821b(this.f16216a.mo22954c());
        InterfaceC10187e m8565c = C10200t.m8565c(c5821b);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(m8565c.mo8753n0().mo8767C0(), null, options);
        Exception m22975a = c5821b.m22975a();
        if (m22975a == null) {
            options.inJustDecodeBounds = false;
            C5836k c5836k = C5836k.f16237a;
            C5832h m22963a = c5836k.m22963a(options.outMimeType, m8565c, this.f16219d);
            Exception m22975a2 = c5821b.m22975a();
            if (m22975a2 == null) {
                options.inMutable = false;
                if (Build.VERSION.SDK_INT >= 26 && this.f16217b.m10326e() != null) {
                    options.inPreferredColorSpace = this.f16217b.m10326e();
                }
                options.inPremultiplied = this.f16217b.m10319l();
                m22978c(options, m22963a);
                m22977d(options, m22963a);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(m8565c.mo8767C0(), null, options);
                    C5640a.m23456a(m8565c, null);
                    Exception m22975a3 = c5821b.m22975a();
                    if (m22975a3 == null) {
                        if (decodeStream != null) {
                            decodeStream.setDensity(this.f16217b.m10324g().getResources().getDisplayMetrics().densityDpi);
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f16217b.m10324g().getResources(), c5836k.m22962b(decodeStream, m22963a));
                            if (options.inSampleSize <= 1 && !options.inScaled) {
                                z = false;
                            }
                            return new C5827e(bitmapDrawable, z);
                        }
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                    }
                    throw m22975a3;
                } finally {
                }
            } else {
                throw m22975a2;
            }
        } else {
            throw m22975a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo22968a(bd.InterfaceC1886d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p129h3.C5819b.C5823d
            if (r0 == 0) goto L13
            r0 = r8
            h3.b$d r0 = (p129h3.C5819b.C5823d) r0
            int r1 = r0.f16223A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16223A = r1
            goto L18
        L13:
            h3.b$d r0 = new h3.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16226y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f16223A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f16224w
            kotlinx.coroutines.sync.f r0 = (kotlinx.coroutines.sync.InterfaceC6940f) r0
            p468yc.C13186n.m1453b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f16225x
            kotlinx.coroutines.sync.f r2 = (kotlinx.coroutines.sync.InterfaceC6940f) r2
            java.lang.Object r5 = r0.f16224w
            h3.b r5 = (p129h3.C5819b) r5
            p468yc.C13186n.m1453b(r8)
            r8 = r2
            goto L5a
        L47:
            p468yc.C13186n.m1453b(r8)
            kotlinx.coroutines.sync.f r8 = r7.f16218c
            r0.f16224w = r7
            r0.f16225x = r8
            r0.f16223A = r4
            java.lang.Object r2 = r8.mo19752b(r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r7
        L5a:
            h3.b$e r2 = new h3.b$e     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f16224w = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f16225x = r5     // Catch: java.lang.Throwable -> L76
            r0.f16223A = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = td.C10556p1.m7688c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            h3.e r8 = (p129h3.C5827e) r8     // Catch: java.lang.Throwable -> L30
            r0.mo19753a()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.mo19753a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p129h3.C5819b.mo22968a(bd.d):java.lang.Object");
    }
}
