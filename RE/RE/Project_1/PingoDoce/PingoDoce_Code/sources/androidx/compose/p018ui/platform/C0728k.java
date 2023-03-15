package androidx.compose.p018ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AndroidAccessibilityManager.kt */
/* renamed from: androidx.compose.ui.platform.k */
/* loaded from: classes.dex */
public final class C0728k implements InterfaceC0724i {

    /* renamed from: a */
    private final AccessibilityManager f2273a;

    /* compiled from: AndroidAccessibilityManager.kt */
    /* renamed from: androidx.compose.ui.platform.k$a */
    /* loaded from: classes.dex */
    private static final class C0729a {
        private C0729a() {
        }

        public /* synthetic */ C0729a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0729a(null);
    }

    public C0728k(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        Object systemService = context.getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f2273a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public long mo39726a(long j, boolean z, boolean z2, boolean z3) {
        int i = z;
        if (j >= 2147483647L) {
            return j;
        }
        if (z2) {
            i = (z ? 1 : 0) | true;
        }
        if (z3) {
            i = (i == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int m39725a = AndroidAccessibilityManager.f2271a.m39725a(this.f2273a, (int) j, i);
            if (m39725a != Integer.MAX_VALUE) {
                return m39725a;
            }
        } else if (!z3 || !this.f2273a.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
