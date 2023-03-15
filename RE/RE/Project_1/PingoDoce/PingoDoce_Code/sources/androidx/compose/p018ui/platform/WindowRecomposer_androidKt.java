package androidx.compose.p018ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1490u0;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.EnumC6775f;
import p092f0.MonotonicFrameClock;
import p092f0.PausableMonotonicFrameClock;
import p181jd.Intrinsics;
import p302q0.C9575g;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.InterfaceC10524i0;

/* compiled from: WindowRecomposer.android.kt */
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt */
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {

    /* compiled from: WindowRecomposer.android.kt */
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC0673a implements View.OnAttachStateChangeListener {

        /* renamed from: w */
        final /* synthetic */ View f2125w;

        /* renamed from: x */
        final /* synthetic */ Recomposer f2126x;

        View$OnAttachStateChangeListenerC0673a(View view, Recomposer recomposer) {
            this.f2125w = view;
            this.f2126x = recomposer;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f2125w.removeOnAttachStateChangeListener(this);
            this.f2126x.m39975M();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Recomposer m39863a(View view) {
        return m39862b(view);
    }

    /* renamed from: b */
    private static final Recomposer m39862b(View view) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CoroutineContext m39784a = C0692c0.f2194I.m39784a();
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) m39784a.mo4546c(MonotonicFrameClock.f14435n);
        if (monotonicFrameClock == null) {
            pausableMonotonicFrameClock = null;
        } else {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.m24958b();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        }
        CoroutineContext mo4545f0 = m39784a.mo4545f0(pausableMonotonicFrameClock == null ? C1894h.f5621w : pausableMonotonicFrameClock);
        final Recomposer recomposer = new Recomposer(mo4545f0);
        final InterfaceC10524i0 m7771a = C10531j0.m7771a(mo4545f0);
        InterfaceC1491v m36969a = C1490u0.m36969a(view);
        if (m36969a != null) {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0673a(view, recomposer));
            m36969a.mo137b().mo10402a(new InterfaceC1485s() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2

                /* compiled from: WindowRecomposer.android.kt */
                /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$a */
                /* loaded from: classes.dex */
                public /* synthetic */ class C0675a {

                    /* renamed from: a */
                    public static final /* synthetic */ int[] f2130a;

                    static {
                        int[] iArr = new int[AbstractC1469p.EnumC1471b.values().length];
                        iArr[AbstractC1469p.EnumC1471b.ON_CREATE.ordinal()] = 1;
                        iArr[AbstractC1469p.EnumC1471b.ON_START.ordinal()] = 2;
                        iArr[AbstractC1469p.EnumC1471b.ON_STOP.ordinal()] = 3;
                        iArr[AbstractC1469p.EnumC1471b.ON_DESTROY.ordinal()] = 4;
                        iArr[AbstractC1469p.EnumC1471b.ON_PAUSE.ordinal()] = 5;
                        iArr[AbstractC1469p.EnumC1471b.ON_RESUME.ordinal()] = 6;
                        iArr[AbstractC1469p.EnumC1471b.ON_ANY.ordinal()] = 7;
                        f2130a = iArr;
                    }
                }

                /* compiled from: WindowRecomposer.android.kt */
                @InterfaceC6759f(m20197c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1", m20196f = "WindowRecomposer.android.kt", m20195l = {270}, m20194m = "invokeSuspend")
                /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$b */
                /* loaded from: classes.dex */
                static final class C0676b extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

                    /* renamed from: A */
                    final /* synthetic */ C0674xc020951c f2131A;

                    /* renamed from: x */
                    int f2132x;

                    /* renamed from: y */
                    final /* synthetic */ Recomposer f2133y;

                    /* renamed from: z */
                    final /* synthetic */ InterfaceC1491v f2134z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0676b(Recomposer c0676c, InterfaceC1491v interfaceC1537v, C0674xc020951c c0704xc020951c, InterfaceC1886d<? super C0676b> interfaceC1943d) {
                        super(2, interfaceC1943d);
                        this.f2133y = c0676c;
                        this.f2134z = interfaceC1537v;
                        this.f2131A = c0704xc020951c;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1943d) {
                        return new C0676b(this.f2133y, this.f2134z, this.f2131A, interfaceC1943d);
                    }

                    @Override // id.InterfaceC6112p
                    /* renamed from: d */
                    public final Object mo39856d(InterfaceC10524i0 interfaceC11366i0, InterfaceC1886d<? super C13195u> interfaceC1943d) {
                        return ((C0676b) create(interfaceC11366i0, interfaceC1943d)).invokeSuspend(C13195u.f34156a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object m33719d;
                        m33719d = C2116d.m34636d();
                        int i = this.f2132x;
                        try {
                            if (i == 0) {
                                C13186n.m1453b(obj);
                                Recomposer c0676c = this.f2133y;
                                this.f2132x = 1;
                                if (c0676c.m39962Z(this) == m33719d) {
                                    return m33719d;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                C13186n.m1453b(obj);
                            }
                            this.f2134z.mo137b().mo10400c(this.f2131A);
                            return C13195u.f34156a;
                        } catch (Throwable th2) {
                            this.f2134z.mo137b().mo10400c(this.f2131A);
                            throw th2;
                        }
                    }
                }

                @Override // androidx.lifecycle.InterfaceC1485s
                /* renamed from: n */
                public void mo33846n(InterfaceC1491v interfaceC1537v, AbstractC1469p.EnumC1471b enumC1516b) {
                    Intrinsics.isThisObjectNull(interfaceC1537v, "lifecycleOwner");
                    Intrinsics.isThisObjectNull(enumC1516b, "event");
                    int i = C0675a.f2130a[enumC1516b.ordinal()];
                    if (i == 1) {
                        C6772d.m20158d(InterfaceC10524i0.this, null, EnumC6775f.UNDISPATCHED, new C0676b(recomposer, interfaceC1537v, this, null), 1, null);
                    } else if (i == 2) {
                        PausableMonotonicFrameClock c5440p03 = pausableMonotonicFrameClock;
                        if (c5440p03 == null) {
                            return;
                        }
                        c5440p03.m24957d();
                    } else if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        recomposer.m39975M();
                    } else {
                        PausableMonotonicFrameClock c5440p04 = pausableMonotonicFrameClock;
                        if (c5440p04 == null) {
                            return;
                        }
                        c5440p04.m24958b();
                    }
                }
            });
            return recomposer;
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("ViewTreeLifecycleOwner not found from ", view).toString());
    }

    /* renamed from: c */
    public static final CompositionContext m39861c(View view) {
        Intrinsics.isThisObjectNull(view, "<this>");
        CompositionContext m39860d = m39860d(view);
        if (m39860d != null) {
            return m39860d;
        }
        for (ViewParent parent = view.getParent(); m39860d == null && (parent instanceof View); parent = parent.getParent()) {
            m39860d = m39860d((View) parent);
        }
        return m39860d;
    }

    /* renamed from: d */
    public static final CompositionContext m39860d(View view) {
        Intrinsics.isThisObjectNull(view, "<this>");
        Object tag = view.getTag(C9575g.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    /* renamed from: e */
    private static final View m39859e(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    /* renamed from: f */
    public static final Recomposer m39858f(View view) {
        Intrinsics.isThisObjectNull(view, "<this>");
        if (view.isAttachedToWindow()) {
            View m39859e = m39859e(view);
            CompositionContext m39860d = m39860d(m39859e);
            if (m39860d == null) {
                return C0839y1.f2471a.m39454a(m39859e);
            }
            if (m39860d instanceof Recomposer) {
                return (Recomposer) m39860d;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    /* renamed from: g */
    public static final void m39857g(View view, CompositionContext compositionContext) {
        Intrinsics.isThisObjectNull(view, "<this>");
        view.setTag(C9575g.androidx_compose_ui_view_composition_context, compositionContext);
    }
}
