package androidx.compose.p018ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.InterfaceC0760o1;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.lang.ref.WeakReference;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5216l;
import p169j1.InterfaceC6253f0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p468yc.C13195u;

/* compiled from: ComposeView.android.kt */
/* renamed from: androidx.compose.ui.platform.a */
/* loaded from: classes.dex */
public abstract class AbstractC0682a extends ViewGroup {

    /* renamed from: A */
    private InterfaceC6097a f2150A;

    /* renamed from: B */
    private boolean f2151B;

    /* renamed from: C */
    private boolean f2152C;

    /* renamed from: w */
    private WeakReference f2153w;

    /* renamed from: x */
    private IBinder f2154x;

    /* renamed from: y */
    private InterfaceC5216l f2155y;

    /* renamed from: z */
    private CompositionContext f2156z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.a$a */
    /* loaded from: classes.dex */
    public static final class C0683a extends AbstractC6438m implements InterfaceC6112p {
        C0683a() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m39834a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m39834a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                AbstractC0682a.this.m39844a(interfaceC5179i, 8);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0682a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.isThisObjectNull(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f2150A = InterfaceC0760o1.C0761a.f2326a.m39646a(this);
    }

    /* renamed from: b */
    private final CompositionContext m39843b(CompositionContext compositionContext) {
        CompositionContext compositionContext2 = m39836i(compositionContext) ? compositionContext : null;
        if (compositionContext2 != null) {
            this.f2153w = new WeakReference(compositionContext2);
        }
        return compositionContext;
    }

    /* renamed from: c */
    private final void m39842c() {
        if (this.f2152C) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + ((Object) getClass().getSimpleName()) + "; only Compose content is supported");
    }

    /* renamed from: f */
    private final void m39839f() {
        if (this.f2155y == null) {
            try {
                this.f2152C = true;
                this.f2155y = C0689b2.m39808e(this, m39835j(), ComposableLambda.m19326c(-985539750, true, new C0683a()));
            } finally {
                this.f2152C = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* renamed from: i */
    private final boolean m39836i(CompositionContext compositionContext) {
        return !(compositionContext instanceof Recomposer) || ((Recomposer.EnumC0649c) ((Recomposer) compositionContext).m39972P().getValue()).compareTo(Recomposer.EnumC0649c.ShuttingDown) > 0;
    }

    /* renamed from: j */
    private final CompositionContext m39835j() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2 = this.f2156z;
        if (compositionContext2 == null) {
            CompositionContext m39861c = WindowRecomposer_androidKt.m39861c(this);
            CompositionContext m39843b = m39861c == null ? null : m39843b(m39861c);
            if (m39843b == null) {
                WeakReference weakReference = this.f2153w;
                if (weakReference == null || (compositionContext = (CompositionContext) weakReference.get()) == null || !m39836i(compositionContext)) {
                    compositionContext = null;
                }
                return compositionContext == null ? m39843b(WindowRecomposer_androidKt.m39858f(this)) : compositionContext;
            }
            return m39843b;
        }
        return compositionContext2;
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.f2156z != compositionContext) {
            this.f2156z = compositionContext;
            if (compositionContext != null) {
                this.f2153w = null;
            }
            InterfaceC5216l interfaceC5216l = this.f2155y;
            if (interfaceC5216l != null) {
                interfaceC5216l.mo25009b();
                this.f2155y = null;
                if (isAttachedToWindow()) {
                    m39839f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f2154x != iBinder) {
            this.f2154x = iBinder;
            this.f2153w = null;
        }
    }

    /* renamed from: a */
    public abstract void m39844a(InterfaceC5179i interfaceC5179i, int i);

    public void addView(View view) {
        m39842c();
        super.addView(view);
    }

    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m39842c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* renamed from: d */
    public final void m39841d() {
        if (this.f2156z != null || isAttachedToWindow()) {
            m39839f();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    /* renamed from: e */
    public final void m39840e() {
        InterfaceC5216l interfaceC5216l = this.f2155y;
        if (interfaceC5216l != null) {
            interfaceC5216l.mo25009b();
        }
        this.f2155y = null;
        requestLayout();
    }

    /* renamed from: g */
    public void m39838g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    public final boolean getHasComposition() {
        return this.f2155y != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f2151B;
    }

    /* renamed from: h */
    public void m39837h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m39839f();
        }
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m39838g(z, i, i2, i3, i4);
    }

    protected final void onMeasure(int i, int i2) {
        m39839f();
        m39837h(i, i2);
    }

    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f2151B = z;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        ((InterfaceC6253f0) childAt).setShowLayoutBounds(z);
    }

    public final void setViewCompositionStrategy(InterfaceC0760o1 interfaceC0760o1) {
        Intrinsics.isThisObjectNull(interfaceC0760o1, "strategy");
        InterfaceC6097a interfaceC6097a = this.f2150A;
        if (interfaceC6097a != null) {
            interfaceC6097a.mo42214q();
        }
        this.f2150A = interfaceC0760o1.m39647a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void addView(View view, int i) {
        m39842c();
        super.addView(view, i);
    }

    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m39842c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void addView(View view, int i, int i2) {
        m39842c();
        super.addView(view, i, i2);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m39842c();
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m39842c();
        super.addView(view, i, layoutParams);
    }
}
