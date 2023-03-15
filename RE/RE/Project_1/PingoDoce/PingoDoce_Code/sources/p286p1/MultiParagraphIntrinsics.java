package p286p1;

import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.List;
import kotlin.EnumC6754a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p359t1.InterfaceC10362d;
import p457y1.C13064e;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p479z1.Density;
import p489zc.C13780s;

/* renamed from: p1.e */
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements InterfaceC8348k {

    /* renamed from: a */
    private final AnnotatedString f21599a;

    /* renamed from: b */
    private final List f21600b;

    /* renamed from: c */
    private final InterfaceC13178g f21601c;

    /* renamed from: d */
    private final InterfaceC13178g f21602d;

    /* renamed from: e */
    private final List f21603e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultiParagraphIntrinsics.kt */
    /* renamed from: p1.e$a */
    /* loaded from: classes.dex */
    public static final class C8341a extends AbstractC6438m implements InterfaceC6097a {
        C8341a() {
            super(0);
        }

        /* renamed from: a */
        public final Float mo42214q() {
            int m195i;
            Object obj;
            InterfaceC8348k m15686b;
            List m15728e = MultiParagraphIntrinsics.this.m15728e();
            if (m15728e.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = m15728e.get(0);
                float mo15683b = ((C8347j) obj2).m15686b().mo15683b();
                m195i = C13780s.m195i(m15728e);
                int i = 1;
                if (1 <= m195i) {
                    while (true) {
                        int i2 = i + 1;
                        Object obj3 = m15728e.get(i);
                        float mo15683b2 = ((C8347j) obj3).m15686b().mo15683b();
                        if (Float.compare(mo15683b, mo15683b2) < 0) {
                            obj2 = obj3;
                            mo15683b = mo15683b2;
                        }
                        if (i == m195i) {
                            break;
                        }
                        i = i2;
                    }
                }
                obj = obj2;
            }
            C8347j c8347j = (C8347j) obj;
            float f = 0.0f;
            if (c8347j != null && (m15686b = c8347j.m15686b()) != null) {
                f = m15686b.mo15683b();
            }
            return Float.valueOf(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultiParagraphIntrinsics.kt */
    /* renamed from: p1.e$b */
    /* loaded from: classes.dex */
    public static final class C8342b extends AbstractC6438m implements InterfaceC6097a {
        C8342b() {
            super(0);
        }

        /* renamed from: a */
        public final Float mo42214q() {
            int m195i;
            Object obj;
            InterfaceC8348k m15686b;
            List m15728e = MultiParagraphIntrinsics.this.m15728e();
            if (m15728e.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = m15728e.get(0);
                float mo15684a = ((C8347j) obj2).m15686b().mo15684a();
                m195i = C13780s.m195i(m15728e);
                int i = 1;
                if (1 <= m195i) {
                    while (true) {
                        int i2 = i + 1;
                        Object obj3 = m15728e.get(i);
                        float mo15684a2 = ((C8347j) obj3).m15686b().mo15684a();
                        if (Float.compare(mo15684a, mo15684a2) < 0) {
                            obj2 = obj3;
                            mo15684a = mo15684a2;
                        }
                        if (i == m195i) {
                            break;
                        }
                        i = i2;
                    }
                }
                obj = obj2;
            }
            C8347j c8347j = (C8347j) obj;
            float f = 0.0f;
            if (c8347j != null && (m15686b = c8347j.m15686b()) != null) {
                f = m15686b.mo15684a();
            }
            return Float.valueOf(f);
        }
    }

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List list, Density density, InterfaceC10362d.InterfaceC10363a interfaceC10363a) {
        InterfaceC13178g m1463b;
        InterfaceC13178g m1463b2;
        List m15722b;
        AnnotatedString annotatedString2 = annotatedString;
        Intrinsics.isThisObjectNull(annotatedString2, "annotatedString");
        Intrinsics.isThisObjectNull(textStyle, "style");
        Intrinsics.isThisObjectNull(list, "placeholders");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(interfaceC10363a, "resourceLoader");
        this.f21599a = annotatedString2;
        this.f21600b = list;
        EnumC6754a enumC6754a = EnumC6754a.NONE;
        m1463b = LazyJVM.m1463b(enumC6754a, new C8342b());
        this.f21601c = m1463b;
        m1463b2 = LazyJVM.m1463b(enumC6754a, new C8341a());
        this.f21602d = m1463b2;
        C8349n m15503x = textStyle.m15503x();
        List m15754g = C8339b.m15754g(annotatedString2, m15503x);
        ArrayList arrayList = new ArrayList(m15754g.size());
        int size = m15754g.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) m15754g.get(i);
            AnnotatedString m15759b = C8339b.m15759b(annotatedString2, c8337a.m15762f(), c8337a.m15764d());
            C8349n m15730c = m15730c(this, (C8349n) c8337a.m15763e(), m15503x);
            String m15771f = m15759b.m15771f();
            TextStyle m15505v = textStyle.m15505v(m15730c);
            List m15772e = m15759b.m15772e();
            m15722b = C8343f.m15722b(m15727f(), c8337a.m15762f(), c8337a.m15764d());
            arrayList.add(new C8347j(ParagraphIntrinsics.m15682a(m15771f, m15505v, m15772e, m15722b, density, interfaceC10363a), c8337a.m15762f(), c8337a.m15764d()));
            annotatedString2 = annotatedString;
            i = i2;
        }
        this.f21603e = arrayList;
    }

    /* renamed from: c */
    public static final /* synthetic */ C8349n m15730c(MultiParagraphIntrinsics multiParagraphIntrinsics, C8349n c8349n, C8349n c8349n2) {
        return multiParagraphIntrinsics.m15726g(c8349n, c8349n2);
    }

    /* renamed from: g */
    private final C8349n m15726g(C8349n c8349n, C8349n c8349n2) {
        C8349n c8349n3;
        C13064e m15676e = c8349n.m15676e();
        if (m15676e == null) {
            c8349n3 = null;
        } else {
            m15676e.m1709l();
            c8349n3 = c8349n;
        }
        return c8349n3 == null ? C8349n.m15679b(c8349n, null, c8349n2.m15676e(), 0L, null, 13, null) : c8349n3;
    }

    /* renamed from: a */
    public float mo15684a() {
        return ((Number) this.f21601c.getValue()).floatValue();
    }

    /* renamed from: b */
    public float mo15683b() {
        return ((Number) this.f21602d.getValue()).floatValue();
    }

    /* renamed from: d */
    public final AnnotatedString m15729d() {
        return this.f21599a;
    }

    /* renamed from: e */
    public final List m15728e() {
        return this.f21603e;
    }

    /* renamed from: f */
    public final List m15727f() {
        return this.f21600b;
    }
}
