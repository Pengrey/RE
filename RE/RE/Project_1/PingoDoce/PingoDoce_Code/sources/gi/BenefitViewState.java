package gi;

import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Benefit;

/* renamed from: gi.b */
/* loaded from: classes2.dex */
public final class BenefitViewState implements InterfaceC5692d {

    /* renamed from: a */
    private final Benefit f15941a;

    public BenefitViewState(Benefit benefit) {
        Intrinsics.isThisObjectNull(benefit, "benefit");
        this.f15941a = benefit;
    }

    /* renamed from: a */
    public EnumC5690a mo23336a() {
        return EnumC5690a.BenefitRow;
    }

    /* renamed from: b */
    public final Benefit m23338b() {
        return this.f15941a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitViewState) && Intrinsics.equals(this.f15941a, ((BenefitViewState) obj).f15941a);
    }

    public int hashCode() {
        return this.f15941a.hashCode();
    }

    public String toString() {
        Benefit benefit = this.f15941a;
        return "BenefitViewStateRow(benefit=" + benefit + ")";
    }
}
