package p396v3;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import p305q3.C9623a;
import p305q3.C9629g;
import p327r3.C9800d;
import p327r3.EnumC9801e;
import p327r3.InterfaceC9809l;
import p349s3.InterfaceC10042b;

/* renamed from: v3.h */
/* loaded from: classes.dex */
public final class C11096h {

    /* renamed from: a */
    private static final C9623a f28483a = new C9623a(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    /* compiled from: Requests.kt */
    /* renamed from: v3.h$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11097a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28484a;

        static {
            int[] iArr = new int[EnumC9801e.values().length];
            iArr[EnumC9801e.EXACT.ordinal()] = 1;
            iArr[EnumC9801e.INEXACT.ordinal()] = 2;
            iArr[EnumC9801e.AUTOMATIC.ordinal()] = 3;
            f28484a = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m6159a(C9629g c9629g) {
        int i = C11097a.f28484a[c9629g.m10390H().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if ((c9629g.m10363q().m10406m() != null || !(c9629g.m10387K() instanceof C9800d)) && (!(c9629g.m10385M() instanceof InterfaceC10042b) || !(c9629g.m10387K() instanceof InterfaceC9809l) || !(((InterfaceC10042b) c9629g.m10385M()).mo9340j() instanceof ImageView) || ((InterfaceC10042b) c9629g.m10385M()).mo9340j() != ((InterfaceC9809l) c9629g.m10387K()).mo9939j())) {
                        return false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final C9623a m6158b() {
        return f28483a;
    }

    /* renamed from: c */
    public static final Drawable m6157c(C9629g c9629g, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable == null) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return null;
                }
                return C11092d.m6168a(c9629g.m10368l(), num.intValue());
            }
            return drawable2;
        }
        return drawable;
    }
}
