package p260o0;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p181jd.Intrinsics;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public final class ListUtils {
    /* renamed from: a */
    private static final void m17480a(Appendable appendable, Object obj, InterfaceC6108l interfaceC6108l) {
        if (interfaceC6108l != null) {
            appendable.append((CharSequence) interfaceC6108l.mo9587d(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    private static final Appendable m17479b(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l) {
        appendable.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i2 + 1;
            Object obj = list.get(i2);
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i3 > i) {
                break;
            }
            m17480a(appendable, obj, interfaceC6108l);
            i2 = i4;
        }
        if (i >= 0 && i3 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: c */
    public static final String m17478c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(list, "<this>");
        Intrinsics.isThisObjectNull(charSequence, "separator");
        Intrinsics.isThisObjectNull(charSequence2, "prefix");
        Intrinsics.isThisObjectNull(charSequence3, "postfix");
        Intrinsics.isThisObjectNull(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m17479b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC6108l)).toString();
        Intrinsics.checkIfNull(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    /* renamed from: d */
    public static /* synthetic */ String m17477d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l, int i2, Object obj) {
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
        return m17478c(list, charSequence, charSequence6, charSequence5, i4, charSequence7, interfaceC6108l);
    }

    /* renamed from: e */
    public static final Set m17476e(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }
}
