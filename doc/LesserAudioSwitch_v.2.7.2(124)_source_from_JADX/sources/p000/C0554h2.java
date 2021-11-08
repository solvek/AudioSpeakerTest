package p000;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: h2 */
public final class C0554h2 {

    /* renamed from: a */
    public TextView f2422a;

    /* renamed from: b */
    public TextClassifier f2423b;

    public C0554h2(TextView textView) {
        this.f2422a = textView;
    }

    /* renamed from: a */
    public TextClassifier mo3020a() {
        TextClassifier textClassifier = this.f2423b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f2422a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
