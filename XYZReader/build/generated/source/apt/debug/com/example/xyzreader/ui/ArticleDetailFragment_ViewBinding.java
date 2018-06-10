// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.xyzreader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArticleDetailFragment_ViewBinding implements Unbinder {
  private ArticleDetailFragment target;

  @UiThread
  public ArticleDetailFragment_ViewBinding(ArticleDetailFragment target, View source) {
    this.target = target;

    target.photo = Utils.findRequiredViewAsType(source, R.id.photo, "field 'photo'", ImageView.class);
    target.photoContainer = Utils.findRequiredViewAsType(source, R.id.photo_container, "field 'photoContainer'", FrameLayout.class);
    target.articleTitle = Utils.findRequiredViewAsType(source, R.id.article_title, "field 'articleTitle'", TextView.class);
    target.articleByline = Utils.findRequiredViewAsType(source, R.id.article_byline, "field 'articleByline'", TextView.class);
    target.metaBar = Utils.findRequiredViewAsType(source, R.id.meta_bar, "field 'metaBar'", LinearLayout.class);
    target.articleBody = Utils.findRequiredViewAsType(source, R.id.article_body, "field 'articleBody'", TextView.class);
    target.scrollview = Utils.findRequiredViewAsType(source, R.id.scrollview, "field 'scrollview'", ObservableScrollView.class);
    target.shareFab = Utils.findRequiredViewAsType(source, R.id.share_fab, "field 'shareFab'", FloatingActionButton.class);
    target.drawInsetsFrameLayout = Utils.findRequiredViewAsType(source, R.id.draw_insets_frame_layout, "field 'drawInsetsFrameLayout'", DrawInsetsFrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArticleDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.photo = null;
    target.photoContainer = null;
    target.articleTitle = null;
    target.articleByline = null;
    target.metaBar = null;
    target.articleBody = null;
    target.scrollview = null;
    target.shareFab = null;
    target.drawInsetsFrameLayout = null;
  }
}
