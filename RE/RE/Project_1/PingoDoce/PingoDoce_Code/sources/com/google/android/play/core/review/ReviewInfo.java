package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class ReviewInfo implements Parcelable {
    /* renamed from: b */
    public static ReviewInfo m28527b(PendingIntent pendingIntent) {
        return new C3952a(pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract PendingIntent mo28526a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo28526a(), 0);
    }
}
