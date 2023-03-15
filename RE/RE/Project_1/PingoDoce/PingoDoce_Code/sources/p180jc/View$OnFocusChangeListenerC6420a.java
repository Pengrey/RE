package p180jc;

import ad.C0127b;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.redmadrobot.inputmask.helper.EnumC4453a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.C7028a;
import p181jd.Intrinsics;
import p202kc.C6642c;
import p202kc.C6647e;
import p489zc.C13777q;
import p489zc.MutableCollectionsJVM;

/* renamed from: jc.a */
/* loaded from: classes2.dex */
public class View$OnFocusChangeListenerC6420a implements TextWatcher, View.OnFocusChangeListener {

    /* renamed from: A */
    private List f17498A;

    /* renamed from: B */
    private List f17499B;

    /* renamed from: C */
    private EnumC4453a f17500C;

    /* renamed from: D */
    private boolean f17501D;

    /* renamed from: E */
    private boolean f17502E;

    /* renamed from: F */
    private TextWatcher f17503F;

    /* renamed from: G */
    private InterfaceC6422b f17504G;

    /* renamed from: H */
    private boolean f17505H;

    /* renamed from: w */
    private String f17506w;

    /* renamed from: x */
    private int f17507x;

    /* renamed from: y */
    private final WeakReference f17508y;

    /* renamed from: z */
    private String f17509z;

    /* compiled from: MaskedTextChangedListener.kt */
    /* renamed from: jc.a$a */
    /* loaded from: classes2.dex */
    public static final class C6421a {
        private C6421a() {
        }

        public /* synthetic */ C6421a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MaskedTextChangedListener.kt */
    /* renamed from: jc.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC6422b {
        /* renamed from: a */
        void m20973a(boolean z, String str, String str2);
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: jc.a$c */
    /* loaded from: classes2.dex */
    public static final class C6423c<T> implements Comparator {
        public final int compare(Object obj, Object obj2) {
            int m41795a;
            m41795a = C0127b.m41795a(Integer.valueOf(((C6424d) obj2).m20972a()), Integer.valueOf(((C6424d) obj).m20972a()));
            return m41795a;
        }
    }

    /* compiled from: MaskedTextChangedListener.kt */
    /* renamed from: jc.a$d */
    /* loaded from: classes2.dex */
    public static final class C6424d {

        /* renamed from: a */
        private final C6642c f17510a;

        /* renamed from: b */
        private final int f17511b;

        public C6424d(C6642c c6642c, int i) {
            Intrinsics.m20926i(c6642c, "mask");
            this.f17510a = c6642c;
            this.f17511b = i;
        }

        /* renamed from: a */
        public final int m20972a() {
            return this.f17511b;
        }

        /* renamed from: b */
        public final C6642c m20971b() {
            return this.f17510a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6424d) {
                    C6424d c6424d = (C6424d) obj;
                    if (Intrinsics.equals(this.f17510a, c6424d.f17510a)) {
                        if (this.f17511b == c6424d.f17511b) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C6642c c6642c = this.f17510a;
            return ((c6642c != null ? c6642c.hashCode() : 0) * 31) + this.f17511b;
        }

        public String toString() {
            return "MaskAffinity(mask=" + this.f17510a + ", affinity=" + this.f17511b + ")";
        }
    }

    static {
        new C6421a(null);
    }

    public View$OnFocusChangeListenerC6420a(String str, List list, List list2, EnumC4453a enumC4453a, boolean z, boolean z2, EditText editText, TextWatcher textWatcher, InterfaceC6422b interfaceC6422b, boolean z3) {
        Intrinsics.m20926i(str, "primaryFormat");
        Intrinsics.m20926i(list, "affineFormats");
        Intrinsics.m20926i(list2, "customNotations");
        Intrinsics.m20926i(enumC4453a, "affinityCalculationStrategy");
        Intrinsics.m20926i(editText, "field");
        this.f17509z = str;
        this.f17498A = list;
        this.f17499B = list2;
        this.f17500C = enumC4453a;
        this.f17501D = z;
        this.f17502E = z2;
        this.f17503F = textWatcher;
        this.f17504G = interfaceC6422b;
        this.f17505H = z3;
        this.f17506w = BuildConfig.VERSION_NAME;
        this.f17508y = new WeakReference(editText);
    }

    /* renamed from: a */
    private final int m20978a(C6642c c6642c, C7028a c7028a) {
        return this.f17500C.calculateAffinityOfMask(c6642c, c7028a);
    }

    /* renamed from: b */
    private final C6642c m20977b() {
        return m20976c(this.f17509z, this.f17499B);
    }

    /* renamed from: c */
    private final C6642c m20976c(String str, List list) {
        if (this.f17505H) {
            return C6647e.f17933f.m20393a(str, list);
        }
        return C6642c.f17925d.m20403a(str, list);
    }

    /* renamed from: d */
    private final C6642c m20975d(C7028a c7028a) {
        if (this.f17498A.isEmpty()) {
            return m20977b();
        }
        int m20978a = m20978a(m20977b(), c7028a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f17498A) {
            C6642c m20976c = m20976c(str, this.f17499B);
            arrayList.add(new C6424d(m20976c, m20978a(m20976c, c7028a)));
        }
        if (arrayList.size() > 1) {
            MutableCollectionsJVM.m184t(arrayList, new C6423c());
        }
        int i = -1;
        int i2 = 0;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (m20978a >= ((C6424d) it.next()).m20972a()) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (i >= 0) {
            arrayList.add(i, new C6424d(m20977b(), m20978a));
        } else {
            arrayList.add(new C6424d(m20977b(), m20978a));
        }
        return ((C6424d) C13777q.m256L(arrayList)).m20971b();
    }

    public void afterTextChanged(Editable editable) {
        EditText editText = (EditText) this.f17508y.get();
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
        if (editable != null) {
            editable.replace(0, editable.length(), this.f17506w);
        }
        EditText editText2 = (EditText) this.f17508y.get();
        if (editText2 != null) {
            editText2.setSelection(this.f17507x);
        }
        EditText editText3 = (EditText) this.f17508y.get();
        if (editText3 != null) {
            editText3.addTextChangedListener(this);
        }
        TextWatcher textWatcher = this.f17503F;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(editable);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcher textWatcher = this.f17503F;
        if (textWatcher != null) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    /* renamed from: e */
    public final void m20974e(boolean z) {
        this.f17502E = z;
    }

    public void onFocusChange(View view, boolean z) {
        String valueOf;
        if (this.f17501D && z) {
            EditText editText = (EditText) this.f17508y.get();
            Editable text = editText != null ? editText.getText() : null;
            if (text == null) {
                Intrinsics.m20916s();
            }
            if (text.length() == 0) {
                valueOf = BuildConfig.VERSION_NAME;
            } else {
                EditText editText2 = (EditText) this.f17508y.get();
                valueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
            }
            C7028a c7028a = new C7028a(valueOf, valueOf.length(), new C7028a.AbstractC7029a.C7031b(this.f17501D));
            C6642c.C6645c mo20395b = m20975d(c7028a).mo20395b(c7028a);
            this.f17506w = mo20395b.m20399d().m19549c();
            this.f17507x = mo20395b.m20399d().m19550b();
            EditText editText3 = (EditText) this.f17508y.get();
            if (editText3 != null) {
                editText3.setText(this.f17506w);
            }
            EditText editText4 = (EditText) this.f17508y.get();
            if (editText4 != null) {
                editText4.setSelection(mo20395b.m20399d().m19550b());
            }
            InterfaceC6422b interfaceC6422b = this.f17504G;
            if (interfaceC6422b != null) {
                interfaceC6422b.m20973a(mo20395b.m20401b(), mo20395b.m20400c(), this.f17506w);
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.m20926i(charSequence, "text");
        boolean z = i2 > 0 && i3 == 0;
        C7028a.AbstractC7029a c7030a = z ? new C7028a.AbstractC7029a.C7030a(z ? this.f17502E : false) : new C7028a.AbstractC7029a.C7031b(z ? false : this.f17501D);
        if (!z) {
            i += i3;
        }
        C7028a c7028a = new C7028a(charSequence.toString(), i, c7030a);
        C6642c.C6645c mo20395b = m20975d(c7028a).mo20395b(c7028a);
        this.f17506w = mo20395b.m20399d().m19549c();
        this.f17507x = mo20395b.m20399d().m19550b();
        InterfaceC6422b interfaceC6422b = this.f17504G;
        if (interfaceC6422b != null) {
            interfaceC6422b.m20973a(mo20395b.m20401b(), mo20395b.m20400c(), this.f17506w);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ View$OnFocusChangeListenerC6420a(java.lang.String r14, java.util.List r15, java.util.List r16, com.redmadrobot.inputmask.helper.EnumC4453a r17, boolean r18, boolean r19, android.widget.EditText r20, android.text.TextWatcher r21, p180jc.View$OnFocusChangeListenerC6420a.InterfaceC6422b r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 2
            if (r1 == 0) goto Lc
            java.util.List r1 = p489zc.C13777q.m237g()
            r4 = r1
            goto Ld
        Lc:
            r4 = r15
        Ld:
            r1 = r0 & 4
            if (r1 == 0) goto L17
            java.util.List r1 = p489zc.C13777q.m237g()
            r5 = r1
            goto L19
        L17:
            r5 = r16
        L19:
            r1 = r0 & 8
            if (r1 == 0) goto L21
            com.redmadrobot.inputmask.helper.a r1 = com.redmadrobot.inputmask.helper.EnumC4453a.WHOLE_STRING
            r6 = r1
            goto L23
        L21:
            r6 = r17
        L23:
            r1 = r0 & 16
            if (r1 == 0) goto L2a
            r1 = 1
            r7 = r1
            goto L2c
        L2a:
            r7 = r18
        L2c:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L33
            r8 = r2
            goto L35
        L33:
            r8 = r19
        L35:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r3 = 0
            if (r1 == 0) goto L3c
            r10 = r3
            goto L3e
        L3c:
            r10 = r21
        L3e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L44
            r11 = r3
            goto L46
        L44:
            r11 = r22
        L46:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4c
            r12 = r2
            goto L4e
        L4c:
            r12 = r23
        L4e:
            r2 = r13
            r3 = r14
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p180jc.View$OnFocusChangeListenerC6420a.<init>(java.lang.String, java.util.List, java.util.List, com.redmadrobot.inputmask.helper.a, boolean, boolean, android.widget.EditText, android.text.TextWatcher, jc.a$b, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnFocusChangeListenerC6420a(String str, EditText editText) {
        this(str, editText, null);
        Intrinsics.m20926i(str, "format");
        Intrinsics.m20926i(editText, "field");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnFocusChangeListenerC6420a(String str, EditText editText, InterfaceC6422b interfaceC6422b) {
        this(str, editText, null, interfaceC6422b);
        Intrinsics.m20926i(str, "format");
        Intrinsics.m20926i(editText, "field");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnFocusChangeListenerC6420a(String str, EditText editText, TextWatcher textWatcher, InterfaceC6422b interfaceC6422b) {
        this(str, true, editText, textWatcher, interfaceC6422b);
        Intrinsics.m20926i(str, "format");
        Intrinsics.m20926i(editText, "field");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public View$OnFocusChangeListenerC6420a(java.lang.String r15, boolean r16, android.widget.EditText r17, android.text.TextWatcher r18, p180jc.View$OnFocusChangeListenerC6420a.InterfaceC6422b r19) {
        /*
            r14 = this;
            java.lang.String r0 = "format"
            r2 = r15
            p181jd.Intrinsics.m20926i(r15, r0)
            java.lang.String r0 = "field"
            r8 = r17
            p181jd.Intrinsics.m20926i(r8, r0)
            java.util.List r3 = p489zc.C13777q.m237g()
            java.util.List r4 = p489zc.C13777q.m237g()
            com.redmadrobot.inputmask.helper.a r5 = com.redmadrobot.inputmask.helper.EnumC4453a.WHOLE_STRING
            r7 = 0
            r11 = 0
            r12 = 512(0x200, float:7.175E-43)
            r13 = 0
            r1 = r14
            r6 = r16
            r9 = r18
            r10 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p180jc.View$OnFocusChangeListenerC6420a.<init>(java.lang.String, boolean, android.widget.EditText, android.text.TextWatcher, jc.a$b):void");
    }
}
