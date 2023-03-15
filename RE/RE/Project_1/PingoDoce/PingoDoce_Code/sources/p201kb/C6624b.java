package p201kb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import p160ic.C6084h;
import p160ic.C6086i;

/* renamed from: kb.b */
/* loaded from: classes2.dex */
public final class C6624b implements SensorEventListener {

    /* renamed from: a */
    private C6084h f17878a;

    /* renamed from: b */
    private C6086i f17879b;

    /* renamed from: c */
    private Sensor f17880c;

    /* renamed from: d */
    private Context f17881d;

    /* renamed from: e */
    private Handler f17882e = new Handler();

    public C6624b(Context context, C6084h c6084h, C6086i c6086i) {
        this.f17881d = context;
        this.f17878a = c6084h;
        this.f17879b = c6086i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m20442b(boolean z) {
        this.f17878a.m22191t(z);
    }

    /* renamed from: c */
    private void m20441c(final boolean z) {
        this.f17882e.post(new Runnable() { // from class: kb.a
            @Override // java.lang.Runnable
            public final void run() {
                C6624b.this.m20442b(z);
            }
        });
    }

    /* renamed from: d */
    public void m20440d() {
        if (this.f17879b.m22183d()) {
            SensorManager sensorManager = (SensorManager) this.f17881d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f17880c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* renamed from: e */
    public void m20439e() {
        if (this.f17880c != null) {
            ((SensorManager) this.f17881d.getSystemService("sensor")).unregisterListener(this);
            this.f17880c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.f17878a != null) {
            if (f <= 45.0f) {
                m20441c(true);
            } else if (f >= 450.0f) {
                m20441c(false);
            }
        }
    }
}
