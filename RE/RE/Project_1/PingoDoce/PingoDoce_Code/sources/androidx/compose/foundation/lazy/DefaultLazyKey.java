package androidx.compose.foundation.lazy;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Lazy.android.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* renamed from: w */
    private final int f1962w;

    /* compiled from: Lazy.android.kt */
    /* renamed from: androidx.compose.foundation.lazy.DefaultLazyKey$a */
    /* loaded from: classes.dex */
    public static final class C0628a implements Parcelable.Creator {
        C0628a() {
        }

        /* renamed from: a */
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        /* renamed from: b */
        public DefaultLazyKey[] newArray(int i) {
            return new DefaultLazyKey[i];
        }
    }

    /* compiled from: Lazy.android.kt */
    /* renamed from: androidx.compose.foundation.lazy.DefaultLazyKey$b */
    /* loaded from: classes.dex */
    public static final class C0629b {
        private C0629b() {
        }

        public /* synthetic */ C0629b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0629b(null);
        CREATOR = new C0628a();
    }

    public DefaultLazyKey(int i) {
        this.f1962w = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f1962w == ((DefaultLazyKey) obj).f1962w;
    }

    public int hashCode() {
        return Integer.hashCode(this.f1962w);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f1962w + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "parcel");
        parcel.writeInt(this.f1962w);
    }
}
