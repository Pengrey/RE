package android.support.p016v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p016v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0251a();

        /* renamed from: w */
        ResultReceiver f572w;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        /* loaded from: classes.dex */
        static class C0251a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0251a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f572w = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f572w.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0252a();

        /* renamed from: w */
        private final Object f573w;

        /* renamed from: x */
        private InterfaceC0258b f574x;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        /* loaded from: classes.dex */
        static class C0252a implements Parcelable.Creator<Token> {
            C0252a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object readStrongBinder;
                if (Build.VERSION.SDK_INT >= 21) {
                    readStrongBinder = parcel.readParcelable(null);
                } else {
                    readStrongBinder = parcel.readStrongBinder();
                }
                return new Token(readStrongBinder);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public InterfaceC0258b m41444a() {
            return this.f574x;
        }

        /* renamed from: b */
        public void m41443b(InterfaceC0258b interfaceC0258b) {
            this.f574x = interfaceC0258b;
        }

        /* renamed from: c */
        public void m41442c(Bundle bundle) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Token) {
                Token token = (Token) obj;
                Object obj2 = this.f573w;
                if (obj2 == null) {
                    return token.f573w == null;
                }
                Object obj3 = token.f573w;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f573w;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f573w, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f573w);
            }
        }

        Token(Object obj, InterfaceC0258b interfaceC0258b, Bundle bundle) {
            this.f573w = obj;
            this.f574x = interfaceC0258b;
        }
    }

    /* renamed from: a */
    public static void m41451a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0250a();

        /* renamed from: w */
        private final MediaDescriptionCompat f569w;

        /* renamed from: x */
        private final long f570x;

        /* renamed from: y */
        private Object f571y;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        /* loaded from: classes.dex */
        static class C0250a implements Parcelable.Creator<QueueItem> {
            C0250a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j != -1) {
                this.f569w = mediaDescriptionCompat;
                this.f570x = j;
                this.f571y = obj;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        /* renamed from: a */
        public static QueueItem m41450a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m41491a(C0269f.m41395a(obj)), C0269f.m41394b(obj));
        }

        /* renamed from: b */
        public static List<QueueItem> m41449b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m41450a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f569w + ", Id=" + this.f570x + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f569w.writeToParcel(parcel, i);
            parcel.writeLong(this.f570x);
        }

        QueueItem(Parcel parcel) {
            this.f569w = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f570x = parcel.readLong();
        }
    }
}
