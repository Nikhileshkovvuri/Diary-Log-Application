// Generated by view binder compiler. Do not edit!
package MAD.Assignment.databinding;

import MAD.Assignment.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DiaryentrylogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button dateFilterButton;

  @NonNull
  public final Button deleteAllEntry;

  @NonNull
  public final Button deleteDateButton;

  @NonNull
  public final TextView entryLogText;

  @NonNull
  public final TextView myDiaryText;

  @NonNull
  public final Button newEntryButton;

  @NonNull
  public final Button refreshButton;

  @NonNull
  public final RelativeLayout relativeLayout1;

  private DiaryentrylogBinding(@NonNull LinearLayout rootView, @NonNull Button dateFilterButton,
      @NonNull Button deleteAllEntry, @NonNull Button deleteDateButton,
      @NonNull TextView entryLogText, @NonNull TextView myDiaryText, @NonNull Button newEntryButton,
      @NonNull Button refreshButton, @NonNull RelativeLayout relativeLayout1) {
    this.rootView = rootView;
    this.dateFilterButton = dateFilterButton;
    this.deleteAllEntry = deleteAllEntry;
    this.deleteDateButton = deleteDateButton;
    this.entryLogText = entryLogText;
    this.myDiaryText = myDiaryText;
    this.newEntryButton = newEntryButton;
    this.refreshButton = refreshButton;
    this.relativeLayout1 = relativeLayout1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DiaryentrylogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DiaryentrylogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.diaryentrylog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DiaryentrylogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dateFilterButton;
      Button dateFilterButton = ViewBindings.findChildViewById(rootView, id);
      if (dateFilterButton == null) {
        break missingId;
      }

      id = R.id.deleteAllEntry;
      Button deleteAllEntry = ViewBindings.findChildViewById(rootView, id);
      if (deleteAllEntry == null) {
        break missingId;
      }

      id = R.id.deleteDateButton;
      Button deleteDateButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteDateButton == null) {
        break missingId;
      }

      id = R.id.entryLogText;
      TextView entryLogText = ViewBindings.findChildViewById(rootView, id);
      if (entryLogText == null) {
        break missingId;
      }

      id = R.id.myDiaryText;
      TextView myDiaryText = ViewBindings.findChildViewById(rootView, id);
      if (myDiaryText == null) {
        break missingId;
      }

      id = R.id.newEntryButton;
      Button newEntryButton = ViewBindings.findChildViewById(rootView, id);
      if (newEntryButton == null) {
        break missingId;
      }

      id = R.id.refreshButton;
      Button refreshButton = ViewBindings.findChildViewById(rootView, id);
      if (refreshButton == null) {
        break missingId;
      }

      id = R.id.relativeLayout1;
      RelativeLayout relativeLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout1 == null) {
        break missingId;
      }

      return new DiaryentrylogBinding((LinearLayout) rootView, dateFilterButton, deleteAllEntry,
          deleteDateButton, entryLogText, myDiaryText, newEntryButton, refreshButton,
          relativeLayout1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
