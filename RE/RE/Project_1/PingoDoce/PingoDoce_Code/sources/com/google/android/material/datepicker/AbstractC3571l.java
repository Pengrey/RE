package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
abstract class AbstractC3571l<S> extends Fragment {

    /* renamed from: w0 */
    protected final LinkedHashSet<AbstractC3570k<S>> f9928w0 = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2 */
    public boolean mo29860g2(AbstractC3570k<S> abstractC3570k) {
        return this.f9928w0.add(abstractC3570k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2 */
    public void m29859h2() {
        this.f9928w0.clear();
    }
}
