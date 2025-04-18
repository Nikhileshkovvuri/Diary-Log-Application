// Generated by view binder compiler. Do not edit!
package MAD.Assignment.databinding;

import MAD.Assignment.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DiaryentryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addEntryButton;

  @NonNull
  public final Button backButton;

  @NonNull
  public final Button clearEntryButton;

  @NonNull
  public final TextView dateText;

  @NonNull
  public final EditText entryDetail;

  @NonNull
  public final TextView entryText;

  @NonNull
  public final TextView textLabel;

  private DiaryentryBinding(@NonNull LinearLayout rootView, @NonNull Button addEntryButton,
      @NonNull Button backButton, @NonNull Button clearEntryButton, @NonNull TextView dateText,
      @NonNull EditText entryDetail, @NonNull TextView entryText, @NonNull TextView textLabel) {
    this.rootView = rootView;
    this.addEntryButton = addEntryButton;
    this.backButton = backButton;
    this.clearEntryButton = clearEntryButton;
    this.dateText = dateText;
    this.entryDetail = entryDetail;
    this.entryText = entryText;
    this.textLabel = textLabel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DiaryentryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DiaryentryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.diaryentry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DiaryentryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addEntryButton;
      Button addEntryButton = ViewBindings.findChildViewById(rootView, id);
      if (addEntryButton == null) {
        break missingId;
      }

      id = R.id.backButton;
      Button backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.clearEntryButton;
      Button clearEntryButton = ViewBindings.findChildViewById(rootView, id);
      if (clearEntryButton == null) {
        break missingId;
      }

      id = R.id.dateText;
      TextView dateText = ViewBindings.findChildViewById(rootView, id);
      if (dateText == null) {
        break missingId;
      }

      id = R.id.entryDetail;
      EditText entryDetail = ViewBindings.findChildViewById(rootView, id);
      if (entryDetail == null) {
        break missingId;
      }

      id = R.id.entryText;
      TextView entryText = ViewBindings.findChildViewById(rootView, id);
      if (entryText == null) {
        break missingId;
      }

      id = R.id.textLabel;
      TextView textLabel = ViewBindings.findChildViewById(rootView, id);
      if (textLabel == null) {
        break missingId;
      }

      return new DiaryentryBinding((LinearLayout) rootView, addEntryButton, backButton,
          clearEntryButton, dateText, entryDetail, entryText, textLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
