package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0301a();

    /* renamed from: w */
    private final IntentSender f675w;

    /* renamed from: x */
    private final Intent f676x;

    /* renamed from: y */
    private final int f677y;

    /* renamed from: z */
    private final int f678z;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    /* loaded from: classes.dex */
    class C0301a implements Parcelable.Creator<IntentSenderRequest> {
        C0301a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IntentSenderRequest mo41329a(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IntentSenderRequest[] mo41328b(int i) {
            return new IntentSenderRequest[i];
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f675w = intentSender;
        this.f676x = intent;
        this.f677y = i;
        this.f678z = i2;
    }

    /* renamed from: a */
    public Intent m41333a() {
        return this.f676x;
    }

    /* renamed from: b */
    public int m41332b() {
        return this.f677y;
    }

    /* renamed from: c */
    public int m41331c() {
        return this.f678z;
    }

    /* renamed from: d */
    public IntentSender m41330d() {
        return this.f675w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f675w, i);
        parcel.writeParcelable(this.f676x, i);
        parcel.writeInt(this.f677y);
        parcel.writeInt(this.f678z);
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    /* loaded from: classes.dex */
    public static final class C0302b {

        /* renamed from: a */
        private IntentSender f679a;

        /* renamed from: b */
        private Intent f680b;

        /* renamed from: c */
        private int f681c;

        /* renamed from: d */
        private int f682d;

        public C0302b(IntentSender intentSender) {
            this.f679a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest m41327a() {
            return new IntentSenderRequest(this.f679a, this.f680b, this.f681c, this.f682d);
        }

        /* renamed from: b */
        public C0302b m41326b(Intent intent) {
            this.f680b = intent;
            return this;
        }

        /* renamed from: c */
        public C0302b m41325c(int i, int i2) {
            this.f682d = i;
            this.f681c = i2;
            return this;
        }

        public C0302b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    IntentSenderRequest(Parcel parcel) {
        this.f675w = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f676x = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f677y = parcel.readInt();
        this.f678z = parcel.readInt();
    }
}
