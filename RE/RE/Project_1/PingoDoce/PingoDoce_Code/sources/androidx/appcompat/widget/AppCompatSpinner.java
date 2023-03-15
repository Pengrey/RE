package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogC0323b;
import androidx.core.view.C1112b0;
import androidx.core.view.InterfaceC1217z;
import p070e.C4897a;
import p111g.C5586a;
import p209l.InterfaceC6954e;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements InterfaceC1217z {

    /* renamed from: E */
    private static final int[] f1275E = {16843505};

    /* renamed from: A */
    private final boolean f1276A;

    /* renamed from: B */
    private InterfaceC0423f f1277B;

    /* renamed from: C */
    int f1278C;

    /* renamed from: D */
    final Rect f1279D;

    /* renamed from: w */
    private final C0463d f1280w;

    /* renamed from: x */
    private final Context f1281x;

    /* renamed from: y */
    private AbstractView$OnTouchListenerC0467e0 f1282y;

    /* renamed from: z */
    private SpinnerAdapter f1283z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0414a();

        /* renamed from: w */
        boolean f1284w;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        /* loaded from: classes.dex */
        class C0414a implements Parcelable.Creator<SavedState> {
            C0414a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo40848a(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] mo40847b(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1284w ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1284w = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    /* loaded from: classes.dex */
    class C0415a extends AbstractView$OnTouchListenerC0467e0 {

        /* renamed from: F */
        final /* synthetic */ C0419e f1285F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0415a(View view, C0419e c0419e) {
            super(view);
            this.f1285F = c0419e;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0
        /* renamed from: b */
        public InterfaceC6954e mo40648b() {
            return this.f1285F;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo40647c() {
            if (AppCompatSpinner.this.getInternalPopup().mo40841c()) {
                return true;
            }
            AppCompatSpinner.this.m40849b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0416b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0416b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo40841c()) {
                AppCompatSpinner.this.m40849b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC0417c implements InterfaceC0423f, DialogInterface.OnClickListener {

        /* renamed from: w */
        DialogC0323b f1288w;

        /* renamed from: x */
        private ListAdapter f1289x;

        /* renamed from: y */
        private CharSequence f1290y;

        DialogInterface$OnClickListenerC0417c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: b */
        public void mo40842b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: c */
        public boolean mo40841c() {
            DialogC0323b dialogC0323b = this.f1288w;
            if (dialogC0323b != null) {
                return dialogC0323b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: d */
        public int mo40840d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        public void dismiss() {
            DialogC0323b dialogC0323b = this.f1288w;
            if (dialogC0323b != null) {
                dialogC0323b.dismiss();
                this.f1288w = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: g */
        public Drawable mo40839g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: i */
        public void mo40838i(CharSequence charSequence) {
            this.f1290y = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: j */
        public void mo40837j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: k */
        public void mo40836k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: l */
        public void mo40835l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: m */
        public void mo40834m(int i, int i2) {
            if (this.f1289x == null) {
                return;
            }
            DialogC0323b.C0324a c0324a = new DialogC0323b.C0324a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f1290y;
            if (charSequence != null) {
                c0324a.m41263q(charSequence);
            }
            DialogC0323b m41279a = c0324a.m41265o(this.f1289x, AppCompatSpinner.this.getSelectedItemPosition(), this).m41279a();
            this.f1288w = m41279a;
            ListView m41282f = m41279a.m41282f();
            if (Build.VERSION.SDK_INT >= 17) {
                m41282f.setTextDirection(i);
                m41282f.setTextAlignment(i2);
            }
            this.f1288w.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: n */
        public int mo40833n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: o */
        public CharSequence mo40832o() {
            return this.f1290y;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f1289x.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: p */
        public void mo40616p(ListAdapter listAdapter) {
            this.f1289x = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    /* loaded from: classes.dex */
    public static class C0418d implements ListAdapter, SpinnerAdapter {

        /* renamed from: w */
        private SpinnerAdapter f1292w;

        /* renamed from: x */
        private ListAdapter f1293x;

        public C0418d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1292w = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1293x = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof InterfaceC0510o0) {
                    InterfaceC0510o0 interfaceC0510o0 = (InterfaceC0510o0) spinnerAdapter;
                    if (interfaceC0510o0.getDropDownViewTheme() == null) {
                        interfaceC0510o0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1293x;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1292w;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1292w;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1292w;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1292w;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1292w;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1293x;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1292w;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1292w;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    /* loaded from: classes.dex */
    class C0419e extends C0471f0 implements InterfaceC0423f {

        /* renamed from: e0 */
        private CharSequence f1294e0;

        /* renamed from: f0 */
        ListAdapter f1295f0;

        /* renamed from: g0 */
        private final Rect f1296g0;

        /* renamed from: h0 */
        private int f1297h0;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        /* loaded from: classes.dex */
        class C0420a implements AdapterView.OnItemClickListener {
            C0420a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0419e c0419e = C0419e.this;
                    AppCompatSpinner.this.performItemClick(view, i, c0419e.f1295f0.getItemId(i));
                }
                C0419e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        /* loaded from: classes.dex */
        class ViewTreeObserver$OnGlobalLayoutListenerC0421b implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerC0421b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0419e c0419e = C0419e.this;
                if (!c0419e.m40843U(AppCompatSpinner.this)) {
                    C0419e.this.dismiss();
                    return;
                }
                C0419e.this.m40845S();
                C0419e.super.mo19710a();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        /* loaded from: classes.dex */
        class C0422c implements PopupWindow.OnDismissListener {

            /* renamed from: w */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1301w;

            C0422c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1301w = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1301w);
                }
            }
        }

        public C0419e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1296g0 = new Rect();
            m40636D(AppCompatSpinner.this);
            m40630J(true);
            m40625O(0);
            m40628L(new C0420a(AppCompatSpinner.this));
        }

        /* renamed from: S */
        void m40845S() {
            int m40844T;
            Drawable m40620g = m40620g();
            int i = 0;
            if (m40620g != null) {
                m40620g.getPadding(AppCompatSpinner.this.f1279D);
                i = C0541y0.m40330b(AppCompatSpinner.this) ? AppCompatSpinner.this.f1279D.right : -AppCompatSpinner.this.f1279D.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1279D;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.f1278C;
            if (i2 == -2) {
                int m40850a = appCompatSpinner.m40850a((SpinnerAdapter) this.f1295f0, m40620g());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1279D;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (m40850a > i4) {
                    m40850a = i4;
                }
                m40634F(Math.max(m40850a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m40634F((width - paddingLeft) - paddingRight);
            } else {
                m40634F(i2);
            }
            if (C0541y0.m40330b(AppCompatSpinner.this)) {
                m40844T = i + (((width - paddingRight) - m40607z()) - m40844T());
            } else {
                m40844T = i + paddingLeft + m40844T();
            }
            m40618l(m40844T);
        }

        /* renamed from: T */
        public int m40844T() {
            return this.f1297h0;
        }

        /* renamed from: U */
        boolean m40843U(View view) {
            return C1112b0.m38447V(view) && view.getGlobalVisibleRect(this.f1296g0);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: i */
        public void mo40838i(CharSequence charSequence) {
            this.f1294e0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: k */
        public void mo40836k(int i) {
            this.f1297h0 = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: m */
        public void mo40834m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean mo19709c = mo19709c();
            m40845S();
            m40631I(2);
            super.mo19710a();
            ListView mo19708h = mo19708h();
            mo19708h.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                mo19708h.setTextDirection(i);
                mo19708h.setTextAlignment(i2);
            }
            m40624P(AppCompatSpinner.this.getSelectedItemPosition());
            if (mo19709c || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserver$OnGlobalLayoutListenerC0421b viewTreeObserver$OnGlobalLayoutListenerC0421b = new ViewTreeObserver$OnGlobalLayoutListenerC0421b();
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0421b);
            m40629K(new C0422c(viewTreeObserver$OnGlobalLayoutListenerC0421b));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: o */
        public CharSequence mo40832o() {
            return this.f1294e0;
        }

        @Override // androidx.appcompat.widget.C0471f0, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0423f
        /* renamed from: p */
        public void mo40616p(ListAdapter listAdapter) {
            super.mo40616p(listAdapter);
            this.f1295f0 = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0423f {
        /* renamed from: b */
        void mo40842b(Drawable drawable);

        /* renamed from: c */
        boolean mo40841c();

        /* renamed from: d */
        int mo40840d();

        void dismiss();

        /* renamed from: g */
        Drawable mo40839g();

        /* renamed from: i */
        void mo40838i(CharSequence charSequence);

        /* renamed from: j */
        void mo40837j(int i);

        /* renamed from: k */
        void mo40836k(int i);

        /* renamed from: l */
        void mo40835l(int i);

        /* renamed from: m */
        void mo40834m(int i, int i2);

        /* renamed from: n */
        int mo40833n();

        /* renamed from: o */
        CharSequence mo40832o();

        /* renamed from: p */
        void mo40616p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.spinnerStyle);
    }

    /* renamed from: a */
    int m40850a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1279D);
            Rect rect = this.f1279D;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: b */
    void m40849b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1277B.mo40834m(getTextDirection(), getTextAlignment());
        } else {
            this.f1277B.mo40834m(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0463d c0463d = this.f1280w;
        if (c0463d != null) {
            c0463d.m40660b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f != null) {
            return interfaceC0423f.mo40840d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f != null) {
            return interfaceC0423f.mo40833n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1277B != null) {
            return this.f1278C;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final InterfaceC0423f getInternalPopup() {
        return this.f1277B;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f != null) {
            return interfaceC0423f.mo40839g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1281x;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        return interfaceC0423f != null ? interfaceC0423f.mo40832o() : super.getPrompt();
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        C0463d c0463d = this.f1280w;
        if (c0463d != null) {
            return c0463d.m40659c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0463d c0463d = this.f1280w;
        if (c0463d != null) {
            return c0463d.m40658d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f == null || !interfaceC0423f.mo40841c()) {
            return;
        }
        this.f1277B.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1277B == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m40850a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1284w || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0416b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0423f interfaceC0423f = this.f1277B;
        savedState.f1284w = interfaceC0423f != null && interfaceC0423f.mo40841c();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0467e0 abstractView$OnTouchListenerC0467e0 = this.f1282y;
        if (abstractView$OnTouchListenerC0467e0 == null || !abstractView$OnTouchListenerC0467e0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f != null) {
            if (interfaceC0423f.mo40841c()) {
                return true;
            }
            m40849b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0463d c0463d = this.f1280w;
        if (c0463d != null) {
            c0463d.m40656f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0463d c0463d = this.f1280w;
        if (c0463d != null) {
            c0463d.m40655g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f != null) {
            interfaceC0423f.mo40836k(i);
            this.f1277B.mo40835l(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f != null) {
            interfaceC0423f.mo40837j(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1277B != null) {
            this.f1278C = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f != null) {
            interfaceC0423f.mo40842b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C5586a.m23699b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0423f interfaceC0423f = this.f1277B;
        if (interfaceC0423f != null) {
            interfaceC0423f.mo40838i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0463d c0463d = this.f1280w;
        if (c0463d != null) {
            c0463d.m40653i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0463d c0463d = this.f1280w;
        if (c0463d != null) {
            c0463d.m40652j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1276A) {
            this.f1283z = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1277B != null) {
            Context context = this.f1281x;
            if (context == null) {
                context = getContext();
            }
            this.f1277B.mo40616p(new C0418d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.appcompat.widget.AppCompatSpinner, android.view.View, android.widget.Spinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
