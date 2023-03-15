package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C1112b0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p070e.C4897a;
import p070e.C4902f;
import p070e.C4906j;
import p091f.DialogC5147b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f683A;

    /* renamed from: C */
    private Drawable f685C;

    /* renamed from: D */
    private ImageView f686D;

    /* renamed from: E */
    private TextView f687E;

    /* renamed from: F */
    private TextView f688F;

    /* renamed from: G */
    private View f689G;

    /* renamed from: H */
    ListAdapter f690H;

    /* renamed from: J */
    private int f692J;

    /* renamed from: K */
    private int f693K;

    /* renamed from: L */
    int f694L;

    /* renamed from: M */
    int f695M;

    /* renamed from: N */
    int f696N;

    /* renamed from: O */
    int f697O;

    /* renamed from: P */
    private boolean f698P;

    /* renamed from: R */
    Handler f700R;

    /* renamed from: a */
    private final Context f702a;

    /* renamed from: b */
    final DialogC5147b f703b;

    /* renamed from: c */
    private final Window f704c;

    /* renamed from: d */
    private final int f705d;

    /* renamed from: e */
    private CharSequence f706e;

    /* renamed from: f */
    private CharSequence f707f;

    /* renamed from: g */
    ListView f708g;

    /* renamed from: h */
    private View f709h;

    /* renamed from: i */
    private int f710i;

    /* renamed from: j */
    private int f711j;

    /* renamed from: k */
    private int f712k;

    /* renamed from: l */
    private int f713l;

    /* renamed from: m */
    private int f714m;

    /* renamed from: o */
    Button f716o;

    /* renamed from: p */
    private CharSequence f717p;

    /* renamed from: q */
    Message f718q;

    /* renamed from: r */
    private Drawable f719r;

    /* renamed from: s */
    Button f720s;

    /* renamed from: t */
    private CharSequence f721t;

    /* renamed from: u */
    Message f722u;

    /* renamed from: v */
    private Drawable f723v;

    /* renamed from: w */
    Button f724w;

    /* renamed from: x */
    private CharSequence f725x;

    /* renamed from: y */
    Message f726y;

    /* renamed from: z */
    private Drawable f727z;

    /* renamed from: n */
    private boolean f715n = false;

    /* renamed from: B */
    private int f684B = 0;

    /* renamed from: I */
    int f691I = -1;

    /* renamed from: Q */
    private int f699Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f701S = new View$OnClickListenerC0306a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: w */
        private final int f728w;

        /* renamed from: x */
        private final int f729x;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4906j.f13453Q1);
            this.f729x = obtainStyledAttributes.getDimensionPixelOffset(C4906j.f13457R1, -1);
            this.f728w = obtainStyledAttributes.getDimensionPixelOffset(C4906j.f13461S1, -1);
        }

        /* renamed from: a */
        public void m41297a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f728w, getPaddingRight(), z2 ? getPaddingBottom() : this.f729x);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0306a implements View.OnClickListener {
        View$OnClickListenerC0306a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f716o && (message3 = alertController.f718q) != null) {
                obtain = Message.obtain(message3);
            } else if (view == alertController.f720s && (message2 = alertController.f722u) != null) {
                obtain = Message.obtain(message2);
            } else {
                obtain = (view != alertController.f724w || (message = alertController.f726y) == null) ? null : Message.obtain(message);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f700R.obtainMessage(1, alertController2.f703b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0307b implements NestedScrollView.InterfaceC1221c {

        /* renamed from: a */
        final /* synthetic */ View f731a;

        /* renamed from: b */
        final /* synthetic */ View f732b;

        C0307b(AlertController alertController, View view, View view2) {
            this.f731a = view;
            this.f732b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC1221c
        /* renamed from: a */
        public void mo6751a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m41318f(nestedScrollView, this.f731a, this.f732b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0308c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f733w;

        /* renamed from: x */
        final /* synthetic */ View f734x;

        RunnableC0308c(View view, View view2) {
            this.f733w = view;
            this.f734x = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m41318f(AlertController.this.f683A, this.f733w, this.f734x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0309d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f736a;

        /* renamed from: b */
        final /* synthetic */ View f737b;

        C0309d(AlertController alertController, View view, View view2) {
            this.f736a = view;
            this.f737b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m41318f(absListView, this.f736a, this.f737b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0310e implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f738w;

        /* renamed from: x */
        final /* synthetic */ View f739x;

        RunnableC0310e(View view, View view2) {
            this.f738w = view;
            this.f739x = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m41318f(AlertController.this.f708g, this.f738w, this.f739x);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0311f {

        /* renamed from: A */
        public int f741A;

        /* renamed from: B */
        public int f742B;

        /* renamed from: C */
        public int f743C;

        /* renamed from: D */
        public int f744D;

        /* renamed from: F */
        public boolean[] f746F;

        /* renamed from: G */
        public boolean f747G;

        /* renamed from: H */
        public boolean f748H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f750J;

        /* renamed from: K */
        public Cursor f751K;

        /* renamed from: L */
        public String f752L;

        /* renamed from: M */
        public String f753M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f754N;

        /* renamed from: O */
        public InterfaceC0316e f755O;

        /* renamed from: a */
        public final Context f756a;

        /* renamed from: b */
        public final LayoutInflater f757b;

        /* renamed from: d */
        public Drawable f759d;

        /* renamed from: f */
        public CharSequence f761f;

        /* renamed from: g */
        public View f762g;

        /* renamed from: h */
        public CharSequence f763h;

        /* renamed from: i */
        public CharSequence f764i;

        /* renamed from: j */
        public Drawable f765j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f766k;

        /* renamed from: l */
        public CharSequence f767l;

        /* renamed from: m */
        public Drawable f768m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f769n;

        /* renamed from: o */
        public CharSequence f770o;

        /* renamed from: p */
        public Drawable f771p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f772q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f774s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f775t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f776u;

        /* renamed from: v */
        public CharSequence[] f777v;

        /* renamed from: w */
        public ListAdapter f778w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f779x;

        /* renamed from: y */
        public int f780y;

        /* renamed from: z */
        public View f781z;

        /* renamed from: c */
        public int f758c = 0;

        /* renamed from: e */
        public int f760e = 0;

        /* renamed from: E */
        public boolean f745E = false;

        /* renamed from: I */
        public int f749I = -1;

        /* renamed from: r */
        public boolean f773r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class C0312a extends ArrayAdapter<CharSequence> {

            /* renamed from: w */
            final /* synthetic */ RecycleListView f782w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0312a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f782w = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0311f.this.f746F;
                if (zArr != null && zArr[i]) {
                    this.f782w.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class C0313b extends CursorAdapter {

            /* renamed from: w */
            private final int f785w;

            /* renamed from: x */
            private final int f786x;

            /* renamed from: y */
            final /* synthetic */ RecycleListView f787y;

            /* renamed from: z */
            final /* synthetic */ AlertController f788z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0313b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f787y = recycleListView;
                this.f788z = alertController;
                Cursor cursor2 = getCursor();
                this.f785w = cursor2.getColumnIndexOrThrow(C0311f.this.f752L);
                this.f786x = cursor2.getColumnIndexOrThrow(C0311f.this.f753M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f785w));
                this.f787y.setItemChecked(cursor.getPosition(), cursor.getInt(this.f786x) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0311f.this.f757b.inflate(this.f788z.f695M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class C0314c implements AdapterView.OnItemClickListener {

            /* renamed from: w */
            final /* synthetic */ AlertController f789w;

            C0314c(AlertController alertController) {
                this.f789w = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0311f.this.f779x.onClick(this.f789w.f703b, i);
                if (C0311f.this.f748H) {
                    return;
                }
                this.f789w.f703b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class C0315d implements AdapterView.OnItemClickListener {

            /* renamed from: w */
            final /* synthetic */ RecycleListView f791w;

            /* renamed from: x */
            final /* synthetic */ AlertController f792x;

            C0315d(RecycleListView recycleListView, AlertController alertController) {
                this.f791w = recycleListView;
                this.f792x = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0311f.this.f746F;
                if (zArr != null) {
                    zArr[i] = this.f791w.isItemChecked(i);
                }
                C0311f.this.f750J.onClick(this.f792x.f703b, i, this.f791w.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface InterfaceC0316e {
            /* renamed from: a */
            void m41294a(ListView listView);
        }

        public C0311f(Context context) {
            this.f756a = context;
            this.f757b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m41295b(AlertController alertController) {
            int i;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f757b.inflate(alertController.f694L, (ViewGroup) null);
            if (this.f747G) {
                if (this.f751K == null) {
                    listAdapter = new C0312a(this.f756a, alertController.f695M, 16908308, this.f777v, recycleListView);
                } else {
                    listAdapter = new C0313b(this.f756a, this.f751K, false, recycleListView, alertController);
                }
            } else {
                if (this.f748H) {
                    i = alertController.f696N;
                } else {
                    i = alertController.f697O;
                }
                int i2 = i;
                if (this.f751K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f756a, i2, this.f751K, new String[]{this.f752L}, new int[]{16908308});
                } else {
                    listAdapter = this.f778w;
                    if (listAdapter == null) {
                        listAdapter = new C0318h(this.f756a, i2, 16908308, this.f777v);
                    }
                }
            }
            InterfaceC0316e interfaceC0316e = this.f755O;
            if (interfaceC0316e != null) {
                interfaceC0316e.m41294a(recycleListView);
            }
            alertController.f690H = listAdapter;
            alertController.f691I = this.f749I;
            if (this.f779x != null) {
                recycleListView.setOnItemClickListener(new C0314c(alertController));
            } else if (this.f750J != null) {
                recycleListView.setOnItemClickListener(new C0315d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f754N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f748H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f747G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f708g = recycleListView;
        }

        /* renamed from: a */
        public void m41296a(AlertController alertController) {
            View view = this.f762g;
            if (view != null) {
                alertController.m41312l(view);
            } else {
                CharSequence charSequence = this.f761f;
                if (charSequence != null) {
                    alertController.m41307q(charSequence);
                }
                Drawable drawable = this.f759d;
                if (drawable != null) {
                    alertController.m41310n(drawable);
                }
                int i = this.f758c;
                if (i != 0) {
                    alertController.m41311m(i);
                }
                int i2 = this.f760e;
                if (i2 != 0) {
                    alertController.m41311m(alertController.m41321c(i2));
                }
            }
            CharSequence charSequence2 = this.f763h;
            if (charSequence2 != null) {
                alertController.m41309o(charSequence2);
            }
            CharSequence charSequence3 = this.f764i;
            if (charSequence3 != null || this.f765j != null) {
                alertController.m41313k(-1, charSequence3, this.f766k, null, this.f765j);
            }
            CharSequence charSequence4 = this.f767l;
            if (charSequence4 != null || this.f768m != null) {
                alertController.m41313k(-2, charSequence4, this.f769n, null, this.f768m);
            }
            CharSequence charSequence5 = this.f770o;
            if (charSequence5 != null || this.f771p != null) {
                alertController.m41313k(-3, charSequence5, this.f772q, null, this.f771p);
            }
            if (this.f777v != null || this.f751K != null || this.f778w != null) {
                m41295b(alertController);
            }
            View view2 = this.f781z;
            if (view2 != null) {
                if (this.f745E) {
                    alertController.m41304t(view2, this.f741A, this.f742B, this.f743C, this.f744D);
                    return;
                } else {
                    alertController.m41305s(view2);
                    return;
                }
            }
            int i3 = this.f780y;
            if (i3 != 0) {
                alertController.m41306r(i3);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    private static final class HandlerC0317g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f794a;

        public HandlerC0317g(DialogInterface dialogInterface) {
            this.f794a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f794a.get(), message.what);
            } else if (i != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0318h extends ArrayAdapter<CharSequence> {
        public C0318h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC5147b dialogC5147b, Window window) {
        this.f702a = context;
        this.f703b = dialogC5147b;
        this.f704c = window;
        this.f700R = new HandlerC0317g(dialogC5147b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C4906j.f13394D, C4897a.alertDialogStyle, 0);
        this.f692J = obtainStyledAttributes.getResourceId(C4906j.f13399E, 0);
        this.f693K = obtainStyledAttributes.getResourceId(C4906j.f13409G, 0);
        this.f694L = obtainStyledAttributes.getResourceId(C4906j.f13419I, 0);
        this.f695M = obtainStyledAttributes.getResourceId(C4906j.f13423J, 0);
        this.f696N = obtainStyledAttributes.getResourceId(C4906j.f13431L, 0);
        this.f697O = obtainStyledAttributes.getResourceId(C4906j.f13414H, 0);
        this.f698P = obtainStyledAttributes.getBoolean(C4906j.f13427K, true);
        this.f705d = obtainStyledAttributes.getDimensionPixelSize(C4906j.f13404F, 0);
        obtainStyledAttributes.recycle();
        dialogC5147b.m25554e(1);
    }

    /* renamed from: a */
    static boolean m41323a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m41323a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    private void m41322b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m41318f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: i */
    private ViewGroup m41315i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m41314j() {
        int i = this.f693K;
        if (i == 0) {
            return this.f692J;
        }
        return this.f699Q == 1 ? i : this.f692J;
    }

    /* renamed from: p */
    private void m41308p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f704c.findViewById(C4902f.scrollIndicatorUp);
        View findViewById2 = this.f704c.findViewById(C4902f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C1112b0.m38469H0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById == null && findViewById2 == null) {
            return;
        }
        if (this.f707f != null) {
            this.f683A.setOnScrollChangeListener(new C0307b(this, findViewById, findViewById2));
            this.f683A.post(new RunnableC0308c(findViewById, findViewById2));
            return;
        }
        ListView listView = this.f708g;
        if (listView != null) {
            listView.setOnScrollListener(new C0309d(this, findViewById, findViewById2));
            this.f708g.post(new RunnableC0310e(findViewById, findViewById2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: u */
    private void m41303u(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f716o = button;
        button.setOnClickListener(this.f701S);
        if (TextUtils.isEmpty(this.f717p) && this.f719r == null) {
            this.f716o.setVisibility(8);
            z = false;
        } else {
            this.f716o.setText(this.f717p);
            Drawable drawable = this.f719r;
            if (drawable != null) {
                int i = this.f705d;
                drawable.setBounds(0, 0, i, i);
                this.f716o.setCompoundDrawables(this.f719r, null, null, null);
            }
            this.f716o.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f720s = button2;
        button2.setOnClickListener(this.f701S);
        if (TextUtils.isEmpty(this.f721t) && this.f723v == null) {
            this.f720s.setVisibility(8);
        } else {
            this.f720s.setText(this.f721t);
            Drawable drawable2 = this.f723v;
            if (drawable2 != null) {
                int i2 = this.f705d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f720s.setCompoundDrawables(this.f723v, null, null, null);
            }
            this.f720s.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f724w = button3;
        button3.setOnClickListener(this.f701S);
        if (TextUtils.isEmpty(this.f725x) && this.f727z == null) {
            this.f724w.setVisibility(8);
        } else {
            this.f724w.setText(this.f725x);
            Drawable drawable3 = this.f727z;
            if (drawable3 != null) {
                int i3 = this.f705d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f724w.setCompoundDrawables(this.f727z, null, null, null);
            }
            this.f724w.setVisibility(0);
            z |= true;
        }
        if (m41298z(this.f702a)) {
            if (z) {
                m41322b(this.f716o);
            } else if (z) {
                m41322b(this.f720s);
            } else if (z) {
                m41322b(this.f724w);
            }
        }
        if (z) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: v */
    private void m41302v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f704c.findViewById(C4902f.scrollView);
        this.f683A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f683A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f688F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f707f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f683A.removeView(this.f688F);
        if (this.f708g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f683A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f683A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f708g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m41301w(ViewGroup viewGroup) {
        View view = this.f709h;
        if (view == null) {
            view = this.f710i != 0 ? LayoutInflater.from(this.f702a).inflate(this.f710i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !m41323a(view)) {
            this.f704c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f704c.findViewById(C4902f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f715n) {
                frameLayout.setPadding(this.f711j, this.f712k, this.f713l, this.f714m);
            }
            if (this.f708g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.C0425a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m41300x(ViewGroup viewGroup) {
        if (this.f689G != null) {
            viewGroup.addView(this.f689G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f704c.findViewById(C4902f.title_template).setVisibility(8);
            return;
        }
        this.f686D = (ImageView) this.f704c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f706e)) && this.f698P) {
            TextView textView = (TextView) this.f704c.findViewById(C4902f.alertTitle);
            this.f687E = textView;
            textView.setText(this.f706e);
            int i = this.f684B;
            if (i != 0) {
                this.f686D.setImageResource(i);
                return;
            }
            Drawable drawable = this.f685C;
            if (drawable != null) {
                this.f686D.setImageDrawable(drawable);
                return;
            }
            this.f687E.setPadding(this.f686D.getPaddingLeft(), this.f686D.getPaddingTop(), this.f686D.getPaddingRight(), this.f686D.getPaddingBottom());
            this.f686D.setVisibility(8);
            return;
        }
        this.f704c.findViewById(C4902f.title_template).setVisibility(8);
        this.f686D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    private void m41299y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f704c.findViewById(C4902f.parentPanel);
        int i = C4902f.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C4902f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C4902f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C4902f.customPanel);
        m41301w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup m41315i = m41315i(findViewById7, findViewById4);
        ViewGroup m41315i2 = m41315i(findViewById8, findViewById5);
        ViewGroup m41315i3 = m41315i(findViewById9, findViewById6);
        m41302v(m41315i2);
        m41303u(m41315i3);
        m41300x(m41315i);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (m41315i == null || m41315i.getVisibility() == 8) ? false : 1;
        boolean z3 = (m41315i3 == null || m41315i3.getVisibility() == 8) ? false : true;
        if (!z3 && m41315i2 != null && (findViewById2 = m41315i2.findViewById(C4902f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f683A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f707f != null || this.f708g != null) {
                view = m41315i.findViewById(C4902f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (m41315i2 != null && (findViewById = m41315i2.findViewById(C4902f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f708g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m41297a(z2, z3);
        }
        if (!z) {
            View view2 = this.f708g;
            if (view2 == null) {
                view2 = this.f683A;
            }
            if (view2 != null) {
                m41308p(m41315i2, view2, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f708g;
        if (listView2 == null || (listAdapter = this.f690H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i4 = this.f691I;
        if (i4 > -1) {
            listView2.setItemChecked(i4, true);
            listView2.setSelection(i4);
        }
    }

    /* renamed from: z */
    private static boolean m41298z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4897a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: c */
    public int m41321c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f702a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m41320d() {
        return this.f708g;
    }

    /* renamed from: e */
    public void m41319e() {
        this.f703b.setContentView(m41314j());
        m41299y();
    }

    /* renamed from: g */
    public boolean m41317g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f683A;
        return nestedScrollView != null && nestedScrollView.m37972r(keyEvent);
    }

    /* renamed from: h */
    public boolean m41316h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f683A;
        return nestedScrollView != null && nestedScrollView.m37972r(keyEvent);
    }

    /* renamed from: k */
    public void m41313k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f700R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f725x = charSequence;
            this.f726y = message;
            this.f727z = drawable;
        } else if (i == -2) {
            this.f721t = charSequence;
            this.f722u = message;
            this.f723v = drawable;
        } else if (i == -1) {
            this.f717p = charSequence;
            this.f718q = message;
            this.f719r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: l */
    public void m41312l(View view) {
        this.f689G = view;
    }

    /* renamed from: m */
    public void m41311m(int i) {
        this.f685C = null;
        this.f684B = i;
        ImageView imageView = this.f686D;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f686D.setImageResource(this.f684B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: n */
    public void m41310n(Drawable drawable) {
        this.f685C = drawable;
        this.f684B = 0;
        ImageView imageView = this.f686D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f686D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: o */
    public void m41309o(CharSequence charSequence) {
        this.f707f = charSequence;
        TextView textView = this.f688F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m41307q(CharSequence charSequence) {
        this.f706e = charSequence;
        TextView textView = this.f687E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m41306r(int i) {
        this.f709h = null;
        this.f710i = i;
        this.f715n = false;
    }

    /* renamed from: s */
    public void m41305s(View view) {
        this.f709h = view;
        this.f710i = 0;
        this.f715n = false;
    }

    /* renamed from: t */
    public void m41304t(View view, int i, int i2, int i3, int i4) {
        this.f709h = view;
        this.f710i = 0;
        this.f715n = true;
        this.f711j = i;
        this.f712k = i2;
        this.f713l = i3;
        this.f714m = i4;
    }
}
