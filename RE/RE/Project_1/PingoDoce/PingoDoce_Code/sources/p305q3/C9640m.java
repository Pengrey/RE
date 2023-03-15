package p305q3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.AbstractC1469p;
import coil.request.BaseRequestDelegate;
import coil.request.EnumC2188a;
import coil.request.NullRequestDataException;
import coil.request.RequestDelegate;
import coil.request.ViewTargetRequestDelegate;
import p095f3.InterfaceC5359e;
import p181jd.Intrinsics;
import p327r3.AbstractC9797c;
import p327r3.C9805i;
import p327r3.EnumC9804h;
import p349s3.InterfaceC10041a;
import p349s3.InterfaceC10042b;
import p396v3.AbstractC11103m;
import p396v3.C11089a;
import p396v3.C11094f;
import p396v3.C11096h;
import p396v3.C11098i;
import p396v3.ComponentCallbacks2C11110s;
import p396v3.InterfaceC11108q;
import p489zc._Arrays;
import td.InterfaceC10574t1;

/* renamed from: q3.m */
/* loaded from: classes.dex */
public final class C9640m {

    /* renamed from: a */
    private final InterfaceC5359e f25438a;

    /* renamed from: b */
    private final ComponentCallbacks2C11110s f25439b;

    /* renamed from: c */
    private final AbstractC11103m f25440c;

    public C9640m(InterfaceC5359e interfaceC5359e, ComponentCallbacks2C11110s componentCallbacks2C11110s, InterfaceC11108q interfaceC11108q) {
        this.f25438a = interfaceC5359e;
        this.f25439b = componentCallbacks2C11110s;
        this.f25440c = C11094f.m6161a(interfaceC11108q);
    }

    /* renamed from: d */
    private final boolean m10307d(C9629g c9629g, C9805i c9805i) {
        return m10308c(c9629g, c9629g.m10370j()) && this.f25440c.mo6118a(c9805i);
    }

    /* renamed from: e */
    private final boolean m10306e(C9629g c9629g) {
        boolean m272z;
        if (!c9629g.m10383O().isEmpty()) {
            m272z = _Arrays.m272z(C11098i.m6140p(), c9629g.m10370j());
            if (!m272z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m10310a(C9635k c9635k) {
        return !C11089a.m6173d(c9635k.m10325f()) || this.f25440c.mo6117b();
    }

    /* renamed from: b */
    public final C9626d m10309b(C9629g c9629g, Throwable th2) {
        Drawable m10360t;
        if (th2 instanceof NullRequestDataException) {
            m10360t = c9629g.m10359u();
            if (m10360t == null) {
                m10360t = c9629g.m10360t();
            }
        } else {
            m10360t = c9629g.m10360t();
        }
        return new C9626d(m10360t, c9629g, th2);
    }

    /* renamed from: c */
    public final boolean m10308c(C9629g c9629g, Bitmap.Config config) {
        if (C11089a.m6173d(config)) {
            if (c9629g.m10372h()) {
                InterfaceC10041a m10385M = c9629g.m10385M();
                if (m10385M instanceof InterfaceC10042b) {
                    View mo9340j = ((InterfaceC10042b) m10385M).mo9340j();
                    if (mo9340j.isAttachedToWindow() && !mo9340j.isHardwareAccelerated()) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C9635k m10305f(C9629g c9629g, C9805i c9805i) {
        EnumC2188a enumC2188a;
        EnumC9804h enumC9804h;
        Bitmap.Config m10370j = m10306e(c9629g) && m10307d(c9629g, c9805i) ? c9629g.m10370j() : Bitmap.Config.ARGB_8888;
        if (this.f25439b.m6112b()) {
            enumC2188a = c9629g.m10394D();
        } else {
            enumC2188a = EnumC2188a.DISABLED;
        }
        EnumC2188a enumC2188a2 = enumC2188a;
        boolean z = c9629g.m10371i() && c9629g.m10383O().isEmpty() && m10370j != Bitmap.Config.ALPHA_8;
        AbstractC9797c m9942d = c9805i.m9942d();
        AbstractC9797c.C9799b c9799b = AbstractC9797c.C9799b.f25739a;
        if (!Intrinsics.equals(m9942d, c9799b) && !Intrinsics.equals(c9805i.m9943c(), c9799b)) {
            enumC9804h = c9629g.m10388J();
        } else {
            enumC9804h = EnumC9804h.FIT;
        }
        return new C9635k(c9629g.m10368l(), m10370j, c9629g.m10369k(), c9805i, enumC9804h, C11096h.m6159a(c9629g), z, c9629g.m10389I(), c9629g.m10362r(), c9629g.m10356x(), c9629g.m10386L(), c9629g.m10393E(), c9629g.m10395C(), c9629g.m10361s(), enumC2188a2);
    }

    /* renamed from: g */
    public final RequestDelegate m10304g(C9629g c9629g, InterfaceC10574t1 interfaceC10574t1) {
        AbstractC1469p m10354z = c9629g.m10354z();
        InterfaceC10041a m10385M = c9629g.m10385M();
        if (m10385M instanceof InterfaceC10042b) {
            return new ViewTargetRequestDelegate(this.f25438a, c9629g, (InterfaceC10042b) m10385M, m10354z, interfaceC10574t1);
        }
        return new BaseRequestDelegate(m10354z, interfaceC10574t1);
    }
}
