package androidx.compose.p018ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p181jd.Intrinsics;
import p337rd.InterfaceC9870e;

/* compiled from: InspectableValue.kt */
/* renamed from: androidx.compose.ui.platform.n1 */
/* loaded from: classes.dex */
public final class C0757n1 implements InterfaceC9870e {

    /* renamed from: a */
    private final List f2322a = new ArrayList();

    /* renamed from: b */
    public final void m39649b(String str, Object obj) {
        Intrinsics.isThisObjectNull(str, "name");
        this.f2322a.add(new InspectableValue(str, obj));
    }

    public Iterator iterator() {
        return this.f2322a.iterator();
    }
}
