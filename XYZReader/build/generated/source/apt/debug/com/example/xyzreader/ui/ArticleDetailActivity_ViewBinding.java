// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.xyzreader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArticleDetailActivity_ViewBinding implements Unbinder {
  private ArticleDetailActivity target;

  @UiThread
  public ArticleDetailActivity_ViewBinding(ArticleDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ArticleDetailActivity_ViewBinding(ArticleDetailActivity target, View source) {
    this.target = target;

    target.pager = Utils.findRequiredViewAsType(source, R.id.pager, "field 'pager'", ViewPager.class);
    target.actionUp = Utils.findRequiredViewAsType(source, R.id.action_up, "field 'actionUp'", ImageButton.class);
    target.upContainer = Utils.findRequiredViewAsType(source, R.id.up_container, "field 'upContainer'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArticleDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pager = null;
    target.actionUp = null;
    target.upContainer = null;
  }
}
