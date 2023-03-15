package pt.pingodoce.app.presentation.common.search.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.CriteriaResponse;

/* compiled from: Criteria.kt */
/* loaded from: classes2.dex */
public final class Criteria implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9142a();

    /* renamed from: w */
    private final CriteriaResponse f24091w;

    /* renamed from: x */
    private final boolean f24092x;

    /* compiled from: Criteria.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.models.Criteria$a */
    /* loaded from: classes2.dex */
    public static final class C9142a implements Parcelable.Creator {
        /* renamed from: a */
        public final Criteria mo11423a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Criteria((CriteriaResponse) CriteriaResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final Criteria[] mo11422b(int i) {
            return new Criteria[i];
        }
    }

    public Criteria(CriteriaResponse criteriaResponse, boolean z) {
        Intrinsics.isThisObjectNull(criteriaResponse, "criteria");
        this.f24091w = criteriaResponse;
        this.f24092x = z;
    }

    /* renamed from: b */
    public static /* synthetic */ Criteria m12335b(Criteria criteria, CriteriaResponse criteriaResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            criteriaResponse = criteria.f24091w;
        }
        if ((i & 2) != 0) {
            z = criteria.f24092x;
        }
        return criteria.m12336a(criteriaResponse, z);
    }

    /* renamed from: a */
    public final Criteria m12336a(CriteriaResponse criteriaResponse, boolean z) {
        Intrinsics.isThisObjectNull(criteriaResponse, "criteria");
        return new Criteria(criteriaResponse, z);
    }

    /* renamed from: c */
    public final CriteriaResponse m12334c() {
        return this.f24091w;
    }

    /* renamed from: d */
    public final boolean m12333d() {
        return this.f24092x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Criteria) {
            Criteria criteria = (Criteria) obj;
            return Intrinsics.equals(this.f24091w, criteria.f24091w) && this.f24092x == criteria.f24092x;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f24091w.hashCode() * 31;
        boolean z = this.f24092x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        CriteriaResponse criteriaResponse = this.f24091w;
        boolean z = this.f24092x;
        return "Criteria(criteria=" + criteriaResponse + ", isChecked=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        this.f24091w.writeToParcel(parcel, i);
        parcel.writeInt(this.f24092x ? 1 : 0);
    }

    public /* synthetic */ Criteria(CriteriaResponse criteriaResponse, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(criteriaResponse, (i & 2) != 0 ? false : z);
    }
}
