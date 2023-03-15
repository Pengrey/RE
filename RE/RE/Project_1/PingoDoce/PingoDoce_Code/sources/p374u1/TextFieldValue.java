package p374u1;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p244n0.InterfaceC7575i;
import p244n0.InterfaceC7579k;
import p244n0.Saver;
import p286p1.AnnotatedString;
import p286p1.C8393w;
import p286p1.C8395x;
import p286p1.Savers;
import p489zc.C13780s;

/* renamed from: u1.s */
/* loaded from: classes.dex */
public final class TextFieldValue {

    /* renamed from: d */
    private static final InterfaceC7575i f27941d;

    /* renamed from: a */
    private final AnnotatedString f27942a;

    /* renamed from: b */
    private final long f27943b;

    /* renamed from: c */
    private final C8393w f27944c;

    /* compiled from: TextFieldValue.kt */
    /* renamed from: u1.s$a */
    /* loaded from: classes.dex */
    static final class C10805a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C10805a f27945w = new C10805a();

        C10805a() {
            super(2);
        }

        /* renamed from: a */
        public final Object mo39856d(InterfaceC7579k interfaceC7579k, TextFieldValue textFieldValue) {
            ArrayList m201c;
            Intrinsics.isThisObjectNull(interfaceC7579k, "$this$Saver");
            Intrinsics.isThisObjectNull(textFieldValue, "it");
            m201c = C13780s.m201c(Savers.m15633t(textFieldValue.m7003a(), Savers.m15649d(), interfaceC7579k), Savers.m15633t(C8393w.m15543b(textFieldValue.m7001c()), Savers.m15647f(C8393w.f21718b), interfaceC7579k));
            return m201c;
        }
    }

    /* compiled from: TextFieldValue.kt */
    /* renamed from: u1.s$b */
    /* loaded from: classes.dex */
    static final class C10806b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C10806b f27946w = new C10806b();

        C10806b() {
            super(1);
        }

        /* renamed from: a */
        public final TextFieldValue mo9587d(Object obj) {
            AnnotatedString annotatedString;
            Intrinsics.isThisObjectNull(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            InterfaceC7575i m15649d = Savers.m15649d();
            Boolean bool = Boolean.FALSE;
            C8393w c8393w = null;
            if (Intrinsics.equals(obj2, bool)) {
                annotatedString = null;
            } else {
                annotatedString = obj2 == null ? null : (AnnotatedString) m15649d.mo18112b(obj2);
            }
            Intrinsics.ifNullDoSomething(annotatedString);
            Object obj3 = list.get(1);
            InterfaceC7575i m15647f = Savers.m15647f(C8393w.f21718b);
            if (!Intrinsics.equals(obj3, bool) && obj3 != null) {
                c8393w = (C8393w) m15647f.mo18112b(obj3);
            }
            Intrinsics.ifNullDoSomething(c8393w);
            return new TextFieldValue(annotatedString, c8393w.m15532m(), (C8393w) null, 4, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: TextFieldValue.kt */
    /* renamed from: u1.s$c */
    /* loaded from: classes.dex */
    public static final class C10807c {
        private C10807c() {
        }

        public /* synthetic */ C10807c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10807c(null);
        f27941d = Saver.m18111a(C10805a.f27945w, C10806b.f27946w);
    }

    public /* synthetic */ TextFieldValue(String str, long j, C8393w c8393w, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, c8393w);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j, C8393w c8393w) {
        this.f27942a = annotatedString;
        this.f27943b = C8395x.m15528c(j, 0, m7000d().length());
        this.f27944c = c8393w == null ? null : C8393w.m15543b(C8395x.m15528c(c8393w.m15532m(), 0, m7000d().length()));
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, C8393w c8393w, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, c8393w);
    }

    /* renamed from: a */
    public final AnnotatedString m7003a() {
        return this.f27942a;
    }

    /* renamed from: b */
    public final C8393w m7002b() {
        return this.f27944c;
    }

    /* renamed from: c */
    public final long m7001c() {
        return this.f27943b;
    }

    /* renamed from: d */
    public final String m7000d() {
        return this.f27942a.m15771f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextFieldValue) {
            TextFieldValue textFieldValue = (TextFieldValue) obj;
            return C8393w.m15540e(m7001c(), textFieldValue.m7001c()) && Intrinsics.equals(m7002b(), textFieldValue.m7002b()) && Intrinsics.equals(this.f27942a, textFieldValue.f27942a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f27942a.hashCode() * 31) + C8393w.m15534k(m7001c())) * 31;
        C8393w m7002b = m7002b();
        return hashCode + (m7002b == null ? 0 : C8393w.m15534k(m7002b.m15532m()));
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f27942a) + "', selection=" + ((Object) C8393w.m15533l(m7001c())) + ", composition=" + m7002b() + ')';
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, C8393w c8393w, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i & 2) != 0 ? C8393w.f21718b.m15531a() : j, (i & 4) != 0 ? null : c8393w, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, C8393w c8393w, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? C8393w.f21718b.m15531a() : j, (i & 4) != 0 ? null : c8393w, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(String str, long j, C8393w c8393w) {
        this(new AnnotatedString(str, null, null, 6, null), j, c8393w, (DefaultConstructorMarker) null);
    }
}
