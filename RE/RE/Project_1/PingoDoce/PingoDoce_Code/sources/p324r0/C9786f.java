package p324r0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import p181jd.Intrinsics;

/* compiled from: AndroidAutofill.android.kt */
/* renamed from: r0.f */
/* loaded from: classes.dex */
public final class C9786f {

    /* renamed from: a */
    public static final C9786f f25723a = new C9786f();

    private C9786f() {
    }

    /* renamed from: a */
    public final AutofillId m9963a(ViewStructure viewStructure) {
        Intrinsics.isThisObjectNull(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    /* renamed from: b */
    public final boolean m9962b(AutofillValue autofillValue) {
        Intrinsics.isThisObjectNull(autofillValue, "value");
        return autofillValue.isDate();
    }

    /* renamed from: c */
    public final boolean m9961c(AutofillValue autofillValue) {
        Intrinsics.isThisObjectNull(autofillValue, "value");
        return autofillValue.isList();
    }

    /* renamed from: d */
    public final boolean m9960d(AutofillValue autofillValue) {
        Intrinsics.isThisObjectNull(autofillValue, "value");
        return autofillValue.isText();
    }

    /* renamed from: e */
    public final boolean m9959e(AutofillValue autofillValue) {
        Intrinsics.isThisObjectNull(autofillValue, "value");
        return autofillValue.isToggle();
    }

    /* renamed from: f */
    public final void m9958f(ViewStructure viewStructure, String[] strArr) {
        Intrinsics.isThisObjectNull(viewStructure, "structure");
        Intrinsics.isThisObjectNull(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    /* renamed from: g */
    public final void m9957g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        Intrinsics.isThisObjectNull(viewStructure, "structure");
        Intrinsics.isThisObjectNull(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    /* renamed from: h */
    public final void m9956h(ViewStructure viewStructure, int i) {
        Intrinsics.isThisObjectNull(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    /* renamed from: i */
    public final CharSequence m9955i(AutofillValue autofillValue) {
        Intrinsics.isThisObjectNull(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        Intrinsics.checkIfNull(textValue, "value.textValue");
        return textValue;
    }
}
