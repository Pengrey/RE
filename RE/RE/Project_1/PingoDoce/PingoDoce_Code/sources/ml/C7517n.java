package ml;

import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ke.CoreBaseViewModel;
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7256f1;
import mg.C7405s1;
import p070e.C4906j;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p470yf.SnackBarAction;
import p489zc.C13780s;
import p489zc._Collections;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;
import td.InterfaceC10524i0;

/* compiled from: ShoppingListsViewModel.kt */
/* renamed from: ml.n */
/* loaded from: classes2.dex */
public final class C7517n extends NoConnectionViewModel {

    /* renamed from: A */
    private final LiveData f19854A;

    /* renamed from: p */
    private final C7256f1 f19855p;

    /* renamed from: q */
    private final C7405s1 f19856q;

    /* renamed from: r */
    private boolean f19857r;

    /* renamed from: s */
    private InterfaceC7504a f19858s;

    /* renamed from: t */
    private int f19859t;

    /* renamed from: u */
    private final InterfaceC13178g f19860u;

    /* renamed from: v */
    private final InterfaceC13178g f19861v;

    /* renamed from: w */
    private final InterfaceC6108l f19862w;

    /* renamed from: x */
    private final C1436e0 f19863x;

    /* renamed from: y */
    private final C1436e0 f19864y;

    /* renamed from: z */
    private final LiveData f19865z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel", m20196f = "ShoppingListsViewModel.kt", m20195l = {203}, m20194m = "commitDelete")
    /* renamed from: ml.n$a */
    /* loaded from: classes2.dex */
    public static final class C7518a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19866w;

        /* renamed from: y */
        int f19868y;

        C7518a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19866w = obj;
            this.f19868y |= Integer.MIN_VALUE;
            return C7517n.m18309T(C7517n.this, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$commitDelete$2", m20196f = "ShoppingListsViewModel.kt", m20195l = {204}, m20194m = "invokeSuspend")
    /* renamed from: ml.n$b */
    /* loaded from: classes2.dex */
    public static final class C7519b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19869x;

        /* renamed from: z */
        final /* synthetic */ ShoppingList f19871z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListsViewModel.kt */
        /* renamed from: ml.n$b$a */
        /* loaded from: classes2.dex */
        public static final class C7520a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ C7517n f19872w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7520a(C7517n c7517n) {
                super(0);
                this.f19872w = c7517n;
            }

            /* renamed from: a */
            public final void m18275a() {
                C7517n.m18296g0(this.f19872w);
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m18275a();
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7519b(ShoppingList shoppingList, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19871z = shoppingList;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7519b(this.f19871z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7519b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19869x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7256f1 m18306W = C7517n.m18306W(C7517n.this);
                ShoppingList shoppingList = this.f19871z;
                this.f19869x = 1;
                obj = m18306W.m18826m(shoppingList, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
            String string = C7517n.m18305X(C7517n.this).m6899a().getString(C2336R.string.lbl_list_removed);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            String string2 = C7517n.m18305X(C7517n.this).m6899a().getString(C2336R.string.lbl_list_item_undo_remove);
            Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            SnackBarLiveData.m21968c(snackBarLiveData, string, new SnackBarAction(string2, new C7520a(C7517n.this)), 0, 0, 12, null);
            return C6755b.m20201a(booleanValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$create$1", m20196f = "ShoppingListsViewModel.kt", m20195l = {144}, m20194m = "invokeSuspend")
    /* renamed from: ml.n$c */
    /* loaded from: classes2.dex */
    public static final class C7521c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19873x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$create$1$1", m20196f = "ShoppingListsViewModel.kt", m20195l = {145, 146}, m20194m = "invokeSuspend")
        /* renamed from: ml.n$c$a */
        /* loaded from: classes2.dex */
        public static final class C7522a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f19875x;

            /* renamed from: y */
            final /* synthetic */ C7517n f19876y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7522a(C7517n c7517n, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f19876y = c7517n;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C7522a(this.f19876y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C7522a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f19875x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7256f1 m18306W = C7517n.m18306W(this.f19876y);
                    this.f19875x = 1;
                    if (m18306W.m18827l(this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C13186n.m1453b(obj);
                    return C13195u.f34156a;
                } else {
                    C13186n.m1453b(obj);
                }
                C7517n c7517n = this.f19876y;
                this.f19875x = 2;
                if (C7517n.m18280w0(c7517n, false, this, 1, null) == m34636d) {
                    return m34636d;
                }
                return C13195u.f34156a;
            }
        }

        C7521c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7521c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7521c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19873x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BaseViewModel.m111K(C7517n.this, true, false, 2, null);
                C7517n c7517n = C7517n.this;
                C7522a c7522a = new C7522a(c7517n, null);
                this.f19873x = 1;
                if (CoreBaseViewModel.m20383n(c7517n, false, c7522a, this, 1, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel", m20196f = "ShoppingListsViewModel.kt", m20195l = {172}, m20194m = "delete")
    /* renamed from: ml.n$d */
    /* loaded from: classes2.dex */
    public static final class C7523d extends AbstractC6757d {

        /* renamed from: B */
        int f19878B;

        /* renamed from: w */
        Object f19879w;

        /* renamed from: x */
        Object f19880x;

        /* renamed from: y */
        int f19881y;

        /* renamed from: z */
        /* synthetic */ Object f19882z;

        C7523d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19882z = obj;
            this.f19878B |= Integer.MIN_VALUE;
            return C7517n.this.m18291l0(0, this);
        }
    }

    /* compiled from: ShoppingListsViewModel.kt */
    /* renamed from: ml.n$e */
    /* loaded from: classes2.dex */
    public static final class C7524e implements UiWidgets.InterfaceC7044a {

        /* renamed from: b */
        final /* synthetic */ ShoppingList f19884b;

        /* compiled from: ShoppingListsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$delete$2$1$1$onResponse$1", m20196f = "ShoppingListsViewModel.kt", m20195l = {181}, m20194m = "invokeSuspend")
        /* renamed from: ml.n$e$a */
        /* loaded from: classes2.dex */
        static final class C7525a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f19885x;

            /* renamed from: y */
            final /* synthetic */ C7517n f19886y;

            /* renamed from: z */
            final /* synthetic */ ShoppingList f19887z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7525a(C7517n c7517n, ShoppingList shoppingList, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f19886y = c7517n;
                this.f19887z = shoppingList;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C7525a(this.f19886y, this.f19887z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C7525a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f19885x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7517n c7517n = this.f19886y;
                    ShoppingList shoppingList = this.f19887z;
                    this.f19885x = 1;
                    obj = C7517n.m18309T(c7517n, shoppingList, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    C7517n.m18301b0(this.f19886y, this.f19887z);
                }
                return C13195u.f34156a;
            }
        }

        C7524e(ShoppingList shoppingList) {
            this.f19884b = shoppingList;
        }

        /* renamed from: a */
        public void m18272a(boolean z) {
            if (z) {
                C6772d.m20158d(C1473p0.m36987a(C7517n.this), null, null, new C7525a(C7517n.this, this.f19884b, null), 3, null);
            } else {
                C7517n.m18301b0(C7517n.this, this.f19884b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$delete$2$1$2", m20196f = "ShoppingListsViewModel.kt", m20195l = {193}, m20194m = "invokeSuspend")
    /* renamed from: ml.n$f */
    /* loaded from: classes2.dex */
    public static final class C7526f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f19888A;

        /* renamed from: x */
        int f19889x;

        /* renamed from: z */
        final /* synthetic */ ShoppingList f19891z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7526f(ShoppingList shoppingList, int i, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f19891z = shoppingList;
            this.f19888A = i;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7526f(this.f19891z, this.f19888A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7526f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19889x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7517n c7517n = C7517n.this;
                ShoppingList shoppingList = this.f19891z;
                this.f19889x = 1;
                obj = C7517n.m18309T(c7517n, shoppingList, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C7517n.m18302a0(C7517n.this, this.f19888A, this.f19891z);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    /* renamed from: ml.n$g */
    /* loaded from: classes2.dex */
    public static final class C7527g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C7527g f19892w = new C7527g();

        C7527g() {
            super(1);
        }

        /* renamed from: a */
        public final void m18269a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m18269a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$getLists$1", m20196f = "ShoppingListsViewModel.kt", m20195l = {137}, m20194m = "invokeSuspend")
    /* renamed from: ml.n$h */
    /* loaded from: classes2.dex */
    public static final class C7528h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19893x;

        C7528h(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7528h(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7528h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19893x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7517n c7517n = C7517n.this;
                this.f19893x = 1;
                if (C7517n.m18280w0(c7517n, false, this, 1, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    /* renamed from: ml.n$i */
    /* loaded from: classes2.dex */
    public static final class C7529i extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ ResourcesProvider f19895w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7529i(ResourcesProvider resourcesProvider) {
            super(0);
            this.f19895w = resourcesProvider;
        }

        /* renamed from: a */
        public final ShoppingListsViewModel mo42214q() {
            String string = this.f19895w.m6899a().getString(C2336R.string.lbl_shopping_default_list);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            return new ShoppingListsViewModel(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    /* renamed from: ml.n$j */
    /* loaded from: classes2.dex */
    public static final class C7530j extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ ResourcesProvider f19896w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7530j(ResourcesProvider resourcesProvider) {
            super(0);
            this.f19896w = resourcesProvider;
        }

        /* renamed from: a */
        public final ShoppingListsViewModel mo42214q() {
            String string = this.f19896w.m6899a().getString(C2336R.string.lbl_shopping_other_lists);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            return new ShoppingListsViewModel(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel", m20196f = "ShoppingListsViewModel.kt", m20195l = {80}, m20194m = "refreshLists")
    /* renamed from: ml.n$k */
    /* loaded from: classes2.dex */
    public static final class C7531k extends AbstractC6757d {

        /* renamed from: w */
        Object f19897w;

        /* renamed from: x */
        /* synthetic */ Object f19898x;

        /* renamed from: z */
        int f19900z;

        C7531k(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19898x = obj;
            this.f19900z |= Integer.MIN_VALUE;
            return C7517n.m18300c0(C7517n.this, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$refreshLists$2", m20196f = "ShoppingListsViewModel.kt", m20195l = {81, C0868i.f2983w0, C0868i.f2993y0}, m20194m = "invokeSuspend")
    /* renamed from: ml.n$l */
    /* loaded from: classes2.dex */
    public static final class C7532l extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19901x;

        C7532l(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7532l(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7532l) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00d0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ml.C7517n.C7532l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$setDefault$1", m20196f = "ShoppingListsViewModel.kt", m20195l = {154}, m20194m = "invokeSuspend")
    /* renamed from: ml.n$m */
    /* loaded from: classes2.dex */
    public static final class C7533m extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19903x;

        /* renamed from: z */
        final /* synthetic */ String f19905z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$setDefault$1$1", m20196f = "ShoppingListsViewModel.kt", m20195l = {155}, m20194m = "invokeSuspend")
        /* renamed from: ml.n$m$a */
        /* loaded from: classes2.dex */
        public static final class C7534a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f19906x;

            /* renamed from: y */
            final /* synthetic */ C7517n f19907y;

            /* renamed from: z */
            final /* synthetic */ String f19908z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7534a(C7517n c7517n, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f19907y = c7517n;
                this.f19908z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C7534a(this.f19907y, this.f19908z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C7534a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f19906x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7256f1 m18306W = C7517n.m18306W(this.f19907y);
                    String str = this.f19908z;
                    this.f19906x = 1;
                    if (m18306W.m18851J(str, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                ArrayList arrayList = new ArrayList();
                T mo172f = C7517n.m18303Z(this.f19907y).mo172f();
                Intrinsics.ifNullDoSomething(mo172f);
                ArrayList<ShoppingList> arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) mo172f) {
                    if (obj2 instanceof ShoppingList) {
                        arrayList2.add(obj2);
                    }
                }
                String str2 = this.f19908z;
                for (ShoppingList shoppingList : arrayList2) {
                    ShoppingList m13744b = shoppingList.m13744b();
                    m13744b.m13727z(Intrinsics.equals(shoppingList.m13737j(), str2));
                    arrayList.add(m13744b);
                }
                C7517n.m18303Z(this.f19907y).mo166p(C7517n.m18308U(this.f19907y, arrayList));
                if (C7517n.m18307V(this.f19907y)) {
                    C7517n.m18298e0(this.f19907y, false);
                    C7517n.m18304Y(this.f19907y).mo166p(C13195u.f34156a);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7533m(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f19905z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7533m(this.f19905z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7533m) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19903x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7517n c7517n = C7517n.this;
                C7534a c7534a = new C7534a(c7517n, this.f19905z, null);
                this.f19903x = 1;
                if (C7517n.m18299d0(c7517n, true, c7534a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$undoRemove$1$1", m20196f = "ShoppingListsViewModel.kt", m20195l = {C4906j.f13380A0}, m20194m = "invokeSuspend")
    /* renamed from: ml.n$n */
    /* loaded from: classes2.dex */
    public static final class C7535n extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19909x;

        /* renamed from: z */
        final /* synthetic */ InterfaceC7504a f19911z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsViewModel$undoRemove$1$1$1", m20196f = "ShoppingListsViewModel.kt", m20195l = {C4906j.f13385B0}, m20194m = "invokeSuspend")
        /* renamed from: ml.n$n$a */
        /* loaded from: classes2.dex */
        public static final class C7536a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f19912x;

            /* renamed from: y */
            final /* synthetic */ C7517n f19913y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC7504a f19914z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7536a(C7517n c7517n, InterfaceC7504a interfaceC7504a, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f19913y = c7517n;
                this.f19914z = interfaceC7504a;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C7536a(this.f19913y, this.f19914z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C7536a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f19912x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f19912x = 1;
                    obj = C7517n.m18306W(this.f19913y).m18835d((ShoppingList) this.f19914z, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    C7517n.m18301b0(this.f19913y, (ShoppingList) this.f19914z);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7535n(InterfaceC7504a interfaceC7504a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f19911z = interfaceC7504a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7535n(this.f19911z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7535n) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19909x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7517n c7517n = C7517n.this;
                C7536a c7536a = new C7536a(c7517n, this.f19911z, null);
                this.f19909x = 1;
                if (C7517n.m18299d0(c7517n, true, c7536a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7517n(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        List m197g;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "manager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f19855p = c7256f1;
        this.f19856q = c7405s1;
        this.f19857r = true;
        this.f19859t = -1;
        m1464a = LazyJVM.m1464a(new C7529i(resourcesProvider));
        this.f19860u = m1464a;
        m1464a2 = LazyJVM.m1464a(new C7530j(resourcesProvider));
        this.f19861v = m1464a2;
        this.f19862w = BaseViewModel.m113I(this, 0L, C7527g.f19892w, 1, null);
        m197g = C13780s.m197g();
        C1436e0 c1436e0 = new C1436e0(m197g);
        this.f19863x = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        this.f19864y = c1436e02;
        this.f19865z = c1436e0;
        this.f19854A = c1436e02;
    }

    /* renamed from: R */
    public static /* synthetic */ int m18311R(ShoppingList shoppingList, ShoppingList shoppingList2) {
        return m18293j0(shoppingList, shoppingList2);
    }

    /* renamed from: S */
    public static /* synthetic */ void m18310S(C7517n c7517n, View view) {
        m18289n0(c7517n, view);
    }

    /* renamed from: T */
    public static final /* synthetic */ Object m18309T(C7517n c7517n, ShoppingList shoppingList, InterfaceC1886d interfaceC1886d) {
        return c7517n.m18295h0(shoppingList, interfaceC1886d);
    }

    /* renamed from: U */
    public static final /* synthetic */ List m18308U(C7517n c7517n, List list) {
        return c7517n.m18294i0(list);
    }

    /* renamed from: V */
    public static final /* synthetic */ boolean m18307V(C7517n c7517n) {
        return c7517n.f19857r;
    }

    /* renamed from: W */
    public static final /* synthetic */ C7256f1 m18306W(C7517n c7517n) {
        return c7517n.f19855p;
    }

    /* renamed from: X */
    public static final /* synthetic */ ResourcesProvider m18305X(C7517n c7517n) {
        return c7517n.m20390g();
    }

    /* renamed from: Y */
    public static final /* synthetic */ C1436e0 m18304Y(C7517n c7517n) {
        return c7517n.f19864y;
    }

    /* renamed from: Z */
    public static final /* synthetic */ C1436e0 m18303Z(C7517n c7517n) {
        return c7517n.f19863x;
    }

    /* renamed from: a0 */
    public static final /* synthetic */ void m18302a0(C7517n c7517n, int i, ShoppingList shoppingList) {
        c7517n.m18283t0(i, shoppingList);
    }

    /* renamed from: b0 */
    public static final /* synthetic */ void m18301b0(C7517n c7517n, ShoppingList shoppingList) {
        c7517n.m18282u0(shoppingList);
    }

    /* renamed from: c0 */
    public static final /* synthetic */ Object m18300c0(C7517n c7517n, boolean z, InterfaceC1886d interfaceC1886d) {
        return c7517n.m18281v0(z, interfaceC1886d);
    }

    /* renamed from: d0 */
    public static final /* synthetic */ Object m18299d0(C7517n c7517n, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return c7517n.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: e0 */
    public static final /* synthetic */ void m18298e0(C7517n c7517n, boolean z) {
        c7517n.f19857r = z;
    }

    /* renamed from: f0 */
    public static final /* synthetic */ void m18297f0(C7517n c7517n, boolean z) {
        c7517n.m20350O(z);
    }

    /* renamed from: g0 */
    public static final /* synthetic */ void m18296g0(C7517n c7517n) {
        c7517n.m18278y0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m18295h0(pt.pingodoce.app.data.remote.models.response.ShoppingList r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ml.C7517n.C7518a
            if (r0 == 0) goto L13
            r0 = r6
            ml.n$a r0 = (ml.C7517n.C7518a) r0
            int r1 = r0.f19868y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19868y = r1
            goto L18
        L13:
            ml.n$a r0 = new ml.n$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19866w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19868y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            ml.n$b r6 = new ml.n$b
            r2 = 0
            r6.<init>(r5, r2)
            r0.f19868y = r3
            java.lang.Object r6 = r4.m20384m(r3, r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L4c
            boolean r5 = r6.booleanValue()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ml.C7517n.m18295h0(pt.pingodoce.app.data.remote.models.response.ShoppingList, bd.d):java.lang.Object");
    }

    /* renamed from: i0 */
    private final List m18294i0(List list) {
        List m461h0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, m18287p0());
        m461h0 = _Collections.m461h0(list, C7516m.f19853w);
        arrayList.addAll(m461h0);
        if (arrayList.size() > 2) {
            arrayList.add(2, m18286q0());
        }
        return arrayList;
    }

    /* renamed from: j0 */
    private static final int m18293j0(ShoppingList shoppingList, ShoppingList shoppingList2) {
        if (!shoppingList.m13732s() || shoppingList2.m13732s()) {
            if (shoppingList.m13732s() || !shoppingList2.m13732s()) {
                return shoppingList.m13739h().compareTo(shoppingList2.m13739h());
            }
            return 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m18289n0(C7517n c7517n, View view) {
        Intrinsics.isThisObjectNull(c7517n, "this$0");
        c7517n.f19862w.mo9587d(C13195u.f34156a);
    }

    /* renamed from: p0 */
    private final ShoppingListsViewModel m18287p0() {
        return (ShoppingListsViewModel) this.f19860u.getValue();
    }

    /* renamed from: q0 */
    private final ShoppingListsViewModel m18286q0() {
        return (ShoppingListsViewModel) this.f19861v.getValue();
    }

    /* renamed from: t0 */
    private final void m18283t0(int i, ShoppingList shoppingList) {
        List m453p0;
        this.f19858s = shoppingList.m13744b();
        this.f19859t = i;
        T mo172f = this.f19863x.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        m453p0 = _Collections.m453p0((Collection) mo172f);
        m453p0.remove(this.f19859t);
        this.f19863x.mo166p(m453p0);
    }

    /* renamed from: u0 */
    private final void m18282u0(ShoppingList shoppingList) {
        List m453p0;
        T mo172f = this.f19863x.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        m453p0 = _Collections.m453p0((Collection) mo172f);
        m453p0.add(this.f19859t, shoppingList);
        this.f19863x.mo166p(m453p0);
        this.f19858s = null;
        this.f19859t = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m18281v0(boolean r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ml.C7517n.C7531k
            if (r0 == 0) goto L13
            r0 = r12
            ml.n$k r0 = (ml.C7517n.C7531k) r0
            int r1 = r0.f19900z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19900z = r1
            goto L18
        L13:
            ml.n$k r0 = new ml.n$k
            r0.<init>(r12)
        L18:
            r4 = r0
            java.lang.Object r12 = r4.f19898x
            java.lang.Object r0 = cd.C2111b.m34640d()
            int r1 = r4.f19900z
            r7 = 2
            r2 = 1
            r8 = 0
            r9 = 0
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r11 = r4.f19897w
            ml.n r11 = (ml.C7517n) r11
            p468yc.C13186n.m1453b(r12)
            goto L55
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            p468yc.C13186n.m1453b(r12)
            p494zh.BaseViewModel.m111K(r10, r11, r9, r7, r8)
            r11 = 0
            ml.n$l r3 = new ml.n$l
            r3.<init>(r8)
            r5 = 1
            r6 = 0
            r4.f19897w = r10
            r4.f19900z = r2
            r1 = r10
            r2 = r11
            java.lang.Object r11 = ke.CoreBaseViewModel.m20383n(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L54
            return r0
        L54:
            r11 = r10
        L55:
            p494zh.BaseViewModel.m111K(r11, r9, r9, r7, r8)
            yc.u r11 = p468yc.C13195u.f34156a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ml.C7517n.m18281v0(boolean, bd.d):java.lang.Object");
    }

    /* renamed from: w0 */
    static /* synthetic */ Object m18280w0(C7517n c7517n, boolean z, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c7517n.m18281v0(z, interfaceC1886d);
    }

    /* renamed from: y0 */
    private final void m18278y0() {
        InterfaceC7504a interfaceC7504a = this.f19858s;
        if (interfaceC7504a != null) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C7535n(interfaceC7504a, null), 3, null);
        }
    }

    /* renamed from: N */
    protected void m18312N() {
        m18284s0();
    }

    /* renamed from: k0 */
    public final void m18292k0() {
        Object mo172f = m20387j().mo172f();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.equals(mo172f, bool) && Intrinsics.equals(m102x().mo172f(), bool)) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C7521c(null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18291l0(int r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ml.C7517n.C7523d
            if (r0 == 0) goto L13
            r0 = r12
            ml.n$d r0 = (ml.C7517n.C7523d) r0
            int r1 = r0.f19878B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19878B = r1
            goto L18
        L13:
            ml.n$d r0 = new ml.n$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f19882z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19878B
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r11 = r0.f19881y
            java.lang.Object r1 = r0.f19880x
            pt.pingodoce.app.data.remote.models.response.ShoppingList r1 = (pt.pingodoce.app.data.remote.models.response.ShoppingList) r1
            java.lang.Object r0 = r0.f19879w
            ml.n r0 = (ml.C7517n) r0
            p468yc.C13186n.m1453b(r12)
            goto L69
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            p468yc.C13186n.m1453b(r12)
            androidx.lifecycle.e0 r12 = r10.f19863x
            java.lang.Object r12 = r12.mo172f()
            p181jd.Intrinsics.ifNullDoSomething(r12)
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r12.get(r11)
            pt.pingodoce.app.data.remote.models.response.ShoppingList r12 = (pt.pingodoce.app.data.remote.models.response.ShoppingList) r12
            boolean r2 = r12.m13729w()
            if (r2 == 0) goto Lac
            mg.f1 r2 = r10.f19855p
            r0.f19879w = r10
            r0.f19880x = r12
            r0.f19881y = r11
            r0.f19878B = r3
            java.lang.Object r0 = r2.m18856E(r12, r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            r1 = r12
            r12 = r0
            r0 = r10
        L69:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Laa
            r0.m18283t0(r11, r1)
            le.a r2 = p221le.UiEventsLiveData.f18671a
            u5.a r11 = r0.m20390g()
            r12 = 2131886293(0x7f1200d5, float:1.940716E38)
            android.content.Context r11 = r11.m6899a()
            java.lang.String r3 = r11.getString(r12)
            java.lang.String r11 = "ctx.getString(id)"
            p181jd.Intrinsics.checkIfNull(r3, r11)
            u5.a r12 = r0.m20390g()
            r4 = 2131886320(0x7f1200f0, float:1.9407216E38)
            android.content.Context r12 = r12.m6899a()
            java.lang.String r4 = r12.getString(r4)
            p181jd.Intrinsics.checkIfNull(r4, r11)
            r5 = 0
            r6 = 0
            ml.n$e r7 = new ml.n$e
            r7.<init>(r1)
            r8 = 12
            r9 = 0
            p221le.UiEventsLiveData.m19519k(r2, r3, r4, r5, r6, r7, r8, r9)
            goto Lbe
        Laa:
            r12 = r1
            goto Lad
        Lac:
            r0 = r10
        Lad:
            td.i0 r1 = androidx.lifecycle.C1473p0.m36987a(r0)
            r2 = 0
            r3 = 0
            ml.n$f r4 = new ml.n$f
            r5 = 0
            r4.<init>(r12, r11, r5)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.C6769b.m20167d(r1, r2, r3, r4, r5, r6)
        Lbe:
            yc.u r11 = p468yc.C13195u.f34156a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ml.C7517n.m18291l0(int, bd.d):java.lang.Object");
    }

    /* renamed from: m0 */
    public final View.OnClickListener m18290m0() {
        return new View.OnClickListener() { // from class: ml.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7517n.m18289n0(C7517n.this, view);
            }
        };
    }

    /* renamed from: o0 */
    public final LiveData m18288o0() {
        return this.f19854A;
    }

    /* renamed from: r0 */
    public final LiveData m18285r0() {
        return this.f19865z;
    }

    /* renamed from: s0 */
    public final void m18284s0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C7528h(null), 3, null);
    }

    /* renamed from: x0 */
    public final void m18279x0(String str) {
        Intrinsics.isThisObjectNull(str, "id");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C7533m(str, null), 3, null);
    }

    /* renamed from: z0 */
    public final String m18277z0() {
        String m18499k = this.f19856q.m18499k();
        Intrinsics.ifNullDoSomething(m18499k);
        return m18499k;
    }
}
