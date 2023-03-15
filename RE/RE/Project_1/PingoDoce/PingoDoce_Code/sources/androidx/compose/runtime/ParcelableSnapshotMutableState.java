package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5209j1;
import p092f0.SnapshotMutationPolicy;
import p092f0.SnapshotState;
import p181jd.Intrinsics;

/* compiled from: ParcelableSnapshotMutableState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends SnapshotState implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* compiled from: ParcelableSnapshotMutableState.kt */
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    /* loaded from: classes.dex */
    public static final class C0644a implements Parcelable.ClassLoaderCreator {
        C0644a() {
        }

        /* renamed from: a */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        /* renamed from: b */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotMutationPolicy m25071g;
            Intrinsics.isThisObjectNull(parcel, "parcel");
            if (classLoader == null) {
                classLoader = C0644a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                m25071g = C5209j1.m25071g();
            } else if (readInt == 1) {
                m25071g = C5209j1.m25065m();
            } else if (readInt == 2) {
                m25071g = C5209j1.m25068j();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new ParcelableSnapshotMutableState(readValue, m25071g);
        }

        /* renamed from: c */
        public ParcelableSnapshotMutableState[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    }

    /* compiled from: ParcelableSnapshotMutableState.kt */
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$b */
    /* loaded from: classes.dex */
    public static final class C0645b {
        private C0645b() {
        }

        public /* synthetic */ C0645b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0645b(null);
        CREATOR = new C0644a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        super(obj, snapshotMutationPolicy);
        Intrinsics.isThisObjectNull(snapshotMutationPolicy, "policy");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intrinsics.isThisObjectNull(parcel, "parcel");
        parcel.writeValue(getValue());
        SnapshotMutationPolicy mo17279d = mo17279d();
        if (Intrinsics.equals(mo17279d, C5209j1.m25071g())) {
            i2 = 0;
        } else if (Intrinsics.equals(mo17279d, C5209j1.m25065m())) {
            i2 = 1;
        } else if (!Intrinsics.equals(mo17279d, C5209j1.m25068j())) {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        } else {
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
