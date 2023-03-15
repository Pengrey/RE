package p410w;

import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6108l;
import id.InterfaceC6115s;
import java.util.List;
import p127h1.InterfaceC5771h;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5804s;
import p127h1.InterfaceC5805t;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.C6447w;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p297pd._Ranges;
import p468yc.C13195u;
import p479z1.EnumC13618o;

/* renamed from: w.a0 */
/* loaded from: classes.dex */
public final class RowColumnImpl {

    /* compiled from: RowColumnImpl.kt */
    /* renamed from: w.a0$a */
    /* loaded from: classes.dex */
    public static final class C11409a implements InterfaceC5804s {

        /* renamed from: a */
        final /* synthetic */ EnumC11486q f29275a;

        /* renamed from: b */
        final /* synthetic */ float f29276b;

        /* renamed from: c */
        final /* synthetic */ EnumC11458g0 f29277c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC6115s f29278d;

        /* renamed from: e */
        final /* synthetic */ AbstractC11475m f29279e;

        /* compiled from: RowColumnImpl.kt */
        /* renamed from: w.a0$a$a */
        /* loaded from: classes.dex */
        static final class C11410a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ MeasureScope f29280A;

            /* renamed from: B */
            final /* synthetic */ int[] f29281B;

            /* renamed from: C */
            final /* synthetic */ EnumC11486q f29282C;

            /* renamed from: D */
            final /* synthetic */ C11412b0[] f29283D;

            /* renamed from: E */
            final /* synthetic */ AbstractC11475m f29284E;

            /* renamed from: F */
            final /* synthetic */ int f29285F;

            /* renamed from: G */
            final /* synthetic */ C6447w f29286G;

            /* renamed from: w */
            final /* synthetic */ List f29287w;

            /* renamed from: x */
            final /* synthetic */ Placeable[] f29288x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC6115s f29289y;

            /* renamed from: z */
            final /* synthetic */ int f29290z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11410a(List list, Placeable[] placeableArr, InterfaceC6115s interfaceC6115s, int i, MeasureScope measureScope, int[] iArr, EnumC11486q enumC11486q, C11412b0[] c11412b0Arr, AbstractC11475m abstractC11475m, int i2, C6447w c6447w) {
                super(1);
                this.f29287w = list;
                this.f29288x = placeableArr;
                this.f29289y = interfaceC6115s;
                this.f29290z = i;
                this.f29280A = measureScope;
                this.f29281B = iArr;
                this.f29282C = enumC11486q;
                this.f29283D = c11412b0Arr;
                this.f29284E = abstractC11475m;
                this.f29285F = i2;
                this.f29286G = c6447w;
            }

            /* renamed from: a */
            public final void m5192a(Placeable.AbstractC5751a abstractC5751a) {
                EnumC13618o layoutDirection;
                int i;
                int[] iArr;
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
                int size = this.f29287w.size();
                int[] iArr2 = new int[size];
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Placeable placeable = this.f29288x[i3];
                    Intrinsics.ifNullDoSomething(placeable);
                    iArr2[i3] = RowColumnImpl.m5202g(placeable, this.f29282C);
                }
                this.f29289y.mo22156K(Integer.valueOf(this.f29290z), iArr2, this.f29280A.getLayoutDirection(), this.f29280A, this.f29281B);
                Placeable[] placeableArr = this.f29288x;
                C11412b0[] c11412b0Arr = this.f29283D;
                AbstractC11475m abstractC11475m = this.f29284E;
                int i4 = this.f29285F;
                EnumC11486q enumC11486q = this.f29282C;
                MeasureScope measureScope = this.f29280A;
                C6447w c6447w = this.f29286G;
                int[] iArr3 = this.f29281B;
                int length = placeableArr.length;
                int i5 = 0;
                while (i2 < length) {
                    Placeable placeable2 = placeableArr[i2];
                    int i6 = i2 + 1;
                    int i7 = i5 + 1;
                    Intrinsics.ifNullDoSomething(placeable2);
                    AbstractC11475m m5208a = RowColumnImpl.m5208a(c11412b0Arr[i5]);
                    if (m5208a == null) {
                        m5208a = abstractC11475m;
                    }
                    int m5203f = i4 - RowColumnImpl.m5203f(placeable2, enumC11486q);
                    EnumC11486q enumC11486q2 = EnumC11486q.Horizontal;
                    if (enumC11486q == enumC11486q2) {
                        layoutDirection = EnumC13618o.Ltr;
                    } else {
                        layoutDirection = measureScope.getLayoutDirection();
                    }
                    EnumC13618o enumC13618o = layoutDirection;
                    Placeable[] placeableArr2 = placeableArr;
                    int m5036a = m5208a.m5036a(m5203f, enumC13618o, placeable2, c6447w.f17531w);
                    if (enumC11486q == enumC11486q2) {
                        i = length;
                        iArr = iArr3;
                        Placeable.AbstractC5751a.m23163j(abstractC5751a, placeable2, iArr3[i5], m5036a, 0.0f, 4, null);
                    } else {
                        i = length;
                        iArr = iArr3;
                        Placeable.AbstractC5751a.m23163j(abstractC5751a, placeable2, m5036a, iArr[i5], 0.0f, 4, null);
                    }
                    iArr3 = iArr;
                    i2 = i6;
                    i5 = i7;
                    placeableArr = placeableArr2;
                    length = i;
                }
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m5192a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        C11409a(EnumC11486q enumC11486q, float f, EnumC11458g0 enumC11458g0, InterfaceC6115s interfaceC6115s, AbstractC11475m abstractC11475m) {
            this.f29275a = enumC11486q;
            this.f29276b = f;
            this.f29277c = enumC11458g0;
            this.f29278d = interfaceC6115s;
            this.f29279e = abstractC11475m;
        }

        /* renamed from: a */
        public InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            int m4990f;
            int i;
            int m15000i;
            int m19532a;
            int m19530c;
            int i2;
            int i3;
            int m19530c2;
            int i4;
            int max;
            List list2 = list;
            Intrinsics.isThisObjectNull(measureScope, "$receiver");
            Intrinsics.isThisObjectNull(list2, "measurables");
            C11491u c11491u = new C11491u(j, this.f29275a, null);
            int m898O = measureScope.m898O(this.f29276b);
            int size = list.size();
            Placeable[] placeableArr = new Placeable[size];
            int size2 = list.size();
            C11412b0[] c11412b0Arr = new C11412b0[size2];
            for (int i5 = 0; i5 < size2; i5++) {
                c11412b0Arr[i5] = RowColumnImpl.m5207b((InterfaceC5771h) list2.get(i5));
            }
            int size3 = list.size();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            boolean z = false;
            float f = 0.0f;
            while (true) {
                int i11 = Reader.READ_DONE;
                if (i8 >= size3) {
                    break;
                }
                int i12 = i8 + 1;
                InterfaceC5803r interfaceC5803r = (InterfaceC5803r) list2.get(i8);
                C11412b0 c11412b0 = c11412b0Arr[i8];
                float m5205d = RowColumnImpl.m5205d(c11412b0);
                if (m5205d > 0.0f) {
                    f += m5205d;
                    i9++;
                    i8 = i12;
                } else {
                    int m4991e = c11491u.m4991e();
                    if (m4991e != Integer.MAX_VALUE) {
                        i11 = m4991e - i10;
                    }
                    int i13 = i8;
                    int i14 = size3;
                    C11412b0[] c11412b0Arr2 = c11412b0Arr;
                    Placeable mo23007n = interfaceC5803r.mo23007n(C11491u.m4994b(c11491u, 0, i11, 0, 0, 8, null).m4989g(this.f29275a));
                    int min = Math.min(m898O, (m4991e - i10) - RowColumnImpl.m5202g(mo23007n, this.f29275a));
                    i10 += RowColumnImpl.m5202g(mo23007n, this.f29275a) + min;
                    i7 = Math.max(i7, RowColumnImpl.m5203f(mo23007n, this.f29275a));
                    z = z || RowColumnImpl.m5204e(c11412b0);
                    placeableArr[i13] = mo23007n;
                    i6 = min;
                    i8 = i12;
                    size3 = i14;
                    c11412b0Arr = c11412b0Arr2;
                }
            }
            int i15 = i7;
            C11412b0[] c11412b0Arr3 = c11412b0Arr;
            if (i9 == 0) {
                i10 -= i6;
                i = i15;
                m15000i = 0;
            } else {
                int i16 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i16 > 0 && c11491u.m4991e() != Integer.MAX_VALUE) {
                    m4990f = c11491u.m4991e();
                } else {
                    m4990f = c11491u.m4990f();
                }
                int i17 = m898O * (i9 - 1);
                int i18 = (m4990f - i10) - i17;
                float f2 = i16 > 0 ? i18 / f : 0.0f;
                int i19 = 0;
                int i20 = 0;
                while (i19 < size2) {
                    C11412b0 c11412b02 = c11412b0Arr3[i19];
                    i19++;
                    m19530c2 = C7037c.m19530c(RowColumnImpl.m5205d(c11412b02) * f2);
                    i20 += m19530c2;
                }
                int size4 = list.size();
                int i21 = i18 - i20;
                i = i15;
                int i22 = 0;
                int i23 = 0;
                while (i22 < size4) {
                    int i24 = i22 + 1;
                    if (placeableArr[i22] == null) {
                        InterfaceC5803r interfaceC5803r2 = (InterfaceC5803r) list2.get(i22);
                        C11412b0 c11412b03 = c11412b0Arr3[i22];
                        float m5205d2 = RowColumnImpl.m5205d(c11412b03);
                        if (m5205d2 > 0.0f) {
                            m19532a = C7037c.m19532a(i21);
                            int i25 = i21 - m19532a;
                            m19530c = C7037c.m19530c(m5205d2 * f2);
                            int max2 = Math.max(0, m19530c + m19532a);
                            float f3 = f2;
                            if (!RowColumnImpl.m5206c(c11412b03) || max2 == Integer.MAX_VALUE) {
                                i2 = size4;
                                i3 = 0;
                            } else {
                                i3 = max2;
                                i2 = size4;
                            }
                            Placeable mo23007n2 = interfaceC5803r2.mo23007n(new C11491u(i3, max2, 0, c11491u.m4993c()).m4989g(this.f29275a));
                            i23 += RowColumnImpl.m5202g(mo23007n2, this.f29275a);
                            i = Math.max(i, RowColumnImpl.m5203f(mo23007n2, this.f29275a));
                            z = z || RowColumnImpl.m5204e(c11412b03);
                            placeableArr[i22] = mo23007n2;
                            list2 = list;
                            f2 = f3;
                            i22 = i24;
                            size4 = i2;
                            i21 = i25;
                        } else {
                            throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                        }
                    } else {
                        list2 = list;
                        i22 = i24;
                    }
                }
                m15000i = _Ranges.m15000i(i23 + i17, c11491u.m4991e() - i10);
            }
            C6447w c6447w = new C6447w();
            if (z) {
                int i26 = 0;
                i4 = 0;
                while (i26 < size) {
                    int i27 = i26 + 1;
                    Placeable placeable = placeableArr[i26];
                    Intrinsics.ifNullDoSomething(placeable);
                    AbstractC11475m m5208a = RowColumnImpl.m5208a(c11412b0Arr3[i26]);
                    Integer m5035b = m5208a == null ? null : m5208a.m5035b(placeable);
                    if (m5035b != null) {
                        int i28 = c6447w.f17531w;
                        int intValue = m5035b.intValue();
                        if (intValue == Integer.MIN_VALUE) {
                            intValue = 0;
                        }
                        c6447w.f17531w = Math.max(i28, intValue);
                        int m5203f = RowColumnImpl.m5203f(placeable, this.f29275a);
                        EnumC11486q enumC11486q = this.f29275a;
                        int intValue2 = m5035b.intValue();
                        if (intValue2 == Integer.MIN_VALUE) {
                            intValue2 = RowColumnImpl.m5203f(placeable, enumC11486q);
                        }
                        i4 = Math.max(i4, m5203f - intValue2);
                    }
                    i26 = i27;
                }
            } else {
                i4 = 0;
            }
            int max3 = Math.max(i10 + m15000i, c11491u.m4990f());
            if (c11491u.m4993c() != Integer.MAX_VALUE && this.f29277c == EnumC11458g0.Expand) {
                max = c11491u.m4993c();
            } else {
                max = Math.max(i, Math.max(c11491u.m4992d(), c6447w.f17531w + i4));
            }
            int i29 = max;
            EnumC11486q enumC11486q2 = this.f29275a;
            EnumC11486q enumC11486q3 = EnumC11486q.Horizontal;
            int i30 = enumC11486q2 == enumC11486q3 ? max3 : i29;
            int i31 = enumC11486q2 == enumC11486q3 ? i29 : max3;
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i32 = 0; i32 < size5; i32++) {
                iArr[i32] = 0;
            }
            return MeasureScope.C5806a.m22999b(measureScope, i30, i31, null, new C11410a(list, placeableArr, this.f29278d, max3, measureScope, iArr, this.f29275a, c11412b0Arr3, this.f29279e, i29, c6447w), 4, null);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC11475m m5208a(C11412b0 c11412b0) {
        return m5201h(c11412b0);
    }

    /* renamed from: b */
    public static final /* synthetic */ C11412b0 m5207b(InterfaceC5771h interfaceC5771h) {
        return m5200i(interfaceC5771h);
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m5206c(C11412b0 c11412b0) {
        return m5199j(c11412b0);
    }

    /* renamed from: d */
    public static final /* synthetic */ float m5205d(C11412b0 c11412b0) {
        return m5198k(c11412b0);
    }

    /* renamed from: e */
    public static final /* synthetic */ boolean m5204e(C11412b0 c11412b0) {
        return m5197l(c11412b0);
    }

    /* renamed from: f */
    public static final /* synthetic */ int m5203f(Placeable placeable, EnumC11486q enumC11486q) {
        return m5195n(placeable, enumC11486q);
    }

    /* renamed from: g */
    public static final /* synthetic */ int m5202g(Placeable placeable, EnumC11486q enumC11486q) {
        return m5194o(placeable, enumC11486q);
    }

    /* renamed from: h */
    private static final AbstractC11475m m5201h(C11412b0 c11412b0) {
        if (c11412b0 == null) {
            return null;
        }
        return c11412b0.m5184a();
    }

    /* renamed from: i */
    private static final C11412b0 m5200i(InterfaceC5771h interfaceC5771h) {
        Object mo23120x = interfaceC5771h.mo23120x();
        if (mo23120x instanceof C11412b0) {
            return (C11412b0) mo23120x;
        }
        return null;
    }

    /* renamed from: j */
    private static final boolean m5199j(C11412b0 c11412b0) {
        if (c11412b0 == null) {
            return true;
        }
        return c11412b0.m5183b();
    }

    /* renamed from: k */
    private static final float m5198k(C11412b0 c11412b0) {
        if (c11412b0 == null) {
            return 0.0f;
        }
        return c11412b0.m5182c();
    }

    /* renamed from: l */
    private static final boolean m5197l(C11412b0 c11412b0) {
        AbstractC11475m m5201h = m5201h(c11412b0);
        if (m5201h == null) {
            return false;
        }
        return m5201h.m5034c();
    }

    /* renamed from: m */
    public static final InterfaceC5804s m5196m(EnumC11486q enumC11486q, InterfaceC6115s interfaceC6115s, float f, EnumC11458g0 enumC11458g0, AbstractC11475m abstractC11475m) {
        Intrinsics.isThisObjectNull(enumC11486q, "orientation");
        Intrinsics.isThisObjectNull(interfaceC6115s, "arrangement");
        Intrinsics.isThisObjectNull(enumC11458g0, "crossAxisSize");
        Intrinsics.isThisObjectNull(abstractC11475m, "crossAxisAlignment");
        return new C11409a(enumC11486q, f, enumC11458g0, interfaceC6115s, abstractC11475m);
    }

    /* renamed from: n */
    private static final int m5195n(Placeable placeable, EnumC11486q enumC11486q) {
        return enumC11486q == EnumC11486q.Horizontal ? placeable.m23182l0() : placeable.m23177q0();
    }

    /* renamed from: o */
    private static final int m5194o(Placeable placeable, EnumC11486q enumC11486q) {
        return enumC11486q == EnumC11486q.Horizontal ? placeable.m23177q0() : placeable.m23182l0();
    }
}
