package p374u1;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.List;
import kotlin.EnumC6754a;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p286p1.C8393w;
import p404vd.C11226h;
import p404vd.InterfaceC11222e;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* compiled from: TextInputServiceAndroid.android.kt */
/* renamed from: u1.w */
/* loaded from: classes.dex */
public final class C10810w implements InterfaceC10800n {

    /* renamed from: a */
    private final View f27949a;

    /* renamed from: b */
    private final InterfaceC10793i f27950b;

    /* renamed from: c */
    private boolean f27951c;

    /* renamed from: d */
    private InterfaceC6108l f27952d;

    /* renamed from: e */
    private InterfaceC6108l f27953e;

    /* renamed from: f */
    private TextFieldValue f27954f;

    /* renamed from: g */
    private C10790g f27955g;

    /* renamed from: h */
    private final InterfaceC13178g f27956h;

    /* renamed from: i */
    private Rect f27957i;

    /* renamed from: j */
    private final InterfaceC11222e f27958j;

    /* renamed from: k */
    private final ViewTreeObserver.OnGlobalLayoutListener f27959k;

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* renamed from: u1.w$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC10811a implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC10811a() {
        }

        public void onViewAttachedToWindow(View view) {
            View rootView;
            ViewTreeObserver viewTreeObserver;
            if (view == null || (rootView = view.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(C10810w.m6992c(C10810w.this));
        }

        public void onViewDetachedFromWindow(View view) {
            View rootView;
            ViewTreeObserver viewTreeObserver;
            if (view == null || (rootView = view.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(C10810w.m6992c(C10810w.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextInputServiceAndroid.android.kt */
    /* renamed from: u1.w$b */
    /* loaded from: classes.dex */
    public static final class C10812b extends AbstractC6438m implements InterfaceC6097a {
        C10812b() {
            super(0);
        }

        /* renamed from: a */
        public final BaseInputConnection mo42214q() {
            return new BaseInputConnection(C10810w.this.m6987h(), false);
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* renamed from: u1.w$c */
    /* loaded from: classes.dex */
    public static final class C10813c implements InterfaceC10792h {
        C10813c() {
        }

        /* renamed from: a */
        public void mo7051a(KeyEvent keyEvent) {
            Intrinsics.isThisObjectNull(keyEvent, "event");
            C10810w.m6993b(C10810w.this).sendKeyEvent(keyEvent);
        }

        /* renamed from: b */
        public void mo7050b(int i) {
            C10810w.m6990e(C10810w.this).mo9587d(C10788f.m7073i(i));
        }

        /* renamed from: c */
        public void mo7049c(List list) {
            Intrinsics.isThisObjectNull(list, "editCommands");
            C10810w.m6991d(C10810w.this).mo9587d(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextInputServiceAndroid.android.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.ui.text.input.TextInputServiceAndroid", m20196f = "TextInputServiceAndroid.android.kt", m20195l = {182}, m20194m = "keyboardVisibilityEventLoop")
    /* renamed from: u1.w$d */
    /* loaded from: classes.dex */
    public static final class C10814d extends AbstractC6757d {

        /* renamed from: A */
        int f27963A;

        /* renamed from: w */
        Object f27964w;

        /* renamed from: x */
        Object f27965x;

        /* renamed from: y */
        /* synthetic */ Object f27966y;

        C10814d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27966y = obj;
            this.f27963A |= Integer.MIN_VALUE;
            return C10810w.this.m6985j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextInputServiceAndroid.android.kt */
    /* renamed from: u1.w$e */
    /* loaded from: classes.dex */
    public static final class C10815e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C10815e f27968w = new C10815e();

        C10815e() {
            super(1);
        }

        /* renamed from: a */
        public final void m6979a(List list) {
            Intrinsics.isThisObjectNull(list, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m6979a((List) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextInputServiceAndroid.android.kt */
    /* renamed from: u1.w$f */
    /* loaded from: classes.dex */
    public static final class C10816f extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C10816f f27969w = new C10816f();

        C10816f() {
            super(1);
        }

        /* renamed from: a */
        public final void m6978a(int i) {
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m6978a(((C10788f) obj).m7067o());
            return C13195u.f34156a;
        }
    }

    public C10810w(View view, InterfaceC10793i interfaceC10793i) {
        InterfaceC13178g m1463b;
        Intrinsics.isThisObjectNull(view, "view");
        Intrinsics.isThisObjectNull(interfaceC10793i, "inputMethodManager");
        this.f27949a = view;
        this.f27950b = interfaceC10793i;
        this.f27952d = C10815e.f27968w;
        this.f27953e = C10816f.f27969w;
        this.f27954f = new TextFieldValue(BuildConfig.VERSION_NAME, C8393w.f21718b.m15531a(), (C8393w) null, 4, (DefaultConstructorMarker) null);
        this.f27955g = C10790g.f27905f.m7052a();
        m1463b = LazyJVM.m1463b(EnumC6754a.NONE, new C10812b());
        this.f27956h = m1463b;
        this.f27958j = C11226h.m5692b(-1, null, null, 6, null);
        this.f27959k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u1.v
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C10810w.m6984k(C10810w.this);
            }
        };
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC10811a());
    }

    /* renamed from: a */
    public static /* synthetic */ void m6994a(C10810w c10810w) {
        m6984k(c10810w);
    }

    /* renamed from: b */
    public static final /* synthetic */ BaseInputConnection m6993b(C10810w c10810w) {
        return c10810w.m6988g();
    }

    /* renamed from: c */
    public static final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener m6992c(C10810w c10810w) {
        return c10810w.f27959k;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC6108l m6991d(C10810w c10810w) {
        return c10810w.f27952d;
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC6108l m6990e(C10810w c10810w) {
        return c10810w.f27953e;
    }

    /* renamed from: g */
    private final BaseInputConnection m6988g() {
        return (BaseInputConnection) this.f27956h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m6984k(C10810w c10810w) {
        Intrinsics.isThisObjectNull(c10810w, "this$0");
        Rect rect = c10810w.f27957i;
        if (rect == null) {
            return;
        }
        c10810w.m6987h().requestRectangleOnScreen(new Rect(rect));
    }

    /* renamed from: f */
    public final InputConnection m6989f(EditorInfo editorInfo) {
        Intrinsics.isThisObjectNull(editorInfo, "outAttrs");
        if (this.f27951c) {
            C10817x.m6976b(editorInfo, this.f27955g, this.f27954f);
            return new inputmethodInputConnectionC10801o(this.f27954f, new C10813c(), this.f27955g.m7057b());
        }
        return null;
    }

    /* renamed from: h */
    public final View m6987h() {
        return this.f27949a;
    }

    /* renamed from: i */
    public final boolean m6986i() {
        return this.f27951c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please submit an issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6985j(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p374u1.C10810w.C10814d
            if (r0 == 0) goto L13
            r0 = r7
            u1.w$d r0 = (p374u1.C10810w.C10814d) r0
            int r1 = r0.f27963A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27963A = r1
            goto L18
        L13:
            u1.w$d r0 = new u1.w$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27966y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27963A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f27965x
            vd.g r2 = (p404vd.InterfaceC11225g) r2
            java.lang.Object r4 = r0.f27964w
            u1.w r4 = (p374u1.C10810w) r4
            p468yc.C13186n.m1453b(r7)
            goto L51
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            p468yc.C13186n.m1453b(r7)
            vd.e r7 = r6.f27958j
            vd.g r7 = r7.iterator()
            r4 = r6
            r2 = r7
        L44:
            r0.f27964w = r4
            r0.f27965x = r2
            r0.f27963A = r3
            java.lang.Object r7 = r2.mo5694a(r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L90
            java.lang.Object r7 = r2.next()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            vd.e r5 = r4.f27958j
            java.lang.Object r5 = r5.mo5653f()
            java.lang.Object r5 = p404vd.C11227i.m5686f(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 != 0) goto L72
            goto L76
        L72:
            boolean r7 = r5.booleanValue()
        L76:
            if (r7 == 0) goto L82
            u1.i r7 = r4.f27950b
            android.view.View r5 = r4.m6987h()
            r7.mo7047b(r5)
            goto L44
        L82:
            u1.i r7 = r4.f27950b
            android.view.View r5 = r4.m6987h()
            android.os.IBinder r5 = r5.getWindowToken()
            r7.mo7048a(r5)
            goto L44
        L90:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p374u1.C10810w.m6985j(bd.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10810w(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            p181jd.Intrinsics.isThisObjectNull(r4, r0)
            u1.j r0 = new u1.j
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "view.context"
            p181jd.Intrinsics.checkIfNull(r1, r2)
            r0.<init>(r1)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p374u1.C10810w.<init>(android.view.View):void");
    }
}
