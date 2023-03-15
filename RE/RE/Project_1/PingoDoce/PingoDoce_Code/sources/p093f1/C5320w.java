package p093f1;

import android.view.MotionEvent;
import java.util.List;
import p181jd.Intrinsics;

/* compiled from: PointerInputEvent.android.kt */
/* renamed from: f1.w */
/* loaded from: classes.dex */
public final class C5320w {

    /* renamed from: a */
    private final List f14676a;

    /* renamed from: b */
    private final MotionEvent f14677b;

    public C5320w(long j, List list, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(list, "pointers");
        Intrinsics.isThisObjectNull(motionEvent, "motionEvent");
        this.f14676a = list;
        this.f14677b = motionEvent;
    }

    /* renamed from: a */
    public final MotionEvent m24639a() {
        return this.f14677b;
    }

    /* renamed from: b */
    public final List m24638b() {
        return this.f14676a;
    }
}
