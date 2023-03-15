package p052d1;

import android.view.KeyEvent;
import p181jd.Intrinsics;

/* compiled from: KeyEvent.android.kt */
/* renamed from: d1.d */
/* loaded from: classes.dex */
public final class C4703d {
    /* renamed from: a */
    public static final long m26903a(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "$this$key");
        return C4706g.m26893a(keyEvent.getKeyCode());
    }

    /* renamed from: b */
    public static final int m26902b(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return C4701c.f12826a.m26904c();
            }
            return C4701c.f12826a.m26905b();
        }
        return C4701c.f12826a.m26906a();
    }

    /* renamed from: c */
    public static final boolean m26901c(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
