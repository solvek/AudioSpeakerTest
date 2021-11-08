package p000;

import android.util.Property;
import android.view.ViewGroup;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: oh */
public class C0929oh extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f3501a = new C0929oh("childrenAlpha");

    public C0929oh(String str) {
        super(Float.class, str);
    }

    public Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    public void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
