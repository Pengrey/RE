package p345s;

import p181jd.Intrinsics;

/* renamed from: s.l */
/* loaded from: classes.dex */
public final class C9962l extends AbstractC9976o {

    /* renamed from: a */
    private float f26096a;

    /* renamed from: b */
    private final int f26097b;

    public C9962l(float f) {
        super(null);
        this.f26096a = f;
        this.f26097b = 1;
    }

    /* renamed from: a */
    public float mo9486a(int i) {
        if (i == 0) {
            return this.f26096a;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public int mo9485b() {
        return this.f26097b;
    }

    /* renamed from: d */
    public void mo9483d() {
        this.f26096a = 0.0f;
    }

    /* renamed from: e */
    public void mo9482e(int i, float f) {
        if (i == 0) {
            this.f26096a = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9962l) {
            if (((C9962l) obj).f26096a == this.f26096a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final float m9519f() {
        return this.f26096a;
    }

    /* renamed from: g */
    public C9962l mo9513h() {
        return new C9962l(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f26096a);
    }

    public String toString() {
        return Intrinsics.addStrAndObj("AnimationVector1D: value = ", Float.valueOf(this.f26096a));
    }
}
