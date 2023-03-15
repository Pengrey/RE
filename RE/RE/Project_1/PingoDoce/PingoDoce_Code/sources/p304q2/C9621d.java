package p304q2;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import p304q2.AbstractC9601b;

/* renamed from: q2.d */
/* loaded from: classes.dex */
public final class C9621d extends AbstractC9601b<C9621d> {

    /* renamed from: s */
    private C9622e f25287s;

    /* renamed from: t */
    private float f25288t;

    /* renamed from: u */
    private boolean f25289u;

    public <K> C9621d(K k, AbstractC9620c<K> abstractC9620c) {
        super(k, abstractC9620c);
        this.f25287s = null;
        this.f25288t = Float.MAX_VALUE;
        this.f25289u = false;
    }

    /* renamed from: o */
    private void m10444o() {
        C9622e c9622e = this.f25287s;
        if (c9622e != null) {
            double m10441a = c9622e.m10441a();
            if (m10441a <= this.f25279g) {
                if (m10441a < this.f25280h) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                return;
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override // p304q2.AbstractC9601b
    /* renamed from: i */
    public void mo10449i() {
        m10444o();
        this.f25287s.m10435g(m10487d());
        super.mo10449i();
    }

    @Override // p304q2.AbstractC9601b
    /* renamed from: k */
    boolean mo10448k(long j) {
        if (this.f25289u) {
            float f = this.f25288t;
            if (f != Float.MAX_VALUE) {
                this.f25287s.m10437e(f);
                this.f25288t = Float.MAX_VALUE;
            }
            this.f25274b = this.f25287s.m10441a();
            this.f25273a = 0.0f;
            this.f25289u = false;
            return true;
        }
        if (this.f25288t != Float.MAX_VALUE) {
            this.f25287s.m10441a();
            long j2 = j / 2;
            AbstractC9601b.C9616o m10434h = this.f25287s.m10434h(this.f25274b, this.f25273a, j2);
            this.f25287s.m10437e(this.f25288t);
            this.f25288t = Float.MAX_VALUE;
            AbstractC9601b.C9616o m10434h2 = this.f25287s.m10434h(m10434h.f25285a, m10434h.f25286b, j2);
            this.f25274b = m10434h2.f25285a;
            this.f25273a = m10434h2.f25286b;
        } else {
            AbstractC9601b.C9616o m10434h3 = this.f25287s.m10434h(this.f25274b, this.f25273a, j);
            this.f25274b = m10434h3.f25285a;
            this.f25273a = m10434h3.f25286b;
        }
        float max = Math.max(this.f25274b, this.f25280h);
        this.f25274b = max;
        float min = Math.min(max, this.f25279g);
        this.f25274b = min;
        if (m10445n(min, this.f25273a)) {
            this.f25274b = this.f25287s.m10441a();
            this.f25273a = 0.0f;
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m10447l(float f) {
        if (m10486e()) {
            this.f25288t = f;
            return;
        }
        if (this.f25287s == null) {
            this.f25287s = new C9622e(f);
        }
        this.f25287s.m10437e(f);
        mo10449i();
    }

    /* renamed from: m */
    public boolean m10446m() {
        return this.f25287s.f25291b > 0.0d;
    }

    /* renamed from: n */
    boolean m10445n(float f, float f2) {
        return this.f25287s.m10439c(f, f2);
    }

    /* renamed from: p */
    public C9621d m10443p(C9622e c9622e) {
        this.f25287s = c9622e;
        return this;
    }

    /* renamed from: q */
    public void m10442q() {
        if (m10446m()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f25278f) {
                    this.f25289u = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
