package com.lab.keyneez.presentation.preview

import android.os.Bundle
import android.view.View
import com.lab.keyneez.R
import com.lab.keyneez.databinding.ActivityPreviewBinding
import com.lab.keyneez.util.binding.BindingActivity

class PreviewActivity : BindingActivity<ActivityPreviewBinding>(R.layout.activity_preview) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.cfvPreview.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
    }
}
