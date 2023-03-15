package ee;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p181jd.Intrinsics;

/* renamed from: ee.c */
/* loaded from: classes2.dex */
public class MarginItemDecoration extends RecyclerView.AbstractC1545n {

    /* renamed from: a */
    private final int f13970a;

    /* renamed from: b */
    private final int f13971b;

    /* renamed from: c */
    private final int f13972c;

    /* renamed from: d */
    private final int f13973d;

    /* renamed from: e */
    private final boolean f13974e;

    /* renamed from: f */
    private final boolean f13975f;

    /* renamed from: g */
    private final int f13976g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ MarginItemDecoration(int r8, int r9, int r10, int r11, boolean r12, boolean r13, int r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            if (r0 == 0) goto La
            r0 = 0
            int r0 = be.UtilsExtensions.m35167e(r0)
            goto Lb
        La:
            r0 = r9
        Lb:
            r1 = r15 & 4
            if (r1 == 0) goto L11
            r1 = r8
            goto L12
        L11:
            r1 = r10
        L12:
            r2 = r15 & 8
            if (r2 == 0) goto L18
            r2 = r0
            goto L19
        L18:
            r2 = r11
        L19:
            r3 = r15 & 16
            r4 = 1
            if (r3 == 0) goto L20
            r3 = r4
            goto L21
        L20:
            r3 = r12
        L21:
            r5 = r15 & 32
            if (r5 == 0) goto L27
            r5 = r4
            goto L28
        L27:
            r5 = r13
        L28:
            r6 = r15 & 64
            if (r6 == 0) goto L2d
            goto L2e
        L2d:
            r4 = r14
        L2e:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r5
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.MarginItemDecoration.<init>(int, int, int, int, boolean, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: g */
    public void mo35984g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
        Intrinsics.isThisObjectNull(rect, "outRect");
        Intrinsics.isThisObjectNull(view, "view");
        Intrinsics.isThisObjectNull(recyclerView, "parent");
        Intrinsics.isThisObjectNull(c1564z, "state");
        if (this.f13976g == 1) {
            rect.left = this.f13970a;
            rect.right = this.f13972c;
            if (!this.f13974e && recyclerView.m36662f0(view) == 0) {
                rect.top = this.f13971b;
            }
            RecyclerView.AbstractC1535g adapter = recyclerView.getAdapter();
            if (adapter != null) {
                if (this.f13975f && recyclerView.m36662f0(view) == adapter.mo29834f() - 1) {
                    return;
                }
                rect.bottom = this.f13973d;
                return;
            }
            return;
        }
        rect.top = this.f13971b;
        rect.bottom = this.f13973d;
        if (!this.f13974e && recyclerView.m36662f0(view) == 0) {
            rect.left = this.f13970a;
        }
        RecyclerView.AbstractC1535g adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            if (this.f13975f && recyclerView.m36662f0(view) == adapter2.mo29834f() - 1) {
                return;
            }
            rect.right = this.f13972c;
        }
    }

    public MarginItemDecoration(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5) {
        this.f13970a = i;
        this.f13971b = i2;
        this.f13972c = i3;
        this.f13973d = i4;
        this.f13974e = z;
        this.f13975f = z2;
        this.f13976g = i5;
    }
}
