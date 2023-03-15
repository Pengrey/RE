package sd;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.m */
/* loaded from: classes2.dex */
public class Indent extends Appendable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* renamed from: sd.m$a */
    /* loaded from: classes2.dex */
    public static final class C10164a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C10164a f26498w = new C10164a();

        C10164a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo9587d(String str) {
            Intrinsics.isThisObjectNull(str, "line");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* renamed from: sd.m$b */
    /* loaded from: classes2.dex */
    public static final class C10165b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f26499w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10165b(String str) {
            super(1);
            this.f26499w = str;
        }

        /* renamed from: a */
        public final String mo9587d(String str) {
            Intrinsics.isThisObjectNull(str, "line");
            return this.f26499w + str;
        }
    }

    /* renamed from: b */
    private static final InterfaceC6108l m8963b(String str) {
        return str.length() == 0 ? C10164a.f26498w : new C10165b(str);
    }

    /* renamed from: c */
    private static final int m8962c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!CharJVM.m9042c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9 A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m8961d(java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "<this>"
            p181jd.Intrinsics.isThisObjectNull(r14, r0)
            java.lang.String r0 = "newIndent"
            p181jd.Intrinsics.isThisObjectNull(r15, r0)
            java.util.List r0 = sd.C10171u.m8897c0(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = sd.C10163k.m8971r(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L17
            r1.add(r3)
            goto L17
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p489zc.C13777q.m218r(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = m8962c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L3f
        L57:
            java.lang.Comparable r1 = p489zc.C13777q.m246Z(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L65
            int r1 = r1.intValue()
            goto L66
        L65:
            r1 = r2
        L66:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            id.l r15 = m8963b(r15)
            int r3 = p489zc.C13777q.m233i(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L85:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L96
            p489zc.C13777q.m220q()
        L96:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L9c
            if (r2 != r3) goto La4
        L9c:
            boolean r2 = sd.C10163k.m8971r(r5)
            if (r2 == 0) goto La4
            r5 = 0
            goto Lb4
        La4:
            java.lang.String r2 = sd.C10163k.m8996L0(r5, r1)
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r15.mo9587d(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb3
            goto Lb4
        Lb3:
            r5 = r2
        Lb4:
            if (r5 == 0) goto Lb9
            r4.add(r5)
        Lb9:
            r2 = r6
            goto L85
        Lbb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.String r6 = "\n"
            java.lang.Appendable r14 = p489zc.C13777q.m251S(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            p181jd.Intrinsics.checkIfNull(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.Indent.m8961d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m8960e(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.Indent.m8960e(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public static String m8959f(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        return m8961d(str, BuildConfig.VERSION_NAME);
    }

    /* renamed from: g */
    public static final String m8958g(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "marginPrefix");
        return m8960e(str, BuildConfig.VERSION_NAME, str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m8957h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m8958g(str, str2);
    }
}
