package kg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p361t3.InterfaceC10379c;

/* renamed from: kg.a */
/* loaded from: classes2.dex */
public final class FriendImage {

    /* renamed from: a */
    private final String f17955a;

    /* renamed from: b */
    private final InterfaceC10379c f17956b;

    /* renamed from: c */
    private final boolean f17957c;

    public FriendImage(String str, InterfaceC10379c interfaceC10379c, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC10379c, "transformation");
        this.f17955a = str;
        this.f17956b = interfaceC10379c;
        this.f17957c = z;
    }

    /* renamed from: a */
    public final String m20365a() {
        return this.f17955a;
    }

    /* renamed from: b */
    public final boolean m20364b() {
        return this.f17957c;
    }

    /* renamed from: c */
    public final InterfaceC10379c m20363c() {
        return this.f17956b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FriendImage) && Intrinsics.equals(this.f17955a, ((FriendImage) obj).f17955a);
    }

    public int hashCode() {
        String str = this.f17955a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public /* synthetic */ FriendImage(String str, InterfaceC10379c interfaceC10379c, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, interfaceC10379c, (i & 4) != 0 ? false : z);
    }
}
