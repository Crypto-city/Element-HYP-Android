package com.coinomi.wallet.ui.splashscreen;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.coinomi.wallet.R;

import com.coinomi.wallet.ui.BaseWalletActivity;
import com.coinomi.wallet.ui.WalletActivity;
import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends BaseWalletActivity {
    private LottieAnimationView animationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        animationView = (LottieAnimationView)findViewById(R.id.anim_view);
//        animationView.loop(true);
//        animationView.playAnimation();
        Intent intent = new Intent(this, WalletActivity.class);

        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                finish();
                return;
            }
        });

        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                startActivity(intent);
                finish();
                return;

            }

            @Override
            public void onAnimationCancel(Animator animator) {
                startActivity(intent);
                finish();
                return;

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

    }
}

