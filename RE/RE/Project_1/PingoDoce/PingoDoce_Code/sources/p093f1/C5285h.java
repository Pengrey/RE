package p093f1;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;

/* compiled from: MotionEventAdapter.android.kt */
/* renamed from: f1.h */
/* loaded from: classes.dex */
public final class C5285h {

    /* renamed from: a */
    private long f14563a;

    /* renamed from: b */
    private final SparseLongArray f14564b = new SparseLongArray();

    /* renamed from: c */
    private final SparseBooleanArray f14565c = new SparseBooleanArray();

    /* renamed from: d */
    private final List f14566d = new ArrayList();

    /* renamed from: e */
    private int f14567e = -1;

    /* renamed from: f */
    private int f14568f = -1;

    /* renamed from: a */
    private final void m24785a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f14564b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f14564b;
                long j = this.f14563a;
                this.f14563a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f14564b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f14564b;
            long j2 = this.f14563a;
            this.f14563a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f14565c.put(pointerId2, true);
            }
        }
    }

    /* renamed from: b */
    private final void m24784b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f14567e && source == this.f14568f) {
            return;
        }
        this.f14567e = toolType;
        this.f14568f = source;
        this.f14565c.clear();
        this.f14564b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p093f1.C5321x m24782d(p093f1.InterfaceC5282f0 r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p093f1.C5285h.m24782d(f1.f0, android.view.MotionEvent, int, boolean):f1.x");
    }

    /* renamed from: f */
    private final long m24780f(int i) {
        long j;
        int indexOfKey = this.f14564b.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.f14564b.valueAt(indexOfKey);
        } else {
            j = this.f14563a;
            this.f14563a = 1 + j;
            this.f14564b.put(i, j);
        }
        return C5317t.m24664b(j);
    }

    /* renamed from: g */
    private final boolean m24779g(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            int i3 = i2 + 1;
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    /* renamed from: h */
    private final void m24778h(MotionEvent motionEvent) {
        int size;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f14565c.get(pointerId, false)) {
                this.f14564b.delete(pointerId);
                this.f14565c.delete(pointerId);
            }
        }
        if (this.f14564b.size() <= motionEvent.getPointerCount() || (size = this.f14564b.size() - 1) < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            int keyAt = this.f14564b.keyAt(size);
            if (!m24779g(motionEvent, keyAt)) {
                this.f14564b.removeAt(size);
                this.f14565c.delete(keyAt);
            }
            if (i < 0) {
                return;
            }
            size = i;
        }
    }

    /* renamed from: c */
    public final C5320w m24783c(MotionEvent motionEvent, InterfaceC5282f0 interfaceC5282f0) {
        int i;
        Intrinsics.isThisObjectNull(motionEvent, "motionEvent");
        Intrinsics.isThisObjectNull(interfaceC5282f0, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f14564b.clear();
            this.f14565c.clear();
            return null;
        }
        m24784b(motionEvent);
        m24785a(motionEvent);
        boolean z = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.f14565c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        this.f14566d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            int i3 = i2 + 1;
            this.f14566d.add(m24782d(interfaceC5282f0, motionEvent, i2, (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i2 = i3;
        }
        m24778h(motionEvent);
        return new C5320w(motionEvent.getEventTime(), this.f14566d, motionEvent);
    }

    /* renamed from: e */
    public final void m24781e(int i) {
        this.f14565c.delete(i);
        this.f14564b.delete(i);
    }
}
