package p093f1;

import android.view.MotionEvent;
import p181jd.Intrinsics;
import p373u0.C10776g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MotionEventAdapter.android.kt */
/* renamed from: f1.i */
/* loaded from: classes.dex */
public final class C5292i {

    /* renamed from: a */
    public static final C5292i f14596a = new C5292i();

    private C5292i() {
    }

    /* renamed from: a */
    public final long m24741a(MotionEvent motionEvent, int i) {
        Intrinsics.isThisObjectNull(motionEvent, "motionEvent");
        return C10776g.m7133a(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
