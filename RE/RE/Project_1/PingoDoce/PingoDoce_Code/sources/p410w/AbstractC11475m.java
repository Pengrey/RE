package p410w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p127h1.Placeable;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p479z1.EnumC13618o;

/* compiled from: RowColumnImpl.kt */
/* renamed from: w.m */
/* loaded from: classes.dex */
public abstract class AbstractC11475m {

    /* renamed from: a */
    public static final C11477b f29401a = new C11477b(null);

    /* compiled from: RowColumnImpl.kt */
    /* renamed from: w.m$a */
    /* loaded from: classes.dex */
    private static final class C11476a extends AbstractC11475m {

        /* renamed from: b */
        public static final C11476a f29402b = new C11476a();

        private C11476a() {
            super(null);
        }

        /* renamed from: a */
        public int m5033a(int i, EnumC13618o enumC13618o, Placeable placeable, int i2) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(placeable, "placeable");
            return i / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* renamed from: w.m$b */
    /* loaded from: classes.dex */
    public static final class C11477b {
        private C11477b() {
        }

        public /* synthetic */ C11477b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC11475m m5032a(InterfaceC9560a.InterfaceC9562b interfaceC9562b) {
            Intrinsics.isThisObjectNull(interfaceC9562b, "horizontal");
            return new C11479d(interfaceC9562b);
        }

        /* renamed from: b */
        public final AbstractC11475m m5031b(InterfaceC9560a.InterfaceC9563c interfaceC9563c) {
            Intrinsics.isThisObjectNull(interfaceC9563c, "vertical");
            return new C11481f(interfaceC9563c);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* renamed from: w.m$c */
    /* loaded from: classes.dex */
    private static final class C11478c extends AbstractC11475m {

        /* renamed from: b */
        public static final C11478c f29403b = new C11478c();

        private C11478c() {
            super(null);
        }

        /* renamed from: a */
        public int m5030a(int i, EnumC13618o enumC13618o, Placeable placeable, int i2) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(placeable, "placeable");
            if (enumC13618o == EnumC13618o.Ltr) {
                return i;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RowColumnImpl.kt */
    /* renamed from: w.m$d */
    /* loaded from: classes.dex */
    public static final class C11479d extends AbstractC11475m {

        /* renamed from: b */
        private final InterfaceC9560a.InterfaceC9562b f29404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11479d(InterfaceC9560a.InterfaceC9562b interfaceC9562b) {
            super(null);
            Intrinsics.isThisObjectNull(interfaceC9562b, "horizontal");
            this.f29404b = interfaceC9562b;
        }

        /* renamed from: a */
        public int m5029a(int i, EnumC13618o enumC13618o, Placeable placeable, int i2) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(placeable, "placeable");
            return this.f29404b.mo10588a(0, i, enumC13618o);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* renamed from: w.m$e */
    /* loaded from: classes.dex */
    private static final class C11480e extends AbstractC11475m {

        /* renamed from: b */
        public static final C11480e f29405b = new C11480e();

        private C11480e() {
            super(null);
        }

        /* renamed from: a */
        public int m5028a(int i, EnumC13618o enumC13618o, Placeable placeable, int i2) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(placeable, "placeable");
            if (enumC13618o == EnumC13618o.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RowColumnImpl.kt */
    /* renamed from: w.m$f */
    /* loaded from: classes.dex */
    public static final class C11481f extends AbstractC11475m {

        /* renamed from: b */
        private final InterfaceC9560a.InterfaceC9563c f29406b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11481f(InterfaceC9560a.InterfaceC9563c interfaceC9563c) {
            super(null);
            Intrinsics.isThisObjectNull(interfaceC9563c, "vertical");
            this.f29406b = interfaceC9563c;
        }

        /* renamed from: a */
        public int m5027a(int i, EnumC13618o enumC13618o, Placeable placeable, int i2) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(placeable, "placeable");
            return this.f29406b.mo10587a(0, i);
        }
    }

    static {
        C11476a c11476a = C11476a.f29402b;
        C11480e c11480e = C11480e.f29405b;
        C11478c c11478c = C11478c.f29403b;
    }

    private AbstractC11475m() {
    }

    public /* synthetic */ AbstractC11475m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int m5036a(int i, EnumC13618o enumC13618o, Placeable placeable, int i2);

    /* renamed from: b */
    public Integer m5035b(Placeable placeable) {
        Intrinsics.isThisObjectNull(placeable, "placeable");
        return null;
    }

    /* renamed from: c */
    public boolean m5034c() {
        return false;
    }
}
