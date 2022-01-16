// Generated by view binder compiler. Do not edit!
package com.appsians.strangers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.appsians.strangers.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRewardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView coins;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final LinearLayout video1;

  @NonNull
  public final ImageView video1Icon;

  @NonNull
  public final LinearLayout video2;

  @NonNull
  public final LinearLayout video3;

  @NonNull
  public final LinearLayout video4;

  @NonNull
  public final LinearLayout video5;

  private ActivityRewardBinding(@NonNull ConstraintLayout rootView, @NonNull TextView coins,
      @NonNull ImageView imageView3, @NonNull ImageView imageView7, @NonNull ImageView imageView8,
      @NonNull LinearLayout linearLayout, @NonNull TextView textView10,
      @NonNull TextView textView12, @NonNull TextView textView8, @NonNull LinearLayout video1,
      @NonNull ImageView video1Icon, @NonNull LinearLayout video2, @NonNull LinearLayout video3,
      @NonNull LinearLayout video4, @NonNull LinearLayout video5) {
    this.rootView = rootView;
    this.coins = coins;
    this.imageView3 = imageView3;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.linearLayout = linearLayout;
    this.textView10 = textView10;
    this.textView12 = textView12;
    this.textView8 = textView8;
    this.video1 = video1;
    this.video1Icon = video1Icon;
    this.video2 = video2;
    this.video3 = video3;
    this.video4 = video4;
    this.video5 = video5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRewardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRewardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reward, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRewardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.coins;
      TextView coins = rootView.findViewById(id);
      if (coins == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = rootView.findViewById(id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = rootView.findViewById(id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = rootView.findViewById(id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = rootView.findViewById(id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = rootView.findViewById(id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = rootView.findViewById(id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.video1;
      LinearLayout video1 = rootView.findViewById(id);
      if (video1 == null) {
        break missingId;
      }

      id = R.id.video1Icon;
      ImageView video1Icon = rootView.findViewById(id);
      if (video1Icon == null) {
        break missingId;
      }

      id = R.id.video2;
      LinearLayout video2 = rootView.findViewById(id);
      if (video2 == null) {
        break missingId;
      }

      id = R.id.video3;
      LinearLayout video3 = rootView.findViewById(id);
      if (video3 == null) {
        break missingId;
      }

      id = R.id.video4;
      LinearLayout video4 = rootView.findViewById(id);
      if (video4 == null) {
        break missingId;
      }

      id = R.id.video5;
      LinearLayout video5 = rootView.findViewById(id);
      if (video5 == null) {
        break missingId;
      }

      return new ActivityRewardBinding((ConstraintLayout) rootView, coins, imageView3, imageView7,
          imageView8, linearLayout, textView10, textView12, textView8, video1, video1Icon, video2,
          video3, video4, video5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
