package p412w1;

import android.text.TextPaint;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p393v0.C10995a1;
import p393v0.C11003c0;
import p393v0.Color;
import p457y1.TextDecoration;

/* compiled from: AndroidTextPaint.android.kt */
/* renamed from: w1.g */
/* loaded from: classes.dex */
public final class C11542g extends TextPaint {

    /* renamed from: a */
    private TextDecoration f29557a;

    /* renamed from: b */
    private C10995a1 f29558b;

    public C11542g(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.f29557a = TextDecoration.f33972b.m1722b();
        this.f29558b = C10995a1.f28306d.m6626a();
    }

    /* renamed from: a */
    public final void m4762a(long j) {
        int m6587i;
        if (!(j != Color.f28297b.m6632f()) || getColor() == (m6587i = C11003c0.m6587i(j))) {
            return;
        }
        setColor(m6587i);
    }

    /* renamed from: b */
    public final void m4761b(C10995a1 c10995a1) {
        if (c10995a1 == null) {
            c10995a1 = C10995a1.f28306d.m6626a();
        }
        if (Intrinsics.equals(this.f29558b, c10995a1)) {
            return;
        }
        this.f29558b = c10995a1;
        if (Intrinsics.equals(c10995a1, C10995a1.f28306d.m6626a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(this.f29558b.m6629b(), C10774f.m7145k(this.f29558b.m6627d()), C10774f.m7144l(this.f29558b.m6627d()), C11003c0.m6587i(this.f29558b.m6628c()));
        }
    }

    /* renamed from: c */
    public final void m4760c(TextDecoration textDecoration) {
        if (textDecoration == null) {
            textDecoration = TextDecoration.f33972b.m1722b();
        }
        if (Intrinsics.equals(this.f29557a, textDecoration)) {
            return;
        }
        this.f29557a = textDecoration;
        TextDecoration.C13063a c13063a = TextDecoration.f33972b;
        setUnderlineText(textDecoration.m1725d(c13063a.m1721c()));
        setStrikeThruText(this.f29557a.m1725d(c13063a.m1723a()));
    }
}
