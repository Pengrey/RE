package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0295a();

    /* renamed from: w */
    private final int f651w;

    /* renamed from: x */
    private final Intent f652x;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    /* loaded from: classes.dex */
    class C0295a implements Parcelable.Creator<ActivityResult> {
        C0295a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ActivityResult mo41349a(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ActivityResult[] mo41348b(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f651w = i;
        this.f652x = intent;
    }

    /* renamed from: c */
    public static String m41350c(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m41352a() {
        return this.f652x;
    }

    /* renamed from: b */
    public int m41351b() {
        return this.f651w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m41350c(this.f651w) + ", data=" + this.f652x + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f651w);
        parcel.writeInt(this.f652x == null ? 0 : 1);
        Intent intent = this.f652x;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f651w = parcel.readInt();
        this.f652x = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
