/**
 * 
 */
package cn.salesuite.saf.inject;

import java.lang.reflect.Method;

import android.view.View;
import android.view.View.OnClickListener;

/**
 * @author Tony Shen
 *
 */
public class InjectedOnClickListener extends AbstractInjectedOnListener implements OnClickListener {

	InjectedOnClickListener(Object target, Method method,boolean invokeWithViewParam) {
		super(target, method, invokeWithViewParam);
	}
	  
	@Override
	public final void onClick(View v) {
		if (enabled) {
			enabled = false;
			v.post(ENABLE_AGAIN);
			handleOnListener(v);
		}
	}

}
