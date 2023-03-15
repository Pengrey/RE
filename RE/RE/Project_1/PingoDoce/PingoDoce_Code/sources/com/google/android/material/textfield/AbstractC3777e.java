package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes.dex */
public abstract class AbstractC3777e {

    /* renamed from: a */
    TextInputLayout f10733a;

    /* renamed from: b */
    Context f10734b;

    /* renamed from: c */
    CheckableImageButton f10735c;

    /* renamed from: d */
    final int f10736d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3777e(TextInputLayout textInputLayout, int i) {
        this.f10733a = textInputLayout;
        this.f10734b = textInputLayout.getContext();
        this.f10735c = textInputLayout.getEndIconView();
        this.f10736d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo28897a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo28954b(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28953c(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo28952d() {
        return false;
    }
}
