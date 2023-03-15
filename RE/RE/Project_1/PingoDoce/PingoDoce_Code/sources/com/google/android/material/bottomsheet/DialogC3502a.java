package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import androidx.core.view.InterfaceC1211u;
import androidx.core.view.accessibility.C1085c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p091f.DialogC5147b;
import p100f8.C5419b;
import p100f8.C5423f;
import p100f8.C5425h;
import p100f8.C5428k;
import p198k8.C6608a;
import p401v8.C11141g;

/* renamed from: com.google.android.material.bottomsheet.a */
/* loaded from: classes.dex */
public class DialogC3502a extends DialogC5147b {

    /* renamed from: A */
    private CoordinatorLayout f9592A;

    /* renamed from: B */
    private FrameLayout f9593B;

    /* renamed from: C */
    boolean f9594C;

    /* renamed from: D */
    boolean f9595D;

    /* renamed from: E */
    private boolean f9596E;

    /* renamed from: F */
    private boolean f9597F;

    /* renamed from: G */
    private BottomSheetBehavior.AbstractC3499f f9598G;

    /* renamed from: H */
    private boolean f9599H;

    /* renamed from: I */
    private BottomSheetBehavior.AbstractC3499f f9600I;

    /* renamed from: y */
    private BottomSheetBehavior<FrameLayout> f9601y;

    /* renamed from: z */
    private FrameLayout f9602z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a */
    /* loaded from: classes.dex */
    public class C3503a implements InterfaceC1211u {
        C3503a() {
        }

        @Override // androidx.core.view.InterfaceC1211u
        /* renamed from: a */
        public C1183m0 mo29259a(View view, C1183m0 c1183m0) {
            if (DialogC3502a.this.f9598G != null) {
                DialogC3502a.this.f9601y.m30351r0(DialogC3502a.this.f9598G);
            }
            if (c1183m0 != null) {
                DialogC3502a dialogC3502a = DialogC3502a.this;
                dialogC3502a.f9598G = new C3508f(dialogC3502a.f9593B, c1183m0, null);
                DialogC3502a.this.f9601y.m30376W(DialogC3502a.this.f9598G);
            }
            return c1183m0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3504b implements View.OnClickListener {
        View$OnClickListenerC3504b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC3502a dialogC3502a = DialogC3502a.this;
            if (dialogC3502a.f9595D && dialogC3502a.isShowing() && DialogC3502a.this.m30321p()) {
                DialogC3502a.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$c */
    /* loaded from: classes.dex */
    public class C3505c extends C1078a {
        C3505c() {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            if (DialogC3502a.this.f9595D) {
                c1085c.m38563a(1048576);
                c1085c.m38550g0(true);
                return;
            }
            c1085c.m38550g0(false);
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: j */
        public boolean mo28844j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                DialogC3502a dialogC3502a = DialogC3502a.this;
                if (dialogC3502a.f9595D) {
                    dialogC3502a.cancel();
                    return true;
                }
            }
            return super.mo28844j(view, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$d */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC3506d implements View.OnTouchListener {
        View$OnTouchListenerC3506d(DialogC3502a dialogC3502a) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$e */
    /* loaded from: classes.dex */
    class C3507e extends BottomSheetBehavior.AbstractC3499f {
        C3507e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3499f
        /* renamed from: b */
        public void mo30311b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3499f
        /* renamed from: c */
        public void mo30310c(View view, int i) {
            if (i == 5) {
                DialogC3502a.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$f */
    /* loaded from: classes.dex */
    private static class C3508f extends BottomSheetBehavior.AbstractC3499f {

        /* renamed from: a */
        private final boolean f9607a;

        /* renamed from: b */
        private final boolean f9608b;

        /* renamed from: c */
        private final C1183m0 f9609c;

        /* synthetic */ C3508f(View view, C1183m0 c1183m0, C3503a c3503a) {
            this(view, c1183m0);
        }

        /* renamed from: d */
        private void m30318d(View view) {
            if (view.getTop() < this.f9609c.m38103k()) {
                DialogC3502a.m30322n(view, this.f9607a);
                view.setPadding(view.getPaddingLeft(), this.f9609c.m38103k() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                DialogC3502a.m30322n(view, this.f9608b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3499f
        /* renamed from: a */
        void mo30319a(View view) {
            m30318d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3499f
        /* renamed from: b */
        public void mo30311b(View view, float f) {
            m30318d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3499f
        /* renamed from: c */
        public void mo30310c(View view, int i) {
            m30318d(view);
        }

        private C3508f(View view, C1183m0 c1183m0) {
            ColorStateList m38402u;
            this.f9609c = c1183m0;
            boolean z = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.f9608b = z;
            C11141g m30364i0 = BottomSheetBehavior.m30367f0(view).m30364i0();
            if (m30364i0 != null) {
                m38402u = m30364i0.m5968x();
            } else {
                m38402u = C1112b0.m38402u(view);
            }
            if (m38402u != null) {
                this.f9607a = C6608a.m20502f(m38402u.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f9607a = C6608a.m20502f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f9607a = z;
            }
        }
    }

    public DialogC3502a(Context context) {
        this(context, 0);
        this.f9599H = getContext().getTheme().obtainStyledAttributes(new int[]{C5419b.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* renamed from: b */
    private static int m30331b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(C5419b.bottomSheetDialogTheme, typedValue, true)) {
                return typedValue.resourceId;
            }
            return C5428k.Theme_Design_Light_BottomSheetDialog;
        }
        return i;
    }

    /* renamed from: j */
    private FrameLayout m30326j() {
        if (this.f9602z == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C5425h.design_bottom_sheet_dialog, null);
            this.f9602z = frameLayout;
            this.f9592A = (CoordinatorLayout) frameLayout.findViewById(C5423f.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f9602z.findViewById(C5423f.design_bottom_sheet);
            this.f9593B = frameLayout2;
            BottomSheetBehavior<FrameLayout> m30367f0 = BottomSheetBehavior.m30367f0(frameLayout2);
            this.f9601y = m30367f0;
            m30367f0.m30376W(this.f9600I);
            this.f9601y.m30415B0(this.f9595D);
        }
        return this.f9602z;
    }

    /* renamed from: n */
    public static void m30322n(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    /* renamed from: q */
    private View m30320q(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m30326j();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f9602z.findViewById(C5423f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f9599H) {
            C1112b0.m38475E0(this.f9593B, new C3503a());
        }
        this.f9593B.removeAllViews();
        if (layoutParams == null) {
            this.f9593B.addView(view);
        } else {
            this.f9593B.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C5423f.touch_outside).setOnClickListener(new View$OnClickListenerC3504b());
        C1112b0.m38405s0(this.f9593B, new C3505c());
        this.f9593B.setOnTouchListener(new View$OnTouchListenerC3506d(this));
        return this.f9602z;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> m30325k = m30325k();
        if (this.f9594C && m30325k.m30361k0() != 5) {
            m30325k.m30402I0(5);
        } else {
            super.cancel();
        }
    }

    /* renamed from: k */
    public BottomSheetBehavior<FrameLayout> m30325k() {
        if (this.f9601y == null) {
            m30326j();
        }
        return this.f9601y;
    }

    /* renamed from: l */
    public boolean m30324l() {
        return this.f9594C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m30323m() {
        this.f9601y.m30351r0(this.f9600I);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z = this.f9599H && Color.alpha(window.getNavigationBarColor()) < 255;
        FrameLayout frameLayout = this.f9602z;
        if (frameLayout != null) {
            frameLayout.setFitsSystemWindows(!z);
        }
        CoordinatorLayout coordinatorLayout = this.f9592A;
        if (coordinatorLayout != null) {
            coordinatorLayout.setFitsSystemWindows(!z);
        }
        if (z) {
            window.getDecorView().setSystemUiVisibility(768);
        }
    }

    @Override // p091f.DialogC5147b, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                window.setStatusBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (i < 23) {
                    window.addFlags(67108864);
                }
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f9601y;
        if (bottomSheetBehavior == null || bottomSheetBehavior.m30361k0() != 5) {
            return;
        }
        this.f9601y.m30402I0(4);
    }

    /* renamed from: p */
    boolean m30321p() {
        if (!this.f9597F) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f9596E = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f9597F = true;
        }
        return this.f9596E;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f9595D != z) {
            this.f9595D = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f9601y;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m30415B0(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f9595D) {
            this.f9595D = true;
        }
        this.f9596E = z;
        this.f9597F = true;
    }

    @Override // p091f.DialogC5147b, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m30320q(i, null, null));
    }

    @Override // p091f.DialogC5147b, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m30320q(0, view, null));
    }

    @Override // p091f.DialogC5147b, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m30320q(0, view, layoutParams));
    }

    public DialogC3502a(Context context, int i) {
        super(context, m30331b(context, i));
        this.f9595D = true;
        this.f9596E = true;
        this.f9600I = new C3507e();
        m25554e(1);
        this.f9599H = getContext().getTheme().obtainStyledAttributes(new int[]{C5419b.enableEdgeToEdge}).getBoolean(0, false);
    }
}
