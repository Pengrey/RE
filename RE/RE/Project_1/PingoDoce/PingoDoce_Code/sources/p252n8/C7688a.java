package p252n8;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0969a;
import p100f8.C5419b;
import p198k8.C6608a;
import p354s8.C10085b;

/* renamed from: n8.a */
/* loaded from: classes.dex */
public class C7688a {

    /* renamed from: f */
    private static final int f20275f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    private final boolean f20276a;

    /* renamed from: b */
    private final int f20277b;

    /* renamed from: c */
    private final int f20278c;

    /* renamed from: d */
    private final int f20279d;

    /* renamed from: e */
    private final float f20280e;

    public C7688a(Context context) {
        this(C10085b.m9233b(context, C5419b.elevationOverlayEnabled, false), C6608a.m20506b(context, C5419b.elevationOverlayColor, 0), C6608a.m20506b(context, C5419b.elevationOverlayAccentColor, 0), C6608a.m20506b(context, C5419b.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: f */
    private boolean m17712f(int i) {
        return C0969a.m38939j(i, 255) == this.f20279d;
    }

    /* renamed from: a */
    public float m17717a(float f) {
        float f2 = this.f20280e;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m17716b(int i, float f) {
        int i2;
        float m17717a = m17717a(f);
        int alpha = Color.alpha(i);
        int m20500h = C6608a.m20500h(C0969a.m38939j(i, 255), this.f20277b, m17717a);
        if (m17717a > 0.0f && (i2 = this.f20278c) != 0) {
            m20500h = C6608a.m20501g(m20500h, C0969a.m38939j(i2, f20275f));
        }
        return C0969a.m38939j(m20500h, alpha);
    }

    /* renamed from: c */
    public int m17715c(int i, float f) {
        return (this.f20276a && m17712f(i)) ? m17716b(i, f) : i;
    }

    /* renamed from: d */
    public int m17714d(float f) {
        return m17715c(this.f20279d, f);
    }

    /* renamed from: e */
    public boolean m17713e() {
        return this.f20276a;
    }

    public C7688a(boolean z, int i, int i2, int i3, float f) {
        this.f20276a = z;
        this.f20277b = i;
        this.f20278c = i2;
        this.f20279d = i3;
        this.f20280e = f;
    }
}
