package pt.pingodoce.app.data.local.models.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ClubData.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public class ClubData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8688a();

    /* renamed from: w */
    private final List f22479w;

    /* renamed from: x */
    private final String f22480x;

    /* renamed from: y */
    private final List f22481y;

    /* renamed from: z */
    private final List f22482z;

    /* compiled from: ClubData.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.clubs.ClubData$a */
    /* loaded from: classes2.dex */
    public static final class C8688a implements Parcelable.Creator {
        /* renamed from: a */
        public final ClubData mo14154a(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.isThisObjectNull(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(ClubBaby.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ClubData(arrayList, parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final ClubData[] mo14153b(int i) {
            return new ClubData[i];
        }
    }

    public ClubData() {
        this(null, null, null, null, 15, null);
    }

    public ClubData(List list, String str, List list2, List list3) {
        this.f22479w = list;
        this.f22480x = str;
        this.f22481y = list2;
        this.f22482z = list3;
    }

    /* renamed from: a */
    public final List m14625a() {
        return this.f22479w;
    }

    /* renamed from: b */
    public final String m14624b() {
        return this.f22480x;
    }

    /* renamed from: c */
    public final List m14623c() {
        return this.f22481y;
    }

    /* renamed from: d */
    public final List m14622d() {
        return this.f22482z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        List<ClubBaby> list = this.f22479w;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ClubBaby clubBaby : list) {
                clubBaby.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f22480x);
        parcel.writeStringList(this.f22481y);
        parcel.writeStringList(this.f22482z);
    }

    public /* synthetic */ ClubData(List list, String str, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
