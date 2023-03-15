package p324r0;

import android.view.View;
import android.view.autofill.AutofillManager;
import p181jd.Intrinsics;

/* compiled from: AndroidAutofill.android.kt */
/* renamed from: r0.a */
/* loaded from: classes.dex */
public final class C9781a implements InterfaceC9784d {

    /* renamed from: a */
    private final View f25718a;

    /* renamed from: b */
    private final AutofillTree f25719b;

    /* renamed from: c */
    private final AutofillManager f25720c;

    public C9781a(View view, AutofillTree autofillTree) {
        Intrinsics.isThisObjectNull(view, "view");
        Intrinsics.isThisObjectNull(autofillTree, "autofillTree");
        this.f25718a = view;
        this.f25719b = autofillTree;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f25720c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    /* renamed from: a */
    public final AutofillManager m9973a() {
        return this.f25720c;
    }

    /* renamed from: b */
    public final AutofillTree m9972b() {
        return this.f25719b;
    }

    /* renamed from: c */
    public final View m9971c() {
        return this.f25718a;
    }
}
