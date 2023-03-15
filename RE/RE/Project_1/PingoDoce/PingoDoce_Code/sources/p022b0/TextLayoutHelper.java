package p022b0;

import java.util.List;
import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p286p1.C8392u;
import p286p1.TextLayoutResult;
import p286p1.TextStyle;
import p359t1.InterfaceC10362d;
import p393v0.Color;
import p457y1.C13070h;
import p479z1.C13599b;
import p479z1.C13619p;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: b0.g */
/* loaded from: classes.dex */
public final class TextLayoutHelper {
    /* renamed from: a */
    public static final boolean m35366a(C8392u c8392u, AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, EnumC13618o enumC13618o, InterfaceC10362d.InterfaceC10363a interfaceC10363a, long j) {
        Intrinsics.isThisObjectNull(c8392u, "$this$canReuse");
        Intrinsics.isThisObjectNull(annotatedString, "text");
        Intrinsics.isThisObjectNull(textStyle, "style");
        Intrinsics.isThisObjectNull(list, "placeholders");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        Intrinsics.isThisObjectNull(interfaceC10363a, "resourceLoader");
        TextLayoutResult m15558h = c8392u.m15558h();
        if (Intrinsics.equals(m15558h.m15566l(), annotatedString) && m35365b(m15558h.m15567k(), textStyle) && Intrinsics.equals(m15558h.m15570h(), list) && m15558h.m15572f() == i && m15558h.m15568j() == z && C13070h.m1692d(m15558h.m15571g(), i2) && Intrinsics.equals(m15558h.m15574d(), density) && m15558h.m15573e() == enumC13618o && Intrinsics.equals(m15558h.m15569i(), interfaceC10363a) && C13599b.m914p(j) == C13599b.m914p(m15558h.m15575c())) {
            return !(z || C13070h.m1692d(i2, C13070h.f33992a.m1688b())) || C13599b.m916n(j) == C13599b.m916n(m15558h.m15575c());
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m35365b(TextStyle textStyle, TextStyle textStyle2) {
        Intrinsics.isThisObjectNull(textStyle, "<this>");
        Intrinsics.isThisObjectNull(textStyle2, "other");
        return textStyle == textStyle2 || (C13619p.m813e(textStyle.m15518i(), textStyle2.m15518i()) && Intrinsics.equals(textStyle.m15515l(), textStyle2.m15515l()) && Intrinsics.equals(textStyle.m15517j(), textStyle2.m15517j()) && Intrinsics.equals(textStyle.m15516k(), textStyle2.m15516k()) && Intrinsics.equals(textStyle.m15520g(), textStyle2.m15520g()) && Intrinsics.equals(textStyle.m15519h(), textStyle2.m15519h()) && C13619p.m813e(textStyle.m15514m(), textStyle2.m15514m()) && Intrinsics.equals(textStyle.m15522e(), textStyle2.m15522e()) && Intrinsics.equals(textStyle.m15507t(), textStyle2.m15507t()) && Intrinsics.equals(textStyle.m15512o(), textStyle2.m15512o()) && Color.m6646n(textStyle.m15523d(), textStyle2.m15523d()) && Intrinsics.equals(textStyle.m15510q(), textStyle2.m15510q()) && Intrinsics.equals(textStyle.m15508s(), textStyle2.m15508s()) && C13619p.m813e(textStyle.m15513n(), textStyle2.m15513n()) && Intrinsics.equals(textStyle.m15506u(), textStyle2.m15506u()));
    }
}
