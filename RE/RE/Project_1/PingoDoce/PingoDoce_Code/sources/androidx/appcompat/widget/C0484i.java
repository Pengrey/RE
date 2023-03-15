package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0486i0;
import androidx.core.graphics.C0969a;
import p070e.C4897a;
import p070e.C4899c;
import p070e.C4900d;
import p070e.C4901e;
import p111g.C5586a;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
public final class C0484i {

    /* renamed from: b */
    private static final PorterDuff.Mode f1625b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0484i f1626c;

    /* renamed from: a */
    private C0486i0 f1627a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDrawableManager.java */
    /* renamed from: androidx.appcompat.widget.i$a */
    /* loaded from: classes.dex */
    public class C0485a implements C0486i0.InterfaceC0492f {

        /* renamed from: a */
        private final int[] f1628a = {C4901e.abc_textfield_search_default_mtrl_alpha, C4901e.abc_textfield_default_mtrl_alpha, C4901e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1629b = {C4901e.abc_ic_commit_search_api_mtrl_alpha, C4901e.abc_seekbar_tick_mark_material, C4901e.abc_ic_menu_share_mtrl_alpha, C4901e.abc_ic_menu_copy_mtrl_am_alpha, C4901e.abc_ic_menu_cut_mtrl_alpha, C4901e.abc_ic_menu_selectall_mtrl_alpha, C4901e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1630c = {C4901e.abc_textfield_activated_mtrl_alpha, C4901e.abc_textfield_search_activated_mtrl_alpha, C4901e.f13376k, C4901e.abc_text_cursor_material, C4901e.f13373L, C4901e.f13374M, C4901e.f13375N};

        /* renamed from: d */
        private final int[] f1631d = {C4901e.f13377w, C4901e.abc_cab_background_internal_bg, C4901e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1632e = {C4901e.abc_tab_indicator_material, C4901e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1633f = {C4901e.abc_btn_check_material, C4901e.abc_btn_radio_material, C4901e.abc_btn_check_material_anim, C4901e.abc_btn_radio_material_anim};

        C0485a() {
        }

        /* renamed from: f */
        private boolean m40582f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m40581g(Context context) {
            return m40580h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m40580h(Context context, int i) {
            int m40493c = C0508n0.m40493c(context, C4897a.f13370v);
            return new ColorStateList(new int[][]{C0508n0.f1705b, C0508n0.f1707d, C0508n0.f1706c, C0508n0.f1709f}, new int[]{C0508n0.m40494b(context, C4897a.colorButtonNormal), C0969a.m38943f(m40493c, i), C0969a.m38943f(m40493c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m40579i(Context context) {
            return m40580h(context, C0508n0.m40493c(context, C4897a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m40578j(Context context) {
            return m40580h(context, C0508n0.m40493c(context, C4897a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m40577k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = C4897a.colorSwitchThumbNormal;
            ColorStateList m40491e = C0508n0.m40491e(context, i);
            if (m40491e != null && m40491e.isStateful()) {
                iArr[0] = C0508n0.f1705b;
                iArr2[0] = m40491e.getColorForState(iArr[0], 0);
                iArr[1] = C0508n0.f1708e;
                iArr2[1] = C0508n0.m40493c(context, C4897a.f13369u);
                iArr[2] = C0508n0.f1709f;
                iArr2[2] = m40491e.getDefaultColor();
            } else {
                iArr[0] = C0508n0.f1705b;
                iArr2[0] = C0508n0.m40494b(context, i);
                iArr[1] = C0508n0.f1708e;
                iArr2[1] = C0508n0.m40493c(context, C4897a.f13369u);
                iArr[2] = C0508n0.f1709f;
                iArr2[2] = C0508n0.m40493c(context, i);
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m40576l(C0486i0 c0486i0, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable m40565j = c0486i0.m40565j(context, C4901e.abc_star_black_48dp);
            Drawable m40565j2 = c0486i0.m40565j(context, C4901e.abc_star_half_black_48dp);
            if ((m40565j instanceof BitmapDrawable) && m40565j.getIntrinsicWidth() == dimensionPixelSize && m40565j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m40565j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m40565j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m40565j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m40565j2 instanceof BitmapDrawable) && m40565j2.getIntrinsicWidth() == dimensionPixelSize && m40565j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m40565j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m40565j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m40565j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m40575m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0456b0.m40682a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0484i.f1625b;
            }
            drawable.setColorFilter(C0484i.m40587e(i, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0492f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo40547a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0484i.m40591a()
                int[] r1 = r6.f1628a
                boolean r1 = r6.m40582f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = p070e.C4897a.colorControlNormal
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f1630c
                boolean r1 = r6.m40582f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = p070e.C4897a.f13369u
                goto L14
            L22:
                int[] r1 = r6.f1631d
                boolean r1 = r6.m40582f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = p070e.C4901e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = p070e.C4901e.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.C0456b0.m40682a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.C0508n0.m40493c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0484i.m40587e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0484i.C0485a.mo40547a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0492f
        /* renamed from: b */
        public PorterDuff.Mode mo40546b(int i) {
            if (i == C4901e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0492f
        /* renamed from: c */
        public Drawable mo40545c(C0486i0 c0486i0, Context context, int i) {
            if (i == C4901e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{c0486i0.m40565j(context, C4901e.abc_cab_background_internal_bg), c0486i0.m40565j(context, C4901e.f13376k)});
            }
            if (i == C4901e.abc_ratingbar_material) {
                return m40576l(c0486i0, context, C4900d.abc_star_big);
            }
            if (i == C4901e.abc_ratingbar_indicator_material) {
                return m40576l(c0486i0, context, C4900d.abc_star_medium);
            }
            if (i == C4901e.abc_ratingbar_small_material) {
                return m40576l(c0486i0, context, C4900d.abc_star_small);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0492f
        /* renamed from: d */
        public ColorStateList mo40544d(Context context, int i) {
            if (i == C4901e.abc_edit_text_material) {
                return C5586a.m23700a(context, C4899c.abc_tint_edittext);
            }
            if (i == C4901e.abc_switch_track_mtrl_alpha) {
                return C5586a.m23700a(context, C4899c.abc_tint_switch_track);
            }
            if (i == C4901e.abc_switch_thumb_material) {
                return m40577k(context);
            }
            if (i == C4901e.abc_btn_default_mtrl_shape) {
                return m40578j(context);
            }
            if (i == C4901e.abc_btn_borderless_material) {
                return m40581g(context);
            }
            if (i == C4901e.abc_btn_colored_material) {
                return m40579i(context);
            }
            if (i != C4901e.f13372D && i != C4901e.abc_spinner_textfield_background_material) {
                if (m40582f(this.f1629b, i)) {
                    return C0508n0.m40491e(context, C4897a.colorControlNormal);
                }
                if (m40582f(this.f1632e, i)) {
                    return C5586a.m23700a(context, C4899c.abc_tint_default);
                }
                if (m40582f(this.f1633f, i)) {
                    return C5586a.m23700a(context, C4899c.abc_tint_btn_checkable);
                }
                if (i == C4901e.abc_seekbar_thumb_material) {
                    return C5586a.m23700a(context, C4899c.abc_tint_seek_thumb);
                }
                return null;
            }
            return C5586a.m23700a(context, C4899c.abc_tint_spinner);
        }

        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0492f
        /* renamed from: e */
        public boolean mo40543e(Context context, int i, Drawable drawable) {
            if (i == C4901e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C4897a.colorControlNormal;
                m40575m(findDrawableByLayerId, C0508n0.m40493c(context, i2), C0484i.f1625b);
                m40575m(layerDrawable.findDrawableByLayerId(16908303), C0508n0.m40493c(context, i2), C0484i.f1625b);
                m40575m(layerDrawable.findDrawableByLayerId(16908301), C0508n0.m40493c(context, C4897a.f13369u), C0484i.f1625b);
                return true;
            } else if (i == C4901e.abc_ratingbar_material || i == C4901e.abc_ratingbar_indicator_material || i == C4901e.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m40575m(layerDrawable2.findDrawableByLayerId(16908288), C0508n0.m40494b(context, C4897a.colorControlNormal), C0484i.f1625b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C4897a.f13369u;
                m40575m(findDrawableByLayerId2, C0508n0.m40493c(context, i3), C0484i.f1625b);
                m40575m(layerDrawable2.findDrawableByLayerId(16908301), C0508n0.m40493c(context, i3), C0484i.f1625b);
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0484i m40590b() {
        C0484i c0484i;
        synchronized (C0484i.class) {
            if (f1626c == null) {
                m40584h();
            }
            c0484i = f1626c;
        }
        return c0484i;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m40587e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m40563l;
        synchronized (C0484i.class) {
            m40563l = C0486i0.m40563l(i, mode);
        }
        return m40563l;
    }

    /* renamed from: h */
    public static synchronized void m40584h() {
        synchronized (C0484i.class) {
            if (f1626c == null) {
                C0484i c0484i = new C0484i();
                f1626c = c0484i;
                c0484i.f1627a = C0486i0.m40567h();
                f1626c.f1627a.m40554u(new C0485a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m40583i(Drawable drawable, C0514q0 c0514q0, int[] iArr) {
        C0486i0.m40552w(drawable, c0514q0, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m40589c(Context context, int i) {
        return this.f1627a.m40565j(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable m40588d(Context context, int i, boolean z) {
        return this.f1627a.m40564k(context, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList m40586f(Context context, int i) {
        return this.f1627a.m40562m(context, i);
    }

    /* renamed from: g */
    public synchronized void m40585g(Context context) {
        this.f1627a.m40556s(context);
    }
}
