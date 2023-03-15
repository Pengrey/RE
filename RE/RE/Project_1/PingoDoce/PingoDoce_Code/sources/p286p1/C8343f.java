package p286p1;

import java.util.ArrayList;
import java.util.List;
import p286p1.AnnotatedString;

/* renamed from: p1.f */
/* loaded from: classes.dex */
public final class C8343f {
    /* renamed from: b */
    public static final List<AnnotatedString.C8337a<C8350o>> m15722b(List<AnnotatedString.C8337a<C8350o>> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            AnnotatedString.C8337a<C8350o> c8337a = list.get(i3);
            AnnotatedString.C8337a<C8350o> c8337a2 = c8337a;
            if (C8339b.m15755f(i, i2, c8337a2.m15762f(), c8337a2.m15764d())) {
                arrayList.add(c8337a);
            }
            i3 = i4;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            int i6 = i5 + 1;
            AnnotatedString.C8337a c8337a3 = (AnnotatedString.C8337a) arrayList.get(i5);
            if (i <= c8337a3.m15762f() && c8337a3.m15764d() <= i2) {
                arrayList2.add(new AnnotatedString.C8337a(c8337a3.m15763e(), c8337a3.m15762f() - i, c8337a3.m15764d() - i));
                i5 = i6;
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
