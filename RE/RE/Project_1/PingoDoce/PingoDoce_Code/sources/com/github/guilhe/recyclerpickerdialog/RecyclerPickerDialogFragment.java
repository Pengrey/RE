package com.github.guilhe.recyclerpickerdialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1348c;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import androidx.recyclerview.widget.C1590g;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import id.InterfaceC6108l;
import id.InterfaceC6113q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p351s5.C10071g;
import p351s5.C10072h;
import p351s5.ItemsAdapter;
import p363t5.AbstractC10381a;
import p468yc.C13195u;
import p489zc._Collections;
import sd.C10171u;

/* compiled from: RecyclerPickerDialogFragment.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\u000bB!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m20207d2 = {"Lcom/github/guilhe/recyclerpickerdialog/RecyclerPickerDialogFragment;", "Landroidx/fragment/app/c;", "Landroidx/lifecycle/s;", "Lkotlin/Function1;", BuildConfig.VERSION_NAME, "Ls5/b;", "Lyc/u;", "onItemsPicked", "<init>", "(Lid/l;)V", "c1", "a", "recycler-picker-dialog_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class RecyclerPickerDialogFragment extends DialogInterface$OnCancelListenerC1348c implements InterfaceC1485s {

    /* renamed from: c1 */
    public static final C2356a f6857c1 = new C2356a(null);

    /* renamed from: M0 */
    private ArrayList f6858M0;

    /* renamed from: N0 */
    private ItemsAdapter f6859N0;

    /* renamed from: O0 */
    private AbstractC10381a f6860O0;

    /* renamed from: P0 */
    private String f6861P0;

    /* renamed from: Q0 */
    private String f6862Q0;

    /* renamed from: R0 */
    private String f6863R0;

    /* renamed from: S0 */
    private boolean f6864S0;

    /* renamed from: T0 */
    private boolean f6865T0;

    /* renamed from: U0 */
    private boolean f6866U0;

    /* renamed from: V0 */
    private boolean f6867V0;

    /* renamed from: W0 */
    private ArrayList f6868W0;

    /* renamed from: X0 */
    private Integer f6869X0;

    /* renamed from: Y0 */
    private int f6870Y0;

    /* renamed from: Z0 */
    private boolean f6871Z0;

    /* renamed from: a1 */
    private InterfaceC1491v f6872a1;

    /* renamed from: b1 */
    private final InterfaceC6108l f6873b1;

    /* compiled from: RecyclerPickerDialogFragment.kt */
    /* renamed from: com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment$a */
    /* loaded from: classes.dex */
    public static final class C2356a {
        private C2356a() {
        }

        /* renamed from: b */
        public static /* synthetic */ RecyclerPickerDialogFragment m33815b(C2356a c2356a, EnumC2360a enumC2360a, EnumC2361b enumC2361b, int i, InterfaceC6108l interfaceC6108l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                enumC2360a = EnumC2360a.SINGLE;
            }
            if ((i2 & 2) != 0) {
                enumC2361b = EnumC2361b.CHECK_BOX;
            }
            if ((i2 & 4) != 0) {
                i = C10072h.RecyclerPickerDialogTheme;
            }
            return c2356a.m33816a(enumC2360a, enumC2361b, i, interfaceC6108l);
        }

        /* renamed from: a */
        public final RecyclerPickerDialogFragment m33816a(EnumC2360a enumC2360a, EnumC2361b enumC2361b, int i, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(enumC2360a, "type");
            Intrinsics.isThisObjectNull(enumC2361b, "selector");
            Intrinsics.isThisObjectNull(interfaceC6108l, "onItemsPicked");
            RecyclerPickerDialogFragment recyclerPickerDialogFragment = new RecyclerPickerDialogFragment(interfaceC6108l);
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FOR_SELECTION_TYPE", enumC2360a);
            bundle.putSerializable("EXTRA_FOR_SELECTOR_TYPE", enumC2361b);
            bundle.putInt("EXTRA_FOR_THEME", i);
            C13195u c13195u = C13195u.f34156a;
            recyclerPickerDialogFragment.m37630P1(bundle);
            return recyclerPickerDialogFragment;
        }

        public /* synthetic */ C2356a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RecyclerPickerDialogFragment.kt */
    /* renamed from: com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment$b */
    /* loaded from: classes.dex */
    static final class C2357b extends AbstractC6438m implements InterfaceC6113q {
        C2357b() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m33814a((p351s5.RecyclerPickerDialogFragment) obj, (p351s5.RecyclerPickerDialogFragment) obj2, ((Boolean) obj3).booleanValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m33814a(p351s5.RecyclerPickerDialogFragment recyclerPickerDialogFragment, p351s5.RecyclerPickerDialogFragment recyclerPickerDialogFragment2, boolean z) {
            Object obj;
            int m478Q;
            p351s5.RecyclerPickerDialogFragment recyclerPickerDialogFragment3;
            boolean z2;
            Intrinsics.isThisObjectNull(recyclerPickerDialogFragment2, "new");
            Object obj2 = null;
            if (z) {
                Iterator it = RecyclerPickerDialogFragment.this.m33831F2().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.equals(((p351s5.RecyclerPickerDialogFragment) obj).m9277a(), recyclerPickerDialogFragment2.m9277a())) {
                        break;
                    }
                }
                p351s5.RecyclerPickerDialogFragment recyclerPickerDialogFragment4 = (p351s5.RecyclerPickerDialogFragment) obj;
                if (recyclerPickerDialogFragment4 != null) {
                    recyclerPickerDialogFragment4.m9274d((Intrinsics.equals(recyclerPickerDialogFragment, recyclerPickerDialogFragment2) && recyclerPickerDialogFragment2.m9275c()) ? false : true);
                }
                if (recyclerPickerDialogFragment != null) {
                    Iterator it2 = RecyclerPickerDialogFragment.this.m33831F2().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (Intrinsics.equals(((p351s5.RecyclerPickerDialogFragment) next).m9277a(), recyclerPickerDialogFragment.m9277a()) && (!Intrinsics.equals(recyclerPickerDialogFragment3.m9277a(), recyclerPickerDialogFragment2.m9277a()))) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            obj2 = next;
                            break;
                        }
                    }
                    p351s5.RecyclerPickerDialogFragment recyclerPickerDialogFragment5 = (p351s5.RecyclerPickerDialogFragment) obj2;
                    if (recyclerPickerDialogFragment5 != null) {
                        recyclerPickerDialogFragment5.m9274d(false);
                    }
                }
                RecyclerPickerDialogFragment.m33836A2(RecyclerPickerDialogFragment.this).m36541l(RecyclerPickerDialogFragment.m33835B2(RecyclerPickerDialogFragment.this).indexOf(recyclerPickerDialogFragment2));
                ItemsAdapter m33836A2 = RecyclerPickerDialogFragment.m33836A2(RecyclerPickerDialogFragment.this);
                m478Q = _Collections.m478Q(RecyclerPickerDialogFragment.m33835B2(RecyclerPickerDialogFragment.this), recyclerPickerDialogFragment);
                m33836A2.m36541l(m478Q);
            } else {
                Iterator it3 = RecyclerPickerDialogFragment.this.m33831F2().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.equals(((p351s5.RecyclerPickerDialogFragment) next2).m9277a(), recyclerPickerDialogFragment2.m9277a())) {
                        obj2 = next2;
                        break;
                    }
                }
                p351s5.RecyclerPickerDialogFragment recyclerPickerDialogFragment6 = (p351s5.RecyclerPickerDialogFragment) obj2;
                if (recyclerPickerDialogFragment6 != null) {
                    recyclerPickerDialogFragment6.m9274d(!recyclerPickerDialogFragment2.m9275c());
                }
                RecyclerPickerDialogFragment.m33836A2(RecyclerPickerDialogFragment.this).m36541l(RecyclerPickerDialogFragment.m33835B2(RecyclerPickerDialogFragment.this).indexOf(recyclerPickerDialogFragment2));
            }
            RecyclerPickerDialogFragment.m33832E2(RecyclerPickerDialogFragment.this);
            if (RecyclerPickerDialogFragment.this.m33830G2()) {
                RecyclerPickerDialogFragment.m33818y2(RecyclerPickerDialogFragment.this).f26997x.performClick();
            } else {
                RecyclerPickerDialogFragment.m33833D2(RecyclerPickerDialogFragment.this);
            }
        }
    }

    /* compiled from: RecyclerPickerDialogFragment.kt */
    /* renamed from: com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment$c */
    /* loaded from: classes.dex */
    public static final class C2358c implements TextWatcher {
        C2358c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean m8926F;
            String obj = charSequence != null ? charSequence.toString() : null;
            RecyclerPickerDialogFragment.m33835B2(RecyclerPickerDialogFragment.this).clear();
            if (obj == null || obj.length() == 0) {
                RecyclerPickerDialogFragment.m33835B2(RecyclerPickerDialogFragment.this).addAll(RecyclerPickerDialogFragment.this.m33831F2());
            } else {
                ArrayList m33835B2 = RecyclerPickerDialogFragment.m33835B2(RecyclerPickerDialogFragment.this);
                ArrayList m33831F2 = RecyclerPickerDialogFragment.this.m33831F2();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : m33831F2) {
                    m8926F = C10171u.m8926F(((p351s5.RecyclerPickerDialogFragment) obj2).m9276b(), obj, true);
                    if (m8926F) {
                        arrayList.add(obj2);
                    }
                }
                m33835B2.addAll(arrayList);
            }
            if (RecyclerPickerDialogFragment.m33817z2(RecyclerPickerDialogFragment.this) != null) {
                RecyclerPickerDialogFragment.m33836A2(RecyclerPickerDialogFragment.this).m9268I(RecyclerPickerDialogFragment.m33835B2(RecyclerPickerDialogFragment.this));
            }
        }
    }

    /* compiled from: RecyclerPickerDialogFragment.kt */
    /* renamed from: com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment$d */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC2359d implements View.OnClickListener {
        View$OnClickListenerC2359d() {
        }

        public final void onClick(View view) {
            InterfaceC6108l m33834C2 = RecyclerPickerDialogFragment.m33834C2(RecyclerPickerDialogFragment.this);
            ArrayList m33831F2 = RecyclerPickerDialogFragment.this.m33831F2();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m33831F2) {
                if (((p351s5.RecyclerPickerDialogFragment) obj).m9275c()) {
                    arrayList.add(obj);
                }
            }
            m33834C2.mo9587d(arrayList);
            RecyclerPickerDialogFragment.this.mo30315j2();
        }
    }

    public RecyclerPickerDialogFragment(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "onItemsPicked");
        this.f6873b1 = interfaceC6108l;
        this.f6858M0 = new ArrayList();
        this.f6861P0 = BuildConfig.VERSION_NAME;
        this.f6862Q0 = BuildConfig.VERSION_NAME;
        this.f6863R0 = "Ok";
        this.f6865T0 = true;
        this.f6866U0 = true;
        this.f6868W0 = new ArrayList();
        this.f6870Y0 = -1;
    }

    /* renamed from: A2 */
    public static final /* synthetic */ ItemsAdapter m33836A2(RecyclerPickerDialogFragment recyclerPickerDialogFragment) {
        ItemsAdapter itemsAdapter = recyclerPickerDialogFragment.f6859N0;
        if (itemsAdapter == null) {
            Intrinsics.throwUninitPropException("dataAdapter");
        }
        return itemsAdapter;
    }

    /* renamed from: B2 */
    public static final /* synthetic */ ArrayList m33835B2(RecyclerPickerDialogFragment recyclerPickerDialogFragment) {
        return recyclerPickerDialogFragment.f6858M0;
    }

    /* renamed from: C2 */
    public static final /* synthetic */ InterfaceC6108l m33834C2(RecyclerPickerDialogFragment recyclerPickerDialogFragment) {
        return recyclerPickerDialogFragment.f6873b1;
    }

    /* renamed from: D2 */
    public static final /* synthetic */ void m33833D2(RecyclerPickerDialogFragment recyclerPickerDialogFragment) {
        recyclerPickerDialogFragment.m33822O2();
    }

    /* renamed from: E2 */
    public static final /* synthetic */ void m33832E2(RecyclerPickerDialogFragment recyclerPickerDialogFragment) {
        recyclerPickerDialogFragment.m33821P2();
    }

    /* renamed from: O2 */
    private final void m33822O2() {
        if (this.f6866U0 && this.f6864S0) {
            AbstractC10381a abstractC10381a = this.f6860O0;
            if (abstractC10381a == null) {
                Intrinsics.throwUninitPropException("binding");
            }
            abstractC10381a.f26996B.requestFocus();
            Object systemService = m37650H1().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            AbstractC10381a abstractC10381a2 = this.f6860O0;
            if (abstractC10381a2 == null) {
                Intrinsics.throwUninitPropException("binding");
            }
            TextInputEditText textInputEditText = abstractC10381a2.f26999z;
            Intrinsics.checkIfNull(textInputEditText, "binding.search");
            inputMethodManager.hideSoftInputFromWindow(textInputEditText.getWindowToken(), 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r3 > 0) goto L32;
     */
    /* renamed from: P2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m33821P2() {
        /*
            r5 = this;
            t5.a r0 = r5.f6860O0
            if (r0 == 0) goto L4c
            if (r0 != 0) goto Lb
            java.lang.String r1 = "binding"
            p181jd.Intrinsics.throwUninitPropException(r1)
        Lb:
            com.google.android.material.button.MaterialButton r0 = r0.f26997x
            java.lang.String r1 = "binding.btnOk"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            boolean r1 = r5.f6871Z0
            r2 = 0
            if (r1 == 0) goto L48
            if (r1 == 0) goto L49
            java.util.ArrayList r1 = r5.f6868W0
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L27
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L27
            r3 = r2
            goto L46
        L27:
            java.util.Iterator r1 = r1.iterator()
            r3 = r2
        L2c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r1.next()
            s5.b r4 = (p351s5.RecyclerPickerDialogFragment) r4
            boolean r4 = r4.m9275c()
            if (r4 == 0) goto L2c
            int r3 = r3 + 1
            if (r3 >= 0) goto L2c
            p489zc.C13777q.m222p()
            goto L2c
        L46:
            if (r3 <= 0) goto L49
        L48:
            r2 = 1
        L49:
            r0.setEnabled(r2)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.m33821P2():void");
    }

    /* renamed from: y2 */
    public static final /* synthetic */ AbstractC10381a m33818y2(RecyclerPickerDialogFragment recyclerPickerDialogFragment) {
        AbstractC10381a abstractC10381a = recyclerPickerDialogFragment.f6860O0;
        if (abstractC10381a == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        return abstractC10381a;
    }

    /* renamed from: z2 */
    public static final /* synthetic */ ItemsAdapter m33817z2(RecyclerPickerDialogFragment recyclerPickerDialogFragment) {
        return recyclerPickerDialogFragment.f6859N0;
    }

    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        Serializable serializable;
        Serializable serializable2;
        super.mo29886D0(bundle);
        Bundle m37660E = m37660E();
        if (m37660E == null || (serializable = m37660E.getSerializable("EXTRA_FOR_SELECTION_TYPE")) == null) {
            serializable = EnumC2360a.SINGLE;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.github.guilhe.recyclerpickerdialog.SelectionType");
        EnumC2360a enumC2360a = (EnumC2360a) serializable;
        Bundle m37660E2 = m37660E();
        if (m37660E2 == null || (serializable2 = m37660E2.getSerializable("EXTRA_FOR_SELECTOR_TYPE")) == null) {
            serializable2 = EnumC2361b.CHECK_BOX;
        }
        Objects.requireNonNull(serializable2, "null cannot be cast to non-null type com.github.guilhe.recyclerpickerdialog.SelectorType");
        this.f6859N0 = new ItemsAdapter(enumC2360a, (EnumC2361b) serializable2, new C2357b());
        Bundle m37660E3 = m37660E();
        m37326v2(1, m37660E3 != null ? m37660E3.getInt("EXTRA_FOR_THEME", C10072h.RecyclerPickerDialogTheme) : C10072h.RecyclerPickerDialogTheme);
    }

    /* renamed from: F2 */
    public final ArrayList m33831F2() {
        return this.f6868W0;
    }

    /* renamed from: G2 */
    public final boolean m33830G2() {
        return this.f6867V0;
    }

    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.isThisObjectNull(layoutInflater, "inflater");
        ViewDataBinding m37764e = C1275f.m37764e(layoutInflater, C10071g.fragment_recycler_picker_dialog, null, false);
        AbstractC10381a abstractC10381a = (AbstractC10381a) m37764e;
        Intrinsics.checkIfNull(abstractC10381a, "it");
        this.f6860O0 = abstractC10381a;
        Intrinsics.checkIfNull(m37764e, "DataBindingUtil\n        …   .also { binding = it }");
        return abstractC10381a.m37802s();
    }

    /* renamed from: H2 */
    public final void m33829H2(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f6863R0 = str;
    }

    /* renamed from: I2 */
    public final void m33828I2(boolean z) {
        this.f6871Z0 = z;
        m33821P2();
    }

    /* renamed from: J2 */
    public final void m33827J2(ArrayList arrayList) {
        Intrinsics.isThisObjectNull(arrayList, "value");
        this.f6868W0 = arrayList;
        if (this.f6865T0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p351s5.RecyclerPickerDialogFragment) it.next()).m9274d(false);
            }
        }
        this.f6858M0.clear();
        this.f6858M0.addAll(this.f6868W0);
        ItemsAdapter itemsAdapter = this.f6859N0;
        if (itemsAdapter != null) {
            if (itemsAdapter == null) {
                Intrinsics.throwUninitPropException("dataAdapter");
            }
            itemsAdapter.m9268I(this.f6858M0);
        }
    }

    /* renamed from: K2 */
    public final void m33826K2(int i) {
        if (i < 0) {
            i = -1;
        }
        this.f6870Y0 = i;
    }

    /* renamed from: L2 */
    public final void m33825L2(boolean z) {
        this.f6867V0 = z;
    }

    /* renamed from: M2 */
    public final void m33824M2(InterfaceC1491v interfaceC1491v) {
        AbstractC1469p mo137b;
        this.f6872a1 = interfaceC1491v;
        if (interfaceC1491v == null || (mo137b = interfaceC1491v.mo137b()) == null) {
            return;
        }
        mo137b.mo10402a(this);
    }

    /* renamed from: N2 */
    public final void m33823N2(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f6861P0 = str;
    }

    /* renamed from: a1 */
    public void mo29891a1() {
        super.mo29891a1();
        Dialog m37335m2 = m37335m2();
        Window window = m37335m2 != null ? m37335m2.getWindow() : null;
        Intrinsics.ifNullDoSomething(window);
        window.setLayout(-1, this.f6870Y0);
        AbstractC10381a abstractC10381a = this.f6860O0;
        if (abstractC10381a == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        abstractC10381a.f26999z.setText(BuildConfig.VERSION_NAME);
        AbstractC10381a abstractC10381a2 = this.f6860O0;
        if (abstractC10381a2 == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        abstractC10381a2.f26998y.m36643l1(0);
    }

    /* renamed from: c1 */
    public void mo37596c1(View view, Bundle bundle) {
        Intrinsics.isThisObjectNull(view, "view");
        super.mo37596c1(view, bundle);
        AbstractC10381a abstractC10381a = this.f6860O0;
        if (abstractC10381a == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        MaterialTextView materialTextView = abstractC10381a.f26996B;
        Intrinsics.checkIfNull(materialTextView, "binding.title");
        materialTextView.setText(this.f6861P0);
        AbstractC10381a abstractC10381a2 = this.f6860O0;
        if (abstractC10381a2 == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        TextInputLayout textInputLayout = abstractC10381a2.f26995A;
        Intrinsics.checkIfNull(textInputLayout, "binding.searchLayout");
        textInputLayout.setVisibility(this.f6864S0 ? 0 : 8);
        AbstractC10381a abstractC10381a3 = this.f6860O0;
        if (abstractC10381a3 == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        TextInputEditText textInputEditText = abstractC10381a3.f26999z;
        Intrinsics.checkIfNull(textInputEditText, "binding.search");
        textInputEditText.setHint(this.f6862Q0);
        AbstractC10381a abstractC10381a4 = this.f6860O0;
        if (abstractC10381a4 == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        abstractC10381a4.f26999z.addTextChangedListener(new C2358c());
        if (this.f6865T0) {
            for (p351s5.RecyclerPickerDialogFragment recyclerPickerDialogFragment : this.f6868W0) {
                recyclerPickerDialogFragment.m9274d(false);
            }
            this.f6858M0.clear();
            this.f6858M0.addAll(this.f6868W0);
        }
        AbstractC10381a abstractC10381a5 = this.f6860O0;
        if (abstractC10381a5 == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        RecyclerView recyclerView = abstractC10381a5.f26998y;
        RecyclerView.AbstractC1540l itemAnimator = recyclerView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((C1590g) itemAnimator).m35831R(false);
        Integer num = this.f6869X0;
        if (num != null) {
            recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), num.intValue()));
        }
        ItemsAdapter itemsAdapter = this.f6859N0;
        if (itemsAdapter == null) {
            Intrinsics.throwUninitPropException("dataAdapter");
        }
        itemsAdapter.m9268I(this.f6858M0);
        C13195u c13195u = C13195u.f34156a;
        recyclerView.setAdapter(itemsAdapter);
        m33821P2();
        AbstractC10381a abstractC10381a6 = this.f6860O0;
        if (abstractC10381a6 == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        MaterialButton materialButton = abstractC10381a6.f26997x;
        Intrinsics.checkIfNull(materialButton, "binding.btnOk");
        materialButton.setText(this.f6863R0);
        AbstractC10381a abstractC10381a7 = this.f6860O0;
        if (abstractC10381a7 == null) {
            Intrinsics.throwUninitPropException("binding");
        }
        abstractC10381a7.f26997x.setOnClickListener(new View$OnClickListenerC2359d());
    }

    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        Intrinsics.isThisObjectNull(interfaceC1491v, "source");
        Intrinsics.isThisObjectNull(enumC1471b, "event");
        if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY && m37573n0()) {
            mo30314k2();
        }
    }
}
