package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: w */
    private final Parcelable f3662w;

    /* renamed from: x */
    public static final AbsSavedState f3661x = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C1254a();

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    /* loaded from: classes.dex */
    class C1254a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        C1254a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3661x;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    /* renamed from: a */
    public final Parcelable m37835a() {
        return this.f3662w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3662w, i);
    }

    private AbsSavedState() {
        this.f3662w = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3662w = parcelable == f3661x ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3662w = readParcelable == null ? f3661x : readParcelable;
    }
}
