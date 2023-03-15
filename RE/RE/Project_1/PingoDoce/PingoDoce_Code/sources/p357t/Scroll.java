package p357t;

import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p346s0.Clip;
import p373u0.C10781l;
import p373u0.Rect;
import p393v0.InterfaceC11001b1;
import p393v0.Outline;
import p479z1.C13599b;
import p479z1.C13605g;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: t.r */
/* loaded from: classes.dex */
public final class Scroll {

    /* renamed from: a */
    private static final float f26894a = C13605g.m875g(30);

    /* renamed from: b */
    private static final InterfaceC9570f f26895b;

    /* renamed from: c */
    private static final InterfaceC9570f f26896c;

    /* compiled from: Scroll.kt */
    /* renamed from: t.r$a */
    /* loaded from: classes.dex */
    public static final class C10319a implements InterfaceC11001b1 {
        C10319a() {
        }

        /* renamed from: a */
        public Outline mo6599a(long j, EnumC13618o enumC13618o, Density density) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(density, "density");
            float m898O = density.m898O(Scroll.m8286a());
            return new Outline.C11040b(new Rect(0.0f, -m898O, C10781l.m7091i(j), C10781l.m7093g(j) + m898O));
        }
    }

    /* compiled from: Scroll.kt */
    /* renamed from: t.r$b */
    /* loaded from: classes.dex */
    public static final class C10320b implements InterfaceC11001b1 {
        C10320b() {
        }

        /* renamed from: a */
        public Outline mo6599a(long j, EnumC13618o enumC13618o, Density density) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(density, "density");
            float m898O = density.m898O(Scroll.m8286a());
            return new Outline.C11040b(new Rect(-m898O, 0.0f, C10781l.m7091i(j) + m898O, C10781l.m7093g(j)));
        }
    }

    static {
        InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
        f26895b = Clip.m9381a(c9571a, new C10319a());
        f26896c = Clip.m9381a(c9571a, new C10320b());
    }

    /* renamed from: a */
    public static final /* synthetic */ float m8286a() {
        return f26894a;
    }

    /* renamed from: b */
    public static final void m8285b(long j, boolean z) {
        if (z) {
            if (!(C13599b.m917m(j) != Integer.MAX_VALUE)) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (!(C13599b.m916n(j) != Integer.MAX_VALUE)) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    /* renamed from: c */
    public static final InterfaceC9570f m8284c(InterfaceC9570f interfaceC9570f, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return interfaceC9570f.mo7205u(z ? f26896c : f26895b);
    }
}
