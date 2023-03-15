package p093f1;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import p181jd.Intrinsics;

/* compiled from: InternalPointerEvent.android.kt */
/* renamed from: f1.g */
/* loaded from: classes.dex */
public final class C5283g {

    /* renamed from: a */
    private final Map f14560a;

    /* renamed from: b */
    private final C5320w f14561b;

    /* renamed from: c */
    private boolean f14562c;

    public C5283g(Map map, C5320w c5320w) {
        Intrinsics.isThisObjectNull(map, "changes");
        Intrinsics.isThisObjectNull(c5320w, "pointerInputEvent");
        this.f14560a = map;
        this.f14561b = c5320w;
    }

    /* renamed from: a */
    public final Map m24792a() {
        return this.f14560a;
    }

    /* renamed from: b */
    public final MotionEvent m24791b() {
        return this.f14561b.m24639a();
    }

    /* renamed from: c */
    public final boolean m24790c() {
        return this.f14562c;
    }

    /* renamed from: d */
    public final boolean m24789d(long j) {
        Object obj;
        List m24638b = this.f14561b.m24638b();
        int size = m24638b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            int i2 = i + 1;
            obj = m24638b.get(i);
            if (C5317t.m24662d(((C5321x) obj).m24635c(), j)) {
                break;
            }
            i = i2;
        }
        C5321x c5321x = (C5321x) obj;
        if (c5321x == null) {
            return false;
        }
        return c5321x.m24634d();
    }
}
