package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import p181jd.Intrinsics;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwaySetup;

/* compiled from: TakeAwayFlowData.kt */
/* loaded from: classes2.dex */
public final class TakeAwayFlowData implements FlowData {
    public static final Parcelable.Creator CREATOR = new C8678a();

    /* renamed from: w */
    private final TakeAwaySetup f22435w;

    /* renamed from: x */
    private final TakeAwayCheckout f22436x;

    /* compiled from: TakeAwayFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.TakeAwayFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8678a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwayFlowData createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new TakeAwayFlowData((TakeAwaySetup) TakeAwaySetup.CREATOR.createFromParcel(parcel), (TakeAwayCheckout) TakeAwayCheckout.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final TakeAwayFlowData[] newArray(int i) {
            return new TakeAwayFlowData[i];
        }
    }

    public TakeAwayFlowData(TakeAwaySetup takeAwaySetup, TakeAwayCheckout takeAwayCheckout) {
        Intrinsics.isThisObjectNull(takeAwaySetup, "setup");
        Intrinsics.isThisObjectNull(takeAwayCheckout, "checkout");
        this.f22435w = takeAwaySetup;
        this.f22436x = takeAwayCheckout;
    }

    /* renamed from: a */
    public final TakeAwayCheckout m14690a() {
        return this.f22436x;
    }

    /* renamed from: b */
    public final TakeAwaySetup m14689b() {
        return this.f22435w;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        this.f22435w.writeToParcel(parcel, i);
        this.f22436x.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TakeAwayFlowData(pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder r24) {
        /*
            r23 = this;
            java.lang.String r0 = "order"
            r1 = r24
            p181jd.Intrinsics.isThisObjectNull(r1, r0)
            pt.pingodoce.app.presentation.takeaway.models.TakeAwaySetup r0 = new pt.pingodoce.app.presentation.takeaway.models.TakeAwaySetup
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 31
            r9 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout r2 = new pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout
            java.lang.String r11 = r24.m14283c()
            java.lang.String r12 = r24.m14272s()
            java.lang.String r13 = r24.m14273r()
            java.lang.String r14 = r24.m14275m()
            int r15 = r24.m14274n()
            java.lang.String r16 = r24.m14271t()
            java.lang.String r3 = r24.m14270v()
            java.lang.String r4 = "order.pickUpHourLabel()"
            p181jd.Intrinsics.checkIfNull(r3, r4)
            java.lang.String r18 = r24.m14279h()
            java.lang.String r19 = r24.m14278i()
            java.lang.String r20 = r24.m14280f()
            java.lang.String r21 = r24.m14284b()
            boolean r22 = r24.m14285a()
            r10 = r2
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r23
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.data.local.flows.TakeAwayFlowData.<init>(pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder):void");
    }
}
