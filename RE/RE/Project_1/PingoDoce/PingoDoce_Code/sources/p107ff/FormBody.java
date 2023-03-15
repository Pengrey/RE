package p107ff;

import gf.Util;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.HttpUrl;
import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.InterfaceC10186d;

/* renamed from: ff.s */
/* loaded from: classes2.dex */
public final class FormBody extends RequestBody {

    /* renamed from: c */
    private static final MediaType f15527c;

    /* renamed from: a */
    private final List f15528a;

    /* renamed from: b */
    private final List f15529b;

    /* compiled from: FormBody.kt */
    /* renamed from: ff.s$b */
    /* loaded from: classes2.dex */
    public static final class C5494b {
        private C5494b() {
        }

        public /* synthetic */ C5494b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5494b(null);
        f15527c = MediaType.f15564d.m23909a("application/x-www-form-urlencoded");
    }

    public FormBody(List list, List list2) {
        Intrinsics.isThisObjectNull(list, "encodedNames");
        Intrinsics.isThisObjectNull(list2, "encodedValues");
        this.f15528a = Util.m23424S(list);
        this.f15529b = Util.m23424S(list2);
    }

    /* renamed from: a */
    private final long m24027a(InterfaceC10186d interfaceC10186d, boolean z) {
        Buffer mo8778b;
        if (z) {
            mo8778b = new Buffer();
        } else {
            Intrinsics.ifNullDoSomething(interfaceC10186d);
            mo8778b = interfaceC10186d.mo8778b();
        }
        int i = 0;
        int size = this.f15528a.size();
        while (i < size) {
            int i2 = i + 1;
            if (i > 0) {
                mo8778b.m8791x0(38);
            }
            mo8778b.m8814I0((String) this.f15528a.get(i));
            mo8778b.m8791x0(61);
            mo8778b.m8814I0((String) this.f15529b.get(i));
            i = i2;
        }
        if (z) {
            long size2 = mo8778b.size();
            mo8778b.m8805a();
            return size2;
        }
        return 0L;
    }

    public long contentLength() {
        return m24027a(null, true);
    }

    public MediaType contentType() {
        return f15527c;
    }

    public void writeTo(InterfaceC10186d interfaceC10186d) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
        m24027a(interfaceC10186d, false);
    }

    /* compiled from: FormBody.kt */
    /* renamed from: ff.s$a */
    /* loaded from: classes2.dex */
    public static final class C5493a {

        /* renamed from: a */
        private final Charset f15530a;

        /* renamed from: b */
        private final List f15531b;

        /* renamed from: c */
        private final List f15532c;

        public C5493a() {
            this(null, 1, null);
        }

        public C5493a(Charset charset) {
            this.f15530a = charset;
            this.f15531b = new ArrayList();
            this.f15532c = new ArrayList();
        }

        /* renamed from: a */
        public final C5493a m24026a(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            List list = this.f15531b;
            HttpUrl.C5502b c5502b = HttpUrl.f15543k;
            list.add(HttpUrl.C5502b.m23930b(c5502b, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f15530a, 91, null));
            this.f15532c.add(HttpUrl.C5502b.m23930b(c5502b, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f15530a, 91, null));
            return this;
        }

        /* renamed from: b */
        public final C5493a m24025b(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            List list = this.f15531b;
            HttpUrl.C5502b c5502b = HttpUrl.f15543k;
            list.add(HttpUrl.C5502b.m23930b(c5502b, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f15530a, 83, null));
            this.f15532c.add(HttpUrl.C5502b.m23930b(c5502b, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f15530a, 83, null));
            return this;
        }

        /* renamed from: c */
        public final FormBody m24024c() {
            return new FormBody(this.f15531b, this.f15532c);
        }

        public /* synthetic */ C5493a(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }
    }
}
