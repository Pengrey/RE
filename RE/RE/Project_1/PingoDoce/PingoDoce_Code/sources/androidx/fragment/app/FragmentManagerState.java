package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C1329a();

    /* renamed from: A */
    String f3961A;

    /* renamed from: B */
    ArrayList<String> f3962B;

    /* renamed from: C */
    ArrayList<Bundle> f3963C;

    /* renamed from: D */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f3964D;

    /* renamed from: w */
    ArrayList<FragmentState> f3965w;

    /* renamed from: x */
    ArrayList<String> f3966x;

    /* renamed from: y */
    BackStackState[] f3967y;

    /* renamed from: z */
    int f3968z;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    /* loaded from: classes.dex */
    class C1329a implements Parcelable.Creator<FragmentManagerState> {
        C1329a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f3961A = null;
        this.f3962B = new ArrayList<>();
        this.f3963C = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3965w);
        parcel.writeStringList(this.f3966x);
        parcel.writeTypedArray(this.f3967y, i);
        parcel.writeInt(this.f3968z);
        parcel.writeString(this.f3961A);
        parcel.writeStringList(this.f3962B);
        parcel.writeTypedList(this.f3963C);
        parcel.writeTypedList(this.f3964D);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3961A = null;
        this.f3962B = new ArrayList<>();
        this.f3963C = new ArrayList<>();
        this.f3965w = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3966x = parcel.createStringArrayList();
        this.f3967y = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3968z = parcel.readInt();
        this.f3961A = parcel.readString();
        this.f3962B = parcel.createStringArrayList();
        this.f3963C = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3964D = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
