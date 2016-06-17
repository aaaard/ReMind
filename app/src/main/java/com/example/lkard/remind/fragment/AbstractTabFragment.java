package com.example.lkard.remind.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by LKARD on 17.06.2016.
 */
public class AbstractTabFragment extends Fragment {
    private String title;
    protected View view;
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
