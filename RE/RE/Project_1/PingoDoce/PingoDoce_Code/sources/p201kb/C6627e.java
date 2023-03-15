package p201kb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* renamed from: kb.e */
/* loaded from: classes2.dex */
public final class C6627e {

    /* renamed from: d */
    private static final String f17885d = "e";

    /* renamed from: a */
    private final Context f17886a;

    /* renamed from: b */
    private boolean f17887b = true;

    /* renamed from: c */
    private boolean f17888c = false;

    public C6627e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f17886a = activity.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m20436c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ boolean m20435d(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f17885d;
        Log.w(str, "Failed to beep " + i + ", " + i2);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    /* renamed from: e */
    public MediaPlayer m20434e() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(C6625c.f17883a);
        mediaPlayer.setOnErrorListener(C6626d.f17884a);
        try {
            AssetFileDescriptor openRawResourceFd = this.f17886a.getResources().openRawResourceFd(C6637m.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e) {
            Log.w(f17885d, e);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: f */
    public synchronized void m20433f() {
        Vibrator vibrator;
        if (this.f17887b) {
            m20434e();
        }
        if (this.f17888c && (vibrator = (Vibrator) this.f17886a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
    }

    /* renamed from: g */
    public void m20432g(boolean z) {
        this.f17887b = z;
    }
}
