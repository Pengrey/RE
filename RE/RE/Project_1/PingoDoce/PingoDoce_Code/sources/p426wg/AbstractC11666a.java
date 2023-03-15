package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountViewModel;

/* renamed from: wg.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11666a extends ViewDataBinding {

    /* renamed from: x */
    public final ImageView f29807x;

    /* renamed from: y */
    protected AnonymousAccountViewModel f29808y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11666a(Object obj, View view, int i, TextView textView, ImageView imageView, AppBarLayout appBarLayout, Toolbar toolbar) {
        super(obj, view, i);
        this.f29807x = imageView;
    }
}
