package p120g8;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: g8.i */
/* loaded from: classes.dex */
public class C5624i {

    /* renamed from: a */
    private long f15868a;

    /* renamed from: b */
    private long f15869b;

    /* renamed from: c */
    private TimeInterpolator f15870c;

    /* renamed from: d */
    private int f15871d;

    /* renamed from: e */
    private int f15872e;

    public C5624i(long j, long j2) {
        this.f15868a = 0L;
        this.f15869b = 300L;
        this.f15870c = null;
        this.f15871d = 0;
        this.f15872e = 1;
        this.f15868a = j;
        this.f15869b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5624i m23538b(ValueAnimator valueAnimator) {
        C5624i c5624i = new C5624i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m23534f(valueAnimator));
        c5624i.f15871d = valueAnimator.getRepeatCount();
        c5624i.f15872e = valueAnimator.getRepeatMode();
        return c5624i;
    }

    /* renamed from: f */
    private static TimeInterpolator m23534f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return C5616a.f15855c;
            }
            return interpolator instanceof DecelerateInterpolator ? C5616a.f15856d : interpolator;
        }
        return C5616a.f15854b;
    }

    /* renamed from: a */
    public void m23539a(Animator animator) {
        animator.setStartDelay(m23537c());
        animator.setDuration(m23536d());
        animator.setInterpolator(m23535e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m23533g());
            valueAnimator.setRepeatMode(m23532h());
        }
    }

    /* renamed from: c */
    public long m23537c() {
        return this.f15868a;
    }

    /* renamed from: d */
    public long m23536d() {
        return this.f15869b;
    }

    /* renamed from: e */
    public TimeInterpolator m23535e() {
        TimeInterpolator timeInterpolator = this.f15870c;
        return timeInterpolator != null ? timeInterpolator : C5616a.f15854b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5624i) {
            C5624i c5624i = (C5624i) obj;
            if (m23537c() == c5624i.m23537c() && m23536d() == c5624i.m23536d() && m23533g() == c5624i.m23533g() && m23532h() == c5624i.m23532h()) {
                return m23535e().getClass().equals(c5624i.m23535e().getClass());
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public int m23533g() {
        return this.f15871d;
    }

    /* renamed from: h */
    public int m23532h() {
        return this.f15872e;
    }

    public int hashCode() {
        return (((((((((int) (m23537c() ^ (m23537c() >>> 32))) * 31) + ((int) (m23536d() ^ (m23536d() >>> 32)))) * 31) + m23535e().getClass().hashCode()) * 31) + m23533g()) * 31) + m23532h();
    }

    public String toString() {
        return '\n' + C5624i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m23537c() + " duration: " + m23536d() + " interpolator: " + m23535e().getClass() + " repeatCount: " + m23533g() + " repeatMode: " + m23532h() + "}\n";
    }

    public C5624i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f15868a = 0L;
        this.f15869b = 300L;
        this.f15870c = null;
        this.f15871d = 0;
        this.f15872e = 1;
        this.f15868a = j;
        this.f15869b = j2;
        this.f15870c = timeInterpolator;
    }
}
