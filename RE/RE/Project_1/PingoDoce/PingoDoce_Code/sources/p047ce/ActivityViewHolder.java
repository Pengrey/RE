package p047ce;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import id.InterfaceC6097a;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: ce.a */
/* loaded from: classes2.dex */
public final class ActivityViewHolder {

    /* renamed from: d */
    public static final C2117a f6130d = new C2117a(null);

    /* renamed from: a */
    private final ViewGroup f6131a;

    /* renamed from: b */
    private final ViewGroup f6132b;

    /* renamed from: c */
    private final ViewGroup f6133c;

    /* compiled from: ActivityViewHolder.kt */
    /* renamed from: ce.a$a */
    /* loaded from: classes2.dex */
    public static final class C2117a {
        private C2117a() {
        }

        public /* synthetic */ C2117a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ActivityViewHolder m34631a(Activity activity) {
            Intrinsics.isThisObjectNull(activity, "activity");
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(16908290);
            ViewParent parent = viewGroup2.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewParent parent2 = ((ViewGroup) parent).getParent();
            Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            Intrinsics.checkIfNull(viewGroup2, "contentView");
            return new ActivityViewHolder(viewGroup, (ViewGroup) parent2, viewGroup2);
        }
    }

    /* compiled from: ActivityViewHolder.kt */
    /* renamed from: ce.a$b */
    /* loaded from: classes2.dex */
    public static final class View$OnAttachStateChangeListenerC2118b implements View.OnAttachStateChangeListener {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f6134w;

        View$OnAttachStateChangeListenerC2118b(InterfaceC6097a interfaceC6097a) {
            this.f6134w = interfaceC6097a;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f6134w.mo42214q();
        }
    }

    public ActivityViewHolder(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        Intrinsics.isThisObjectNull(viewGroup, "nonResizableLayout");
        Intrinsics.isThisObjectNull(viewGroup2, "resizableLayout");
        Intrinsics.isThisObjectNull(viewGroup3, "contentView");
        this.f6131a = viewGroup;
        this.f6132b = viewGroup2;
        this.f6133c = viewGroup3;
    }

    /* renamed from: a */
    public final ViewGroup m34635a() {
        return this.f6133c;
    }

    /* renamed from: b */
    public final ViewGroup m34634b() {
        return this.f6131a;
    }

    /* renamed from: c */
    public final ViewGroup m34633c() {
        return this.f6132b;
    }

    /* renamed from: d */
    public final void m34632d(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "onDetach");
        this.f6131a.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2118b(interfaceC6097a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityViewHolder) {
            ActivityViewHolder activityViewHolder = (ActivityViewHolder) obj;
            return Intrinsics.equals(this.f6131a, activityViewHolder.f6131a) && Intrinsics.equals(this.f6132b, activityViewHolder.f6132b) && Intrinsics.equals(this.f6133c, activityViewHolder.f6133c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6131a.hashCode() * 31) + this.f6132b.hashCode()) * 31) + this.f6133c.hashCode();
    }

    public String toString() {
        ViewGroup viewGroup = this.f6131a;
        ViewGroup viewGroup2 = this.f6132b;
        ViewGroup viewGroup3 = this.f6133c;
        return "ActivityViewHolder(nonResizableLayout=" + viewGroup + ", resizableLayout=" + viewGroup2 + ", contentView=" + viewGroup3 + ")";
    }
}
