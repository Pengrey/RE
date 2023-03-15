package p286p1;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p297pd._Ranges;
import p489zc.C13780s;

/* compiled from: AnnotatedString.kt */
/* renamed from: p1.b */
/* loaded from: classes.dex */
public final class C8339b {
    static {
        new AnnotatedString(BuildConfig.VERSION_NAME, null, null, 6, null);
    }

    /* renamed from: a */
    public static final /* synthetic */ List m15760a(List list, int i, int i2) {
        return m15757d(list, i, i2);
    }

    /* renamed from: b */
    public static final /* synthetic */ AnnotatedString m15759b(AnnotatedString annotatedString, int i, int i2) {
        return m15753h(annotatedString, i, i2);
    }

    /* renamed from: c */
    public static final boolean m15758c(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 != i4) {
                return true;
            }
            if ((i3 == i4) == (i == i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static final List m15757d(List list, int i, int i2) {
        int i3 = 0;
        if (i <= i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                Object obj = list.get(i4);
                AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) obj;
                if (m15755f(i, i2, c8337a.m15762f(), c8337a.m15764d())) {
                    arrayList.add(obj);
                }
                i4 = i5;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            while (i3 < size2) {
                int i6 = i3 + 1;
                AnnotatedString.C8337a c8337a2 = (AnnotatedString.C8337a) arrayList.get(i3);
                arrayList2.add(new AnnotatedString.C8337a(c8337a2.m15763e(), Math.max(i, c8337a2.m15762f()) - i, Math.min(i2, c8337a2.m15764d()) - i, c8337a2.m15761g()));
                i3 = i6;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
    }

    /* renamed from: e */
    private static final List m15756e(AnnotatedString annotatedString, int i, int i2) {
        int m14996m;
        int m14996m2;
        List m197g;
        if (i == i2) {
            m197g = C13780s.m197g();
            return m197g;
        } else if (i == 0 && i2 >= annotatedString.m15771f().length()) {
            return annotatedString.m15772e();
        } else {
            List m15772e = annotatedString.m15772e();
            ArrayList arrayList = new ArrayList(m15772e.size());
            int size = m15772e.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                Object obj = m15772e.get(i4);
                AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) obj;
                if (m15755f(i, i2, c8337a.m15762f(), c8337a.m15764d())) {
                    arrayList.add(obj);
                }
                i4 = i5;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            while (i3 < size2) {
                int i6 = i3 + 1;
                AnnotatedString.C8337a c8337a2 = (AnnotatedString.C8337a) arrayList.get(i3);
                Object m15763e = c8337a2.m15763e();
                m14996m = _Ranges.m14996m(c8337a2.m15762f(), i, i2);
                m14996m2 = _Ranges.m14996m(c8337a2.m15764d(), i, i2);
                arrayList2.add(new AnnotatedString.C8337a(m15763e, m14996m - i, m14996m2 - i));
                i3 = i6;
            }
            return arrayList2;
        }
    }

    /* renamed from: f */
    public static final boolean m15755f(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || m15758c(i, i2, i3, i4) || m15758c(i3, i4, i, i2);
    }

    /* renamed from: g */
    public static final List m15754g(AnnotatedString annotatedString, C8349n c8349n) {
        Intrinsics.isThisObjectNull(annotatedString, "<this>");
        Intrinsics.isThisObjectNull(c8349n, "defaultParagraphStyle");
        int length = annotatedString.m15771f().length();
        List m15773d = annotatedString.m15773d();
        ArrayList arrayList = new ArrayList();
        int size = m15773d.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3 = i + 1;
            AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) m15773d.get(i);
            C8349n c8349n2 = (C8349n) c8337a.m15767a();
            int m15766b = c8337a.m15766b();
            int m15765c = c8337a.m15765c();
            if (m15766b != i2) {
                arrayList.add(new AnnotatedString.C8337a(c8349n, i2, m15766b));
            }
            arrayList.add(new AnnotatedString.C8337a(c8349n.m15674g(c8349n2), m15766b, m15765c));
            i2 = m15765c;
            i = i3;
        }
        if (i2 != length) {
            arrayList.add(new AnnotatedString.C8337a(c8349n, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.C8337a(c8349n, 0, 0));
        }
        return arrayList;
    }

    /* renamed from: h */
    private static final AnnotatedString m15753h(AnnotatedString annotatedString, int i, int i2) {
        String str;
        if (i != i2) {
            str = annotatedString.m15771f().substring(i, i2);
            Intrinsics.checkIfNull(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        return new AnnotatedString(str, m15756e(annotatedString, i, i2), null, 4, null);
    }
}
