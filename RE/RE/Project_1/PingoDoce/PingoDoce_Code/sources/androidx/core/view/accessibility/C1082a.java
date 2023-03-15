package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
/* loaded from: classes.dex */
public final class C1082a extends ClickableSpan {

    /* renamed from: w */
    private final int f3418w;

    /* renamed from: x */
    private final C1085c f3419x;

    /* renamed from: y */
    private final int f3420y;

    public C1082a(int i, C1085c c1085c, int i2) {
        this.f3418w = i;
        this.f3419x = c1085c;
        this.f3420y = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3418w);
        this.f3419x.m38573Q(this.f3420y, bundle);
    }
}
