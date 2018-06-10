// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.xyzreader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArticleListActivity_ViewBinding implements Unbinder {
  private ArticleListActivity target;

  @UiThread
  public ArticleListActivity_ViewBinding(ArticleListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ArticleListActivity_ViewBinding(ArticleListActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe_refresh_layout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArticleListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.recyclerView = null;
    target.swipeRefreshLayout = null;
  }
}
