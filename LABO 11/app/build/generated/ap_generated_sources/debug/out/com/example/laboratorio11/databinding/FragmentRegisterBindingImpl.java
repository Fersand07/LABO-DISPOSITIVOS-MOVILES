package com.example.laboratorio11.databinding;
import com.example.laboratorio11.R;
import com.example.laboratorio11.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements com.example.laboratorio11.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loginIcon, 5);
        sViewsWithIds.put(R.id.nameEditText, 6);
        sViewsWithIds.put(R.id.emailEditText, 7);
        sViewsWithIds.put(R.id.passwordEditText, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.name.getValue()
            //         is viewmodel.name.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.name.getValue()
            java.lang.String viewmodelNameGetValue = null;
            // viewmodel.name
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelName = null;
            // viewmodel.name != null
            boolean viewmodelNameJavaLangObjectNull = false;
            // viewmodel
            com.example.laboratorio11.ui.register.viewmodel.RegisterViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelName = viewmodel.getName();

                viewmodelNameJavaLangObjectNull = (viewmodelName) != (null);
                if (viewmodelNameJavaLangObjectNull) {




                    viewmodelName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.email.getValue()
            //         is viewmodel.email.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.email != null
            boolean viewmodelEmailJavaLangObjectNull = false;
            // viewmodel.email.getValue()
            java.lang.String viewmodelEmailGetValue = null;
            // viewmodel.email
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEmail = null;
            // viewmodel
            com.example.laboratorio11.ui.register.viewmodel.RegisterViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelEmail = viewmodel.getEmail();

                viewmodelEmailJavaLangObjectNull = (viewmodelEmail) != (null);
                if (viewmodelEmailJavaLangObjectNull) {




                    viewmodelEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.password.getValue()
            //         is viewmodel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewmodel.password.getValue()
            java.lang.String viewmodelPasswordGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.password != null
            boolean viewmodelPasswordJavaLangObjectNull = false;
            // viewmodel
            com.example.laboratorio11.ui.register.viewmodel.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPassword = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelPassword = viewmodel.getPassword();

                viewmodelPasswordJavaLangObjectNull = (viewmodelPassword) != (null);
                if (viewmodelPasswordJavaLangObjectNull) {




                    viewmodelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (android.widget.Button) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.registerBtn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.laboratorio11.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.laboratorio11.ui.register.viewmodel.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.laboratorio11.ui.register.viewmodel.RegisterViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelEmail(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewmodelPasswordGetValue = null;
        java.lang.String viewmodelNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEmail = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPassword = null;
        java.lang.String viewmodelEmailGetValue = null;
        com.example.laboratorio11.ui.register.viewmodel.RegisterViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.email
                        viewmodelEmail = viewmodel.getEmail();
                    }
                    updateLiveDataRegistration(0, viewmodelEmail);


                    if (viewmodelEmail != null) {
                        // read viewmodel.email.getValue()
                        viewmodelEmailGetValue = viewmodelEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.name
                        viewmodelName = viewmodel.getName();
                    }
                    updateLiveDataRegistration(1, viewmodelName);


                    if (viewmodelName != null) {
                        // read viewmodel.name.getValue()
                        viewmodelNameGetValue = viewmodelName.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.password
                        viewmodelPassword = viewmodel.getPassword();
                    }
                    updateLiveDataRegistration(2, viewmodelPassword);


                    if (viewmodelPassword != null) {
                        // read viewmodel.password.getValue()
                        viewmodelPasswordGetValue = viewmodelPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewmodelNameGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.registerBtn.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelEmailGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelPasswordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.example.laboratorio11.ui.register.viewmodel.RegisterViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.onRegister();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.email
        flag 1 (0x2L): viewmodel.name
        flag 2 (0x3L): viewmodel.password
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}