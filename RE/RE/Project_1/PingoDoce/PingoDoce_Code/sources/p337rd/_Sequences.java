package p337rd;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p489zc.C13780s;
import sd.Appendable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rd.m */
/* loaded from: classes2.dex */
public class _Sequences extends C9878l {

    /* compiled from: Iterables.kt */
    /* renamed from: rd.m$a */
    /* loaded from: classes2.dex */
    public static final class C9879a implements Iterable, InterfaceC6650a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9870e f25867w;

        public C9879a(InterfaceC9870e interfaceC9870e) {
            this.f25867w = interfaceC9870e;
        }

        public Iterator iterator() {
            return this.f25867w.iterator();
        }
    }

    /* renamed from: f */
    public static Iterable m9758f(InterfaceC9870e interfaceC9870e) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        return new C9879a(interfaceC9870e);
    }

    /* renamed from: g */
    public static InterfaceC9870e m9757g(InterfaceC9870e interfaceC9870e, int i) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        if (i >= 0) {
            return i == 0 ? interfaceC9870e : interfaceC9870e instanceof InterfaceC9867c ? ((InterfaceC9867c) interfaceC9870e).mo9779a(i) : new Sequences(interfaceC9870e, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: h */
    public static final Appendable m9756h(InterfaceC9870e interfaceC9870e, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        Intrinsics.isThisObjectNull(appendable, "buffer");
        Intrinsics.isThisObjectNull(charSequence, "separator");
        Intrinsics.isThisObjectNull(charSequence2, "prefix");
        Intrinsics.isThisObjectNull(charSequence3, "postfix");
        Intrinsics.isThisObjectNull(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : interfaceC9870e) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            Appendable.m8964a(appendable, obj, interfaceC6108l);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: i */
    public static final String m9755i(InterfaceC9870e interfaceC9870e, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        Intrinsics.isThisObjectNull(charSequence, "separator");
        Intrinsics.isThisObjectNull(charSequence2, "prefix");
        Intrinsics.isThisObjectNull(charSequence3, "postfix");
        Intrinsics.isThisObjectNull(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m9756h(interfaceC9870e, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC6108l)).toString();
        Intrinsics.checkIfNull(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: j */
    public static /* synthetic */ String m9754j(InterfaceC9870e interfaceC9870e, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = BuildConfig.VERSION_NAME;
        CharSequence charSequence6 = i3 != 0 ? BuildConfig.VERSION_NAME : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i4 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            interfaceC6108l = null;
        }
        return m9755i(interfaceC9870e, charSequence, charSequence6, charSequence5, i4, charSequence7, interfaceC6108l);
    }

    /* renamed from: k */
    public static InterfaceC9870e m9753k(InterfaceC9870e interfaceC9870e, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "transform");
        return new C9880n(interfaceC9870e, interfaceC6108l);
    }

    /* renamed from: l */
    public static final Collection m9752l(InterfaceC9870e interfaceC9870e, Collection collection) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        Intrinsics.isThisObjectNull(collection, "destination");
        for (Object obj : interfaceC9870e) {
            collection.add(obj);
        }
        return collection;
    }

    /* renamed from: m */
    public static List m9751m(InterfaceC9870e interfaceC9870e) {
        List m190n;
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        m190n = C13780s.m190n(m9750n(interfaceC9870e));
        return m190n;
    }

    /* renamed from: n */
    public static final List m9750n(InterfaceC9870e interfaceC9870e) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        return (List) m9752l(interfaceC9870e, new ArrayList());
    }
}
