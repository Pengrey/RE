package p093f1;

import android.view.MotionEvent;
import java.util.List;
import p181jd.Intrinsics;

/* compiled from: PointerEvent.android.kt */
/* renamed from: f1.m */
/* loaded from: classes.dex */
public final class C5306m {

    /* renamed from: a */
    private final List f14635a;

    /* renamed from: b */
    private final C5283g f14636b;

    /* renamed from: c */
    private int f14637c;

    public C5306m(List list, C5283g c5283g) {
        Intrinsics.isThisObjectNull(list, "changes");
        this.f14635a = list;
        this.f14636b = c5283g;
        MotionEvent m24706c = m24706c();
        C5305l.m24709a(m24706c == null ? 0 : m24706c.getButtonState());
        MotionEvent m24706c2 = m24706c();
        C5278d0.m24815a(m24706c2 != null ? m24706c2.getMetaState() : 0);
        this.f14637c = m24708a();
    }

    /* renamed from: a */
    private final int m24708a() {
        MotionEvent m24706c = m24706c();
        if (m24706c != null) {
            int actionMasked = m24706c.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return C5308o.f14638a.m24675f();
                            case 9:
                                return C5308o.f14638a.m24680a();
                            case 10:
                                return C5308o.f14638a.m24679b();
                            default:
                                return C5308o.f14638a.m24674g();
                        }
                    }
                    return C5308o.f14638a.m24678c();
                }
                return C5308o.f14638a.m24676e();
            }
            return C5308o.f14638a.m24677d();
        }
        List list = this.f14635a;
        int i = 0;
        int size = list.size();
        while (i < size) {
            int i2 = i + 1;
            C5318u c5318u = (C5318u) list.get(i);
            if (C5307n.m24700d(c5318u)) {
                return C5308o.f14638a.m24676e();
            }
            if (C5307n.m24702b(c5318u)) {
                return C5308o.f14638a.m24677d();
            }
            i = i2;
        }
        return C5308o.f14638a.m24678c();
    }

    /* renamed from: b */
    public final List m24707b() {
        return this.f14635a;
    }

    /* renamed from: c */
    public final MotionEvent m24706c() {
        C5283g c5283g = this.f14636b;
        if (c5283g == null) {
            return null;
        }
        return c5283g.m24791b();
    }

    /* renamed from: d */
    public final int m24705d() {
        return this.f14637c;
    }

    /* renamed from: e */
    public final void m24704e(int i) {
        this.f14637c = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5306m(List list) {
        this(list, null);
        Intrinsics.isThisObjectNull(list, "changes");
    }
}
