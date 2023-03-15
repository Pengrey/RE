package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p263o3.C8001a;
import p263o3.C8002b;
import p263o3.C8005d;
import p263o3.C8006e;
import p263o3.C8009f;
import p263o3.InterfaceC8012g;
import p263o3.InterfaceC8013h;
import p396v3.C11098i;
import p489zc.C13769l0;

/* compiled from: MemoryCache.kt */
/* loaded from: classes.dex */
public interface MemoryCache {

    /* compiled from: MemoryCache.kt */
    /* renamed from: coil.memory.MemoryCache$a */
    /* loaded from: classes.dex */
    public static final class C2186a {

        /* renamed from: a */
        private final Context f6298a;

        /* renamed from: b */
        private double f6299b;

        /* renamed from: c */
        private int f6300c;

        /* renamed from: d */
        private boolean f6301d = true;

        /* renamed from: e */
        private boolean f6302e = true;

        public C2186a(Context context) {
            this.f6298a = context;
            this.f6299b = C11098i.m6151e(context);
        }

        /* renamed from: a */
        public final MemoryCache m34482a() {
            InterfaceC8013h c8002b;
            InterfaceC8012g c8001a;
            int i;
            if (this.f6302e) {
                c8002b = new C8009f();
            } else {
                c8002b = new C8002b();
            }
            if (this.f6301d) {
                double d = this.f6299b;
                if (d > 0.0d) {
                    i = C11098i.m6153c(this.f6298a, d);
                } else {
                    i = this.f6300c;
                }
                if (i > 0) {
                    c8001a = new C8006e(i, c8002b);
                } else {
                    c8001a = new C8001a(c8002b);
                }
            } else {
                c8001a = new C8001a(c8002b);
            }
            return new C8005d(c8001a, c8002b);
        }
    }

    /* compiled from: MemoryCache.kt */
    /* renamed from: coil.memory.MemoryCache$b */
    /* loaded from: classes.dex */
    public static final class C2187b {

        /* renamed from: a */
        private final Bitmap f6303a;

        /* renamed from: b */
        private final Map f6304b;

        public C2187b(Bitmap bitmap, Map map) {
            this.f6303a = bitmap;
            this.f6304b = map;
        }

        /* renamed from: a */
        public final Bitmap m34481a() {
            return this.f6303a;
        }

        /* renamed from: b */
        public final Map m34480b() {
            return this.f6304b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2187b) {
                C2187b c2187b = (C2187b) obj;
                if (Intrinsics.equals(this.f6303a, c2187b.f6303a) && Intrinsics.equals(this.f6304b, c2187b.f6304b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f6303a.hashCode() * 31) + this.f6304b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f6303a + ", extras=" + this.f6304b + ')';
        }
    }

    /* renamed from: a */
    C2187b mo17196a(Key key);

    /* renamed from: b */
    void mo17195b(int i);

    /* renamed from: c */
    void mo17194c(Key key, C2187b c2187b);

    /* compiled from: MemoryCache.kt */
    /* loaded from: classes.dex */
    public static final class Key implements Parcelable {
        @Deprecated
        public static final Parcelable.Creator CREATOR;

        /* renamed from: w */
        private final String f6296w;

        /* renamed from: x */
        private final Map f6297x;

        /* compiled from: MemoryCache.kt */
        /* renamed from: coil.memory.MemoryCache$Key$a */
        /* loaded from: classes.dex */
        public static final class C2184a implements Parcelable.Creator {
            C2184a() {
            }

            /* renamed from: a */
            public Key createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                Intrinsics.ifNullDoSomething(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readString2 = parcel.readString();
                    Intrinsics.ifNullDoSomething(readString2);
                    String readString3 = parcel.readString();
                    Intrinsics.ifNullDoSomething(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new Key(readString, linkedHashMap);
            }

            /* renamed from: b */
            public Key[] newArray(int i) {
                return new Key[i];
            }
        }

        /* compiled from: MemoryCache.kt */
        /* renamed from: coil.memory.MemoryCache$Key$b */
        /* loaded from: classes.dex */
        private static final class C2185b {
            private C2185b() {
            }

            public /* synthetic */ C2185b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C2185b(null);
            CREATOR = new C2184a();
        }

        public Key(String str, Map map) {
            this.f6296w = str;
            this.f6297x = map;
        }

        /* renamed from: b */
        public static /* synthetic */ Key m34486b(Key key, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.f6296w;
            }
            if ((i & 2) != 0) {
                map = key.f6297x;
            }
            return key.m34487a(str, map);
        }

        /* renamed from: a */
        public final Key m34487a(String str, Map map) {
            return new Key(str, map);
        }

        /* renamed from: c */
        public final Map m34485c() {
            return this.f6297x;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (Intrinsics.equals(this.f6296w, key.f6296w) && Intrinsics.equals(this.f6297x, key.f6297x)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f6296w.hashCode() * 31) + this.f6297x.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f6296w + ", extras=" + this.f6297x + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f6296w);
            parcel.writeInt(this.f6297x.size());
            for (Map.Entry entry : this.f6297x.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        public /* synthetic */ Key(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? C13769l0.m334e() : map);
        }
    }
}
