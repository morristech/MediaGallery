package net.alhazmy13.mediagallery.library.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import net.alhazmy13.mediagallery.library.Constants;
import net.alhazmy13.mediagallery.library.R;
import java.util.ArrayList;


abstract class BaseActivity extends AppCompatActivity {
    protected Toolbar mToolbar;
    protected ArrayList<String> imageURLs;
    protected String title;
    @ColorRes
    protected int backgroundColor;
    @DrawableRes
    protected int placeHolder;
    protected int selectedImagePosition;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResourceLayoutId());
        initBase();
        onCreateActivity();
    }

    private void initBase() {
        initBaseValues();
        initBaseViews();

    }

    private void initBaseValues() {
        Intent intent = getIntent();
        if(intent == null) return;
        imageURLs = getIntent().getStringArrayListExtra(Constants.IMAGES);
        title = getIntent().getStringExtra(Constants.TITLE);
        backgroundColor = getIntent().getIntExtra(Constants.BACKGROUND_COLOR,-1);
        placeHolder = getIntent().getIntExtra(Constants.PLACE_HOLDER,-1);
        selectedImagePosition = getIntent().getIntExtra(Constants.SELECTED_IMAGE_POSITION,0);

    }


    private void initBaseViews() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(String.valueOf(title));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
    }


    protected abstract int getResourceLayoutId();

    protected abstract void onCreateActivity();
}
