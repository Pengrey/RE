package p351s5;

import java.io.Serializable;
import java.util.UUID;
import p181jd.Intrinsics;

/* renamed from: s5.b */
/* loaded from: classes.dex */
public final class RecyclerPickerDialogFragment implements Serializable {

    /* renamed from: w */
    private final String f26318w;

    /* renamed from: x */
    private boolean f26319x;

    /* renamed from: y */
    private final String f26320y;

    public RecyclerPickerDialogFragment(String str) {
        Intrinsics.isThisObjectNull(str, "text");
        this.f26320y = str;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkIfNull(uuid, "UUID.randomUUID().toString()");
        this.f26318w = uuid;
    }

    /* renamed from: a */
    public final String m9277a() {
        return this.f26318w;
    }

    /* renamed from: b */
    public final String m9276b() {
        return this.f26320y;
    }

    /* renamed from: c */
    public final boolean m9275c() {
        return this.f26319x;
    }

    /* renamed from: d */
    public final void m9274d(boolean z) {
        this.f26319x = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RecyclerPickerDialogFragment) && Intrinsics.equals(this.f26320y, ((RecyclerPickerDialogFragment) obj).f26320y);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f26320y;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Item(text=" + this.f26320y + ")";
    }
}
