package p303q1;

import android.os.Build;
import android.text.StaticLayout;
import p181jd.Intrinsics;

/* renamed from: q1.h */
/* loaded from: classes.dex */
final class StaticLayoutFactory implements InterfaceC9587l {
    /* renamed from: a */
    public StaticLayout mo10548a(C9590n c9590n) {
        Intrinsics.isThisObjectNull(c9590n, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(c9590n.m10525p(), c9590n.m10526o(), c9590n.m10536e(), c9590n.m10528m(), c9590n.m10522s());
        obtain.setTextDirection(c9590n.m10524q());
        obtain.setAlignment(c9590n.m10540a());
        obtain.setMaxLines(c9590n.m10529l());
        obtain.setEllipsize(c9590n.m10538c());
        obtain.setEllipsizedWidth(c9590n.m10537d());
        obtain.setLineSpacing(c9590n.m10531j(), c9590n.m10530k());
        obtain.setIncludePad(c9590n.m10534g());
        obtain.setBreakStrategy(c9590n.m10539b());
        obtain.setHyphenationFrequency(c9590n.m10535f());
        obtain.setIndents(c9590n.m10532i(), c9590n.m10527n());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            C9584i c9584i = C9584i.f25218a;
            Intrinsics.checkIfNull(obtain, "this");
            c9584i.m10552a(obtain, c9590n.m10533h());
        }
        if (i >= 28) {
            C9585j c9585j = C9585j.f25219a;
            Intrinsics.checkIfNull(obtain, "this");
            c9585j.m10551a(obtain, c9590n.m10523r());
        }
        StaticLayout build = obtain.build();
        Intrinsics.checkIfNull(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
