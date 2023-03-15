package p459y3;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2201d;
import p130h4.C5852h;
import p152i4.C6013a;

/* renamed from: y3.h */
/* loaded from: classes.dex */
public class C13091h extends C6013a<PointF> {

    /* renamed from: q */
    private Path f34025q;

    /* renamed from: r */
    private final C6013a<PointF> f34026r;

    public C13091h(C2201d c2201d, C6013a<PointF> c6013a) {
        super(c2201d, c6013a.f16603b, c6013a.f16604c, c6013a.f16605d, c6013a.f16606e, c6013a.f16607f, c6013a.f16608g, c6013a.f16609h);
        this.f34026r = c6013a;
        m1658i();
    }

    /* renamed from: i */
    public void m1658i() {
        T t;
        T t2;
        T t3 = this.f16604c;
        boolean z = (t3 == 0 || (t2 = this.f16603b) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.f16603b;
        if (t4 == 0 || (t = this.f16604c) == 0 || z) {
            return;
        }
        C6013a<PointF> c6013a = this.f34026r;
        this.f34025q = C5852h.m22887d((PointF) t4, (PointF) t, c6013a.f16616o, c6013a.f16617p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Path m1657j() {
        return this.f34025q;
    }
}
