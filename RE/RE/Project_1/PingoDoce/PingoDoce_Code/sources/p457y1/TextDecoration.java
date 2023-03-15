package p457y1;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p286p1.TempListUtils;

/* renamed from: y1.d */
/* loaded from: classes.dex */
public final class TextDecoration {

    /* renamed from: b */
    public static final C13063a f33972b = new C13063a(null);

    /* renamed from: c */
    private static final TextDecoration f33973c = new TextDecoration(0);

    /* renamed from: d */
    private static final TextDecoration f33974d = new TextDecoration(1);

    /* renamed from: e */
    private static final TextDecoration f33975e = new TextDecoration(2);

    /* renamed from: a */
    private final int f33976a;

    /* compiled from: TextDecoration.kt */
    /* renamed from: y1.d$a */
    /* loaded from: classes.dex */
    public static final class C13063a {
        private C13063a() {
        }

        public /* synthetic */ C13063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TextDecoration m1723a() {
            return TextDecoration.m1728a();
        }

        /* renamed from: b */
        public final TextDecoration m1722b() {
            return TextDecoration.m1727b();
        }

        /* renamed from: c */
        public final TextDecoration m1721c() {
            return TextDecoration.m1726c();
        }
    }

    public TextDecoration(int i) {
        this.f33976a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ TextDecoration m1728a() {
        return f33975e;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextDecoration m1727b() {
        return f33973c;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextDecoration m1726c() {
        return f33974d;
    }

    /* renamed from: d */
    public final boolean m1725d(TextDecoration textDecoration) {
        Intrinsics.isThisObjectNull(textDecoration, "other");
        int i = this.f33976a;
        return (textDecoration.f33976a | i) == i;
    }

    /* renamed from: e */
    public final int m1724e() {
        return this.f33976a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextDecoration) && this.f33976a == ((TextDecoration) obj).f33976a;
    }

    public int hashCode() {
        return this.f33976a;
    }

    public String toString() {
        if (this.f33976a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f33976a & f33974d.f33976a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f33976a & f33975e.f33976a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return Intrinsics.addStrAndObj("TextDecoration.", arrayList.get(0));
        }
        return "TextDecoration[" + TempListUtils.m15578d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
