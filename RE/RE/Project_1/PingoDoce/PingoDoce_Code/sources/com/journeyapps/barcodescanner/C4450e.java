package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.C0883b;
import androidx.core.content.C0928a;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4410n;
import com.journeyapps.barcodescanner.C4440a;
import com.journeyapps.barcodescanner.C4450e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p138hc.C5888c;
import p138hc.InterfaceC5886a;
import p201kb.C6627e;
import p201kb.C6630h;
import p201kb.C6638n;

/* renamed from: com.journeyapps.barcodescanner.e */
/* loaded from: classes2.dex */
public class C4450e {

    /* renamed from: o */
    private static final String f12028o = "e";

    /* renamed from: p */
    private static int f12029p = 250;

    /* renamed from: a */
    private Activity f12030a;

    /* renamed from: b */
    private DecoratedBarcodeView f12031b;

    /* renamed from: h */
    private C6630h f12037h;

    /* renamed from: i */
    private C6627e f12038i;

    /* renamed from: j */
    private Handler f12039j;

    /* renamed from: m */
    private final C4440a.InterfaceC4446f f12042m;

    /* renamed from: n */
    private boolean f12043n;

    /* renamed from: c */
    private int f12032c = -1;

    /* renamed from: d */
    private boolean f12033d = false;

    /* renamed from: e */
    private boolean f12034e = true;

    /* renamed from: f */
    private String f12035f = BuildConfig.VERSION_NAME;

    /* renamed from: g */
    private boolean f12036g = false;

    /* renamed from: k */
    private boolean f12040k = false;

    /* renamed from: l */
    private InterfaceC5886a f12041l = new C4451a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaptureManager.java */
    /* renamed from: com.journeyapps.barcodescanner.e$a */
    /* loaded from: classes2.dex */
    public class C4451a implements InterfaceC5886a {
        C4451a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m27507d(C5888c c5888c) {
            C4450e.this.m27538B(c5888c);
        }

        @Override // p138hc.InterfaceC5886a
        /* renamed from: a */
        public void mo22820a(final C5888c c5888c) {
            C4450e.this.f12031b.m27580e();
            C4450e.this.f12038i.m20433f();
            C4450e.this.f12039j.post(new Runnable() { // from class: com.journeyapps.barcodescanner.d
                @Override // java.lang.Runnable
                public final void run() {
                    C4450e.C4451a.this.m27507d(c5888c);
                }
            });
        }

        @Override // p138hc.InterfaceC5886a
        /* renamed from: b */
        public void mo22819b(List<C4411o> list) {
        }
    }

    /* compiled from: CaptureManager.java */
    /* renamed from: com.journeyapps.barcodescanner.e$b */
    /* loaded from: classes2.dex */
    class C4452b implements C4440a.InterfaceC4446f {
        C4452b() {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: a */
        public void mo27506a() {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: b */
        public void mo27505b(Exception exc) {
            C4450e c4450e = C4450e.this;
            c4450e.m27522m(c4450e.f12030a.getString(C6638n.zxing_msg_camera_framework_bug));
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: c */
        public void mo27504c() {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: d */
        public void mo27503d() {
        }

        @Override // com.journeyapps.barcodescanner.C4440a.InterfaceC4446f
        /* renamed from: e */
        public void mo27502e() {
            if (C4450e.this.f12040k) {
                Log.d(C4450e.f12028o, "Camera closed; finishing activity");
                C4450e.this.m27521n();
            }
        }
    }

    public C4450e(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        C4452b c4452b = new C4452b();
        this.f12042m = c4452b;
        this.f12043n = false;
        this.f12030a = activity;
        this.f12031b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().m27559i(c4452b);
        this.f12039j = new Handler();
        this.f12037h = new C6630h(activity, new Runnable() { // from class: hc.f
            @Override // java.lang.Runnable
            public final void run() {
                C4450e.this.m27516s();
            }
        });
        this.f12038i = new C6627e(activity);
    }

    /* renamed from: A */
    public static Intent m27539A(C5888c c5888c, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", c5888c.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", c5888c.m22817a().toString());
        byte[] m22815c = c5888c.m22815c();
        if (m22815c != null && m22815c.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", m22815c);
        }
        Map<EnumC4410n, Object> m22814d = c5888c.m22814d();
        if (m22814d != null) {
            EnumC4410n enumC4410n = EnumC4410n.UPC_EAN_EXTENSION;
            if (m22814d.containsKey(enumC4410n)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", m22814d.get(enumC4410n).toString());
            }
            Number number = (Number) m22814d.get(EnumC4410n.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) m22814d.get(EnumC4410n.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable<byte[]> iterable = (Iterable) m22814d.get(EnumC4410n.BYTE_SEGMENTS);
            if (iterable != null) {
                int i = 0;
                for (byte[] bArr : iterable) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i, bArr);
                    i++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    /* renamed from: D */
    private void m27536D() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f12030a.setResult(0, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m27521n() {
        this.f12030a.finish();
    }

    /* renamed from: o */
    private String m27520o(C5888c c5888c) {
        if (this.f12033d) {
            Bitmap m22816b = c5888c.m22816b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f12030a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                m22816b.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e) {
                String str = f12028o;
                Log.w(str, "Unable to create temporary file and store bitmap! " + e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m27518q(DialogInterface dialogInterface, int i) {
        m27521n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m27517r(DialogInterface dialogInterface) {
        m27521n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m27516s() {
        Log.d(f12028o, "Finishing due to inactivity");
        m27521n();
    }

    @TargetApi(23)
    /* renamed from: z */
    private void m27509z() {
        if (C0928a.m39116a(this.f12030a, "android.permission.CAMERA") == 0) {
            this.f12031b.m27578g();
        } else if (this.f12043n) {
        } else {
            C0883b.m39262r(this.f12030a, new String[]{"android.permission.CAMERA"}, f12029p);
            this.f12043n = true;
        }
    }

    /* renamed from: B */
    protected void m27538B(C5888c c5888c) {
        this.f12030a.setResult(-1, m27539A(c5888c, m27520o(c5888c)));
        m27524k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public void m27537C() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f12030a.setResult(0, intent);
        m27524k();
    }

    /* renamed from: E */
    public void m27535E(boolean z, String str) {
        this.f12034e = z;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        this.f12035f = str;
    }

    /* renamed from: k */
    protected void m27524k() {
        if (this.f12031b.getBarcodeView().m27549s()) {
            m27521n();
        } else {
            this.f12040k = true;
        }
        this.f12031b.m27580e();
        this.f12037h.m20425d();
    }

    /* renamed from: l */
    public void m27523l() {
        this.f12031b.m27583b(this.f12041l);
    }

    /* renamed from: m */
    protected void m27522m(String str) {
        if (this.f12030a.isFinishing() || this.f12036g || this.f12040k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f12030a.getString(C6638n.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f12030a);
        builder.setTitle(this.f12030a.getString(C6638n.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(C6638n.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: hc.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C4450e.this.m27518q(dialogInterface, i);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hc.d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C4450e.this.m27517r(dialogInterface);
            }
        });
        builder.show();
    }

    /* renamed from: p */
    public void m27519p(Intent intent, Bundle bundle) {
        this.f12030a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f12032c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                m27515t();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f12031b.m27581d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f12038i.m20432g(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                m27535E(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f12039j.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4450e.this.m27537C();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f12033d = true;
            }
        }
    }

    /* renamed from: t */
    protected void m27515t() {
        if (this.f12032c == -1) {
            int rotation = this.f12030a.getWindowManager().getDefaultDisplay().getRotation();
            int i = this.f12030a.getResources().getConfiguration().orientation;
            int i2 = 0;
            if (i == 2) {
                if (rotation != 0 && rotation != 1) {
                    i2 = 8;
                }
            } else if (i == 1) {
                i2 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f12032c = i2;
        }
        this.f12030a.setRequestedOrientation(this.f12032c);
    }

    /* renamed from: u */
    public void m27514u() {
        this.f12036g = true;
        this.f12037h.m20425d();
        this.f12039j.removeCallbacksAndMessages(null);
    }

    /* renamed from: v */
    public void m27513v() {
        this.f12037h.m20425d();
        this.f12031b.m27579f();
    }

    /* renamed from: w */
    public void m27512w(int i, String[] strArr, int[] iArr) {
        if (i == f12029p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f12031b.m27578g();
                return;
            }
            m27536D();
            if (this.f12034e) {
                m27522m(this.f12035f);
            } else {
                m27524k();
            }
        }
    }

    /* renamed from: x */
    public void m27511x() {
        if (Build.VERSION.SDK_INT >= 23) {
            m27509z();
        } else {
            this.f12031b.m27578g();
        }
        this.f12037h.m20421h();
    }

    /* renamed from: y */
    public void m27510y(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f12032c);
    }
}
