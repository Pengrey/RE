package p351s5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.guilhe.recyclerpickerdialog.EnumC2360a;
import com.github.guilhe.recyclerpickerdialog.EnumC2361b;
import id.InterfaceC6113q;
import java.util.ArrayList;
import p181jd.Intrinsics;
import p363t5.AbstractC10383c;

/* renamed from: s5.c */
/* loaded from: classes.dex */
public final class ItemsAdapter extends RecyclerView.AbstractC1535g {

    /* renamed from: c */
    private final ArrayList f26321c;

    /* renamed from: d */
    private final boolean f26322d;

    /* renamed from: e */
    private RecyclerPickerDialogFragment f26323e;

    /* renamed from: f */
    private final EnumC2361b f26324f;

    /* renamed from: g */
    private final InterfaceC6113q f26325g;

    /* compiled from: ItemsAdapter.kt */
    /* renamed from: s5.c$a */
    /* loaded from: classes.dex */
    public static final class C10063a extends RecyclerView.AbstractC1531c0 {

        /* renamed from: t */
        private final Context f26326t;

        /* renamed from: u */
        private final AbstractC10383c f26327u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10063a(AbstractC10383c abstractC10383c) {
            super(abstractC10383c.m37802s());
            Intrinsics.isThisObjectNull(abstractC10383c, "binding");
            this.f26327u = abstractC10383c;
            View m37802s = abstractC10383c.m37802s();
            Intrinsics.checkIfNull(m37802s, "binding.root");
            this.f26326t = m37802s.getContext();
        }

        /* renamed from: M */
        public final AbstractC10383c m9263M() {
            return this.f26327u;
        }

        /* renamed from: N */
        public final Context m9262N() {
            return this.f26326t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemsAdapter.kt */
    /* renamed from: s5.c$b */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC10064b implements View.OnClickListener {

        /* renamed from: x */
        final /* synthetic */ C10063a f26329x;

        View$OnClickListenerC10064b(C10063a c10063a) {
            this.f26329x = c10063a;
        }

        public final void onClick(View view) {
            int i = C10068d.f26336a[ItemsAdapter.this.m9272E().ordinal()];
            if (i == 1) {
                this.f26329x.m9263M().f27008x.performClick();
            } else if (i == 2) {
                this.f26329x.m9263M().f27009y.performClick();
            } else if (i != 3) {
            } else {
                this.f26329x.m9263M().f27010z.performClick();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemsAdapter.kt */
    /* renamed from: s5.c$c */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC10065c implements View.OnClickListener {

        /* renamed from: x */
        final /* synthetic */ C10063a f26331x;

        View$OnClickListenerC10065c(C10063a c10063a) {
            this.f26331x = c10063a;
        }

        public final void onClick(View view) {
            ItemsAdapter.m9273D(ItemsAdapter.this, this.f26331x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemsAdapter.kt */
    /* renamed from: s5.c$d */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC10066d implements View.OnClickListener {

        /* renamed from: x */
        final /* synthetic */ C10063a f26333x;

        View$OnClickListenerC10066d(C10063a c10063a) {
            this.f26333x = c10063a;
        }

        public final void onClick(View view) {
            ItemsAdapter.m9273D(ItemsAdapter.this, this.f26333x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemsAdapter.kt */
    /* renamed from: s5.c$e */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC10067e implements View.OnClickListener {

        /* renamed from: x */
        final /* synthetic */ C10063a f26335x;

        View$OnClickListenerC10067e(C10063a c10063a) {
            this.f26335x = c10063a;
        }

        public final void onClick(View view) {
            ItemsAdapter.m9273D(ItemsAdapter.this, this.f26335x);
        }
    }

    public ItemsAdapter(EnumC2360a enumC2360a, EnumC2361b enumC2361b, InterfaceC6113q interfaceC6113q) {
        Intrinsics.isThisObjectNull(enumC2360a, "selection");
        Intrinsics.isThisObjectNull(enumC2361b, "selectorType");
        Intrinsics.isThisObjectNull(interfaceC6113q, "onDataUpdate");
        this.f26324f = enumC2361b;
        this.f26325g = interfaceC6113q;
        this.f26321c = new ArrayList();
        this.f26322d = enumC2360a == EnumC2360a.SINGLE;
    }

    /* renamed from: D */
    public static final /* synthetic */ void m9273D(ItemsAdapter itemsAdapter, C10063a c10063a) {
        itemsAdapter.m9269H(c10063a);
    }

    /* renamed from: H */
    private final void m9269H(C10063a c10063a) {
        InterfaceC6113q interfaceC6113q = this.f26325g;
        RecyclerPickerDialogFragment recyclerPickerDialogFragment = this.f26323e;
        Object obj = this.f26321c.get(c10063a.m36568j());
        Intrinsics.checkIfNull(obj, "data[holder.adapterPosition]");
        interfaceC6113q.mo4533i(recyclerPickerDialogFragment, obj, Boolean.valueOf(this.f26322d));
        this.f26323e = (RecyclerPickerDialogFragment) this.f26321c.get(c10063a.m36568j());
    }

    /* renamed from: E */
    public final EnumC2361b m9272E() {
        return this.f26324f;
    }

    /* renamed from: F */
    public void mo35523M(C10063a c10063a, int i) {
        Intrinsics.isThisObjectNull(c10063a, "holder");
        c10063a.m9263M().mo8081T((RecyclerPickerDialogFragment) this.f26321c.get(i));
        c10063a.m9263M().mo8080U(this.f26324f);
        c10063a.m9263M().mo8082S(Float.valueOf(c10063a.m9262N().getResources().getDimension(this.f26324f == EnumC2361b.SWITCH ? C10069e.padding_for_switch : C10069e.padding_start_default)));
        c10063a.m9263M().m37807n();
        c10063a.m9263M().m37802s().setOnClickListener(new View$OnClickListenerC10064b(c10063a));
        c10063a.m9263M().f27009y.setOnClickListener(new View$OnClickListenerC10065c(c10063a));
        c10063a.m9263M().f27008x.setOnClickListener(new View$OnClickListenerC10066d(c10063a));
        c10063a.m9263M().f27010z.setOnClickListener(new View$OnClickListenerC10067e(c10063a));
    }

    /* renamed from: G */
    public C10063a mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC10383c m8084Q = AbstractC10383c.m8084Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m8084Q, "ViewRowForItemBinding.in….context), parent, false)");
        return new C10063a(m8084Q);
    }

    /* renamed from: I */
    public final void m9268I(ArrayList arrayList) {
        Intrinsics.isThisObjectNull(arrayList, "items");
        this.f26321c.clear();
        this.f26321c.addAll(arrayList);
        m36542k();
    }

    /* renamed from: f */
    public int mo29834f() {
        return this.f26321c.size();
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        return i;
    }
}
