package com.example.kotlindemo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.kotlindemo.databinding.ActivityDataShowBindingImpl;
import com.example.kotlindemo.databinding.ActivityFirstBindingImpl;
import com.example.kotlindemo.databinding.ActivityKotlinFlowBindingImpl;
import com.example.kotlindemo.databinding.ActivityMainBindingImpl;
import com.example.kotlindemo.databinding.ActivityNoteBindingImpl;
import com.example.kotlindemo.databinding.ActivitySecondBindingImpl;
import com.example.kotlindemo.databinding.ActivityThirdBindingImpl;
import com.example.kotlindemo.databinding.ActivityTwoApiCallBindingImpl;
import com.example.kotlindemo.databinding.FragmentNoteAddBindingImpl;
import com.example.kotlindemo.databinding.FragmentNoteListBindingImpl;
import com.example.kotlindemo.databinding.NoteItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDATASHOW = 1;

  private static final int LAYOUT_ACTIVITYFIRST = 2;

  private static final int LAYOUT_ACTIVITYKOTLINFLOW = 3;

  private static final int LAYOUT_ACTIVITYMAIN = 4;

  private static final int LAYOUT_ACTIVITYNOTE = 5;

  private static final int LAYOUT_ACTIVITYSECOND = 6;

  private static final int LAYOUT_ACTIVITYTHIRD = 7;

  private static final int LAYOUT_ACTIVITYTWOAPICALL = 8;

  private static final int LAYOUT_FRAGMENTNOTEADD = 9;

  private static final int LAYOUT_FRAGMENTNOTELIST = 10;

  private static final int LAYOUT_NOTEITEM = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.activity_data_show, LAYOUT_ACTIVITYDATASHOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.activity_first, LAYOUT_ACTIVITYFIRST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.activity_kotlin_flow, LAYOUT_ACTIVITYKOTLINFLOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.activity_note, LAYOUT_ACTIVITYNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.activity_second, LAYOUT_ACTIVITYSECOND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.activity_third, LAYOUT_ACTIVITYTHIRD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.activity_two_api_call, LAYOUT_ACTIVITYTWOAPICALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.fragment_note_add, LAYOUT_FRAGMENTNOTEADD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.fragment_note_list, LAYOUT_FRAGMENTNOTELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kotlindemo.R.layout.note_item, LAYOUT_NOTEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDATASHOW: {
          if ("layout/activity_data_show_0".equals(tag)) {
            return new ActivityDataShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_data_show is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFIRST: {
          if ("layout/activity_first_0".equals(tag)) {
            return new ActivityFirstBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_first is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYKOTLINFLOW: {
          if ("layout/activity_kotlin_flow_0".equals(tag)) {
            return new ActivityKotlinFlowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_kotlin_flow is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNOTE: {
          if ("layout/activity_note_0".equals(tag)) {
            return new ActivityNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_note is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSECOND: {
          if ("layout/activity_second_0".equals(tag)) {
            return new ActivitySecondBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_second is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTHIRD: {
          if ("layout/activity_third_0".equals(tag)) {
            return new ActivityThirdBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_third is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTWOAPICALL: {
          if ("layout/activity_two_api_call_0".equals(tag)) {
            return new ActivityTwoApiCallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_two_api_call is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTEADD: {
          if ("layout/fragment_note_add_0".equals(tag)) {
            return new FragmentNoteAddBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_note_add is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTELIST: {
          if ("layout/fragment_note_list_0".equals(tag)) {
            return new FragmentNoteListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_note_list is invalid. Received: " + tag);
        }
        case  LAYOUT_NOTEITEM: {
          if ("layout/note_item_0".equals(tag)) {
            return new NoteItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for note_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_data_show_0", com.example.kotlindemo.R.layout.activity_data_show);
      sKeys.put("layout/activity_first_0", com.example.kotlindemo.R.layout.activity_first);
      sKeys.put("layout/activity_kotlin_flow_0", com.example.kotlindemo.R.layout.activity_kotlin_flow);
      sKeys.put("layout/activity_main_0", com.example.kotlindemo.R.layout.activity_main);
      sKeys.put("layout/activity_note_0", com.example.kotlindemo.R.layout.activity_note);
      sKeys.put("layout/activity_second_0", com.example.kotlindemo.R.layout.activity_second);
      sKeys.put("layout/activity_third_0", com.example.kotlindemo.R.layout.activity_third);
      sKeys.put("layout/activity_two_api_call_0", com.example.kotlindemo.R.layout.activity_two_api_call);
      sKeys.put("layout/fragment_note_add_0", com.example.kotlindemo.R.layout.fragment_note_add);
      sKeys.put("layout/fragment_note_list_0", com.example.kotlindemo.R.layout.fragment_note_list);
      sKeys.put("layout/note_item_0", com.example.kotlindemo.R.layout.note_item);
    }
  }
}
