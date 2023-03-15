package p202kc;

import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.C7028a;
import p181jd.Intrinsics;

/* renamed from: kc.b */
/* loaded from: classes2.dex */
public class C6641b {

    /* renamed from: a */
    private final C7028a f17922a;

    /* renamed from: b */
    private int f17923b;

    public C6641b(C7028a c7028a, int i) {
        Intrinsics.m20926i(c7028a, "caretString");
        this.f17922a = c7028a;
        this.f17923b = i;
    }

    /* renamed from: a */
    public boolean m20417a() {
        return this.f17923b < this.f17922a.m19550b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final C7028a m20416b() {
        return this.f17922a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final int m20415c() {
        return this.f17923b;
    }

    /* renamed from: d */
    public boolean mo20397d() {
        C7028a.AbstractC7029a m19551a = this.f17922a.m19551a();
        if (m19551a instanceof C7028a.AbstractC7029a.C7030a) {
            if (this.f17923b < this.f17922a.m19550b()) {
                return true;
            }
        } else if (!(m19551a instanceof C7028a.AbstractC7029a.C7031b)) {
            throw new NoWhenBranchMatchedException();
        } else {
            if (this.f17923b <= this.f17922a.m19550b()) {
                return true;
            }
            if (this.f17923b == 0 && this.f17922a.m19550b() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public Character m20414e() {
        if (this.f17923b >= this.f17922a.m19549c().length()) {
            return null;
        }
        String m19549c = this.f17922a.m19549c();
        if (m19549c != null) {
            char[] charArray = m19549c.toCharArray();
            Intrinsics.isNotNull(charArray, "(this as java.lang.String).toCharArray()");
            int i = this.f17923b;
            char c = charArray[i];
            this.f17923b = i + 1;
            return Character.valueOf(c);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public /* synthetic */ C6641b(C7028a c7028a, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7028a, (i2 & 2) != 0 ? 0 : i);
    }
}
