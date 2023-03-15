package p129h3;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p489zc.C13778q0;

/* renamed from: h3.l */
/* loaded from: classes.dex */
public final class C5837l {

    /* renamed from: a */
    private static final Set<String> f16239a;

    /* compiled from: ExifUtils.kt */
    /* renamed from: h3.l$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C5838a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16240a;

        static {
            int[] iArr = new int[EnumC5835j.values().length];
            iArr[EnumC5835j.RESPECT_PERFORMANCE.ordinal()] = 1;
            iArr[EnumC5835j.IGNORE.ordinal()] = 2;
            iArr[EnumC5835j.RESPECT_ALL.ordinal()] = 3;
            f16240a = iArr;
        }
    }

    static {
        Set<String> m204f;
        m204f = C13778q0.m204f("image/jpeg", "image/webp", "image/heic", "image/heif");
        f16239a = m204f;
    }

    /* renamed from: a */
    public static final boolean m22961a(C5832h c5832h) {
        return c5832h.m22966a() > 0;
    }

    /* renamed from: b */
    public static final boolean m22960b(C5832h c5832h) {
        return c5832h.m22966a() == 90 || c5832h.m22966a() == 270;
    }

    /* renamed from: c */
    public static final boolean m22959c(EnumC5835j enumC5835j, String str) {
        int i = C5838a.f16240a[enumC5835j.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !f16239a.contains(str)) {
            return false;
        }
        return true;
    }
}
