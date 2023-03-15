package androidx.compose.p018ui.platform;

import p181jd.Intrinsics;

/* renamed from: androidx.compose.ui.platform.m1 */
/* loaded from: classes.dex */
public final class InspectableValue {

    /* renamed from: a */
    private final String f2319a;

    /* renamed from: b */
    private final Object f2320b;

    public InspectableValue(String str, Object obj) {
        Intrinsics.isThisObjectNull(str, "name");
        this.f2319a = str;
        this.f2320b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspectableValue) {
            InspectableValue inspectableValue = (InspectableValue) obj;
            return Intrinsics.equals(this.f2319a, inspectableValue.f2319a) && Intrinsics.equals(this.f2320b, inspectableValue.f2320b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f2319a.hashCode() * 31;
        Object obj = this.f2320b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f2319a + ", value=" + this.f2320b + ')';
    }
}
