package androidx.compose.p018ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import p181jd.Intrinsics;

/* compiled from: WindowRecomposer.android.kt */
/* renamed from: androidx.compose.ui.platform.x1 */
/* loaded from: classes.dex */
public interface InterfaceC0821x1 {

    /* renamed from: a */
    public static final C0822a f2439a = C0822a.f2440a;

    /* compiled from: WindowRecomposer.android.kt */
    /* renamed from: androidx.compose.ui.platform.x1$a */
    /* loaded from: classes.dex */
    public static final class C0822a {

        /* renamed from: a */
        static final /* synthetic */ C0822a f2440a = new C0822a();

        /* renamed from: b */
        private static final InterfaceC0821x1 f2441b = C0823a.f2442b;

        /* compiled from: WindowRecomposer.android.kt */
        /* renamed from: androidx.compose.ui.platform.x1$a$a */
        /* loaded from: classes.dex */
        static final class C0823a implements InterfaceC0821x1 {

            /* renamed from: b */
            public static final C0823a f2442b = new C0823a();

            C0823a() {
            }

            /* renamed from: a */
            public final Recomposer m39478a(View view) {
                Intrinsics.isThisObjectNull(view, "rootView");
                return WindowRecomposer_androidKt.m39863a(view);
            }
        }

        private C0822a() {
        }

        /* renamed from: a */
        public final InterfaceC0821x1 m39479a() {
            return f2441b;
        }
    }

    /* renamed from: a */
    Recomposer m39480a(View view);
}
