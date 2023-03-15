package p432x;

import p127h1.Placeable;
import p181jd.Intrinsics;

/* renamed from: x.j */
/* loaded from: classes.dex */
public final class LazyLayoutPlaceable {

    /* renamed from: a */
    private final Placeable f32235a;

    /* renamed from: b */
    private final Object f32236b;

    public LazyLayoutPlaceable(Placeable placeable, Object obj) {
        Intrinsics.isThisObjectNull(placeable, "placeable");
        this.f32235a = placeable;
        this.f32236b = obj;
    }

    /* renamed from: a */
    public final Object m3366a() {
        return this.f32236b;
    }

    /* renamed from: b */
    public final Placeable m3365b() {
        return this.f32235a;
    }
}
