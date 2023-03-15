package p221le;

import android.content.Intent;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.LiveData;
import me.C7184a;
import me.C7187e;
import me.InterfaceC7186c;
import me.ToastEvent;
import ne.NavigationWithExtraEvent;
import p181jd.Intrinsics;
import p221le.UiWidgets;
import p274oe.BooleanDialogEvent;
import p274oe.OkDialogEvent;
import p274oe.PhotoDialogEvent;
import p468yc.C13195u;

/* renamed from: le.a */
/* loaded from: classes2.dex */
public final class UiEventsLiveData {

    /* renamed from: a */
    public static final UiEventsLiveData f18671a = new UiEventsLiveData();

    /* renamed from: b */
    private static final C1436e0 f18672b;

    /* renamed from: c */
    private static final LiveData f18673c;

    /* renamed from: d */
    private static final C1436e0 f18674d;

    /* renamed from: e */
    private static final LiveData f18675e;

    /* renamed from: f */
    private static final C1436e0 f18676f;

    /* renamed from: g */
    private static final LiveData f18677g;

    /* renamed from: h */
    private static final C1436e0 f18678h;

    /* renamed from: i */
    private static final LiveData f18679i;

    /* renamed from: j */
    private static final C1436e0 f18680j;

    /* renamed from: k */
    private static final LiveData f18681k;

    /* renamed from: l */
    private static final C1436e0 f18682l;

    /* renamed from: m */
    private static final LiveData f18683m;

    /* renamed from: n */
    private static final C1436e0 f18684n;

    /* renamed from: o */
    private static final LiveData f18685o;

    /* renamed from: p */
    private static final C1436e0 f18686p;

    /* renamed from: q */
    private static final LiveData f18687q;

    static {
        C1436e0 c1436e0 = new C1436e0();
        f18672b = c1436e0;
        f18673c = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        f18674d = c1436e02;
        f18675e = c1436e02;
        C1436e0 c1436e03 = new C1436e0();
        f18676f = c1436e03;
        f18677g = c1436e03;
        C1436e0 c1436e04 = new C1436e0();
        f18678h = c1436e04;
        f18679i = c1436e04;
        C1436e0 c1436e05 = new C1436e0();
        f18680j = c1436e05;
        f18681k = c1436e05;
        C1436e0 c1436e06 = new C1436e0();
        f18682l = c1436e06;
        f18683m = c1436e06;
        C1436e0 c1436e07 = new C1436e0();
        f18684n = c1436e07;
        f18685o = c1436e07;
        C1436e0 c1436e08 = new C1436e0();
        f18686p = c1436e08;
        f18687q = c1436e08;
    }

    private UiEventsLiveData() {
    }

    /* renamed from: k */
    public static /* synthetic */ void m19519k(UiEventsLiveData uiEventsLiveData, String str, String str2, String str3, String str4, UiWidgets.InterfaceC7044a interfaceC7044a, int i, Object obj) {
        uiEventsLiveData.m19520j(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, interfaceC7044a);
    }

    /* renamed from: m */
    public static /* synthetic */ void m19517m(UiEventsLiveData uiEventsLiveData, int i, Intent intent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            intent = null;
        }
        uiEventsLiveData.m19518l(i, intent);
    }

    /* renamed from: p */
    public static /* synthetic */ void m19514p(UiEventsLiveData uiEventsLiveData, String str, String str2, UiWidgets.InterfaceC7047d interfaceC7047d, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC7047d = null;
        }
        uiEventsLiveData.m19515o(str, str2, interfaceC7047d);
    }

    /* renamed from: a */
    public final LiveData m19529a() {
        return f18685o;
    }

    /* renamed from: b */
    public final LiveData m19528b() {
        return f18677g;
    }

    /* renamed from: c */
    public final LiveData m19527c() {
        return f18673c;
    }

    /* renamed from: d */
    public final LiveData m19526d() {
        return f18679i;
    }

    /* renamed from: e */
    public final LiveData m19525e() {
        return f18683m;
    }

    /* renamed from: f */
    public final LiveData m19524f() {
        return f18687q;
    }

    /* renamed from: g */
    public final LiveData m19523g() {
        return f18681k;
    }

    /* renamed from: h */
    public final LiveData m19522h() {
        return f18675e;
    }

    /* renamed from: i */
    public final void m19521i(String str, Spanned spanned, String str2, String str3, UiWidgets.InterfaceC7044a interfaceC7044a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(spanned, "message");
        Intrinsics.isThisObjectNull(interfaceC7044a, "callback");
        f18684n.mo169m(new BooleanDialogEvent(str, spanned, str2, str3, interfaceC7044a));
    }

    /* renamed from: j */
    public final void m19520j(String str, String str2, String str3, String str4, UiWidgets.InterfaceC7044a interfaceC7044a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "message");
        Intrinsics.isThisObjectNull(interfaceC7044a, "callback");
        m19521i(str, new SpannableString(str2), str3, str4, interfaceC7044a);
    }

    /* renamed from: l */
    public final void m19518l(int i, Intent intent) {
        f18676f.mo169m(new C7184a(i, intent));
    }

    /* renamed from: n */
    public final void m19516n(String str, Spanned spanned, UiWidgets.InterfaceC7047d interfaceC7047d) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(spanned, "message");
        f18682l.mo169m(new OkDialogEvent(str, spanned, interfaceC7047d));
    }

    /* renamed from: o */
    public final void m19515o(String str, String str2, UiWidgets.InterfaceC7047d interfaceC7047d) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "message");
        m19516n(str, new SpannableString(str2), interfaceC7047d);
    }

    /* renamed from: q */
    public final void m19513q() {
        f18672b.mo169m(new C7187e());
    }

    /* renamed from: r */
    public final void m19512r(InterfaceC7186c interfaceC7186c, Object obj) {
        Intrinsics.isThisObjectNull(interfaceC7186c, "type");
        C1436e0 c1436e0 = f18678h;
        if (obj == null) {
            obj = C13195u.f34156a;
        }
        c1436e0.mo169m(new NavigationWithExtraEvent(interfaceC7186c, obj));
    }

    /* renamed from: s */
    public final void m19511s(UiWidgets.InterfaceC7048e interfaceC7048e) {
        Intrinsics.isThisObjectNull(interfaceC7048e, "callback");
        f18686p.mo169m(new PhotoDialogEvent(interfaceC7048e));
    }

    /* renamed from: t */
    public final void m19510t(String str) {
        Intrinsics.isThisObjectNull(str, "message");
        if (str.length() > 0) {
            f18680j.mo169m(new ToastEvent(str));
        }
    }

    /* renamed from: u */
    public final void m19509u() {
        f18674d.mo169m(new C7187e());
    }
}
