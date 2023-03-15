package p324r0;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p181jd.Intrinsics;
import p393v0.C11069v0;
import p468yc.Standard;

/* compiled from: AndroidAutofill.android.kt */
/* renamed from: r0.c */
/* loaded from: classes.dex */
public final class C9783c {
    /* renamed from: a */
    public static final void m9969a(C9781a c9781a, SparseArray sparseArray) {
        Intrinsics.isThisObjectNull(c9781a, "<this>");
        Intrinsics.isThisObjectNull(sparseArray, "values");
        int size = sparseArray.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            C9786f c9786f = C9786f.f25723a;
            Intrinsics.checkIfNull(autofillValue, "value");
            if (c9786f.m9960d(autofillValue)) {
                c9781a.m9972b().m9948b(keyAt, c9786f.m9955i(autofillValue).toString());
            } else if (!c9786f.m9962b(autofillValue)) {
                if (!c9786f.m9961c(autofillValue)) {
                    if (c9786f.m9959e(autofillValue)) {
                        throw new Standard(Intrinsics.addStrAndObj("An operation is not implemented: ", "b/138604541:  Add onFill() callback for toggle"));
                    }
                } else {
                    throw new Standard(Intrinsics.addStrAndObj("An operation is not implemented: ", "b/138604541: Add onFill() callback for list"));
                }
            } else {
                throw new Standard(Intrinsics.addStrAndObj("An operation is not implemented: ", "b/138604541: Add onFill() callback for date"));
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public static final void m9968b(C9781a c9781a, ViewStructure viewStructure) {
        Rect m6244a;
        Intrinsics.isThisObjectNull(c9781a, "<this>");
        Intrinsics.isThisObjectNull(viewStructure, "root");
        int m9967a = C9785e.f25722a.m9967a(viewStructure, c9781a.m9972b().m9949a().size());
        for (Map.Entry entry : c9781a.m9972b().m9949a().entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            C9788h c9788h = (C9788h) entry.getValue();
            C9785e c9785e = C9785e.f25722a;
            ViewStructure m9966b = c9785e.m9966b(viewStructure, m9967a);
            if (m9966b != null) {
                C9786f c9786f = C9786f.f25723a;
                AutofillId m9963a = c9786f.m9963a(viewStructure);
                Intrinsics.ifNullDoSomething(m9963a);
                c9786f.m9957g(m9966b, m9963a, intValue);
                c9785e.m9964d(m9966b, intValue, c9781a.m9971c().getContext().getPackageName(), null, null);
                c9786f.m9956h(m9966b, 1);
                List m9952a = c9788h.m9952a();
                ArrayList arrayList = new ArrayList(m9952a.size());
                int size = m9952a.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(C9782b.m9970a((EnumC9790j) m9952a.get(i)));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                c9786f.m9958f(m9966b, (String[]) array);
                if (c9788h.m9951b() == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                p373u0.Rect m9951b = c9788h.m9951b();
                if (m9951b != null && (m6244a = C11069v0.m6244a(m9951b)) != null) {
                    C9785e.f25722a.m9965c(m9966b, m6244a.left, m6244a.top, 0, 0, m6244a.width(), m6244a.height());
                }
            }
            m9967a++;
        }
    }
}
