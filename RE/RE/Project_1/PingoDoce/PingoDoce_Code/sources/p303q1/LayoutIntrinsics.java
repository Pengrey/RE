package p303q1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import id.InterfaceC6097a;
import kotlin.EnumC6754a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* renamed from: q1.d */
/* loaded from: classes.dex */
public final class LayoutIntrinsics {

    /* renamed from: a */
    private final InterfaceC13178g f25206a;

    /* renamed from: b */
    private final InterfaceC13178g f25207b;

    /* renamed from: c */
    private final InterfaceC13178g f25208c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutIntrinsics.kt */
    /* renamed from: q1.d$a */
    /* loaded from: classes.dex */
    public static final class C9579a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ int f25209w;

        /* renamed from: x */
        final /* synthetic */ CharSequence f25210x;

        /* renamed from: y */
        final /* synthetic */ TextPaint f25211y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9579a(int i, CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f25209w = i;
            this.f25210x = charSequence;
            this.f25211y = textPaint;
        }

        /* renamed from: a */
        public final BoringLayout.Metrics mo42214q() {
            return BoringLayoutFactory.f25198a.m10567b(this.f25210x, this.f25211y, C9592q.m10500a(this.f25209w));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutIntrinsics.kt */
    /* renamed from: q1.d$b */
    /* loaded from: classes.dex */
    public static final class C9580b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ CharSequence f25213x;

        /* renamed from: y */
        final /* synthetic */ TextPaint f25214y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9580b(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f25213x = charSequence;
            this.f25214y = textPaint;
        }

        /* renamed from: a */
        public final Float mo42214q() {
            float floatValue;
            BoringLayout.Metrics m10564a = LayoutIntrinsics.this.m10564a();
            Float valueOf = m10564a == null ? null : Float.valueOf(m10564a.width);
            if (valueOf == null) {
                CharSequence charSequence = this.f25213x;
                floatValue = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f25214y);
            } else {
                floatValue = valueOf.floatValue();
            }
            if (C9583f.m10557b(floatValue, this.f25213x, this.f25214y)) {
                floatValue += 0.5f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutIntrinsics.kt */
    /* renamed from: q1.d$c */
    /* loaded from: classes.dex */
    public static final class C9581c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ CharSequence f25215w;

        /* renamed from: x */
        final /* synthetic */ TextPaint f25216x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9581c(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f25215w = charSequence;
            this.f25216x = textPaint;
        }

        /* renamed from: a */
        public final Float mo42214q() {
            return Float.valueOf(C9583f.m10556c(this.f25215w, this.f25216x));
        }
    }

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i) {
        InterfaceC13178g m1463b;
        InterfaceC13178g m1463b2;
        InterfaceC13178g m1463b3;
        Intrinsics.isThisObjectNull(charSequence, "charSequence");
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        EnumC6754a enumC6754a = EnumC6754a.NONE;
        m1463b = LazyJVM.m1463b(enumC6754a, new C9579a(i, charSequence, textPaint));
        this.f25206a = m1463b;
        m1463b2 = LazyJVM.m1463b(enumC6754a, new C9581c(charSequence, textPaint));
        this.f25207b = m1463b2;
        m1463b3 = LazyJVM.m1463b(enumC6754a, new C9580b(charSequence, textPaint));
        this.f25208c = m1463b3;
    }

    /* renamed from: a */
    public final BoringLayout.Metrics m10564a() {
        return (BoringLayout.Metrics) this.f25206a.getValue();
    }

    /* renamed from: b */
    public final float m10563b() {
        return ((Number) this.f25208c.getValue()).floatValue();
    }

    /* renamed from: c */
    public final float m10562c() {
        return ((Number) this.f25207b.getValue()).floatValue();
    }
}
