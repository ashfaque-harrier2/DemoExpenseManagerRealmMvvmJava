// Generated by view binder compiler. Do not edit!
package com.example.emanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.emanager.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddTransactionBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextInputEditText account;

  @NonNull
  public final TextInputEditText amount;

  @NonNull
  public final TextInputEditText category;

  @NonNull
  public final TextInputEditText date;

  @NonNull
  public final TextView expenseBtn;

  @NonNull
  public final TextView incomeBtn;

  @NonNull
  public final TextInputEditText note;

  @NonNull
  public final Button saveTransactionBtn;

  private FragmentAddTransactionBinding(@NonNull FrameLayout rootView,
      @NonNull TextInputEditText account, @NonNull TextInputEditText amount,
      @NonNull TextInputEditText category, @NonNull TextInputEditText date,
      @NonNull TextView expenseBtn, @NonNull TextView incomeBtn, @NonNull TextInputEditText note,
      @NonNull Button saveTransactionBtn) {
    this.rootView = rootView;
    this.account = account;
    this.amount = amount;
    this.category = category;
    this.date = date;
    this.expenseBtn = expenseBtn;
    this.incomeBtn = incomeBtn;
    this.note = note;
    this.saveTransactionBtn = saveTransactionBtn;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddTransactionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddTransactionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_transaction, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddTransactionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.account;
      TextInputEditText account = ViewBindings.findChildViewById(rootView, id);
      if (account == null) {
        break missingId;
      }

      id = R.id.amount;
      TextInputEditText amount = ViewBindings.findChildViewById(rootView, id);
      if (amount == null) {
        break missingId;
      }

      id = R.id.category;
      TextInputEditText category = ViewBindings.findChildViewById(rootView, id);
      if (category == null) {
        break missingId;
      }

      id = R.id.date;
      TextInputEditText date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.expenseBtn;
      TextView expenseBtn = ViewBindings.findChildViewById(rootView, id);
      if (expenseBtn == null) {
        break missingId;
      }

      id = R.id.incomeBtn;
      TextView incomeBtn = ViewBindings.findChildViewById(rootView, id);
      if (incomeBtn == null) {
        break missingId;
      }

      id = R.id.note;
      TextInputEditText note = ViewBindings.findChildViewById(rootView, id);
      if (note == null) {
        break missingId;
      }

      id = R.id.saveTransactionBtn;
      Button saveTransactionBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveTransactionBtn == null) {
        break missingId;
      }

      return new FragmentAddTransactionBinding((FrameLayout) rootView, account, amount, category,
          date, expenseBtn, incomeBtn, note, saveTransactionBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
