package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0863e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p024b2.C1794a;
import p038c2.C1989a;

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C0857d {

    /* renamed from: d */
    private static final int[] f2619d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f2620e;

    /* renamed from: a */
    private HashMap<String, C0850a> f2621a = new HashMap<>();

    /* renamed from: b */
    private boolean f2622b = true;

    /* renamed from: c */
    private HashMap<Integer, C0858a> f2623c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes.dex */
    public static class C0858a {

        /* renamed from: a */
        int f2624a;

        /* renamed from: b */
        public final C0861d f2625b = new C0861d();

        /* renamed from: c */
        public final C0860c f2626c = new C0860c();

        /* renamed from: d */
        public final C0859b f2627d = new C0859b();

        /* renamed from: e */
        public final C0862e f2628e = new C0862e();

        /* renamed from: f */
        public HashMap<String, C0850a> f2629f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m39379f(int i, ConstraintLayout.C0847b c0847b) {
            this.f2624a = i;
            C0859b c0859b = this.f2627d;
            c0859b.f2641h = c0847b.f2549d;
            c0859b.f2642i = c0847b.f2551e;
            c0859b.f2643j = c0847b.f2553f;
            c0859b.f2644k = c0847b.f2555g;
            c0859b.f2645l = c0847b.f2557h;
            c0859b.f2646m = c0847b.f2559i;
            c0859b.f2647n = c0847b.f2561j;
            c0859b.f2648o = c0847b.f2563k;
            c0859b.f2649p = c0847b.f2565l;
            c0859b.f2650q = c0847b.f2571p;
            c0859b.f2651r = c0847b.f2572q;
            c0859b.f2652s = c0847b.f2573r;
            c0859b.f2653t = c0847b.f2574s;
            c0859b.f2654u = c0847b.f2581z;
            c0859b.f2655v = c0847b.f2517A;
            c0859b.f2656w = c0847b.f2518B;
            c0859b.f2657x = c0847b.f2567m;
            c0859b.f2658y = c0847b.f2569n;
            c0859b.f2659z = c0847b.f2570o;
            c0859b.f2660A = c0847b.f2532P;
            c0859b.f2661B = c0847b.f2533Q;
            c0859b.f2662C = c0847b.f2534R;
            c0859b.f2640g = c0847b.f2547c;
            c0859b.f2638e = c0847b.f2543a;
            c0859b.f2639f = c0847b.f2545b;
            c0859b.f2631c = ((ViewGroup.MarginLayoutParams) c0847b).width;
            c0859b.f2632d = ((ViewGroup.MarginLayoutParams) c0847b).height;
            c0859b.f2663D = ((ViewGroup.MarginLayoutParams) c0847b).leftMargin;
            c0859b.f2664E = ((ViewGroup.MarginLayoutParams) c0847b).rightMargin;
            c0859b.f2665F = ((ViewGroup.MarginLayoutParams) c0847b).topMargin;
            c0859b.f2666G = ((ViewGroup.MarginLayoutParams) c0847b).bottomMargin;
            c0859b.f2675P = c0847b.f2521E;
            c0859b.f2676Q = c0847b.f2520D;
            c0859b.f2678S = c0847b.f2523G;
            c0859b.f2677R = c0847b.f2522F;
            c0859b.f2690h0 = c0847b.f2535S;
            c0859b.f2691i0 = c0847b.f2536T;
            c0859b.f2679T = c0847b.f2524H;
            c0859b.f2680U = c0847b.f2525I;
            c0859b.f2681V = c0847b.f2528L;
            c0859b.f2682W = c0847b.f2529M;
            c0859b.f2683X = c0847b.f2526J;
            c0859b.f2684Y = c0847b.f2527K;
            c0859b.f2685Z = c0847b.f2530N;
            c0859b.f2686a0 = c0847b.f2531O;
            c0859b.f2635g0 = c0847b.f2537U;
            c0859b.f2670K = c0847b.f2576u;
            c0859b.f2672M = c0847b.f2578w;
            c0859b.f2669J = c0847b.f2575t;
            c0859b.f2671L = c0847b.f2577v;
            c0859b.f2674O = c0847b.f2579x;
            c0859b.f2673N = c0847b.f2580y;
            if (Build.VERSION.SDK_INT >= 17) {
                c0859b.f2667H = c0847b.getMarginEnd();
                this.f2627d.f2668I = c0847b.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m39378g(int i, C0863e.C0864a c0864a) {
            m39379f(i, c0864a);
            this.f2625b.f2704d = c0864a.f2721n0;
            C0862e c0862e = this.f2628e;
            c0862e.f2708b = c0864a.f2724q0;
            c0862e.f2709c = c0864a.f2725r0;
            c0862e.f2710d = c0864a.f2726s0;
            c0862e.f2711e = c0864a.f2727t0;
            c0862e.f2712f = c0864a.f2728u0;
            c0862e.f2713g = c0864a.f2729v0;
            c0862e.f2714h = c0864a.f2730w0;
            c0862e.f2715i = c0864a.f2731x0;
            c0862e.f2716j = c0864a.f2732y0;
            c0862e.f2717k = c0864a.f2733z0;
            c0862e.f2719m = c0864a.f2723p0;
            c0862e.f2718l = c0864a.f2722o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m39377h(AbstractC0853b abstractC0853b, int i, C0863e.C0864a c0864a) {
            m39378g(i, c0864a);
            if (abstractC0853b instanceof Barrier) {
                C0859b c0859b = this.f2627d;
                c0859b.f2689d0 = 1;
                Barrier barrier = (Barrier) abstractC0853b;
                c0859b.f2687b0 = barrier.getType();
                this.f2627d.f2633e0 = barrier.getReferencedIds();
                this.f2627d.f2688c0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void m39381d(ConstraintLayout.C0847b c0847b) {
            C0859b c0859b = this.f2627d;
            c0847b.f2549d = c0859b.f2641h;
            c0847b.f2551e = c0859b.f2642i;
            c0847b.f2553f = c0859b.f2643j;
            c0847b.f2555g = c0859b.f2644k;
            c0847b.f2557h = c0859b.f2645l;
            c0847b.f2559i = c0859b.f2646m;
            c0847b.f2561j = c0859b.f2647n;
            c0847b.f2563k = c0859b.f2648o;
            c0847b.f2565l = c0859b.f2649p;
            c0847b.f2571p = c0859b.f2650q;
            c0847b.f2572q = c0859b.f2651r;
            c0847b.f2573r = c0859b.f2652s;
            c0847b.f2574s = c0859b.f2653t;
            ((ViewGroup.MarginLayoutParams) c0847b).leftMargin = c0859b.f2663D;
            ((ViewGroup.MarginLayoutParams) c0847b).rightMargin = c0859b.f2664E;
            ((ViewGroup.MarginLayoutParams) c0847b).topMargin = c0859b.f2665F;
            ((ViewGroup.MarginLayoutParams) c0847b).bottomMargin = c0859b.f2666G;
            c0847b.f2579x = c0859b.f2674O;
            c0847b.f2580y = c0859b.f2673N;
            c0847b.f2576u = c0859b.f2670K;
            c0847b.f2578w = c0859b.f2672M;
            c0847b.f2581z = c0859b.f2654u;
            c0847b.f2517A = c0859b.f2655v;
            c0847b.f2567m = c0859b.f2657x;
            c0847b.f2569n = c0859b.f2658y;
            c0847b.f2570o = c0859b.f2659z;
            c0847b.f2518B = c0859b.f2656w;
            c0847b.f2532P = c0859b.f2660A;
            c0847b.f2533Q = c0859b.f2661B;
            c0847b.f2521E = c0859b.f2675P;
            c0847b.f2520D = c0859b.f2676Q;
            c0847b.f2523G = c0859b.f2678S;
            c0847b.f2522F = c0859b.f2677R;
            c0847b.f2535S = c0859b.f2690h0;
            c0847b.f2536T = c0859b.f2691i0;
            c0847b.f2524H = c0859b.f2679T;
            c0847b.f2525I = c0859b.f2680U;
            c0847b.f2528L = c0859b.f2681V;
            c0847b.f2529M = c0859b.f2682W;
            c0847b.f2526J = c0859b.f2683X;
            c0847b.f2527K = c0859b.f2684Y;
            c0847b.f2530N = c0859b.f2685Z;
            c0847b.f2531O = c0859b.f2686a0;
            c0847b.f2534R = c0859b.f2662C;
            c0847b.f2547c = c0859b.f2640g;
            c0847b.f2543a = c0859b.f2638e;
            c0847b.f2545b = c0859b.f2639f;
            ((ViewGroup.MarginLayoutParams) c0847b).width = c0859b.f2631c;
            ((ViewGroup.MarginLayoutParams) c0847b).height = c0859b.f2632d;
            String str = c0859b.f2635g0;
            if (str != null) {
                c0847b.f2537U = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                c0847b.setMarginStart(c0859b.f2668I);
                c0847b.setMarginEnd(this.f2627d.f2667H);
            }
            c0847b.m39426a();
        }

        /* renamed from: e */
        public C0858a clone() {
            C0858a c0858a = new C0858a();
            c0858a.f2627d.m39376a(this.f2627d);
            c0858a.f2626c.m39374a(this.f2626c);
            c0858a.f2625b.m39372a(this.f2625b);
            c0858a.f2628e.m39370a(this.f2628e);
            c0858a.f2624a = this.f2624a;
            return c0858a;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$b */
    /* loaded from: classes.dex */
    public static class C0859b {

        /* renamed from: k0 */
        private static SparseIntArray f2630k0;

        /* renamed from: c */
        public int f2631c;

        /* renamed from: d */
        public int f2632d;

        /* renamed from: e0 */
        public int[] f2633e0;

        /* renamed from: f0 */
        public String f2634f0;

        /* renamed from: g0 */
        public String f2635g0;

        /* renamed from: a */
        public boolean f2636a = false;

        /* renamed from: b */
        public boolean f2637b = false;

        /* renamed from: e */
        public int f2638e = -1;

        /* renamed from: f */
        public int f2639f = -1;

        /* renamed from: g */
        public float f2640g = -1.0f;

        /* renamed from: h */
        public int f2641h = -1;

        /* renamed from: i */
        public int f2642i = -1;

        /* renamed from: j */
        public int f2643j = -1;

        /* renamed from: k */
        public int f2644k = -1;

        /* renamed from: l */
        public int f2645l = -1;

        /* renamed from: m */
        public int f2646m = -1;

        /* renamed from: n */
        public int f2647n = -1;

        /* renamed from: o */
        public int f2648o = -1;

        /* renamed from: p */
        public int f2649p = -1;

        /* renamed from: q */
        public int f2650q = -1;

        /* renamed from: r */
        public int f2651r = -1;

        /* renamed from: s */
        public int f2652s = -1;

        /* renamed from: t */
        public int f2653t = -1;

        /* renamed from: u */
        public float f2654u = 0.5f;

        /* renamed from: v */
        public float f2655v = 0.5f;

        /* renamed from: w */
        public String f2656w = null;

        /* renamed from: x */
        public int f2657x = -1;

        /* renamed from: y */
        public int f2658y = 0;

        /* renamed from: z */
        public float f2659z = 0.0f;

        /* renamed from: A */
        public int f2660A = -1;

        /* renamed from: B */
        public int f2661B = -1;

        /* renamed from: C */
        public int f2662C = -1;

        /* renamed from: D */
        public int f2663D = -1;

        /* renamed from: E */
        public int f2664E = -1;

        /* renamed from: F */
        public int f2665F = -1;

        /* renamed from: G */
        public int f2666G = -1;

        /* renamed from: H */
        public int f2667H = -1;

        /* renamed from: I */
        public int f2668I = -1;

        /* renamed from: J */
        public int f2669J = -1;

        /* renamed from: K */
        public int f2670K = -1;

        /* renamed from: L */
        public int f2671L = -1;

        /* renamed from: M */
        public int f2672M = -1;

        /* renamed from: N */
        public int f2673N = -1;

        /* renamed from: O */
        public int f2674O = -1;

        /* renamed from: P */
        public float f2675P = -1.0f;

        /* renamed from: Q */
        public float f2676Q = -1.0f;

        /* renamed from: R */
        public int f2677R = 0;

        /* renamed from: S */
        public int f2678S = 0;

        /* renamed from: T */
        public int f2679T = 0;

        /* renamed from: U */
        public int f2680U = 0;

        /* renamed from: V */
        public int f2681V = -1;

        /* renamed from: W */
        public int f2682W = -1;

        /* renamed from: X */
        public int f2683X = -1;

        /* renamed from: Y */
        public int f2684Y = -1;

        /* renamed from: Z */
        public float f2685Z = 1.0f;

        /* renamed from: a0 */
        public float f2686a0 = 1.0f;

        /* renamed from: b0 */
        public int f2687b0 = -1;

        /* renamed from: c0 */
        public int f2688c0 = 0;

        /* renamed from: d0 */
        public int f2689d0 = -1;

        /* renamed from: h0 */
        public boolean f2690h0 = false;

        /* renamed from: i0 */
        public boolean f2691i0 = false;

        /* renamed from: j0 */
        public boolean f2692j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2630k0 = sparseIntArray;
            sparseIntArray.append(C0868i.f2883c3, 24);
            f2630k0.append(C0868i.f2889d3, 25);
            f2630k0.append(C0868i.f2901f3, 28);
            f2630k0.append(C0868i.f2906g3, 29);
            f2630k0.append(C0868i.f2931l3, 35);
            f2630k0.append(C0868i.f2926k3, 34);
            f2630k0.append(C0868i.f2805N2, 4);
            f2630k0.append(C0868i.f2800M2, 3);
            f2630k0.append(C0868i.f2790K2, 1);
            f2630k0.append(C0868i.f2956q3, 6);
            f2630k0.append(C0868i.f2961r3, 7);
            f2630k0.append(C0868i.f2840U2, 17);
            f2630k0.append(C0868i.f2845V2, 18);
            f2630k0.append(C0868i.f2850W2, 19);
            f2630k0.append(C0868i.f2980v2, 26);
            f2630k0.append(C0868i.f2911h3, 31);
            f2630k0.append(C0868i.f2916i3, 32);
            f2630k0.append(C0868i.f2835T2, 10);
            f2630k0.append(C0868i.f2830S2, 9);
            f2630k0.append(C0868i.f2976u3, 13);
            f2630k0.append(C0868i.f2991x3, 16);
            f2630k0.append(C0868i.f2981v3, 14);
            f2630k0.append(C0868i.f2966s3, 11);
            f2630k0.append(C0868i.f2986w3, 15);
            f2630k0.append(C0868i.f2971t3, 12);
            f2630k0.append(C0868i.f2946o3, 38);
            f2630k0.append(C0868i.f2871a3, 37);
            f2630k0.append(C0868i.f2865Z2, 39);
            f2630k0.append(C0868i.f2941n3, 40);
            f2630k0.append(C0868i.f2860Y2, 20);
            f2630k0.append(C0868i.f2936m3, 36);
            f2630k0.append(C0868i.f2825R2, 5);
            f2630k0.append(C0868i.f2877b3, 76);
            f2630k0.append(C0868i.f2921j3, 76);
            f2630k0.append(C0868i.f2895e3, 76);
            f2630k0.append(C0868i.f2795L2, 76);
            f2630k0.append(C0868i.f2785J2, 76);
            f2630k0.append(C0868i.f2995y2, 23);
            f2630k0.append(C0868i.f2740A2, 27);
            f2630k0.append(C0868i.f2750C2, 30);
            f2630k0.append(C0868i.f2755D2, 8);
            f2630k0.append(C0868i.f3000z2, 33);
            f2630k0.append(C0868i.f2745B2, 2);
            f2630k0.append(C0868i.f2985w2, 22);
            f2630k0.append(C0868i.f2990x2, 21);
            f2630k0.append(C0868i.f2810O2, 61);
            f2630k0.append(C0868i.f2820Q2, 62);
            f2630k0.append(C0868i.f2815P2, 63);
            f2630k0.append(C0868i.f2951p3, 69);
            f2630k0.append(C0868i.f2855X2, 70);
            f2630k0.append(C0868i.f2775H2, 71);
            f2630k0.append(C0868i.f2765F2, 72);
            f2630k0.append(C0868i.f2770G2, 73);
            f2630k0.append(C0868i.f2780I2, 74);
            f2630k0.append(C0868i.f2760E2, 75);
        }

        /* renamed from: a */
        public void m39376a(C0859b c0859b) {
            this.f2636a = c0859b.f2636a;
            this.f2631c = c0859b.f2631c;
            this.f2637b = c0859b.f2637b;
            this.f2632d = c0859b.f2632d;
            this.f2638e = c0859b.f2638e;
            this.f2639f = c0859b.f2639f;
            this.f2640g = c0859b.f2640g;
            this.f2641h = c0859b.f2641h;
            this.f2642i = c0859b.f2642i;
            this.f2643j = c0859b.f2643j;
            this.f2644k = c0859b.f2644k;
            this.f2645l = c0859b.f2645l;
            this.f2646m = c0859b.f2646m;
            this.f2647n = c0859b.f2647n;
            this.f2648o = c0859b.f2648o;
            this.f2649p = c0859b.f2649p;
            this.f2650q = c0859b.f2650q;
            this.f2651r = c0859b.f2651r;
            this.f2652s = c0859b.f2652s;
            this.f2653t = c0859b.f2653t;
            this.f2654u = c0859b.f2654u;
            this.f2655v = c0859b.f2655v;
            this.f2656w = c0859b.f2656w;
            this.f2657x = c0859b.f2657x;
            this.f2658y = c0859b.f2658y;
            this.f2659z = c0859b.f2659z;
            this.f2660A = c0859b.f2660A;
            this.f2661B = c0859b.f2661B;
            this.f2662C = c0859b.f2662C;
            this.f2663D = c0859b.f2663D;
            this.f2664E = c0859b.f2664E;
            this.f2665F = c0859b.f2665F;
            this.f2666G = c0859b.f2666G;
            this.f2667H = c0859b.f2667H;
            this.f2668I = c0859b.f2668I;
            this.f2669J = c0859b.f2669J;
            this.f2670K = c0859b.f2670K;
            this.f2671L = c0859b.f2671L;
            this.f2672M = c0859b.f2672M;
            this.f2673N = c0859b.f2673N;
            this.f2674O = c0859b.f2674O;
            this.f2675P = c0859b.f2675P;
            this.f2676Q = c0859b.f2676Q;
            this.f2677R = c0859b.f2677R;
            this.f2678S = c0859b.f2678S;
            this.f2679T = c0859b.f2679T;
            this.f2680U = c0859b.f2680U;
            this.f2681V = c0859b.f2681V;
            this.f2682W = c0859b.f2682W;
            this.f2683X = c0859b.f2683X;
            this.f2684Y = c0859b.f2684Y;
            this.f2685Z = c0859b.f2685Z;
            this.f2686a0 = c0859b.f2686a0;
            this.f2687b0 = c0859b.f2687b0;
            this.f2688c0 = c0859b.f2688c0;
            this.f2689d0 = c0859b.f2689d0;
            this.f2635g0 = c0859b.f2635g0;
            int[] iArr = c0859b.f2633e0;
            if (iArr != null) {
                this.f2633e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2633e0 = null;
            }
            this.f2634f0 = c0859b.f2634f0;
            this.f2690h0 = c0859b.f2690h0;
            this.f2691i0 = c0859b.f2691i0;
            this.f2692j0 = c0859b.f2692j0;
        }

        /* renamed from: b */
        void m39375b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0868i.f2975u2);
            this.f2637b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2630k0.get(index);
                if (i2 == 80) {
                    this.f2690h0 = obtainStyledAttributes.getBoolean(index, this.f2690h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f2649p = C0857d.m39387p(obtainStyledAttributes, index, this.f2649p);
                            continue;
                        case 2:
                            this.f2666G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2666G);
                            continue;
                        case 3:
                            this.f2648o = C0857d.m39387p(obtainStyledAttributes, index, this.f2648o);
                            continue;
                        case 4:
                            this.f2647n = C0857d.m39387p(obtainStyledAttributes, index, this.f2647n);
                            continue;
                        case 5:
                            this.f2656w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.f2660A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2660A);
                            continue;
                        case 7:
                            this.f2661B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2661B);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f2667H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2667H);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.f2653t = C0857d.m39387p(obtainStyledAttributes, index, this.f2653t);
                            continue;
                        case 10:
                            this.f2652s = C0857d.m39387p(obtainStyledAttributes, index, this.f2652s);
                            continue;
                        case 11:
                            this.f2672M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2672M);
                            continue;
                        case 12:
                            this.f2673N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2673N);
                            continue;
                        case 13:
                            this.f2669J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2669J);
                            continue;
                        case 14:
                            this.f2671L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2671L);
                            continue;
                        case 15:
                            this.f2674O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2674O);
                            continue;
                        case 16:
                            this.f2670K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2670K);
                            continue;
                        case 17:
                            this.f2638e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2638e);
                            continue;
                        case 18:
                            this.f2639f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2639f);
                            continue;
                        case 19:
                            this.f2640g = obtainStyledAttributes.getFloat(index, this.f2640g);
                            continue;
                        case 20:
                            this.f2654u = obtainStyledAttributes.getFloat(index, this.f2654u);
                            continue;
                        case 21:
                            this.f2632d = obtainStyledAttributes.getLayoutDimension(index, this.f2632d);
                            continue;
                        case 22:
                            this.f2631c = obtainStyledAttributes.getLayoutDimension(index, this.f2631c);
                            continue;
                        case 23:
                            this.f2663D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2663D);
                            continue;
                        case 24:
                            this.f2641h = C0857d.m39387p(obtainStyledAttributes, index, this.f2641h);
                            continue;
                        case 25:
                            this.f2642i = C0857d.m39387p(obtainStyledAttributes, index, this.f2642i);
                            continue;
                        case 26:
                            this.f2662C = obtainStyledAttributes.getInt(index, this.f2662C);
                            continue;
                        case 27:
                            this.f2664E = obtainStyledAttributes.getDimensionPixelSize(index, this.f2664E);
                            continue;
                        case 28:
                            this.f2643j = C0857d.m39387p(obtainStyledAttributes, index, this.f2643j);
                            continue;
                        case 29:
                            this.f2644k = C0857d.m39387p(obtainStyledAttributes, index, this.f2644k);
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f2668I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2668I);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            this.f2650q = C0857d.m39387p(obtainStyledAttributes, index, this.f2650q);
                            continue;
                        case 32:
                            this.f2651r = C0857d.m39387p(obtainStyledAttributes, index, this.f2651r);
                            continue;
                        case 33:
                            this.f2665F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2665F);
                            continue;
                        case 34:
                            this.f2646m = C0857d.m39387p(obtainStyledAttributes, index, this.f2646m);
                            continue;
                        case 35:
                            this.f2645l = C0857d.m39387p(obtainStyledAttributes, index, this.f2645l);
                            continue;
                        case 36:
                            this.f2655v = obtainStyledAttributes.getFloat(index, this.f2655v);
                            continue;
                        case 37:
                            this.f2676Q = obtainStyledAttributes.getFloat(index, this.f2676Q);
                            continue;
                        case 38:
                            this.f2675P = obtainStyledAttributes.getFloat(index, this.f2675P);
                            continue;
                        case 39:
                            this.f2677R = obtainStyledAttributes.getInt(index, this.f2677R);
                            continue;
                        case 40:
                            this.f2678S = obtainStyledAttributes.getInt(index, this.f2678S);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f2679T = obtainStyledAttributes.getInt(index, this.f2679T);
                                    continue;
                                case 55:
                                    this.f2680U = obtainStyledAttributes.getInt(index, this.f2680U);
                                    continue;
                                case 56:
                                    this.f2681V = obtainStyledAttributes.getDimensionPixelSize(index, this.f2681V);
                                    continue;
                                case 57:
                                    this.f2682W = obtainStyledAttributes.getDimensionPixelSize(index, this.f2682W);
                                    continue;
                                case 58:
                                    this.f2683X = obtainStyledAttributes.getDimensionPixelSize(index, this.f2683X);
                                    continue;
                                case 59:
                                    this.f2684Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2684Y);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f2657x = C0857d.m39387p(obtainStyledAttributes, index, this.f2657x);
                                            continue;
                                        case 62:
                                            this.f2658y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2658y);
                                            continue;
                                        case 63:
                                            this.f2659z = obtainStyledAttributes.getFloat(index, this.f2659z);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f2685Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f2686a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f2687b0 = obtainStyledAttributes.getInt(index, this.f2687b0);
                                                    continue;
                                                case 73:
                                                    this.f2688c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2688c0);
                                                    continue;
                                                case 74:
                                                    this.f2634f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f2692j0 = obtainStyledAttributes.getBoolean(index, this.f2692j0);
                                                    continue;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2630k0.get(index));
                                                    continue;
                                                case 77:
                                                    this.f2635g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2630k0.get(index));
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2691i0 = obtainStyledAttributes.getBoolean(index, this.f2691i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$c */
    /* loaded from: classes.dex */
    public static class C0860c {

        /* renamed from: h */
        private static SparseIntArray f2693h;

        /* renamed from: a */
        public boolean f2694a = false;

        /* renamed from: b */
        public int f2695b = -1;

        /* renamed from: c */
        public String f2696c = null;

        /* renamed from: d */
        public int f2697d = -1;

        /* renamed from: e */
        public int f2698e = 0;

        /* renamed from: f */
        public float f2699f = Float.NaN;

        /* renamed from: g */
        public float f2700g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2693h = sparseIntArray;
            sparseIntArray.append(C0868i.f2746B3, 1);
            f2693h.append(C0868i.f2756D3, 2);
            f2693h.append(C0868i.f2761E3, 3);
            f2693h.append(C0868i.f2741A3, 4);
            f2693h.append(C0868i.f3001z3, 5);
            f2693h.append(C0868i.f2751C3, 6);
        }

        /* renamed from: a */
        public void m39374a(C0860c c0860c) {
            this.f2694a = c0860c.f2694a;
            this.f2695b = c0860c.f2695b;
            this.f2696c = c0860c.f2696c;
            this.f2697d = c0860c.f2697d;
            this.f2698e = c0860c.f2698e;
            this.f2700g = c0860c.f2700g;
            this.f2699f = c0860c.f2699f;
        }

        /* renamed from: b */
        void m39373b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0868i.f2996y3);
            this.f2694a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2693h.get(index)) {
                    case 1:
                        this.f2700g = obtainStyledAttributes.getFloat(index, this.f2700g);
                        break;
                    case 2:
                        this.f2697d = obtainStyledAttributes.getInt(index, this.f2697d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2696c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2696c = C1794a.f5482b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2698e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2695b = C0857d.m39387p(obtainStyledAttributes, index, this.f2695b);
                        break;
                    case 6:
                        this.f2699f = obtainStyledAttributes.getFloat(index, this.f2699f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* loaded from: classes.dex */
    public static class C0861d {

        /* renamed from: a */
        public boolean f2701a = false;

        /* renamed from: b */
        public int f2702b = 0;

        /* renamed from: c */
        public int f2703c = 0;

        /* renamed from: d */
        public float f2704d = 1.0f;

        /* renamed from: e */
        public float f2705e = Float.NaN;

        /* renamed from: a */
        public void m39372a(C0861d c0861d) {
            this.f2701a = c0861d.f2701a;
            this.f2702b = c0861d.f2702b;
            this.f2704d = c0861d.f2704d;
            this.f2705e = c0861d.f2705e;
            this.f2703c = c0861d.f2703c;
        }

        /* renamed from: b */
        void m39371b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0868i.f2766F3);
            this.f2701a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0868i.f2776H3) {
                    this.f2704d = obtainStyledAttributes.getFloat(index, this.f2704d);
                } else if (index == C0868i.f2771G3) {
                    this.f2702b = obtainStyledAttributes.getInt(index, this.f2702b);
                    this.f2702b = C0857d.f2619d[this.f2702b];
                } else if (index == C0868i.f2786J3) {
                    this.f2703c = obtainStyledAttributes.getInt(index, this.f2703c);
                } else if (index == C0868i.f2781I3) {
                    this.f2705e = obtainStyledAttributes.getFloat(index, this.f2705e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$e */
    /* loaded from: classes.dex */
    public static class C0862e {

        /* renamed from: n */
        private static SparseIntArray f2706n;

        /* renamed from: a */
        public boolean f2707a = false;

        /* renamed from: b */
        public float f2708b = 0.0f;

        /* renamed from: c */
        public float f2709c = 0.0f;

        /* renamed from: d */
        public float f2710d = 0.0f;

        /* renamed from: e */
        public float f2711e = 1.0f;

        /* renamed from: f */
        public float f2712f = 1.0f;

        /* renamed from: g */
        public float f2713g = Float.NaN;

        /* renamed from: h */
        public float f2714h = Float.NaN;

        /* renamed from: i */
        public float f2715i = 0.0f;

        /* renamed from: j */
        public float f2716j = 0.0f;

        /* renamed from: k */
        public float f2717k = 0.0f;

        /* renamed from: l */
        public boolean f2718l = false;

        /* renamed from: m */
        public float f2719m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2706n = sparseIntArray;
            sparseIntArray.append(C0868i.f2841U3, 1);
            f2706n.append(C0868i.f2846V3, 2);
            f2706n.append(C0868i.f2851W3, 3);
            f2706n.append(C0868i.f2831S3, 4);
            f2706n.append(C0868i.f2836T3, 5);
            f2706n.append(C0868i.f2811O3, 6);
            f2706n.append(C0868i.f2816P3, 7);
            f2706n.append(C0868i.f2821Q3, 8);
            f2706n.append(C0868i.f2826R3, 9);
            f2706n.append(C0868i.f2856X3, 10);
            f2706n.append(C0868i.f2861Y3, 11);
        }

        /* renamed from: a */
        public void m39370a(C0862e c0862e) {
            this.f2707a = c0862e.f2707a;
            this.f2708b = c0862e.f2708b;
            this.f2709c = c0862e.f2709c;
            this.f2710d = c0862e.f2710d;
            this.f2711e = c0862e.f2711e;
            this.f2712f = c0862e.f2712f;
            this.f2713g = c0862e.f2713g;
            this.f2714h = c0862e.f2714h;
            this.f2715i = c0862e.f2715i;
            this.f2716j = c0862e.f2716j;
            this.f2717k = c0862e.f2717k;
            this.f2718l = c0862e.f2718l;
            this.f2719m = c0862e.f2719m;
        }

        /* renamed from: b */
        void m39369b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0868i.f2806N3);
            this.f2707a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2706n.get(index)) {
                    case 1:
                        this.f2708b = obtainStyledAttributes.getFloat(index, this.f2708b);
                        break;
                    case 2:
                        this.f2709c = obtainStyledAttributes.getFloat(index, this.f2709c);
                        break;
                    case 3:
                        this.f2710d = obtainStyledAttributes.getFloat(index, this.f2710d);
                        break;
                    case 4:
                        this.f2711e = obtainStyledAttributes.getFloat(index, this.f2711e);
                        break;
                    case 5:
                        this.f2712f = obtainStyledAttributes.getFloat(index, this.f2712f);
                        break;
                    case 6:
                        this.f2713g = obtainStyledAttributes.getDimension(index, this.f2713g);
                        break;
                    case 7:
                        this.f2714h = obtainStyledAttributes.getDimension(index, this.f2714h);
                        break;
                    case 8:
                        this.f2715i = obtainStyledAttributes.getDimension(index, this.f2715i);
                        break;
                    case 9:
                        this.f2716j = obtainStyledAttributes.getDimension(index, this.f2716j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2717k = obtainStyledAttributes.getDimension(index, this.f2717k);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2718l = true;
                            this.f2719m = obtainStyledAttributes.getDimension(index, this.f2719m);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2620e = sparseIntArray;
        sparseIntArray.append(C0868i.f2886d0, 25);
        f2620e.append(C0868i.f2892e0, 26);
        f2620e.append(C0868i.f2903g0, 29);
        f2620e.append(C0868i.f2908h0, 30);
        f2620e.append(C0868i.f2938n0, 36);
        f2620e.append(C0868i.f2933m0, 35);
        f2620e.append(C0868i.f2792L, 4);
        f2620e.append(C0868i.f2787K, 3);
        f2620e.append(C0868i.f2777I, 1);
        f2620e.append(C0868i.f2978v0, 6);
        f2620e.append(C0868i.f2983w0, 7);
        f2620e.append(C0868i.f2827S, 17);
        f2620e.append(C0868i.f2832T, 18);
        f2620e.append(C0868i.f2837U, 19);
        f2620e.append(C0868i.f2873b, 27);
        f2620e.append(C0868i.f2913i0, 32);
        f2620e.append(C0868i.f2918j0, 33);
        f2620e.append(C0868i.f2822R, 10);
        f2620e.append(C0868i.f2817Q, 9);
        f2620e.append(C0868i.f2998z0, 13);
        f2620e.append(C0868i.f2748C0, 16);
        f2620e.append(C0868i.f2738A0, 14);
        f2620e.append(C0868i.f2988x0, 11);
        f2620e.append(C0868i.f2743B0, 15);
        f2620e.append(C0868i.f2993y0, 12);
        f2620e.append(C0868i.f2953q0, 40);
        f2620e.append(C0868i.f2874b0, 39);
        f2620e.append(C0868i.f2868a0, 41);
        f2620e.append(C0868i.f2948p0, 42);
        f2620e.append(C0868i.f2862Z, 20);
        f2620e.append(C0868i.f2943o0, 37);
        f2620e.append(C0868i.f2812P, 5);
        f2620e.append(C0868i.f2880c0, 82);
        f2620e.append(C0868i.f2928l0, 82);
        f2620e.append(C0868i.f2898f0, 82);
        f2620e.append(C0868i.f2782J, 82);
        f2620e.append(C0868i.f2772H, 82);
        f2620e.append(C0868i.f2902g, 24);
        f2620e.append(C0868i.f2912i, 28);
        f2620e.append(C0868i.f2972u, 31);
        f2620e.append(C0868i.f2977v, 8);
        f2620e.append(C0868i.f2907h, 34);
        f2620e.append(C0868i.f2917j, 2);
        f2620e.append(C0868i.f2891e, 23);
        f2620e.append(C0868i.f2897f, 21);
        f2620e.append(C0868i.f2885d, 22);
        f2620e.append(C0868i.f2922k, 43);
        f2620e.append(C0868i.f2987x, 44);
        f2620e.append(C0868i.f2962s, 45);
        f2620e.append(C0868i.f2967t, 46);
        f2620e.append(C0868i.f2957r, 60);
        f2620e.append(C0868i.f2947p, 47);
        f2620e.append(C0868i.f2952q, 48);
        f2620e.append(C0868i.f2927l, 49);
        f2620e.append(C0868i.f2932m, 50);
        f2620e.append(C0868i.f2937n, 51);
        f2620e.append(C0868i.f2942o, 52);
        f2620e.append(C0868i.f2982w, 53);
        f2620e.append(C0868i.f2958r0, 54);
        f2620e.append(C0868i.f2842V, 55);
        f2620e.append(C0868i.f2963s0, 56);
        f2620e.append(C0868i.f2847W, 57);
        f2620e.append(C0868i.f2968t0, 58);
        f2620e.append(C0868i.f2852X, 59);
        f2620e.append(C0868i.f2797M, 61);
        f2620e.append(C0868i.f2807O, 62);
        f2620e.append(C0868i.f2802N, 63);
        f2620e.append(C0868i.f2992y, 64);
        f2620e.append(C0868i.f2768G0, 65);
        f2620e.append(C0868i.f2757E, 66);
        f2620e.append(C0868i.f2773H0, 67);
        f2620e.append(C0868i.f2758E0, 79);
        f2620e.append(C0868i.f2879c, 38);
        f2620e.append(C0868i.f2753D0, 68);
        f2620e.append(C0868i.f2973u0, 69);
        f2620e.append(C0868i.f2857Y, 70);
        f2620e.append(C0868i.f2747C, 71);
        f2620e.append(C0868i.f2737A, 72);
        f2620e.append(C0868i.f2742B, 73);
        f2620e.append(C0868i.f2752D, 74);
        f2620e.append(C0868i.f2997z, 75);
        f2620e.append(C0868i.f2763F0, 76);
        f2620e.append(C0868i.f2923k0, 77);
        f2620e.append(C0868i.f2778I0, 78);
        f2620e.append(C0868i.f2767G, 80);
        f2620e.append(C0868i.f2762F, 81);
    }

    /* renamed from: k */
    private int[] m39392k(View view, String str) {
        int i;
        Object m39440g;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0867h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m39440g = ((ConstraintLayout) view.getParent()).m39440g(0, trim)) != null && (m39440g instanceof Integer)) {
                i = ((Integer) m39440g).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: l */
    private C0858a m39391l(Context context, AttributeSet attributeSet) {
        C0858a c0858a = new C0858a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0868i.f2867a);
        m39386q(context, c0858a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0858a;
    }

    /* renamed from: m */
    private C0858a m39390m(int i) {
        if (!this.f2623c.containsKey(Integer.valueOf(i))) {
            this.f2623c.put(Integer.valueOf(i), new C0858a());
        }
        return this.f2623c.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static int m39387p(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: q */
    private void m39386q(Context context, C0858a c0858a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C0868i.f2879c && C0868i.f2972u != index && C0868i.f2977v != index) {
                c0858a.f2626c.f2694a = true;
                c0858a.f2627d.f2637b = true;
                c0858a.f2625b.f2701a = true;
                c0858a.f2628e.f2707a = true;
            }
            switch (f2620e.get(index)) {
                case 1:
                    C0859b c0859b = c0858a.f2627d;
                    c0859b.f2649p = m39387p(typedArray, index, c0859b.f2649p);
                    break;
                case 2:
                    C0859b c0859b2 = c0858a.f2627d;
                    c0859b2.f2666G = typedArray.getDimensionPixelSize(index, c0859b2.f2666G);
                    break;
                case 3:
                    C0859b c0859b3 = c0858a.f2627d;
                    c0859b3.f2648o = m39387p(typedArray, index, c0859b3.f2648o);
                    break;
                case 4:
                    C0859b c0859b4 = c0858a.f2627d;
                    c0859b4.f2647n = m39387p(typedArray, index, c0859b4.f2647n);
                    break;
                case 5:
                    c0858a.f2627d.f2656w = typedArray.getString(index);
                    break;
                case 6:
                    C0859b c0859b5 = c0858a.f2627d;
                    c0859b5.f2660A = typedArray.getDimensionPixelOffset(index, c0859b5.f2660A);
                    break;
                case 7:
                    C0859b c0859b6 = c0858a.f2627d;
                    c0859b6.f2661B = typedArray.getDimensionPixelOffset(index, c0859b6.f2661B);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0859b c0859b7 = c0858a.f2627d;
                        c0859b7.f2667H = typedArray.getDimensionPixelSize(index, c0859b7.f2667H);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    C0859b c0859b8 = c0858a.f2627d;
                    c0859b8.f2653t = m39387p(typedArray, index, c0859b8.f2653t);
                    break;
                case 10:
                    C0859b c0859b9 = c0858a.f2627d;
                    c0859b9.f2652s = m39387p(typedArray, index, c0859b9.f2652s);
                    break;
                case 11:
                    C0859b c0859b10 = c0858a.f2627d;
                    c0859b10.f2672M = typedArray.getDimensionPixelSize(index, c0859b10.f2672M);
                    break;
                case 12:
                    C0859b c0859b11 = c0858a.f2627d;
                    c0859b11.f2673N = typedArray.getDimensionPixelSize(index, c0859b11.f2673N);
                    break;
                case 13:
                    C0859b c0859b12 = c0858a.f2627d;
                    c0859b12.f2669J = typedArray.getDimensionPixelSize(index, c0859b12.f2669J);
                    break;
                case 14:
                    C0859b c0859b13 = c0858a.f2627d;
                    c0859b13.f2671L = typedArray.getDimensionPixelSize(index, c0859b13.f2671L);
                    break;
                case 15:
                    C0859b c0859b14 = c0858a.f2627d;
                    c0859b14.f2674O = typedArray.getDimensionPixelSize(index, c0859b14.f2674O);
                    break;
                case 16:
                    C0859b c0859b15 = c0858a.f2627d;
                    c0859b15.f2670K = typedArray.getDimensionPixelSize(index, c0859b15.f2670K);
                    break;
                case 17:
                    C0859b c0859b16 = c0858a.f2627d;
                    c0859b16.f2638e = typedArray.getDimensionPixelOffset(index, c0859b16.f2638e);
                    break;
                case 18:
                    C0859b c0859b17 = c0858a.f2627d;
                    c0859b17.f2639f = typedArray.getDimensionPixelOffset(index, c0859b17.f2639f);
                    break;
                case 19:
                    C0859b c0859b18 = c0858a.f2627d;
                    c0859b18.f2640g = typedArray.getFloat(index, c0859b18.f2640g);
                    break;
                case 20:
                    C0859b c0859b19 = c0858a.f2627d;
                    c0859b19.f2654u = typedArray.getFloat(index, c0859b19.f2654u);
                    break;
                case 21:
                    C0859b c0859b20 = c0858a.f2627d;
                    c0859b20.f2632d = typedArray.getLayoutDimension(index, c0859b20.f2632d);
                    break;
                case 22:
                    C0861d c0861d = c0858a.f2625b;
                    c0861d.f2702b = typedArray.getInt(index, c0861d.f2702b);
                    C0861d c0861d2 = c0858a.f2625b;
                    c0861d2.f2702b = f2619d[c0861d2.f2702b];
                    break;
                case 23:
                    C0859b c0859b21 = c0858a.f2627d;
                    c0859b21.f2631c = typedArray.getLayoutDimension(index, c0859b21.f2631c);
                    break;
                case 24:
                    C0859b c0859b22 = c0858a.f2627d;
                    c0859b22.f2663D = typedArray.getDimensionPixelSize(index, c0859b22.f2663D);
                    break;
                case 25:
                    C0859b c0859b23 = c0858a.f2627d;
                    c0859b23.f2641h = m39387p(typedArray, index, c0859b23.f2641h);
                    break;
                case 26:
                    C0859b c0859b24 = c0858a.f2627d;
                    c0859b24.f2642i = m39387p(typedArray, index, c0859b24.f2642i);
                    break;
                case 27:
                    C0859b c0859b25 = c0858a.f2627d;
                    c0859b25.f2662C = typedArray.getInt(index, c0859b25.f2662C);
                    break;
                case 28:
                    C0859b c0859b26 = c0858a.f2627d;
                    c0859b26.f2664E = typedArray.getDimensionPixelSize(index, c0859b26.f2664E);
                    break;
                case 29:
                    C0859b c0859b27 = c0858a.f2627d;
                    c0859b27.f2643j = m39387p(typedArray, index, c0859b27.f2643j);
                    break;
                case 30:
                    C0859b c0859b28 = c0858a.f2627d;
                    c0859b28.f2644k = m39387p(typedArray, index, c0859b28.f2644k);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0859b c0859b29 = c0858a.f2627d;
                        c0859b29.f2668I = typedArray.getDimensionPixelSize(index, c0859b29.f2668I);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    C0859b c0859b30 = c0858a.f2627d;
                    c0859b30.f2650q = m39387p(typedArray, index, c0859b30.f2650q);
                    break;
                case 33:
                    C0859b c0859b31 = c0858a.f2627d;
                    c0859b31.f2651r = m39387p(typedArray, index, c0859b31.f2651r);
                    break;
                case 34:
                    C0859b c0859b32 = c0858a.f2627d;
                    c0859b32.f2665F = typedArray.getDimensionPixelSize(index, c0859b32.f2665F);
                    break;
                case 35:
                    C0859b c0859b33 = c0858a.f2627d;
                    c0859b33.f2646m = m39387p(typedArray, index, c0859b33.f2646m);
                    break;
                case 36:
                    C0859b c0859b34 = c0858a.f2627d;
                    c0859b34.f2645l = m39387p(typedArray, index, c0859b34.f2645l);
                    break;
                case 37:
                    C0859b c0859b35 = c0858a.f2627d;
                    c0859b35.f2655v = typedArray.getFloat(index, c0859b35.f2655v);
                    break;
                case 38:
                    c0858a.f2624a = typedArray.getResourceId(index, c0858a.f2624a);
                    break;
                case 39:
                    C0859b c0859b36 = c0858a.f2627d;
                    c0859b36.f2676Q = typedArray.getFloat(index, c0859b36.f2676Q);
                    break;
                case 40:
                    C0859b c0859b37 = c0858a.f2627d;
                    c0859b37.f2675P = typedArray.getFloat(index, c0859b37.f2675P);
                    break;
                case 41:
                    C0859b c0859b38 = c0858a.f2627d;
                    c0859b38.f2677R = typedArray.getInt(index, c0859b38.f2677R);
                    break;
                case 42:
                    C0859b c0859b39 = c0858a.f2627d;
                    c0859b39.f2678S = typedArray.getInt(index, c0859b39.f2678S);
                    break;
                case 43:
                    C0861d c0861d3 = c0858a.f2625b;
                    c0861d3.f2704d = typedArray.getFloat(index, c0861d3.f2704d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0862e c0862e = c0858a.f2628e;
                        c0862e.f2718l = true;
                        c0862e.f2719m = typedArray.getDimension(index, c0862e.f2719m);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    C0862e c0862e2 = c0858a.f2628e;
                    c0862e2.f2709c = typedArray.getFloat(index, c0862e2.f2709c);
                    break;
                case 46:
                    C0862e c0862e3 = c0858a.f2628e;
                    c0862e3.f2710d = typedArray.getFloat(index, c0862e3.f2710d);
                    break;
                case 47:
                    C0862e c0862e4 = c0858a.f2628e;
                    c0862e4.f2711e = typedArray.getFloat(index, c0862e4.f2711e);
                    break;
                case 48:
                    C0862e c0862e5 = c0858a.f2628e;
                    c0862e5.f2712f = typedArray.getFloat(index, c0862e5.f2712f);
                    break;
                case 49:
                    C0862e c0862e6 = c0858a.f2628e;
                    c0862e6.f2713g = typedArray.getDimension(index, c0862e6.f2713g);
                    break;
                case 50:
                    C0862e c0862e7 = c0858a.f2628e;
                    c0862e7.f2714h = typedArray.getDimension(index, c0862e7.f2714h);
                    break;
                case 51:
                    C0862e c0862e8 = c0858a.f2628e;
                    c0862e8.f2715i = typedArray.getDimension(index, c0862e8.f2715i);
                    break;
                case 52:
                    C0862e c0862e9 = c0858a.f2628e;
                    c0862e9.f2716j = typedArray.getDimension(index, c0862e9.f2716j);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0862e c0862e10 = c0858a.f2628e;
                        c0862e10.f2717k = typedArray.getDimension(index, c0862e10.f2717k);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    C0859b c0859b40 = c0858a.f2627d;
                    c0859b40.f2679T = typedArray.getInt(index, c0859b40.f2679T);
                    break;
                case 55:
                    C0859b c0859b41 = c0858a.f2627d;
                    c0859b41.f2680U = typedArray.getInt(index, c0859b41.f2680U);
                    break;
                case 56:
                    C0859b c0859b42 = c0858a.f2627d;
                    c0859b42.f2681V = typedArray.getDimensionPixelSize(index, c0859b42.f2681V);
                    break;
                case 57:
                    C0859b c0859b43 = c0858a.f2627d;
                    c0859b43.f2682W = typedArray.getDimensionPixelSize(index, c0859b43.f2682W);
                    break;
                case 58:
                    C0859b c0859b44 = c0858a.f2627d;
                    c0859b44.f2683X = typedArray.getDimensionPixelSize(index, c0859b44.f2683X);
                    break;
                case 59:
                    C0859b c0859b45 = c0858a.f2627d;
                    c0859b45.f2684Y = typedArray.getDimensionPixelSize(index, c0859b45.f2684Y);
                    break;
                case 60:
                    C0862e c0862e11 = c0858a.f2628e;
                    c0862e11.f2708b = typedArray.getFloat(index, c0862e11.f2708b);
                    break;
                case 61:
                    C0859b c0859b46 = c0858a.f2627d;
                    c0859b46.f2657x = m39387p(typedArray, index, c0859b46.f2657x);
                    break;
                case 62:
                    C0859b c0859b47 = c0858a.f2627d;
                    c0859b47.f2658y = typedArray.getDimensionPixelSize(index, c0859b47.f2658y);
                    break;
                case 63:
                    C0859b c0859b48 = c0858a.f2627d;
                    c0859b48.f2659z = typedArray.getFloat(index, c0859b48.f2659z);
                    break;
                case 64:
                    C0860c c0860c = c0858a.f2626c;
                    c0860c.f2695b = m39387p(typedArray, index, c0860c.f2695b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0858a.f2626c.f2696c = typedArray.getString(index);
                        break;
                    } else {
                        c0858a.f2626c.f2696c = C1794a.f5482b[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c0858a.f2626c.f2698e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0860c c0860c2 = c0858a.f2626c;
                    c0860c2.f2700g = typedArray.getFloat(index, c0860c2.f2700g);
                    break;
                case 68:
                    C0861d c0861d4 = c0858a.f2625b;
                    c0861d4.f2705e = typedArray.getFloat(index, c0861d4.f2705e);
                    break;
                case 69:
                    c0858a.f2627d.f2685Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0858a.f2627d.f2686a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C0859b c0859b49 = c0858a.f2627d;
                    c0859b49.f2687b0 = typedArray.getInt(index, c0859b49.f2687b0);
                    break;
                case 73:
                    C0859b c0859b50 = c0858a.f2627d;
                    c0859b50.f2688c0 = typedArray.getDimensionPixelSize(index, c0859b50.f2688c0);
                    break;
                case 74:
                    c0858a.f2627d.f2634f0 = typedArray.getString(index);
                    break;
                case 75:
                    C0859b c0859b51 = c0858a.f2627d;
                    c0859b51.f2692j0 = typedArray.getBoolean(index, c0859b51.f2692j0);
                    break;
                case 76:
                    C0860c c0860c3 = c0858a.f2626c;
                    c0860c3.f2697d = typedArray.getInt(index, c0860c3.f2697d);
                    break;
                case 77:
                    c0858a.f2627d.f2635g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0861d c0861d5 = c0858a.f2625b;
                    c0861d5.f2703c = typedArray.getInt(index, c0861d5.f2703c);
                    break;
                case 79:
                    C0860c c0860c4 = c0858a.f2626c;
                    c0860c4.f2699f = typedArray.getFloat(index, c0860c4.f2699f);
                    break;
                case 80:
                    C0859b c0859b52 = c0858a.f2627d;
                    c0859b52.f2690h0 = typedArray.getBoolean(index, c0859b52.f2690h0);
                    break;
                case 81:
                    C0859b c0859b53 = c0858a.f2627d;
                    c0859b53.f2691i0 = typedArray.getBoolean(index, c0859b53.f2691i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2620e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2620e.get(index));
                    break;
            }
        }
    }

    /* renamed from: r */
    private String m39385r(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: c */
    public void m39400c(ConstraintLayout constraintLayout) {
        m39399d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m39399d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2623c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id2 = childAt.getId();
            if (!this.f2623c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C1989a.m34971a(childAt));
            } else if (this.f2622b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f2623c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        C0858a c0858a = this.f2623c.get(Integer.valueOf(id2));
                        if (childAt instanceof Barrier) {
                            c0858a.f2627d.f2689d0 = 1;
                        }
                        int i2 = c0858a.f2627d.f2689d0;
                        if (i2 != -1 && i2 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(c0858a.f2627d.f2687b0);
                            barrier.setMargin(c0858a.f2627d.f2688c0);
                            barrier.setAllowsGoneWidget(c0858a.f2627d.f2692j0);
                            C0859b c0859b = c0858a.f2627d;
                            int[] iArr = c0859b.f2633e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c0859b.f2634f0;
                                if (str != null) {
                                    c0859b.f2633e0 = m39392k(barrier, str);
                                    barrier.setReferencedIds(c0858a.f2627d.f2633e0);
                                }
                            }
                        }
                        ConstraintLayout.C0847b c0847b = (ConstraintLayout.C0847b) childAt.getLayoutParams();
                        c0847b.m39426a();
                        c0858a.m39381d(c0847b);
                        if (z) {
                            C0850a.m39421c(childAt, c0858a.f2629f);
                        }
                        childAt.setLayoutParams(c0847b);
                        C0861d c0861d = c0858a.f2625b;
                        if (c0861d.f2703c == 0) {
                            childAt.setVisibility(c0861d.f2702b);
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 17) {
                            childAt.setAlpha(c0858a.f2625b.f2704d);
                            childAt.setRotation(c0858a.f2628e.f2708b);
                            childAt.setRotationX(c0858a.f2628e.f2709c);
                            childAt.setRotationY(c0858a.f2628e.f2710d);
                            childAt.setScaleX(c0858a.f2628e.f2711e);
                            childAt.setScaleY(c0858a.f2628e.f2712f);
                            if (!Float.isNaN(c0858a.f2628e.f2713g)) {
                                childAt.setPivotX(c0858a.f2628e.f2713g);
                            }
                            if (!Float.isNaN(c0858a.f2628e.f2714h)) {
                                childAt.setPivotY(c0858a.f2628e.f2714h);
                            }
                            childAt.setTranslationX(c0858a.f2628e.f2715i);
                            childAt.setTranslationY(c0858a.f2628e.f2716j);
                            if (i3 >= 21) {
                                childAt.setTranslationZ(c0858a.f2628e.f2717k);
                                C0862e c0862e = c0858a.f2628e;
                                if (c0862e.f2718l) {
                                    childAt.setElevation(c0862e.f2719m);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0858a c0858a2 = this.f2623c.get(num);
            int i4 = c0858a2.f2627d.f2689d0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0859b c0859b2 = c0858a2.f2627d;
                int[] iArr2 = c0859b2.f2633e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = c0859b2.f2634f0;
                    if (str2 != null) {
                        c0859b2.f2633e0 = m39392k(barrier2, str2);
                        barrier2.setReferencedIds(c0858a2.f2627d.f2633e0);
                    }
                }
                barrier2.setType(c0858a2.f2627d.f2687b0);
                barrier2.setMargin(c0858a2.f2627d.f2688c0);
                ConstraintLayout.C0847b mo39442e = constraintLayout.mo39442e();
                barrier2.m39407n();
                c0858a2.m39381d(mo39442e);
                constraintLayout.addView(barrier2, mo39442e);
            }
            if (c0858a2.f2627d.f2636a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0847b mo39442e2 = constraintLayout.mo39442e();
                c0858a2.m39381d(mo39442e2);
                constraintLayout.addView(guideline, mo39442e2);
            }
        }
    }

    /* renamed from: e */
    public void m39398e(int i, int i2) {
        if (this.f2623c.containsKey(Integer.valueOf(i))) {
            C0858a c0858a = this.f2623c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C0859b c0859b = c0858a.f2627d;
                    c0859b.f2642i = -1;
                    c0859b.f2641h = -1;
                    c0859b.f2663D = -1;
                    c0859b.f2669J = -1;
                    return;
                case 2:
                    C0859b c0859b2 = c0858a.f2627d;
                    c0859b2.f2644k = -1;
                    c0859b2.f2643j = -1;
                    c0859b2.f2664E = -1;
                    c0859b2.f2671L = -1;
                    return;
                case 3:
                    C0859b c0859b3 = c0858a.f2627d;
                    c0859b3.f2646m = -1;
                    c0859b3.f2645l = -1;
                    c0859b3.f2665F = -1;
                    c0859b3.f2670K = -1;
                    return;
                case 4:
                    C0859b c0859b4 = c0858a.f2627d;
                    c0859b4.f2647n = -1;
                    c0859b4.f2648o = -1;
                    c0859b4.f2666G = -1;
                    c0859b4.f2672M = -1;
                    return;
                case 5:
                    c0858a.f2627d.f2649p = -1;
                    return;
                case 6:
                    C0859b c0859b5 = c0858a.f2627d;
                    c0859b5.f2650q = -1;
                    c0859b5.f2651r = -1;
                    c0859b5.f2668I = -1;
                    c0859b5.f2674O = -1;
                    return;
                case 7:
                    C0859b c0859b6 = c0858a.f2627d;
                    c0859b6.f2652s = -1;
                    c0859b6.f2653t = -1;
                    c0859b6.f2667H = -1;
                    c0859b6.f2673N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: f */
    public void m39397f(Context context, int i) {
        m39396g((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: g */
    public void m39396g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2623c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0847b c0847b = (ConstraintLayout.C0847b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2622b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2623c.containsKey(Integer.valueOf(id2))) {
                this.f2623c.put(Integer.valueOf(id2), new C0858a());
            }
            C0858a c0858a = this.f2623c.get(Integer.valueOf(id2));
            c0858a.f2629f = C0850a.m39423a(this.f2621a, childAt);
            c0858a.m39379f(id2, c0847b);
            c0858a.f2625b.f2702b = childAt.getVisibility();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 17) {
                c0858a.f2625b.f2704d = childAt.getAlpha();
                c0858a.f2628e.f2708b = childAt.getRotation();
                c0858a.f2628e.f2709c = childAt.getRotationX();
                c0858a.f2628e.f2710d = childAt.getRotationY();
                c0858a.f2628e.f2711e = childAt.getScaleX();
                c0858a.f2628e.f2712f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0862e c0862e = c0858a.f2628e;
                    c0862e.f2713g = pivotX;
                    c0862e.f2714h = pivotY;
                }
                c0858a.f2628e.f2715i = childAt.getTranslationX();
                c0858a.f2628e.f2716j = childAt.getTranslationY();
                if (i2 >= 21) {
                    c0858a.f2628e.f2717k = childAt.getTranslationZ();
                    C0862e c0862e2 = c0858a.f2628e;
                    if (c0862e2.f2718l) {
                        c0862e2.f2719m = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                c0858a.f2627d.f2692j0 = barrier.m39447o();
                c0858a.f2627d.f2633e0 = barrier.getReferencedIds();
                c0858a.f2627d.f2687b0 = barrier.getType();
                c0858a.f2627d.f2688c0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: h */
    public void m39395h(C0863e c0863e) {
        int childCount = c0863e.getChildCount();
        this.f2623c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c0863e.getChildAt(i);
            C0863e.C0864a c0864a = (C0863e.C0864a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2622b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2623c.containsKey(Integer.valueOf(id2))) {
                this.f2623c.put(Integer.valueOf(id2), new C0858a());
            }
            C0858a c0858a = this.f2623c.get(Integer.valueOf(id2));
            if (childAt instanceof AbstractC0853b) {
                c0858a.m39377h((AbstractC0853b) childAt, id2, c0864a);
            }
            c0858a.m39378g(id2, c0864a);
        }
    }

    /* renamed from: i */
    public void m39394i(int i, int i2, int i3, int i4, int i5) {
        if (!this.f2623c.containsKey(Integer.valueOf(i))) {
            this.f2623c.put(Integer.valueOf(i), new C0858a());
        }
        C0858a c0858a = this.f2623c.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C0859b c0859b = c0858a.f2627d;
                    c0859b.f2641h = i3;
                    c0859b.f2642i = -1;
                } else if (i4 == 2) {
                    C0859b c0859b2 = c0858a.f2627d;
                    c0859b2.f2642i = i3;
                    c0859b2.f2641h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + m39385r(i4) + " undefined");
                }
                c0858a.f2627d.f2663D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    C0859b c0859b3 = c0858a.f2627d;
                    c0859b3.f2643j = i3;
                    c0859b3.f2644k = -1;
                } else if (i4 == 2) {
                    C0859b c0859b4 = c0858a.f2627d;
                    c0859b4.f2644k = i3;
                    c0859b4.f2643j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m39385r(i4) + " undefined");
                }
                c0858a.f2627d.f2664E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    C0859b c0859b5 = c0858a.f2627d;
                    c0859b5.f2645l = i3;
                    c0859b5.f2646m = -1;
                    c0859b5.f2649p = -1;
                } else if (i4 == 4) {
                    C0859b c0859b6 = c0858a.f2627d;
                    c0859b6.f2646m = i3;
                    c0859b6.f2645l = -1;
                    c0859b6.f2649p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m39385r(i4) + " undefined");
                }
                c0858a.f2627d.f2665F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    C0859b c0859b7 = c0858a.f2627d;
                    c0859b7.f2648o = i3;
                    c0859b7.f2647n = -1;
                    c0859b7.f2649p = -1;
                } else if (i4 == 3) {
                    C0859b c0859b8 = c0858a.f2627d;
                    c0859b8.f2647n = i3;
                    c0859b8.f2648o = -1;
                    c0859b8.f2649p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m39385r(i4) + " undefined");
                }
                c0858a.f2627d.f2666G = i5;
                return;
            case 5:
                if (i4 == 5) {
                    C0859b c0859b9 = c0858a.f2627d;
                    c0859b9.f2649p = i3;
                    c0859b9.f2648o = -1;
                    c0859b9.f2647n = -1;
                    c0859b9.f2645l = -1;
                    c0859b9.f2646m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m39385r(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    C0859b c0859b10 = c0858a.f2627d;
                    c0859b10.f2651r = i3;
                    c0859b10.f2650q = -1;
                } else if (i4 == 7) {
                    C0859b c0859b11 = c0858a.f2627d;
                    c0859b11.f2650q = i3;
                    c0859b11.f2651r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m39385r(i4) + " undefined");
                }
                c0858a.f2627d.f2668I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    C0859b c0859b12 = c0858a.f2627d;
                    c0859b12.f2653t = i3;
                    c0859b12.f2652s = -1;
                } else if (i4 == 6) {
                    C0859b c0859b13 = c0858a.f2627d;
                    c0859b13.f2652s = i3;
                    c0859b13.f2653t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m39385r(i4) + " undefined");
                }
                c0858a.f2627d.f2667H = i5;
                return;
            default:
                throw new IllegalArgumentException(m39385r(i2) + " to " + m39385r(i4) + " unknown");
        }
    }

    /* renamed from: j */
    public void m39393j(int i, int i2, int i3, float f) {
        C0859b c0859b = m39390m(i).f2627d;
        c0859b.f2657x = i2;
        c0859b.f2658y = i3;
        c0859b.f2659z = f;
    }

    /* renamed from: n */
    public void m39389n(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0858a m39391l = m39391l(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m39391l.f2627d.f2636a = true;
                    }
                    this.f2623c.put(Integer.valueOf(m39391l.f2624a), m39391l);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
        continue;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m39388o(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0857d.m39388o(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
