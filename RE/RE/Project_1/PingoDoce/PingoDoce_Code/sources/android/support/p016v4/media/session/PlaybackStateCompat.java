package android.support.p016v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p016v4.media.session.C0270g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0255a();

    /* renamed from: A */
    final long f580A;

    /* renamed from: B */
    final int f581B;

    /* renamed from: C */
    final CharSequence f582C;

    /* renamed from: D */
    final long f583D;

    /* renamed from: E */
    List<CustomAction> f584E;

    /* renamed from: F */
    final long f585F;

    /* renamed from: G */
    final Bundle f586G;

    /* renamed from: H */
    private Object f587H;

    /* renamed from: w */
    final int f588w;

    /* renamed from: x */
    final long f589x;

    /* renamed from: y */
    final long f590y;

    /* renamed from: z */
    final float f591z;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    static class C0255a implements Parcelable.Creator<PlaybackStateCompat> {
        C0255a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f588w = i;
        this.f589x = j;
        this.f590y = j2;
        this.f591z = f;
        this.f580A = j3;
        this.f581B = i2;
        this.f582C = charSequence;
        this.f583D = j4;
        this.f584E = new ArrayList(list);
        this.f585F = j5;
        this.f586G = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m41437a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> m41390d = C0270g.m41390d(obj);
        if (m41390d != null) {
            ArrayList arrayList2 = new ArrayList(m41390d.size());
            for (Object obj2 : m41390d) {
                arrayList2.add(CustomAction.m41436a(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0270g.m41385i(obj), C0270g.m41386h(obj), C0270g.m41391c(obj), C0270g.m41387g(obj), C0270g.m41393a(obj), 0, C0270g.m41389e(obj), C0270g.m41388f(obj), arrayList, C0270g.m41392b(obj), Build.VERSION.SDK_INT >= 22 ? C0272h.m41380a(obj) : null);
        playbackStateCompat.f587H = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f588w + ", position=" + this.f589x + ", buffered position=" + this.f590y + ", speed=" + this.f591z + ", updated=" + this.f583D + ", actions=" + this.f580A + ", error code=" + this.f581B + ", error message=" + this.f582C + ", custom actions=" + this.f584E + ", active item id=" + this.f585F + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f588w);
        parcel.writeLong(this.f589x);
        parcel.writeFloat(this.f591z);
        parcel.writeLong(this.f583D);
        parcel.writeLong(this.f590y);
        parcel.writeLong(this.f580A);
        TextUtils.writeToParcel(this.f582C, parcel, i);
        parcel.writeTypedList(this.f584E);
        parcel.writeLong(this.f585F);
        parcel.writeBundle(this.f586G);
        parcel.writeInt(this.f581B);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0254a();

        /* renamed from: A */
        private Object f592A;

        /* renamed from: w */
        private final String f593w;

        /* renamed from: x */
        private final CharSequence f594x;

        /* renamed from: y */
        private final int f595y;

        /* renamed from: z */
        private final Bundle f596z;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        static class C0254a implements Parcelable.Creator<CustomAction> {
            C0254a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f593w = str;
            this.f594x = charSequence;
            this.f595y = i;
            this.f596z = bundle;
        }

        /* renamed from: a */
        public static CustomAction m41436a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0270g.C0271a.m41384a(obj), C0270g.C0271a.m41381d(obj), C0270g.C0271a.m41382c(obj), C0270g.C0271a.m41383b(obj));
            customAction.f592A = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f594x) + ", mIcon=" + this.f595y + ", mExtras=" + this.f596z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f593w);
            TextUtils.writeToParcel(this.f594x, parcel, i);
            parcel.writeInt(this.f595y);
            parcel.writeBundle(this.f596z);
        }

        CustomAction(Parcel parcel) {
            this.f593w = parcel.readString();
            this.f594x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f595y = parcel.readInt();
            this.f596z = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f588w = parcel.readInt();
        this.f589x = parcel.readLong();
        this.f591z = parcel.readFloat();
        this.f583D = parcel.readLong();
        this.f590y = parcel.readLong();
        this.f580A = parcel.readLong();
        this.f582C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f584E = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f585F = parcel.readLong();
        this.f586G = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f581B = parcel.readInt();
    }
}
